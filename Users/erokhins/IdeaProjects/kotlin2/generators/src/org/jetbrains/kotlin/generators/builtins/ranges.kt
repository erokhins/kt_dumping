'BuiltInsSourceGenerator' @ [24:42] ==> public constructor BuiltInsSourceGenerator(out: PrintWriter) defined in org.jetbrains.kotlin.generators.builtins.generateBuiltIns.BuiltInsSourceGenerator[ClassConstructorDescriptorImpl]

'out' @ [24:66] ==> value-parameter out: PrintWriter defined in org.jetbrains.kotlin.generators.builtins.ranges.GenerateRanges.<init>[ValueParameterDescriptorImpl]

'iterator' @ [27:22] ==> public final operator fun iterator(): Iterator<ProgressionKind> defined in kotlin.Array[DeserializedSimpleFunctionDescriptor]

'values' @ [27:38] ==> public final fun values(): Array<ProgressionKind> defined in org.jetbrains.kotlin.generators.builtins.ProgressionKind[SimpleFunctionDescriptorImpl]

'kind' @ [28:21] ==> val kind: ProgressionKind defined in org.jetbrains.kotlin.generators.builtins.ranges.GenerateRanges.generateBody[LocalVariableDescriptor]

'capitalized' @ [28:26] ==> public final val capitalized: String defined in org.jetbrains.kotlin.generators.builtins.ProgressionKind[PropertyDescriptorImpl]

't' @ [29:28] ==> val t: String defined in org.jetbrains.kotlin.generators.builtins.ranges.GenerateRanges.generateBody[LocalVariableDescriptor]

'when (kind) {
                CHAR -> "1.toChar(), 0.toChar()"
                else -> "1, 0"
            }' @ [33:31] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String, entry1: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String

'kind' @ [33:37] ==> val kind: ProgressionKind defined in org.jetbrains.kotlin.generators.builtins.ranges.GenerateRanges.generateBody[LocalVariableDescriptor]

'CHAR' @ [34:17] ==> enum entry CHAR defined in org.jetbrains.kotlin.generators.builtins.ProgressionKind[FakeCallableDescriptorForObject]

'areEqualNumbers' @ [38:38] ==> public fun areEqualNumbers(v: String): String defined in org.jetbrains.kotlin.generators.builtins in file common.kt[SimpleFunctionDescriptorImpl]

'v' @ [38:54] ==> value-parameter v: String defined in org.jetbrains.kotlin.generators.builtins.ranges.GenerateRanges.generateBody.compare[ValueParameterDescriptorImpl]

'when (kind) {
                CHAR -> "=\n" +
                "        if (isEmpty()) -1 else (31 * first.toInt() + last.toInt())"
                INT -> "=\n" +
                "        if (isEmpty()) -1 else (31 * first + last)"
                LONG -> "=\n" +
                "        if (isEmpty()) -1 else (31 * ${hashLong("first")} + ${hashLong("last")}).toInt()"
            }' @ [40:28] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String, entry1: String, entry2: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String

'kind' @ [40:34] ==> val kind: ProgressionKind defined in org.jetbrains.kotlin.generators.builtins.ranges.GenerateRanges.generateBody[LocalVariableDescriptor]

'CHAR' @ [41:17] ==> enum entry CHAR defined in org.jetbrains.kotlin.generators.builtins.ProgressionKind[FakeCallableDescriptorForObject]

'+' @ [41:25] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'INT' @ [43:17] ==> enum entry INT defined in org.jetbrains.kotlin.generators.builtins.ProgressionKind[FakeCallableDescriptorForObject]

'+' @ [43:24] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'LONG' @ [45:17] ==> enum entry LONG defined in org.jetbrains.kotlin.generators.builtins.ProgressionKind[FakeCallableDescriptorForObject]

'+' @ [45:25] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'hashLong' @ [46:57] ==> public fun hashLong(v: String): String defined in org.jetbrains.kotlin.generators.builtins in file common.kt[SimpleFunctionDescriptorImpl]

'hashLong' @ [46:80] ==> public fun hashLong(v: String): String defined in org.jetbrains.kotlin.generators.builtins in file common.kt[SimpleFunctionDescriptorImpl]

'out' @ [51:13] ==> public final val out: PrintWriter defined in org.jetbrains.kotlin.generators.builtins.ranges.GenerateRanges[PropertyDescriptorImpl]

'println' @ [51:17] ==> public open fun println(p0: (String..String?)): Unit defined in java.io.PrintWriter[JavaMethodDescriptor]

't' @ [53:32] ==> val t: String defined in org.jetbrains.kotlin.generators.builtins.ranges.GenerateRanges.generateBody[LocalVariableDescriptor]

'range' @ [55:15] ==> val range: String defined in org.jetbrains.kotlin.generators.builtins.ranges.GenerateRanges.generateBody[LocalVariableDescriptor]

't' @ [55:29] ==> val t: String defined in org.jetbrains.kotlin.generators.builtins.ranges.GenerateRanges.generateBody[LocalVariableDescriptor]

't' @ [55:47] ==> val t: String defined in org.jetbrains.kotlin.generators.builtins.ranges.GenerateRanges.generateBody[LocalVariableDescriptor]

't' @ [55:54] ==> val t: String defined in org.jetbrains.kotlin.generators.builtins.ranges.GenerateRanges.generateBody[LocalVariableDescriptor]

'increment' @ [55:90] ==> val increment: String defined in org.jetbrains.kotlin.generators.builtins.ranges.GenerateRanges.generateBody[LocalVariableDescriptor]

't' @ [55:115] ==> val t: String defined in org.jetbrains.kotlin.generators.builtins.ranges.GenerateRanges.generateBody[LocalVariableDescriptor]

't' @ [56:26] ==> val t: String defined in org.jetbrains.kotlin.generators.builtins.ranges.GenerateRanges.generateBody[LocalVariableDescriptor]

't' @ [57:33] ==> val t: String defined in org.jetbrains.kotlin.generators.builtins.ranges.GenerateRanges.generateBody[LocalVariableDescriptor]

't' @ [59:35] ==> val t: String defined in org.jetbrains.kotlin.generators.builtins.ranges.GenerateRanges.generateBody[LocalVariableDescriptor]

'range' @ [64:19] ==> val range: String defined in org.jetbrains.kotlin.generators.builtins.ranges.GenerateRanges.generateBody[LocalVariableDescriptor]

'compare' @ [65:11] ==> local final fun compare(v: String): String defined in org.jetbrains.kotlin.generators.builtins.ranges.GenerateRanges.generateBody[SimpleFunctionDescriptorImpl]

'compare' @ [65:34] ==> local final fun compare(v: String): String defined in org.jetbrains.kotlin.generators.builtins.ranges.GenerateRanges.generateBody[SimpleFunctionDescriptorImpl]

'hashCode' @ [67:35] ==> val hashCode: String defined in org.jetbrains.kotlin.generators.builtins.ranges.GenerateRanges.generateBody[LocalVariableDescriptor]

'toString' @ [69:40] ==> val toString: String defined in org.jetbrains.kotlin.generators.builtins.ranges.GenerateRanges.generateBody[LocalVariableDescriptor]

't' @ [72:47] ==> val t: String defined in org.jetbrains.kotlin.generators.builtins.ranges.GenerateRanges.generateBody[LocalVariableDescriptor]

'range' @ [73:28] ==> val range: String defined in org.jetbrains.kotlin.generators.builtins.ranges.GenerateRanges.generateBody[LocalVariableDescriptor]

'range' @ [73:37] ==> val range: String defined in org.jetbrains.kotlin.generators.builtins.ranges.GenerateRanges.generateBody[LocalVariableDescriptor]

'emptyBounds' @ [73:44] ==> val emptyBounds: String defined in org.jetbrains.kotlin.generators.builtins.ranges.GenerateRanges.generateBody[LocalVariableDescriptor]

'out' @ [76:13] ==> public final val out: PrintWriter defined in org.jetbrains.kotlin.generators.builtins.ranges.GenerateRanges[PropertyDescriptorImpl]

'println' @ [76:17] ==> public open fun println(): Unit defined in java.io.PrintWriter[JavaMethodDescriptor]

