'TestCaseWithTmpdir' @ [40:46] ==> public constructor TestCaseWithTmpdir() defined in org.jetbrains.kotlin.test.TestCaseWithTmpdir[JavaClassConstructorDescriptor]

'Throws' @ [41:5] ==> public constructor Throws(vararg exceptionClasses: KClass<out Throwable>) defined in kotlin.jvm.Throws[DeserializedClassConstructorDescriptor]

'Exception' @ [41:13] ==> public final fun <init>(): Exception /* = Exception */ defined in kotlin.Exception[TypeAliasConstructorDescriptorImpl]

'doTestCompiledKotlin' @ [43:9] ==> @Throws private final fun doTestCompiledKotlin(ktFileName: String, configurationKind: ConfigurationKind, useTypeTableInSerializer: Boolean): Unit defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.AbstractLoadJavaClsStubTest[SimpleFunctionDescriptorImpl]

'ktFileName' @ [43:30] ==> value-parameter ktFileName: String defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.AbstractLoadJavaClsStubTest.doTestCompiledKotlin[ValueParameterDescriptorImpl]

'JDK_ONLY' @ [43:60] ==> enum entry JDK_ONLY defined in org.jetbrains.kotlin.test.ConfigurationKind[FakeCallableDescriptorForObject]

'Throws' @ [46:5] ==> public constructor Throws(vararg exceptionClasses: KClass<out Throwable>) defined in kotlin.jvm.Throws[DeserializedClassConstructorDescriptor]

'Exception' @ [46:13] ==> public final fun <init>(): Exception /* = Exception */ defined in kotlin.Exception[TypeAliasConstructorDescriptorImpl]

'File' @ [48:22] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'ktFileName' @ [48:27] ==> value-parameter ktFileName: String defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.AbstractLoadJavaClsStubTest.doTestCompiledKotlin[ValueParameterDescriptorImpl]

'newConfiguration' @ [50:29] ==> @NotNull public open fun newConfiguration(@NotNull p0: ConfigurationKind, @NotNull p1: TestJdkKind, @NotNull vararg p2: (File..File?)): CompilerConfiguration defined in org.jetbrains.kotlin.test.KotlinTestUtils[JavaMethodDescriptor]

'configurationKind' @ [50:46] ==> value-parameter configurationKind: ConfigurationKind defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.AbstractLoadJavaClsStubTest.doTestCompiledKotlin[ValueParameterDescriptorImpl]

'MOCK_JDK' @ [50:77] ==> enum entry MOCK_JDK defined in org.jetbrains.kotlin.test.TestJdkKind[FakeCallableDescriptorForObject]

'getAnnotationsJar' @ [50:87] ==> public open fun getAnnotationsJar(): (File..File?) defined in org.jetbrains.kotlin.test.KotlinTestUtils[JavaMethodDescriptor]

'useTypeTableInSerializer' @ [51:13] ==> value-parameter useTypeTableInSerializer: Boolean defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.AbstractLoadJavaClsStubTest.doTestCompiledKotlin[ValueParameterDescriptorImpl]

'configuration' @ [52:13] ==> val configuration: CompilerConfiguration defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.AbstractLoadJavaClsStubTest.doTestCompiledKotlin[LocalVariableDescriptor]

'put' @ [52:27] ==> public open fun <T : (Any..Any?)> put(@NotNull p0: CompilerConfigurationKey<(Boolean..Boolean?)>, @NotNull p1: Boolean): Unit defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.Boolean..kotlin.Boolean?)

'USE_TYPE_TABLE' @ [52:52] ==> public final val USE_TYPE_TABLE: (CompilerConfigurationKey<(Boolean..Boolean?)>..CompilerConfigurationKey<(Boolean..Boolean?)>?) defined in org.jetbrains.kotlin.config.JVMConfigurationKeys[JavaPropertyDescriptor]

'KotlinCoreEnvironment' @ [54:27] ==> public companion object defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[FakeCallableDescriptorForObject]

'createForTests' @ [54:49] ==> @JvmStatic public final fun createForTests(parentDisposable: Disposable, configuration: CompilerConfiguration, extensionConfigs: EnvironmentConfigFiles): KotlinCoreEnvironment defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.Companion[DeserializedSimpleFunctionDescriptor]

'testRootDisposable' @ [54:64] ==> public final val AbstractLoadJavaClsStubTest.testRootDisposable: Disposable[MyPropertyDescriptor]

'configuration' @ [54:84] ==> val configuration: CompilerConfiguration defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.AbstractLoadJavaClsStubTest.doTestCompiledKotlin[LocalVariableDescriptor]

'JVM_CONFIG_FILES' @ [54:122] ==> enum entry JVM_CONFIG_FILES defined in org.jetbrains.kotlin.cli.jvm.compiler.EnvironmentConfigFiles[FakeCallableDescriptorForObject]

'compileKotlinToDirAndGetModule' @ [55:28] ==> @NotNull public open fun compileKotlinToDirAndGetModule(@NotNull p0: (MutableList<(File..File?)>..List<(File..File?)>), @NotNull p1: File, @NotNull p2: KotlinCoreEnvironment): ModuleDescriptor defined in org.jetbrains.kotlin.jvm.compiler.LoadDescriptorUtil[JavaMethodDescriptor]

'listOf' @ [55:59] ==> public fun <T> listOf(element: File): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'ktFile' @ [55:66] ==> val ktFile: File defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.AbstractLoadJavaClsStubTest.doTestCompiledKotlin[LocalVariableDescriptor]

'tmpdir' @ [55:75] ==> protected/*protected and package*/ final var tmpdir: (File..File?) defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.AbstractLoadJavaClsStubTest[JavaPropertyDescriptor]

'environment' @ [55:83] ==> val environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.AbstractLoadJavaClsStubTest.doTestCompiledKotlin[LocalVariableDescriptor]

'tmpdir' @ [57:26] ==> protected/*protected and package*/ final var tmpdir: (File..File?) defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.AbstractLoadJavaClsStubTest[JavaPropertyDescriptor]

'walk' @ [57:33] ==> public fun File.walk(direction: FileWalkDirection = ...): FileTreeWalk defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'filter' @ [57:40] ==> public fun <T> Sequence<File>.filter(predicate: (File) -> Boolean): Sequence<File> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'it' @ [57:49] ==> value-parameter it: File defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.AbstractLoadJavaClsStubTest.doTestCompiledKotlin.<anonymous>[ValueParameterDescriptorImpl]

'extension' @ [57:52] ==> public val File.extension: String defined in kotlin.io[DeserializedPropertyDescriptor]

'toList' @ [57:75] ==> public fun <T> Sequence<File>.toList(): List<File> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'File' @ [59:23] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'tmpdir' @ [59:28] ==> protected/*protected and package*/ final var tmpdir: (File..File?) defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.AbstractLoadJavaClsStubTest[JavaPropertyDescriptor]

'HashMap' @ [61:28] ==> public final fun <K, V> <init>(): HashMap<String, VirtualFile> /* = HashMap<String, VirtualFile> */ defined in kotlin.collections.HashMap[TypeAliasConstructorDescriptorImpl]
Inferred types:
    <K> -> String
    <V> -> VirtualFile

'LightVirtualFile' @ [62:34] ==> public constructor LightVirtualFile(@NonNls @NotNull p0: String) defined in com.intellij.testFramework.LightVirtualFile[JavaClassConstructorDescriptor]

'testDir' @ [62:51] ==> val testDir: File defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.AbstractLoadJavaClsStubTest.doTestCompiledKotlin[LocalVariableDescriptor]

'absolutePath' @ [62:59] ==> public final val File.absolutePath: (String..String?)[MyPropertyDescriptor]

'fileChildren' @ [63:52] ==> val fileChildren: HashMap<String, VirtualFile> /* = HashMap<String, VirtualFile> */ defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.AbstractLoadJavaClsStubTest.doTestCompiledKotlin[LocalVariableDescriptor]

'name' @ [63:65] ==> value-parameter name: String defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.AbstractLoadJavaClsStubTest.doTestCompiledKotlin.<no name provided>.findChild[ValueParameterDescriptorImpl]

'classFiles' @ [66:9] ==> val classFiles: List<File> defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.AbstractLoadJavaClsStubTest.doTestCompiledKotlin[LocalVariableDescriptor]

'forEach' @ [66:20] ==> @HidesMembers public inline fun <T> Iterable<File>.forEach(action: (File) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'assertTrue' @ [67:20] ==> public open fun assertTrue(p0: Boolean): Unit defined in org.junit.Assert[JavaMethodDescriptor]

'classFile' @ [67:31] ==> value-parameter classFile: File defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.AbstractLoadJavaClsStubTest.doTestCompiledKotlin.<anonymous>[ValueParameterDescriptorImpl]

'parent' @ [67:41] ==> public final val File.parent: (String..String?)[MyPropertyDescriptor]

'testDir' @ [67:51] ==> val testDir: File defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.AbstractLoadJavaClsStubTest.doTestCompiledKotlin[LocalVariableDescriptor]

'absolutePath' @ [67:59] ==> public final val File.absolutePath: (String..String?)[MyPropertyDescriptor]

'fileChildren' @ [68:13] ==> val fileChildren: HashMap<String, VirtualFile> /* = HashMap<String, VirtualFile> */ defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.AbstractLoadJavaClsStubTest.doTestCompiledKotlin[LocalVariableDescriptor]

'classFile' @ [68:26] ==> value-parameter classFile: File defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.AbstractLoadJavaClsStubTest.doTestCompiledKotlin.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [68:36] ==> public final val File.name: (String..String?)[MyPropertyDescriptor]

'BinaryLightVirtualFile' @ [68:53] ==> public constructor BinaryLightVirtualFile(@NonNls p0: (String..String?), @NotNull p1: ByteArray) defined in com.intellij.testFramework.BinaryLightVirtualFile[JavaClassConstructorDescriptor]

'classFile' @ [68:76] ==> value-parameter classFile: File defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.AbstractLoadJavaClsStubTest.doTestCompiledKotlin.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [68:86] ==> public final val File.name: (String..String?)[MyPropertyDescriptor]

'classFile' @ [68:92] ==> value-parameter classFile: File defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.AbstractLoadJavaClsStubTest.doTestCompiledKotlin.<anonymous>[ValueParameterDescriptorImpl]

'readBytes' @ [68:102] ==> public fun File.readBytes(): ByteArray defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'parentDir' @ [69:57] ==> val parentDir: <no name provided> defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.AbstractLoadJavaClsStubTest.doTestCompiledKotlin[LocalVariableDescriptor]

'fileChildren' @ [73:22] ==> val fileChildren: HashMap<String, VirtualFile> /* = HashMap<String, VirtualFile> */ defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.AbstractLoadJavaClsStubTest.doTestCompiledKotlin[LocalVariableDescriptor]

'values' @ [73:35] ==> public open val values: MutableCollection<VirtualFile> defined in java.util.HashMap[JavaPropertyDescriptor]

'createByFile' @ [74:47] ==> public open fun createByFile(@NotNull p0: VirtualFile): (FileContent..FileContent?) defined in com.intellij.util.indexing.FileContentImpl[JavaMethodDescriptor]

'file' @ [74:60] ==> val file: VirtualFile defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.AbstractLoadJavaClsStubTest.doTestCompiledKotlin[LocalVariableDescriptor]

'KotlinClsStubBuilder' @ [76:35] ==> public constructor KotlinClsStubBuilder() defined in org.jetbrains.kotlin.idea.decompiler.classFile.KotlinClsStubBuilder[DeserializedClassConstructorDescriptor]

'buildFileStub' @ [76:58] ==> public open fun buildFileStub(content: FileContent): PsiFileStub<*>? defined in org.jetbrains.kotlin.idea.decompiler.classFile.KotlinClsStubBuilder[DeserializedSimpleFunctionDescriptor]

'fileContent' @ [76:72] ==> val fileContent: (FileContent..FileContent?) defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.AbstractLoadJavaClsStubTest.doTestCompiledKotlin[LocalVariableDescriptor]

'stubTreeFromCls' @ [78:17] ==> val stubTreeFromCls: PsiFileStub<*>? defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.AbstractLoadJavaClsStubTest.doTestCompiledKotlin[LocalVariableDescriptor]

'run' @ [79:56] ==> @InlineOnly public inline fun <T, R> AbstractLoadJavaClsStubTest.run(block: AbstractLoadJavaClsStubTest.() -> raw (StubElement<(PsiElement..PsiElement?)>..StubElement<*>?)): raw (StubElement<(PsiElement..PsiElement?)>..StubElement<*>?) defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractLoadJavaClsStubTest
    <R> -> raw (com.intellij.psi.stubs.StubElement<(com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)>..com.intellij.psi.stubs.StubElement<*>?)

'KotlinDecompiledFileViewProvider' @ [80:46] ==> public constructor KotlinDecompiledFileViewProvider(manager: PsiManager, file: VirtualFile, physical: Boolean, factory: (KotlinDecompiledFileViewProvider) -> KtDecompiledFile?) defined in org.jetbrains.kotlin.idea.decompiler.KotlinDecompiledFileViewProvider[DeserializedClassConstructorDescriptor]

'getInstance' @ [80:90] ==> @NotNull public open fun getInstance(@NotNull p0: Project): PsiManager defined in com.intellij.psi.PsiManager[JavaMethodDescriptor]

'environment' @ [80:102] ==> val environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.AbstractLoadJavaClsStubTest.doTestCompiledKotlin[LocalVariableDescriptor]

'project' @ [80:114] ==> public final val project: Project defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[DeserializedPropertyDescriptor]

'file' @ [80:124] ==> val file: VirtualFile defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.AbstractLoadJavaClsStubTest.doTestCompiledKotlin[LocalVariableDescriptor]

'KtClsFile' @ [81:25] ==> public constructor KtClsFile(provider: KotlinDecompiledFileViewProvider) defined in org.jetbrains.kotlin.idea.decompiler.classFile.KtClsFile[DeserializedClassConstructorDescriptor]

'provider' @ [81:35] ==> value-parameter provider: KotlinDecompiledFileViewProvider defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.AbstractLoadJavaClsStubTest.doTestCompiledKotlin.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'KtFileStubBuilder' @ [84:21] ==> public constructor KtFileStubBuilder() defined in org.jetbrains.kotlin.psi.stubs.elements.KtFileStubBuilder[JavaClassConstructorDescriptor]

'buildStubTree' @ [84:41] ==> public open fun buildStubTree(@NotNull p0: PsiFile): raw (StubElement<(PsiElement..PsiElement?)>..StubElement<*>?) defined in org.jetbrains.kotlin.psi.stubs.elements.KtFileStubBuilder[JavaMethodDescriptor]

'KtClsFile' @ [84:55] ==> public constructor KtClsFile(provider: KotlinDecompiledFileViewProvider) defined in org.jetbrains.kotlin.idea.decompiler.classFile.KtClsFile[DeserializedClassConstructorDescriptor]

'decompiledProvider' @ [84:65] ==> val decompiledProvider: KotlinDecompiledFileViewProvider defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.AbstractLoadJavaClsStubTest.doTestCompiledKotlin.<anonymous>[LocalVariableDescriptor]

'assertEquals' @ [87:24] ==> public open fun assertEquals(p0: (String..String?), p1: (Any..Any?), p2: (Any..Any?)): Unit defined in org.junit.Assert[JavaMethodDescriptor]

'file' @ [87:46] ==> val file: VirtualFile defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.AbstractLoadJavaClsStubTest.doTestCompiledKotlin[LocalVariableDescriptor]

'name' @ [87:51] ==> public final val VirtualFile.name: String[MyPropertyDescriptor]

'stubsFromDeserializedDescriptors' @ [87:59] ==> val stubsFromDeserializedDescriptors: raw (StubElement<(PsiElement..PsiElement?)>..StubElement<*>?) defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.AbstractLoadJavaClsStubTest.doTestCompiledKotlin[LocalVariableDescriptor]

'serializeToString' @ [87:92] ==> public fun StubElement<out PsiElement>.serializeToString(): String defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder in file AbstractClsStubBuilderTest.kt[SimpleFunctionDescriptorImpl]

'stubTreeFromCls' @ [87:113] ==> val stubTreeFromCls: PsiFileStub<*>? defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.AbstractLoadJavaClsStubTest.doTestCompiledKotlin[LocalVariableDescriptor]

'serializeToString' @ [87:129] ==> public fun StubElement<out PsiElement>.serializeToString(): String defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder in file AbstractClsStubBuilderTest.kt[SimpleFunctionDescriptorImpl]

