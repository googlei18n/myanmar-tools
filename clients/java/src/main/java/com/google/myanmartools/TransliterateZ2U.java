/* Copyright 2018 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.myanmartools;

/**
 * Transliteration initialization of phases and rules.
 */

// local imports
import com.google.myanmartools.Transliterate;
import com.google.myanmartools.Phase;
import com.google.myanmartools.Rule;

public class TransliterateZ2U extends Transliterate {
  public TransliterateZ2U() {

  // Rules for phase 0
  Phase phase0 = addPhase();
      phase0.addRule(new Rule("([\u1000-\u1021])\u103A\u1064", "\u1004\u103A\u1039$1\u103B"));
      phase0.addRule(new Rule("([\u1000-\u1021])\u1064", "\u1004\u103A\u1039$1"));
      phase0.addRule(new Rule("\u1064", "\u1004\u103A\u1039"));
      phase0.addRule(new Rule("([\u1000-\u1021])\u108B", "\u1004\u103A\u1039$1\u102D"));
      phase0.addRule(new Rule("([\u1000-\u1021])\u108C", "\u1004\u103A\u1039$1\u102E"));
      phase0.addRule(new Rule("([\u1000-\u1021])\u108D", "\u1004\u103A\u1039$1\u1036"));
      phase0.addRule(new Rule("([\u1000-\u1021])\u103A\u1033\u108B", "\u1004\u103A\u1039$1\u103B\u102D\u102F"));
      phase0.addRule(new Rule("([\u1000-\u1021])\u103A\u108B", "\u1004\u103A\u1039$1\u103B\u102D"));
      phase0.addRule(new Rule("([\u1000-\u1021])\u103A\u108C\u1033", "\u1004\u103A\u1039$1\u103B\u102E\u102F"));
      phase0.addRule(new Rule("([\u1000-\u1021])\u103A\u108C", "\u1004\u103A\u1039$1\u103B\u102E"));
      phase0.addRule(new Rule("([\u1000-\u1021])\u103A\u108D", "\u1004\u103A\u1039$1\u103B\u1036"));
      phase0.addRule(new Rule("([\u1000-\u1021])\u103A\u108E", "$1\u103B\u102D\u1036"));
      phase0.addRule(new Rule("\u108B", "\u1004\u103A\u1039\u102D"));
      phase0.addRule(new Rule("\u108C", "\u1004\u103A\u1039\u102E"));
      phase0.addRule(new Rule("\u108D", "\u1004\u103A\u1039\u1036"));
      phase0.addRule(new Rule("\u106A([\u102B-\u1030\u1032])\u1038", "\u1025$1\u1038"));
      phase0.addRule(new Rule("\u106A", "\u1025"));
      phase0.addRule(new Rule("\u106B", "\u100A"));
      phase0.addRule(new Rule("\u108F", "\u1014"));
      phase0.addRule(new Rule("\u1090", "\u101B"));
      phase0.addRule(new Rule("\u1086", "\u103F"));
      phase0.addRule(new Rule("\u103A", "\u103B"));
      phase0.addRule(new Rule("\u107D", "\u103B"));
      phase0.addRule(new Rule("\u103C\u108A", "\u103D\u103E"));
      phase0.addRule(new Rule("\u103C", "\u103D"));
      phase0.addRule(new Rule("\u108A", "\u103D\u103E"));
      phase0.addRule(new Rule("\u103D", "\u103E"));
      phase0.addRule(new Rule("\u1087", "\u103E"));
      phase0.addRule(new Rule("\u1088", "\u103E\u102F"));
      phase0.addRule(new Rule("\u1089", "\u103E\u1030"));
      phase0.addRule(new Rule("\u1039", "\u103A"));
      phase0.addRule(new Rule("\u1033", "\u102F"));
      phase0.addRule(new Rule("\u1034", "\u1030"));
      phase0.addRule(new Rule("\u105A", "\u102B\u103A"));
      phase0.addRule(new Rule("\u108E", "\u102D\u1036"));
      phase0.addRule(new Rule("\u1031\u1094([\u1000-\u1021])\u103D", "$1\u103E\u1031\u1037"));
      phase0.addRule(new Rule("\u1094", "\u1037"));
      phase0.addRule(new Rule("\u1095", "\u1037"));
      phase0.addRule(new Rule("\u1025\u1061", "\u1009\u1039\u1001"));
      phase0.addRule(new Rule("\u1025\u1062", "\u1009\u1039\u1002"));
      phase0.addRule(new Rule("\u1025\u1065", "\u1009\u1039\u1005"));
      phase0.addRule(new Rule("\u1025\u1068", "\u1009\u1039\u1007"));
      phase0.addRule(new Rule("\u1025\u1076", "\u1009\u1039\u1013"));
      phase0.addRule(new Rule("\u1025\u1078", "\u1009\u1039\u1015"));
      phase0.addRule(new Rule("\u1025\u107A", "\u1009\u1039\u1017"));
      phase0.addRule(new Rule("\u1025\u1079", "\u1009\u1039\u1016"));
      phase0.addRule(new Rule("([\u1000-\u1021])\u103A\u1039", "$1\u103A\u103B"));
      phase0.addRule(new Rule("\u1060", "\u1039\u1000"));
      phase0.addRule(new Rule("\u1061", "\u1039\u1001"));
      phase0.addRule(new Rule("\u1062", "\u1039\u1002"));
      phase0.addRule(new Rule("\u1063", "\u1039\u1003"));
      phase0.addRule(new Rule("\u1065", "\u1039\u1005"));
      phase0.addRule(new Rule("\u1066", "\u1039\u1006"));
      phase0.addRule(new Rule("\u1067", "\u1039\u1006"));
      phase0.addRule(new Rule("\u1068", "\u1039\u1007"));
      phase0.addRule(new Rule("\u1069", "\u1039\u1008"));
      phase0.addRule(new Rule("\u106C", "\u1039\u100B"));
      phase0.addRule(new Rule("\u106D", "\u1039\u100C"));
      phase0.addRule(new Rule("\u1070", "\u1039\u100F"));
      phase0.addRule(new Rule("\u1071", "\u1039\u1010"));
      phase0.addRule(new Rule("\u1072", "\u1039\u1010"));
      phase0.addRule(new Rule("\u1096", "\u1039\u1010\u103D"));
      phase0.addRule(new Rule("\u1073", "\u1039\u1011"));
      phase0.addRule(new Rule("\u1074", "\u1039\u1011"));
      phase0.addRule(new Rule("\u1075", "\u1039\u1012"));
      phase0.addRule(new Rule("\u1076", "\u1039\u1013"));
      phase0.addRule(new Rule("\u1077", "\u1039\u1014"));
      phase0.addRule(new Rule("\u1078", "\u1039\u1015"));
      phase0.addRule(new Rule("\u1079", "\u1039\u1016"));
      phase0.addRule(new Rule("\u107A", "\u1039\u1017"));
      phase0.addRule(new Rule("\u107B", "\u1039\u1018"));
      phase0.addRule(new Rule("\u1093", "\u1039\u1018"));
      phase0.addRule(new Rule("\u107C", "\u1039\u1019"));
      phase0.addRule(new Rule("\u1085", "\u1039\u101C"));
      phase0.addRule(new Rule("\u106E", "\u100D\u1039\u100D"));
      phase0.addRule(new Rule("\u106F", "\u100D\u1039\u100E"));
      phase0.addRule(new Rule("\u1091", "\u100F\u1039\u100D"));
      phase0.addRule(new Rule("\u1092", "\u100B\u1039\u100C"));
      phase0.addRule(new Rule("\u1097", "\u100B\u1039\u100B"));
      phase0.addRule(new Rule("\u104E", "\u104E\u1004\u103A\u1038"));
      phase0.addRule(new Rule("([\u103B\u107E-\u1084])+", "\u103C"));
  // Rules for phase 1
  Phase phase1 = addPhase();
      phase1.addRule(new Rule("([    -‍⁠  　﻿])\u1037", "\u1037$1"));
      phase1.addRule(new Rule("([    -‍⁠  　﻿]+)([\u102B-\u1030\u1032-\u103B\u103D\u103E])", "$2"));
      phase1.addRule(new Rule("\u1037\u1037+", "\u1037"));
      phase1.addRule(new Rule("\u1031\u1040([^\u1040-\u1049])", "\u1031\u101D$1"));
      phase1.addRule(new Rule("([\u1031]+)\u1004\u103A\u1039([\u1000-\u1021])", "\u1004\u103A\u1039$2\u1031"));
      phase1.addRule(new Rule("\u1031\u103C([\u1000-\u1021])", "$1\u103C\u1031"));
      phase1.addRule(new Rule("\u1031([\u1000-\u1021])([\u103B-\u103E]+)", "$1$2\u1031"));
      phase1.addRule(new Rule("\u1031([\u1000-\u102A])", "$1\u1031"));
      phase1.addRule(new Rule("\u1031(\u1037+)([\u1000-\u1021])", "$2\u1031\u1037"));
      phase1.addRule(new Rule("\u1031([\u1000-\u1021])\u1004\u103A\u1039", "\u1004\u103A\u1039\u1031"));
  // Rules for phase 2
  Phase phase2 = addPhase();
      phase2.addRule(new Rule("\u1040([^\u1040-\u1049])", "\u101D$1", true));  // AtStart 
      phase2.addRule(new Rule("([\u102B-\u103F])\u1040([^\u1040-\u1049])", "$1\u101D$2"));
      phase2.addRule(new Rule("\u1044([^\u1040-\u1049])", "\u104E$1", true));  // AtStart 
      phase2.addRule(new Rule("([\u102B-\u103F])\u1044([^\u1040-\u1049])", "$1\u104E$2"));
      phase2.addRule(new Rule("\u1025\u102E", "\u1026"));
      phase2.addRule(new Rule("\u103A\u1037", "\u1037\u103A"));
      phase2.addRule(new Rule("\u1036([\u103B-\u103E]*)([\u102B-\u1030\u1032]+)", "$1$2\u1036"));
      phase2.addRule(new Rule("([\u102B\u102C\u102F\u1030])([\u102D\u102E\u1032])", "$2$1"));
      phase2.addRule(new Rule("\u103C([\u1000-\u1021])", "$1\u103C"));
      phase2.addRule(new Rule("\u1005\u103B", "\u1008"));
  // Rules for phase 3
  Phase phase3 = addPhase();
      phase3.addRule(new Rule("([\u103B-\u103E])\u1039([\u1000-\u1021])", "\u1039$2$1"));
      phase3.addRule(new Rule("\u103C\u103A\u1039([\u1000-\u1021])", "\u103A\u1039$1\u103C"));
      phase3.addRule(new Rule("\u1036([\u103B-\u103E]+)", "$1\u1036"));
  // Rules for phase 4
  Phase phase4 = addPhase();
      phase4.addRule(new Rule("([\u103C-\u103E]+)\u103B", "\u103B$1"));
      phase4.addRule(new Rule("([\u103D\u103E]+)\u103C", "\u103C$1"));
      phase4.addRule(new Rule("\u103E\u103D", "\u103D\u103E"));
      phase4.addRule(new Rule("([\u1031]+)([\u102B-\u1030\u1032]*)\u1039([\u1000-\u1021])", "\u1039$3$1$2"));
      phase4.addRule(new Rule("([\u102B-\u1030\u1032]+)\u1039([\u1000-\u1021])", "\u1039$2$1"));
      phase4.addRule(new Rule("([\u103B-\u103E]*)([\u1031]+)([\u103B-\u103E]*)", "$1$3$2"));
      phase4.addRule(new Rule("\u1037([\u102D-\u1030\u1032\u1036])", "$1\u1037"));
      phase4.addRule(new Rule("\u1037([\u103B-\u103E]+)", "$1\u1037"));
      phase4.addRule(new Rule("([\u102B-\u1030\u1032]+)([\u103B-\u103E]+)", "$2$1"));
      phase4.addRule(new Rule("([\u1000-\u1021])([\u102B-\u1032\u1036\u103B-\u103E])\u103A([\u1000-\u1021])", "$1\u103A$2$3"));
  // Rules for phase 5
  Phase phase5 = addPhase();
      phase5.addRule(new Rule("([\u1031]+)([\u103B-\u103E]+)", "$2$1"));
      phase5.addRule(new Rule("([\u102B-\u1030\u1032])([\u103B-\u103E])", "$2$1"));
      phase5.addRule(new Rule("([\u103C-\u103E])\u103B", "\u103B$1"));
      phase5.addRule(new Rule("([\u103D\u103E])\u103C", "\u103C$1"));
      phase5.addRule(new Rule("\u103E\u103D", "\u103D\u103E"));
      phase5.addRule(new Rule("\u1038([\u102B-\u1030\u1032\u103B-\u103F])", "$1\u1038"));
      phase5.addRule(new Rule("\u1038([\u1036\u1037\u103A])", "$1\u1038"));
      phase5.addRule(new Rule("\u1036\u102F", "\u102F\u1036"));
  // Rules for phase 6
  Phase phase6 = addPhase();
      phase6.addRule(new Rule("\u102D\u102D+", "\u102D"));
      phase6.addRule(new Rule("\u102E\u102E+", "\u102E"));
      phase6.addRule(new Rule("\u102F\u102F+", "\u102F"));
      phase6.addRule(new Rule("\u1030\u1030+", "\u1030"));
      phase6.addRule(new Rule("\u1032\u1032+", "\u1032"));
      phase6.addRule(new Rule("\u1033\u1033+", "\u1033"));
      phase6.addRule(new Rule("\u1035\u1035+", "\u1035"));
      phase6.addRule(new Rule("\u1036\u1036+", "\u1036"));
      phase6.addRule(new Rule("\u1037\u1037+", "\u1037"));
      phase6.addRule(new Rule("\u1039\u1039+", "\u1039"));
      phase6.addRule(new Rule("\u103A\u103A+", "\u103A"));
      phase6.addRule(new Rule("\u103B\u103B+", "\u103B"));
      phase6.addRule(new Rule("\u103C\u103C+", "\u103C"));
      phase6.addRule(new Rule("\u103D\u103D+", "\u103D"));
      phase6.addRule(new Rule("\u103E\u103E+", "\u103E"));
      phase6.addRule(new Rule("\u102F\u1030", "\u102F"));
      phase6.addRule(new Rule("\u102F\u103A", "\u102F"));
      phase6.addRule(new Rule("\u102D\u102E", "\u102E"));
      phase6.addRule(new Rule("[    -‍⁠  　﻿]+([\u102B-\u1032\u1036-\u103E])", "$1"));
      phase6.addRule(new Rule("([\u1000-\u1021])\u103B\u103A", "$1\u103A\u103B"));
  }
}
// END OF TRANSLITERATION RULES
