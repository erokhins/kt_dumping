'getInstance' @ [29:30] ==> @NotNull public open fun getInstance(@NotNull p0: raw (Class<(Any..Any?)>..Class<*>)): Logger defined in com.intellij.openapi.diagnostic.Logger[JavaMethodDescriptor]

'LibraryUtils' @ [29:42] ==> public object LibraryUtils defined in org.jetbrains.kotlin.utils in file LibraryUtils.kt[FakeCallableDescriptorForObject]

'java' @ [29:62] ==> public val <T> KClass<LibraryUtils>.java: Class<LibraryUtils> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> LibraryUtils

'LibraryUtils' @ [31:41] ==> public object LibraryUtils defined in org.jetbrains.kotlin.utils in file LibraryUtils.kt[FakeCallableDescriptorForObject]

'META_INF' @ [31:54] ==> public final val META_INF: String defined in org.jetbrains.kotlin.utils.LibraryUtils[PropertyDescriptorImpl]

'JvmStatic' @ [33:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'libraries' @ [34:25] ==> value-parameter libraries: List<String> defined in org.jetbrains.kotlin.utils.JsLibraryUtils.copyJsFilesFromLibraries[ValueParameterDescriptorImpl]

'File' @ [35:24] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'library' @ [35:29] ==> val library: String defined in org.jetbrains.kotlin.utils.JsLibraryUtils.copyJsFilesFromLibraries[LocalVariableDescriptor]

'assert' @ [36:13] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'file' @ [36:20] ==> val file: File defined in org.jetbrains.kotlin.utils.JsLibraryUtils.copyJsFilesFromLibraries[LocalVariableDescriptor]

'exists' @ [36:25] ==> public open fun exists(): Boolean defined in java.io.File[JavaMethodDescriptor]

'library' @ [36:47] ==> val library: String defined in org.jetbrains.kotlin.utils.JsLibraryUtils.copyJsFilesFromLibraries[LocalVariableDescriptor]

'if (file.isDirectory) {
                copyJsFilesFromDirectory(file, outputLibraryJsPath, copySourceMap)
            }
            else {
                copyJsFilesFromZip(file, outputLibraryJsPath, copySourceMap)
            }' @ [38:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'file' @ [38:17] ==> val file: File defined in org.jetbrains.kotlin.utils.JsLibraryUtils.copyJsFilesFromLibraries[LocalVariableDescriptor]

'isDirectory' @ [38:22] ==> public final val File.isDirectory: Boolean[MyPropertyDescriptor]

'copyJsFilesFromDirectory' @ [39:17] ==> private final fun copyJsFilesFromDirectory(dir: File, outputLibraryJsPath: String, copySourceMap: Boolean): Unit defined in org.jetbrains.kotlin.utils.JsLibraryUtils[SimpleFunctionDescriptorImpl]

'file' @ [39:42] ==> val file: File defined in org.jetbrains.kotlin.utils.JsLibraryUtils.copyJsFilesFromLibraries[LocalVariableDescriptor]

'outputLibraryJsPath' @ [39:48] ==> value-parameter outputLibraryJsPath: String defined in org.jetbrains.kotlin.utils.JsLibraryUtils.copyJsFilesFromLibraries[ValueParameterDescriptorImpl]

'copySourceMap' @ [39:69] ==> value-parameter copySourceMap: Boolean = ... defined in org.jetbrains.kotlin.utils.JsLibraryUtils.copyJsFilesFromLibraries[ValueParameterDescriptorImpl]

'copyJsFilesFromZip' @ [42:17] ==> private final fun copyJsFilesFromZip(file: File, outputLibraryJsPath: String, copySourceMap: Boolean): Unit defined in org.jetbrains.kotlin.utils.JsLibraryUtils[SimpleFunctionDescriptorImpl]

'file' @ [42:36] ==> val file: File defined in org.jetbrains.kotlin.utils.JsLibraryUtils.copyJsFilesFromLibraries[LocalVariableDescriptor]

'outputLibraryJsPath' @ [42:42] ==> value-parameter outputLibraryJsPath: String defined in org.jetbrains.kotlin.utils.JsLibraryUtils.copyJsFilesFromLibraries[ValueParameterDescriptorImpl]

'copySourceMap' @ [42:63] ==> value-parameter copySourceMap: Boolean = ... defined in org.jetbrains.kotlin.utils.JsLibraryUtils.copyJsFilesFromLibraries[ValueParameterDescriptorImpl]

'JvmStatic' @ [47:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'libs' @ [48:9] ==> value-parameter libs: List<File> defined in org.jetbrains.kotlin.utils.JsLibraryUtils.traverseJsLibraries[ValueParameterDescriptorImpl]

'forEach' @ [48:14] ==> @HidesMembers public inline fun <T> Iterable<File>.forEach(action: (File) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'traverseJsLibrary' @ [48:24] ==> @JvmStatic public final fun traverseJsLibrary(lib: File, action: (JsLibrary) -> Unit): Unit defined in org.jetbrains.kotlin.utils.JsLibraryUtils[SimpleFunctionDescriptorImpl]

'it' @ [48:42] ==> value-parameter it: File defined in org.jetbrains.kotlin.utils.JsLibraryUtils.traverseJsLibraries.<anonymous>[ValueParameterDescriptorImpl]

'action' @ [48:46] ==> value-parameter action: (JsLibrary) -> Unit defined in org.jetbrains.kotlin.utils.JsLibraryUtils.traverseJsLibraries[ValueParameterDescriptorImpl]

'JvmStatic' @ [51:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'when {
            lib.isDirectory -> traverseDirectory(lib, action)
            FileUtil.isJarOrZip(lib) -> traverseArchive(lib, action)
            lib.name.endsWith(KotlinJavascriptMetadataUtils.JS_EXT) -> {
                lib.runIfFileExists(lib.path, action)
                val jsFile = lib.withReplacedExtensionOrNull(
                        KotlinJavascriptMetadataUtils.META_JS_SUFFIX, KotlinJavascriptMetadataUtils.JS_EXT
                )
                jsFile?.runIfFileExists(jsFile.path, action)
            }
        }' @ [52:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit?, entry1: Unit?, entry2: Unit?): Unit?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit?

'lib' @ [53:13] ==> value-parameter lib: File defined in org.jetbrains.kotlin.utils.JsLibraryUtils.traverseJsLibrary[ValueParameterDescriptorImpl]

'isDirectory' @ [53:17] ==> public final val File.isDirectory: Boolean[MyPropertyDescriptor]

'traverseDirectory' @ [53:32] ==> private final fun traverseDirectory(dir: File, action: (JsLibrary) -> Unit): Unit defined in org.jetbrains.kotlin.utils.JsLibraryUtils[SimpleFunctionDescriptorImpl]

'lib' @ [53:50] ==> value-parameter lib: File defined in org.jetbrains.kotlin.utils.JsLibraryUtils.traverseJsLibrary[ValueParameterDescriptorImpl]

'action' @ [53:55] ==> value-parameter action: (JsLibrary) -> Unit defined in org.jetbrains.kotlin.utils.JsLibraryUtils.traverseJsLibrary[ValueParameterDescriptorImpl]

'isJarOrZip' @ [54:22] ==> public open fun isJarOrZip(@NotNull p0: File): Boolean defined in com.intellij.openapi.util.io.FileUtil[JavaMethodDescriptor]

'lib' @ [54:33] ==> value-parameter lib: File defined in org.jetbrains.kotlin.utils.JsLibraryUtils.traverseJsLibrary[ValueParameterDescriptorImpl]

'traverseArchive' @ [54:41] ==> private final fun traverseArchive(file: File, action: (JsLibrary) -> Unit): Unit defined in org.jetbrains.kotlin.utils.JsLibraryUtils[SimpleFunctionDescriptorImpl]

'lib' @ [54:57] ==> value-parameter lib: File defined in org.jetbrains.kotlin.utils.JsLibraryUtils.traverseJsLibrary[ValueParameterDescriptorImpl]

'action' @ [54:62] ==> value-parameter action: (JsLibrary) -> Unit defined in org.jetbrains.kotlin.utils.JsLibraryUtils.traverseJsLibrary[ValueParameterDescriptorImpl]

'lib' @ [55:13] ==> value-parameter lib: File defined in org.jetbrains.kotlin.utils.JsLibraryUtils.traverseJsLibrary[ValueParameterDescriptorImpl]

'name' @ [55:17] ==> public final val File.name: (String..String?)[MyPropertyDescriptor]

'endsWith' @ [55:22] ==> public fun String.endsWith(suffix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'JS_EXT' @ [55:61] ==> public const final val JS_EXT: String defined in org.jetbrains.kotlin.utils.KotlinJavascriptMetadataUtils[PropertyDescriptorImpl]

'lib' @ [56:17] ==> value-parameter lib: File defined in org.jetbrains.kotlin.utils.JsLibraryUtils.traverseJsLibrary[ValueParameterDescriptorImpl]

'runIfFileExists' @ [56:21] ==> private final fun File.runIfFileExists(relativePath: String, action: (JsLibrary) -> Unit): Unit defined in org.jetbrains.kotlin.utils.JsLibraryUtils[SimpleFunctionDescriptorImpl]

'lib' @ [56:37] ==> value-parameter lib: File defined in org.jetbrains.kotlin.utils.JsLibraryUtils.traverseJsLibrary[ValueParameterDescriptorImpl]

'path' @ [56:41] ==> public final val File.path: (String..String?)[MyPropertyDescriptor]

'action' @ [56:47] ==> value-parameter action: (JsLibrary) -> Unit defined in org.jetbrains.kotlin.utils.JsLibraryUtils.traverseJsLibrary[ValueParameterDescriptorImpl]

'lib' @ [57:30] ==> value-parameter lib: File defined in org.jetbrains.kotlin.utils.JsLibraryUtils.traverseJsLibrary[ValueParameterDescriptorImpl]

'withReplacedExtensionOrNull' @ [57:34] ==> public fun File.withReplacedExtensionOrNull(oldExt: String, newExt: String): File? defined in org.jetbrains.kotlin.utils.fileUtils in file fileUtils.kt[SimpleFunctionDescriptorImpl]

'META_JS_SUFFIX' @ [58:55] ==> public const final val META_JS_SUFFIX: String defined in org.jetbrains.kotlin.utils.KotlinJavascriptMetadataUtils[PropertyDescriptorImpl]

'JS_EXT' @ [58:101] ==> public const final val JS_EXT: String defined in org.jetbrains.kotlin.utils.KotlinJavascriptMetadataUtils[PropertyDescriptorImpl]

'jsFile' @ [60:17] ==> val jsFile: File? defined in org.jetbrains.kotlin.utils.JsLibraryUtils.traverseJsLibrary[LocalVariableDescriptor]

'runIfFileExists' @ [60:25] ==> private final fun File.runIfFileExists(relativePath: String, action: (JsLibrary) -> Unit): Unit defined in org.jetbrains.kotlin.utils.JsLibraryUtils[SimpleFunctionDescriptorImpl]

'jsFile' @ [60:41] ==> val jsFile: File? defined in org.jetbrains.kotlin.utils.JsLibraryUtils.traverseJsLibrary[LocalVariableDescriptor]

'path' @ [60:48] ==> public final val File.path: (String..String?)[MyPropertyDescriptor]

'action' @ [60:54] ==> value-parameter action: (JsLibrary) -> Unit defined in org.jetbrains.kotlin.utils.JsLibraryUtils.traverseJsLibrary[ValueParameterDescriptorImpl]

'isFile' @ [66:13] ==> public final val File.isFile: Boolean[MyPropertyDescriptor]

'invoke' @ [67:13] ==> public abstract operator fun invoke(p1: JsLibrary): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'JsLibrary' @ [67:20] ==> public constructor JsLibrary(content: String, path: String, sourceMapContent: String?) defined in org.jetbrains.kotlin.utils.JsLibrary[ClassConstructorDescriptorImpl]

'readText' @ [67:30] ==> public fun File.readText(charset: Charset = ...): String defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'relativePath' @ [67:42] ==> value-parameter relativePath: String defined in org.jetbrains.kotlin.utils.JsLibraryUtils.runIfFileExists[ValueParameterDescriptorImpl]

'correspondingSourceMapFile' @ [67:56] ==> private final fun File.correspondingSourceMapFile(): File defined in org.jetbrains.kotlin.utils.JsLibraryUtils[SimpleFunctionDescriptorImpl]

'contentIfExists' @ [67:85] ==> private final fun File.contentIfExists(): String? defined in org.jetbrains.kotlin.utils.JsLibraryUtils[SimpleFunctionDescriptorImpl]

'traverseDirectory' @ [72:9] ==> private final fun traverseDirectory(dir: File, action: (JsLibrary) -> Unit): Unit defined in org.jetbrains.kotlin.utils.JsLibraryUtils[SimpleFunctionDescriptorImpl]

'dir' @ [72:27] ==> value-parameter dir: File defined in org.jetbrains.kotlin.utils.JsLibraryUtils.copyJsFilesFromDirectory[ValueParameterDescriptorImpl]

'copyLibrary' @ [72:34] ==> private final fun copyLibrary(outputPath: String, library: JsLibrary, copySourceMap: Boolean): Unit defined in org.jetbrains.kotlin.utils.JsLibraryUtils[SimpleFunctionDescriptorImpl]

'outputLibraryJsPath' @ [72:46] ==> value-parameter outputLibraryJsPath: String defined in org.jetbrains.kotlin.utils.JsLibraryUtils.copyJsFilesFromDirectory[ValueParameterDescriptorImpl]

'it' @ [72:67] ==> value-parameter it: JsLibrary defined in org.jetbrains.kotlin.utils.JsLibraryUtils.copyJsFilesFromDirectory.<anonymous>[ValueParameterDescriptorImpl]

'copySourceMap' @ [72:71] ==> value-parameter copySourceMap: Boolean defined in org.jetbrains.kotlin.utils.JsLibraryUtils.copyJsFilesFromDirectory[ValueParameterDescriptorImpl]

'if (exists()) readText() else null' @ [75:51] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String?, elseBranch: String?): String?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String?

'exists' @ [75:55] ==> public open fun exists(): Boolean defined in java.io.File[JavaMethodDescriptor]

'readText' @ [75:65] ==> public fun File.readText(charset: Charset = ...): String defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'File' @ [77:59] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'parentFile' @ [77:64] ==> public final val File.parentFile: (File..File?)[MyPropertyDescriptor]

'name' @ [77:76] ==> public final val File.name: (String..String?)[MyPropertyDescriptor]

'processFilesRecursively' @ [80:18] ==> public open fun processFilesRecursively(@NotNull p0: File, @NotNull p1: Processor<(File..File?)>): Boolean defined in com.intellij.openapi.util.io.FileUtil[JavaMethodDescriptor]

'dir' @ [80:42] ==> value-parameter dir: File defined in org.jetbrains.kotlin.utils.JsLibraryUtils.processDirectory[ValueParameterDescriptorImpl]

'Processor' @ [80:47] ==> public fun <T : (Any..Any?)> Processor(function: ((File..File?)) -> Boolean): Processor<File> defined in com.intellij.util[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : (Any..Any?)> -> File

'?:' @ [81:32] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: String?, right: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> String

'getRelativePath' @ [81:41] ==> @Nullable public open fun getRelativePath(p0: (File..File?), p1: (File..File?)): String? defined in com.intellij.openapi.util.io.FileUtil[JavaMethodDescriptor]

'dir' @ [81:57] ==> value-parameter dir: File defined in org.jetbrains.kotlin.utils.JsLibraryUtils.processDirectory[ValueParameterDescriptorImpl]

'file' @ [81:62] ==> value-parameter file: (File..File?) defined in org.jetbrains.kotlin.utils.JsLibraryUtils.processDirectory.<anonymous>[ValueParameterDescriptorImpl]

'IllegalArgumentException' @ [82:41] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'dir' @ [82:100] ==> value-parameter dir: File defined in org.jetbrains.kotlin.utils.JsLibraryUtils.processDirectory[ValueParameterDescriptorImpl]

'file' @ [82:105] ==> value-parameter file: (File..File?) defined in org.jetbrains.kotlin.utils.JsLibraryUtils.processDirectory.<anonymous>[ValueParameterDescriptorImpl]

'relativePath' @ [83:17] ==> val relativePath: String defined in org.jetbrains.kotlin.utils.JsLibraryUtils.processDirectory.<anonymous>[LocalVariableDescriptor]

'endsWith' @ [83:30] ==> public fun String.endsWith(suffix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'JS_EXT' @ [83:69] ==> public const final val JS_EXT: String defined in org.jetbrains.kotlin.utils.KotlinJavascriptMetadataUtils[PropertyDescriptorImpl]

'getSuggestedPath' @ [84:45] ==> private final fun getSuggestedPath(path: String): String? defined in org.jetbrains.kotlin.utils.JsLibraryUtils[SimpleFunctionDescriptorImpl]

'relativePath' @ [84:62] ==> val relativePath: String defined in org.jetbrains.kotlin.utils.JsLibraryUtils.processDirectory.<anonymous>[LocalVariableDescriptor]

'file' @ [85:17] ==> value-parameter file: (File..File?) defined in org.jetbrains.kotlin.utils.JsLibraryUtils.processDirectory.<anonymous>[ValueParameterDescriptorImpl]

'runIfFileExists' @ [85:22] ==> private final fun File.runIfFileExists(relativePath: String, action: (JsLibrary) -> Unit): Unit defined in org.jetbrains.kotlin.utils.JsLibraryUtils[SimpleFunctionDescriptorImpl]

'suggestedRelativePath' @ [85:38] ==> val suggestedRelativePath: String defined in org.jetbrains.kotlin.utils.JsLibraryUtils.processDirectory.<anonymous>[LocalVariableDescriptor]

'action' @ [85:61] ==> value-parameter action: (JsLibrary) -> Unit defined in org.jetbrains.kotlin.utils.JsLibraryUtils.processDirectory[ValueParameterDescriptorImpl]

'processDirectory' @ [93:13] ==> private final fun processDirectory(dir: File, action: (JsLibrary) -> Unit): Unit defined in org.jetbrains.kotlin.utils.JsLibraryUtils[SimpleFunctionDescriptorImpl]

'dir' @ [93:30] ==> value-parameter dir: File defined in org.jetbrains.kotlin.utils.JsLibraryUtils.traverseDirectory[ValueParameterDescriptorImpl]

'action' @ [93:35] ==> value-parameter action: (JsLibrary) -> Unit defined in org.jetbrains.kotlin.utils.JsLibraryUtils.traverseDirectory[ValueParameterDescriptorImpl]

'LOG' @ [96:13] ==> private final val LOG: Logger defined in org.jetbrains.kotlin.utils.JsLibraryUtils[PropertyDescriptorImpl]

'error' @ [96:17] ==> public open fun error(@NonNls p0: (String..String?)): Unit defined in com.intellij.openapi.diagnostic.Logger[JavaMethodDescriptor]

'dir' @ [96:62] ==> value-parameter dir: File defined in org.jetbrains.kotlin.utils.JsLibraryUtils.traverseDirectory[ValueParameterDescriptorImpl]

'name' @ [96:66] ==> public final val File.name: (String..String?)[MyPropertyDescriptor]

'ex' @ [96:75] ==> val ex: IOException defined in org.jetbrains.kotlin.utils.JsLibraryUtils.traverseDirectory[LocalVariableDescriptor]

'message' @ [96:78] ==> public open val message: String? defined in java.io.IOException[DeserializedPropertyDescriptor]

'traverseArchive' @ [101:9] ==> private final fun traverseArchive(file: File, action: (JsLibrary) -> Unit): Unit defined in org.jetbrains.kotlin.utils.JsLibraryUtils[SimpleFunctionDescriptorImpl]

'file' @ [101:25] ==> value-parameter file: File defined in org.jetbrains.kotlin.utils.JsLibraryUtils.copyJsFilesFromZip[ValueParameterDescriptorImpl]

'copyLibrary' @ [101:33] ==> private final fun copyLibrary(outputPath: String, library: JsLibrary, copySourceMap: Boolean): Unit defined in org.jetbrains.kotlin.utils.JsLibraryUtils[SimpleFunctionDescriptorImpl]

'outputLibraryJsPath' @ [101:45] ==> value-parameter outputLibraryJsPath: String defined in org.jetbrains.kotlin.utils.JsLibraryUtils.copyJsFilesFromZip[ValueParameterDescriptorImpl]

'it' @ [101:66] ==> value-parameter it: JsLibrary defined in org.jetbrains.kotlin.utils.JsLibraryUtils.copyJsFilesFromZip.<anonymous>[ValueParameterDescriptorImpl]

'copySourceMap' @ [101:70] ==> value-parameter copySourceMap: Boolean defined in org.jetbrains.kotlin.utils.JsLibraryUtils.copyJsFilesFromZip[ValueParameterDescriptorImpl]

'File' @ [105:26] ==> public constructor File(p0: (String..String?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'outputPath' @ [105:31] ==> value-parameter outputPath: String defined in org.jetbrains.kotlin.utils.JsLibraryUtils.copyLibrary[ValueParameterDescriptorImpl]

'library' @ [105:43] ==> value-parameter library: JsLibrary defined in org.jetbrains.kotlin.utils.JsLibraryUtils.copyLibrary[ValueParameterDescriptorImpl]

'path' @ [105:51] ==> public final val path: String defined in org.jetbrains.kotlin.utils.JsLibrary[PropertyDescriptorImpl]

'targetFile' @ [106:9] ==> val targetFile: File defined in org.jetbrains.kotlin.utils.JsLibraryUtils.copyLibrary[LocalVariableDescriptor]

'parentFile' @ [106:20] ==> public final val File.parentFile: (File..File?)[MyPropertyDescriptor]

'mkdirs' @ [106:31] ==> public open fun mkdirs(): Boolean defined in java.io.File[JavaMethodDescriptor]

'targetFile' @ [107:9] ==> val targetFile: File defined in org.jetbrains.kotlin.utils.JsLibraryUtils.copyLibrary[LocalVariableDescriptor]

'writeText' @ [107:20] ==> public fun File.writeText(text: String, charset: Charset = ...): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'library' @ [107:30] ==> value-parameter library: JsLibrary defined in org.jetbrains.kotlin.utils.JsLibraryUtils.copyLibrary[ValueParameterDescriptorImpl]

'content' @ [107:38] ==> public final val content: String defined in org.jetbrains.kotlin.utils.JsLibrary[PropertyDescriptorImpl]

'copySourceMap' @ [108:13] ==> value-parameter copySourceMap: Boolean defined in org.jetbrains.kotlin.utils.JsLibraryUtils.copyLibrary[ValueParameterDescriptorImpl]

'library' @ [109:13] ==> value-parameter library: JsLibrary defined in org.jetbrains.kotlin.utils.JsLibraryUtils.copyLibrary[ValueParameterDescriptorImpl]

'sourceMapContent' @ [109:21] ==> public final val sourceMapContent: String? defined in org.jetbrains.kotlin.utils.JsLibrary[PropertyDescriptorImpl]

'let' @ [109:39] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> Unit

'File' @ [109:45] ==> public constructor File(p0: (String..String?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'targetFile' @ [109:50] ==> val targetFile: File defined in org.jetbrains.kotlin.utils.JsLibraryUtils.copyLibrary[LocalVariableDescriptor]

'parent' @ [109:61] ==> public final val File.parent: (String..String?)[MyPropertyDescriptor]

'targetFile' @ [109:69] ==> val targetFile: File defined in org.jetbrains.kotlin.utils.JsLibraryUtils.copyLibrary[LocalVariableDescriptor]

'name' @ [109:80] ==> public final val File.name: (String..String?)[MyPropertyDescriptor]

'writeText' @ [109:95] ==> public fun File.writeText(text: String, charset: Charset = ...): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'it' @ [109:105] ==> value-parameter it: String defined in org.jetbrains.kotlin.utils.JsLibraryUtils.copyLibrary.<anonymous>[ValueParameterDescriptorImpl]

'ZipFile' @ [114:23] ==> public constructor ZipFile(p0: (String..String?)) defined in java.util.zip.ZipFile[JavaClassConstructorDescriptor]

'file' @ [114:31] ==> value-parameter file: File defined in org.jetbrains.kotlin.utils.JsLibraryUtils.traverseArchive[ValueParameterDescriptorImpl]

'path' @ [114:36] ==> public final val File.path: (String..String?)[MyPropertyDescriptor]

'zipFile' @ [116:30] ==> val zipFile: ZipFile defined in org.jetbrains.kotlin.utils.JsLibraryUtils.traverseArchive[LocalVariableDescriptor]

'entries' @ [116:38] ==> public open fun entries(): (Enumeration<out (ZipEntry..ZipEntry?)>..Enumeration<out (ZipEntry..ZipEntry?)>?) defined in java.util.zip.ZipFile[JavaMethodDescriptor]

'mutableListOf' @ [117:46] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableListOf(): MutableList<JsLibrary> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsLibrary

'mutableMapOf' @ [118:36] ==> @SinceKotlin @InlineOnly public inline fun <K, V> mutableMapOf(): MutableMap<String, ZipEntry> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> ZipEntry

'zipEntries' @ [120:20] ==> val zipEntries: (Enumeration<out (ZipEntry..ZipEntry?)>..Enumeration<out (ZipEntry..ZipEntry?)>?) defined in org.jetbrains.kotlin.utils.JsLibraryUtils.traverseArchive[LocalVariableDescriptor]

'hasMoreElements' @ [120:31] ==> public abstract fun hasMoreElements(): Boolean defined in java.util.Enumeration[JavaMethodDescriptor]

'zipEntries' @ [121:29] ==> val zipEntries: (Enumeration<out (ZipEntry..ZipEntry?)>..Enumeration<out (ZipEntry..ZipEntry?)>?) defined in org.jetbrains.kotlin.utils.JsLibraryUtils.traverseArchive[LocalVariableDescriptor]

'nextElement' @ [121:40] ==> public abstract fun nextElement(): (ZipEntry..ZipEntry?) defined in java.util.Enumeration[JavaMethodDescriptor]

'entry' @ [122:33] ==> val entry: (ZipEntry..ZipEntry?) defined in org.jetbrains.kotlin.utils.JsLibraryUtils.traverseArchive[LocalVariableDescriptor]

'name' @ [122:39] ==> public final val ZipEntry.name: (String..String?)[MyPropertyDescriptor]

'!' @ [123:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'entry' @ [123:22] ==> val entry: (ZipEntry..ZipEntry?) defined in org.jetbrains.kotlin.utils.JsLibraryUtils.traverseArchive[LocalVariableDescriptor]

'isDirectory' @ [123:28] ==> public final val ZipEntry.isDirectory: Boolean[MyPropertyDescriptor]

'if (entryName.endsWith(KotlinJavascriptMetadataUtils.JS_EXT)) {
                        val relativePath = getSuggestedPath(entryName) ?: continue

                        val stream = zipFile.getInputStream(entry)
                        val content = FileUtil.loadTextAndClose(stream)
                        librariesWithoutSourceMaps += JsLibrary(content, relativePath, null)
                    }
                    else if (entryName.endsWith(KotlinJavascriptMetadataUtils.JS_MAP_EXT)) {
                        val correspondingJsPath = entryName.removeSuffix(KotlinJavascriptMetadataUtils.JS_MAP_EXT) +
                                                  KotlinJavascriptMetadataUtils.JS_EXT
                        possibleMapFiles[correspondingJsPath] = entry
                    }' @ [124:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'entryName' @ [124:25] ==> val entryName: (String..String?) defined in org.jetbrains.kotlin.utils.JsLibraryUtils.traverseArchive[LocalVariableDescriptor]

'endsWith' @ [124:35] ==> public fun String.endsWith(suffix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'JS_EXT' @ [124:74] ==> public const final val JS_EXT: String defined in org.jetbrains.kotlin.utils.KotlinJavascriptMetadataUtils[PropertyDescriptorImpl]

'getSuggestedPath' @ [125:44] ==> private final fun getSuggestedPath(path: String): String? defined in org.jetbrains.kotlin.utils.JsLibraryUtils[SimpleFunctionDescriptorImpl]

'entryName' @ [125:61] ==> val entryName: (String..String?) defined in org.jetbrains.kotlin.utils.JsLibraryUtils.traverseArchive[LocalVariableDescriptor]

'zipFile' @ [127:38] ==> val zipFile: ZipFile defined in org.jetbrains.kotlin.utils.JsLibraryUtils.traverseArchive[LocalVariableDescriptor]

'getInputStream' @ [127:46] ==> public open fun getInputStream(p0: (ZipEntry..ZipEntry?)): (InputStream..InputStream?) defined in java.util.zip.ZipFile[JavaMethodDescriptor]

'entry' @ [127:61] ==> val entry: (ZipEntry..ZipEntry?) defined in org.jetbrains.kotlin.utils.JsLibraryUtils.traverseArchive[LocalVariableDescriptor]

'loadTextAndClose' @ [128:48] ==> @NotNull public open fun loadTextAndClose(@NotNull p0: InputStream): String defined in com.intellij.openapi.util.io.FileUtil[JavaMethodDescriptor]

'stream' @ [128:65] ==> val stream: (InputStream..InputStream?) defined in org.jetbrains.kotlin.utils.JsLibraryUtils.traverseArchive[LocalVariableDescriptor]

'librariesWithoutSourceMaps' @ [129:25] ==> val librariesWithoutSourceMaps: MutableList<JsLibrary> defined in org.jetbrains.kotlin.utils.JsLibraryUtils.traverseArchive[LocalVariableDescriptor]

'JsLibrary' @ [129:55] ==> public constructor JsLibrary(content: String, path: String, sourceMapContent: String?) defined in org.jetbrains.kotlin.utils.JsLibrary[ClassConstructorDescriptorImpl]

'content' @ [129:65] ==> val content: String defined in org.jetbrains.kotlin.utils.JsLibraryUtils.traverseArchive[LocalVariableDescriptor]

'relativePath' @ [129:74] ==> val relativePath: String defined in org.jetbrains.kotlin.utils.JsLibraryUtils.traverseArchive[LocalVariableDescriptor]

'entryName' @ [131:30] ==> val entryName: (String..String?) defined in org.jetbrains.kotlin.utils.JsLibraryUtils.traverseArchive[LocalVariableDescriptor]

'endsWith' @ [131:40] ==> public fun String.endsWith(suffix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'JS_MAP_EXT' @ [131:79] ==> public const final val JS_MAP_EXT: String defined in org.jetbrains.kotlin.utils.KotlinJavascriptMetadataUtils[PropertyDescriptorImpl]

'entryName' @ [132:51] ==> val entryName: (String..String?) defined in org.jetbrains.kotlin.utils.JsLibraryUtils.traverseArchive[LocalVariableDescriptor]

'removeSuffix' @ [132:61] ==> public fun String.removeSuffix(suffix: CharSequence): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'JS_MAP_EXT' @ [132:104] ==> public const final val JS_MAP_EXT: String defined in org.jetbrains.kotlin.utils.KotlinJavascriptMetadataUtils[PropertyDescriptorImpl]

'JS_EXT' @ [133:81] ==> public const final val JS_EXT: String defined in org.jetbrains.kotlin.utils.KotlinJavascriptMetadataUtils[PropertyDescriptorImpl]

'possibleMapFiles' @ [134:25] ==> val possibleMapFiles: MutableMap<String, ZipEntry> defined in org.jetbrains.kotlin.utils.JsLibraryUtils.traverseArchive[LocalVariableDescriptor]

'correspondingJsPath' @ [134:42] ==> val correspondingJsPath: String defined in org.jetbrains.kotlin.utils.JsLibraryUtils.traverseArchive[LocalVariableDescriptor]

'entry' @ [134:65] ==> val entry: (ZipEntry..ZipEntry?) defined in org.jetbrains.kotlin.utils.JsLibraryUtils.traverseArchive[LocalVariableDescriptor]

'librariesWithoutSourceMaps' @ [139:13] ==> val librariesWithoutSourceMaps: MutableList<JsLibrary> defined in org.jetbrains.kotlin.utils.JsLibraryUtils.traverseArchive[LocalVariableDescriptor]

'map' @ [140:22] ==> public inline fun <T, R> Iterable<JsLibrary>.map(transform: (JsLibrary) -> JsLibrary): List<JsLibrary> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsLibrary
    <R> -> JsLibrary

'possibleMapFiles' @ [141:40] ==> val possibleMapFiles: MutableMap<String, ZipEntry> defined in org.jetbrains.kotlin.utils.JsLibraryUtils.traverseArchive[LocalVariableDescriptor]

'it' @ [141:57] ==> value-parameter it: JsLibrary defined in org.jetbrains.kotlin.utils.JsLibraryUtils.traverseArchive.<anonymous>[ValueParameterDescriptorImpl]

'path' @ [141:60] ==> public final val path: String defined in org.jetbrains.kotlin.utils.JsLibrary[PropertyDescriptorImpl]

'if (zipEntry != null) {
                            val stream = zipFile.getInputStream(zipEntry)
                            val content = FileUtil.loadTextAndClose(stream)
                            it.copy(sourceMapContent = content)
                        }
                        else {
                            it
                        }' @ [142:25] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: JsLibrary, elseBranch: JsLibrary): JsLibrary[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> JsLibrary

'zipEntry' @ [142:29] ==> val zipEntry: ZipEntry? defined in org.jetbrains.kotlin.utils.JsLibraryUtils.traverseArchive.<anonymous>[LocalVariableDescriptor]

'zipFile' @ [143:42] ==> val zipFile: ZipFile defined in org.jetbrains.kotlin.utils.JsLibraryUtils.traverseArchive[LocalVariableDescriptor]

'getInputStream' @ [143:50] ==> public open fun getInputStream(p0: (ZipEntry..ZipEntry?)): (InputStream..InputStream?) defined in java.util.zip.ZipFile[JavaMethodDescriptor]

'zipEntry' @ [143:65] ==> val zipEntry: ZipEntry? defined in org.jetbrains.kotlin.utils.JsLibraryUtils.traverseArchive.<anonymous>[LocalVariableDescriptor]

'loadTextAndClose' @ [144:52] ==> @NotNull public open fun loadTextAndClose(@NotNull p0: InputStream): String defined in com.intellij.openapi.util.io.FileUtil[JavaMethodDescriptor]

'stream' @ [144:69] ==> val stream: (InputStream..InputStream?) defined in org.jetbrains.kotlin.utils.JsLibraryUtils.traverseArchive.<anonymous>[LocalVariableDescriptor]

'it' @ [145:29] ==> value-parameter it: JsLibrary defined in org.jetbrains.kotlin.utils.JsLibraryUtils.traverseArchive.<anonymous>[ValueParameterDescriptorImpl]

'copy' @ [145:32] ==> public final fun copy(content: String = ..., path: String = ..., sourceMapContent: String? = ...): JsLibrary defined in org.jetbrains.kotlin.utils.JsLibrary[SimpleFunctionDescriptorImpl]

'content' @ [145:56] ==> val content: String defined in org.jetbrains.kotlin.utils.JsLibraryUtils.traverseArchive.<anonymous>[LocalVariableDescriptor]

'it' @ [148:29] ==> value-parameter it: JsLibrary defined in org.jetbrains.kotlin.utils.JsLibraryUtils.traverseArchive.<anonymous>[ValueParameterDescriptorImpl]

'forEach' @ [151:22] ==> @HidesMembers public inline fun <T> Iterable<JsLibrary>.forEach(action: (JsLibrary) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsLibrary

'action' @ [151:30] ==> value-parameter action: (JsLibrary) -> Unit defined in org.jetbrains.kotlin.utils.JsLibraryUtils.traverseArchive[ValueParameterDescriptorImpl]

'LOG' @ [154:13] ==> private final val LOG: Logger defined in org.jetbrains.kotlin.utils.JsLibraryUtils[PropertyDescriptorImpl]

'error' @ [154:17] ==> public open fun error(@NonNls p0: (String..String?)): Unit defined in com.intellij.openapi.diagnostic.Logger[JavaMethodDescriptor]

'file' @ [154:63] ==> value-parameter file: File defined in org.jetbrains.kotlin.utils.JsLibraryUtils.traverseArchive[ValueParameterDescriptorImpl]

'name' @ [154:68] ==> public final val File.name: (String..String?)[MyPropertyDescriptor]

'ex' @ [154:77] ==> val ex: IOException defined in org.jetbrains.kotlin.utils.JsLibraryUtils.traverseArchive[LocalVariableDescriptor]

'message' @ [154:80] ==> public open val message: String? defined in java.io.IOException[DeserializedPropertyDescriptor]

'zipFile' @ [157:13] ==> val zipFile: ZipFile defined in org.jetbrains.kotlin.utils.JsLibraryUtils.traverseArchive[LocalVariableDescriptor]

'close' @ [157:21] ==> public open fun close(): Unit defined in java.util.zip.ZipFile[JavaMethodDescriptor]

'toSystemIndependentName' @ [162:46] ==> @NotNull public open fun toSystemIndependentName(@NotNull p0: String): String defined in com.intellij.openapi.util.io.FileUtil[JavaMethodDescriptor]

'path' @ [162:70] ==> value-parameter path: String defined in org.jetbrains.kotlin.utils.JsLibraryUtils.getSuggestedPath[ValueParameterDescriptorImpl]

'systemIndependentPath' @ [163:13] ==> val systemIndependentPath: String defined in org.jetbrains.kotlin.utils.JsLibraryUtils.getSuggestedPath[LocalVariableDescriptor]

'startsWith' @ [163:35] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'META_INF' @ [163:59] ==> public final val META_INF: String defined in org.jetbrains.kotlin.utils.LibraryUtils[PropertyDescriptorImpl]

'systemIndependentPath' @ [164:17] ==> val systemIndependentPath: String defined in org.jetbrains.kotlin.utils.JsLibraryUtils.getSuggestedPath[LocalVariableDescriptor]

'startsWith' @ [164:39] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'META_INF_RESOURCES' @ [164:50] ==> private final val META_INF_RESOURCES: String defined in org.jetbrains.kotlin.utils.JsLibraryUtils[PropertyDescriptorImpl]

'path' @ [165:24] ==> value-parameter path: String defined in org.jetbrains.kotlin.utils.JsLibraryUtils.getSuggestedPath[ValueParameterDescriptorImpl]

'substring' @ [165:29] ==> @InlineOnly public inline fun String.substring(startIndex: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'META_INF_RESOURCES' @ [165:39] ==> private final val META_INF_RESOURCES: String defined in org.jetbrains.kotlin.utils.JsLibraryUtils[PropertyDescriptorImpl]

'length' @ [165:58] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'path' @ [170:16] ==> value-parameter path: String defined in org.jetbrains.kotlin.utils.JsLibraryUtils.getSuggestedPath[ValueParameterDescriptorImpl]

