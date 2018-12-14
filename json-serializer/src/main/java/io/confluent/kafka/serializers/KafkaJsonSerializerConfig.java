/*
 * Copyright 2018 Confluent Inc.
 *
 * Licensed under the Confluent Community License; you may not use this file
 * except in compliance with the License.  You may obtain a copy of the License at
 *
 * http://www.confluent.io/confluent-community-license
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OF ANY KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations under the License.
 */

package io.confluent.kafka.serializers;

import io.confluent.common.config.AbstractConfig;
import io.confluent.common.config.ConfigDef;

import java.util.Map;

public class KafkaJsonSerializerConfig extends AbstractConfig {

  public static final String JSON_INDENT_OUTPUT = "json.indent.output";
  public static final boolean JSON_INDENT_OUTPUT_DEFAULT = false;
  public static final String JSON_INDENT_OUTPUT_DOC =
      "Whether JSON output should be indented (\"pretty-printed\")";

  private static ConfigDef config;

  static {
    config = new ConfigDef()
        .define(JSON_INDENT_OUTPUT, ConfigDef.Type.BOOLEAN, JSON_INDENT_OUTPUT_DEFAULT,
                ConfigDef.Importance.LOW, JSON_INDENT_OUTPUT_DOC);
  }

  public KafkaJsonSerializerConfig(Map<?, ?> props) {
    super(config, props);
  }

}
