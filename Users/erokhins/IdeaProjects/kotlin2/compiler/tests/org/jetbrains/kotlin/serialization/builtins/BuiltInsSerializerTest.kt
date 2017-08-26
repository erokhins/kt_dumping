'TestCaseWithTmpdir' @ [31:32] ==> public constructor TestCaseWithTmpdir() defined in org.jetbrains.kotlin.test.TestCaseWithTmpdir[JavaClassConstructorDescriptor]

'fileName' @ [33:75] ==> value-parameter fileName: String defined in org.jetbrains.kotlin.serialization.builtins.BuiltInsSerializerTest.doTest[ValueParameterDescriptorImpl]

'BuiltInsSerializer' @ [34:9] ==> public constructor BuiltInsSerializer(dependOnOldBuiltIns: Boolean) defined in org.jetbrains.kotlin.serialization.builtins.BuiltInsSerializer[DeserializedClassConstructorDescriptor]

'serialize' @ [34:56] ==> public final fun serialize(destDir: File, srcDirs: List<File>, extraClassPath: List<File>, onComplete: (totalSize: Int, totalFiles: Int) -> Unit): Unit defined in org.jetbrains.kotlin.serialization.builtins.BuiltInsSerializer[DeserializedSimpleFunctionDescriptor]

'tmpdir' @ [35:17] ==> protected/*protected and package*/ final var tmpdir: (File..File?) defined in org.jetbrains.kotlin.serialization.builtins.BuiltInsSerializerTest[JavaPropertyDescriptor]

'listOf' @ [36:27] ==> public fun <T> listOf(element: File): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'File' @ [36:34] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'source' @ [36:39] ==> val source: String defined in org.jetbrains.kotlin.serialization.builtins.BuiltInsSerializerTest.doTest[LocalVariableDescriptor]

'listOf' @ [37:34] ==> public fun <T> listOf(element: File): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'runtimeJarForTests' @ [37:63] ==> @NotNull public open fun runtimeJarForTests(): File defined in org.jetbrains.kotlin.codegen.forTestCompile.ForTestCompileRuntime[JavaMethodDescriptor]

'createEmptyModule' @ [41:38] ==> @NotNull public open fun createEmptyModule(@NotNull p0: String, @NotNull p1: KotlinBuiltIns): ModuleDescriptorImpl defined in org.jetbrains.kotlin.test.KotlinTestUtils[JavaMethodDescriptor]

'Instance' @ [41:84] ==> @JvmStatic public final val Instance: DefaultBuiltIns defined in org.jetbrains.kotlin.builtins.DefaultBuiltIns.Companion[DeserializedPropertyDescriptor]

'BuiltInsLoaderImpl' @ [43:39] ==> public constructor BuiltInsLoaderImpl() defined in org.jetbrains.kotlin.builtins.BuiltInsLoaderImpl[DeserializedClassConstructorDescriptor]

'createBuiltInPackageFragmentProvider' @ [43:60] ==> public final fun createBuiltInPackageFragmentProvider(storageManager: StorageManager, module: ModuleDescriptor, packageFqNames: Set<FqName>, classDescriptorFactories: Iterable<ClassDescriptorFactory>, platformDependentDeclarationFilter: PlatformDependentDeclarationFilter, additionalClassPartsProvider: AdditionalClassPartsProvider = ..., loadResource: (String) -> InputStream?): PackageFragmentProvider defined in org.jetbrains.kotlin.builtins.BuiltInsLoaderImpl[DeserializedSimpleFunctionDescriptor]

'LockBasedStorageManager' @ [44:17] ==> public constructor LockBasedStorageManager() defined in org.jetbrains.kotlin.storage.LockBasedStorageManager[JavaClassConstructorDescriptor]

'module' @ [44:44] ==> val module: ModuleDescriptorImpl defined in org.jetbrains.kotlin.serialization.builtins.BuiltInsSerializerTest.doTest[LocalVariableDescriptor]

'setOf' @ [44:52] ==> public fun <T> setOf(element: FqName): Set<FqName> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FqName

'TEST_PACKAGE_FQNAME' @ [44:58] ==> @NotNull public final val TEST_PACKAGE_FQNAME: FqName defined in org.jetbrains.kotlin.jvm.compiler.LoadDescriptorUtil[JavaPropertyDescriptor]

'emptyList' @ [44:80] ==> public fun <T> emptyList(): List<ClassDescriptorFactory> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassDescriptorFactory

'All' @ [44:128] ==> public object All : PlatformDependentDeclarationFilter defined in org.jetbrains.kotlin.descriptors.deserialization.PlatformDependentDeclarationFilter[FakeCallableDescriptorForObject]

'File' @ [46:24] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'tmpdir' @ [46:29] ==> protected/*protected and package*/ final var tmpdir: (File..File?) defined in org.jetbrains.kotlin.serialization.builtins.BuiltInsSerializerTest[JavaPropertyDescriptor]

'it' @ [46:37] ==> value-parameter it: String defined in org.jetbrains.kotlin.serialization.builtins.BuiltInsSerializerTest.doTest.<anonymous>[ValueParameterDescriptorImpl]

'if (file.exists()) FileInputStream(file) else null' @ [47:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: InputStream?, elseBranch: InputStream?): InputStream?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> InputStream?

'file' @ [47:17] ==> val file: File defined in org.jetbrains.kotlin.serialization.builtins.BuiltInsSerializerTest.doTest.<anonymous>[LocalVariableDescriptor]

'exists' @ [47:22] ==> public open fun exists(): Boolean defined in java.io.File[JavaMethodDescriptor]

'FileInputStream' @ [47:32] ==> public constructor FileInputStream(p0: (File..File?)) defined in java.io.FileInputStream[JavaClassConstructorDescriptor]

'file' @ [47:48] ==> val file: File defined in org.jetbrains.kotlin.serialization.builtins.BuiltInsSerializerTest.doTest.<anonymous>[LocalVariableDescriptor]

'module' @ [50:9] ==> val module: ModuleDescriptorImpl defined in org.jetbrains.kotlin.serialization.builtins.BuiltInsSerializerTest.doTest[LocalVariableDescriptor]

'initialize' @ [50:16] ==> public final fun initialize(providerForModuleContent: PackageFragmentProvider): Unit defined in org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl[DeserializedSimpleFunctionDescriptor]

'packageFragmentProvider' @ [50:27] ==> val packageFragmentProvider: PackageFragmentProvider defined in org.jetbrains.kotlin.serialization.builtins.BuiltInsSerializerTest.doTest[LocalVariableDescriptor]

'module' @ [51:9] ==> val module: ModuleDescriptorImpl defined in org.jetbrains.kotlin.serialization.builtins.BuiltInsSerializerTest.doTest[LocalVariableDescriptor]

'setDependencies' @ [51:16] ==> public final fun setDependencies(vararg descriptors: ModuleDescriptorImpl): Unit defined in org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl[DeserializedSimpleFunctionDescriptor]

'module' @ [51:32] ==> val module: ModuleDescriptorImpl defined in org.jetbrains.kotlin.serialization.builtins.BuiltInsSerializerTest.doTest[LocalVariableDescriptor]

'module' @ [51:40] ==> val module: ModuleDescriptorImpl defined in org.jetbrains.kotlin.serialization.builtins.BuiltInsSerializerTest.doTest[LocalVariableDescriptor]

'builtIns' @ [51:47] ==> public open val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl[DeserializedPropertyDescriptor]

'builtInsModule' @ [51:56] ==> public final var KotlinBuiltIns.builtInsModule: ModuleDescriptorImpl[MyPropertyDescriptor]

'validateAndCompareDescriptorWithFile' @ [53:39] ==> public open fun validateAndCompareDescriptorWithFile(@NotNull p0: DeclarationDescriptor, @NotNull p1: RecursiveDescriptorComparator.Configuration, @NotNull p2: File): Unit defined in org.jetbrains.kotlin.test.util.RecursiveDescriptorComparator[JavaMethodDescriptor]

'module' @ [54:17] ==> val module: ModuleDescriptorImpl defined in org.jetbrains.kotlin.serialization.builtins.BuiltInsSerializerTest.doTest[LocalVariableDescriptor]

'getPackage' @ [54:24] ==> public open fun getPackage(fqName: FqName): PackageViewDescriptor defined in org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl[DeserializedSimpleFunctionDescriptor]

'TEST_PACKAGE_FQNAME' @ [54:35] ==> @NotNull public final val TEST_PACKAGE_FQNAME: FqName defined in org.jetbrains.kotlin.jvm.compiler.LoadDescriptorUtil[JavaPropertyDescriptor]

'DONT_INCLUDE_METHODS_OF_OBJECT' @ [55:47] ==> public final val DONT_INCLUDE_METHODS_OF_OBJECT: (RecursiveDescriptorComparator.Configuration..RecursiveDescriptorComparator.Configuration?) defined in org.jetbrains.kotlin.test.util.RecursiveDescriptorComparator[JavaPropertyDescriptor]

'File' @ [56:17] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'source' @ [56:22] ==> val source: String defined in org.jetbrains.kotlin.serialization.builtins.BuiltInsSerializerTest.doTest[LocalVariableDescriptor]

'replace' @ [56:29] ==> public fun String.replace(oldValue: String, newValue: String, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'doTest' @ [61:9] ==> private final fun doTest(fileName: String): Unit defined in org.jetbrains.kotlin.serialization.builtins.BuiltInsSerializerTest[SimpleFunctionDescriptorImpl]

'doTest' @ [65:9] ==> private final fun doTest(fileName: String): Unit defined in org.jetbrains.kotlin.serialization.builtins.BuiltInsSerializerTest[SimpleFunctionDescriptorImpl]

'doTest' @ [69:9] ==> private final fun doTest(fileName: String): Unit defined in org.jetbrains.kotlin.serialization.builtins.BuiltInsSerializerTest[SimpleFunctionDescriptorImpl]

'doTest' @ [73:9] ==> private final fun doTest(fileName: String): Unit defined in org.jetbrains.kotlin.serialization.builtins.BuiltInsSerializerTest[SimpleFunctionDescriptorImpl]

'doTest' @ [77:9] ==> private final fun doTest(fileName: String): Unit defined in org.jetbrains.kotlin.serialization.builtins.BuiltInsSerializerTest[SimpleFunctionDescriptorImpl]

'doTest' @ [81:9] ==> private final fun doTest(fileName: String): Unit defined in org.jetbrains.kotlin.serialization.builtins.BuiltInsSerializerTest[SimpleFunctionDescriptorImpl]

'doTest' @ [85:9] ==> private final fun doTest(fileName: String): Unit defined in org.jetbrains.kotlin.serialization.builtins.BuiltInsSerializerTest[SimpleFunctionDescriptorImpl]

'doTest' @ [89:9] ==> private final fun doTest(fileName: String): Unit defined in org.jetbrains.kotlin.serialization.builtins.BuiltInsSerializerTest[SimpleFunctionDescriptorImpl]

'doTest' @ [93:9] ==> private final fun doTest(fileName: String): Unit defined in org.jetbrains.kotlin.serialization.builtins.BuiltInsSerializerTest[SimpleFunctionDescriptorImpl]

'doTest' @ [97:9] ==> private final fun doTest(fileName: String): Unit defined in org.jetbrains.kotlin.serialization.builtins.BuiltInsSerializerTest[SimpleFunctionDescriptorImpl]

'doTest' @ [101:9] ==> private final fun doTest(fileName: String): Unit defined in org.jetbrains.kotlin.serialization.builtins.BuiltInsSerializerTest[SimpleFunctionDescriptorImpl]

'doTest' @ [105:9] ==> private final fun doTest(fileName: String): Unit defined in org.jetbrains.kotlin.serialization.builtins.BuiltInsSerializerTest[SimpleFunctionDescriptorImpl]

