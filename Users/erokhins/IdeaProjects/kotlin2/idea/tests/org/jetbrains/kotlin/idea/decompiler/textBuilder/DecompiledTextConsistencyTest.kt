'LightCodeInsightFixtureTestCase' @ [43:39] ==> protected/*protected and package*/ constructor LightCodeInsightFixtureTestCase() defined in com.intellij.testFramework.fixtures.LightCodeInsightFixtureTestCase[JavaClassConstructorDescriptor]

'KotlinWithJdkAndRuntimeLightProjectDescriptor' @ [45:22] ==> protected/*protected and package*/ constructor KotlinWithJdkAndRuntimeLightProjectDescriptor() defined in org.jetbrains.kotlin.idea.test.KotlinWithJdkAndRuntimeLightProjectDescriptor[JavaClassConstructorDescriptor]

'fullJdk' @ [46:60] ==> @NotNull public open fun fullJdk(): Sdk defined in org.jetbrains.kotlin.idea.test.PluginTestCaseBase[JavaMethodDescriptor]

'component1' @ [50:15] ==> public final operator fun component1(): FqName defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [50:36] ==> public final operator fun component2(): String? defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'listOf' @ [50:56] ==> public fun <T> listOf(vararg elements: Pair<FqName, String?>): List<Pair<FqName, String?>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<FqName, String?>

'FqName' @ [51:17] ==> public constructor FqName(@NotNull p0: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

'FqName' @ [52:17] ==> public constructor FqName(@NotNull p0: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

'topLevel' @ [54:35] ==> @NotNull public open fun topLevel(@NotNull p0: FqName): ClassId defined in org.jetbrains.kotlin.name.ClassId[JavaMethodDescriptor]

'packageFacadeFqName' @ [54:44] ==> val packageFacadeFqName: FqName defined in org.jetbrains.kotlin.idea.decompiler.textBuilder.DecompiledTextConsistencyTest.testConsistency[LocalVariableDescriptor]

'!!' @ [55:29] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: VirtualFile?): VirtualFile[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> VirtualFile

'getInstance' @ [55:55] ==> public final fun getInstance(project: Project): VirtualFileFinder defined in org.jetbrains.kotlin.load.kotlin.VirtualFileFinder.SERVICE[DeserializedSimpleFunctionDescriptor]

'project' @ [55:67] ==> protected/*protected and package*/ for synthetic extension final val DecompiledTextConsistencyTest.project: (Project..Project?)[MyPropertyDescriptor]

'findVirtualFileWithHeader' @ [55:76] ==> public abstract fun findVirtualFileWithHeader(classId: ClassId): VirtualFile? defined in org.jetbrains.kotlin.load.kotlin.VirtualFileFinder[DeserializedSimpleFunctionDescriptor]

'classId' @ [55:102] ==> val classId: ClassId defined in org.jetbrains.kotlin.idea.decompiler.textBuilder.DecompiledTextConsistencyTest.testConsistency[LocalVariableDescriptor]

'TopDownAnalyzerFacadeForJVM' @ [57:26] ==> public object TopDownAnalyzerFacadeForJVM defined in org.jetbrains.kotlin.cli.jvm.compiler[FakeCallableDescriptorForObject]

'analyzeFilesWithJavaIntegration' @ [57:54] ==> @JvmStatic @JvmOverloads public final fun analyzeFilesWithJavaIntegration(project: Project, files: Collection<KtFile>, trace: BindingTrace, configuration: CompilerConfiguration, packagePartProvider: (GlobalSearchScope) -> PackagePartProvider, declarationProviderFactory: (StorageManager, Collection<KtFile>) -> DeclarationProviderFactory = ..., sourceModuleSearchScope: GlobalSearchScope = ...): AnalysisResult defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM[DeserializedSimpleFunctionDescriptor]

'project' @ [58:21] ==> protected/*protected and package*/ for synthetic extension final val DecompiledTextConsistencyTest.project: (Project..Project?)[MyPropertyDescriptor]

'listOf' @ [58:30] ==> @InlineOnly public inline fun <T> listOf(): List<KtFile> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFile

'BindingTraceContext' @ [58:40] ==> public constructor BindingTraceContext() defined in org.jetbrains.kotlin.resolve.BindingTraceContext[JavaClassConstructorDescriptor]

'newConfiguration' @ [58:79] ==> @NotNull public open fun newConfiguration(): CompilerConfiguration defined in org.jetbrains.kotlin.test.KotlinTestUtils[JavaMethodDescriptor]

'IDEPackagePartProvider' @ [58:101] ==> public constructor IDEPackagePartProvider(scope: GlobalSearchScope) defined in org.jetbrains.kotlin.idea.caches.resolve.IDEPackagePartProvider[DeserializedClassConstructorDescriptor]

'moduleDescriptor' @ [59:15] ==> public final val moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.analyzer.AnalysisResult[DeserializedPropertyDescriptor]

'buildDecompiledTextForClassFile' @ [61:36] ==> public fun buildDecompiledTextForClassFile(classFile: VirtualFile, resolver: ResolverForDecompiler = ...): DecompiledText defined in org.jetbrains.kotlin.idea.decompiler.classFile[DeserializedSimpleFunctionDescriptor]

'classFile' @ [61:68] ==> val classFile: VirtualFile defined in org.jetbrains.kotlin.idea.decompiler.textBuilder.DecompiledTextConsistencyTest.testConsistency[LocalVariableDescriptor]

'ResolverForDecompilerImpl' @ [61:79] ==> public constructor ResolverForDecompilerImpl(module: ModuleDescriptor) defined in org.jetbrains.kotlin.idea.decompiler.textBuilder.DecompiledTextConsistencyTest.ResolverForDecompilerImpl[ClassConstructorDescriptorImpl]

'module' @ [61:105] ==> val module: ModuleDescriptor defined in org.jetbrains.kotlin.idea.decompiler.textBuilder.DecompiledTextConsistencyTest.testConsistency[LocalVariableDescriptor]

'text' @ [61:114] ==> public final val text: String defined in org.jetbrains.kotlin.idea.decompiler.textBuilder.DecompiledText[DeserializedPropertyDescriptor]

'buildDecompiledTextForClassFile' @ [62:36] ==> public fun buildDecompiledTextForClassFile(classFile: VirtualFile, resolver: ResolverForDecompiler = ...): DecompiledText defined in org.jetbrains.kotlin.idea.decompiler.classFile[DeserializedSimpleFunctionDescriptor]

'classFile' @ [62:68] ==> val classFile: VirtualFile defined in org.jetbrains.kotlin.idea.decompiler.textBuilder.DecompiledTextConsistencyTest.testConsistency[LocalVariableDescriptor]

'text' @ [62:79] ==> public final val text: String defined in org.jetbrains.kotlin.idea.decompiler.textBuilder.DecompiledText[DeserializedPropertyDescriptor]

'assertEquals' @ [63:20] ==> public open fun assertEquals(p0: (Any..Any?), p1: (Any..Any?)): Unit defined in org.junit.Assert[JavaMethodDescriptor]

'projectBasedText' @ [63:33] ==> val projectBasedText: String defined in org.jetbrains.kotlin.idea.decompiler.textBuilder.DecompiledTextConsistencyTest.testConsistency[LocalVariableDescriptor]

'deserializedText' @ [63:51] ==> val deserializedText: String defined in org.jetbrains.kotlin.idea.decompiler.textBuilder.DecompiledTextConsistencyTest.testConsistency[LocalVariableDescriptor]

'topLevelMembers' @ [66:17] ==> val topLevelMembers: String? defined in org.jetbrains.kotlin.idea.decompiler.textBuilder.DecompiledTextConsistencyTest.testConsistency[LocalVariableDescriptor]

'assertTrue' @ [67:24] ==> public open fun assertTrue(p0: Boolean): Unit defined in org.junit.Assert[JavaMethodDescriptor]

'topLevelMembers' @ [67:35] ==> val topLevelMembers: String? defined in org.jetbrains.kotlin.idea.decompiler.textBuilder.DecompiledTextConsistencyTest.testConsistency[LocalVariableDescriptor]

'projectBasedText' @ [67:54] ==> val projectBasedText: String defined in org.jetbrains.kotlin.idea.decompiler.textBuilder.DecompiledTextConsistencyTest.testConsistency[LocalVariableDescriptor]

'assertFalse' @ [70:20] ==> public open fun assertFalse(p0: Boolean): Unit defined in org.junit.Assert[JavaMethodDescriptor]

'in' @ [70:32] ==> public operator fun CharSequence.contains(other: CharSequence, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'projectBasedText' @ [70:43] ==> val projectBasedText: String defined in org.jetbrains.kotlin.idea.decompiler.textBuilder.DecompiledTextConsistencyTest.testConsistency[LocalVariableDescriptor]

'module' @ [76:17] ==> public final val module: ModuleDescriptor defined in org.jetbrains.kotlin.idea.decompiler.textBuilder.DecompiledTextConsistencyTest.ResolverForDecompilerImpl[PropertyDescriptorImpl]

'resolveTopLevelClass' @ [76:24] ==> public fun ModuleDescriptor.resolveTopLevelClass(topLevelClassFqName: FqName, location: LookupLocation): ClassDescriptor? defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedSimpleFunctionDescriptor]

'classId' @ [76:45] ==> value-parameter classId: ClassId defined in org.jetbrains.kotlin.idea.decompiler.textBuilder.DecompiledTextConsistencyTest.ResolverForDecompilerImpl.resolveTopLevelClass[ValueParameterDescriptorImpl]

'asSingleFqName' @ [76:53] ==> @NotNull public open fun asSingleFqName(): FqName defined in org.jetbrains.kotlin.name.ClassId[JavaMethodDescriptor]

'FROM_TEST' @ [76:88] ==> enum entry FROM_TEST defined in org.jetbrains.kotlin.incremental.components.NoLookupLocation[FakeCallableDescriptorForObject]

'module' @ [79:17] ==> public final val module: ModuleDescriptor defined in org.jetbrains.kotlin.idea.decompiler.textBuilder.DecompiledTextConsistencyTest.ResolverForDecompilerImpl[PropertyDescriptorImpl]

'getPackage' @ [79:24] ==> public abstract fun getPackage(fqName: FqName): PackageViewDescriptor defined in org.jetbrains.kotlin.descriptors.ModuleDescriptor[DeserializedSimpleFunctionDescriptor]

'facadeFqName' @ [79:35] ==> value-parameter facadeFqName: FqName defined in org.jetbrains.kotlin.idea.decompiler.textBuilder.DecompiledTextConsistencyTest.ResolverForDecompilerImpl.resolveDeclarationsInFacade[ValueParameterDescriptorImpl]

'parent' @ [79:48] ==> @NotNull public open fun parent(): FqName defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'memberScope' @ [79:58] ==> public abstract val memberScope: MemberScope defined in org.jetbrains.kotlin.descriptors.PackageViewDescriptor[DeserializedPropertyDescriptor]

'getContributedDescriptors' @ [79:70] ==> public abstract fun getContributedDescriptors(kindFilter: DescriptorKindFilter, nameFilter: (Name) -> Boolean): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[DeserializedSimpleFunctionDescriptor]

'filter' @ [79:98] ==> public inline fun <T> Iterable<DeclarationDescriptor>.filter(predicate: (DeclarationDescriptor) -> Boolean): List<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'descriptor' @ [80:22] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.decompiler.textBuilder.DecompiledTextConsistencyTest.ResolverForDecompilerImpl.resolveDeclarationsInFacade.<anonymous>[ValueParameterDescriptorImpl]

'descriptor' @ [80:56] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.decompiler.textBuilder.DecompiledTextConsistencyTest.ResolverForDecompilerImpl.resolveDeclarationsInFacade.<anonymous>[ValueParameterDescriptorImpl]

'isFromFacade' @ [80:90] ==> private final fun isFromFacade(descriptor: MemberDescriptor, facadeFqName: FqName): Boolean defined in org.jetbrains.kotlin.idea.decompiler.textBuilder.DecompiledTextConsistencyTest.ResolverForDecompilerImpl[SimpleFunctionDescriptorImpl]

'descriptor' @ [80:103] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.decompiler.textBuilder.DecompiledTextConsistencyTest.ResolverForDecompilerImpl.resolveDeclarationsInFacade.<anonymous>[ValueParameterDescriptorImpl]

'facadeFqName' @ [80:115] ==> value-parameter facadeFqName: FqName defined in org.jetbrains.kotlin.idea.decompiler.textBuilder.DecompiledTextConsistencyTest.ResolverForDecompilerImpl.resolveDeclarationsInFacade[ValueParameterDescriptorImpl]

'!' @ [81:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isBuiltIn' @ [81:37] ==> public open fun isBuiltIn(@NotNull p0: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'descriptor' @ [81:47] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.decompiler.textBuilder.DecompiledTextConsistencyTest.ResolverForDecompilerImpl.resolveDeclarationsInFacade.<anonymous>[ValueParameterDescriptorImpl]

'sortedWith' @ [82:19] ==> public fun <T> Iterable<DeclarationDescriptor>.sortedWith(comparator: Comparator<in DeclarationDescriptor> /* = Comparator<in DeclarationDescriptor> */): List<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'INSTANCE' @ [82:47] ==> public final val INSTANCE: (MemberComparator..MemberComparator?) defined in org.jetbrains.kotlin.resolve.MemberComparator[JavaPropertyDescriptor]

'descriptor' @ [85:17] ==> value-parameter descriptor: MemberDescriptor defined in org.jetbrains.kotlin.idea.decompiler.textBuilder.DecompiledTextConsistencyTest.ResolverForDecompilerImpl.isFromFacade[ValueParameterDescriptorImpl]

'descriptor' @ [86:17] ==> value-parameter descriptor: MemberDescriptor defined in org.jetbrains.kotlin.idea.decompiler.textBuilder.DecompiledTextConsistencyTest.ResolverForDecompilerImpl.isFromFacade[ValueParameterDescriptorImpl]

'isFromJvmPackagePart' @ [86:28] ==> public fun DeserializedMemberDescriptor.isFromJvmPackagePart(): Boolean defined in org.jetbrains.kotlin.load.java.descriptors[DeserializedSimpleFunctionDescriptor]

'facadeFqName' @ [87:17] ==> value-parameter facadeFqName: FqName defined in org.jetbrains.kotlin.idea.decompiler.textBuilder.DecompiledTextConsistencyTest.ResolverForDecompilerImpl.isFromFacade[ValueParameterDescriptorImpl]

'getPartFqNameForDeserialized' @ [87:50] ==> @JvmStatic public final fun getPartFqNameForDeserialized(deserializedMemberDescriptor: DeserializedMemberDescriptor): FqName defined in org.jetbrains.kotlin.fileClasses.JvmFileClassUtil[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [87:79] ==> value-parameter descriptor: MemberDescriptor defined in org.jetbrains.kotlin.idea.decompiler.textBuilder.DecompiledTextConsistencyTest.ResolverForDecompilerImpl.isFromFacade[ValueParameterDescriptorImpl]

