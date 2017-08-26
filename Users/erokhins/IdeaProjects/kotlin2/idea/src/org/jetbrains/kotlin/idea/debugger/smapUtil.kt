'when (lineKind) {
                   SourceLineKind.CALL_LINE -> smapData.kotlinDebugStrata
                   SourceLineKind.EXECUTED_LINE -> smapData.kotlinStrata
               }' @ [40:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: SMAP?, entry1: SMAP?): SMAP?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> SMAP?

'lineKind' @ [40:22] ==> value-parameter lineKind: SourceLineKind defined in org.jetbrains.kotlin.idea.debugger.mapStacktraceLineToSource[ValueParameterDescriptorImpl]

'CALL_LINE' @ [41:35] ==> enum entry CALL_LINE defined in org.jetbrains.kotlin.idea.debugger.SourceLineKind[FakeCallableDescriptorForObject]

'smapData' @ [41:48] ==> value-parameter smapData: SmapData defined in org.jetbrains.kotlin.idea.debugger.mapStacktraceLineToSource[ValueParameterDescriptorImpl]

'kotlinDebugStrata' @ [41:57] ==> public final var kotlinDebugStrata: SMAP? defined in org.jetbrains.kotlin.idea.debugger.SmapData[PropertyDescriptorImpl]

'EXECUTED_LINE' @ [42:35] ==> enum entry EXECUTED_LINE defined in org.jetbrains.kotlin.idea.debugger.SourceLineKind[FakeCallableDescriptorForObject]

'smapData' @ [42:52] ==> value-parameter smapData: SmapData defined in org.jetbrains.kotlin.idea.debugger.mapStacktraceLineToSource[ValueParameterDescriptorImpl]

'kotlinStrata' @ [42:61] ==> public final var kotlinStrata: SMAP? defined in org.jetbrains.kotlin.idea.debugger.SmapData[PropertyDescriptorImpl]

'smap' @ [45:23] ==> val smap: SMAP defined in org.jetbrains.kotlin.idea.debugger.mapStacktraceLineToSource[LocalVariableDescriptor]

'fileMappings' @ [45:28] ==> public final val fileMappings: List<FileMapping> defined in org.jetbrains.kotlin.codegen.inline.SMAP[DeserializedPropertyDescriptor]

'firstOrNull' @ [45:41] ==> public inline fun <T> Iterable<FileMapping>.firstOrNull(predicate: (FileMapping) -> Boolean): FileMapping? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FileMapping

'it' @ [46:9] ==> value-parameter it: FileMapping defined in org.jetbrains.kotlin.idea.debugger.mapStacktraceLineToSource.<anonymous>[ValueParameterDescriptorImpl]

'getIntervalIfContains' @ [46:12] ==> private fun FileMapping.getIntervalIfContains(destLine: Int): RangeMapping? defined in org.jetbrains.kotlin.idea.debugger in file smapUtil.kt[SimpleFunctionDescriptorImpl]

'line' @ [46:34] ==> value-parameter line: Int defined in org.jetbrains.kotlin.idea.debugger.mapStacktraceLineToSource[ValueParameterDescriptorImpl]

'byInternalName' @ [49:32] ==> @NotNull public open fun byInternalName(@NotNull p0: String): JvmClassName defined in org.jetbrains.kotlin.resolve.jvm.JvmClassName[JavaMethodDescriptor]

'mappingInfo' @ [49:47] ==> val mappingInfo: FileMapping defined in org.jetbrains.kotlin.idea.debugger.mapStacktraceLineToSource[LocalVariableDescriptor]

'path' @ [49:59] ==> public final val path: String defined in org.jetbrains.kotlin.codegen.inline.FileMapping[DeserializedPropertyDescriptor]

'?:' @ [50:22] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: KtFile?, right: KtFile): KtFile[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> KtFile

'findSourceFileForClassIncludeLibrarySources' @ [50:36] ==> public final fun findSourceFileForClassIncludeLibrarySources(project: Project, scope: GlobalSearchScope, className: JvmClassName, fileName: String): KtFile? defined in org.jetbrains.kotlin.idea.debugger.DebuggerUtils[SimpleFunctionDescriptorImpl]

'project' @ [51:13] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.debugger.mapStacktraceLineToSource[ValueParameterDescriptorImpl]

'searchScope' @ [51:22] ==> value-parameter searchScope: GlobalSearchScope defined in org.jetbrains.kotlin.idea.debugger.mapStacktraceLineToSource[ValueParameterDescriptorImpl]

'jvmName' @ [51:35] ==> val jvmName: JvmClassName defined in org.jetbrains.kotlin.idea.debugger.mapStacktraceLineToSource[LocalVariableDescriptor]

'mappingInfo' @ [51:44] ==> val mappingInfo: FileMapping defined in org.jetbrains.kotlin.idea.debugger.mapStacktraceLineToSource[LocalVariableDescriptor]

'name' @ [51:56] ==> public final val name: String defined in org.jetbrains.kotlin.codegen.inline.FileMapping[DeserializedPropertyDescriptor]

'mappingInfo' @ [53:20] ==> val mappingInfo: FileMapping defined in org.jetbrains.kotlin.idea.debugger.mapStacktraceLineToSource[LocalVariableDescriptor]

'getIntervalIfContains' @ [53:32] ==> private fun FileMapping.getIntervalIfContains(destLine: Int): RangeMapping? defined in org.jetbrains.kotlin.idea.debugger in file smapUtil.kt[SimpleFunctionDescriptorImpl]

'line' @ [53:54] ==> value-parameter line: Int defined in org.jetbrains.kotlin.idea.debugger.mapStacktraceLineToSource[ValueParameterDescriptorImpl]

'when (lineKind) {
        SourceLineKind.CALL_LINE -> interval.source - 1
        SourceLineKind.EXECUTED_LINE -> interval.mapDestToSource(line) - 1
    }' @ [54:22] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Int, entry1: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Int

'lineKind' @ [54:28] ==> value-parameter lineKind: SourceLineKind defined in org.jetbrains.kotlin.idea.debugger.mapStacktraceLineToSource[ValueParameterDescriptorImpl]

'CALL_LINE' @ [55:24] ==> enum entry CALL_LINE defined in org.jetbrains.kotlin.idea.debugger.SourceLineKind[FakeCallableDescriptorForObject]

'interval' @ [55:37] ==> val interval: RangeMapping defined in org.jetbrains.kotlin.idea.debugger.mapStacktraceLineToSource[LocalVariableDescriptor]

'source' @ [55:46] ==> public final val source: Int defined in org.jetbrains.kotlin.codegen.inline.RangeMapping[DeserializedPropertyDescriptor]

'EXECUTED_LINE' @ [56:24] ==> enum entry EXECUTED_LINE defined in org.jetbrains.kotlin.idea.debugger.SourceLineKind[FakeCallableDescriptorForObject]

'interval' @ [56:41] ==> val interval: RangeMapping defined in org.jetbrains.kotlin.idea.debugger.mapStacktraceLineToSource[LocalVariableDescriptor]

'mapDestToSource' @ [56:50] ==> public final fun mapDestToSource(destLine: Int): Int defined in org.jetbrains.kotlin.codegen.inline.RangeMapping[DeserializedSimpleFunctionDescriptor]

'line' @ [56:66] ==> value-parameter line: Int defined in org.jetbrains.kotlin.idea.debugger.mapStacktraceLineToSource[ValueParameterDescriptorImpl]

'sourceFile' @ [59:12] ==> val sourceFile: KtFile defined in org.jetbrains.kotlin.idea.debugger.mapStacktraceLineToSource[LocalVariableDescriptor]

'sourceLine' @ [59:26] ==> val sourceLine: Int defined in org.jetbrains.kotlin.idea.debugger.mapStacktraceLineToSource[LocalVariableDescriptor]

'ClassReader' @ [63:14] ==> public constructor ClassReader(p0: (ByteArray..ByteArray?)) defined in org.jetbrains.org.objectweb.asm.ClassReader[JavaClassConstructorDescriptor]

'bytes' @ [63:26] ==> value-parameter bytes: ByteArray defined in org.jetbrains.kotlin.idea.debugger.readDebugInfo[ValueParameterDescriptorImpl]

'cr' @ [65:5] ==> val cr: ClassReader defined in org.jetbrains.kotlin.idea.debugger.readDebugInfo[LocalVariableDescriptor]

'accept' @ [65:8] ==> public open fun accept(p0: (ClassVisitor..ClassVisitor?), p1: Int): Unit defined in org.jetbrains.org.objectweb.asm.ClassReader[JavaMethodDescriptor]

'ClassVisitor' @ [65:24] ==> public constructor ClassVisitor(p0: Int) defined in org.jetbrains.org.objectweb.asm.ClassVisitor[JavaClassConstructorDescriptor]

'API' @ [65:37] ==> public const val API: Int defined in org.jetbrains.kotlin.codegen.inline[DeserializedPropertyDescriptor]

'debugInfo' @ [67:13] ==> var debugInfo: String? defined in org.jetbrains.kotlin.idea.debugger.readDebugInfo[LocalVariableDescriptor]

'debug' @ [67:25] ==> value-parameter debug: String? defined in org.jetbrains.kotlin.idea.debugger.readDebugInfo.<no name provided>.visitSource[ValueParameterDescriptorImpl]

'and' @ [69:8] ==> public final infix fun and(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'SKIP_FRAMES' @ [69:20] ==> public const final val SKIP_FRAMES: Int defined in org.jetbrains.org.objectweb.asm.ClassReader[JavaPropertyDescriptor]

'SKIP_CODE' @ [69:48] ==> public const final val SKIP_CODE: Int defined in org.jetbrains.org.objectweb.asm.ClassReader[JavaPropertyDescriptor]

'debugInfo' @ [70:12] ==> var debugInfo: String? defined in org.jetbrains.kotlin.idea.debugger.readDebugInfo[LocalVariableDescriptor]

'let' @ [70:23] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> SmapData): SmapData defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> SmapData

'SmapData' @ [70:29] ==> public constructor SmapData(debugInfo: String) defined in org.jetbrains.kotlin.idea.debugger.SmapData[ClassConstructorDescriptorImpl]

'debugInfo' @ [78:25] ==> value-parameter debugInfo: String defined in org.jetbrains.kotlin.idea.debugger.SmapData.<init>[ValueParameterDescriptorImpl]

'split' @ [78:35] ==> public fun CharSequence.split(vararg delimiters: String, ignoreCase: Boolean = ..., limit: Int = ...): List<String> defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'END' @ [78:46] ==> public const final val END: String defined in org.jetbrains.kotlin.codegen.inline.SMAP.Companion[DeserializedPropertyDescriptor]

'filter' @ [78:51] ==> public inline fun <T> Iterable<String>.filter(predicate: (String) -> Boolean): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'String' @ [78:58] ==> public companion object defined in kotlin.String[FakeCallableDescriptorForObject]

'isNotBlank' @ [78:66] ==> @InlineOnly public inline fun CharSequence.isNotBlank(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'when (intervals.count()) {
            1 -> {
                kotlinStrata = SMAPParser.parse(intervals[0] + SMAP.END)
                kotlinDebugStrata = null
            }
            2 -> {
                kotlinStrata = SMAPParser.parse(intervals[0] + SMAP.END)
                kotlinDebugStrata = SMAPParser.parse(intervals[1] + SMAP.END)
            }
            else -> {
                kotlinStrata = null
                kotlinDebugStrata = null
            }
        }' @ [79:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'intervals' @ [79:15] ==> val intervals: List<String> defined in org.jetbrains.kotlin.idea.debugger.SmapData.<init>[LocalVariableDescriptor]

'count' @ [79:25] ==> @InlineOnly public inline fun <T> Collection<String>.count(): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'kotlinStrata' @ [81:17] ==> public final var kotlinStrata: SMAP? defined in org.jetbrains.kotlin.idea.debugger.SmapData[PropertyDescriptorImpl]

'SMAPParser' @ [81:32] ==> public object SMAPParser defined in org.jetbrains.kotlin.codegen.inline[FakeCallableDescriptorForObject]

'parse' @ [81:43] ==> @JvmStatic public final fun parse(mappingInfo: String): SMAP defined in org.jetbrains.kotlin.codegen.inline.SMAPParser[DeserializedSimpleFunctionDescriptor]

'intervals' @ [81:49] ==> val intervals: List<String> defined in org.jetbrains.kotlin.idea.debugger.SmapData.<init>[LocalVariableDescriptor]

'END' @ [81:69] ==> public const final val END: String defined in org.jetbrains.kotlin.codegen.inline.SMAP.Companion[DeserializedPropertyDescriptor]

'kotlinDebugStrata' @ [82:17] ==> public final var kotlinDebugStrata: SMAP? defined in org.jetbrains.kotlin.idea.debugger.SmapData[PropertyDescriptorImpl]

'kotlinStrata' @ [85:17] ==> public final var kotlinStrata: SMAP? defined in org.jetbrains.kotlin.idea.debugger.SmapData[PropertyDescriptorImpl]

'SMAPParser' @ [85:32] ==> public object SMAPParser defined in org.jetbrains.kotlin.codegen.inline[FakeCallableDescriptorForObject]

'parse' @ [85:43] ==> @JvmStatic public final fun parse(mappingInfo: String): SMAP defined in org.jetbrains.kotlin.codegen.inline.SMAPParser[DeserializedSimpleFunctionDescriptor]

'intervals' @ [85:49] ==> val intervals: List<String> defined in org.jetbrains.kotlin.idea.debugger.SmapData.<init>[LocalVariableDescriptor]

'END' @ [85:69] ==> public const final val END: String defined in org.jetbrains.kotlin.codegen.inline.SMAP.Companion[DeserializedPropertyDescriptor]

'kotlinDebugStrata' @ [86:17] ==> public final var kotlinDebugStrata: SMAP? defined in org.jetbrains.kotlin.idea.debugger.SmapData[PropertyDescriptorImpl]

'SMAPParser' @ [86:37] ==> public object SMAPParser defined in org.jetbrains.kotlin.codegen.inline[FakeCallableDescriptorForObject]

'parse' @ [86:48] ==> @JvmStatic public final fun parse(mappingInfo: String): SMAP defined in org.jetbrains.kotlin.codegen.inline.SMAPParser[DeserializedSimpleFunctionDescriptor]

'intervals' @ [86:54] ==> val intervals: List<String> defined in org.jetbrains.kotlin.idea.debugger.SmapData.<init>[LocalVariableDescriptor]

'END' @ [86:74] ==> public const final val END: String defined in org.jetbrains.kotlin.codegen.inline.SMAP.Companion[DeserializedPropertyDescriptor]

'kotlinStrata' @ [89:17] ==> public final var kotlinStrata: SMAP? defined in org.jetbrains.kotlin.idea.debugger.SmapData[PropertyDescriptorImpl]

'kotlinDebugStrata' @ [90:17] ==> public final var kotlinDebugStrata: SMAP? defined in org.jetbrains.kotlin.idea.debugger.SmapData[PropertyDescriptorImpl]

'lineMappings' @ [96:64] ==> public final val lineMappings: ArrayList<RangeMapping> /* = ArrayList<RangeMapping> */ defined in org.jetbrains.kotlin.codegen.inline.FileMapping[DeserializedPropertyDescriptor]

'firstOrNull' @ [96:77] ==> public inline fun <T> Iterable<RangeMapping>.firstOrNull(predicate: (RangeMapping) -> Boolean): RangeMapping? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> RangeMapping

'it' @ [96:91] ==> value-parameter it: RangeMapping defined in org.jetbrains.kotlin.idea.debugger.getIntervalIfContains.<anonymous>[ValueParameterDescriptorImpl]

'contains' @ [96:94] ==> public final operator fun contains(destLine: Int): Boolean defined in org.jetbrains.kotlin.codegen.inline.RangeMapping[DeserializedSimpleFunctionDescriptor]

'destLine' @ [96:103] ==> value-parameter destLine: Int defined in org.jetbrains.kotlin.idea.debugger.getIntervalIfContains[ValueParameterDescriptorImpl]

