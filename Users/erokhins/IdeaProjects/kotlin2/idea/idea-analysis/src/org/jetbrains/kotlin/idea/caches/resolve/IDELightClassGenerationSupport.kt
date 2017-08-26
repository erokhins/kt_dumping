'LightClassGenerationSupport' @ [51:70] ==> public constructor LightClassGenerationSupport() defined in org.jetbrains.kotlin.asJava.LightClassGenerationSupport[DeserializedClassConstructorDescriptor]

'byClasspathComparator' @ [52:57] ==> @NotNull public open fun byClasspathComparator(@NotNull p0: GlobalSearchScope): Comparator<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.asJava.finder.JavaElementFinder[JavaMethodDescriptor]

'allScope' @ [52:97] ==> @NotNull public open fun allScope(@NotNull p0: Project): GlobalSearchScope defined in com.intellij.psi.search.GlobalSearchScope[JavaMethodDescriptor]

'project' @ [52:106] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport[PropertyDescriptorImpl]

'getInstance' @ [53:53] ==> @NotNull public open fun getInstance(@NotNull p0: Project): PsiManager defined in com.intellij.psi.PsiManager[JavaMethodDescriptor]

'project' @ [53:65] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport[PropertyDescriptorImpl]

'if (classOrObject.isLocal) {
            LazyLightClassDataHolder.ForClass(
                    builder,
                    exactContextProvider = { IDELightClassContexts.contextForLocalClassOrObject(classOrObject) },
                    dummyContextProvider = null
            )
        }
        else {
            LazyLightClassDataHolder.ForClass(
                    builder,
                    exactContextProvider = { IDELightClassContexts.contextForNonLocalClassOrObject(classOrObject) },
                    dummyContextProvider = { IDELightClassContexts.lightContextForClassOrObject(classOrObject) }
            )
        }' @ [56:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: LightClassDataHolder.ForClass, elseBranch: LightClassDataHolder.ForClass): LightClassDataHolder.ForClass[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ForClass

'classOrObject' @ [56:20] ==> value-parameter classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.createDataHolderForClass[ValueParameterDescriptorImpl]

'isLocal' @ [56:34] ==> public final val KtClassOrObject.isLocal: Boolean[MyPropertyDescriptor]

'ForClass' @ [57:38] ==> public constructor ForClass(builder: LightClassBuilder /* = (LightClassConstructionContext) -> LightClassBuilderResult */, exactContextProvider: ExactLightClassContextProvider /* = () -> LightClassConstructionContext */, dummyContextProvider: DummyLightClassContextProvider /* = (() -> LightClassConstructionContext?)? */) defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.LazyLightClassDataHolder.ForClass[ClassConstructorDescriptorImpl]

'builder' @ [58:21] ==> value-parameter builder: LightClassBuilder /* = (LightClassConstructionContext) -> LightClassBuilderResult */ defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.createDataHolderForClass[ValueParameterDescriptorImpl]

'IDELightClassContexts' @ [59:46] ==> public object IDELightClassContexts defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses in file IDELightClassContexts.kt[FakeCallableDescriptorForObject]

'contextForLocalClassOrObject' @ [59:68] ==> public final fun contextForLocalClassOrObject(classOrObject: KtClassOrObject): LightClassConstructionContext defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts[SimpleFunctionDescriptorImpl]

'classOrObject' @ [59:97] ==> value-parameter classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.createDataHolderForClass[ValueParameterDescriptorImpl]

'ForClass' @ [64:38] ==> public constructor ForClass(builder: LightClassBuilder /* = (LightClassConstructionContext) -> LightClassBuilderResult */, exactContextProvider: ExactLightClassContextProvider /* = () -> LightClassConstructionContext */, dummyContextProvider: DummyLightClassContextProvider /* = (() -> LightClassConstructionContext?)? */) defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.LazyLightClassDataHolder.ForClass[ClassConstructorDescriptorImpl]

'builder' @ [65:21] ==> value-parameter builder: LightClassBuilder /* = (LightClassConstructionContext) -> LightClassBuilderResult */ defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.createDataHolderForClass[ValueParameterDescriptorImpl]

'IDELightClassContexts' @ [66:46] ==> public object IDELightClassContexts defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses in file IDELightClassContexts.kt[FakeCallableDescriptorForObject]

'contextForNonLocalClassOrObject' @ [66:68] ==> public final fun contextForNonLocalClassOrObject(classOrObject: KtClassOrObject): LightClassConstructionContext defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts[SimpleFunctionDescriptorImpl]

'classOrObject' @ [66:100] ==> value-parameter classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.createDataHolderForClass[ValueParameterDescriptorImpl]

'IDELightClassContexts' @ [67:46] ==> public object IDELightClassContexts defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses in file IDELightClassContexts.kt[FakeCallableDescriptorForObject]

'lightContextForClassOrObject' @ [67:68] ==> public final fun lightContextForClassOrObject(classOrObject: KtClassOrObject): LightClassConstructionContext? defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts[SimpleFunctionDescriptorImpl]

'classOrObject' @ [67:97] ==> value-parameter classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.createDataHolderForClass[ValueParameterDescriptorImpl]

'assert' @ [74:9] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'!' @ [74:16] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'files' @ [74:17] ==> value-parameter files: Collection<KtFile> defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.createDataHolderForFacade[ValueParameterDescriptorImpl]

'isEmpty' @ [74:23] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Collection[DeserializedSimpleFunctionDescriptor]

'files' @ [76:27] ==> value-parameter files: Collection<KtFile> defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.createDataHolderForFacade[ValueParameterDescriptorImpl]

'sortedWith' @ [76:33] ==> public fun <T> Iterable<KtFile>.sortedWith(comparator: Comparator<in KtFile> /* = Comparator<in KtFile> */): List<KtFile> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFile

'scopeFileComparator' @ [76:44] ==> private final val scopeFileComparator: Comparator<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport[PropertyDescriptorImpl]

'ForFacade' @ [78:41] ==> public constructor ForFacade(builder: LightClassBuilder /* = (LightClassConstructionContext) -> LightClassBuilderResult */, exactContextProvider: ExactLightClassContextProvider /* = () -> LightClassConstructionContext */, dummyContextProvider: DummyLightClassContextProvider /* = (() -> LightClassConstructionContext?)? */) defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.LazyLightClassDataHolder.ForFacade[ClassConstructorDescriptorImpl]

'builder' @ [79:17] ==> value-parameter builder: LightClassBuilder /* = (LightClassConstructionContext) -> LightClassBuilderResult */ defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.createDataHolderForFacade[ValueParameterDescriptorImpl]

'IDELightClassContexts' @ [80:42] ==> public object IDELightClassContexts defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses in file IDELightClassContexts.kt[FakeCallableDescriptorForObject]

'contextForFacade' @ [80:64] ==> public final fun contextForFacade(files: List<KtFile>): LightClassConstructionContext defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts[SimpleFunctionDescriptorImpl]

'sortedFiles' @ [80:81] ==> val sortedFiles: List<KtFile> defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.createDataHolderForFacade[LocalVariableDescriptor]

'IDELightClassContexts' @ [81:42] ==> public object IDELightClassContexts defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses in file IDELightClassContexts.kt[FakeCallableDescriptorForObject]

'lightContextForFacade' @ [81:64] ==> public final fun lightContextForFacade(files: List<KtFile>): LightClassConstructionContext defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts[SimpleFunctionDescriptorImpl]

'sortedFiles' @ [81:86] ==> val sortedFiles: List<KtFile> defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.createDataHolderForFacade[LocalVariableDescriptor]

'runReadAction' @ [86:16] ==> public fun <T> runReadAction(action: () -> (MutableCollection<(KtClassOrObject..KtClassOrObject?)>..Collection<(KtClassOrObject..KtClassOrObject?)>)): (MutableCollection<(KtClassOrObject..KtClassOrObject?)>..Collection<(KtClassOrObject..KtClassOrObject?)>) defined in org.jetbrains.kotlin.idea.util.application[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> (kotlin.collections.MutableCollection<(org.jetbrains.kotlin.psi.KtClassOrObject..org.jetbrains.kotlin.psi.KtClassOrObject?)>..kotlin.collections.Collection<(org.jetbrains.kotlin.psi.KtClassOrObject..org.jetbrains.kotlin.psi.KtClassOrObject?)>)

'getInstance' @ [87:38] ==> @NotNull public open fun getInstance(): KotlinFullClassNameIndex defined in org.jetbrains.kotlin.idea.stubindex.KotlinFullClassNameIndex[JavaMethodDescriptor]

'get' @ [87:52] ==> @NotNull @Override public open fun get(@NotNull fqName: String, @NotNull project: Project, @NotNull scope: GlobalSearchScope): (MutableCollection<(KtClassOrObject..KtClassOrObject?)>..Collection<(KtClassOrObject..KtClassOrObject?)>) defined in org.jetbrains.kotlin.idea.stubindex.KotlinFullClassNameIndex[JavaMethodDescriptor]

'fqName' @ [87:56] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.findClassOrObjectDeclarations[ValueParameterDescriptorImpl]

'asString' @ [87:63] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'project' @ [87:75] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport[PropertyDescriptorImpl]

'sourceAndClassFiles' @ [87:84] ==> @JvmStatic public final fun sourceAndClassFiles(delegate: GlobalSearchScope, project: Project): GlobalSearchScope defined in org.jetbrains.kotlin.idea.stubindex.KotlinSourceFilterScope.Companion[FunctionImportedFromObject]

'searchScope' @ [87:104] ==> value-parameter searchScope: GlobalSearchScope defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.findClassOrObjectDeclarations[ValueParameterDescriptorImpl]

'project' @ [87:117] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport[PropertyDescriptorImpl]

'runReadAction' @ [92:16] ==> public fun <T> runReadAction(action: () -> Collection<KtFile>): Collection<KtFile> defined in org.jetbrains.kotlin.idea.util.application[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Collection<KtFile>

'PackageIndexUtil' @ [93:13] ==> public object PackageIndexUtil defined in org.jetbrains.kotlin.idea.stubindex in file PackageIndexUtil.kt[FakeCallableDescriptorForObject]

'findFilesWithExactPackage' @ [93:30] ==> @JvmStatic public final fun findFilesWithExactPackage(packageFqName: FqName, searchScope: GlobalSearchScope, project: Project): Collection<KtFile> defined in org.jetbrains.kotlin.idea.stubindex.PackageIndexUtil[SimpleFunctionDescriptorImpl]

'fqName' @ [93:56] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.findFilesForPackage[ValueParameterDescriptorImpl]

'sourceAndClassFiles' @ [93:64] ==> @JvmStatic public final fun sourceAndClassFiles(delegate: GlobalSearchScope, project: Project): GlobalSearchScope defined in org.jetbrains.kotlin.idea.stubindex.KotlinSourceFilterScope.Companion[FunctionImportedFromObject]

'searchScope' @ [93:84] ==> value-parameter searchScope: GlobalSearchScope defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.findFilesForPackage[ValueParameterDescriptorImpl]

'project' @ [93:97] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport[PropertyDescriptorImpl]

'project' @ [93:107] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport[PropertyDescriptorImpl]

'getInstance' @ [101:50] ==> public open fun getInstance(): (KotlinTopLevelClassByPackageIndex..KotlinTopLevelClassByPackageIndex?) defined in org.jetbrains.kotlin.idea.stubindex.KotlinTopLevelClassByPackageIndex[JavaMethodDescriptor]

'get' @ [101:64] ==> @NotNull @Override public open fun get(@NotNull fqName: String, @NotNull project: Project, @NotNull scope: GlobalSearchScope): (MutableCollection<(KtClassOrObject..KtClassOrObject?)>..Collection<(KtClassOrObject..KtClassOrObject?)>) defined in org.jetbrains.kotlin.idea.stubindex.KotlinTopLevelClassByPackageIndex[JavaMethodDescriptor]

'packageFqName' @ [102:17] ==> value-parameter packageFqName: FqName defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.findClassOrObjectDeclarationsInPackage[ValueParameterDescriptorImpl]

'asString' @ [102:31] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'project' @ [102:43] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport[PropertyDescriptorImpl]

'sourceAndClassFiles' @ [102:52] ==> @JvmStatic public final fun sourceAndClassFiles(delegate: GlobalSearchScope, project: Project): GlobalSearchScope defined in org.jetbrains.kotlin.idea.stubindex.KotlinSourceFilterScope.Companion[FunctionImportedFromObject]

'searchScope' @ [102:72] ==> value-parameter searchScope: GlobalSearchScope defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.findClassOrObjectDeclarationsInPackage[ValueParameterDescriptorImpl]

'project' @ [102:85] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport[PropertyDescriptorImpl]

'PackageIndexUtil' @ [106:16] ==> public object PackageIndexUtil defined in org.jetbrains.kotlin.idea.stubindex in file PackageIndexUtil.kt[FakeCallableDescriptorForObject]

'packageExists' @ [106:33] ==> @JvmStatic public final fun packageExists(packageFqName: FqName, searchScope: GlobalSearchScope, project: Project): Boolean defined in org.jetbrains.kotlin.idea.stubindex.PackageIndexUtil[SimpleFunctionDescriptorImpl]

'fqName' @ [106:47] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.packageExists[ValueParameterDescriptorImpl]

'sourceAndClassFiles' @ [106:55] ==> @JvmStatic public final fun sourceAndClassFiles(delegate: GlobalSearchScope, project: Project): GlobalSearchScope defined in org.jetbrains.kotlin.idea.stubindex.KotlinSourceFilterScope.Companion[FunctionImportedFromObject]

'scope' @ [106:75] ==> value-parameter scope: GlobalSearchScope defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.packageExists[ValueParameterDescriptorImpl]

'project' @ [106:82] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport[PropertyDescriptorImpl]

'project' @ [106:92] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport[PropertyDescriptorImpl]

'PackageIndexUtil' @ [110:16] ==> public object PackageIndexUtil defined in org.jetbrains.kotlin.idea.stubindex in file PackageIndexUtil.kt[FakeCallableDescriptorForObject]

'getSubPackageFqNames' @ [110:33] ==> @JvmStatic public final fun getSubPackageFqNames(packageFqName: FqName, scope: GlobalSearchScope, project: Project, nameFilter: (Name) -> Boolean): Collection<FqName> defined in org.jetbrains.kotlin.idea.stubindex.PackageIndexUtil[SimpleFunctionDescriptorImpl]

'fqn' @ [110:54] ==> value-parameter fqn: FqName defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.getSubPackages[ValueParameterDescriptorImpl]

'sourceAndClassFiles' @ [110:59] ==> @JvmStatic public final fun sourceAndClassFiles(delegate: GlobalSearchScope, project: Project): GlobalSearchScope defined in org.jetbrains.kotlin.idea.stubindex.KotlinSourceFilterScope.Companion[FunctionImportedFromObject]

'scope' @ [110:79] ==> value-parameter scope: GlobalSearchScope defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.getSubPackages[ValueParameterDescriptorImpl]

'project' @ [110:86] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport[PropertyDescriptorImpl]

'project' @ [110:96] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport[PropertyDescriptorImpl]

'MemberScope' @ [110:105] ==> public companion object defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[FakeCallableDescriptorForObject]

'ALL_NAME_FILTER' @ [110:117] ==> public final val ALL_NAME_FILTER: (Name) -> Boolean defined in org.jetbrains.kotlin.resolve.scopes.MemberScope.Companion[DeserializedPropertyDescriptor]

'classOrObject' @ [114:27] ==> value-parameter classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.getLightClass[ValueParameterDescriptorImpl]

'containingFile' @ [114:41] ==> public final val KtClassOrObject.containingFile: PsiFile[MyPropertyDescriptor]

'virtualFile' @ [114:56] ==> public final val PsiFile.virtualFile: (VirtualFile..VirtualFile?)[MyPropertyDescriptor]

'virtualFile' @ [115:13] ==> val virtualFile: (VirtualFile..VirtualFile?) defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.getLightClass[LocalVariableDescriptor]

'when {
                ProjectRootsUtil.isProjectSourceFile(project, virtualFile) ->
                    return KtLightClassForSourceDeclaration.create(classOrObject)
                ProjectRootsUtil.isLibraryClassFile(project, virtualFile) ->
                    return getLightClassForDecompiledClassOrObject(classOrObject)
                ProjectRootsUtil.isLibrarySourceFile(project, virtualFile) ->
                    return SourceNavigationHelper.getOriginalClass(classOrObject) as? KtLightClass
            }' @ [116:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Nothing, entry1: Nothing, entry2: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Nothing

'ProjectRootsUtil' @ [117:17] ==> public object ProjectRootsUtil defined in org.jetbrains.kotlin.idea.util in file ProjectRootsUtil.kt[FakeCallableDescriptorForObject]

'isProjectSourceFile' @ [117:34] ==> @JvmStatic public final fun isProjectSourceFile(project: Project, file: VirtualFile): Boolean defined in org.jetbrains.kotlin.idea.util.ProjectRootsUtil[SimpleFunctionDescriptorImpl]

'project' @ [117:54] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport[PropertyDescriptorImpl]

'virtualFile' @ [117:63] ==> val virtualFile: (VirtualFile..VirtualFile?) defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.getLightClass[LocalVariableDescriptor]

'KtLightClassForSourceDeclaration' @ [118:28] ==> public companion object defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForSourceDeclaration[FakeCallableDescriptorForObject]

'create' @ [118:61] ==> public final fun create(classOrObject: KtClassOrObject): KtLightClassForSourceDeclaration? defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForSourceDeclaration.Companion[DeserializedSimpleFunctionDescriptor]

'classOrObject' @ [118:68] ==> value-parameter classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.getLightClass[ValueParameterDescriptorImpl]

'ProjectRootsUtil' @ [119:17] ==> public object ProjectRootsUtil defined in org.jetbrains.kotlin.idea.util in file ProjectRootsUtil.kt[FakeCallableDescriptorForObject]

'isLibraryClassFile' @ [119:34] ==> @JvmStatic public final fun isLibraryClassFile(project: Project, file: VirtualFile): Boolean defined in org.jetbrains.kotlin.idea.util.ProjectRootsUtil[SimpleFunctionDescriptorImpl]

'project' @ [119:53] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport[PropertyDescriptorImpl]

'virtualFile' @ [119:62] ==> val virtualFile: (VirtualFile..VirtualFile?) defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.getLightClass[LocalVariableDescriptor]

'getLightClassForDecompiledClassOrObject' @ [120:28] ==> private final fun getLightClassForDecompiledClassOrObject(decompiledClassOrObject: KtClassOrObject): KtLightClassForDecompiledDeclaration? defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport[SimpleFunctionDescriptorImpl]

'classOrObject' @ [120:68] ==> value-parameter classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.getLightClass[ValueParameterDescriptorImpl]

'ProjectRootsUtil' @ [121:17] ==> public object ProjectRootsUtil defined in org.jetbrains.kotlin.idea.util in file ProjectRootsUtil.kt[FakeCallableDescriptorForObject]

'isLibrarySourceFile' @ [121:34] ==> @JvmStatic public final fun isLibrarySourceFile(project: Project, file: VirtualFile): Boolean defined in org.jetbrains.kotlin.idea.util.ProjectRootsUtil[SimpleFunctionDescriptorImpl]

'project' @ [121:54] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport[PropertyDescriptorImpl]

'virtualFile' @ [121:63] ==> val virtualFile: (VirtualFile..VirtualFile?) defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.getLightClass[LocalVariableDescriptor]

'SourceNavigationHelper' @ [122:28] ==> public object SourceNavigationHelper defined in org.jetbrains.kotlin.idea.decompiler.navigation in file SourceNavigationHelper.kt[FakeCallableDescriptorForObject]

'getOriginalClass' @ [122:51] ==> public final fun getOriginalClass(classOrObject: KtClassOrObject): PsiClass? defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper[SimpleFunctionDescriptorImpl]

'classOrObject' @ [122:68] ==> value-parameter classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.getLightClass[ValueParameterDescriptorImpl]

'!=' @ [125:13] ==> public open fun equals(other: Any?): Boolean defined in com.intellij.psi.PsiElement[DeserializedSimpleFunctionDescriptor]

'classOrObject' @ [125:14] ==> value-parameter classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.getLightClass[ValueParameterDescriptorImpl]

'containingFile' @ [125:28] ==> public final val KtClassOrObject.containingFile: PsiFile[MyPropertyDescriptor]

'analysisContext' @ [125:56] ==> public var KtFile.analysisContext: PsiElement? defined in org.jetbrains.kotlin.psi[DeserializedPropertyDescriptor]

'KtLightClassForSourceDeclaration' @ [127:20] ==> public companion object defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForSourceDeclaration[FakeCallableDescriptorForObject]

'create' @ [127:53] ==> public final fun create(classOrObject: KtClassOrObject): KtLightClassForSourceDeclaration? defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForSourceDeclaration.Companion[DeserializedSimpleFunctionDescriptor]

'classOrObject' @ [127:60] ==> value-parameter classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.getLightClass[ValueParameterDescriptorImpl]

'lightClassForFacade' @ [136:13] ==> value-parameter lightClassForFacade: KtLightClassForFacade? defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.withFakeLightClasses[ValueParameterDescriptorImpl]

'emptyList' @ [136:49] ==> public fun <T> emptyList(): List<PsiClass> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiClass

'ArrayList' @ [138:28] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> PsiClass

'lightClasses' @ [139:9] ==> val lightClasses: ArrayList<PsiClass> defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.withFakeLightClasses[LocalVariableDescriptor]

'add' @ [139:22] ==> public open fun add(element: PsiClass): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'lightClassForFacade' @ [139:26] ==> value-parameter lightClassForFacade: KtLightClassForFacade? defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.withFakeLightClasses[ValueParameterDescriptorImpl]

'facadeFiles' @ [140:13] ==> value-parameter facadeFiles: List<KtFile> defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.withFakeLightClasses[ValueParameterDescriptorImpl]

'size' @ [140:25] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'lightClasses' @ [141:13] ==> val lightClasses: ArrayList<PsiClass> defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.withFakeLightClasses[LocalVariableDescriptor]

'addAll' @ [141:26] ==> public open fun addAll(elements: Collection<PsiClass>): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'facadeFiles' @ [141:33] ==> value-parameter facadeFiles: List<KtFile> defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.withFakeLightClasses[ValueParameterDescriptorImpl]

'map' @ [141:45] ==> public inline fun <T, R> Iterable<KtFile>.map(transform: (KtFile) -> FakeLightClassForFileOfPackage): List<FakeLightClassForFileOfPackage> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFile
    <R> -> FakeLightClassForFileOfPackage

'FakeLightClassForFileOfPackage' @ [142:17] ==> public constructor FakeLightClassForFileOfPackage(@NotNull p0: KtLightClassForFacade, @NotNull p1: KtFile) defined in org.jetbrains.kotlin.asJava.classes.FakeLightClassForFileOfPackage[JavaClassConstructorDescriptor]

'lightClassForFacade' @ [142:48] ==> value-parameter lightClassForFacade: KtLightClassForFacade? defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.withFakeLightClasses[ValueParameterDescriptorImpl]

'it' @ [142:69] ==> value-parameter it: KtFile defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.withFakeLightClasses.<anonymous>[ValueParameterDescriptorImpl]

'lightClasses' @ [145:16] ==> val lightClasses: ArrayList<PsiClass> defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.withFakeLightClasses[LocalVariableDescriptor]

'findFilesForFacade' @ [149:29] ==> public open fun findFilesForFacade(facadeFqName: FqName, scope: GlobalSearchScope): Collection<KtFile> defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport[SimpleFunctionDescriptorImpl]

'facadeFqName' @ [149:48] ==> value-parameter facadeFqName: FqName defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.getFacadeClasses[ValueParameterDescriptorImpl]

'scope' @ [149:62] ==> value-parameter scope: GlobalSearchScope defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.getFacadeClasses[ValueParameterDescriptorImpl]

'groupBy' @ [149:69] ==> public inline fun <T, K> Iterable<KtFile>.groupBy(keySelector: (KtFile) -> IdeaModuleInfo): Map<IdeaModuleInfo, List<KtFile>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFile
    <K> -> IdeaModuleInfo

'KtFile' @ [149:77] ==> public constructor KtFile(p0: (FileViewProvider..FileViewProvider?), p1: Boolean) defined in org.jetbrains.kotlin.psi.KtFile[JavaClassConstructorDescriptor]

'filesByModule' @ [151:16] ==> val filesByModule: Map<IdeaModuleInfo, List<KtFile>> defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.getFacadeClasses[LocalVariableDescriptor]

'flatMap' @ [151:30] ==> public inline fun <K, V, R> Map<out IdeaModuleInfo, List<KtFile>>.flatMap(transform: (Map.Entry<IdeaModuleInfo, List<KtFile>>) -> Iterable<PsiClass>): List<PsiClass> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> IdeaModuleInfo
    <V> -> List<KtFile>
    <R> -> PsiClass

'createLightClassForFileFacade' @ [152:13] ==> public final fun createLightClassForFileFacade(facadeFqName: FqName, facadeFiles: List<KtFile>, moduleInfo: IdeaModuleInfo): List<PsiClass> defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport[SimpleFunctionDescriptorImpl]

'facadeFqName' @ [152:43] ==> value-parameter facadeFqName: FqName defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.getFacadeClasses[ValueParameterDescriptorImpl]

'it' @ [152:57] ==> value-parameter it: Map.Entry<IdeaModuleInfo, List<KtFile>> defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.getFacadeClasses.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [152:60] ==> public abstract val value: List<KtFile> defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'it' @ [152:67] ==> value-parameter it: Map.Entry<IdeaModuleInfo, List<KtFile>> defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.getFacadeClasses.<anonymous>[ValueParameterDescriptorImpl]

'key' @ [152:70] ==> public abstract val key: IdeaModuleInfo defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'fqName' @ [157:13] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.getKotlinInternalClasses[ValueParameterDescriptorImpl]

'isRoot' @ [157:20] ==> public final val FqName.isRoot: Boolean[MyPropertyDescriptor]

'emptyList' @ [157:35] ==> public fun <T> emptyList(): List<PsiClass> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiClass

'findPackageParts' @ [159:16] ==> private final fun findPackageParts(fqName: FqName, scope: GlobalSearchScope): List<KtLightClassForDecompiledDeclaration> defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport[SimpleFunctionDescriptorImpl]

'fqName' @ [159:33] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.getKotlinInternalClasses[ValueParameterDescriptorImpl]

'scope' @ [159:41] ==> value-parameter scope: GlobalSearchScope defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.getKotlinInternalClasses[ValueParameterDescriptorImpl]

'findPlatformWrapper' @ [159:50] ==> private final fun findPlatformWrapper(fqName: FqName, scope: GlobalSearchScope): Collection<PsiClass> defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport[SimpleFunctionDescriptorImpl]

'fqName' @ [159:70] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.getKotlinInternalClasses[ValueParameterDescriptorImpl]

'scope' @ [159:78] ==> value-parameter scope: GlobalSearchScope defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.getKotlinInternalClasses[ValueParameterDescriptorImpl]

'StaticFacadeIndexUtil' @ [163:29] ==> public object StaticFacadeIndexUtil defined in org.jetbrains.kotlin.idea.stubindex in file StaticFacadeIndexUtil.kt[FakeCallableDescriptorForObject]

'getMultifileClassForPart' @ [163:51] ==> @JvmStatic public final fun getMultifileClassForPart(partFqName: FqName, searchScope: GlobalSearchScope, project: Project): Collection<KtFile> defined in org.jetbrains.kotlin.idea.stubindex.StaticFacadeIndexUtil[SimpleFunctionDescriptorImpl]

'fqName' @ [163:76] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.findPackageParts[ValueParameterDescriptorImpl]

'scope' @ [163:84] ==> value-parameter scope: GlobalSearchScope defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.findPackageParts[ValueParameterDescriptorImpl]

'project' @ [163:91] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport[PropertyDescriptorImpl]

'fqName' @ [164:29] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.findPackageParts[ValueParameterDescriptorImpl]

'shortName' @ [164:36] ==> @NotNull public open fun shortName(): Name defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'asString' @ [164:48] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'partShortName' @ [165:38] ==> val partShortName: String defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.findPackageParts[LocalVariableDescriptor]

'facadeKtFiles' @ [167:16] ==> val facadeKtFiles: Collection<KtFile> defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.findPackageParts[LocalVariableDescriptor]

'mapNotNull' @ [167:30] ==> public inline fun <T, R : Any> Iterable<KtFile>.mapNotNull(transform: (KtFile) -> KtLightClassForDecompiledDeclaration?): List<KtLightClassForDecompiledDeclaration> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFile
    <R : Any> -> KtLightClassForDecompiledDeclaration

'if (facadeKtFile is KtClsFile) {
                val partClassFile = facadeKtFile.virtualFile.parent.findChild(partClassFileShortName) ?: return@mapNotNull null
                val javaClsClass = createClsJavaClassFromVirtualFile(facadeKtFile, partClassFile, null) ?: return@mapNotNull null
                KtLightClassForDecompiledDeclaration(javaClsClass, null, facadeKtFile)
            }
            else {
                // TODO should we build light classes for parts from source?
                null
            }' @ [168:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtLightClassForDecompiledDeclaration?, elseBranch: KtLightClassForDecompiledDeclaration?): KtLightClassForDecompiledDeclaration?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtLightClassForDecompiledDeclaration?

'facadeKtFile' @ [168:17] ==> value-parameter facadeKtFile: KtFile defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.findPackageParts.<anonymous>[ValueParameterDescriptorImpl]

'facadeKtFile' @ [169:37] ==> value-parameter facadeKtFile: KtFile defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.findPackageParts.<anonymous>[ValueParameterDescriptorImpl]

'virtualFile' @ [169:50] ==> public final val KtClsFile.virtualFile: (VirtualFile..VirtualFile?)[MyPropertyDescriptor]

'parent' @ [169:62] ==> public final val VirtualFile.parent: (VirtualFile..VirtualFile?)[MyPropertyDescriptor]

'findChild' @ [169:69] ==> @Nullable public open fun findChild(@NotNull p0: String): VirtualFile? defined in com.intellij.openapi.vfs.VirtualFile[JavaMethodDescriptor]

'partClassFileShortName' @ [169:79] ==> val partClassFileShortName: String defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.findPackageParts[LocalVariableDescriptor]

'createClsJavaClassFromVirtualFile' @ [170:36] ==> private final fun createClsJavaClassFromVirtualFile(mirrorFile: KtFile, classFile: VirtualFile, correspondingClassOrObject: KtClassOrObject?): ClsClassImpl? defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport[SimpleFunctionDescriptorImpl]

'facadeKtFile' @ [170:70] ==> value-parameter facadeKtFile: KtFile defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.findPackageParts.<anonymous>[ValueParameterDescriptorImpl]

'partClassFile' @ [170:84] ==> val partClassFile: VirtualFile defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.findPackageParts.<anonymous>[LocalVariableDescriptor]

'KtLightClassForDecompiledDeclaration' @ [171:17] ==> public constructor KtLightClassForDecompiledDeclaration(clsDelegate: ClsClassImpl, kotlinOrigin: KtClassOrObject?, file: KtClsFile) defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.KtLightClassForDecompiledDeclaration[ClassConstructorDescriptorImpl]

'javaClsClass' @ [171:54] ==> val javaClsClass: ClsClassImpl defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.findPackageParts.<anonymous>[LocalVariableDescriptor]

'facadeKtFile' @ [171:74] ==> value-parameter facadeKtFile: KtFile defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.findPackageParts.<anonymous>[ValueParameterDescriptorImpl]

'platformMutabilityWrapper' @ [181:16] ==> public fun platformMutabilityWrapper(fqName: FqName, findJavaClass: (String) -> PsiClass?): PsiClass? defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses[SimpleFunctionDescriptorImpl]

'fqName' @ [181:42] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.findPlatformWrapper[ValueParameterDescriptorImpl]

'getInstance' @ [181:66] ==> public open fun getInstance(p0: (Project..Project?)): (JavaPsiFacade..JavaPsiFacade?) defined in com.intellij.psi.JavaPsiFacade[JavaMethodDescriptor]

'project' @ [181:78] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport[PropertyDescriptorImpl]

'findClass' @ [181:87] ==> @Nullable public abstract fun findClass(@NonNls @NotNull p0: String, @NotNull p1: GlobalSearchScope): PsiClass? defined in com.intellij.psi.JavaPsiFacade[JavaMethodDescriptor]

'it' @ [181:97] ==> value-parameter it: String defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.findPlatformWrapper.<anonymous>[ValueParameterDescriptorImpl]

'scope' @ [181:101] ==> value-parameter scope: GlobalSearchScope defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.findPlatformWrapper[ValueParameterDescriptorImpl]

'let' @ [181:111] ==> @InlineOnly public inline fun <T, R> PsiClass.let(block: (PsiClass) -> List<PsiClass>): List<PsiClass> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiClass
    <R> -> List<PsiClass>

'listOf' @ [181:117] ==> public fun <T> listOf(element: PsiClass): List<PsiClass> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiClass

'it' @ [181:124] ==> value-parameter it: PsiClass defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.findPlatformWrapper.<anonymous>[ValueParameterDescriptorImpl]

'orEmpty' @ [181:130] ==> @InlineOnly public inline fun <T> List<PsiClass>?.orEmpty(): List<PsiClass> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiClass

'if (moduleInfo is ModuleSourceInfo) {
            val lightClassForFacade = KtLightClassForFacade.createForFacade(
                    psiManager, facadeFqName, moduleInfo.contentScope(), facadeFiles)
            withFakeLightClasses(lightClassForFacade, facadeFiles)
        }
        else {
            facadeFiles.filterIsInstance<KtClsFile>().mapNotNull { createLightClassForDecompiledKotlinFile(it) }
        }' @ [189:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: List<PsiClass>, elseBranch: List<PsiClass>): List<PsiClass>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> List<PsiClass>

'moduleInfo' @ [189:20] ==> value-parameter moduleInfo: IdeaModuleInfo defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.createLightClassForFileFacade[ValueParameterDescriptorImpl]

'KtLightClassForFacade' @ [190:39] ==> public companion object Factory defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade[FakeCallableDescriptorForObject]

'createForFacade' @ [190:61] ==> public final fun createForFacade(manager: PsiManager, facadeClassFqName: FqName, searchScope: GlobalSearchScope, files: Collection<KtFile>): KtLightClassForFacade defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade.Factory[DeserializedSimpleFunctionDescriptor]

'psiManager' @ [191:21] ==> private final val psiManager: PsiManager defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport[PropertyDescriptorImpl]

'facadeFqName' @ [191:33] ==> value-parameter facadeFqName: FqName defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.createLightClassForFileFacade[ValueParameterDescriptorImpl]

'moduleInfo' @ [191:47] ==> value-parameter moduleInfo: IdeaModuleInfo defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.createLightClassForFileFacade[ValueParameterDescriptorImpl]

'contentScope' @ [191:58] ==> public abstract fun contentScope(): GlobalSearchScope defined in org.jetbrains.kotlin.idea.caches.resolve.IdeaModuleInfo[SimpleFunctionDescriptorImpl]

'facadeFiles' @ [191:74] ==> value-parameter facadeFiles: List<KtFile> defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.createLightClassForFileFacade[ValueParameterDescriptorImpl]

'withFakeLightClasses' @ [192:13] ==> private final fun withFakeLightClasses(lightClassForFacade: KtLightClassForFacade?, facadeFiles: List<KtFile>): List<PsiClass> defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport[SimpleFunctionDescriptorImpl]

'lightClassForFacade' @ [192:34] ==> val lightClassForFacade: KtLightClassForFacade defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.createLightClassForFileFacade[LocalVariableDescriptor]

'facadeFiles' @ [192:55] ==> value-parameter facadeFiles: List<KtFile> defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.createLightClassForFileFacade[ValueParameterDescriptorImpl]

'facadeFiles' @ [195:13] ==> value-parameter facadeFiles: List<KtFile> defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.createLightClassForFileFacade[ValueParameterDescriptorImpl]

'filterIsInstance' @ [195:25] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<KtClsFile> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> KtClsFile

'mapNotNull' @ [195:55] ==> public inline fun <T, R : Any> Iterable<KtClsFile>.mapNotNull(transform: (KtClsFile) -> KtLightClassForDecompiledDeclaration?): List<KtLightClassForDecompiledDeclaration> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtClsFile
    <R : Any> -> KtLightClassForDecompiledDeclaration

'createLightClassForDecompiledKotlinFile' @ [195:68] ==> private final fun createLightClassForDecompiledKotlinFile(file: KtClsFile): KtLightClassForDecompiledDeclaration? defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport[SimpleFunctionDescriptorImpl]

'it' @ [195:108] ==> value-parameter it: KtClsFile defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.createLightClassForFileFacade.<anonymous>[ValueParameterDescriptorImpl]

'runReadAction' @ [200:16] ==> public fun <T> runReadAction(action: () -> (MutableCollection<(KtFile..KtFile?)>..Collection<(KtFile..KtFile?)>?)): (MutableCollection<(KtFile..KtFile?)>..Collection<(KtFile..KtFile?)>?) defined in org.jetbrains.kotlin.idea.util.application[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> (kotlin.collections.MutableCollection<(org.jetbrains.kotlin.psi.KtFile..org.jetbrains.kotlin.psi.KtFile?)>..kotlin.collections.Collection<(org.jetbrains.kotlin.psi.KtFile..org.jetbrains.kotlin.psi.KtFile?)>?)

'KotlinFileFacadeFqNameIndex' @ [201:13] ==> public companion object defined in org.jetbrains.kotlin.idea.stubindex.KotlinFileFacadeFqNameIndex[FakeCallableDescriptorForObject]

'INSTANCE' @ [201:41] ==> @JvmField public final val INSTANCE: KotlinFileFacadeFqNameIndex defined in org.jetbrains.kotlin.idea.stubindex.KotlinFileFacadeFqNameIndex.Companion[PropertyDescriptorImpl]

'get' @ [201:50] ==> public open fun get(key: String, project: Project, scope: GlobalSearchScope): (MutableCollection<(KtFile..KtFile?)>..Collection<(KtFile..KtFile?)>?) defined in org.jetbrains.kotlin.idea.stubindex.KotlinFileFacadeFqNameIndex[SimpleFunctionDescriptorImpl]

'facadeFqName' @ [201:54] ==> value-parameter facadeFqName: FqName defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.findFilesForFacade[ValueParameterDescriptorImpl]

'asString' @ [201:67] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'project' @ [201:79] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport[PropertyDescriptorImpl]

'scope' @ [201:88] ==> value-parameter scope: GlobalSearchScope defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.findFilesForFacade[ValueParameterDescriptorImpl]

'declaration' @ [207:20] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.resolveToDescriptor[ValueParameterDescriptorImpl]

'resolveToDescriptor' @ [207:32] ==> public fun KtDeclaration.resolveToDescriptor(bodyResolveMode: BodyResolveMode = ...): DeclarationDescriptor defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'element' @ [214:48] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.analyze[ValueParameterDescriptorImpl]

'analyze' @ [214:56] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'PARTIAL' @ [214:80] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'element' @ [216:53] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.analyzeFully[ValueParameterDescriptorImpl]

'analyzeFully' @ [216:61] ==> public fun KtElement.analyzeFully(): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'runReadAction' @ [219:36] ==> public fun <T> runReadAction(action: () -> (MutableCollection<(KtFile..KtFile?)>..Collection<(KtFile..KtFile?)>?)): (MutableCollection<(KtFile..KtFile?)>..Collection<(KtFile..KtFile?)>?) defined in org.jetbrains.kotlin.idea.util.application[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> (kotlin.collections.MutableCollection<(org.jetbrains.kotlin.psi.KtFile..org.jetbrains.kotlin.psi.KtFile?)>..kotlin.collections.Collection<(org.jetbrains.kotlin.psi.KtFile..org.jetbrains.kotlin.psi.KtFile?)>?)

'KotlinFileFacadeClassByPackageIndex' @ [220:13] ==> public companion object defined in org.jetbrains.kotlin.idea.stubindex.KotlinFileFacadeClassByPackageIndex[FakeCallableDescriptorForObject]

'getInstance' @ [220:49] ==> @JvmStatic public final fun getInstance(): KotlinFileFacadeClassByPackageIndex defined in org.jetbrains.kotlin.idea.stubindex.KotlinFileFacadeClassByPackageIndex.Companion[SimpleFunctionDescriptorImpl]

'get' @ [220:63] ==> public open fun get(key: String, project: Project, scope: GlobalSearchScope): (MutableCollection<(KtFile..KtFile?)>..Collection<(KtFile..KtFile?)>?) defined in org.jetbrains.kotlin.idea.stubindex.KotlinFileFacadeClassByPackageIndex[SimpleFunctionDescriptorImpl]

'packageFqName' @ [220:67] ==> value-parameter packageFqName: FqName defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.getFacadeNames[ValueParameterDescriptorImpl]

'asString' @ [220:81] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'project' @ [220:93] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport[PropertyDescriptorImpl]

'scope' @ [220:102] ==> value-parameter scope: GlobalSearchScope defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.getFacadeNames[ValueParameterDescriptorImpl]

'facadeFilesInPackage' @ [222:16] ==> val facadeFilesInPackage: (MutableCollection<(KtFile..KtFile?)>..Collection<(KtFile..KtFile?)>?) defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.getFacadeNames[LocalVariableDescriptor]

'map' @ [222:37] ==> public inline fun <T, R> Iterable<(KtFile..KtFile?)>.map(transform: ((KtFile..KtFile?)) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtFile..org.jetbrains.kotlin.psi.KtFile?)
    <R> -> String

'it' @ [222:43] ==> value-parameter it: (KtFile..KtFile?) defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.getFacadeNames.<anonymous>[ValueParameterDescriptorImpl]

'javaFileFacadeFqName' @ [222:46] ==> public val KtFile.javaFileFacadeFqName: FqName defined in org.jetbrains.kotlin.fileClasses[DeserializedPropertyDescriptor]

'shortName' @ [222:67] ==> @NotNull public open fun shortName(): Name defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'asString' @ [222:79] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'runReadAction' @ [226:36] ==> public fun <T> runReadAction(action: () -> (MutableCollection<(KtFile..KtFile?)>..Collection<(KtFile..KtFile?)>?)): (MutableCollection<(KtFile..KtFile?)>..Collection<(KtFile..KtFile?)>?) defined in org.jetbrains.kotlin.idea.util.application[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> (kotlin.collections.MutableCollection<(org.jetbrains.kotlin.psi.KtFile..org.jetbrains.kotlin.psi.KtFile?)>..kotlin.collections.Collection<(org.jetbrains.kotlin.psi.KtFile..org.jetbrains.kotlin.psi.KtFile?)>?)

'KotlinFileFacadeClassByPackageIndex' @ [227:13] ==> public companion object defined in org.jetbrains.kotlin.idea.stubindex.KotlinFileFacadeClassByPackageIndex[FakeCallableDescriptorForObject]

'getInstance' @ [227:49] ==> @JvmStatic public final fun getInstance(): KotlinFileFacadeClassByPackageIndex defined in org.jetbrains.kotlin.idea.stubindex.KotlinFileFacadeClassByPackageIndex.Companion[SimpleFunctionDescriptorImpl]

'get' @ [227:63] ==> public open fun get(key: String, project: Project, scope: GlobalSearchScope): (MutableCollection<(KtFile..KtFile?)>..Collection<(KtFile..KtFile?)>?) defined in org.jetbrains.kotlin.idea.stubindex.KotlinFileFacadeClassByPackageIndex[SimpleFunctionDescriptorImpl]

'packageFqName' @ [227:67] ==> value-parameter packageFqName: FqName defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.getFacadeClassesInPackage[ValueParameterDescriptorImpl]

'asString' @ [227:81] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'project' @ [227:93] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport[PropertyDescriptorImpl]

'scope' @ [227:102] ==> value-parameter scope: GlobalSearchScope defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.getFacadeClassesInPackage[ValueParameterDescriptorImpl]

'facadeFilesInPackage' @ [229:44] ==> val facadeFilesInPackage: (MutableCollection<(KtFile..KtFile?)>..Collection<(KtFile..KtFile?)>?) defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.getFacadeClassesInPackage[LocalVariableDescriptor]

'groupBy' @ [229:65] ==> public inline fun <T, K> Iterable<(KtFile..KtFile?)>.groupBy(keySelector: ((KtFile..KtFile?)) -> Pair<FqName, IdeaModuleInfo>): Map<Pair<FqName, IdeaModuleInfo>, List<(KtFile..KtFile?)>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtFile..org.jetbrains.kotlin.psi.KtFile?)
    <K> -> Pair<FqName, IdeaModuleInfo>

'Pair' @ [230:13] ==> public constructor Pair<out A, out B>(first: FqName, second: IdeaModuleInfo) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> FqName
    <out B> -> IdeaModuleInfo

'it' @ [230:18] ==> value-parameter it: (KtFile..KtFile?) defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.getFacadeClassesInPackage.<anonymous>[ValueParameterDescriptorImpl]

'javaFileFacadeFqName' @ [230:21] ==> public val KtFile.javaFileFacadeFqName: FqName defined in org.jetbrains.kotlin.fileClasses[DeserializedPropertyDescriptor]

'it' @ [230:43] ==> value-parameter it: (KtFile..KtFile?) defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.getFacadeClassesInPackage.<anonymous>[ValueParameterDescriptorImpl]

'getModuleInfo' @ [230:46] ==> public fun PsiElement.getModuleInfo(): IdeaModuleInfo defined in org.jetbrains.kotlin.idea.caches.resolve in file getModuleInfo.kt[SimpleFunctionDescriptorImpl]

'groupedByFqNameAndModuleInfo' @ [233:16] ==> val groupedByFqNameAndModuleInfo: Map<Pair<FqName, IdeaModuleInfo>, List<(KtFile..KtFile?)>> defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.getFacadeClassesInPackage[LocalVariableDescriptor]

'flatMap' @ [233:45] ==> public inline fun <K, V, R> Map<out Pair<FqName, IdeaModuleInfo>, List<(KtFile..KtFile?)>>.flatMap(transform: (Map.Entry<Pair<FqName, IdeaModuleInfo>, List<(KtFile..KtFile?)>>) -> Iterable<PsiClass>): List<PsiClass> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Pair<FqName, IdeaModuleInfo>
    <V> -> List<(org.jetbrains.kotlin.psi.KtFile..org.jetbrains.kotlin.psi.KtFile?)>
    <R> -> PsiClass

'component1' @ [234:18] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<Pair<FqName, IdeaModuleInfo>, List<(KtFile..KtFile?)>>.component1(): Pair<FqName, IdeaModuleInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Pair<FqName, IdeaModuleInfo>
    <V> -> List<(org.jetbrains.kotlin.psi.KtFile..org.jetbrains.kotlin.psi.KtFile?)>

'component2' @ [234:23] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<Pair<FqName, IdeaModuleInfo>, List<(KtFile..KtFile?)>>.component2(): List<(KtFile..KtFile?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Pair<FqName, IdeaModuleInfo>
    <V> -> List<(org.jetbrains.kotlin.psi.KtFile..org.jetbrains.kotlin.psi.KtFile?)>

'it' @ [234:32] ==> value-parameter it: Map.Entry<Pair<FqName, IdeaModuleInfo>, List<(KtFile..KtFile?)>> defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.getFacadeClassesInPackage.<anonymous>[ValueParameterDescriptorImpl]

'component1' @ [235:18] ==> public final operator fun component1(): FqName defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [235:26] ==> public final operator fun component2(): IdeaModuleInfo defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'key' @ [235:40] ==> val key: Pair<FqName, IdeaModuleInfo> defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.getFacadeClassesInPackage.<anonymous>[LocalVariableDescriptor]

'createLightClassForFileFacade' @ [236:13] ==> public final fun createLightClassForFileFacade(facadeFqName: FqName, facadeFiles: List<KtFile>, moduleInfo: IdeaModuleInfo): List<PsiClass> defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport[SimpleFunctionDescriptorImpl]

'fqName' @ [236:43] ==> val fqName: FqName defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.getFacadeClassesInPackage.<anonymous>[LocalVariableDescriptor]

'files' @ [236:51] ==> val files: List<(KtFile..KtFile?)> defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.getFacadeClassesInPackage.<anonymous>[LocalVariableDescriptor]

'moduleInfo' @ [236:58] ==> val moduleInfo: IdeaModuleInfo defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.getFacadeClassesInPackage.<anonymous>[LocalVariableDescriptor]

'decompiledClassOrObject' @ [241:13] ==> value-parameter decompiledClassOrObject: KtClassOrObject defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.getLightClassForDecompiledClassOrObject[ValueParameterDescriptorImpl]

'decompiledClassOrObject' @ [244:32] ==> value-parameter decompiledClassOrObject: KtClassOrObject defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.getLightClassForDecompiledClassOrObject[ValueParameterDescriptorImpl]

'containingFile' @ [244:56] ==> public final val KtClassOrObject.containingFile: PsiFile[MyPropertyDescriptor]

'createLightClassForDecompiledKotlinFile' @ [245:47] ==> private final fun createLightClassForDecompiledKotlinFile(file: KtClsFile): KtLightClassForDecompiledDeclaration? defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport[SimpleFunctionDescriptorImpl]

'containingKtFile' @ [245:87] ==> val containingKtFile: KtClsFile defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.getLightClassForDecompiledClassOrObject[LocalVariableDescriptor]

'findCorrespondingLightClass' @ [247:16] ==> private final fun findCorrespondingLightClass(decompiledClassOrObject: KtClassOrObject, rootLightClassForDecompiledFile: KtLightClassForDecompiledDeclaration): KtLightClassForDecompiledDeclaration defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport[SimpleFunctionDescriptorImpl]

'decompiledClassOrObject' @ [247:44] ==> value-parameter decompiledClassOrObject: KtClassOrObject defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.getLightClassForDecompiledClassOrObject[ValueParameterDescriptorImpl]

'rootLightClassForDecompiledFile' @ [247:69] ==> val rootLightClassForDecompiledFile: KtLightClassForDecompiledDeclaration defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.getLightClassForDecompiledClassOrObject[LocalVariableDescriptor]

'getClassRelativeName' @ [254:30] ==> private final fun getClassRelativeName(decompiledClassOrObject: KtClassOrObject): FqName defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport[SimpleFunctionDescriptorImpl]

'decompiledClassOrObject' @ [254:51] ==> value-parameter decompiledClassOrObject: KtClassOrObject defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.findCorrespondingLightClass[ValueParameterDescriptorImpl]

'relativeFqName' @ [255:24] ==> val relativeFqName: FqName defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.findCorrespondingLightClass[LocalVariableDescriptor]

'pathSegments' @ [255:39] ==> @NotNull public open fun pathSegments(): (MutableList<(Name..Name?)>..List<(Name..Name?)>) defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'iterator' @ [255:54] ==> public abstract fun iterator(): MutableIterator<(Name..Name?)> defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'iterator' @ [256:20] ==> val iterator: MutableIterator<(Name..Name?)> defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.findCorrespondingLightClass[LocalVariableDescriptor]

'next' @ [256:29] ==> public abstract fun next(): (Name..Name?) defined in kotlin.collections.MutableIterator[DeserializedSimpleFunctionDescriptor]

'assert' @ [257:9] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'rootLightClassForDecompiledFile' @ [257:16] ==> value-parameter rootLightClassForDecompiledFile: KtLightClassForDecompiledDeclaration defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.findCorrespondingLightClass[ValueParameterDescriptorImpl]

'name' @ [257:48] ==> public final val KtLightClassForDecompiledDeclaration.name: String?[MyPropertyDescriptor]

'base' @ [257:56] ==> val base: (Name..Name?) defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.findCorrespondingLightClass[LocalVariableDescriptor]

'asString' @ [257:61] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'+' @ [257:75] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'decompiledClassOrObject' @ [257:103] ==> value-parameter decompiledClassOrObject: KtClassOrObject defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.findCorrespondingLightClass[ValueParameterDescriptorImpl]

'containingKtFile' @ [257:127] ==> public final val KtClassOrObject.containingKtFile: KtFile[MyPropertyDescriptor]

'virtualFile' @ [257:144] ==> public final val KtFile.virtualFile: (VirtualFile..VirtualFile?)[MyPropertyDescriptor]

'canonicalPath' @ [257:156] ==> public final val VirtualFile.canonicalPath: String?[MyPropertyDescriptor]

'base' @ [257:206] ==> val base: (Name..Name?) defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.findCorrespondingLightClass[LocalVariableDescriptor]

'asString' @ [257:211] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'rootLightClassForDecompiledFile' @ [257:240] ==> value-parameter rootLightClassForDecompiledFile: KtLightClassForDecompiledDeclaration defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.findCorrespondingLightClass[ValueParameterDescriptorImpl]

'name' @ [257:272] ==> public final val KtLightClassForDecompiledDeclaration.name: String?[MyPropertyDescriptor]

'rootLightClassForDecompiledFile' @ [258:61] ==> value-parameter rootLightClassForDecompiledFile: KtLightClassForDecompiledDeclaration defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.findCorrespondingLightClass[ValueParameterDescriptorImpl]

'iterator' @ [259:16] ==> val iterator: MutableIterator<(Name..Name?)> defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.findCorrespondingLightClass[LocalVariableDescriptor]

'hasNext' @ [259:25] ==> public abstract fun hasNext(): Boolean defined in kotlin.collections.MutableIterator[DeserializedSimpleFunctionDescriptor]

'iterator' @ [260:24] ==> val iterator: MutableIterator<(Name..Name?)> defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.findCorrespondingLightClass[LocalVariableDescriptor]

'next' @ [260:33] ==> public abstract fun next(): (Name..Name?) defined in kotlin.collections.MutableIterator[DeserializedSimpleFunctionDescriptor]

'current' @ [261:30] ==> var current: KtLightClassForDecompiledDeclaration defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.findCorrespondingLightClass[LocalVariableDescriptor]

'findInnerClassByName' @ [261:38] ==> public open fun findInnerClassByName(name: String, checkBases: Boolean): PsiClass? defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.KtLightClassForDecompiledDeclaration[DeserializedSimpleFunctionDescriptor]

'name' @ [261:59] ==> val name: (Name..Name?) defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.findCorrespondingLightClass[LocalVariableDescriptor]

'asString' @ [261:64] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'sure' @ [261:83] ==> public inline fun <T : Any> PsiClass?.sure(message: () -> String): PsiClass defined in org.jetbrains.kotlin.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> PsiClass

'+' @ [262:17] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'relativeFqName' @ [262:70] ==> val relativeFqName: FqName defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.findCorrespondingLightClass[LocalVariableDescriptor]

'decompiledClassOrObject' @ [262:102] ==> value-parameter decompiledClassOrObject: KtClassOrObject defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.findCorrespondingLightClass[ValueParameterDescriptorImpl]

'fqName' @ [262:126] ==> public final val KtClassOrObject.fqName: FqName?[MyPropertyDescriptor]

'decompiledClassOrObject' @ [262:153] ==> value-parameter decompiledClassOrObject: KtClassOrObject defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.findCorrespondingLightClass[ValueParameterDescriptorImpl]

'containingKtFile' @ [262:177] ==> public final val KtClassOrObject.containingKtFile: KtFile[MyPropertyDescriptor]

'virtualFile' @ [262:194] ==> public final val KtFile.virtualFile: (VirtualFile..VirtualFile?)[MyPropertyDescriptor]

'name' @ [262:206] ==> public final val VirtualFile.name: String[MyPropertyDescriptor]

'current' @ [264:13] ==> var current: KtLightClassForDecompiledDeclaration defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.findCorrespondingLightClass[LocalVariableDescriptor]

'innerClass' @ [264:23] ==> val innerClass: PsiClass defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.findCorrespondingLightClass[LocalVariableDescriptor]

'current' @ [266:16] ==> var current: KtLightClassForDecompiledDeclaration defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.findCorrespondingLightClass[LocalVariableDescriptor]

'decompiledClassOrObject' @ [270:20] ==> value-parameter decompiledClassOrObject: KtClassOrObject defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.getClassRelativeName[ValueParameterDescriptorImpl]

'nameAsName' @ [270:44] ==> public final val KtClassOrObject.nameAsName: Name?[MyPropertyDescriptor]

'getParentOfType' @ [271:34] ==> @Nullable @Contract public open fun <T : (PsiElement..PsiElement?)> getParentOfType(@Nullable p0: PsiElement?, @NotNull p1: Class<(KtClassOrObject..KtClassOrObject?)>, p2: Boolean): KtClassOrObject? defined in com.intellij.psi.util.PsiTreeUtil[JavaMethodDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> KtClassOrObject

'decompiledClassOrObject' @ [271:50] ==> value-parameter decompiledClassOrObject: KtClassOrObject defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.getClassRelativeName[ValueParameterDescriptorImpl]

'java' @ [271:98] ==> public val <T> KClass<KtClassOrObject>.java: Class<KtClassOrObject> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtClassOrObject

'parent' @ [272:13] ==> val parent: KtClassOrObject? defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.getClassRelativeName[LocalVariableDescriptor]

'assert' @ [273:13] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'decompiledClassOrObject' @ [273:20] ==> value-parameter decompiledClassOrObject: KtClassOrObject defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.getClassRelativeName[ValueParameterDescriptorImpl]

'isTopLevel' @ [273:44] ==> public final fun isTopLevel(): Boolean defined in org.jetbrains.kotlin.psi.KtClassOrObject[DeserializedSimpleFunctionDescriptor]

'topLevel' @ [274:27] ==> @NotNull public open fun topLevel(@NotNull p0: Name): FqName defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'name' @ [274:36] ==> val name: Name defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.getClassRelativeName[LocalVariableDescriptor]

'getClassRelativeName' @ [276:16] ==> private final fun getClassRelativeName(decompiledClassOrObject: KtClassOrObject): FqName defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport[SimpleFunctionDescriptorImpl]

'parent' @ [276:37] ==> val parent: KtClassOrObject? defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.getClassRelativeName[LocalVariableDescriptor]

'child' @ [276:45] ==> @NotNull public open fun child(@NotNull p0: Name): FqName defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'name' @ [276:51] ==> val name: Name defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.getClassRelativeName[LocalVariableDescriptor]

'file' @ [280:27] ==> value-parameter file: KtClsFile defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.createLightClassForDecompiledKotlinFile[ValueParameterDescriptorImpl]

'virtualFile' @ [280:32] ==> public final val KtClsFile.virtualFile: (VirtualFile..VirtualFile?)[MyPropertyDescriptor]

'file' @ [282:29] ==> value-parameter file: KtClsFile defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.createLightClassForDecompiledKotlinFile[ValueParameterDescriptorImpl]

'declarations' @ [282:34] ==> public final val KtClsFile.declarations: List<(KtDeclaration..KtDeclaration?)>[MyPropertyDescriptor]

'filterIsInstance' @ [282:47] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<KtClassOrObject> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> KtClassOrObject

'singleOrNull' @ [282:83] ==> public fun <T> List<KtClassOrObject>.singleOrNull(): KtClassOrObject? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtClassOrObject

'createClsJavaClassFromVirtualFile' @ [284:28] ==> private final fun createClsJavaClassFromVirtualFile(mirrorFile: KtFile, classFile: VirtualFile, correspondingClassOrObject: KtClassOrObject?): ClsClassImpl? defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport[SimpleFunctionDescriptorImpl]

'file' @ [285:17] ==> value-parameter file: KtClsFile defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.createLightClassForDecompiledKotlinFile[ValueParameterDescriptorImpl]

'virtualFile' @ [285:23] ==> val virtualFile: VirtualFile defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.createLightClassForDecompiledKotlinFile[LocalVariableDescriptor]

'classOrObject' @ [286:46] ==> val classOrObject: KtClassOrObject? defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.createLightClassForDecompiledKotlinFile[LocalVariableDescriptor]

'KtLightClassForDecompiledDeclaration' @ [289:16] ==> public constructor KtLightClassForDecompiledDeclaration(clsDelegate: ClsClassImpl, kotlinOrigin: KtClassOrObject?, file: KtClsFile) defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.KtLightClassForDecompiledDeclaration[ClassConstructorDescriptorImpl]

'javaClsClass' @ [289:53] ==> val javaClsClass: ClsClassImpl defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.createLightClassForDecompiledKotlinFile[LocalVariableDescriptor]

'classOrObject' @ [289:67] ==> val classOrObject: KtClassOrObject? defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.createLightClassForDecompiledKotlinFile[LocalVariableDescriptor]

'file' @ [289:82] ==> value-parameter file: KtClsFile defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.createLightClassForDecompiledKotlinFile[ValueParameterDescriptorImpl]

'ClsJavaStubByVirtualFileCache' @ [297:28] ==> public companion object defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.ClsJavaStubByVirtualFileCache[FakeCallableDescriptorForObject]

'getInstance' @ [297:58] ==> public final fun getInstance(project: Project): ClsJavaStubByVirtualFileCache defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.ClsJavaStubByVirtualFileCache.Companion[SimpleFunctionDescriptorImpl]

'project' @ [297:70] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport[PropertyDescriptorImpl]

'get' @ [297:79] ==> public final fun get(classFile: VirtualFile): PsiJavaFileStubImpl? defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.ClsJavaStubByVirtualFileCache[SimpleFunctionDescriptorImpl]

'classFile' @ [297:83] ==> value-parameter classFile: VirtualFile defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.createClsJavaClassFromVirtualFile[ValueParameterDescriptorImpl]

'javaFileStub' @ [298:9] ==> val javaFileStub: PsiJavaFileStubImpl defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.createClsJavaClassFromVirtualFile[LocalVariableDescriptor]

'psiFactory' @ [298:22] ==> public final var PsiJavaFileStubImpl.psiFactory: (StubPsiFactory..StubPsiFactory?)[MyPropertyDescriptor]

'INSTANCE' @ [298:60] ==> public final val INSTANCE: (ClsWrapperStubPsiFactory..ClsWrapperStubPsiFactory?) defined in org.jetbrains.kotlin.asJava.builder.ClsWrapperStubPsiFactory[JavaPropertyDescriptor]

'getInstance' @ [299:34] ==> @NotNull public open fun getInstance(@NotNull p0: Project): PsiManager defined in com.intellij.psi.PsiManager[JavaMethodDescriptor]

'mirrorFile' @ [299:46] ==> value-parameter mirrorFile: KtFile defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.createClsJavaClassFromVirtualFile[ValueParameterDescriptorImpl]

'project' @ [299:57] ==> public final val KtFile.project: Project[MyPropertyDescriptor]

'ClsFileImpl' @ [300:33] ==> public constructor ClsFileImpl(@NotNull p0: FileViewProvider) defined in com.intellij.psi.impl.compiled.ClsFileImpl[JavaClassConstructorDescriptor]

'ClassFileViewProvider' @ [300:45] ==> public constructor ClassFileViewProvider(@NotNull p0: PsiManager, @NotNull p1: VirtualFile) defined in com.intellij.psi.ClassFileViewProvider[JavaClassConstructorDescriptor]

'manager' @ [300:67] ==> val manager: PsiManager defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.createClsJavaClassFromVirtualFile[LocalVariableDescriptor]

'classFile' @ [300:76] ==> value-parameter classFile: VirtualFile defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.createClsJavaClassFromVirtualFile[ValueParameterDescriptorImpl]

'correspondingClassOrObject' @ [302:21] ==> value-parameter correspondingClassOrObject: KtClassOrObject? defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.createClsJavaClassFromVirtualFile[ValueParameterDescriptorImpl]

'correspondingClassOrObject' @ [303:28] ==> value-parameter correspondingClassOrObject: KtClassOrObject? defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.createClsJavaClassFromVirtualFile[ValueParameterDescriptorImpl]

'navigationElement' @ [303:55] ==> public final val KtClassOrObject.navigationElement: PsiElement[MyPropertyDescriptor]

'containingFile' @ [303:73] ==> public final val PsiElement.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'super' @ [305:24] ==> <this> defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.createClsJavaClassFromVirtualFile.<no name provided>[LazyClassReceiverParameterDescriptor]

'getNavigationElement' @ [305:30] ==> @NotNull public open fun getNavigationElement(): PsiElement defined in com.intellij.psi.impl.compiled.ClsFileImpl[JavaMethodDescriptor]

'javaFileStub' @ [308:38] ==> val javaFileStub: PsiJavaFileStubImpl defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.createClsJavaClassFromVirtualFile[LocalVariableDescriptor]

'mirrorFile' @ [310:40] ==> value-parameter mirrorFile: KtFile defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.createClsJavaClassFromVirtualFile[ValueParameterDescriptorImpl]

'javaFileStub' @ [314:9] ==> val javaFileStub: PsiJavaFileStubImpl defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.createClsJavaClassFromVirtualFile[LocalVariableDescriptor]

'psi' @ [314:22] ==> public final var PsiJavaFileStubImpl.psi: (PsiJavaFile..PsiJavaFile?)[MyPropertyDescriptor]

'fakeFile' @ [314:28] ==> val fakeFile: <no name provided> defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.createClsJavaClassFromVirtualFile[LocalVariableDescriptor]

'fakeFile' @ [315:16] ==> val fakeFile: <no name provided> defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport.createClsJavaClassFromVirtualFile[LocalVariableDescriptor]

'classes' @ [315:25] ==> public final val <no name provided>.classes: (Array<(PsiClass..PsiClass?)>..Array<out (PsiClass..PsiClass?)>)[MyPropertyDescriptor]

'single' @ [315:33] ==> public fun <T> Array<out (PsiClass..PsiClass?)>.single(): (PsiClass..PsiClass?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiClass..com.intellij.psi.PsiClass?)

'file' @ [321:13] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.caches.resolve.KtFileClassProviderImpl.getFileClasses[ValueParameterDescriptorImpl]

'isCompiled' @ [321:18] ==> public final val KtFile.isCompiled: Boolean[MyPropertyDescriptor]

'arrayOf' @ [322:20] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: PsiClass): Array<PsiClass> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> PsiClass

'arrayListOf' @ [325:22] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<PsiClass> /* = ArrayList<PsiClass> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiClass

'file' @ [326:9] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.caches.resolve.KtFileClassProviderImpl.getFileClasses[ValueParameterDescriptorImpl]

'declarations' @ [326:14] ==> public final val KtFile.declarations: List<(KtDeclaration..KtDeclaration?)>[MyPropertyDescriptor]

'filterIsInstance' @ [326:27] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<KtClassOrObject> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> KtClassOrObject

'map' @ [326:63] ==> public inline fun <T, R> Iterable<KtClassOrObject>.map(transform: (KtClassOrObject) -> KtLightClass?): List<KtLightClass?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtClassOrObject
    <R> -> KtLightClass?

'lightClassGenerationSupport' @ [326:69] ==> public final val lightClassGenerationSupport: LightClassGenerationSupport defined in org.jetbrains.kotlin.idea.caches.resolve.KtFileClassProviderImpl[PropertyDescriptorImpl]

'getLightClass' @ [326:97] ==> public abstract fun getLightClass(classOrObject: KtClassOrObject): KtLightClass? defined in org.jetbrains.kotlin.asJava.LightClassGenerationSupport[DeserializedSimpleFunctionDescriptor]

'it' @ [326:111] ==> value-parameter it: KtClassOrObject defined in org.jetbrains.kotlin.idea.caches.resolve.KtFileClassProviderImpl.getFileClasses.<anonymous>[ValueParameterDescriptorImpl]

'filterNotNullTo' @ [326:117] ==> public fun <C : MutableCollection<in KtLightClass>, T : Any> Iterable<KtLightClass?>.filterNotNullTo(destination: ArrayList<PsiClass> /* = ArrayList<PsiClass> */): ArrayList<PsiClass> /* = ArrayList<PsiClass> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <C : MutableCollection<in T>> -> ArrayList<PsiClass>
    <T : Any> -> KtLightClass

'result' @ [326:133] ==> val result: ArrayList<PsiClass> /* = ArrayList<PsiClass> */ defined in org.jetbrains.kotlin.idea.caches.resolve.KtFileClassProviderImpl.getFileClasses[LocalVariableDescriptor]

'file' @ [328:26] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.caches.resolve.KtFileClassProviderImpl.getFileClasses[ValueParameterDescriptorImpl]

'getModuleInfo' @ [328:31] ==> public fun PsiElement.getModuleInfo(): IdeaModuleInfo defined in org.jetbrains.kotlin.idea.caches.resolve in file getModuleInfo.kt[SimpleFunctionDescriptorImpl]

'JvmFileClassUtil' @ [329:28] ==> public object JvmFileClassUtil defined in org.jetbrains.kotlin.fileClasses[FakeCallableDescriptorForObject]

'getFileClassInfoNoResolve' @ [329:45] ==> @JvmStatic public final fun getFileClassInfoNoResolve(file: KtFile): JvmFileClassInfo defined in org.jetbrains.kotlin.fileClasses.JvmFileClassUtil[DeserializedSimpleFunctionDescriptor]

'file' @ [329:71] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.caches.resolve.KtFileClassProviderImpl.getFileClasses[ValueParameterDescriptorImpl]

'file' @ [330:31] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.caches.resolve.KtFileClassProviderImpl.getFileClasses[ValueParameterDescriptorImpl]

'javaFileFacadeFqName' @ [330:36] ==> public val KtFile.javaFileFacadeFqName: FqName defined in org.jetbrains.kotlin.fileClasses[DeserializedPropertyDescriptor]

'when {
            file.analysisContext != null && PackagePartClassUtils.fileHasTopLevelCallables(file) ->
                listOf(KtLightClassForFacade.createForSyntheticFile(PsiManager.getInstance(file.project), fileClassFqName, file))

            jvmClassInfo.withJvmMultifileClass ->
                lightClassGenerationSupport.getFacadeClasses(fileClassFqName, moduleInfo.contentScope())

            PackagePartClassUtils.fileHasTopLevelCallables(file) ->
                (lightClassGenerationSupport as IDELightClassGenerationSupport).createLightClassForFileFacade(
                        fileClassFqName, listOf(file), moduleInfo)

            else -> emptyList<PsiClass>()
        }' @ [332:29] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Collection<PsiClass>, entry1: Collection<PsiClass>, entry2: Collection<PsiClass>, entry3: Collection<PsiClass>): Collection<PsiClass>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Collection<PsiClass>

'file' @ [333:13] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.caches.resolve.KtFileClassProviderImpl.getFileClasses[ValueParameterDescriptorImpl]

'analysisContext' @ [333:18] ==> public var KtFile.analysisContext: PsiElement? defined in org.jetbrains.kotlin.psi[DeserializedPropertyDescriptor]

'PackagePartClassUtils' @ [333:45] ==> public object PackagePartClassUtils defined in org.jetbrains.kotlin.load.kotlin[FakeCallableDescriptorForObject]

'fileHasTopLevelCallables' @ [333:67] ==> @JvmStatic public final fun fileHasTopLevelCallables(file: KtFile): Boolean defined in org.jetbrains.kotlin.load.kotlin.PackagePartClassUtils[DeserializedSimpleFunctionDescriptor]

'file' @ [333:92] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.caches.resolve.KtFileClassProviderImpl.getFileClasses[ValueParameterDescriptorImpl]

'listOf' @ [334:17] ==> public fun <T> listOf(element: KtLightClassForFacade): List<KtLightClassForFacade> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtLightClassForFacade

'KtLightClassForFacade' @ [334:24] ==> public companion object Factory defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade[FakeCallableDescriptorForObject]

'createForSyntheticFile' @ [334:46] ==> public final fun createForSyntheticFile(manager: PsiManager, facadeClassFqName: FqName, file: KtFile): KtLightClassForFacade defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade.Factory[DeserializedSimpleFunctionDescriptor]

'getInstance' @ [334:80] ==> @NotNull public open fun getInstance(@NotNull p0: Project): PsiManager defined in com.intellij.psi.PsiManager[JavaMethodDescriptor]

'file' @ [334:92] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.caches.resolve.KtFileClassProviderImpl.getFileClasses[ValueParameterDescriptorImpl]

'project' @ [334:97] ==> public final val KtFile.project: Project[MyPropertyDescriptor]

'fileClassFqName' @ [334:107] ==> val fileClassFqName: FqName defined in org.jetbrains.kotlin.idea.caches.resolve.KtFileClassProviderImpl.getFileClasses[LocalVariableDescriptor]

'file' @ [334:124] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.caches.resolve.KtFileClassProviderImpl.getFileClasses[ValueParameterDescriptorImpl]

'jvmClassInfo' @ [336:13] ==> val jvmClassInfo: JvmFileClassInfo defined in org.jetbrains.kotlin.idea.caches.resolve.KtFileClassProviderImpl.getFileClasses[LocalVariableDescriptor]

'withJvmMultifileClass' @ [336:26] ==> public abstract val withJvmMultifileClass: Boolean defined in org.jetbrains.kotlin.fileClasses.JvmFileClassInfo[DeserializedPropertyDescriptor]

'lightClassGenerationSupport' @ [337:17] ==> public final val lightClassGenerationSupport: LightClassGenerationSupport defined in org.jetbrains.kotlin.idea.caches.resolve.KtFileClassProviderImpl[PropertyDescriptorImpl]

'getFacadeClasses' @ [337:45] ==> public abstract fun getFacadeClasses(facadeFqName: FqName, scope: GlobalSearchScope): Collection<PsiClass> defined in org.jetbrains.kotlin.asJava.LightClassGenerationSupport[DeserializedSimpleFunctionDescriptor]

'fileClassFqName' @ [337:62] ==> val fileClassFqName: FqName defined in org.jetbrains.kotlin.idea.caches.resolve.KtFileClassProviderImpl.getFileClasses[LocalVariableDescriptor]

'moduleInfo' @ [337:79] ==> val moduleInfo: IdeaModuleInfo defined in org.jetbrains.kotlin.idea.caches.resolve.KtFileClassProviderImpl.getFileClasses[LocalVariableDescriptor]

'contentScope' @ [337:90] ==> public abstract fun contentScope(): GlobalSearchScope defined in org.jetbrains.kotlin.idea.caches.resolve.IdeaModuleInfo[SimpleFunctionDescriptorImpl]

'PackagePartClassUtils' @ [339:13] ==> public object PackagePartClassUtils defined in org.jetbrains.kotlin.load.kotlin[FakeCallableDescriptorForObject]

'fileHasTopLevelCallables' @ [339:35] ==> @JvmStatic public final fun fileHasTopLevelCallables(file: KtFile): Boolean defined in org.jetbrains.kotlin.load.kotlin.PackagePartClassUtils[DeserializedSimpleFunctionDescriptor]

'file' @ [339:60] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.caches.resolve.KtFileClassProviderImpl.getFileClasses[ValueParameterDescriptorImpl]

'lightClassGenerationSupport' @ [340:18] ==> public final val lightClassGenerationSupport: LightClassGenerationSupport defined in org.jetbrains.kotlin.idea.caches.resolve.KtFileClassProviderImpl[PropertyDescriptorImpl]

'createLightClassForFileFacade' @ [340:81] ==> public final fun createLightClassForFileFacade(facadeFqName: FqName, facadeFiles: List<KtFile>, moduleInfo: IdeaModuleInfo): List<PsiClass> defined in org.jetbrains.kotlin.idea.caches.resolve.IDELightClassGenerationSupport[SimpleFunctionDescriptorImpl]

'fileClassFqName' @ [341:25] ==> val fileClassFqName: FqName defined in org.jetbrains.kotlin.idea.caches.resolve.KtFileClassProviderImpl.getFileClasses[LocalVariableDescriptor]

'listOf' @ [341:42] ==> public fun <T> listOf(element: KtFile): List<KtFile> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFile

'file' @ [341:49] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.caches.resolve.KtFileClassProviderImpl.getFileClasses[ValueParameterDescriptorImpl]

'moduleInfo' @ [341:56] ==> val moduleInfo: IdeaModuleInfo defined in org.jetbrains.kotlin.idea.caches.resolve.KtFileClassProviderImpl.getFileClasses[LocalVariableDescriptor]

'emptyList' @ [343:21] ==> public fun <T> emptyList(): List<PsiClass> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiClass

'facadeClasses' @ [346:9] ==> val facadeClasses: Collection<PsiClass> defined in org.jetbrains.kotlin.idea.caches.resolve.KtFileClassProviderImpl.getFileClasses[LocalVariableDescriptor]

'filterTo' @ [346:23] ==> public inline fun <T, C : MutableCollection<in PsiClass>> Iterable<PsiClass>.filterTo(destination: ArrayList<PsiClass> /* = ArrayList<PsiClass> */, predicate: (PsiClass) -> Boolean): ArrayList<PsiClass> /* = ArrayList<PsiClass> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiClass
    <C : MutableCollection<in T>> -> ArrayList<PsiClass>

'result' @ [346:32] ==> val result: ArrayList<PsiClass> /* = ArrayList<PsiClass> */ defined in org.jetbrains.kotlin.idea.caches.resolve.KtFileClassProviderImpl.getFileClasses[LocalVariableDescriptor]

'it' @ [347:13] ==> value-parameter it: PsiClass defined in org.jetbrains.kotlin.idea.caches.resolve.KtFileClassProviderImpl.getFileClasses.<anonymous>[ValueParameterDescriptorImpl]

'file' @ [347:44] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.caches.resolve.KtFileClassProviderImpl.getFileClasses[ValueParameterDescriptorImpl]

'it' @ [347:52] ==> value-parameter it: PsiClass defined in org.jetbrains.kotlin.idea.caches.resolve.KtFileClassProviderImpl.getFileClasses.<anonymous>[ValueParameterDescriptorImpl]

'files' @ [347:55] ==> public final val files: Collection<KtFile> defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade[DeserializedPropertyDescriptor]

'result' @ [350:16] ==> val result: ArrayList<PsiClass> /* = ArrayList<PsiClass> */ defined in org.jetbrains.kotlin.idea.caches.resolve.KtFileClassProviderImpl.getFileClasses[LocalVariableDescriptor]

'toTypedArray' @ [350:23] ==> public inline fun <reified T> Collection<PsiClass>.toTypedArray(): Array<PsiClass> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> PsiClass

