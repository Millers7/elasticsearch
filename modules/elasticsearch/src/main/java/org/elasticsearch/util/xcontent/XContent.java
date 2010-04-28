/*
 * Licensed to Elastic Search and Shay Banon under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. Elastic Search licenses this
 * file to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.elasticsearch.util.xcontent;

import java.io.*;

/**
 * @author kimchy (shay.banon)
 */
public interface XContent {

    XContentType type();

    XContentGenerator createGenerator(OutputStream os) throws IOException;

    XContentGenerator createGenerator(Writer writer) throws IOException;

    XContentParser createParser(String content) throws IOException;

    XContentParser createParser(InputStream is) throws IOException;

    XContentParser createParser(byte[] data) throws IOException;

    XContentParser createParser(byte[] data, int offset, int length) throws IOException;

    XContentParser createParser(Reader reader) throws IOException;
}
