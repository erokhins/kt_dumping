'KtUsefulTestCase' @ [32:65] ==> public constructor KtUsefulTestCase() defined in org.jetbrains.kotlin.test.testFramework.KtUsefulTestCase[JavaClassConstructorDescriptor]

'newConfiguration' @ [34:38] ==> @NotNull public open fun newConfiguration(@NotNull p0: ConfigurationKind, @NotNull p1: TestJdkKind, @NotNull vararg p2: (File..File?)): CompilerConfiguration defined in org.jetbrains.kotlin.test.KotlinTestUtils[JavaMethodDescriptor]

'ALL' @ [34:73] ==> enum entry ALL defined in org.jetbrains.kotlin.test.ConfigurationKind[FakeCallableDescriptorForObject]

'ANDROID_API' @ [34:90] ==> enum entry ANDROID_API defined in org.jetbrains.kotlin.test.TestJdkKind[FakeCallableDescriptorForObject]

'createTestEnvironment' @ [35:19] ==> public fun KtUsefulTestCase.createTestEnvironment(configuration: CompilerConfiguration, resDirectories: List<String>): KotlinCoreEnvironment defined in org.jetbrains.kotlin.android.synthetic.test in file CompilerTestUtils.kt[SimpleFunctionDescriptorImpl]

'config' @ [35:41] ==> val config: CompilerConfiguration defined in org.jetbrains.kotlin.android.synthetic.test.AbstractAndroidSyntheticPropertyDescriptorTest.doTest[LocalVariableDescriptor]

'getResPaths' @ [35:49] ==> public fun getResPaths(path: String): List<String> defined in org.jetbrains.kotlin.android.synthetic.test in file CompilerTestUtils.kt[SimpleFunctionDescriptorImpl]

'path' @ [35:61] ==> value-parameter path: String defined in org.jetbrains.kotlin.android.synthetic.test.AbstractAndroidSyntheticPropertyDescriptorTest.doTest[ValueParameterDescriptorImpl]

'env' @ [36:23] ==> val env: KotlinCoreEnvironment defined in org.jetbrains.kotlin.android.synthetic.test.AbstractAndroidSyntheticPropertyDescriptorTest.doTest[LocalVariableDescriptor]

'project' @ [36:27] ==> public final val project: Project defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[DeserializedPropertyDescriptor]

'PackageFragmentProviderExtension' @ [38:19] ==> public companion object : ProjectExtensionDescriptor<PackageFragmentProviderExtension> defined in org.jetbrains.kotlin.resolve.jvm.extensions.PackageFragmentProviderExtension[FakeCallableDescriptorForObject]

'getInstances' @ [38:52] ==> public final fun getInstances(project: Project): List<PackageFragmentProviderExtension> defined in org.jetbrains.kotlin.resolve.jvm.extensions.PackageFragmentProviderExtension.Companion[DeserializedSimpleFunctionDescriptor]

'project' @ [38:65] ==> val project: Project defined in org.jetbrains.kotlin.android.synthetic.test.AbstractAndroidSyntheticPropertyDescriptorTest.doTest[LocalVariableDescriptor]

'first' @ [38:74] ==> public inline fun <T> Iterable<PackageFragmentProviderExtension>.first(predicate: (PackageFragmentProviderExtension) -> Boolean): PackageFragmentProviderExtension defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PackageFragmentProviderExtension

'it' @ [38:82] ==> value-parameter it: PackageFragmentProviderExtension defined in org.jetbrains.kotlin.android.synthetic.test.AbstractAndroidSyntheticPropertyDescriptorTest.doTest.<anonymous>[ValueParameterDescriptorImpl]

'JvmResolveUtil' @ [40:30] ==> public object JvmResolveUtil defined in org.jetbrains.kotlin.resolve.lazy[FakeCallableDescriptorForObject]

'analyzeAndCheckForErrors' @ [40:45] ==> @JvmStatic public final fun analyzeAndCheckForErrors(files: Collection<KtFile>, environment: KotlinCoreEnvironment): AnalysisResult defined in org.jetbrains.kotlin.resolve.lazy.JvmResolveUtil[DeserializedSimpleFunctionDescriptor]

'listOf' @ [40:70] ==> @InlineOnly public inline fun <T> listOf(): List<KtFile> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFile

'env' @ [40:80] ==> val env: KotlinCoreEnvironment defined in org.jetbrains.kotlin.android.synthetic.test.AbstractAndroidSyntheticPropertyDescriptorTest.doTest[LocalVariableDescriptor]

'ext' @ [42:32] ==> val ext: PackageFragmentProviderExtension defined in org.jetbrains.kotlin.android.synthetic.test.AbstractAndroidSyntheticPropertyDescriptorTest.doTest[LocalVariableDescriptor]

'getPackageFragmentProvider' @ [42:36] ==> public abstract fun getPackageFragmentProvider(project: Project, module: ModuleDescriptor, storageManager: StorageManager, trace: BindingTrace, moduleInfo: ModuleInfo?): PackageFragmentProvider? defined in org.jetbrains.kotlin.resolve.jvm.extensions.PackageFragmentProviderExtension[DeserializedSimpleFunctionDescriptor]

'project' @ [42:63] ==> val project: Project defined in org.jetbrains.kotlin.android.synthetic.test.AbstractAndroidSyntheticPropertyDescriptorTest.doTest[LocalVariableDescriptor]

'analysisResult' @ [42:72] ==> val analysisResult: AnalysisResult defined in org.jetbrains.kotlin.android.synthetic.test.AbstractAndroidSyntheticPropertyDescriptorTest.doTest[LocalVariableDescriptor]

'moduleDescriptor' @ [42:87] ==> public final val moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.analyzer.AnalysisResult[DeserializedPropertyDescriptor]

'NO_LOCKS' @ [42:129] ==> public final val NO_LOCKS: (StorageManager..StorageManager?) defined in org.jetbrains.kotlin.storage.LockBasedStorageManager[JavaPropertyDescriptor]

'DUMMY_EXCEPTION_ON_ERROR_TRACE' @ [43:56] ==> public final var DUMMY_EXCEPTION_ON_ERROR_TRACE: (BindingTrace..BindingTrace?) defined in org.jetbrains.kotlin.test.KotlinTestUtils[JavaPropertyDescriptor]

'DescriptorRenderer' @ [45:24] ==> public companion object defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[FakeCallableDescriptorForObject]

'COMPACT_WITH_MODIFIERS' @ [45:43] ==> @field:JvmField public final val COMPACT_WITH_MODIFIERS: DescriptorRenderer defined in org.jetbrains.kotlin.renderer.DescriptorRenderer.Companion[DeserializedPropertyDescriptor]

'fragmentProvider' @ [46:24] ==> val fragmentProvider: AndroidSyntheticPackageFragmentProvider defined in org.jetbrains.kotlin.android.synthetic.test.AbstractAndroidSyntheticPropertyDescriptorTest.doTest[LocalVariableDescriptor]

'packageFragments' @ [46:41] ==> public final val packageFragments: Collection<PackageFragmentDescriptor> defined in org.jetbrains.kotlin.android.synthetic.res.AndroidSyntheticPackageFragmentProvider[DeserializedPropertyDescriptor]

'sortedBy' @ [46:58] ==> public inline fun <T, R : Comparable<String>> Iterable<PackageFragmentDescriptor>.sortedBy(crossinline selector: (PackageFragmentDescriptor) -> String?): List<PackageFragmentDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PackageFragmentDescriptor
    <R : Comparable<R>> -> String

'it' @ [46:69] ==> value-parameter it: PackageFragmentDescriptor defined in org.jetbrains.kotlin.android.synthetic.test.AbstractAndroidSyntheticPropertyDescriptorTest.doTest.<anonymous>[ValueParameterDescriptorImpl]

'fqName' @ [46:72] ==> public abstract val fqName: FqName defined in org.jetbrains.kotlin.descriptors.PackageFragmentDescriptor[DeserializedPropertyDescriptor]

'asString' @ [46:79] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'map' @ [46:92] ==> public inline fun <T, R> Iterable<PackageFragmentDescriptor>.map(transform: (PackageFragmentDescriptor) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PackageFragmentDescriptor
    <R> -> String

'it' @ [47:31] ==> value-parameter it: PackageFragmentDescriptor defined in org.jetbrains.kotlin.android.synthetic.test.AbstractAndroidSyntheticPropertyDescriptorTest.doTest.<anonymous>[ValueParameterDescriptorImpl]

'getMemberScope' @ [47:34] ==> public abstract fun getMemberScope(): MemberScope defined in org.jetbrains.kotlin.descriptors.PackageFragmentDescriptor[DeserializedSimpleFunctionDescriptor]

'getContributedDescriptors' @ [47:51] ==> public abstract fun getContributedDescriptors(kindFilter: DescriptorKindFilter, nameFilter: (Name) -> Boolean): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[DeserializedSimpleFunctionDescriptor]

'sortedWith' @ [48:22] ==> public fun <T> Iterable<DeclarationDescriptor>.sortedWith(comparator: Comparator<in DeclarationDescriptor> /* = Comparator<in DeclarationDescriptor> */): List<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'INSTANCE' @ [48:50] ==> public final val INSTANCE: (MemberComparator..MemberComparator?) defined in org.jetbrains.kotlin.resolve.MemberComparator[JavaPropertyDescriptor]

'map' @ [49:22] ==> public inline fun <T, R> Iterable<DeclarationDescriptor>.map(transform: (DeclarationDescriptor) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor
    <R> -> String

'+' @ [49:28] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'renderer' @ [49:37] ==> val renderer: DescriptorRenderer defined in org.jetbrains.kotlin.android.synthetic.test.AbstractAndroidSyntheticPropertyDescriptorTest.doTest[LocalVariableDescriptor]

'render' @ [49:46] ==> public abstract fun render(declarationDescriptor: DeclarationDescriptor): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'it' @ [49:53] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.android.synthetic.test.AbstractAndroidSyntheticPropertyDescriptorTest.doTest.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'joinToString' @ [49:59] ==> public fun <T> Iterable<String>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [50:13] ==> value-parameter it: PackageFragmentDescriptor defined in org.jetbrains.kotlin.android.synthetic.test.AbstractAndroidSyntheticPropertyDescriptorTest.doTest.<anonymous>[ValueParameterDescriptorImpl]

'fqName' @ [50:16] ==> public abstract val fqName: FqName defined in org.jetbrains.kotlin.descriptors.PackageFragmentDescriptor[DeserializedPropertyDescriptor]

'asString' @ [50:23] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'if (descriptors.isNotEmpty()) "\n\n" + descriptors else ""' @ [50:37] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'descriptors' @ [50:41] ==> val descriptors: String defined in org.jetbrains.kotlin.android.synthetic.test.AbstractAndroidSyntheticPropertyDescriptorTest.doTest.<anonymous>[LocalVariableDescriptor]

'isNotEmpty' @ [50:53] ==> @InlineOnly public inline fun CharSequence.isNotEmpty(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'+' @ [50:67] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'descriptors' @ [50:76] ==> val descriptors: String defined in org.jetbrains.kotlin.android.synthetic.test.AbstractAndroidSyntheticPropertyDescriptorTest.doTest.<anonymous>[LocalVariableDescriptor]

'joinToString' @ [51:11] ==> public fun <T> Iterable<String>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'assertEqualsToFile' @ [53:25] ==> public open fun assertEqualsToFile(@NotNull p0: File, @NotNull p1: String): Unit defined in org.jetbrains.kotlin.test.KotlinTestUtils[JavaMethodDescriptor]

'File' @ [53:44] ==> public constructor File(p0: (String..String?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'path' @ [53:49] ==> value-parameter path: String defined in org.jetbrains.kotlin.android.synthetic.test.AbstractAndroidSyntheticPropertyDescriptorTest.doTest[ValueParameterDescriptorImpl]

'expected' @ [53:70] ==> val expected: String defined in org.jetbrains.kotlin.android.synthetic.test.AbstractAndroidSyntheticPropertyDescriptorTest.doTest[LocalVariableDescriptor]

