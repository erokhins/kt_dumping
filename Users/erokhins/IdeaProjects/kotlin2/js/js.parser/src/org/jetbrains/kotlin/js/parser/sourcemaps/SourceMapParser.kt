'Throws' @ [28:5] ==> public constructor Throws(vararg exceptionClasses: KClass<out Throwable>) defined in kotlin.jvm.Throws[DeserializedClassConstructorDescriptor]

'IOException' @ [28:13] ==> public constructor IOException() defined in java.io.IOException[JavaClassConstructorDescriptor]

'JSONObject' @ [31:13] ==> public constructor JSONObject(p0: (JSONTokener..JSONTokener?)) defined in org.json.JSONObject[JavaClassConstructorDescriptor]

'JSONTokener' @ [31:24] ==> public constructor JSONTokener(p0: (Reader..Reader?)) defined in org.json.JSONTokener[JavaClassConstructorDescriptor]

'reader' @ [31:36] ==> value-parameter reader: Reader defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapParser.parse[ValueParameterDescriptorImpl]

'SourceMapError' @ [34:20] ==> public constructor SourceMapError(message: String) defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapError[ClassConstructorDescriptorImpl]

'e' @ [34:35] ==> val e: JSONException defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapParser.parse[LocalVariableDescriptor]

'message' @ [34:37] ==> public open val message: String? defined in org.json.JSONException[DeserializedPropertyDescriptor]

'!' @ [37:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'jsonObject' @ [37:14] ==> val jsonObject: JSONObject defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapParser.parse[LocalVariableDescriptor]

'has' @ [37:25] ==> public open fun has(p0: (String..String?)): Boolean defined in org.json.JSONObject[JavaMethodDescriptor]

'SourceMapError' @ [37:48] ==> public constructor SourceMapError(message: String) defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapError[ClassConstructorDescriptorImpl]

'jsonObject' @ [38:9] ==> val jsonObject: JSONObject defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapParser.parse[LocalVariableDescriptor]

'get' @ [38:20] ==> public open operator fun get(p0: (String..String?)): (Any..Any?) defined in org.json.JSONObject[JavaMethodDescriptor]

'let' @ [38:35] ==> @InlineOnly public inline fun <T, R> (Any..Any?).let(block: ((Any..Any?)) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.Any..kotlin.Any?)
    <R> -> Unit

'it' @ [39:17] ==> value-parameter it: (Any..Any?) defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapParser.parse.<anonymous>[ValueParameterDescriptorImpl]

'SourceMapError' @ [39:33] ==> public constructor SourceMapError(message: String) defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapError[ClassConstructorDescriptorImpl]

'it' @ [39:71] ==> value-parameter it: (Any..Any?) defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapParser.parse.<anonymous>[ValueParameterDescriptorImpl]

'if (jsonObject.has("sourceRoot")) {
            jsonObject.get("sourceRoot") as? String ?: return SourceMapError("'sourceRoot' property is not of string type")
        }
        else {
            ""
        }' @ [42:26] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'jsonObject' @ [42:30] ==> val jsonObject: JSONObject defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapParser.parse[LocalVariableDescriptor]

'has' @ [42:41] ==> public open fun has(p0: (String..String?)): Boolean defined in org.json.JSONObject[JavaMethodDescriptor]

'jsonObject' @ [43:13] ==> val jsonObject: JSONObject defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapParser.parse[LocalVariableDescriptor]

'get' @ [43:24] ==> public open operator fun get(p0: (String..String?)): (Any..Any?) defined in org.json.JSONObject[JavaMethodDescriptor]

'SourceMapError' @ [43:63] ==> public constructor SourceMapError(message: String) defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapError[ClassConstructorDescriptorImpl]

'if (jsonObject.has("sources")) {
            val sourcesProperty = jsonObject.get("sources") as? JSONArray ?:
                                  return SourceMapError("'sources' property is not of array type")
            sourcesProperty.map {
                it as? String ?: return SourceMapError("'sources' array must contain strings")
            }
        }
        else {
            emptyList()
        }' @ [49:23] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: List<String>, elseBranch: List<String>): List<String>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> List<String>

'jsonObject' @ [49:27] ==> val jsonObject: JSONObject defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapParser.parse[LocalVariableDescriptor]

'has' @ [49:38] ==> public open fun has(p0: (String..String?)): Boolean defined in org.json.JSONObject[JavaMethodDescriptor]

'jsonObject' @ [50:35] ==> val jsonObject: JSONObject defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapParser.parse[LocalVariableDescriptor]

'get' @ [50:46] ==> public open operator fun get(p0: (String..String?)): (Any..Any?) defined in org.json.JSONObject[JavaMethodDescriptor]

'SourceMapError' @ [51:42] ==> public constructor SourceMapError(message: String) defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapError[ClassConstructorDescriptorImpl]

'sourcesProperty' @ [52:13] ==> val sourcesProperty: JSONArray defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapParser.parse[LocalVariableDescriptor]

'map' @ [52:29] ==> public inline fun <T, R> Iterable<(Any..Any?)>.map(transform: ((Any..Any?)) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.Any..kotlin.Any?)
    <R> -> String

'it' @ [53:17] ==> value-parameter it: (Any..Any?) defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapParser.parse.<anonymous>[ValueParameterDescriptorImpl]

'SourceMapError' @ [53:41] ==> public constructor SourceMapError(message: String) defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapError[ClassConstructorDescriptorImpl]

'emptyList' @ [57:13] ==> public fun <T> emptyList(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'if (jsonObject.has("sourcesContent")) {
            val sourcesContentProperty = jsonObject.get("sourcesContent") as? JSONArray ?:
                                         return SourceMapError("'sourcesContent' property is not of array type")
            if (sourcesContentProperty.any { it != JSONObject.NULL && it !is String? }) {
                return SourceMapError("'sources' array must contain strings")
            }
            sourcesContentProperty.map { if (it == JSONObject.NULL) null else it as String? }
        }
        else {
            emptyList()
        }' @ [60:45] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: List<String?>, elseBranch: List<String?>): List<String?>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> List<String?>

'jsonObject' @ [60:49] ==> val jsonObject: JSONObject defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapParser.parse[LocalVariableDescriptor]

'has' @ [60:60] ==> public open fun has(p0: (String..String?)): Boolean defined in org.json.JSONObject[JavaMethodDescriptor]

'jsonObject' @ [61:42] ==> val jsonObject: JSONObject defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapParser.parse[LocalVariableDescriptor]

'get' @ [61:53] ==> public open operator fun get(p0: (String..String?)): (Any..Any?) defined in org.json.JSONObject[JavaMethodDescriptor]

'SourceMapError' @ [62:49] ==> public constructor SourceMapError(message: String) defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapError[ClassConstructorDescriptorImpl]

'sourcesContentProperty' @ [63:17] ==> val sourcesContentProperty: JSONArray defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapParser.parse[LocalVariableDescriptor]

'any' @ [63:40] ==> public inline fun <T> Iterable<(Any..Any?)>.any(predicate: ((Any..Any?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.Any..kotlin.Any?)

'it' @ [63:46] ==> value-parameter it: (Any..Any?) defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapParser.parse.<anonymous>[ValueParameterDescriptorImpl]

'NULL' @ [63:63] ==> public final val NULL: (Any..Any?) defined in org.json.JSONObject[JavaPropertyDescriptor]

'it' @ [63:71] ==> value-parameter it: (Any..Any?) defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapParser.parse.<anonymous>[ValueParameterDescriptorImpl]

'SourceMapError' @ [64:24] ==> public constructor SourceMapError(message: String) defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapError[ClassConstructorDescriptorImpl]

'sourcesContentProperty' @ [66:13] ==> val sourcesContentProperty: JSONArray defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapParser.parse[LocalVariableDescriptor]

'map' @ [66:36] ==> public inline fun <T, R> Iterable<(Any..Any?)>.map(transform: ((Any..Any?)) -> String?): List<String?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.Any..kotlin.Any?)
    <R> -> String?

'if (it == JSONObject.NULL) null else it as String?' @ [66:42] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String?, elseBranch: String?): String?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String?

'it' @ [66:46] ==> value-parameter it: (Any..Any?) defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapParser.parse.<anonymous>[ValueParameterDescriptorImpl]

'NULL' @ [66:63] ==> public final val NULL: (Any..Any?) defined in org.json.JSONObject[JavaPropertyDescriptor]

'it' @ [66:79] ==> value-parameter it: (Any..Any?) defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapParser.parse.<anonymous>[ValueParameterDescriptorImpl]

'emptyList' @ [69:13] ==> public fun <T> emptyList(): List<String?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String?

'sources' @ [72:35] ==> val sources: List<String> defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapParser.parse[LocalVariableDescriptor]

'zip' @ [72:43] ==> public infix fun <T, R> Iterable<String>.zip(other: Iterable<String?>): List<Pair<String, String?>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> String?

'sourcesContent' @ [72:47] ==> val sourcesContent: List<String?> defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapParser.parse[LocalVariableDescriptor]

'associate' @ [72:63] ==> public inline fun <T, K, V> Iterable<Pair<String, String?>>.associate(transform: (Pair<String, String?>) -> Pair<String, String?>): Map<String, String?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<String, String?>
    <K> -> String
    <V> -> String?

'it' @ [72:75] ==> value-parameter it: Pair<String, String?> defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapParser.parse.<anonymous>[ValueParameterDescriptorImpl]

'!' @ [74:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'jsonObject' @ [74:14] ==> val jsonObject: JSONObject defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapParser.parse[LocalVariableDescriptor]

'has' @ [74:25] ==> public open fun has(p0: (String..String?)): Boolean defined in org.json.JSONObject[JavaMethodDescriptor]

'SourceMapError' @ [74:49] ==> public constructor SourceMapError(message: String) defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapError[ClassConstructorDescriptorImpl]

'jsonObject' @ [75:24] ==> val jsonObject: JSONObject defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapParser.parse[LocalVariableDescriptor]

'get' @ [75:35] ==> public open operator fun get(p0: (String..String?)): (Any..Any?) defined in org.json.JSONObject[JavaMethodDescriptor]

'SourceMapError' @ [75:72] ==> public constructor SourceMapError(message: String) defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapError[ClassConstructorDescriptorImpl]

'MappingStream' @ [81:22] ==> public constructor MappingStream(string: String) defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapParser.MappingStream[ClassConstructorDescriptorImpl]

'mappings' @ [81:36] ==> val mappings: String defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapParser.parse[LocalVariableDescriptor]

'SourceMap' @ [82:25] ==> public constructor SourceMap(sourceContentResolver: (String) -> Reader?) defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMap[ClassConstructorDescriptorImpl]

'sourcePathToContent' @ [82:37] ==> val sourcePathToContent: Map<String, String?> defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapParser.parse[LocalVariableDescriptor]

'it' @ [82:57] ==> value-parameter it: String defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapParser.parse.<anonymous>[ValueParameterDescriptorImpl]

'let' @ [82:62] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> StringReader): StringReader defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> StringReader

'StringReader' @ [82:68] ==> public constructor StringReader(p0: (String..String?)) defined in java.io.StringReader[JavaClassConstructorDescriptor]

'it' @ [82:81] ==> value-parameter it: String defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapParser.parse.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'SourceMapGroup' @ [83:28] ==> public constructor SourceMapGroup() defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapGroup[ClassConstructorDescriptorImpl]

'also' @ [83:45] ==> @InlineOnly @SinceKotlin public inline fun <T> SourceMapGroup.also(block: (SourceMapGroup) -> Unit): SourceMapGroup defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SourceMapGroup

'sourceMap' @ [83:52] ==> val sourceMap: SourceMap defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapParser.parse[LocalVariableDescriptor]

'groups' @ [83:62] ==> public final val groups: MutableList<SourceMapGroup> defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMap[PropertyDescriptorImpl]

'it' @ [83:72] ==> value-parameter it: SourceMapGroup defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapParser.parse.<anonymous>[ValueParameterDescriptorImpl]

'!' @ [85:16] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'stream' @ [85:17] ==> val stream: SourceMapParser.MappingStream defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapParser.parse[LocalVariableDescriptor]

'isEof' @ [85:24] ==> public final val isEof: Boolean defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapParser.MappingStream[PropertyDescriptorImpl]

'stream' @ [86:17] ==> val stream: SourceMapParser.MappingStream defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapParser.parse[LocalVariableDescriptor]

'isGroupTerminator' @ [86:24] ==> public final val isGroupTerminator: Boolean defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapParser.MappingStream[PropertyDescriptorImpl]

'currentGroup' @ [87:17] ==> var currentGroup: SourceMapGroup defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapParser.parse[LocalVariableDescriptor]

'SourceMapGroup' @ [87:32] ==> public constructor SourceMapGroup() defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapGroup[ClassConstructorDescriptorImpl]

'also' @ [87:49] ==> @InlineOnly @SinceKotlin public inline fun <T> SourceMapGroup.also(block: (SourceMapGroup) -> Unit): SourceMapGroup defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SourceMapGroup

'sourceMap' @ [87:56] ==> val sourceMap: SourceMap defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapParser.parse[LocalVariableDescriptor]

'groups' @ [87:66] ==> public final val groups: MutableList<SourceMapGroup> defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMap[PropertyDescriptorImpl]

'it' @ [87:76] ==> value-parameter it: SourceMapGroup defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapParser.parse.<anonymous>[ValueParameterDescriptorImpl]

'jsColumn' @ [88:17] ==> var jsColumn: Int defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapParser.parse[LocalVariableDescriptor]

'stream' @ [89:17] ==> val stream: SourceMapParser.MappingStream defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapParser.parse[LocalVariableDescriptor]

'skipChar' @ [89:24] ==> public final fun skipChar(): Unit defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapParser.MappingStream[SimpleFunctionDescriptorImpl]

'jsColumn' @ [93:13] ==> var jsColumn: Int defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapParser.parse[LocalVariableDescriptor]

'stream' @ [93:25] ==> val stream: SourceMapParser.MappingStream defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapParser.parse[LocalVariableDescriptor]

'readInt' @ [93:32] ==> public final fun readInt(): Int? defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapParser.MappingStream[SimpleFunctionDescriptorImpl]

'stream' @ [93:52] ==> val stream: SourceMapParser.MappingStream defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapParser.parse[LocalVariableDescriptor]

'createError' @ [93:59] ==> public final fun createError(error: String): SourceMapError defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapParser.MappingStream[SimpleFunctionDescriptorImpl]

'if (stream.isEncodedInt) {
                sourceIndex += stream.readInt() ?: return stream.createError("VLQ-encoded source index expected")
                sourceLine += stream.readInt() ?: return stream.createError("VLQ-encoded source line expected")
                sourceColumn += stream.readInt() ?: return stream.createError("VLQ-encoded source column expected")
                if (stream.isEncodedInt) {
                    stream.readInt() ?: return stream.createError("VLQ-encoded name index expected")
                }

                if (sourceIndex !in sources.indices) {
                    return stream.createError("Source index $sourceIndex is out of bounds ${sources.indices}")
                }
                currentGroup.segments += SourceMapSegment(jsColumn, sourceRoot + sources[sourceIndex], sourceLine, sourceColumn)
            }
            else {
                currentGroup.segments += SourceMapSegment(jsColumn, null, -1, -1)
            }' @ [95:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'stream' @ [95:17] ==> val stream: SourceMapParser.MappingStream defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapParser.parse[LocalVariableDescriptor]

'isEncodedInt' @ [95:24] ==> public final val isEncodedInt: Boolean defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapParser.MappingStream[PropertyDescriptorImpl]

'sourceIndex' @ [96:17] ==> var sourceIndex: Int defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapParser.parse[LocalVariableDescriptor]

'stream' @ [96:32] ==> val stream: SourceMapParser.MappingStream defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapParser.parse[LocalVariableDescriptor]

'readInt' @ [96:39] ==> public final fun readInt(): Int? defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapParser.MappingStream[SimpleFunctionDescriptorImpl]

'stream' @ [96:59] ==> val stream: SourceMapParser.MappingStream defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapParser.parse[LocalVariableDescriptor]

'createError' @ [96:66] ==> public final fun createError(error: String): SourceMapError defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapParser.MappingStream[SimpleFunctionDescriptorImpl]

'sourceLine' @ [97:17] ==> var sourceLine: Int defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapParser.parse[LocalVariableDescriptor]

'stream' @ [97:31] ==> val stream: SourceMapParser.MappingStream defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapParser.parse[LocalVariableDescriptor]

'readInt' @ [97:38] ==> public final fun readInt(): Int? defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapParser.MappingStream[SimpleFunctionDescriptorImpl]

'stream' @ [97:58] ==> val stream: SourceMapParser.MappingStream defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapParser.parse[LocalVariableDescriptor]

'createError' @ [97:65] ==> public final fun createError(error: String): SourceMapError defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapParser.MappingStream[SimpleFunctionDescriptorImpl]

'sourceColumn' @ [98:17] ==> var sourceColumn: Int defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapParser.parse[LocalVariableDescriptor]

'stream' @ [98:33] ==> val stream: SourceMapParser.MappingStream defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapParser.parse[LocalVariableDescriptor]

'readInt' @ [98:40] ==> public final fun readInt(): Int? defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapParser.MappingStream[SimpleFunctionDescriptorImpl]

'stream' @ [98:60] ==> val stream: SourceMapParser.MappingStream defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapParser.parse[LocalVariableDescriptor]

'createError' @ [98:67] ==> public final fun createError(error: String): SourceMapError defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapParser.MappingStream[SimpleFunctionDescriptorImpl]

'stream' @ [99:21] ==> val stream: SourceMapParser.MappingStream defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapParser.parse[LocalVariableDescriptor]

'isEncodedInt' @ [99:28] ==> public final val isEncodedInt: Boolean defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapParser.MappingStream[PropertyDescriptorImpl]

'stream' @ [100:21] ==> val stream: SourceMapParser.MappingStream defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapParser.parse[LocalVariableDescriptor]

'readInt' @ [100:28] ==> public final fun readInt(): Int? defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapParser.MappingStream[SimpleFunctionDescriptorImpl]

'stream' @ [100:48] ==> val stream: SourceMapParser.MappingStream defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapParser.parse[LocalVariableDescriptor]

'createError' @ [100:55] ==> public final fun createError(error: String): SourceMapError defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapParser.MappingStream[SimpleFunctionDescriptorImpl]

'sourceIndex' @ [103:21] ==> var sourceIndex: Int defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapParser.parse[LocalVariableDescriptor]

'sources' @ [103:37] ==> val sources: List<String> defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapParser.parse[LocalVariableDescriptor]

'indices' @ [103:45] ==> public val Collection<*>.indices: IntRange defined in kotlin.collections[DeserializedPropertyDescriptor]

'stream' @ [104:28] ==> val stream: SourceMapParser.MappingStream defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapParser.parse[LocalVariableDescriptor]

'createError' @ [104:35] ==> public final fun createError(error: String): SourceMapError defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapParser.MappingStream[SimpleFunctionDescriptorImpl]

'sourceIndex' @ [104:62] ==> var sourceIndex: Int defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapParser.parse[LocalVariableDescriptor]

'sources' @ [104:93] ==> val sources: List<String> defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapParser.parse[LocalVariableDescriptor]

'indices' @ [104:101] ==> public val Collection<*>.indices: IntRange defined in kotlin.collections[DeserializedPropertyDescriptor]

'currentGroup' @ [106:17] ==> var currentGroup: SourceMapGroup defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapParser.parse[LocalVariableDescriptor]

'segments' @ [106:30] ==> public final val segments: MutableList<SourceMapSegment> defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapGroup[PropertyDescriptorImpl]

'SourceMapSegment' @ [106:42] ==> public constructor SourceMapSegment(generatedColumnNumber: Int, sourceFileName: String?, sourceLineNumber: Int, sourceColumnNumber: Int) defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapSegment[ClassConstructorDescriptorImpl]

'jsColumn' @ [106:59] ==> var jsColumn: Int defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapParser.parse[LocalVariableDescriptor]

'sourceRoot' @ [106:69] ==> val sourceRoot: String defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapParser.parse[LocalVariableDescriptor]

'sources' @ [106:82] ==> val sources: List<String> defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapParser.parse[LocalVariableDescriptor]

'sourceIndex' @ [106:90] ==> var sourceIndex: Int defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapParser.parse[LocalVariableDescriptor]

'sourceLine' @ [106:104] ==> var sourceLine: Int defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapParser.parse[LocalVariableDescriptor]

'sourceColumn' @ [106:116] ==> var sourceColumn: Int defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapParser.parse[LocalVariableDescriptor]

'currentGroup' @ [109:17] ==> var currentGroup: SourceMapGroup defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapParser.parse[LocalVariableDescriptor]

'segments' @ [109:30] ==> public final val segments: MutableList<SourceMapSegment> defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapGroup[PropertyDescriptorImpl]

'SourceMapSegment' @ [109:42] ==> public constructor SourceMapSegment(generatedColumnNumber: Int, sourceFileName: String?, sourceLineNumber: Int, sourceColumnNumber: Int) defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapSegment[ClassConstructorDescriptorImpl]

'jsColumn' @ [109:59] ==> var jsColumn: Int defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapParser.parse[LocalVariableDescriptor]

'-' @ [109:75] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'-' @ [109:79] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'when {
                stream.isEof -> return stream.createError("Unexpected EOF, ',' or ';' expected")
                stream.isGroupTerminator -> {
                    currentGroup = SourceMapGroup().also { sourceMap.groups += it }
                    jsColumn = 0
                }
                !stream.isSegmentTerminator -> return stream.createError("Unexpected char, ',' or ';' expected")
            }' @ [112:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'stream' @ [113:17] ==> val stream: SourceMapParser.MappingStream defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapParser.parse[LocalVariableDescriptor]

'isEof' @ [113:24] ==> public final val isEof: Boolean defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapParser.MappingStream[PropertyDescriptorImpl]

'stream' @ [113:40] ==> val stream: SourceMapParser.MappingStream defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapParser.parse[LocalVariableDescriptor]

'createError' @ [113:47] ==> public final fun createError(error: String): SourceMapError defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapParser.MappingStream[SimpleFunctionDescriptorImpl]

'stream' @ [114:17] ==> val stream: SourceMapParser.MappingStream defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapParser.parse[LocalVariableDescriptor]

'isGroupTerminator' @ [114:24] ==> public final val isGroupTerminator: Boolean defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapParser.MappingStream[PropertyDescriptorImpl]

'currentGroup' @ [115:21] ==> var currentGroup: SourceMapGroup defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapParser.parse[LocalVariableDescriptor]

'SourceMapGroup' @ [115:36] ==> public constructor SourceMapGroup() defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapGroup[ClassConstructorDescriptorImpl]

'also' @ [115:53] ==> @InlineOnly @SinceKotlin public inline fun <T> SourceMapGroup.also(block: (SourceMapGroup) -> Unit): SourceMapGroup defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SourceMapGroup

'sourceMap' @ [115:60] ==> val sourceMap: SourceMap defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapParser.parse[LocalVariableDescriptor]

'groups' @ [115:70] ==> public final val groups: MutableList<SourceMapGroup> defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMap[PropertyDescriptorImpl]

'it' @ [115:80] ==> value-parameter it: SourceMapGroup defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapParser.parse.<anonymous>[ValueParameterDescriptorImpl]

'jsColumn' @ [116:21] ==> var jsColumn: Int defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapParser.parse[LocalVariableDescriptor]

'!' @ [118:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'stream' @ [118:18] ==> val stream: SourceMapParser.MappingStream defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapParser.parse[LocalVariableDescriptor]

'isSegmentTerminator' @ [118:25] ==> public final val isSegmentTerminator: Boolean defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapParser.MappingStream[PropertyDescriptorImpl]

'stream' @ [118:55] ==> val stream: SourceMapParser.MappingStream defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapParser.parse[LocalVariableDescriptor]

'createError' @ [118:62] ==> public final fun createError(error: String): SourceMapError defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapParser.MappingStream[SimpleFunctionDescriptorImpl]

'stream' @ [120:13] ==> val stream: SourceMapParser.MappingStream defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapParser.parse[LocalVariableDescriptor]

'skipChar' @ [120:20] ==> public final fun skipChar(): Unit defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapParser.MappingStream[SimpleFunctionDescriptorImpl]

'SourceMapSuccess' @ [123:16] ==> public constructor SourceMapSuccess(value: SourceMap) defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapSuccess[ClassConstructorDescriptorImpl]

'sourceMap' @ [123:33] ==> val sourceMap: SourceMap defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapParser.parse[LocalVariableDescriptor]

'position' @ [129:36] ==> public final var position: Int defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapParser.MappingStream[PropertyDescriptorImpl]

'string' @ [129:48] ==> public final val string: String defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapParser.MappingStream[PropertyDescriptorImpl]

'length' @ [129:55] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'string' @ [131:50] ==> public final val string: String defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapParser.MappingStream[PropertyDescriptorImpl]

'position' @ [131:57] ==> public final var position: Int defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapParser.MappingStream[PropertyDescriptorImpl]

'string' @ [133:48] ==> public final val string: String defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapParser.MappingStream[PropertyDescriptorImpl]

'position' @ [133:55] ==> public final var position: Int defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapParser.MappingStream[PropertyDescriptorImpl]

'!' @ [135:43] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isEof' @ [135:44] ==> public final val isEof: Boolean defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapParser.MappingStream[PropertyDescriptorImpl]

'!' @ [135:53] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isSegmentTerminator' @ [135:54] ==> public final val isSegmentTerminator: Boolean defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapParser.MappingStream[PropertyDescriptorImpl]

'!' @ [135:77] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isGroupTerminator' @ [135:78] ==> public final val isGroupTerminator: Boolean defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapParser.MappingStream[PropertyDescriptorImpl]

'position' @ [138:13] ==> public final var position: Int defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapParser.MappingStream[PropertyDescriptorImpl]

'isEof' @ [145:21] ==> public final val isEof: Boolean defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapParser.MappingStream[PropertyDescriptorImpl]

'base64value' @ [146:29] ==> private final fun base64value(c: Char): Int? defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapParser.MappingStream[SimpleFunctionDescriptorImpl]

'string' @ [146:41] ==> public final val string: String defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapParser.MappingStream[PropertyDescriptorImpl]

'position' @ [146:48] ==> public final var position: Int defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapParser.MappingStream[PropertyDescriptorImpl]

'digit' @ [148:34] ==> val digit: Int defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapParser.MappingStream.readInt[LocalVariableDescriptor]

'value' @ [149:17] ==> var value: Int defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapParser.MappingStream.readInt[LocalVariableDescriptor]

'value' @ [149:25] ==> var value: Int defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapParser.MappingStream.readInt[LocalVariableDescriptor]

'digitValue' @ [149:35] ==> val digitValue: Int defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapParser.MappingStream.readInt[LocalVariableDescriptor]

'shift' @ [149:50] ==> var shift: Int defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapParser.MappingStream.readInt[LocalVariableDescriptor]

'==' @ [151:21] ==> public open fun equals(other: Any?): Boolean defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'digit' @ [151:22] ==> val digit: Int defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapParser.MappingStream.readInt[LocalVariableDescriptor]

'shift' @ [152:17] ==> var shift: Int defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapParser.MappingStream.readInt[LocalVariableDescriptor]

'value' @ [155:33] ==> var value: Int defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapParser.MappingStream.readInt[LocalVariableDescriptor]

'if ((value and 1) == 0) unsignedValue else -unsignedValue' @ [156:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int?, elseBranch: Int?): Int?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int?

'==' @ [156:24] ==> public open fun equals(other: Any?): Boolean defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'value' @ [156:25] ==> var value: Int defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapParser.MappingStream.readInt[LocalVariableDescriptor]

'unsignedValue' @ [156:44] ==> val unsignedValue: Int defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapParser.MappingStream.readInt[LocalVariableDescriptor]

'-' @ [156:63] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'unsignedValue' @ [156:64] ==> val unsignedValue: Int defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapParser.MappingStream.readInt[LocalVariableDescriptor]

'when (c) {
            in 'A'..'Z' -> c.toInt() - 'A'.toInt()
            in 'a'..'z' -> c.toInt() - 'a'.toInt() + 26
            in '0'..'9' -> c.toInt() - '0'.toInt() + 52
            '+' -> 62
            '/' -> 63
            else -> null
        }' @ [159:50] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Int?, entry1: Int?, entry2: Int?, entry3: Int?, entry4: Int?, entry5: Int?): Int?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Int?

'c' @ [159:56] ==> value-parameter c: Char defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapParser.MappingStream.base64value[ValueParameterDescriptorImpl]

'in' @ [160:13] ==> public open fun contains(value: Char): Boolean defined in kotlin.ranges.CharRange[DeserializedSimpleFunctionDescriptor]

'..' @ [160:16] ==> public final operator fun rangeTo(other: Char): CharRange defined in kotlin.Char[DeserializedSimpleFunctionDescriptor]

'c' @ [160:28] ==> value-parameter c: Char defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapParser.MappingStream.base64value[ValueParameterDescriptorImpl]

'toInt' @ [160:30] ==> public final fun toInt(): Int defined in kotlin.Char[DeserializedSimpleFunctionDescriptor]

'toInt' @ [160:44] ==> public final fun toInt(): Int defined in kotlin.Char[DeserializedSimpleFunctionDescriptor]

'in' @ [161:13] ==> public open fun contains(value: Char): Boolean defined in kotlin.ranges.CharRange[DeserializedSimpleFunctionDescriptor]

'..' @ [161:16] ==> public final operator fun rangeTo(other: Char): CharRange defined in kotlin.Char[DeserializedSimpleFunctionDescriptor]

'c' @ [161:28] ==> value-parameter c: Char defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapParser.MappingStream.base64value[ValueParameterDescriptorImpl]

'toInt' @ [161:30] ==> public final fun toInt(): Int defined in kotlin.Char[DeserializedSimpleFunctionDescriptor]

'toInt' @ [161:44] ==> public final fun toInt(): Int defined in kotlin.Char[DeserializedSimpleFunctionDescriptor]

'in' @ [162:13] ==> public open fun contains(value: Char): Boolean defined in kotlin.ranges.CharRange[DeserializedSimpleFunctionDescriptor]

'..' @ [162:16] ==> public final operator fun rangeTo(other: Char): CharRange defined in kotlin.Char[DeserializedSimpleFunctionDescriptor]

'c' @ [162:28] ==> value-parameter c: Char defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapParser.MappingStream.base64value[ValueParameterDescriptorImpl]

'toInt' @ [162:30] ==> public final fun toInt(): Int defined in kotlin.Char[DeserializedSimpleFunctionDescriptor]

'toInt' @ [162:44] ==> public final fun toInt(): Int defined in kotlin.Char[DeserializedSimpleFunctionDescriptor]

'SourceMapError' @ [168:58] ==> public constructor SourceMapError(message: String) defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapError[ClassConstructorDescriptorImpl]

'position' @ [168:106] ==> public final var position: Int defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapParser.MappingStream[PropertyDescriptorImpl]

'error' @ [168:117] ==> value-parameter error: String defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapParser.MappingStream.createError[ValueParameterDescriptorImpl]

