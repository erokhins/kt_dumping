'source' @ [33:34] ==> public final val source: String defined in org.jetbrains.kotlin.codegen.inline.SMAPBuilder[PropertyDescriptorImpl]

'fileMappings' @ [36:28] ==> private final val fileMappings: List<FileMapping> defined in org.jetbrains.kotlin.codegen.inline.SMAPBuilder[PropertyDescriptorImpl]

'filter' @ [36:41] ==> public inline fun <T> Iterable<FileMapping>.filter(predicate: (FileMapping) -> Boolean): List<FileMapping> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FileMapping

'it' @ [37:28] ==> value-parameter it: FileMapping defined in org.jetbrains.kotlin.codegen.inline.SMAPBuilder.build.<anonymous>[ValueParameterDescriptorImpl]

'lineMappings' @ [37:31] ==> public final val lineMappings: ArrayList<RangeMapping> /* = ArrayList<RangeMapping> */ defined in org.jetbrains.kotlin.codegen.inline.FileMapping[PropertyDescriptorImpl]

'mappings' @ [38:13] ==> val mappings: ArrayList<RangeMapping> /* = ArrayList<RangeMapping> */ defined in org.jetbrains.kotlin.codegen.inline.SMAPBuilder.build.<anonymous>[LocalVariableDescriptor]

'isNotEmpty' @ [38:22] ==> @InlineOnly public inline fun <T> Collection<RangeMapping>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> RangeMapping

'mappings' @ [38:38] ==> val mappings: ArrayList<RangeMapping> /* = ArrayList<RangeMapping> */ defined in org.jetbrains.kotlin.codegen.inline.SMAPBuilder.build.<anonymous>[LocalVariableDescriptor]

'first' @ [38:47] ==> public fun <T> List<RangeMapping>.first(): RangeMapping defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> RangeMapping

'RangeMapping' @ [38:58] ==> public companion object defined in org.jetbrains.kotlin.codegen.inline.RangeMapping[FakeCallableDescriptorForObject]

'SKIP' @ [38:71] ==> public final val SKIP: RangeMapping defined in org.jetbrains.kotlin.codegen.inline.RangeMapping.Companion[PropertyDescriptorImpl]

'realMappings' @ [41:13] ==> val realMappings: List<FileMapping> defined in org.jetbrains.kotlin.codegen.inline.SMAPBuilder.build[LocalVariableDescriptor]

'isEmpty' @ [41:26] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'generateDefaultStrata' @ [45:29] ==> private final fun generateDefaultStrata(realMappings: List<FileMapping>): String defined in org.jetbrains.kotlin.codegen.inline.SMAPBuilder[SimpleFunctionDescriptorImpl]

'realMappings' @ [45:51] ==> val realMappings: List<FileMapping> defined in org.jetbrains.kotlin.codegen.inline.SMAPBuilder.build[LocalVariableDescriptor]

'generateDebugStrata' @ [46:27] ==> private final fun generateDebugStrata(realMappings: List<FileMapping>): String defined in org.jetbrains.kotlin.codegen.inline.SMAPBuilder[SimpleFunctionDescriptorImpl]

'realMappings' @ [46:47] ==> val realMappings: List<FileMapping> defined in org.jetbrains.kotlin.codegen.inline.SMAPBuilder.build[LocalVariableDescriptor]

'header' @ [48:18] ==> private final val header: String defined in org.jetbrains.kotlin.codegen.inline.SMAPBuilder[PropertyDescriptorImpl]

'defaultStrata' @ [48:27] ==> val defaultStrata: String defined in org.jetbrains.kotlin.codegen.inline.SMAPBuilder.build[LocalVariableDescriptor]

'debugStrata' @ [48:41] ==> val debugStrata: String defined in org.jetbrains.kotlin.codegen.inline.SMAPBuilder.build[LocalVariableDescriptor]

'+' @ [52:23] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'realMappings' @ [52:30] ==> value-parameter realMappings: List<FileMapping> defined in org.jetbrains.kotlin.codegen.inline.SMAPBuilder.generateDefaultStrata[ValueParameterDescriptorImpl]

'mapIndexed' @ [52:43] ==> public inline fun <T, R> Iterable<FileMapping>.mapIndexed(transform: (index: Int, FileMapping) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FileMapping
    <R> -> String

'file' @ [52:73] ==> value-parameter file: FileMapping defined in org.jetbrains.kotlin.codegen.inline.SMAPBuilder.generateDefaultStrata.<anonymous>[ValueParameterDescriptorImpl]

'toSMAPFile' @ [52:78] ==> private final fun FileMapping.toSMAPFile(id: Int): String defined in org.jetbrains.kotlin.codegen.inline.SMAPBuilder[SimpleFunctionDescriptorImpl]

'id' @ [52:89] ==> value-parameter id: Int defined in org.jetbrains.kotlin.codegen.inline.SMAPBuilder.generateDefaultStrata.<anonymous>[ValueParameterDescriptorImpl]

'joinToString' @ [52:101] ==> public fun <T> Iterable<String>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'+' @ [53:28] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'realMappings' @ [53:35] ==> value-parameter realMappings: List<FileMapping> defined in org.jetbrains.kotlin.codegen.inline.SMAPBuilder.generateDefaultStrata[ValueParameterDescriptorImpl]

'joinToString' @ [53:48] ==> public fun <T> Iterable<FileMapping>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((FileMapping) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FileMapping

'it' @ [53:67] ==> value-parameter it: FileMapping defined in org.jetbrains.kotlin.codegen.inline.SMAPBuilder.generateDefaultStrata.<anonymous>[ValueParameterDescriptorImpl]

'toSMAPMapping' @ [53:70] ==> private final fun FileMapping.toSMAPMapping(): String defined in org.jetbrains.kotlin.codegen.inline.SMAPBuilder[SimpleFunctionDescriptorImpl]

'KOTLIN_STRATA_NAME' @ [54:21] ==> public val KOTLIN_STRATA_NAME: String defined in org.jetbrains.kotlin.codegen.inline in file SMAP.kt[PropertyDescriptorImpl]

'fileIds' @ [54:42] ==> val fileIds: String defined in org.jetbrains.kotlin.codegen.inline.SMAPBuilder.generateDefaultStrata[LocalVariableDescriptor]

'lineMappings' @ [54:52] ==> val lineMappings: String defined in org.jetbrains.kotlin.codegen.inline.SMAPBuilder.generateDefaultStrata[LocalVariableDescriptor]

'FileMapping' @ [58:31] ==> public constructor FileMapping(name: String, path: String) defined in org.jetbrains.kotlin.codegen.inline.FileMapping[ClassConstructorDescriptorImpl]

'source' @ [58:43] ==> public final val source: String defined in org.jetbrains.kotlin.codegen.inline.SMAPBuilder[PropertyDescriptorImpl]

'path' @ [58:51] ==> public final val path: String defined in org.jetbrains.kotlin.codegen.inline.SMAPBuilder[PropertyDescriptorImpl]

'realMappings' @ [59:9] ==> value-parameter realMappings: List<FileMapping> defined in org.jetbrains.kotlin.codegen.inline.SMAPBuilder.generateDebugStrata[ValueParameterDescriptorImpl]

'forEach' @ [59:22] ==> @HidesMembers public inline fun <T> Iterable<FileMapping>.forEach(action: (FileMapping) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FileMapping

'fileMapping' @ [60:13] ==> value-parameter fileMapping: FileMapping defined in org.jetbrains.kotlin.codegen.inline.SMAPBuilder.generateDebugStrata.<anonymous>[ValueParameterDescriptorImpl]

'lineMappings' @ [60:25] ==> public final val lineMappings: ArrayList<RangeMapping> /* = ArrayList<RangeMapping> */ defined in org.jetbrains.kotlin.codegen.inline.FileMapping[PropertyDescriptorImpl]

'filter' @ [60:38] ==> public inline fun <T> Iterable<RangeMapping>.filter(predicate: (RangeMapping) -> Boolean): List<RangeMapping> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> RangeMapping

'it' @ [60:47] ==> value-parameter it: RangeMapping defined in org.jetbrains.kotlin.codegen.inline.SMAPBuilder.generateDebugStrata.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'callSiteMarker' @ [60:50] ==> public final var callSiteMarker: CallSiteMarker? defined in org.jetbrains.kotlin.codegen.inline.RangeMapping[PropertyDescriptorImpl]

'forEach' @ [60:75] ==> @HidesMembers public inline fun <T> Iterable<RangeMapping>.forEach(action: (RangeMapping) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> RangeMapping

'component1' @ [60:86] ==> public final operator fun component1(): Int defined in org.jetbrains.kotlin.codegen.inline.RangeMapping[SimpleFunctionDescriptorImpl]

'component2' @ [60:89] ==> public final operator fun component2(): Int defined in org.jetbrains.kotlin.codegen.inline.RangeMapping[SimpleFunctionDescriptorImpl]

'component3' @ [60:95] ==> public final operator fun component3(): Int defined in org.jetbrains.kotlin.codegen.inline.RangeMapping[SimpleFunctionDescriptorImpl]

'component4' @ [60:102] ==> public final operator fun component4(): CallSiteMarker? defined in org.jetbrains.kotlin.codegen.inline.RangeMapping[SimpleFunctionDescriptorImpl]

'combinedMapping' @ [61:17] ==> val combinedMapping: FileMapping defined in org.jetbrains.kotlin.codegen.inline.SMAPBuilder.generateDebugStrata[LocalVariableDescriptor]

'addRangeMapping' @ [61:33] ==> public final fun addRangeMapping(lineMapping: RangeMapping): Unit defined in org.jetbrains.kotlin.codegen.inline.FileMapping[SimpleFunctionDescriptorImpl]

'RangeMapping' @ [61:49] ==> public constructor RangeMapping(source: Int, dest: Int, range: Int = ..., callSiteMarker: CallSiteMarker? = ...) defined in org.jetbrains.kotlin.codegen.inline.RangeMapping[ClassConstructorDescriptorImpl]

'callSiteMarker' @ [62:25] ==> val callSiteMarker: CallSiteMarker? defined in org.jetbrains.kotlin.codegen.inline.SMAPBuilder.generateDebugStrata.<anonymous>.<anonymous>[LocalVariableDescriptor]

'lineNumber' @ [62:42] ==> public final val lineNumber: Int defined in org.jetbrains.kotlin.codegen.inline.CallSiteMarker[PropertyDescriptorImpl]

'dest' @ [62:54] ==> val dest: Int defined in org.jetbrains.kotlin.codegen.inline.SMAPBuilder.generateDebugStrata.<anonymous>.<anonymous>[LocalVariableDescriptor]

'range' @ [62:60] ==> val range: Int defined in org.jetbrains.kotlin.codegen.inline.SMAPBuilder.generateDebugStrata.<anonymous>.<anonymous>[LocalVariableDescriptor]

'combinedMapping' @ [67:13] ==> val combinedMapping: FileMapping defined in org.jetbrains.kotlin.codegen.inline.SMAPBuilder.generateDebugStrata[LocalVariableDescriptor]

'lineMappings' @ [67:29] ==> public final val lineMappings: ArrayList<RangeMapping> /* = ArrayList<RangeMapping> */ defined in org.jetbrains.kotlin.codegen.inline.FileMapping[PropertyDescriptorImpl]

'isEmpty' @ [67:42] ==> public open fun isEmpty(): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'listOf' @ [69:27] ==> public fun <T> listOf(element: FileMapping): List<FileMapping> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FileMapping

'combinedMapping' @ [69:34] ==> val combinedMapping: FileMapping defined in org.jetbrains.kotlin.codegen.inline.SMAPBuilder.generateDebugStrata[LocalVariableDescriptor]

'+' @ [70:23] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'newMappings' @ [70:30] ==> val newMappings: List<FileMapping> defined in org.jetbrains.kotlin.codegen.inline.SMAPBuilder.generateDebugStrata[LocalVariableDescriptor]

'mapIndexed' @ [70:42] ==> public inline fun <T, R> Iterable<FileMapping>.mapIndexed(transform: (index: Int, FileMapping) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FileMapping
    <R> -> String

'file' @ [70:72] ==> value-parameter file: FileMapping defined in org.jetbrains.kotlin.codegen.inline.SMAPBuilder.generateDebugStrata.<anonymous>[ValueParameterDescriptorImpl]

'toSMAPFile' @ [70:77] ==> private final fun FileMapping.toSMAPFile(id: Int): String defined in org.jetbrains.kotlin.codegen.inline.SMAPBuilder[SimpleFunctionDescriptorImpl]

'id' @ [70:88] ==> value-parameter id: Int defined in org.jetbrains.kotlin.codegen.inline.SMAPBuilder.generateDebugStrata.<anonymous>[ValueParameterDescriptorImpl]

'joinToString' @ [70:100] ==> public fun <T> Iterable<String>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'+' @ [71:28] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'newMappings' @ [71:35] ==> val newMappings: List<FileMapping> defined in org.jetbrains.kotlin.codegen.inline.SMAPBuilder.generateDebugStrata[LocalVariableDescriptor]

'joinToString' @ [71:47] ==> public fun <T> Iterable<FileMapping>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((FileMapping) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FileMapping

'it' @ [71:66] ==> value-parameter it: FileMapping defined in org.jetbrains.kotlin.codegen.inline.SMAPBuilder.generateDebugStrata.<anonymous>[ValueParameterDescriptorImpl]

'toSMAPMapping' @ [71:69] ==> private final fun FileMapping.toSMAPMapping(): String defined in org.jetbrains.kotlin.codegen.inline.SMAPBuilder[SimpleFunctionDescriptorImpl]

'KOTLIN_DEBUG_STRATA_NAME' @ [72:21] ==> public val KOTLIN_DEBUG_STRATA_NAME: String defined in org.jetbrains.kotlin.codegen.inline in file SMAP.kt[PropertyDescriptorImpl]

'fileIds' @ [72:48] ==> val fileIds: String defined in org.jetbrains.kotlin.codegen.inline.SMAPBuilder.generateDebugStrata[LocalVariableDescriptor]

'lineMappings' @ [72:58] ==> val lineMappings: String defined in org.jetbrains.kotlin.codegen.inline.SMAPBuilder.generateDebugStrata[LocalVariableDescriptor]

'if (range == 1) "$source#$fileId:$dest" else "$source#$fileId,$range:$dest"' @ [76:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'range' @ [76:20] ==> public final var range: Int defined in org.jetbrains.kotlin.codegen.inline.RangeMapping[PropertyDescriptorImpl]

'source' @ [76:34] ==> public final val source: Int defined in org.jetbrains.kotlin.codegen.inline.RangeMapping[PropertyDescriptorImpl]

'fileId' @ [76:42] ==> value-parameter fileId: Int defined in org.jetbrains.kotlin.codegen.inline.SMAPBuilder.toSMAP[ValueParameterDescriptorImpl]

'dest' @ [76:50] ==> public final val dest: Int defined in org.jetbrains.kotlin.codegen.inline.RangeMapping[PropertyDescriptorImpl]

'source' @ [76:63] ==> public final val source: Int defined in org.jetbrains.kotlin.codegen.inline.RangeMapping[PropertyDescriptorImpl]

'fileId' @ [76:71] ==> value-parameter fileId: Int defined in org.jetbrains.kotlin.codegen.inline.SMAPBuilder.toSMAP[ValueParameterDescriptorImpl]

'range' @ [76:79] ==> public final var range: Int defined in org.jetbrains.kotlin.codegen.inline.RangeMapping[PropertyDescriptorImpl]

'dest' @ [76:86] ==> public final val dest: Int defined in org.jetbrains.kotlin.codegen.inline.RangeMapping[PropertyDescriptorImpl]

'this' @ [80:9] ==> <this> defined in org.jetbrains.kotlin.codegen.inline.SMAPBuilder.toSMAPFile[ReceiverParameterDescriptorImpl]

'id' @ [80:14] ==> public final var id: Int defined in org.jetbrains.kotlin.codegen.inline.FileMapping[PropertyDescriptorImpl]

'id' @ [80:19] ==> value-parameter id: Int defined in org.jetbrains.kotlin.codegen.inline.SMAPBuilder.toSMAPFile[ValueParameterDescriptorImpl]

'id' @ [81:20] ==> value-parameter id: Int defined in org.jetbrains.kotlin.codegen.inline.SMAPBuilder.toSMAPFile[ValueParameterDescriptorImpl]

'name' @ [81:24] ==> public final val name: String defined in org.jetbrains.kotlin.codegen.inline.FileMapping[PropertyDescriptorImpl]

'path' @ [81:31] ==> public final val path: String defined in org.jetbrains.kotlin.codegen.inline.FileMapping[PropertyDescriptorImpl]

'lineMappings' @ [86:16] ==> public final val lineMappings: ArrayList<RangeMapping> /* = ArrayList<RangeMapping> */ defined in org.jetbrains.kotlin.codegen.inline.FileMapping[PropertyDescriptorImpl]

'joinToString' @ [86:29] ==> public fun <T> Iterable<RangeMapping>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((RangeMapping) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> RangeMapping

'it' @ [86:53] ==> value-parameter it: RangeMapping defined in org.jetbrains.kotlin.codegen.inline.SMAPBuilder.toSMAPMapping.<anonymous>[ValueParameterDescriptorImpl]

'toSMAP' @ [86:56] ==> private final fun RangeMapping.toSMAP(fileId: Int): String defined in org.jetbrains.kotlin.codegen.inline.SMAPBuilder[SimpleFunctionDescriptorImpl]

'id' @ [86:63] ==> public final var id: Int defined in org.jetbrains.kotlin.codegen.inline.FileMapping[PropertyDescriptorImpl]

'DefaultSourceMapper' @ [92:5] ==> public constructor DefaultSourceMapper(sourceInfo: SourceInfo) defined in org.jetbrains.kotlin.codegen.inline.DefaultSourceMapper[ClassConstructorDescriptorImpl]

'sourceInfo' @ [92:25] ==> value-parameter sourceInfo: SourceInfo defined in org.jetbrains.kotlin.codegen.inline.NestedSourceMapper.<init>[ValueParameterDescriptorImpl]

'TIntIntHashMap' @ [94:32] ==> public constructor TIntIntHashMap() defined in gnu.trove.TIntIntHashMap[JavaClassConstructorDescriptor]

'visitedLines' @ [99:32] ==> private final val visitedLines: TIntIntHashMap defined in org.jetbrains.kotlin.codegen.inline.NestedSourceMapper[PropertyDescriptorImpl]

'get' @ [99:45] ==> public open operator fun get(p0: Int): Int defined in gnu.trove.TIntIntHashMap[JavaMethodDescriptor]

'lineNumber' @ [99:49] ==> value-parameter lineNumber: Int defined in org.jetbrains.kotlin.codegen.inline.NestedSourceMapper.mapLineNumber[ValueParameterDescriptorImpl]

'if (mappedLineNumber > 0) {
            mappedLineNumber
        }
        else {
            val rangeForMapping =
                    (if (lastVisitedRange?.contains(lineNumber) ?: false) lastVisitedRange!! else findMappingIfExists(lineNumber))
                    ?: error("Can't find range to map line $lineNumber in ${sourceInfo.source}: ${sourceInfo.pathOrCleanFQN}")
            val sourceLineNumber = rangeForMapping.mapDestToSource(lineNumber)
            val newLineNumber = parent.mapLineNumber(sourceLineNumber, rangeForMapping.parent!!.name, rangeForMapping.parent!!.path)
            if (newLineNumber > 0) {
                visitedLines.put(lineNumber, newLineNumber)
            }
            lastVisitedRange = rangeForMapping
            newLineNumber
        }' @ [101:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'mappedLineNumber' @ [101:20] ==> val mappedLineNumber: Int defined in org.jetbrains.kotlin.codegen.inline.NestedSourceMapper.mapLineNumber[LocalVariableDescriptor]

'mappedLineNumber' @ [102:13] ==> val mappedLineNumber: Int defined in org.jetbrains.kotlin.codegen.inline.NestedSourceMapper.mapLineNumber[LocalVariableDescriptor]

'?:' @ [106:21] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: RangeMapping?, right: RangeMapping): RangeMapping[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> RangeMapping

'if (lastVisitedRange?.contains(lineNumber) ?: false) lastVisitedRange!! else findMappingIfExists(lineNumber)' @ [106:22] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: RangeMapping?, elseBranch: RangeMapping?): RangeMapping?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> RangeMapping?

'lastVisitedRange' @ [106:26] ==> private final var lastVisitedRange: RangeMapping? defined in org.jetbrains.kotlin.codegen.inline.NestedSourceMapper[PropertyDescriptorImpl]

'contains' @ [106:44] ==> public final operator fun contains(destLine: Int): Boolean defined in org.jetbrains.kotlin.codegen.inline.RangeMapping[SimpleFunctionDescriptorImpl]

'lineNumber' @ [106:53] ==> value-parameter lineNumber: Int defined in org.jetbrains.kotlin.codegen.inline.NestedSourceMapper.mapLineNumber[ValueParameterDescriptorImpl]

'lastVisitedRange' @ [106:75] ==> private final var lastVisitedRange: RangeMapping? defined in org.jetbrains.kotlin.codegen.inline.NestedSourceMapper[PropertyDescriptorImpl]

'findMappingIfExists' @ [106:99] ==> private final fun findMappingIfExists(lineNumber: Int): RangeMapping? defined in org.jetbrains.kotlin.codegen.inline.NestedSourceMapper[SimpleFunctionDescriptorImpl]

'lineNumber' @ [106:119] ==> value-parameter lineNumber: Int defined in org.jetbrains.kotlin.codegen.inline.NestedSourceMapper.mapLineNumber[ValueParameterDescriptorImpl]

'error' @ [107:24] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'lineNumber' @ [107:61] ==> value-parameter lineNumber: Int defined in org.jetbrains.kotlin.codegen.inline.NestedSourceMapper.mapLineNumber[ValueParameterDescriptorImpl]

'sourceInfo' @ [107:77] ==> public final val sourceInfo: SourceInfo defined in org.jetbrains.kotlin.codegen.inline.NestedSourceMapper[PropertyDescriptorImpl]

'source' @ [107:88] ==> public final val source: String defined in org.jetbrains.kotlin.codegen.SourceInfo[PropertyDescriptorImpl]

'sourceInfo' @ [107:99] ==> public final val sourceInfo: SourceInfo defined in org.jetbrains.kotlin.codegen.inline.NestedSourceMapper[PropertyDescriptorImpl]

'pathOrCleanFQN' @ [107:110] ==> public final val pathOrCleanFQN: String defined in org.jetbrains.kotlin.codegen.SourceInfo[PropertyDescriptorImpl]

'rangeForMapping' @ [108:36] ==> val rangeForMapping: RangeMapping defined in org.jetbrains.kotlin.codegen.inline.NestedSourceMapper.mapLineNumber[LocalVariableDescriptor]

'mapDestToSource' @ [108:52] ==> public final fun mapDestToSource(destLine: Int): Int defined in org.jetbrains.kotlin.codegen.inline.RangeMapping[SimpleFunctionDescriptorImpl]

'lineNumber' @ [108:68] ==> value-parameter lineNumber: Int defined in org.jetbrains.kotlin.codegen.inline.NestedSourceMapper.mapLineNumber[ValueParameterDescriptorImpl]

'parent' @ [109:33] ==> public open val parent: SourceMapper defined in org.jetbrains.kotlin.codegen.inline.NestedSourceMapper[PropertyDescriptorImpl]

'mapLineNumber' @ [109:40] ==> public open fun mapLineNumber(source: Int, sourceName: String, sourcePath: String): Int defined in org.jetbrains.kotlin.codegen.inline.SourceMapper[SimpleFunctionDescriptorImpl]

'sourceLineNumber' @ [109:54] ==> val sourceLineNumber: Int defined in org.jetbrains.kotlin.codegen.inline.NestedSourceMapper.mapLineNumber[LocalVariableDescriptor]

'rangeForMapping' @ [109:72] ==> val rangeForMapping: RangeMapping defined in org.jetbrains.kotlin.codegen.inline.NestedSourceMapper.mapLineNumber[LocalVariableDescriptor]

'parent' @ [109:88] ==> public final var parent: FileMapping? defined in org.jetbrains.kotlin.codegen.inline.RangeMapping[PropertyDescriptorImpl]

'name' @ [109:97] ==> public final val name: String defined in org.jetbrains.kotlin.codegen.inline.FileMapping[PropertyDescriptorImpl]

'rangeForMapping' @ [109:103] ==> val rangeForMapping: RangeMapping defined in org.jetbrains.kotlin.codegen.inline.NestedSourceMapper.mapLineNumber[LocalVariableDescriptor]

'parent' @ [109:119] ==> public final var parent: FileMapping? defined in org.jetbrains.kotlin.codegen.inline.RangeMapping[PropertyDescriptorImpl]

'path' @ [109:128] ==> public final val path: String defined in org.jetbrains.kotlin.codegen.inline.FileMapping[PropertyDescriptorImpl]

'newLineNumber' @ [110:17] ==> val newLineNumber: Int defined in org.jetbrains.kotlin.codegen.inline.NestedSourceMapper.mapLineNumber[LocalVariableDescriptor]

'visitedLines' @ [111:17] ==> private final val visitedLines: TIntIntHashMap defined in org.jetbrains.kotlin.codegen.inline.NestedSourceMapper[PropertyDescriptorImpl]

'put' @ [111:30] ==> public open fun put(p0: Int, p1: Int): Int defined in gnu.trove.TIntIntHashMap[JavaMethodDescriptor]

'lineNumber' @ [111:34] ==> value-parameter lineNumber: Int defined in org.jetbrains.kotlin.codegen.inline.NestedSourceMapper.mapLineNumber[ValueParameterDescriptorImpl]

'newLineNumber' @ [111:46] ==> val newLineNumber: Int defined in org.jetbrains.kotlin.codegen.inline.NestedSourceMapper.mapLineNumber[LocalVariableDescriptor]

'lastVisitedRange' @ [113:13] ==> private final var lastVisitedRange: RangeMapping? defined in org.jetbrains.kotlin.codegen.inline.NestedSourceMapper[PropertyDescriptorImpl]

'rangeForMapping' @ [113:32] ==> val rangeForMapping: RangeMapping defined in org.jetbrains.kotlin.codegen.inline.NestedSourceMapper.mapLineNumber[LocalVariableDescriptor]

'newLineNumber' @ [114:13] ==> val newLineNumber: Int defined in org.jetbrains.kotlin.codegen.inline.NestedSourceMapper.mapLineNumber[LocalVariableDescriptor]

'ranges' @ [119:21] ==> public final val ranges: List<RangeMapping> defined in org.jetbrains.kotlin.codegen.inline.NestedSourceMapper[PropertyDescriptorImpl]

'binarySearch' @ [119:28] ==> public fun <T> List<RangeMapping>.binarySearch(element: RangeMapping, comparator: Comparator<in RangeMapping> /* = Comparator<in RangeMapping> */, fromIndex: Int = ..., toIndex: Int = ...): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> RangeMapping

'RangeMapping' @ [119:41] ==> public constructor RangeMapping(source: Int, dest: Int, range: Int = ..., callSiteMarker: CallSiteMarker? = ...) defined in org.jetbrains.kotlin.codegen.inline.RangeMapping[ClassConstructorDescriptorImpl]

'lineNumber' @ [119:54] ==> value-parameter lineNumber: Int defined in org.jetbrains.kotlin.codegen.inline.NestedSourceMapper.findMappingIfExists[ValueParameterDescriptorImpl]

'lineNumber' @ [119:66] ==> value-parameter lineNumber: Int defined in org.jetbrains.kotlin.codegen.inline.NestedSourceMapper.findMappingIfExists[ValueParameterDescriptorImpl]

'Comparator' @ [119:82] ==> @FunctionalInterface public fun <T : (Any..Any?)> Comparator(function: ((RangeMapping..RangeMapping?), (RangeMapping..RangeMapping?)) -> Int): Comparator<RangeMapping> defined in java.util[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : (Any..Any?)> -> RangeMapping

'if (key.dest in value) 0 else RangeMapping.Comparator.compare(value, key)' @ [121:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'key' @ [121:17] ==> value-parameter key: (RangeMapping..RangeMapping?) defined in org.jetbrains.kotlin.codegen.inline.NestedSourceMapper.findMappingIfExists.<anonymous>[ValueParameterDescriptorImpl]

'dest' @ [121:21] ==> public final val dest: Int defined in org.jetbrains.kotlin.codegen.inline.RangeMapping[PropertyDescriptorImpl]

'value' @ [121:29] ==> value-parameter value: (RangeMapping..RangeMapping?) defined in org.jetbrains.kotlin.codegen.inline.NestedSourceMapper.findMappingIfExists.<anonymous>[ValueParameterDescriptorImpl]

'RangeMapping' @ [121:43] ==> public companion object defined in org.jetbrains.kotlin.codegen.inline.RangeMapping[FakeCallableDescriptorForObject]

'compare' @ [121:67] ==> public open fun compare(o1: RangeMapping, o2: RangeMapping): Int defined in org.jetbrains.kotlin.codegen.inline.RangeMapping.Comparator[SimpleFunctionDescriptorImpl]

'value' @ [121:75] ==> value-parameter value: (RangeMapping..RangeMapping?) defined in org.jetbrains.kotlin.codegen.inline.NestedSourceMapper.findMappingIfExists.<anonymous>[ValueParameterDescriptorImpl]

'key' @ [121:82] ==> value-parameter key: (RangeMapping..RangeMapping?) defined in org.jetbrains.kotlin.codegen.inline.NestedSourceMapper.findMappingIfExists.<anonymous>[ValueParameterDescriptorImpl]

'if (index < 0) null else ranges[index]' @ [123:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: RangeMapping?, elseBranch: RangeMapping?): RangeMapping?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> RangeMapping?

'index' @ [123:20] ==> val index: Int defined in org.jetbrains.kotlin.codegen.inline.NestedSourceMapper.findMappingIfExists[LocalVariableDescriptor]

'ranges' @ [123:41] ==> public final val ranges: List<RangeMapping> defined in org.jetbrains.kotlin.codegen.inline.NestedSourceMapper[PropertyDescriptorImpl]

'index' @ [123:48] ==> val index: Int defined in org.jetbrains.kotlin.codegen.inline.NestedSourceMapper.findMappingIfExists[LocalVariableDescriptor]

'NestedSourceMapper' @ [129:5] ==> public constructor NestedSourceMapper(parent: SourceMapper, ranges: List<RangeMapping>, sourceInfo: SourceInfo) defined in org.jetbrains.kotlin.codegen.inline.NestedSourceMapper[ClassConstructorDescriptorImpl]

'parent' @ [129:24] ==> value-parameter parent: SourceMapper defined in org.jetbrains.kotlin.codegen.inline.InlineLambdaSourceMapper.<init>[ValueParameterDescriptorImpl]

'smap' @ [129:32] ==> value-parameter smap: SMAPAndMethodNode defined in org.jetbrains.kotlin.codegen.inline.InlineLambdaSourceMapper.<init>[ValueParameterDescriptorImpl]

'sortedRanges' @ [129:37] ==> public final val sortedRanges: List<RangeMapping> defined in org.jetbrains.kotlin.codegen.inline.SMAPAndMethodNode[PropertyDescriptorImpl]

'smap' @ [129:51] ==> value-parameter smap: SMAPAndMethodNode defined in org.jetbrains.kotlin.codegen.inline.InlineLambdaSourceMapper.<init>[ValueParameterDescriptorImpl]

'classSMAP' @ [129:56] ==> public final val classSMAP: SMAP defined in org.jetbrains.kotlin.codegen.inline.SMAPAndMethodNode[PropertyDescriptorImpl]

'sourceInfo' @ [129:66] ==> public final val sourceInfo: SourceInfo defined in org.jetbrains.kotlin.codegen.inline.SMAP[PropertyDescriptorImpl]

'assert' @ [132:9] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'ranges' @ [132:16] ==> public final val ranges: List<RangeMapping> defined in org.jetbrains.kotlin.codegen.inline.InlineLambdaSourceMapper[PropertyDescriptorImpl]

'isNotEmpty' @ [132:23] ==> @InlineOnly public inline fun <T> Collection<RangeMapping>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> RangeMapping

'smap' @ [133:69] ==> value-parameter smap: SMAPAndMethodNode defined in org.jetbrains.kotlin.codegen.inline.InlineLambdaSourceMapper.<init>[ValueParameterDescriptorImpl]

'node' @ [133:74] ==> public final val node: MethodNode defined in org.jetbrains.kotlin.codegen.inline.SMAPAndMethodNode[PropertyDescriptorImpl]

'ranges' @ [138:13] ==> public final val ranges: List<RangeMapping> defined in org.jetbrains.kotlin.codegen.inline.InlineLambdaSourceMapper[PropertyDescriptorImpl]

'firstOrNull' @ [138:20] ==> public fun <T> List<RangeMapping>.firstOrNull(): RangeMapping? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> RangeMapping

'contains' @ [138:35] ==> public final operator fun contains(destLine: Int): Boolean defined in org.jetbrains.kotlin.codegen.inline.RangeMapping[SimpleFunctionDescriptorImpl]

'lineNumber' @ [138:44] ==> value-parameter lineNumber: Int defined in org.jetbrains.kotlin.codegen.inline.InlineLambdaSourceMapper.mapLineNumber[ValueParameterDescriptorImpl]

'lineNumber' @ [140:20] ==> value-parameter lineNumber: Int defined in org.jetbrains.kotlin.codegen.inline.InlineLambdaSourceMapper.mapLineNumber[ValueParameterDescriptorImpl]

'super' @ [142:16] ==> <this> defined in org.jetbrains.kotlin.codegen.inline.InlineLambdaSourceMapper[LazyClassReceiverParameterDescriptor]

'mapLineNumber' @ [142:22] ==> public open fun mapLineNumber(lineNumber: Int): Int defined in org.jetbrains.kotlin.codegen.inline.NestedSourceMapper[SimpleFunctionDescriptorImpl]

'lineNumber' @ [142:36] ==> value-parameter lineNumber: Int defined in org.jetbrains.kotlin.codegen.inline.InlineLambdaSourceMapper.mapLineNumber[ValueParameterDescriptorImpl]

'UnsupportedOperationException' @ [152:15] ==> public final fun <init>(p0: (String..String?)): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

'UnsupportedOperationException' @ [156:15] ==> public final fun <init>(p0: (String..String?)): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

'mapper' @ [164:13] ==> value-parameter mapper: SourceMapper defined in org.jetbrains.kotlin.codegen.inline.SourceMapper.Companion.flushToClassBuilder[ValueParameterDescriptorImpl]

'resultMappings' @ [164:20] ==> public abstract val resultMappings: List<FileMapping> defined in org.jetbrains.kotlin.codegen.inline.SourceMapper[PropertyDescriptorImpl]

'forEach' @ [164:35] ==> @HidesMembers public inline fun <T> Iterable<FileMapping>.forEach(action: (FileMapping) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FileMapping

'v' @ [164:60] ==> value-parameter v: ClassBuilder defined in org.jetbrains.kotlin.codegen.inline.SourceMapper.Companion.flushToClassBuilder[ValueParameterDescriptorImpl]

'addSMAP' @ [164:62] ==> public abstract fun addSMAP(mapping: (FileMapping..FileMapping?)): Unit defined in org.jetbrains.kotlin.codegen.ClassBuilder[JavaMethodDescriptor]

'fileMapping' @ [164:70] ==> value-parameter fileMapping: FileMapping defined in org.jetbrains.kotlin.codegen.inline.SourceMapper.Companion.flushToClassBuilder.<anonymous>[ValueParameterDescriptorImpl]

'DefaultSourceMapper' @ [168:20] ==> public constructor DefaultSourceMapper(sourceInfo: SourceInfo, fileMappings: List<FileMapping>) defined in org.jetbrains.kotlin.codegen.inline.DefaultSourceMapper[ClassConstructorDescriptorImpl]

'smap' @ [168:40] ==> value-parameter smap: SMAP defined in org.jetbrains.kotlin.codegen.inline.SourceMapper.Companion.createFromSmap[ValueParameterDescriptorImpl]

'sourceInfo' @ [168:45] ==> public final val sourceInfo: SourceInfo defined in org.jetbrains.kotlin.codegen.inline.SMAP[PropertyDescriptorImpl]

'smap' @ [168:57] ==> value-parameter smap: SMAP defined in org.jetbrains.kotlin.codegen.inline.SourceMapper.Companion.createFromSmap[ValueParameterDescriptorImpl]

'fileMappings' @ [168:62] ==> public final val fileMappings: List<FileMapping> defined in org.jetbrains.kotlin.codegen.inline.SMAP[PropertyDescriptorImpl]

'emptyList' @ [175:17] ==> public fun <T> emptyList(): List<FileMapping> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FileMapping

'lineNumber' @ [180:51] ==> value-parameter lineNumber: Int defined in org.jetbrains.kotlin.codegen.inline.IdenticalSourceMapper.mapLineNumber[ValueParameterDescriptorImpl]

'sourceInfo' @ [186:37] ==> public final val sourceInfo: SourceInfo defined in org.jetbrains.kotlin.codegen.inline.DefaultSourceMapper[PropertyDescriptorImpl]

'linesInFile' @ [186:48] ==> public final val linesInFile: Int defined in org.jetbrains.kotlin.codegen.SourceInfo[PropertyDescriptorImpl]

'linkedMapOf' @ [188:71] ==> @SinceKotlin @InlineOnly public inline fun <K, V> linkedMapOf(): LinkedHashMap<String, RawFileMapping> /* = LinkedHashMap<String, RawFileMapping> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> RawFileMapping

'lastMappedWithChanges' @ [194:13] ==> private final var lastMappedWithChanges: RawFileMapping? defined in org.jetbrains.kotlin.codegen.inline.DefaultSourceMapper[PropertyDescriptorImpl]

'field' @ [195:13] ==> var field: CallSiteMarker? defined in org.jetbrains.kotlin.codegen.inline.DefaultSourceMapper.<set-callSiteMarker>[SyntheticFieldDescriptor]

'value' @ [195:21] ==> value-parameter value: CallSiteMarker? defined in org.jetbrains.kotlin.codegen.inline.DefaultSourceMapper.<set-callSiteMarker>[ValueParameterDescriptorImpl]

'fileMappings' @ [199:17] ==> private final var fileMappings: LinkedHashMap<String, RawFileMapping> defined in org.jetbrains.kotlin.codegen.inline.DefaultSourceMapper[PropertyDescriptorImpl]

'values' @ [199:30] ==> public open val values: MutableCollection<RawFileMapping> defined in java.util.LinkedHashMap[JavaPropertyDescriptor]

'map' @ [199:37] ==> public inline fun <T, R> Iterable<RawFileMapping>.map(transform: (RawFileMapping) -> FileMapping): List<FileMapping> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> RawFileMapping
    <R> -> FileMapping

'it' @ [199:43] ==> value-parameter it: RawFileMapping defined in org.jetbrains.kotlin.codegen.inline.DefaultSourceMapper.<get-resultMappings>.<anonymous>[ValueParameterDescriptorImpl]

'toFileMapping' @ [199:46] ==> public final fun toFileMapping(): FileMapping defined in org.jetbrains.kotlin.codegen.inline.RawFileMapping[SimpleFunctionDescriptorImpl]

'sourceInfo' @ [202:20] ==> public final val sourceInfo: SourceInfo defined in org.jetbrains.kotlin.codegen.inline.DefaultSourceMapper[PropertyDescriptorImpl]

'source' @ [202:31] ==> public final val source: String defined in org.jetbrains.kotlin.codegen.SourceInfo[PropertyDescriptorImpl]

'sourceInfo' @ [203:20] ==> public final val sourceInfo: SourceInfo defined in org.jetbrains.kotlin.codegen.inline.DefaultSourceMapper[PropertyDescriptorImpl]

'pathOrCleanFQN' @ [203:31] ==> public final val pathOrCleanFQN: String defined in org.jetbrains.kotlin.codegen.SourceInfo[PropertyDescriptorImpl]

'origin' @ [204:9] ==> protected final val origin: RawFileMapping defined in org.jetbrains.kotlin.codegen.inline.DefaultSourceMapper[PropertyDescriptorImpl]

'RawFileMapping' @ [204:18] ==> public constructor RawFileMapping(name: String, path: String) defined in org.jetbrains.kotlin.codegen.inline.RawFileMapping[ClassConstructorDescriptorImpl]

'name' @ [204:33] ==> val name: String defined in org.jetbrains.kotlin.codegen.inline.DefaultSourceMapper.<init>[LocalVariableDescriptor]

'path' @ [204:39] ==> val path: String defined in org.jetbrains.kotlin.codegen.inline.DefaultSourceMapper.<init>[LocalVariableDescriptor]

'origin' @ [205:9] ==> protected final val origin: RawFileMapping defined in org.jetbrains.kotlin.codegen.inline.DefaultSourceMapper[PropertyDescriptorImpl]

'initRange' @ [205:16] ==> public final fun initRange(start: Int, end: Int): Unit defined in org.jetbrains.kotlin.codegen.inline.RawFileMapping[SimpleFunctionDescriptorImpl]

'sourceInfo' @ [205:29] ==> public final val sourceInfo: SourceInfo defined in org.jetbrains.kotlin.codegen.inline.DefaultSourceMapper[PropertyDescriptorImpl]

'linesInFile' @ [205:40] ==> public final val linesInFile: Int defined in org.jetbrains.kotlin.codegen.SourceInfo[PropertyDescriptorImpl]

'fileMappings' @ [206:9] ==> private final var fileMappings: LinkedHashMap<String, RawFileMapping> defined in org.jetbrains.kotlin.codegen.inline.DefaultSourceMapper[PropertyDescriptorImpl]

'put' @ [206:22] ==> public open fun put(key: String, value: RawFileMapping): RawFileMapping? defined in java.util.LinkedHashMap[JavaMethodDescriptor]

'createKey' @ [206:26] ==> private final fun createKey(name: String, path: String): String defined in org.jetbrains.kotlin.codegen.inline.DefaultSourceMapper[SimpleFunctionDescriptorImpl]

'name' @ [206:36] ==> val name: String defined in org.jetbrains.kotlin.codegen.inline.DefaultSourceMapper.<init>[LocalVariableDescriptor]

'path' @ [206:42] ==> val path: String defined in org.jetbrains.kotlin.codegen.inline.DefaultSourceMapper.<init>[LocalVariableDescriptor]

'origin' @ [206:49] ==> protected final val origin: RawFileMapping defined in org.jetbrains.kotlin.codegen.inline.DefaultSourceMapper[PropertyDescriptorImpl]

'this' @ [209:76] ==> public constructor DefaultSourceMapper(sourceInfo: SourceInfo) defined in org.jetbrains.kotlin.codegen.inline.DefaultSourceMapper[ClassConstructorDescriptorImpl]

'sourceInfo' @ [209:81] ==> value-parameter sourceInfo: SourceInfo defined in org.jetbrains.kotlin.codegen.inline.DefaultSourceMapper.<init>[ValueParameterDescriptorImpl]

'fileMappings' @ [210:9] ==> value-parameter fileMappings: List<FileMapping> defined in org.jetbrains.kotlin.codegen.inline.DefaultSourceMapper.<init>[ValueParameterDescriptorImpl]

'asSequence' @ [210:22] ==> public fun <T> Iterable<FileMapping>.asSequence(): Sequence<FileMapping> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FileMapping

'drop' @ [210:35] ==> public fun <T> Sequence<FileMapping>.drop(n: Int): Sequence<FileMapping> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FileMapping

'forEach' @ [212:18] ==> public inline fun <T> Sequence<FileMapping>.forEach(action: (FileMapping) -> Unit): Unit defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FileMapping

'getOrRegisterNewSource' @ [213:42] ==> private final fun getOrRegisterNewSource(name: String, path: String): RawFileMapping defined in org.jetbrains.kotlin.codegen.inline.DefaultSourceMapper[SimpleFunctionDescriptorImpl]

'fileMapping' @ [213:65] ==> value-parameter fileMapping: FileMapping defined in org.jetbrains.kotlin.codegen.inline.DefaultSourceMapper.<init>.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [213:77] ==> public final val name: String defined in org.jetbrains.kotlin.codegen.inline.FileMapping[PropertyDescriptorImpl]

'fileMapping' @ [213:83] ==> value-parameter fileMapping: FileMapping defined in org.jetbrains.kotlin.codegen.inline.DefaultSourceMapper.<init>.<anonymous>[ValueParameterDescriptorImpl]

'path' @ [213:95] ==> public final val path: String defined in org.jetbrains.kotlin.codegen.inline.FileMapping[PropertyDescriptorImpl]

'fileMapping' @ [214:21] ==> value-parameter fileMapping: FileMapping defined in org.jetbrains.kotlin.codegen.inline.DefaultSourceMapper.<init>.<anonymous>[ValueParameterDescriptorImpl]

'lineMappings' @ [214:33] ==> public final val lineMappings: ArrayList<RangeMapping> /* = ArrayList<RangeMapping> */ defined in org.jetbrains.kotlin.codegen.inline.FileMapping[PropertyDescriptorImpl]

'forEach' @ [214:46] ==> @HidesMembers public inline fun <T> Iterable<RangeMapping>.forEach(action: (RangeMapping) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> RangeMapping

'newFileMapping' @ [215:25] ==> val newFileMapping: RawFileMapping defined in org.jetbrains.kotlin.codegen.inline.DefaultSourceMapper.<init>.<anonymous>[LocalVariableDescriptor]

'mapNewInterval' @ [215:40] ==> public final fun mapNewInterval(source: Int, dest: Int, range: Int): Unit defined in org.jetbrains.kotlin.codegen.inline.RawFileMapping[SimpleFunctionDescriptorImpl]

'it' @ [215:55] ==> value-parameter it: RangeMapping defined in org.jetbrains.kotlin.codegen.inline.DefaultSourceMapper.<init>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'source' @ [215:58] ==> public final val source: Int defined in org.jetbrains.kotlin.codegen.inline.RangeMapping[PropertyDescriptorImpl]

'it' @ [215:66] ==> value-parameter it: RangeMapping defined in org.jetbrains.kotlin.codegen.inline.DefaultSourceMapper.<init>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'dest' @ [215:69] ==> public final val dest: Int defined in org.jetbrains.kotlin.codegen.inline.RangeMapping[PropertyDescriptorImpl]

'it' @ [215:75] ==> value-parameter it: RangeMapping defined in org.jetbrains.kotlin.codegen.inline.DefaultSourceMapper.<init>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'range' @ [215:78] ==> public final var range: Int defined in org.jetbrains.kotlin.codegen.inline.RangeMapping[PropertyDescriptorImpl]

'maxUsedValue' @ [216:25] ==> private final var maxUsedValue: Int defined in org.jetbrains.kotlin.codegen.inline.DefaultSourceMapper[PropertyDescriptorImpl]

'max' @ [216:45] ==> public open fun max(p0: Int, p1: Int): Int defined in java.lang.Math[JavaMethodDescriptor]

'it' @ [216:49] ==> value-parameter it: RangeMapping defined in org.jetbrains.kotlin.codegen.inline.DefaultSourceMapper.<init>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'maxDest' @ [216:52] ==> public final val maxDest: Int defined in org.jetbrains.kotlin.codegen.inline.RangeMapping[PropertyDescriptorImpl]

'maxUsedValue' @ [216:61] ==> private final var maxUsedValue: Int defined in org.jetbrains.kotlin.codegen.inline.DefaultSourceMapper[PropertyDescriptorImpl]

'name' @ [221:59] ==> value-parameter name: String defined in org.jetbrains.kotlin.codegen.inline.DefaultSourceMapper.createKey[ValueParameterDescriptorImpl]

'path' @ [221:65] ==> value-parameter path: String defined in org.jetbrains.kotlin.codegen.inline.DefaultSourceMapper.createKey[ValueParameterDescriptorImpl]

'fileMappings' @ [224:16] ==> private final var fileMappings: LinkedHashMap<String, RawFileMapping> defined in org.jetbrains.kotlin.codegen.inline.DefaultSourceMapper[PropertyDescriptorImpl]

'getOrPut' @ [224:29] ==> public inline fun <K, V> MutableMap<String, RawFileMapping>.getOrPut(key: String, defaultValue: () -> RawFileMapping): RawFileMapping defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> RawFileMapping

'createKey' @ [224:38] ==> private final fun createKey(name: String, path: String): String defined in org.jetbrains.kotlin.codegen.inline.DefaultSourceMapper[SimpleFunctionDescriptorImpl]

'name' @ [224:48] ==> value-parameter name: String defined in org.jetbrains.kotlin.codegen.inline.DefaultSourceMapper.getOrRegisterNewSource[ValueParameterDescriptorImpl]

'path' @ [224:54] ==> value-parameter path: String defined in org.jetbrains.kotlin.codegen.inline.DefaultSourceMapper.getOrRegisterNewSource[ValueParameterDescriptorImpl]

'RawFileMapping' @ [224:63] ==> public constructor RawFileMapping(name: String, path: String) defined in org.jetbrains.kotlin.codegen.inline.RawFileMapping[ClassConstructorDescriptorImpl]

'name' @ [224:78] ==> value-parameter name: String defined in org.jetbrains.kotlin.codegen.inline.DefaultSourceMapper.getOrRegisterNewSource[ValueParameterDescriptorImpl]

'path' @ [224:84] ==> value-parameter path: String defined in org.jetbrains.kotlin.codegen.inline.DefaultSourceMapper.getOrRegisterNewSource[ValueParameterDescriptorImpl]

'lineNumber' @ [228:13] ==> value-parameter lineNumber: Int defined in org.jetbrains.kotlin.codegen.inline.DefaultSourceMapper.mapLineNumber[ValueParameterDescriptorImpl]

'-' @ [230:20] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'lineNumber' @ [233:16] ==> value-parameter lineNumber: Int defined in org.jetbrains.kotlin.codegen.inline.DefaultSourceMapper.mapLineNumber[ValueParameterDescriptorImpl]

'source' @ [237:13] ==> value-parameter source: Int defined in org.jetbrains.kotlin.codegen.inline.DefaultSourceMapper.mapLineNumber[ValueParameterDescriptorImpl]

'-' @ [239:20] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'createMapping' @ [241:16] ==> private final fun createMapping(fileMapping: RawFileMapping, lineNumber: Int): Int defined in org.jetbrains.kotlin.codegen.inline.DefaultSourceMapper[SimpleFunctionDescriptorImpl]

'getOrRegisterNewSource' @ [241:30] ==> private final fun getOrRegisterNewSource(name: String, path: String): RawFileMapping defined in org.jetbrains.kotlin.codegen.inline.DefaultSourceMapper[SimpleFunctionDescriptorImpl]

'sourceName' @ [241:53] ==> value-parameter sourceName: String defined in org.jetbrains.kotlin.codegen.inline.DefaultSourceMapper.mapLineNumber[ValueParameterDescriptorImpl]

'sourcePath' @ [241:65] ==> value-parameter sourcePath: String defined in org.jetbrains.kotlin.codegen.inline.DefaultSourceMapper.mapLineNumber[ValueParameterDescriptorImpl]

'source' @ [241:78] ==> value-parameter source: Int defined in org.jetbrains.kotlin.codegen.inline.DefaultSourceMapper.mapLineNumber[ValueParameterDescriptorImpl]

'fileMapping' @ [245:31] ==> value-parameter fileMapping: RawFileMapping defined in org.jetbrains.kotlin.codegen.inline.DefaultSourceMapper.createMapping[ValueParameterDescriptorImpl]

'mapNewLineNumber' @ [245:43] ==> public final fun mapNewLineNumber(source: Int, currentIndex: Int, isLastMapped: Boolean, callSiteMarker: CallSiteMarker?): Int defined in org.jetbrains.kotlin.codegen.inline.RawFileMapping[SimpleFunctionDescriptorImpl]

'lineNumber' @ [245:60] ==> value-parameter lineNumber: Int defined in org.jetbrains.kotlin.codegen.inline.DefaultSourceMapper.createMapping[ValueParameterDescriptorImpl]

'maxUsedValue' @ [245:72] ==> private final var maxUsedValue: Int defined in org.jetbrains.kotlin.codegen.inline.DefaultSourceMapper[PropertyDescriptorImpl]

'lastMappedWithChanges' @ [245:86] ==> private final var lastMappedWithChanges: RawFileMapping? defined in org.jetbrains.kotlin.codegen.inline.DefaultSourceMapper[PropertyDescriptorImpl]

'fileMapping' @ [245:111] ==> value-parameter fileMapping: RawFileMapping defined in org.jetbrains.kotlin.codegen.inline.DefaultSourceMapper.createMapping[ValueParameterDescriptorImpl]

'callSiteMarker' @ [245:124] ==> public final var callSiteMarker: CallSiteMarker? defined in org.jetbrains.kotlin.codegen.inline.DefaultSourceMapper[PropertyDescriptorImpl]

'mappedLineIndex' @ [246:13] ==> val mappedLineIndex: Int defined in org.jetbrains.kotlin.codegen.inline.DefaultSourceMapper.createMapping[LocalVariableDescriptor]

'maxUsedValue' @ [246:31] ==> private final var maxUsedValue: Int defined in org.jetbrains.kotlin.codegen.inline.DefaultSourceMapper[PropertyDescriptorImpl]

'lastMappedWithChanges' @ [247:13] ==> private final var lastMappedWithChanges: RawFileMapping? defined in org.jetbrains.kotlin.codegen.inline.DefaultSourceMapper[PropertyDescriptorImpl]

'fileMapping' @ [247:37] ==> value-parameter fileMapping: RawFileMapping defined in org.jetbrains.kotlin.codegen.inline.DefaultSourceMapper.createMapping[ValueParameterDescriptorImpl]

'maxUsedValue' @ [248:13] ==> private final var maxUsedValue: Int defined in org.jetbrains.kotlin.codegen.inline.DefaultSourceMapper[PropertyDescriptorImpl]

'mappedLineIndex' @ [248:28] ==> val mappedLineIndex: Int defined in org.jetbrains.kotlin.codegen.inline.DefaultSourceMapper.createMapping[LocalVariableDescriptor]

'mappedLineIndex' @ [250:16] ==> val mappedLineIndex: Int defined in org.jetbrains.kotlin.codegen.inline.DefaultSourceMapper.createMapping[LocalVariableDescriptor]

'assert' @ [256:9] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'fileMappings' @ [256:16] ==> public final val fileMappings: List<FileMapping> defined in org.jetbrains.kotlin.codegen.inline.SMAP[PropertyDescriptorImpl]

'isNotEmpty' @ [256:29] ==> @InlineOnly public inline fun <T> Collection<FileMapping>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FileMapping

'fileMappings' @ [260:17] ==> public final val fileMappings: List<FileMapping> defined in org.jetbrains.kotlin.codegen.inline.SMAP[PropertyDescriptorImpl]

'first' @ [260:30] ==> public fun <T> List<FileMapping>.first(): FileMapping defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FileMapping

'fileMappings' @ [262:21] ==> public final val fileMappings: List<FileMapping> defined in org.jetbrains.kotlin.codegen.inline.SMAP[PropertyDescriptorImpl]

'flatMap' @ [262:34] ==> public inline fun <T, R> Iterable<FileMapping>.flatMap(transform: (FileMapping) -> Iterable<RangeMapping>): List<RangeMapping> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FileMapping
    <R> -> RangeMapping

'it' @ [262:44] ==> value-parameter it: FileMapping defined in org.jetbrains.kotlin.codegen.inline.SMAP.intervals.<anonymous>[ValueParameterDescriptorImpl]

'lineMappings' @ [262:47] ==> public final val lineMappings: ArrayList<RangeMapping> /* = ArrayList<RangeMapping> */ defined in org.jetbrains.kotlin.codegen.inline.FileMapping[PropertyDescriptorImpl]

'sortedWith' @ [262:62] ==> public fun <T> Iterable<RangeMapping>.sortedWith(comparator: Comparator<in RangeMapping> /* = Comparator<in RangeMapping> */): List<RangeMapping> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> RangeMapping

'RangeMapping' @ [262:73] ==> public companion object defined in org.jetbrains.kotlin.codegen.inline.RangeMapping[FakeCallableDescriptorForObject]

'Comparator' @ [262:86] ==> public object Comparator : Comparator<RangeMapping> defined in org.jetbrains.kotlin.codegen.inline.RangeMapping[FakeCallableDescriptorForObject]

'default' @ [267:30] ==> public final val default: FileMapping defined in org.jetbrains.kotlin.codegen.inline.SMAP[PropertyDescriptorImpl]

'lineMappings' @ [267:38] ==> public final val lineMappings: ArrayList<RangeMapping> /* = ArrayList<RangeMapping> */ defined in org.jetbrains.kotlin.codegen.inline.FileMapping[PropertyDescriptorImpl]

'first' @ [267:51] ==> public fun <T> List<RangeMapping>.first(): RangeMapping defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> RangeMapping

'sourceInfo' @ [268:9] ==> public final val sourceInfo: SourceInfo defined in org.jetbrains.kotlin.codegen.inline.SMAP[PropertyDescriptorImpl]

'SourceInfo' @ [268:22] ==> public constructor SourceInfo(source: String, pathOrCleanFQN: String, linesInFile: Int) defined in org.jetbrains.kotlin.codegen.SourceInfo[ClassConstructorDescriptorImpl]

'default' @ [268:33] ==> public final val default: FileMapping defined in org.jetbrains.kotlin.codegen.inline.SMAP[PropertyDescriptorImpl]

'name' @ [268:41] ==> public final val name: String defined in org.jetbrains.kotlin.codegen.inline.FileMapping[PropertyDescriptorImpl]

'default' @ [268:47] ==> public final val default: FileMapping defined in org.jetbrains.kotlin.codegen.inline.SMAP[PropertyDescriptorImpl]

'path' @ [268:55] ==> public final val path: String defined in org.jetbrains.kotlin.codegen.inline.FileMapping[PropertyDescriptorImpl]

'defaultMapping' @ [268:61] ==> val defaultMapping: RangeMapping defined in org.jetbrains.kotlin.codegen.inline.SMAP.<init>[LocalVariableDescriptor]

'source' @ [268:76] ==> public final val source: Int defined in org.jetbrains.kotlin.codegen.inline.RangeMapping[PropertyDescriptorImpl]

'defaultMapping' @ [268:85] ==> val defaultMapping: RangeMapping defined in org.jetbrains.kotlin.codegen.inline.SMAP.<init>[LocalVariableDescriptor]

'range' @ [268:100] ==> public final var range: Int defined in org.jetbrains.kotlin.codegen.inline.RangeMapping[PropertyDescriptorImpl]

'arrayListOf' @ [280:33] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<RangeMapping> /* = ArrayList<RangeMapping> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> RangeMapping

'-' @ [282:42] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'FileMapping' @ [285:13] ==> public constructor FileMapping(name: String, path: String) defined in org.jetbrains.kotlin.codegen.inline.FileMapping[ClassConstructorDescriptorImpl]

'name' @ [285:25] ==> public final val name: String defined in org.jetbrains.kotlin.codegen.inline.RawFileMapping[PropertyDescriptorImpl]

'path' @ [285:31] ==> public final val path: String defined in org.jetbrains.kotlin.codegen.inline.RawFileMapping[PropertyDescriptorImpl]

'apply' @ [285:37] ==> @InlineOnly public inline fun <T> FileMapping.apply(block: FileMapping.() -> Unit): FileMapping defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FileMapping

'rangeMappings' @ [286:31] ==> private final val rangeMappings: ArrayList<RangeMapping> /* = ArrayList<RangeMapping> */ defined in org.jetbrains.kotlin.codegen.inline.RawFileMapping[PropertyDescriptorImpl]

'addRangeMapping' @ [287:21] ==> public final fun addRangeMapping(lineMapping: RangeMapping): Unit defined in org.jetbrains.kotlin.codegen.inline.FileMapping[SimpleFunctionDescriptorImpl]

'range' @ [287:37] ==> val range: RangeMapping defined in org.jetbrains.kotlin.codegen.inline.RawFileMapping.toFileMapping.<anonymous>[LocalVariableDescriptor]

'assert' @ [292:9] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'rangeMappings' @ [292:16] ==> private final val rangeMappings: ArrayList<RangeMapping> /* = ArrayList<RangeMapping> */ defined in org.jetbrains.kotlin.codegen.inline.RawFileMapping[PropertyDescriptorImpl]

'isEmpty' @ [292:30] ==> public open fun isEmpty(): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'rangeMappings' @ [293:9] ==> private final val rangeMappings: ArrayList<RangeMapping> /* = ArrayList<RangeMapping> */ defined in org.jetbrains.kotlin.codegen.inline.RawFileMapping[PropertyDescriptorImpl]

'add' @ [293:23] ==> public open fun add(element: RangeMapping): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'RangeMapping' @ [293:27] ==> public constructor RangeMapping(source: Int, dest: Int, range: Int = ..., callSiteMarker: CallSiteMarker? = ...) defined in org.jetbrains.kotlin.codegen.inline.RangeMapping[ClassConstructorDescriptorImpl]

'start' @ [293:40] ==> value-parameter start: Int defined in org.jetbrains.kotlin.codegen.inline.RawFileMapping.initRange[ValueParameterDescriptorImpl]

'start' @ [293:47] ==> value-parameter start: Int defined in org.jetbrains.kotlin.codegen.inline.RawFileMapping.initRange[ValueParameterDescriptorImpl]

'end' @ [293:54] ==> value-parameter end: Int defined in org.jetbrains.kotlin.codegen.inline.RawFileMapping.initRange[ValueParameterDescriptorImpl]

'start' @ [293:60] ==> value-parameter start: Int defined in org.jetbrains.kotlin.codegen.inline.RawFileMapping.initRange[ValueParameterDescriptorImpl]

'lastMappedWithNewIndex' @ [294:9] ==> private final var lastMappedWithNewIndex: Int defined in org.jetbrains.kotlin.codegen.inline.RawFileMapping[PropertyDescriptorImpl]

'end' @ [294:34] ==> value-parameter end: Int defined in org.jetbrains.kotlin.codegen.inline.RawFileMapping.initRange[ValueParameterDescriptorImpl]

'if (rangeMappings.isNotEmpty() && isLastMapped && couldFoldInRange(lastMappedWithNewIndex, source)) {
            rangeMapping = rangeMappings.last()
            rangeMapping.range += source - lastMappedWithNewIndex
            dest = rangeMapping.mapSourceToDest(source)
        }
        else {
            dest = currentIndex + 1
            rangeMapping = RangeMapping(source, dest, callSiteMarker = callSiteMarker)
            rangeMappings.add(rangeMapping)
        }' @ [300:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any, elseBranch: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any

'rangeMappings' @ [300:13] ==> private final val rangeMappings: ArrayList<RangeMapping> /* = ArrayList<RangeMapping> */ defined in org.jetbrains.kotlin.codegen.inline.RawFileMapping[PropertyDescriptorImpl]

'isNotEmpty' @ [300:27] ==> @InlineOnly public inline fun <T> Collection<RangeMapping>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> RangeMapping

'isLastMapped' @ [300:43] ==> value-parameter isLastMapped: Boolean defined in org.jetbrains.kotlin.codegen.inline.RawFileMapping.mapNewLineNumber[ValueParameterDescriptorImpl]

'couldFoldInRange' @ [300:59] ==> private final fun couldFoldInRange(first: Int, second: Int): Boolean defined in org.jetbrains.kotlin.codegen.inline.RawFileMapping[SimpleFunctionDescriptorImpl]

'lastMappedWithNewIndex' @ [300:76] ==> private final var lastMappedWithNewIndex: Int defined in org.jetbrains.kotlin.codegen.inline.RawFileMapping[PropertyDescriptorImpl]

'source' @ [300:100] ==> value-parameter source: Int defined in org.jetbrains.kotlin.codegen.inline.RawFileMapping.mapNewLineNumber[ValueParameterDescriptorImpl]

'rangeMapping' @ [301:13] ==> val rangeMapping: RangeMapping defined in org.jetbrains.kotlin.codegen.inline.RawFileMapping.mapNewLineNumber[LocalVariableDescriptor]

'rangeMappings' @ [301:28] ==> private final val rangeMappings: ArrayList<RangeMapping> /* = ArrayList<RangeMapping> */ defined in org.jetbrains.kotlin.codegen.inline.RawFileMapping[PropertyDescriptorImpl]

'last' @ [301:42] ==> public fun <T> List<RangeMapping>.last(): RangeMapping defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> RangeMapping

'rangeMapping' @ [302:13] ==> val rangeMapping: RangeMapping defined in org.jetbrains.kotlin.codegen.inline.RawFileMapping.mapNewLineNumber[LocalVariableDescriptor]

'range' @ [302:26] ==> public final var range: Int defined in org.jetbrains.kotlin.codegen.inline.RangeMapping[PropertyDescriptorImpl]

'source' @ [302:35] ==> value-parameter source: Int defined in org.jetbrains.kotlin.codegen.inline.RawFileMapping.mapNewLineNumber[ValueParameterDescriptorImpl]

'lastMappedWithNewIndex' @ [302:44] ==> private final var lastMappedWithNewIndex: Int defined in org.jetbrains.kotlin.codegen.inline.RawFileMapping[PropertyDescriptorImpl]

'dest' @ [303:13] ==> val dest: Int defined in org.jetbrains.kotlin.codegen.inline.RawFileMapping.mapNewLineNumber[LocalVariableDescriptor]

'rangeMapping' @ [303:20] ==> val rangeMapping: RangeMapping defined in org.jetbrains.kotlin.codegen.inline.RawFileMapping.mapNewLineNumber[LocalVariableDescriptor]

'mapSourceToDest' @ [303:33] ==> public final fun mapSourceToDest(sourceLine: Int): Int defined in org.jetbrains.kotlin.codegen.inline.RangeMapping[SimpleFunctionDescriptorImpl]

'source' @ [303:49] ==> value-parameter source: Int defined in org.jetbrains.kotlin.codegen.inline.RawFileMapping.mapNewLineNumber[ValueParameterDescriptorImpl]

'dest' @ [306:13] ==> val dest: Int defined in org.jetbrains.kotlin.codegen.inline.RawFileMapping.mapNewLineNumber[LocalVariableDescriptor]

'currentIndex' @ [306:20] ==> value-parameter currentIndex: Int defined in org.jetbrains.kotlin.codegen.inline.RawFileMapping.mapNewLineNumber[ValueParameterDescriptorImpl]

'rangeMapping' @ [307:13] ==> val rangeMapping: RangeMapping defined in org.jetbrains.kotlin.codegen.inline.RawFileMapping.mapNewLineNumber[LocalVariableDescriptor]

'RangeMapping' @ [307:28] ==> public constructor RangeMapping(source: Int, dest: Int, range: Int = ..., callSiteMarker: CallSiteMarker? = ...) defined in org.jetbrains.kotlin.codegen.inline.RangeMapping[ClassConstructorDescriptorImpl]

'source' @ [307:41] ==> value-parameter source: Int defined in org.jetbrains.kotlin.codegen.inline.RawFileMapping.mapNewLineNumber[ValueParameterDescriptorImpl]

'dest' @ [307:49] ==> val dest: Int defined in org.jetbrains.kotlin.codegen.inline.RawFileMapping.mapNewLineNumber[LocalVariableDescriptor]

'callSiteMarker' @ [307:72] ==> value-parameter callSiteMarker: CallSiteMarker? defined in org.jetbrains.kotlin.codegen.inline.RawFileMapping.mapNewLineNumber[ValueParameterDescriptorImpl]

'rangeMappings' @ [308:13] ==> private final val rangeMappings: ArrayList<RangeMapping> /* = ArrayList<RangeMapping> */ defined in org.jetbrains.kotlin.codegen.inline.RawFileMapping[PropertyDescriptorImpl]

'add' @ [308:27] ==> public open fun add(element: RangeMapping): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'rangeMapping' @ [308:31] ==> val rangeMapping: RangeMapping defined in org.jetbrains.kotlin.codegen.inline.RawFileMapping.mapNewLineNumber[LocalVariableDescriptor]

'lastMappedWithNewIndex' @ [311:9] ==> private final var lastMappedWithNewIndex: Int defined in org.jetbrains.kotlin.codegen.inline.RawFileMapping[PropertyDescriptorImpl]

'source' @ [311:34] ==> value-parameter source: Int defined in org.jetbrains.kotlin.codegen.inline.RawFileMapping.mapNewLineNumber[ValueParameterDescriptorImpl]

'dest' @ [312:16] ==> val dest: Int defined in org.jetbrains.kotlin.codegen.inline.RawFileMapping.mapNewLineNumber[LocalVariableDescriptor]

'RangeMapping' @ [316:28] ==> public constructor RangeMapping(source: Int, dest: Int, range: Int = ..., callSiteMarker: CallSiteMarker? = ...) defined in org.jetbrains.kotlin.codegen.inline.RangeMapping[ClassConstructorDescriptorImpl]

'source' @ [316:41] ==> value-parameter source: Int defined in org.jetbrains.kotlin.codegen.inline.RawFileMapping.mapNewInterval[ValueParameterDescriptorImpl]

'dest' @ [316:49] ==> value-parameter dest: Int defined in org.jetbrains.kotlin.codegen.inline.RawFileMapping.mapNewInterval[ValueParameterDescriptorImpl]

'range' @ [316:55] ==> value-parameter range: Int defined in org.jetbrains.kotlin.codegen.inline.RawFileMapping.mapNewInterval[ValueParameterDescriptorImpl]

'rangeMappings' @ [317:9] ==> private final val rangeMappings: ArrayList<RangeMapping> /* = ArrayList<RangeMapping> */ defined in org.jetbrains.kotlin.codegen.inline.RawFileMapping[PropertyDescriptorImpl]

'add' @ [317:23] ==> public open fun add(element: RangeMapping): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'rangeMapping' @ [317:27] ==> val rangeMapping: RangeMapping defined in org.jetbrains.kotlin.codegen.inline.RawFileMapping.mapNewInterval[LocalVariableDescriptor]

'second' @ [322:21] ==> value-parameter second: Int defined in org.jetbrains.kotlin.codegen.inline.RawFileMapping.couldFoldInRange[ValueParameterDescriptorImpl]

'first' @ [322:30] ==> value-parameter first: Int defined in org.jetbrains.kotlin.codegen.inline.RawFileMapping.couldFoldInRange[ValueParameterDescriptorImpl]

'delta' @ [323:16] ==> val delta: Int defined in org.jetbrains.kotlin.codegen.inline.RawFileMapping.couldFoldInRange[LocalVariableDescriptor]

'delta' @ [323:29] ==> val delta: Int defined in org.jetbrains.kotlin.codegen.inline.RawFileMapping.couldFoldInRange[LocalVariableDescriptor]

'arrayListOf' @ [328:24] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<RangeMapping> /* = ArrayList<RangeMapping> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> RangeMapping

'-' @ [329:14] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'lineMappings' @ [332:9] ==> public final val lineMappings: ArrayList<RangeMapping> /* = ArrayList<RangeMapping> */ defined in org.jetbrains.kotlin.codegen.inline.FileMapping[PropertyDescriptorImpl]

'add' @ [332:22] ==> public open fun add(element: RangeMapping): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'lineMapping' @ [332:26] ==> value-parameter lineMapping: RangeMapping defined in org.jetbrains.kotlin.codegen.inline.FileMapping.addRangeMapping[ValueParameterDescriptorImpl]

'lineMapping' @ [333:9] ==> value-parameter lineMapping: RangeMapping defined in org.jetbrains.kotlin.codegen.inline.FileMapping.addRangeMapping[ValueParameterDescriptorImpl]

'parent' @ [333:21] ==> public final var parent: FileMapping? defined in org.jetbrains.kotlin.codegen.inline.RangeMapping[PropertyDescriptorImpl]

'this' @ [333:30] ==> <this> defined in org.jetbrains.kotlin.codegen.inline.FileMapping[LazyClassReceiverParameterDescriptor]

'FileMapping' @ [336:19] ==> public constructor FileMapping(name: String, path: String) defined in org.jetbrains.kotlin.codegen.inline.FileMapping[ClassConstructorDescriptorImpl]

'addRangeMapping' @ [338:13] ==> public final fun addRangeMapping(lineMapping: RangeMapping): Unit defined in org.jetbrains.kotlin.codegen.inline.FileMapping.SKIP[SimpleFunctionDescriptorImpl]

'RangeMapping' @ [338:29] ==> public companion object defined in org.jetbrains.kotlin.codegen.inline.RangeMapping[FakeCallableDescriptorForObject]

'SKIP' @ [338:42] ==> public final val SKIP: RangeMapping defined in org.jetbrains.kotlin.codegen.inline.RangeMapping.Companion[PropertyDescriptorImpl]

'source' @ [346:24] ==> public final val source: Int defined in org.jetbrains.kotlin.codegen.inline.RangeMapping[PropertyDescriptorImpl]

'-' @ [346:34] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'dest' @ [346:40] ==> public final val dest: Int defined in org.jetbrains.kotlin.codegen.inline.RangeMapping[PropertyDescriptorImpl]

'-' @ [346:48] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'dest' @ [349:17] ==> public final val dest: Int defined in org.jetbrains.kotlin.codegen.inline.RangeMapping[PropertyDescriptorImpl]

'range' @ [349:24] ==> public final var range: Int defined in org.jetbrains.kotlin.codegen.inline.RangeMapping[PropertyDescriptorImpl]

'skip' @ [352:16] ==> private final val skip: Boolean defined in org.jetbrains.kotlin.codegen.inline.RangeMapping[PropertyDescriptorImpl]

'dest' @ [352:25] ==> public final val dest: Int defined in org.jetbrains.kotlin.codegen.inline.RangeMapping[PropertyDescriptorImpl]

'destLine' @ [352:33] ==> value-parameter destLine: Int defined in org.jetbrains.kotlin.codegen.inline.RangeMapping.contains[ValueParameterDescriptorImpl]

'destLine' @ [352:45] ==> value-parameter destLine: Int defined in org.jetbrains.kotlin.codegen.inline.RangeMapping.contains[ValueParameterDescriptorImpl]

'dest' @ [352:56] ==> public final val dest: Int defined in org.jetbrains.kotlin.codegen.inline.RangeMapping[PropertyDescriptorImpl]

'range' @ [352:63] ==> public final var range: Int defined in org.jetbrains.kotlin.codegen.inline.RangeMapping[PropertyDescriptorImpl]

'skip' @ [356:16] ==> private final val skip: Boolean defined in org.jetbrains.kotlin.codegen.inline.RangeMapping[PropertyDescriptorImpl]

'source' @ [356:25] ==> public final val source: Int defined in org.jetbrains.kotlin.codegen.inline.RangeMapping[PropertyDescriptorImpl]

'sourceLine' @ [356:35] ==> value-parameter sourceLine: Int defined in org.jetbrains.kotlin.codegen.inline.RangeMapping.hasMappingForSource[ValueParameterDescriptorImpl]

'sourceLine' @ [356:49] ==> value-parameter sourceLine: Int defined in org.jetbrains.kotlin.codegen.inline.RangeMapping.hasMappingForSource[ValueParameterDescriptorImpl]

'source' @ [356:62] ==> public final val source: Int defined in org.jetbrains.kotlin.codegen.inline.RangeMapping[PropertyDescriptorImpl]

'range' @ [356:71] ==> public final var range: Int defined in org.jetbrains.kotlin.codegen.inline.RangeMapping[PropertyDescriptorImpl]

'if (skip) -1 else source + (destLine - dest)' @ [360:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'skip' @ [360:20] ==> private final val skip: Boolean defined in org.jetbrains.kotlin.codegen.inline.RangeMapping[PropertyDescriptorImpl]

'-' @ [360:26] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'source' @ [360:34] ==> public final val source: Int defined in org.jetbrains.kotlin.codegen.inline.RangeMapping[PropertyDescriptorImpl]

'destLine' @ [360:44] ==> value-parameter destLine: Int defined in org.jetbrains.kotlin.codegen.inline.RangeMapping.mapDestToSource[ValueParameterDescriptorImpl]

'dest' @ [360:55] ==> public final val dest: Int defined in org.jetbrains.kotlin.codegen.inline.RangeMapping[PropertyDescriptorImpl]

'if (skip) -1 else dest + (sourceLine - source)' @ [364:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'skip' @ [364:20] ==> private final val skip: Boolean defined in org.jetbrains.kotlin.codegen.inline.RangeMapping[PropertyDescriptorImpl]

'-' @ [364:26] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'dest' @ [364:34] ==> public final val dest: Int defined in org.jetbrains.kotlin.codegen.inline.RangeMapping[PropertyDescriptorImpl]

'sourceLine' @ [364:42] ==> value-parameter sourceLine: Int defined in org.jetbrains.kotlin.codegen.inline.RangeMapping.mapSourceToDest[ValueParameterDescriptorImpl]

'source' @ [364:55] ==> public final val source: Int defined in org.jetbrains.kotlin.codegen.inline.RangeMapping[PropertyDescriptorImpl]

'o1' @ [369:17] ==> value-parameter o1: RangeMapping defined in org.jetbrains.kotlin.codegen.inline.RangeMapping.Comparator.compare[ValueParameterDescriptorImpl]

'o2' @ [369:23] ==> value-parameter o2: RangeMapping defined in org.jetbrains.kotlin.codegen.inline.RangeMapping.Comparator.compare[ValueParameterDescriptorImpl]

'o1' @ [371:23] ==> value-parameter o1: RangeMapping defined in org.jetbrains.kotlin.codegen.inline.RangeMapping.Comparator.compare[ValueParameterDescriptorImpl]

'dest' @ [371:26] ==> public final val dest: Int defined in org.jetbrains.kotlin.codegen.inline.RangeMapping[PropertyDescriptorImpl]

'o2' @ [371:33] ==> value-parameter o2: RangeMapping defined in org.jetbrains.kotlin.codegen.inline.RangeMapping.Comparator.compare[ValueParameterDescriptorImpl]

'dest' @ [371:36] ==> public final val dest: Int defined in org.jetbrains.kotlin.codegen.inline.RangeMapping[PropertyDescriptorImpl]

'if (res == 0) o1.range - o2.range else res' @ [372:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'res' @ [372:24] ==> val res: Int defined in org.jetbrains.kotlin.codegen.inline.RangeMapping.Comparator.compare[LocalVariableDescriptor]

'o1' @ [372:34] ==> value-parameter o1: RangeMapping defined in org.jetbrains.kotlin.codegen.inline.RangeMapping.Comparator.compare[ValueParameterDescriptorImpl]

'range' @ [372:37] ==> public final var range: Int defined in org.jetbrains.kotlin.codegen.inline.RangeMapping[PropertyDescriptorImpl]

'o2' @ [372:45] ==> value-parameter o2: RangeMapping defined in org.jetbrains.kotlin.codegen.inline.RangeMapping.Comparator.compare[ValueParameterDescriptorImpl]

'range' @ [372:48] ==> public final var range: Int defined in org.jetbrains.kotlin.codegen.inline.RangeMapping[PropertyDescriptorImpl]

'res' @ [372:59] ==> val res: Int defined in org.jetbrains.kotlin.codegen.inline.RangeMapping.Comparator.compare[LocalVariableDescriptor]

'RangeMapping' @ [377:20] ==> public constructor RangeMapping(source: Int, dest: Int, range: Int = ..., callSiteMarker: CallSiteMarker? = ...) defined in org.jetbrains.kotlin.codegen.inline.RangeMapping[ClassConstructorDescriptorImpl]

'-' @ [377:33] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'-' @ [377:37] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'this' @ [382:13] ==> <this> defined in org.jetbrains.kotlin.codegen.inline.toRange[ReceiverParameterDescriptorImpl]

'dest' @ [382:18] ==> public final val dest: Int defined in org.jetbrains.kotlin.codegen.inline.RangeMapping[PropertyDescriptorImpl]

'this' @ [382:24] ==> <this> defined in org.jetbrains.kotlin.codegen.inline.toRange[ReceiverParameterDescriptorImpl]

'maxDest' @ [382:29] ==> public final val maxDest: Int defined in org.jetbrains.kotlin.codegen.inline.RangeMapping[PropertyDescriptorImpl]

