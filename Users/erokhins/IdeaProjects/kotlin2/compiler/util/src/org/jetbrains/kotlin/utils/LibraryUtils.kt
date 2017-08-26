'getInstance' @ [28:30] ==> @NotNull public open fun getInstance(@NotNull p0: raw (Class<(Any..Any?)>..Class<*>)): Logger defined in com.intellij.openapi.diagnostic.Logger[JavaMethodDescriptor]

'LibraryUtils' @ [28:42] ==> public object LibraryUtils defined in org.jetbrains.kotlin.utils in file LibraryUtils.kt[FakeCallableDescriptorForObject]

'java' @ [28:62] ==> public val <T> KClass<LibraryUtils>.java: Class<LibraryUtils> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> LibraryUtils

'META_INF' @ [33:36] ==> public final val META_INF: String defined in org.jetbrains.kotlin.utils.LibraryUtils[PropertyDescriptorImpl]

'LibraryUtils' @ [38:34] ==> public object LibraryUtils defined in org.jetbrains.kotlin.utils in file LibraryUtils.kt[FakeCallableDescriptorForObject]

'java' @ [38:54] ==> public val <T> KClass<LibraryUtils>.java: Class<LibraryUtils> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> LibraryUtils

'getResourceAsStream' @ [38:59] ==> public open fun getResourceAsStream(p0: (String..String?)): (InputStream..InputStream?) defined in java.lang.Class[JavaMethodDescriptor]

'if (manifestProperties != null) {
            try {
                val properties = Properties()
                properties.load(manifestProperties)
                jsStdLib = properties.getPropertyOrFail("manifest.impl.title.kotlin.javascript.stdlib")
            }
            catch (e: IOException) {
                LOG.error(e)
            }

        }
        else {
            LOG.error("Resource 'kotlinManifest.properties' not found.")
        }' @ [39:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'manifestProperties' @ [39:13] ==> val manifestProperties: (InputStream..InputStream?) defined in org.jetbrains.kotlin.utils.LibraryUtils.<init>[LocalVariableDescriptor]

'Properties' @ [41:34] ==> public constructor Properties() defined in java.util.Properties[JavaClassConstructorDescriptor]

'properties' @ [42:17] ==> val properties: Properties defined in org.jetbrains.kotlin.utils.LibraryUtils.<init>[LocalVariableDescriptor]

'load' @ [42:28] ==> public open fun load(p0: (InputStream..InputStream?)): Unit defined in java.util.Properties[JavaMethodDescriptor]

'manifestProperties' @ [42:33] ==> val manifestProperties: (InputStream..InputStream?) defined in org.jetbrains.kotlin.utils.LibraryUtils.<init>[LocalVariableDescriptor]

'jsStdLib' @ [43:17] ==> var jsStdLib: String defined in org.jetbrains.kotlin.utils.LibraryUtils.<init>[LocalVariableDescriptor]

'properties' @ [43:28] ==> val properties: Properties defined in org.jetbrains.kotlin.utils.LibraryUtils.<init>[LocalVariableDescriptor]

'getPropertyOrFail' @ [43:39] ==> private final fun Properties.getPropertyOrFail(propName: String): String defined in org.jetbrains.kotlin.utils.LibraryUtils[SimpleFunctionDescriptorImpl]

'LOG' @ [46:17] ==> private final val LOG: Logger defined in org.jetbrains.kotlin.utils.LibraryUtils[PropertyDescriptorImpl]

'error' @ [46:21] ==> public open fun error(@NotNull p0: Throwable): Unit defined in com.intellij.openapi.diagnostic.Logger[JavaMethodDescriptor]

'e' @ [46:27] ==> val e: IOException defined in org.jetbrains.kotlin.utils.LibraryUtils.<init>[LocalVariableDescriptor]

'LOG' @ [51:13] ==> private final val LOG: Logger defined in org.jetbrains.kotlin.utils.LibraryUtils[PropertyDescriptorImpl]

'error' @ [51:17] ==> public open fun error(@NonNls p0: (String..String?)): Unit defined in com.intellij.openapi.diagnostic.Logger[JavaMethodDescriptor]

'TITLE_KOTLIN_JAVASCRIPT_STDLIB' @ [54:9] ==> private final var TITLE_KOTLIN_JAVASCRIPT_STDLIB: String defined in org.jetbrains.kotlin.utils.LibraryUtils[PropertyDescriptorImpl]

'jsStdLib' @ [54:42] ==> var jsStdLib: String defined in org.jetbrains.kotlin.utils.LibraryUtils.<init>[LocalVariableDescriptor]

'JvmStatic' @ [57:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'classesRoots' @ [58:16] ==> value-parameter classesRoots: List<VirtualFile> defined in org.jetbrains.kotlin.utils.LibraryUtils.getJarFile[ValueParameterDescriptorImpl]

'firstOrNull' @ [58:29] ==> public inline fun <T> Iterable<VirtualFile>.firstOrNull(predicate: (VirtualFile) -> Boolean): VirtualFile? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> VirtualFile

'it' @ [58:43] ==> value-parameter it: VirtualFile defined in org.jetbrains.kotlin.utils.LibraryUtils.getJarFile.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [58:46] ==> public final val VirtualFile.name: String[MyPropertyDescriptor]

'jarName' @ [58:54] ==> value-parameter jarName: String defined in org.jetbrains.kotlin.utils.LibraryUtils.getJarFile[ValueParameterDescriptorImpl]

'Suppress' @ [61:5] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'JvmStatic' @ [62:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'KotlinJavascriptMetadataUtils' @ [62:72] ==> public object KotlinJavascriptMetadataUtils defined in org.jetbrains.kotlin.utils in file KotlinJavascriptMetadataUtils.kt[FakeCallableDescriptorForObject]

'loadMetadata' @ [62:102] ==> @JvmStatic public final fun loadMetadata(file: File): List<KotlinJavascriptMetadata> defined in org.jetbrains.kotlin.utils.KotlinJavascriptMetadataUtils[SimpleFunctionDescriptorImpl]

'library' @ [62:115] ==> value-parameter library: File defined in org.jetbrains.kotlin.utils.LibraryUtils.isKotlinJavascriptLibrary[ValueParameterDescriptorImpl]

'isNotEmpty' @ [62:124] ==> @InlineOnly public inline fun <T> Collection<KotlinJavascriptMetadata>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinJavascriptMetadata

'JvmStatic' @ [64:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'checkAttributeValue' @ [65:16] ==> private final fun checkAttributeValue(library: File, expected: String, attributeName: Attributes.Name): Boolean defined in org.jetbrains.kotlin.utils.LibraryUtils[SimpleFunctionDescriptorImpl]

'library' @ [65:36] ==> value-parameter library: File defined in org.jetbrains.kotlin.utils.LibraryUtils.isKotlinJavascriptStdLibrary[ValueParameterDescriptorImpl]

'TITLE_KOTLIN_JAVASCRIPT_STDLIB' @ [65:45] ==> private final var TITLE_KOTLIN_JAVASCRIPT_STDLIB: String defined in org.jetbrains.kotlin.utils.LibraryUtils[PropertyDescriptorImpl]

'IMPLEMENTATION_TITLE' @ [65:93] ==> public final val IMPLEMENTATION_TITLE: (Attributes.Name..Attributes.Name?) defined in java.util.jar.Attributes.Name[JavaPropertyDescriptor]

'!' @ [69:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'library' @ [69:14] ==> value-parameter library: File defined in org.jetbrains.kotlin.utils.LibraryUtils.getManifestFromJar[ValueParameterDescriptorImpl]

'canRead' @ [69:22] ==> public open fun canRead(): Boolean defined in java.io.File[JavaMethodDescriptor]

'JarFile' @ [72:13] ==> public constructor JarFile(p0: (File..File?)) defined in java.util.jar.JarFile[JavaClassConstructorDescriptor]

'library' @ [72:21] ==> value-parameter library: File defined in org.jetbrains.kotlin.utils.LibraryUtils.getManifestFromJar[ValueParameterDescriptorImpl]

'use' @ [72:30] ==> @InlineOnly public inline fun <T : Closeable?, R> JarFile.use(block: (JarFile) -> Nothing): Nothing defined in kotlin.io[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Closeable?> -> JarFile
    <R> -> Nothing

'jarFile' @ [73:24] ==> value-parameter jarFile: JarFile defined in org.jetbrains.kotlin.utils.LibraryUtils.getManifestFromJar.<anonymous>[ValueParameterDescriptorImpl]

'manifest' @ [73:32] ==> public final val JarFile.manifest: (Manifest..Manifest?)[MyPropertyDescriptor]

'!' @ [82:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'library' @ [82:14] ==> value-parameter library: File defined in org.jetbrains.kotlin.utils.LibraryUtils.getManifestFromDirectory[ValueParameterDescriptorImpl]

'canRead' @ [82:22] ==> public open fun canRead(): Boolean defined in java.io.File[JavaMethodDescriptor]

'!' @ [82:35] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'library' @ [82:36] ==> value-parameter library: File defined in org.jetbrains.kotlin.utils.LibraryUtils.getManifestFromDirectory[ValueParameterDescriptorImpl]

'isDirectory' @ [82:44] ==> public final val File.isDirectory: Boolean[MyPropertyDescriptor]

'File' @ [84:28] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'library' @ [84:33] ==> value-parameter library: File defined in org.jetbrains.kotlin.utils.LibraryUtils.getManifestFromDirectory[ValueParameterDescriptorImpl]

'MANIFEST_PATH' @ [84:42] ==> private final val MANIFEST_PATH: String defined in org.jetbrains.kotlin.utils.LibraryUtils[PropertyDescriptorImpl]

'!' @ [85:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'manifestFile' @ [85:14] ==> val manifestFile: File defined in org.jetbrains.kotlin.utils.LibraryUtils.getManifestFromDirectory[LocalVariableDescriptor]

'exists' @ [85:27] ==> public open fun exists(): Boolean defined in java.io.File[JavaMethodDescriptor]

'FileInputStream' @ [88:31] ==> public constructor FileInputStream(p0: (File..File?)) defined in java.io.FileInputStream[JavaClassConstructorDescriptor]

'manifestFile' @ [88:47] ==> val manifestFile: File defined in org.jetbrains.kotlin.utils.LibraryUtils.getManifestFromDirectory[LocalVariableDescriptor]

'Manifest' @ [90:24] ==> public constructor Manifest(p0: (InputStream..InputStream?)) defined in java.util.jar.Manifest[JavaClassConstructorDescriptor]

'inputStream' @ [90:33] ==> val inputStream: FileInputStream defined in org.jetbrains.kotlin.utils.LibraryUtils.getManifestFromDirectory[LocalVariableDescriptor]

'inputStream' @ [93:17] ==> val inputStream: FileInputStream defined in org.jetbrains.kotlin.utils.LibraryUtils.getManifestFromDirectory[LocalVariableDescriptor]

'close' @ [93:29] ==> public open fun close(): Unit defined in java.io.FileInputStream[JavaMethodDescriptor]

'LOG' @ [97:13] ==> private final val LOG: Logger defined in org.jetbrains.kotlin.utils.LibraryUtils[PropertyDescriptorImpl]

'warn' @ [97:17] ==> public open fun warn(@NonNls p0: (String..String?)): Unit defined in com.intellij.openapi.diagnostic.Logger[JavaMethodDescriptor]

'+' @ [97:22] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'ignored' @ [97:39] ==> val ignored: IOException defined in org.jetbrains.kotlin.utils.LibraryUtils.getManifestFromDirectory[LocalVariableDescriptor]

'if (library.isDirectory) getManifestFromDirectory(library) else getManifestFromJar(library)' @ [103:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Manifest?, elseBranch: Manifest?): Manifest?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Manifest?

'library' @ [103:17] ==> value-parameter library: File defined in org.jetbrains.kotlin.utils.LibraryUtils.getManifestFromJarOrDirectory[ValueParameterDescriptorImpl]

'isDirectory' @ [103:25] ==> public final val File.isDirectory: Boolean[MyPropertyDescriptor]

'getManifestFromDirectory' @ [103:38] ==> private final fun getManifestFromDirectory(library: File): Manifest? defined in org.jetbrains.kotlin.utils.LibraryUtils[SimpleFunctionDescriptorImpl]

'library' @ [103:63] ==> value-parameter library: File defined in org.jetbrains.kotlin.utils.LibraryUtils.getManifestFromJarOrDirectory[ValueParameterDescriptorImpl]

'getManifestFromJar' @ [103:77] ==> private final fun getManifestFromJar(library: File): Manifest? defined in org.jetbrains.kotlin.utils.LibraryUtils[SimpleFunctionDescriptorImpl]

'library' @ [103:96] ==> value-parameter library: File defined in org.jetbrains.kotlin.utils.LibraryUtils.getManifestFromJarOrDirectory[ValueParameterDescriptorImpl]

'getManifestFromJarOrDirectory' @ [106:13] ==> private final fun getManifestFromJarOrDirectory(library: File): Manifest? defined in org.jetbrains.kotlin.utils.LibraryUtils[SimpleFunctionDescriptorImpl]

'library' @ [106:43] ==> value-parameter library: File defined in org.jetbrains.kotlin.utils.LibraryUtils.getManifestMainAttributesFromJarOrDirectory[ValueParameterDescriptorImpl]

'mainAttributes' @ [106:53] ==> public final val Manifest.mainAttributes: (Attributes..Attributes?)[MyPropertyDescriptor]

'getManifestMainAttributesFromJarOrDirectory' @ [109:26] ==> private final fun getManifestMainAttributesFromJarOrDirectory(library: File): Attributes? defined in org.jetbrains.kotlin.utils.LibraryUtils[SimpleFunctionDescriptorImpl]

'library' @ [109:70] ==> value-parameter library: File defined in org.jetbrains.kotlin.utils.LibraryUtils.checkAttributeValue[ValueParameterDescriptorImpl]

'attributes' @ [110:21] ==> val attributes: Attributes? defined in org.jetbrains.kotlin.utils.LibraryUtils.checkAttributeValue[LocalVariableDescriptor]

'getValue' @ [110:33] ==> public open fun getValue(p0: (Attributes.Name..Attributes.Name?)): (String..String?) defined in java.util.jar.Attributes[JavaMethodDescriptor]

'attributeName' @ [110:42] ==> value-parameter attributeName: Attributes.Name defined in org.jetbrains.kotlin.utils.LibraryUtils.checkAttributeValue[ValueParameterDescriptorImpl]

'value' @ [111:16] ==> val value: String? defined in org.jetbrains.kotlin.utils.LibraryUtils.checkAttributeValue[LocalVariableDescriptor]

'value' @ [111:33] ==> val value: String? defined in org.jetbrains.kotlin.utils.LibraryUtils.checkAttributeValue[LocalVariableDescriptor]

'expected' @ [111:42] ==> value-parameter expected: String defined in org.jetbrains.kotlin.utils.LibraryUtils.checkAttributeValue[ValueParameterDescriptorImpl]

'getProperty' @ [115:21] ==> public open fun getProperty(p0: (String..String?)): (String..String?) defined in java.util.Properties[JavaMethodDescriptor]

'propName' @ [115:33] ==> value-parameter propName: String defined in org.jetbrains.kotlin.utils.LibraryUtils.getPropertyOrFail[ValueParameterDescriptorImpl]

'value' @ [117:13] ==> val value: (String..String?) defined in org.jetbrains.kotlin.utils.LibraryUtils.getPropertyOrFail[LocalVariableDescriptor]

'ByteArrayOutputStream' @ [118:25] ==> public constructor ByteArrayOutputStream() defined in java.io.ByteArrayOutputStream[JavaClassConstructorDescriptor]

'list' @ [119:13] ==> public open fun list(p0: (PrintStream..PrintStream?)): Unit defined in java.util.Properties[JavaMethodDescriptor]

'PrintStream' @ [119:18] ==> public constructor PrintStream(p0: (OutputStream..OutputStream?)) defined in java.io.PrintStream[JavaClassConstructorDescriptor]

'bytes' @ [119:30] ==> val bytes: ByteArrayOutputStream defined in org.jetbrains.kotlin.utils.LibraryUtils.getPropertyOrFail[LocalVariableDescriptor]

'LOG' @ [120:13] ==> private final val LOG: Logger defined in org.jetbrains.kotlin.utils.LibraryUtils[PropertyDescriptorImpl]

'error' @ [120:17] ==> public open fun error(@NonNls p0: (String..String?)): Unit defined in com.intellij.openapi.diagnostic.Logger[JavaMethodDescriptor]

'propName' @ [120:25] ==> value-parameter propName: String defined in org.jetbrains.kotlin.utils.LibraryUtils.getPropertyOrFail[ValueParameterDescriptorImpl]

'bytes' @ [120:48] ==> val bytes: ByteArrayOutputStream defined in org.jetbrains.kotlin.utils.LibraryUtils.getPropertyOrFail[LocalVariableDescriptor]

'value' @ [123:16] ==> val value: (String..String?) defined in org.jetbrains.kotlin.utils.LibraryUtils.getPropertyOrFail[LocalVariableDescriptor]

