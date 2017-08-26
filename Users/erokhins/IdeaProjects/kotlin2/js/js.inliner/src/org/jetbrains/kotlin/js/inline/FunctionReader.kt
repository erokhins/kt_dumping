'JS_IDENTIFIER_START' @ [47:36] ==> private val JS_IDENTIFIER_START: String defined in org.jetbrains.kotlin.js.inline in file FunctionReader.kt[PropertyDescriptorImpl]

'JS_IDENTIFIER_START' @ [48:30] ==> private val JS_IDENTIFIER_START: String defined in org.jetbrains.kotlin.js.inline in file FunctionReader.kt[PropertyDescriptorImpl]

'JS_IDENTIFIER_PART' @ [48:52] ==> private val JS_IDENTIFIER_PART: String defined in org.jetbrains.kotlin.js.inline in file FunctionReader.kt[PropertyDescriptorImpl]

'JS_IDENTIFIER' @ [49:41] ==> private val JS_IDENTIFIER: String defined in org.jetbrains.kotlin.js.inline in file FunctionReader.kt[PropertyDescriptorImpl]

'toRegex' @ [49:121] ==> @InlineOnly public inline fun String.toRegex(): Regex defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'toPattern' @ [49:131] ==> public final fun toPattern(): Pattern defined in kotlin.text.Regex[DeserializedSimpleFunctionDescriptor]

'lazy' @ [76:38] ==> public fun <T> lazy(initializer: () -> OffsetToSourceMapping): Lazy<OffsetToSourceMapping> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> OffsetToSourceMapping

'offsetToSourceMappingProvider' @ [76:43] ==> value-parameter offsetToSourceMappingProvider: () -> OffsetToSourceMapping defined in org.jetbrains.kotlin.js.inline.FunctionReader.ModuleInfo.<init>[ValueParameterDescriptorImpl]

'lazy' @ [79:37] ==> public fun <T> lazy(initializer: () -> (HashMultimap<(String..String?), (FunctionReader.ModuleInfo..FunctionReader.ModuleInfo?)>..HashMultimap<(String..String?), (FunctionReader.ModuleInfo..FunctionReader.ModuleInfo?)>?)): Lazy<(HashMultimap<(String..String?), (FunctionReader.ModuleInfo..FunctionReader.ModuleInfo?)>..HashMultimap<(String..String?), (FunctionReader.ModuleInfo..FunctionReader.ModuleInfo?)>?)> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.google.common.collect.HashMultimap<(kotlin.String..kotlin.String?), (org.jetbrains.kotlin.js.inline.FunctionReader.ModuleInfo..org.jetbrains.kotlin.js.inline.FunctionReader.ModuleInfo?)>..com.google.common.collect.HashMultimap<(kotlin.String..kotlin.String?), (org.jetbrains.kotlin.js.inline.FunctionReader.ModuleInfo..org.jetbrains.kotlin.js.inline.FunctionReader.ModuleInfo?)>?)

'create' @ [80:35] ==> public open fun <K : (Any..Any?), V : (Any..Any?)> create(): (HashMultimap<(String..String?), (FunctionReader.ModuleInfo..FunctionReader.ModuleInfo?)>..HashMultimap<(String..String?), (FunctionReader.ModuleInfo..FunctionReader.ModuleInfo?)>?) defined in com.google.common.collect.HashMultimap[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> String
    <V : (Any..Any?)> -> ModuleInfo

'JsLibraryUtils' @ [82:9] ==> public object JsLibraryUtils defined in org.jetbrains.kotlin.utils[FakeCallableDescriptorForObject]

'traverseJsLibraries' @ [82:24] ==> @JvmStatic public final fun traverseJsLibraries(libs: List<File>, action: (JsLibrary) -> Unit): Unit defined in org.jetbrains.kotlin.utils.JsLibraryUtils[DeserializedSimpleFunctionDescriptor]

'config' @ [82:44] ==> private final val config: JsConfig defined in org.jetbrains.kotlin.js.inline.FunctionReader[PropertyDescriptorImpl]

'libraries' @ [82:51] ==> public final val JsConfig.libraries: (MutableList<(String..String?)>..List<(String..String?)>)[MyPropertyDescriptor]

'map' @ [82:61] ==> public inline fun <T, R> Iterable<(String..String?)>.map(transform: ((String..String?)) -> File): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)
    <R> -> File

'component1' @ [82:77] ==> public final operator fun component1(): String defined in org.jetbrains.kotlin.utils.JsLibrary[DeserializedSimpleFunctionDescriptor]

'component2' @ [82:86] ==> public final operator fun component2(): String defined in org.jetbrains.kotlin.utils.JsLibrary[DeserializedSimpleFunctionDescriptor]

'component3' @ [82:92] ==> public final operator fun component3(): String? defined in org.jetbrains.kotlin.utils.JsLibrary[DeserializedSimpleFunctionDescriptor]

'content' @ [86:29] ==> val content: String defined in org.jetbrains.kotlin.js.inline.FunctionReader.moduleNameToInfo.<anonymous>.<anonymous>[LocalVariableDescriptor]

'indexOf' @ [86:37] ==> public fun CharSequence.indexOf(string: String, startIndex: Int = ..., ignoreCase: Boolean = ...): Int defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'DEFINE_MODULE_FIND_PATTERN' @ [86:45] ==> private val DEFINE_MODULE_FIND_PATTERN: String defined in org.jetbrains.kotlin.js.inline in file FunctionReader.kt[PropertyDescriptorImpl]

'current' @ [86:73] ==> var current: Int defined in org.jetbrains.kotlin.js.inline.FunctionReader.moduleNameToInfo.<anonymous>.<anonymous>[LocalVariableDescriptor]

'index' @ [87:21] ==> var index: Int defined in org.jetbrains.kotlin.js.inline.FunctionReader.moduleNameToInfo.<anonymous>.<anonymous>[LocalVariableDescriptor]

'current' @ [89:17] ==> var current: Int defined in org.jetbrains.kotlin.js.inline.FunctionReader.moduleNameToInfo.<anonymous>.<anonymous>[LocalVariableDescriptor]

'index' @ [89:27] ==> var index: Int defined in org.jetbrains.kotlin.js.inline.FunctionReader.moduleNameToInfo.<anonymous>.<anonymous>[LocalVariableDescriptor]

'index' @ [90:17] ==> var index: Int defined in org.jetbrains.kotlin.js.inline.FunctionReader.moduleNameToInfo.<anonymous>.<anonymous>[LocalVariableDescriptor]

'rewindToIdentifierStart' @ [90:25] ==> private final fun rewindToIdentifierStart(text: String, index: Int): Int defined in org.jetbrains.kotlin.js.inline.FunctionReader[SimpleFunctionDescriptorImpl]

'content' @ [90:49] ==> val content: String defined in org.jetbrains.kotlin.js.inline.FunctionReader.moduleNameToInfo.<anonymous>.<anonymous>[LocalVariableDescriptor]

'index' @ [90:58] ==> var index: Int defined in org.jetbrains.kotlin.js.inline.FunctionReader.moduleNameToInfo.<anonymous>.<anonymous>[LocalVariableDescriptor]

'DEFINE_MODULE_PATTERN' @ [91:38] ==> private val DEFINE_MODULE_PATTERN: Pattern defined in org.jetbrains.kotlin.js.inline in file FunctionReader.kt[PropertyDescriptorImpl]

'matcher' @ [91:60] ==> public open fun matcher(p0: (CharSequence..CharSequence?)): (Matcher..Matcher?) defined in java.util.regex.Pattern[JavaMethodDescriptor]

'offset' @ [91:68] ==> private final fun offset(text: String, offset: Int): <no name provided> defined in org.jetbrains.kotlin.js.inline.FunctionReader[SimpleFunctionDescriptorImpl]

'content' @ [91:75] ==> val content: String defined in org.jetbrains.kotlin.js.inline.FunctionReader.moduleNameToInfo.<anonymous>.<anonymous>[LocalVariableDescriptor]

'index' @ [91:84] ==> var index: Int defined in org.jetbrains.kotlin.js.inline.FunctionReader.moduleNameToInfo.<anonymous>.<anonymous>[LocalVariableDescriptor]

'!' @ [92:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'preciseMatcher' @ [92:22] ==> val preciseMatcher: (Matcher..Matcher?) defined in org.jetbrains.kotlin.js.inline.FunctionReader.moduleNameToInfo.<anonymous>.<anonymous>[LocalVariableDescriptor]

'lookingAt' @ [92:37] ==> public open fun lookingAt(): Boolean defined in java.util.regex.Matcher[JavaMethodDescriptor]

'preciseMatcher' @ [94:34] ==> val preciseMatcher: (Matcher..Matcher?) defined in org.jetbrains.kotlin.js.inline.FunctionReader.moduleNameToInfo.<anonymous>.<anonymous>[LocalVariableDescriptor]

'group' @ [94:49] ==> public open fun group(p0: Int): (String..String?) defined in java.util.regex.Matcher[JavaMethodDescriptor]

'preciseMatcher' @ [95:38] ==> val preciseMatcher: (Matcher..Matcher?) defined in org.jetbrains.kotlin.js.inline.FunctionReader.moduleNameToInfo.<anonymous>.<anonymous>[LocalVariableDescriptor]

'group' @ [95:53] ==> public open fun group(p0: Int): (String..String?) defined in java.util.regex.Matcher[JavaMethodDescriptor]

'preciseMatcher' @ [96:38] ==> val preciseMatcher: (Matcher..Matcher?) defined in org.jetbrains.kotlin.js.inline.FunctionReader.moduleNameToInfo.<anonymous>.<anonymous>[LocalVariableDescriptor]

'group' @ [96:53] ==> public open fun group(p0: Int): (String..String?) defined in java.util.regex.Matcher[JavaMethodDescriptor]

'sourceMapContent' @ [98:33] ==> val sourceMapContent: String? defined in org.jetbrains.kotlin.js.inline.FunctionReader.moduleNameToInfo.<anonymous>.<anonymous>[LocalVariableDescriptor]

'let' @ [98:51] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> SourceMap?): SourceMap? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> SourceMap?

'SourceMapParser' @ [99:43] ==> public object SourceMapParser defined in org.jetbrains.kotlin.js.parser.sourcemaps[FakeCallableDescriptorForObject]

'parse' @ [99:59] ==> public final fun parse(reader: Reader): SourceMapParseResult defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapParser[DeserializedSimpleFunctionDescriptor]

'StringReader' @ [99:65] ==> public constructor StringReader(p0: (String..String?)) defined in java.io.StringReader[JavaClassConstructorDescriptor]

'it' @ [99:78] ==> value-parameter it: String defined in org.jetbrains.kotlin.js.inline.FunctionReader.moduleNameToInfo.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'when (sourceMapResult) {
                        is SourceMapSuccess -> sourceMapResult.value
                        is SourceMapError -> {
                            reporter.warning("Error parsing source map file for $path: ${sourceMapResult.message}")
                            null
                        }
                    }' @ [100:21] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: SourceMap?, entry1: SourceMap?): SourceMap?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> SourceMap?

'sourceMapResult' @ [100:27] ==> val sourceMapResult: SourceMapParseResult defined in org.jetbrains.kotlin.js.inline.FunctionReader.moduleNameToInfo.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'sourceMapResult' @ [101:48] ==> val sourceMapResult: SourceMapParseResult defined in org.jetbrains.kotlin.js.inline.FunctionReader.moduleNameToInfo.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'value' @ [101:64] ==> public final val value: SourceMap defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapSuccess[DeserializedPropertyDescriptor]

'reporter' @ [103:29] ==> private final val reporter: JsConfig.Reporter defined in org.jetbrains.kotlin.js.inline.FunctionReader[PropertyDescriptorImpl]

'warning' @ [103:38] ==> public open fun warning(@NotNull p0: String): Unit defined in org.jetbrains.kotlin.js.config.JsConfig.Reporter[JavaMethodDescriptor]

'path' @ [103:82] ==> val path: String defined in org.jetbrains.kotlin.js.inline.FunctionReader.moduleNameToInfo.<anonymous>.<anonymous>[LocalVariableDescriptor]

'sourceMapResult' @ [103:90] ==> val sourceMapResult: SourceMapParseResult defined in org.jetbrains.kotlin.js.inline.FunctionReader.moduleNameToInfo.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'message' @ [103:106] ==> public final val message: String defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapError[DeserializedPropertyDescriptor]

'ModuleInfo' @ [109:34] ==> public constructor ModuleInfo(filePath: String, fileContent: String, moduleVariable: String, kotlinVariable: String, offsetToSourceMappingProvider: () -> OffsetToSourceMapping, sourceMap: SourceMap?) defined in org.jetbrains.kotlin.js.inline.FunctionReader.ModuleInfo[ClassConstructorDescriptorImpl]

'path' @ [110:36] ==> val path: String defined in org.jetbrains.kotlin.js.inline.FunctionReader.moduleNameToInfo.<anonymous>.<anonymous>[LocalVariableDescriptor]

'content' @ [111:39] ==> val content: String defined in org.jetbrains.kotlin.js.inline.FunctionReader.moduleNameToInfo.<anonymous>.<anonymous>[LocalVariableDescriptor]

'moduleVariable' @ [112:42] ==> val moduleVariable: (String..String?) defined in org.jetbrains.kotlin.js.inline.FunctionReader.moduleNameToInfo.<anonymous>.<anonymous>[LocalVariableDescriptor]

'kotlinVariable' @ [113:42] ==> val kotlinVariable: (String..String?) defined in org.jetbrains.kotlin.js.inline.FunctionReader.moduleNameToInfo.<anonymous>.<anonymous>[LocalVariableDescriptor]

'OffsetToSourceMapping' @ [114:59] ==> public constructor OffsetToSourceMapping(text: String) defined in org.jetbrains.kotlin.js.parser.OffsetToSourceMapping[DeserializedClassConstructorDescriptor]

'content' @ [114:81] ==> val content: String defined in org.jetbrains.kotlin.js.inline.FunctionReader.moduleNameToInfo.<anonymous>.<anonymous>[LocalVariableDescriptor]

'sourceMap' @ [115:37] ==> val sourceMap: SourceMap? defined in org.jetbrains.kotlin.js.inline.FunctionReader.moduleNameToInfo.<anonymous>.<anonymous>[LocalVariableDescriptor]

'result' @ [118:17] ==> val result: (HashMultimap<(String..String?), (FunctionReader.ModuleInfo..FunctionReader.ModuleInfo?)>..HashMultimap<(String..String?), (FunctionReader.ModuleInfo..FunctionReader.ModuleInfo?)>?) defined in org.jetbrains.kotlin.js.inline.FunctionReader.moduleNameToInfo.<anonymous>[LocalVariableDescriptor]

'put' @ [118:24] ==> @CanIgnoreReturnValue public open fun put(@Nullable p0: String?, @Nullable p1: FunctionReader.ModuleInfo?): Boolean defined in com.google.common.collect.HashMultimap[JavaMethodDescriptor]

'moduleName' @ [118:28] ==> val moduleName: (String..String?) defined in org.jetbrains.kotlin.js.inline.FunctionReader.moduleNameToInfo.<anonymous>.<anonymous>[LocalVariableDescriptor]

'moduleInfo' @ [118:40] ==> val moduleInfo: FunctionReader.ModuleInfo defined in org.jetbrains.kotlin.js.inline.FunctionReader.moduleNameToInfo.<anonymous>.<anonymous>[LocalVariableDescriptor]

'result' @ [122:9] ==> val result: (HashMultimap<(String..String?), (FunctionReader.ModuleInfo..FunctionReader.ModuleInfo?)>..HashMultimap<(String..String?), (FunctionReader.ModuleInfo..FunctionReader.ModuleInfo?)>?) defined in org.jetbrains.kotlin.js.inline.FunctionReader.moduleNameToInfo.<anonymous>[LocalVariableDescriptor]

'moduleNameMap' @ [128:9] ==> private final val moduleNameMap: Map<String, JsExpression> defined in org.jetbrains.kotlin.js.inline.FunctionReader[PropertyDescriptorImpl]

'buildModuleNameMap' @ [128:25] ==> private final fun buildModuleNameMap(fragments: List<JsProgramFragment>): Map<String, JsExpression> defined in org.jetbrains.kotlin.js.inline.FunctionReader[SimpleFunctionDescriptorImpl]

'fragments' @ [128:44] ==> value-parameter fragments: List<JsProgramFragment> defined in org.jetbrains.kotlin.js.inline.FunctionReader.<init>[ValueParameterDescriptorImpl]

'fragments' @ [135:16] ==> value-parameter fragments: List<JsProgramFragment> defined in org.jetbrains.kotlin.js.inline.FunctionReader.buildModuleNameMap[ValueParameterDescriptorImpl]

'flatMap' @ [135:26] ==> public inline fun <T, R> Iterable<JsProgramFragment>.flatMap(transform: (JsProgramFragment) -> Iterable<MutableMap.MutableEntry<(String..String?), (JsExpression..JsExpression?)>>): List<MutableMap.MutableEntry<(String..String?), (JsExpression..JsExpression?)>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsProgramFragment
    <R> -> MutableEntry<(kotlin.String..kotlin.String?), (org.jetbrains.kotlin.js.backend.ast.JsExpression..org.jetbrains.kotlin.js.backend.ast.JsExpression?)>

'it' @ [135:36] ==> value-parameter it: JsProgramFragment defined in org.jetbrains.kotlin.js.inline.FunctionReader.buildModuleNameMap.<anonymous>[ValueParameterDescriptorImpl]

'inlineModuleMap' @ [135:39] ==> public final val JsProgramFragment.inlineModuleMap: (MutableMap<(String..String?), (JsExpression..JsExpression?)>..Map<(String..String?), (JsExpression..JsExpression?)>)[MyPropertyDescriptor]

'entries' @ [135:55] ==> public abstract val entries: MutableSet<MutableMap.MutableEntry<(String..String?), (JsExpression..JsExpression?)>> defined in kotlin.collections.MutableMap[DeserializedPropertyDescriptor]

'associate' @ [135:65] ==> public inline fun <T, K, V> Iterable<MutableMap.MutableEntry<(String..String?), (JsExpression..JsExpression?)>>.associate(transform: (MutableMap.MutableEntry<(String..String?), (JsExpression..JsExpression?)>) -> Pair<String, (JsExpression..JsExpression?)>): Map<String, (JsExpression..JsExpression?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MutableEntry<(kotlin.String..kotlin.String?), (org.jetbrains.kotlin.js.backend.ast.JsExpression..org.jetbrains.kotlin.js.backend.ast.JsExpression?)>
    <K> -> String
    <V> -> (org.jetbrains.kotlin.js.backend.ast.JsExpression..org.jetbrains.kotlin.js.backend.ast.JsExpression?)

'component1' @ [135:78] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<(String..String?), (JsExpression..JsExpression?)>.component1(): (String..String?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (kotlin.String..kotlin.String?)
    <V> -> (org.jetbrains.kotlin.js.backend.ast.JsExpression..org.jetbrains.kotlin.js.backend.ast.JsExpression?)

'component2' @ [135:81] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<(String..String?), (JsExpression..JsExpression?)>.component2(): (JsExpression..JsExpression?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (kotlin.String..kotlin.String?)
    <V> -> (org.jetbrains.kotlin.js.backend.ast.JsExpression..org.jetbrains.kotlin.js.backend.ast.JsExpression?)

'k' @ [135:87] ==> val k: (String..String?) defined in org.jetbrains.kotlin.js.inline.FunctionReader.buildModuleNameMap.<anonymous>[LocalVariableDescriptor]

'v' @ [135:92] ==> val v: (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.inline.FunctionReader.buildModuleNameMap.<anonymous>[LocalVariableDescriptor]

'index' @ [139:22] ==> value-parameter index: Int defined in org.jetbrains.kotlin.js.inline.FunctionReader.rewindToIdentifierStart[ValueParameterDescriptorImpl]

'result' @ [140:16] ==> var result: Int defined in org.jetbrains.kotlin.js.inline.FunctionReader.rewindToIdentifierStart[LocalVariableDescriptor]

'isJavaIdentifierPart' @ [140:40] ==> public open fun isJavaIdentifierPart(p0: Char): Boolean defined in java.lang.Character[JavaMethodDescriptor]

'text' @ [140:61] ==> value-parameter text: String defined in org.jetbrains.kotlin.js.inline.FunctionReader.rewindToIdentifierStart[ValueParameterDescriptorImpl]

'result' @ [140:66] ==> var result: Int defined in org.jetbrains.kotlin.js.inline.FunctionReader.rewindToIdentifierStart[LocalVariableDescriptor]

'--' @ [141:13] ==> public final operator fun dec(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'result' @ [141:15] ==> var result: Int defined in org.jetbrains.kotlin.js.inline.FunctionReader.rewindToIdentifierStart[LocalVariableDescriptor]

'result' @ [143:16] ==> var result: Int defined in org.jetbrains.kotlin.js.inline.FunctionReader.rewindToIdentifierStart[LocalVariableDescriptor]

'text' @ [148:21] ==> value-parameter text: String defined in org.jetbrains.kotlin.js.inline.FunctionReader.offset[ValueParameterDescriptorImpl]

'length' @ [148:26] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'offset' @ [148:35] ==> value-parameter offset: Int defined in org.jetbrains.kotlin.js.inline.FunctionReader.offset[ValueParameterDescriptorImpl]

'text' @ [150:40] ==> value-parameter text: String defined in org.jetbrains.kotlin.js.inline.FunctionReader.offset[ValueParameterDescriptorImpl]

'index' @ [150:45] ==> value-parameter index: Int defined in org.jetbrains.kotlin.js.inline.FunctionReader.offset.<no name provided>.get[ValueParameterDescriptorImpl]

'offset' @ [150:53] ==> value-parameter offset: Int defined in org.jetbrains.kotlin.js.inline.FunctionReader.offset[ValueParameterDescriptorImpl]

'text' @ [152:68] ==> value-parameter text: String defined in org.jetbrains.kotlin.js.inline.FunctionReader.offset[ValueParameterDescriptorImpl]

'subSequence' @ [152:73] ==> public open fun subSequence(startIndex: Int, endIndex: Int): CharSequence defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'startIndex' @ [152:85] ==> value-parameter startIndex: Int defined in org.jetbrains.kotlin.js.inline.FunctionReader.offset.<no name provided>.subSequence[ValueParameterDescriptorImpl]

'offset' @ [152:98] ==> value-parameter offset: Int defined in org.jetbrains.kotlin.js.inline.FunctionReader.offset[ValueParameterDescriptorImpl]

'endIndex' @ [152:106] ==> value-parameter endIndex: Int defined in org.jetbrains.kotlin.js.inline.FunctionReader.offset.<no name provided>.subSequence[ValueParameterDescriptorImpl]

'offset' @ [152:117] ==> value-parameter offset: Int defined in org.jetbrains.kotlin.js.inline.FunctionReader.offset[ValueParameterDescriptorImpl]

'text' @ [154:35] ==> value-parameter text: String defined in org.jetbrains.kotlin.js.inline.FunctionReader.offset[ValueParameterDescriptorImpl]

'substring' @ [154:40] ==> @InlineOnly public inline fun String.substring(startIndex: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'offset' @ [154:50] ==> value-parameter offset: Int defined in org.jetbrains.kotlin.js.inline.FunctionReader.offset[ValueParameterDescriptorImpl]

'SLRUCache<CallableDescriptor, JsFunction>' @ [157:42] ==> protected/*protected and package*/ constructor SLRUCache<K : (Any..Any?), V : (Any..Any?)>(p0: Int, p1: Int) defined in com.intellij.util.containers.SLRUCache[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> CallableDescriptor
    <V : (Any..Any?)> -> JsFunction

'readFunction' @ [159:17] ==> private final fun readFunction(descriptor: CallableDescriptor): JsFunction? defined in org.jetbrains.kotlin.js.inline.FunctionReader[SimpleFunctionDescriptorImpl]

'descriptor' @ [159:30] ==> value-parameter descriptor: CallableDescriptor defined in org.jetbrains.kotlin.js.inline.FunctionReader.functionCache.<no name provided>.createValue[ValueParameterDescriptorImpl]

'sure' @ [159:42] ==> public inline fun <T : Any> JsFunction?.sure(message: () -> String): JsFunction defined in org.jetbrains.kotlin.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> JsFunction

'descriptor' @ [159:76] ==> value-parameter descriptor: CallableDescriptor defined in org.jetbrains.kotlin.js.inline.FunctionReader.functionCache.<no name provided>.createValue[ValueParameterDescriptorImpl]

'getModuleName' @ [163:26] ==> @NotNull public open fun getModuleName(@NotNull descriptor: DeclarationDescriptor): String defined in org.jetbrains.kotlin.js.translate.utils.JsDescriptorUtils[JavaMethodDescriptor]

'descriptor' @ [163:40] ==> value-parameter descriptor: CallableDescriptor defined in org.jetbrains.kotlin.js.inline.FunctionReader.contains[ValueParameterDescriptorImpl]

'config' @ [164:33] ==> private final val config: JsConfig defined in org.jetbrains.kotlin.js.inline.FunctionReader[PropertyDescriptorImpl]

'moduleId' @ [164:40] ==> public final val JsConfig.moduleId: String[MyPropertyDescriptor]

'currentModuleName' @ [165:16] ==> val currentModuleName: String defined in org.jetbrains.kotlin.js.inline.FunctionReader.contains[LocalVariableDescriptor]

'moduleName' @ [165:37] ==> val moduleName: String defined in org.jetbrains.kotlin.js.inline.FunctionReader.contains[LocalVariableDescriptor]

'moduleName' @ [165:51] ==> val moduleName: String defined in org.jetbrains.kotlin.js.inline.FunctionReader.contains[LocalVariableDescriptor]

'moduleNameToInfo' @ [165:65] ==> private final val moduleNameToInfo: (HashMultimap<(String..String?), (FunctionReader.ModuleInfo..FunctionReader.ModuleInfo?)>..HashMultimap<(String..String?), (FunctionReader.ModuleInfo..FunctionReader.ModuleInfo?)>?) defined in org.jetbrains.kotlin.js.inline.FunctionReader[PropertyDescriptorImpl]

'keys' @ [165:82] ==> public open fun keys(): (Multiset<(String..String?)>..Multiset<(String..String?)>?) defined in com.google.common.collect.HashMultimap[JavaMethodDescriptor]

'functionCache' @ [168:68] ==> private final val functionCache: <no name provided> defined in org.jetbrains.kotlin.js.inline.FunctionReader[PropertyDescriptorImpl]

'get' @ [168:82] ==> @NotNull public open fun get(p0: (CallableDescriptor..CallableDescriptor?)): JsFunction defined in org.jetbrains.kotlin.js.inline.FunctionReader.functionCache.<no name provided>[JavaMethodDescriptor]

'descriptor' @ [168:86] ==> value-parameter descriptor: CallableDescriptor defined in org.jetbrains.kotlin.js.inline.FunctionReader.get[ValueParameterDescriptorImpl]

'descriptor' @ [171:13] ==> value-parameter descriptor: CallableDescriptor defined in org.jetbrains.kotlin.js.inline.FunctionReader.readFunction[ValueParameterDescriptorImpl]

'this' @ [171:28] ==> <this> defined in org.jetbrains.kotlin.js.inline.FunctionReader[LazyClassReceiverParameterDescriptor]

'getModuleName' @ [173:26] ==> @NotNull public open fun getModuleName(@NotNull descriptor: DeclarationDescriptor): String defined in org.jetbrains.kotlin.js.translate.utils.JsDescriptorUtils[JavaMethodDescriptor]

'descriptor' @ [173:40] ==> value-parameter descriptor: CallableDescriptor defined in org.jetbrains.kotlin.js.inline.FunctionReader.readFunction[ValueParameterDescriptorImpl]

'moduleNameToInfo' @ [175:22] ==> private final val moduleNameToInfo: (HashMultimap<(String..String?), (FunctionReader.ModuleInfo..FunctionReader.ModuleInfo?)>..HashMultimap<(String..String?), (FunctionReader.ModuleInfo..FunctionReader.ModuleInfo?)>?) defined in org.jetbrains.kotlin.js.inline.FunctionReader[PropertyDescriptorImpl]

'moduleName' @ [175:39] ==> val moduleName: String defined in org.jetbrains.kotlin.js.inline.FunctionReader.readFunction[LocalVariableDescriptor]

'readFunctionFromSource' @ [176:28] ==> private final fun readFunctionFromSource(descriptor: CallableDescriptor, info: FunctionReader.ModuleInfo): JsFunction? defined in org.jetbrains.kotlin.js.inline.FunctionReader[SimpleFunctionDescriptorImpl]

'descriptor' @ [176:51] ==> value-parameter descriptor: CallableDescriptor defined in org.jetbrains.kotlin.js.inline.FunctionReader.readFunction[ValueParameterDescriptorImpl]

'info' @ [176:63] ==> val info: (FunctionReader.ModuleInfo..FunctionReader.ModuleInfo?) defined in org.jetbrains.kotlin.js.inline.FunctionReader.readFunction[LocalVariableDescriptor]

'function' @ [177:17] ==> val function: JsFunction? defined in org.jetbrains.kotlin.js.inline.FunctionReader.readFunction[LocalVariableDescriptor]

'function' @ [177:42] ==> val function: JsFunction? defined in org.jetbrains.kotlin.js.inline.FunctionReader.readFunction[LocalVariableDescriptor]

'info' @ [184:22] ==> value-parameter info: FunctionReader.ModuleInfo defined in org.jetbrains.kotlin.js.inline.FunctionReader.readFunctionFromSource[ValueParameterDescriptorImpl]

'fileContent' @ [184:27] ==> public final val fileContent: String defined in org.jetbrains.kotlin.js.inline.FunctionReader.ModuleInfo[PropertyDescriptorImpl]

'getFunctionTag' @ [185:25] ==> @NotNull public open fun getFunctionTag(@NotNull functionDescriptor: CallableDescriptor, @NotNull config: JsConfig): String defined in org.jetbrains.kotlin.js.translate.context.Namer[JavaMethodDescriptor]

'descriptor' @ [185:40] ==> value-parameter descriptor: CallableDescriptor defined in org.jetbrains.kotlin.js.inline.FunctionReader.readFunctionFromSource[ValueParameterDescriptorImpl]

'config' @ [185:52] ==> private final val config: JsConfig defined in org.jetbrains.kotlin.js.inline.FunctionReader[PropertyDescriptorImpl]

'source' @ [186:21] ==> val source: String defined in org.jetbrains.kotlin.js.inline.FunctionReader.readFunctionFromSource[LocalVariableDescriptor]

'indexOf' @ [186:28] ==> public fun CharSequence.indexOf(string: String, startIndex: Int = ..., ignoreCase: Boolean = ...): Int defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'tag' @ [186:36] ==> val tag: String defined in org.jetbrains.kotlin.js.inline.FunctionReader.readFunctionFromSource[LocalVariableDescriptor]

'index' @ [187:13] ==> val index: Int defined in org.jetbrains.kotlin.js.inline.FunctionReader.readFunctionFromSource[LocalVariableDescriptor]

'index' @ [190:22] ==> val index: Int defined in org.jetbrains.kotlin.js.inline.FunctionReader.readFunctionFromSource[LocalVariableDescriptor]

'tag' @ [190:30] ==> val tag: String defined in org.jetbrains.kotlin.js.inline.FunctionReader.readFunctionFromSource[LocalVariableDescriptor]

'length' @ [190:34] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'offset' @ [191:16] ==> var offset: Int defined in org.jetbrains.kotlin.js.inline.FunctionReader.readFunctionFromSource[LocalVariableDescriptor]

'source' @ [191:25] ==> val source: String defined in org.jetbrains.kotlin.js.inline.FunctionReader.readFunctionFromSource[LocalVariableDescriptor]

'length' @ [191:32] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'source' @ [191:42] ==> val source: String defined in org.jetbrains.kotlin.js.inline.FunctionReader.readFunctionFromSource[LocalVariableDescriptor]

'offset' @ [191:49] ==> var offset: Int defined in org.jetbrains.kotlin.js.inline.FunctionReader.readFunctionFromSource[LocalVariableDescriptor]

'isWhitespaceOrComma' @ [191:57] ==> private val Char.isWhitespaceOrComma: Boolean defined in org.jetbrains.kotlin.js.inline in file FunctionReader.kt[PropertyDescriptorImpl]

'offset' @ [192:13] ==> var offset: Int defined in org.jetbrains.kotlin.js.inline.FunctionReader.readFunctionFromSource[LocalVariableDescriptor]

'info' @ [195:24] ==> value-parameter info: FunctionReader.ModuleInfo defined in org.jetbrains.kotlin.js.inline.FunctionReader.readFunctionFromSource[ValueParameterDescriptorImpl]

'offsetToSourceMapping' @ [195:29] ==> public final val offsetToSourceMapping: OffsetToSourceMapping defined in org.jetbrains.kotlin.js.inline.FunctionReader.ModuleInfo[PropertyDescriptorImpl]

'offset' @ [195:51] ==> var offset: Int defined in org.jetbrains.kotlin.js.inline.FunctionReader.readFunctionFromSource[LocalVariableDescriptor]

'parseFunction' @ [196:24] ==> public fun parseFunction(code: String, fileName: String, position: CodePosition, offset: Int, reporter: ErrorReporter, scope: JsScope): JsFunction defined in org.jetbrains.kotlin.js.parser[DeserializedSimpleFunctionDescriptor]

'source' @ [196:38] ==> val source: String defined in org.jetbrains.kotlin.js.inline.FunctionReader.readFunctionFromSource[LocalVariableDescriptor]

'info' @ [196:46] ==> value-parameter info: FunctionReader.ModuleInfo defined in org.jetbrains.kotlin.js.inline.FunctionReader.readFunctionFromSource[ValueParameterDescriptorImpl]

'filePath' @ [196:51] ==> public final val filePath: String defined in org.jetbrains.kotlin.js.inline.FunctionReader.ModuleInfo[PropertyDescriptorImpl]

'position' @ [196:61] ==> val position: CodePosition defined in org.jetbrains.kotlin.js.inline.FunctionReader.readFunctionFromSource[LocalVariableDescriptor]

'offset' @ [196:71] ==> var offset: Int defined in org.jetbrains.kotlin.js.inline.FunctionReader.readFunctionFromSource[LocalVariableDescriptor]

'ThrowExceptionOnErrorReporter' @ [196:79] ==> public object ThrowExceptionOnErrorReporter : ErrorReporter defined in com.google.gwt.dev.js[FakeCallableDescriptorForObject]

'JsRootScope' @ [196:110] ==> public constructor JsRootScope(p0: (JsProgram..JsProgram?)) defined in org.jetbrains.kotlin.js.backend.ast.JsRootScope[JavaClassConstructorDescriptor]

'JsProgram' @ [196:122] ==> public constructor JsProgram() defined in org.jetbrains.kotlin.js.backend.ast.JsProgram[JavaClassConstructorDescriptor]

'moduleNameMap' @ [197:31] ==> private final val moduleNameMap: Map<String, JsExpression> defined in org.jetbrains.kotlin.js.inline.FunctionReader[PropertyDescriptorImpl]

'tag' @ [197:45] ==> val tag: String defined in org.jetbrains.kotlin.js.inline.FunctionReader.readFunctionFromSource[LocalVariableDescriptor]

'deepCopy' @ [197:51] ==> @NotNull public abstract fun deepCopy(): JsExpression defined in org.jetbrains.kotlin.js.backend.ast.JsExpression[JavaMethodDescriptor]

'currentModuleName' @ [197:65] ==> private final val currentModuleName: JsName defined in org.jetbrains.kotlin.js.inline.FunctionReader[PropertyDescriptorImpl]

'makeRef' @ [197:83] ==> @NotNull public open fun makeRef(): JsNameRef defined in org.jetbrains.kotlin.js.backend.ast.JsName[JavaMethodDescriptor]

'info' @ [199:25] ==> value-parameter info: FunctionReader.ModuleInfo defined in org.jetbrains.kotlin.js.inline.FunctionReader.readFunctionFromSource[ValueParameterDescriptorImpl]

'sourceMap' @ [199:30] ==> public final val sourceMap: SourceMap? defined in org.jetbrains.kotlin.js.inline.FunctionReader.ModuleInfo[PropertyDescriptorImpl]

'sourceMap' @ [200:13] ==> val sourceMap: SourceMap? defined in org.jetbrains.kotlin.js.inline.FunctionReader.readFunctionFromSource[LocalVariableDescriptor]

'SourceMapLocationRemapper' @ [201:28] ==> public constructor SourceMapLocationRemapper(sourceMap: SourceMap) defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapLocationRemapper[DeserializedClassConstructorDescriptor]

'sourceMap' @ [201:54] ==> val sourceMap: SourceMap? defined in org.jetbrains.kotlin.js.inline.FunctionReader.readFunctionFromSource[LocalVariableDescriptor]

'remapper' @ [202:13] ==> val remapper: SourceMapLocationRemapper defined in org.jetbrains.kotlin.js.inline.FunctionReader.readFunctionFromSource[LocalVariableDescriptor]

'remap' @ [202:22] ==> public final fun remap(node: JsNode): Unit defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapLocationRemapper[DeserializedSimpleFunctionDescriptor]

'function' @ [202:28] ==> val function: JsFunction defined in org.jetbrains.kotlin.js.inline.FunctionReader.readFunctionFromSource[LocalVariableDescriptor]

'hashMapOf' @ [205:28] ==> public fun <K, V> hashMapOf(vararg pairs: Pair<String, JsExpression>): HashMap<String, JsExpression> /* = HashMap<String, JsExpression> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> JsExpression

'info' @ [205:38] ==> value-parameter info: FunctionReader.ModuleInfo defined in org.jetbrains.kotlin.js.inline.FunctionReader.readFunctionFromSource[ValueParameterDescriptorImpl]

'moduleVariable' @ [205:43] ==> public final val moduleVariable: String defined in org.jetbrains.kotlin.js.inline.FunctionReader.ModuleInfo[PropertyDescriptorImpl]

'moduleReference' @ [205:61] ==> val moduleReference: JsExpression defined in org.jetbrains.kotlin.js.inline.FunctionReader.readFunctionFromSource[LocalVariableDescriptor]

'info' @ [206:38] ==> value-parameter info: FunctionReader.ModuleInfo defined in org.jetbrains.kotlin.js.inline.FunctionReader.readFunctionFromSource[ValueParameterDescriptorImpl]

'kotlinVariable' @ [206:43] ==> public final val kotlinVariable: String defined in org.jetbrains.kotlin.js.inline.FunctionReader.ModuleInfo[PropertyDescriptorImpl]

'kotlinObject' @ [206:67] ==> @NotNull public open fun kotlinObject(): JsNameRef defined in org.jetbrains.kotlin.js.translate.context.Namer[JavaMethodDescriptor]

'replaceExternalNames' @ [207:9] ==> private fun replaceExternalNames(function: JsFunction, externalReplacements: Map<String, JsExpression>): Unit defined in org.jetbrains.kotlin.js.inline[SimpleFunctionDescriptorImpl]

'function' @ [207:30] ==> val function: JsFunction defined in org.jetbrains.kotlin.js.inline.FunctionReader.readFunctionFromSource[LocalVariableDescriptor]

'replacements' @ [207:40] ==> val replacements: HashMap<String, JsExpression> /* = HashMap<String, JsExpression> */ defined in org.jetbrains.kotlin.js.inline.FunctionReader.readFunctionFromSource[LocalVariableDescriptor]

'function' @ [208:9] ==> val function: JsFunction defined in org.jetbrains.kotlin.js.inline.FunctionReader.readFunctionFromSource[LocalVariableDescriptor]

'markInlineArguments' @ [208:18] ==> private fun JsFunction.markInlineArguments(descriptor: CallableDescriptor): Unit defined in org.jetbrains.kotlin.js.inline in file FunctionReader.kt[SimpleFunctionDescriptorImpl]

'descriptor' @ [208:38] ==> value-parameter descriptor: CallableDescriptor defined in org.jetbrains.kotlin.js.inline.FunctionReader.readFunctionFromSource[ValueParameterDescriptorImpl]

'function' @ [209:16] ==> val function: JsFunction defined in org.jetbrains.kotlin.js.inline.FunctionReader.readFunctionFromSource[LocalVariableDescriptor]

'this' @ [214:13] ==> <this> defined in org.jetbrains.kotlin.js.inline.isWhitespaceOrComma[ReceiverParameterDescriptorImpl]

'this' @ [214:28] ==> <this> defined in org.jetbrains.kotlin.js.inline.isWhitespaceOrComma[ReceiverParameterDescriptorImpl]

'isWhitespace' @ [214:33] ==> public fun Char.isWhitespace(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [217:18] ==> value-parameter descriptor: CallableDescriptor defined in org.jetbrains.kotlin.js.inline.markInlineArguments[ValueParameterDescriptorImpl]

'valueParameters' @ [217:29] ==> public final val CallableDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'parameters' @ [218:20] ==> public final val JsFunction.parameters: (MutableList<(JsParameter..JsParameter?)>..List<(JsParameter..JsParameter?)>)[MyPropertyDescriptor]

'IdentitySet' @ [219:22] ==> public fun <T> IdentitySet(): MutableSet<JsName> defined in org.jetbrains.kotlin.js.inline.util[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> JsName

'if (descriptor.isExtension) 1 else 0' @ [220:18] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'descriptor' @ [220:22] ==> value-parameter descriptor: CallableDescriptor defined in org.jetbrains.kotlin.js.inline.markInlineArguments[ValueParameterDescriptorImpl]

'isExtension' @ [220:33] ==> public val DeclarationDescriptor.isExtension: Boolean defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'component1' @ [222:11] ==> public final operator fun component1(): Int defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'component2' @ [222:14] ==> public final operator fun component2(): (ValueParameterDescriptor..ValueParameterDescriptor?) defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'params' @ [222:24] ==> val params: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>) defined in org.jetbrains.kotlin.js.inline.markInlineArguments[LocalVariableDescriptor]

'withIndex' @ [222:31] ==> public fun <T> Iterable<(ValueParameterDescriptor..ValueParameterDescriptor?)>.withIndex(): Iterable<IndexedValue<(ValueParameterDescriptor..ValueParameterDescriptor?)>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)

'param' @ [223:20] ==> val param: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.js.inline.markInlineArguments[LocalVariableDescriptor]

'type' @ [223:26] ==> public final val ValueParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'!' @ [224:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'type' @ [224:14] ==> val type: KotlinType defined in org.jetbrains.kotlin.js.inline.markInlineArguments[LocalVariableDescriptor]

'isFunctionTypeOrSubtype' @ [224:19] ==> public val KotlinType.isFunctionTypeOrSubtype: Boolean defined in org.jetbrains.kotlin.builtins[DeserializedPropertyDescriptor]

'inlineFuns' @ [226:9] ==> val inlineFuns: MutableSet<JsName> defined in org.jetbrains.kotlin.js.inline.markInlineArguments[LocalVariableDescriptor]

'add' @ [226:20] ==> public abstract fun add(element: JsName): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'paramsJs' @ [226:24] ==> val paramsJs: (MutableList<(JsParameter..JsParameter?)>..List<(JsParameter..JsParameter?)>) defined in org.jetbrains.kotlin.js.inline.markInlineArguments[LocalVariableDescriptor]

'i' @ [226:33] ==> val i: Int defined in org.jetbrains.kotlin.js.inline.markInlineArguments[LocalVariableDescriptor]

'offset' @ [226:37] ==> val offset: Int defined in org.jetbrains.kotlin.js.inline.markInlineArguments[LocalVariableDescriptor]

'name' @ [226:45] ==> public final var JsParameter.name: JsName[MyPropertyDescriptor]

'JsVisitorWithContextImpl' @ [229:27] ==> public constructor JsVisitorWithContextImpl() defined in org.jetbrains.kotlin.js.backend.ast.JsVisitorWithContextImpl[JavaClassConstructorDescriptor]

'if (isCallInvocation(x)) {
                (x.qualifier as? JsNameRef)?.qualifier
            } else {
                x.qualifier
            }' @ [231:44] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: JsExpression?, elseBranch: JsExpression?): JsExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> JsExpression?

'isCallInvocation' @ [231:48] ==> public fun isCallInvocation(invocation: JsInvocation): Boolean defined in org.jetbrains.kotlin.js.inline.util in file invocationUtils.kt[SimpleFunctionDescriptorImpl]

'x' @ [231:65] ==> value-parameter x: JsInvocation defined in org.jetbrains.kotlin.js.inline.markInlineArguments.<no name provided>.endVisit[ValueParameterDescriptorImpl]

'x' @ [232:18] ==> value-parameter x: JsInvocation defined in org.jetbrains.kotlin.js.inline.markInlineArguments.<no name provided>.endVisit[ValueParameterDescriptorImpl]

'qualifier' @ [232:20] ==> public final var JsInvocation.qualifier: JsExpression[MyPropertyDescriptor]

'qualifier' @ [232:46] ==> public final var JsNameRef.qualifier: JsExpression?[MyPropertyDescriptor]

'x' @ [234:17] ==> value-parameter x: JsInvocation defined in org.jetbrains.kotlin.js.inline.markInlineArguments.<no name provided>.endVisit[ValueParameterDescriptorImpl]

'qualifier' @ [234:19] ==> public final var JsInvocation.qualifier: JsExpression[MyPropertyDescriptor]

'qualifier' @ [237:14] ==> val qualifier: JsExpression? defined in org.jetbrains.kotlin.js.inline.markInlineArguments.<no name provided>.endVisit[LocalVariableDescriptor]

'name' @ [237:40] ==> public final var JsNameRef.name: JsName?[MyPropertyDescriptor]

'let' @ [237:46] ==> @InlineOnly public inline fun <T, R> JsName.let(block: (JsName) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsName
    <R> -> Unit

'name' @ [238:21] ==> value-parameter name: JsName defined in org.jetbrains.kotlin.js.inline.markInlineArguments.<no name provided>.endVisit.<anonymous>[ValueParameterDescriptorImpl]

'inlineFuns' @ [238:29] ==> val inlineFuns: MutableSet<JsName> defined in org.jetbrains.kotlin.js.inline.markInlineArguments[LocalVariableDescriptor]

'x' @ [239:21] ==> value-parameter x: JsInvocation defined in org.jetbrains.kotlin.js.inline.markInlineArguments.<no name provided>.endVisit[ValueParameterDescriptorImpl]

'inlineStrategy' @ [239:23] ==> public var JsInvocation.inlineStrategy: InlineStrategy? defined in org.jetbrains.kotlin.js.backend.ast.metadata[DeserializedPropertyDescriptor]

'IN_PLACE' @ [239:55] ==> enum entry IN_PLACE defined in org.jetbrains.kotlin.resolve.inline.InlineStrategy[FakeCallableDescriptorForObject]

'visitor' @ [245:5] ==> val visitor: <no name provided> defined in org.jetbrains.kotlin.js.inline.markInlineArguments[LocalVariableDescriptor]

'accept' @ [245:13] ==> public final fun <T : (JsNode..JsNode?)> accept(p0: (JsFunction..JsFunction?)): (JsFunction..JsFunction?) defined in org.jetbrains.kotlin.js.inline.markInlineArguments.<no name provided>[JavaMethodDescriptor]
Inferred types:
    <T : (JsNode..JsNode?)> -> JsFunction

'this' @ [245:20] ==> <this> defined in org.jetbrains.kotlin.js.inline.markInlineArguments[ReceiverParameterDescriptorImpl]

'externalReplacements' @ [249:24] ==> value-parameter externalReplacements: Map<String, JsExpression> defined in org.jetbrains.kotlin.js.inline.replaceExternalNames[ValueParameterDescriptorImpl]

'filterKeys' @ [249:45] ==> public inline fun <K, V> Map<out String, JsExpression>.filterKeys(predicate: (String) -> Boolean): Map<String, JsExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> JsExpression

'!' @ [249:58] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'function' @ [249:59] ==> value-parameter function: JsFunction defined in org.jetbrains.kotlin.js.inline.replaceExternalNames[ValueParameterDescriptorImpl]

'scope' @ [249:68] ==> public final val JsFunction.scope: JsFunctionScope[MyPropertyDescriptor]

'hasOwnName' @ [249:74] ==> public open fun hasOwnName(name: String): Boolean defined in org.jetbrains.kotlin.js.backend.ast.JsFunctionScope[DeserializedSimpleFunctionDescriptor]

'it' @ [249:85] ==> value-parameter it: String defined in org.jetbrains.kotlin.js.inline.replaceExternalNames.<anonymous>[ValueParameterDescriptorImpl]

'replacements' @ [251:9] ==> val replacements: Map<String, JsExpression> defined in org.jetbrains.kotlin.js.inline.replaceExternalNames[LocalVariableDescriptor]

'isEmpty' @ [251:22] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Map[DeserializedSimpleFunctionDescriptor]

'JsVisitorWithContextImpl' @ [253:27] ==> public constructor JsVisitorWithContextImpl() defined in org.jetbrains.kotlin.js.backend.ast.JsVisitorWithContextImpl[JavaClassConstructorDescriptor]

'x' @ [255:17] ==> value-parameter x: JsNameRef defined in org.jetbrains.kotlin.js.inline.replaceExternalNames.<no name provided>.endVisit[ValueParameterDescriptorImpl]

'qualifier' @ [255:19] ==> public final var JsNameRef.qualifier: JsExpression?[MyPropertyDescriptor]

'replacements' @ [257:13] ==> val replacements: Map<String, JsExpression> defined in org.jetbrains.kotlin.js.inline.replaceExternalNames[LocalVariableDescriptor]

'x' @ [257:26] ==> value-parameter x: JsNameRef defined in org.jetbrains.kotlin.js.inline.replaceExternalNames.<no name provided>.endVisit[ValueParameterDescriptorImpl]

'ident' @ [257:28] ==> public final val JsNameRef.ident: String[MyPropertyDescriptor]

'let' @ [257:36] ==> @InlineOnly public inline fun <T, R> JsExpression.let(block: (JsExpression) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsExpression
    <R> -> Unit

'ctx' @ [258:17] ==> value-parameter ctx: JsContext<JsNode> defined in org.jetbrains.kotlin.js.inline.replaceExternalNames.<no name provided>.endVisit[ValueParameterDescriptorImpl]

'replaceMe' @ [258:21] ==> public abstract fun <R : (JsNode..JsNode?)> replaceMe(p0: (JsExpression..JsExpression?)): Unit defined in org.jetbrains.kotlin.js.backend.ast.JsContext[JavaMethodDescriptor]
Inferred types:
    <R : (JsNode..JsNode?)> -> JsExpression

'it' @ [258:31] ==> value-parameter it: JsExpression defined in org.jetbrains.kotlin.js.inline.replaceExternalNames.<no name provided>.endVisit.<anonymous>[ValueParameterDescriptorImpl]

'visitor' @ [263:5] ==> val visitor: <no name provided> defined in org.jetbrains.kotlin.js.inline.replaceExternalNames[LocalVariableDescriptor]

'accept' @ [263:13] ==> public final fun <T : (JsNode..JsNode?)> accept(p0: (JsFunction..JsFunction?)): (JsFunction..JsFunction?) defined in org.jetbrains.kotlin.js.inline.replaceExternalNames.<no name provided>[JavaMethodDescriptor]
Inferred types:
    <T : (JsNode..JsNode?)> -> JsFunction

'function' @ [263:20] ==> value-parameter function: JsFunction defined in org.jetbrains.kotlin.js.inline.replaceExternalNames[ValueParameterDescriptorImpl]

