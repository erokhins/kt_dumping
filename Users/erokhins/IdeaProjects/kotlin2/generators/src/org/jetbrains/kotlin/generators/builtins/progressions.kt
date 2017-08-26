'BuiltInsSourceGenerator' @ [24:48] ==> public constructor BuiltInsSourceGenerator(out: PrintWriter) defined in org.jetbrains.kotlin.generators.builtins.generateBuiltIns.BuiltInsSourceGenerator[ClassConstructorDescriptorImpl]

'out' @ [24:72] ==> value-parameter out: PrintWriter defined in org.jetbrains.kotlin.generators.builtins.progressions.GenerateProgressions.<init>[ValueParameterDescriptorImpl]

'kind' @ [28:17] ==> value-parameter kind: ProgressionKind defined in org.jetbrains.kotlin.generators.builtins.progressions.GenerateProgressions.generateDiscreteBody[ValueParameterDescriptorImpl]

'capitalized' @ [28:22] ==> public final val capitalized: String defined in org.jetbrains.kotlin.generators.builtins.ProgressionKind[PropertyDescriptorImpl]

't' @ [29:30] ==> val t: String defined in org.jetbrains.kotlin.generators.builtins.progressions.GenerateProgressions.generateDiscreteBody[LocalVariableDescriptor]

'progressionIncrementType' @ [31:29] ==> public fun progressionIncrementType(kind: ProgressionKind): String defined in org.jetbrains.kotlin.generators.builtins in file common.kt[SimpleFunctionDescriptorImpl]

'kind' @ [31:54] ==> value-parameter kind: ProgressionKind defined in org.jetbrains.kotlin.generators.builtins.progressions.GenerateProgressions.generateDiscreteBody[ValueParameterDescriptorImpl]

'areEqualNumbers' @ [32:34] ==> public fun areEqualNumbers(v: String): String defined in org.jetbrains.kotlin.generators.builtins in file common.kt[SimpleFunctionDescriptorImpl]

'v' @ [32:50] ==> value-parameter v: String defined in org.jetbrains.kotlin.generators.builtins.progressions.GenerateProgressions.generateDiscreteBody.compare[ValueParameterDescriptorImpl]

'when (kind) {
            LONG -> "0L"
            else -> "0"
        }' @ [34:20] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String, entry1: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String

'kind' @ [34:26] ==> value-parameter kind: ProgressionKind defined in org.jetbrains.kotlin.generators.builtins.progressions.GenerateProgressions.generateDiscreteBody[ValueParameterDescriptorImpl]

'LONG' @ [35:13] ==> enum entry LONG defined in org.jetbrains.kotlin.generators.builtins.ProgressionKind[FakeCallableDescriptorForObject]

'zero' @ [38:39] ==> val zero: String defined in org.jetbrains.kotlin.generators.builtins.progressions.GenerateProgressions.generateDiscreteBody[LocalVariableDescriptor]

'+' @ [40:24] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'when (kind) {
            CHAR ->
                "        if (isEmpty()) -1 else (31 * (31 * first.toInt() + last.toInt()) + step)"
            INT ->
                "        if (isEmpty()) -1 else (31 * (31 * first + last) + step)"
            LONG ->
                "        if (isEmpty()) -1 else (31 * (31 * ${hashLong("first")} + ${hashLong("last")}) + ${hashLong("step")}).toInt()"
            else -> throw IllegalArgumentException()
        }' @ [40:32] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String, entry1: String, entry2: String, entry3: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String

'kind' @ [40:38] ==> value-parameter kind: ProgressionKind defined in org.jetbrains.kotlin.generators.builtins.progressions.GenerateProgressions.generateDiscreteBody[ValueParameterDescriptorImpl]

'CHAR' @ [41:13] ==> enum entry CHAR defined in org.jetbrains.kotlin.generators.builtins.ProgressionKind[FakeCallableDescriptorForObject]

'INT' @ [43:13] ==> enum entry INT defined in org.jetbrains.kotlin.generators.builtins.ProgressionKind[FakeCallableDescriptorForObject]

'LONG' @ [45:13] ==> enum entry LONG defined in org.jetbrains.kotlin.generators.builtins.ProgressionKind[FakeCallableDescriptorForObject]

'hashLong' @ [46:63] ==> public fun hashLong(v: String): String defined in org.jetbrains.kotlin.generators.builtins in file common.kt[SimpleFunctionDescriptorImpl]

'hashLong' @ [46:86] ==> public fun hashLong(v: String): String defined in org.jetbrains.kotlin.generators.builtins in file common.kt[SimpleFunctionDescriptorImpl]

'hashLong' @ [46:109] ==> public fun hashLong(v: String): String defined in org.jetbrains.kotlin.generators.builtins in file common.kt[SimpleFunctionDescriptorImpl]

'IllegalArgumentException' @ [47:27] ==> public final fun <init>(): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'out' @ [50:9] ==> public final val out: PrintWriter defined in org.jetbrains.kotlin.generators.builtins.progressions.GenerateProgressions[PropertyDescriptorImpl]

'println' @ [50:13] ==> public open fun println(p0: (String..String?)): Unit defined in java.io.PrintWriter[JavaMethodDescriptor]

't' @ [52:38] ==> val t: String defined in org.jetbrains.kotlin.generators.builtins.progressions.GenerateProgressions.generateDiscreteBody[LocalVariableDescriptor]

'progression' @ [54:20] ==> val progression: String defined in org.jetbrains.kotlin.generators.builtins.progressions.GenerateProgressions.generateDiscreteBody[LocalVariableDescriptor]

't' @ [57:21] ==> val t: String defined in org.jetbrains.kotlin.generators.builtins.progressions.GenerateProgressions.generateDiscreteBody[LocalVariableDescriptor]

't' @ [58:28] ==> val t: String defined in org.jetbrains.kotlin.generators.builtins.progressions.GenerateProgressions.generateDiscreteBody[LocalVariableDescriptor]

'incrementType' @ [59:20] ==> val incrementType: String defined in org.jetbrains.kotlin.generators.builtins.progressions.GenerateProgressions.generateDiscreteBody[LocalVariableDescriptor]

't' @ [60:19] ==> val t: String defined in org.jetbrains.kotlin.generators.builtins.progressions.GenerateProgressions.generateDiscreteBody[LocalVariableDescriptor]

'checkZero' @ [62:10] ==> val checkZero: String defined in org.jetbrains.kotlin.generators.builtins.progressions.GenerateProgressions.generateDiscreteBody[LocalVariableDescriptor]

't' @ [68:24] ==> val t: String defined in org.jetbrains.kotlin.generators.builtins.progressions.GenerateProgressions.generateDiscreteBody[LocalVariableDescriptor]

't' @ [73:23] ==> val t: String defined in org.jetbrains.kotlin.generators.builtins.progressions.GenerateProgressions.generateDiscreteBody[LocalVariableDescriptor]

'incrementType' @ [73:62] ==> val incrementType: String defined in org.jetbrains.kotlin.generators.builtins.progressions.GenerateProgressions.generateDiscreteBody[LocalVariableDescriptor]

'incrementType' @ [73:95] ==> val incrementType: String defined in org.jetbrains.kotlin.generators.builtins.progressions.GenerateProgressions.generateDiscreteBody[LocalVariableDescriptor]

't' @ [73:121] ==> val t: String defined in org.jetbrains.kotlin.generators.builtins.progressions.GenerateProgressions.generateDiscreteBody[LocalVariableDescriptor]

'incrementType' @ [78:23] ==> val incrementType: String defined in org.jetbrains.kotlin.generators.builtins.progressions.GenerateProgressions.generateDiscreteBody[LocalVariableDescriptor]

't' @ [80:32] ==> val t: String defined in org.jetbrains.kotlin.generators.builtins.progressions.GenerateProgressions.generateDiscreteBody[LocalVariableDescriptor]

't' @ [80:47] ==> val t: String defined in org.jetbrains.kotlin.generators.builtins.progressions.GenerateProgressions.generateDiscreteBody[LocalVariableDescriptor]

'progression' @ [86:19] ==> val progression: String defined in org.jetbrains.kotlin.generators.builtins.progressions.GenerateProgressions.generateDiscreteBody[LocalVariableDescriptor]

'compare' @ [87:11] ==> local final fun compare(v: String): String defined in org.jetbrains.kotlin.generators.builtins.progressions.GenerateProgressions.generateDiscreteBody[SimpleFunctionDescriptorImpl]

'compare' @ [87:34] ==> local final fun compare(v: String): String defined in org.jetbrains.kotlin.generators.builtins.progressions.GenerateProgressions.generateDiscreteBody[SimpleFunctionDescriptorImpl]

'compare' @ [87:56] ==> local final fun compare(v: String): String defined in org.jetbrains.kotlin.generators.builtins.progressions.GenerateProgressions.generateDiscreteBody[SimpleFunctionDescriptorImpl]

'hashCode' @ [89:35] ==> val hashCode: String defined in org.jetbrains.kotlin.generators.builtins.progressions.GenerateProgressions.generateDiscreteBody[LocalVariableDescriptor]

'progression' @ [95:21] ==> val progression: String defined in org.jetbrains.kotlin.generators.builtins.progressions.GenerateProgressions.generateDiscreteBody[LocalVariableDescriptor]

't' @ [100:49] ==> val t: String defined in org.jetbrains.kotlin.generators.builtins.progressions.GenerateProgressions.generateDiscreteBody[LocalVariableDescriptor]

't' @ [100:63] ==> val t: String defined in org.jetbrains.kotlin.generators.builtins.progressions.GenerateProgressions.generateDiscreteBody[LocalVariableDescriptor]

'incrementType' @ [100:73] ==> val incrementType: String defined in org.jetbrains.kotlin.generators.builtins.progressions.GenerateProgressions.generateDiscreteBody[LocalVariableDescriptor]

'progression' @ [100:90] ==> val progression: String defined in org.jetbrains.kotlin.generators.builtins.progressions.GenerateProgressions.generateDiscreteBody[LocalVariableDescriptor]

'progression' @ [100:105] ==> val progression: String defined in org.jetbrains.kotlin.generators.builtins.progressions.GenerateProgressions.generateDiscreteBody[LocalVariableDescriptor]

'out' @ [103:9] ==> public final val out: PrintWriter defined in org.jetbrains.kotlin.generators.builtins.progressions.GenerateProgressions[PropertyDescriptorImpl]

'println' @ [103:13] ==> public open fun println(): Unit defined in java.io.PrintWriter[JavaMethodDescriptor]

'out' @ [108:9] ==> public final val out: PrintWriter defined in org.jetbrains.kotlin.generators.builtins.progressions.GenerateProgressions[PropertyDescriptorImpl]

'println' @ [108:13] ==> public open fun println(p0: (String..String?)): Unit defined in java.io.PrintWriter[JavaMethodDescriptor]

'out' @ [109:9] ==> public final val out: PrintWriter defined in org.jetbrains.kotlin.generators.builtins.progressions.GenerateProgressions[PropertyDescriptorImpl]

'println' @ [109:13] ==> public open fun println(): Unit defined in java.io.PrintWriter[JavaMethodDescriptor]

'iterator' @ [110:22] ==> public final operator fun iterator(): Iterator<ProgressionKind> defined in kotlin.Array[DeserializedSimpleFunctionDescriptor]

'values' @ [110:38] ==> public final fun values(): Array<ProgressionKind> defined in org.jetbrains.kotlin.generators.builtins.ProgressionKind[SimpleFunctionDescriptorImpl]

'generateDiscreteBody' @ [111:13] ==> private final fun generateDiscreteBody(kind: ProgressionKind): Unit defined in org.jetbrains.kotlin.generators.builtins.progressions.GenerateProgressions[SimpleFunctionDescriptorImpl]

'kind' @ [111:34] ==> val kind: ProgressionKind defined in org.jetbrains.kotlin.generators.builtins.progressions.GenerateProgressions.generateBody[LocalVariableDescriptor]

