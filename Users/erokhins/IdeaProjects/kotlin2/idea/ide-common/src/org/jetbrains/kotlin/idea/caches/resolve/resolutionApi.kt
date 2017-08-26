'JvmName' @ [17:1] ==> public constructor JvmName(name: String) defined in kotlin.jvm.JvmName[DeserializedClassConstructorDescriptor]

'KotlinCacheService' @ [38:12] ==> public companion object defined in org.jetbrains.kotlin.caches.resolve.KotlinCacheService[FakeCallableDescriptorForObject]

'getInstance' @ [38:31] ==> public final fun getInstance(project: Project): KotlinCacheService defined in org.jetbrains.kotlin.caches.resolve.KotlinCacheService.Companion[SimpleFunctionDescriptorImpl]

'project' @ [38:43] ==> public final val KtElement.project: Project[MyPropertyDescriptor]

'getResolutionFacade' @ [38:52] ==> public abstract fun getResolutionFacade(elements: List<KtElement>): ResolutionFacade defined in org.jetbrains.kotlin.caches.resolve.KotlinCacheService[SimpleFunctionDescriptorImpl]

'listOf' @ [38:72] ==> public fun <T> listOf(element: KtElement): List<KtElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtElement

'this' @ [38:79] ==> <this> defined in org.jetbrains.kotlin.idea.caches.resolve.getResolutionFacade[ReceiverParameterDescriptorImpl]

'FULL' @ [41:90] ==> enum entry FULL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'getResolutionFacade' @ [42:12] ==> public fun KtElement.getResolutionFacade(): ResolutionFacade defined in org.jetbrains.kotlin.idea.caches.resolve in file resolutionApi.kt[SimpleFunctionDescriptorImpl]

'resolveToDescriptor' @ [42:34] ==> public abstract fun resolveToDescriptor(declaration: KtDeclaration, bodyResolveMode: BodyResolveMode = ...): DeclarationDescriptor defined in org.jetbrains.kotlin.idea.resolve.ResolutionFacade[SimpleFunctionDescriptorImpl]

'this' @ [42:54] ==> <this> defined in org.jetbrains.kotlin.idea.caches.resolve.resolveToDescriptor[ReceiverParameterDescriptorImpl]

'bodyResolveMode' @ [42:60] ==> value-parameter bodyResolveMode: BodyResolveMode = ... defined in org.jetbrains.kotlin.idea.caches.resolve.resolveToDescriptor[ValueParameterDescriptorImpl]

'PARTIAL' @ [46:95] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'analyze' @ [47:12] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve in file resolutionApi.kt[SimpleFunctionDescriptorImpl]

'bodyResolveMode' @ [47:20] ==> value-parameter bodyResolveMode: BodyResolveMode = ... defined in org.jetbrains.kotlin.idea.caches.resolve.resolveToDescriptorIfAny[ValueParameterDescriptorImpl]

'get' @ [47:37] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(p0: (ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>..ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>?), p1: (PsiElement..PsiElement?)): DeclarationDescriptor? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> PsiElement
    <V : (Any..Any?)> -> DeclarationDescriptor

'DECLARATION_TO_DESCRIPTOR' @ [47:56] ==> public final val DECLARATION_TO_DESCRIPTOR: (ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>..ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'this' @ [47:83] ==> <this> defined in org.jetbrains.kotlin.idea.caches.resolve.resolveToDescriptorIfAny[ReceiverParameterDescriptorImpl]

'getResolutionFacade' @ [51:18] ==> public fun KtElement.getResolutionFacade(): ResolutionFacade defined in org.jetbrains.kotlin.idea.caches.resolve in file resolutionApi.kt[SimpleFunctionDescriptorImpl]

'facade' @ [52:12] ==> val facade: ResolutionFacade defined in org.jetbrains.kotlin.idea.caches.resolve.resolveImportReference[LocalVariableDescriptor]

'resolveImportReference' @ [52:19] ==> public fun ResolutionFacade.resolveImportReference(moduleDescriptor: ModuleDescriptor, fqName: FqName): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.caches.resolve[SimpleFunctionDescriptorImpl]

'facade' @ [52:42] ==> val facade: ResolutionFacade defined in org.jetbrains.kotlin.idea.caches.resolve.resolveImportReference[LocalVariableDescriptor]

'moduleDescriptor' @ [52:49] ==> public abstract val moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.idea.resolve.ResolutionFacade[PropertyDescriptorImpl]

'fqName' @ [52:67] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.idea.caches.resolve.resolveImportReference[ValueParameterDescriptorImpl]

'JvmOverloads' @ [63:1] ==> public constructor JvmOverloads() defined in kotlin.jvm.JvmOverloads[DeserializedClassConstructorDescriptor]

'FULL' @ [63:88] ==> enum entry FULL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'getResolutionFacade' @ [64:12] ==> public fun KtElement.getResolutionFacade(): ResolutionFacade defined in org.jetbrains.kotlin.idea.caches.resolve in file resolutionApi.kt[SimpleFunctionDescriptorImpl]

'analyze' @ [64:34] ==> public abstract fun analyze(element: KtElement, bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.resolve.ResolutionFacade[SimpleFunctionDescriptorImpl]

'this' @ [64:42] ==> <this> defined in org.jetbrains.kotlin.idea.caches.resolve.analyze[ReceiverParameterDescriptorImpl]

'bodyResolveMode' @ [64:48] ==> value-parameter bodyResolveMode: BodyResolveMode = ... defined in org.jetbrains.kotlin.idea.caches.resolve.analyze[ValueParameterDescriptorImpl]

'getResolutionFacade' @ [68:28] ==> public fun KtElement.getResolutionFacade(): ResolutionFacade defined in org.jetbrains.kotlin.idea.caches.resolve in file resolutionApi.kt[SimpleFunctionDescriptorImpl]

'AnalysisResult' @ [69:12] ==> public companion object defined in org.jetbrains.kotlin.analyzer.AnalysisResult[FakeCallableDescriptorForObject]

'success' @ [69:27] ==> @JvmStatic public final fun success(bindingContext: BindingContext, module: ModuleDescriptor): AnalysisResult defined in org.jetbrains.kotlin.analyzer.AnalysisResult.Companion[DeserializedSimpleFunctionDescriptor]

'resolutionFacade' @ [69:35] ==> val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.caches.resolve.analyzeAndGetResult[LocalVariableDescriptor]

'analyze' @ [69:52] ==> public abstract fun analyze(element: KtElement, bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.resolve.ResolutionFacade[SimpleFunctionDescriptorImpl]

'this' @ [69:60] ==> <this> defined in org.jetbrains.kotlin.idea.caches.resolve.analyzeAndGetResult[ReceiverParameterDescriptorImpl]

'resolutionFacade' @ [69:67] ==> val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.caches.resolve.analyzeAndGetResult[LocalVariableDescriptor]

'moduleDescriptor' @ [69:84] ==> public abstract val moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.idea.resolve.ResolutionFacade[PropertyDescriptorImpl]

'getResolutionFacade' @ [73:12] ==> public fun KtElement.getResolutionFacade(): ResolutionFacade defined in org.jetbrains.kotlin.idea.caches.resolve in file resolutionApi.kt[SimpleFunctionDescriptorImpl]

'moduleDescriptor' @ [73:34] ==> public abstract val moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.idea.resolve.ResolutionFacade[PropertyDescriptorImpl]

'analyzeFullyAndGetResult' @ [82:12] ==> public fun KtElement.analyzeFullyAndGetResult(vararg extraFiles: KtFile): AnalysisResult defined in org.jetbrains.kotlin.idea.caches.resolve[SimpleFunctionDescriptorImpl]

'bindingContext' @ [82:39] ==> public final val bindingContext: BindingContext defined in org.jetbrains.kotlin.analyzer.AnalysisResult[DeserializedPropertyDescriptor]

'KotlinCacheService' @ [86:12] ==> public companion object defined in org.jetbrains.kotlin.caches.resolve.KotlinCacheService[FakeCallableDescriptorForObject]

'getInstance' @ [86:31] ==> public final fun getInstance(project: Project): KotlinCacheService defined in org.jetbrains.kotlin.caches.resolve.KotlinCacheService.Companion[SimpleFunctionDescriptorImpl]

'project' @ [86:43] ==> public final val KtElement.project: Project[MyPropertyDescriptor]

'getResolutionFacade' @ [86:52] ==> public abstract fun getResolutionFacade(elements: List<KtElement>): ResolutionFacade defined in org.jetbrains.kotlin.caches.resolve.KotlinCacheService[SimpleFunctionDescriptorImpl]

'listOf' @ [86:72] ==> public fun <T> listOf(element: KtElement): List<KtElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtElement

'this' @ [86:79] ==> <this> defined in org.jetbrains.kotlin.idea.caches.resolve.analyzeFullyAndGetResult[ReceiverParameterDescriptorImpl]

'extraFiles' @ [86:87] ==> value-parameter vararg extraFiles: KtFile defined in org.jetbrains.kotlin.idea.caches.resolve.analyzeFullyAndGetResult[ValueParameterDescriptorImpl]

'toList' @ [86:98] ==> public fun <T> Array<out KtFile>.toList(): List<KtFile> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFile

'analyzeFullyAndGetResult' @ [86:108] ==> public abstract fun analyzeFullyAndGetResult(elements: Collection<KtElement>): AnalysisResult defined in org.jetbrains.kotlin.idea.resolve.ResolutionFacade[SimpleFunctionDescriptorImpl]

'listOf' @ [86:133] ==> public fun <T> listOf(element: KtElement): List<KtElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtElement

'this' @ [86:140] ==> <this> defined in org.jetbrains.kotlin.idea.caches.resolve.analyzeFullyAndGetResult[ReceiverParameterDescriptorImpl]

'KtPsiFactory' @ [94:27] ==> @JvmOverloads public constructor KtPsiFactory(project: Project, markGenerated: Boolean = ...) defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedClassConstructorDescriptor]

'project' @ [94:40] ==> public abstract val project: Project defined in org.jetbrains.kotlin.idea.resolve.ResolutionFacade[PropertyDescriptorImpl]

'createImportDirective' @ [94:49] ==> public final fun createImportDirective(importPath: ImportPath): KtImportDirective defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'ImportPath' @ [94:71] ==> @JvmOverloads public constructor ImportPath(fqName: FqName, isAllUnder: Boolean, alias: Name? = ...) defined in org.jetbrains.kotlin.resolve.ImportPath[DeserializedClassConstructorDescriptor]

'fqName' @ [94:82] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.idea.caches.resolve.resolveImportReference[ValueParameterDescriptorImpl]

'this' @ [95:39] ==> <this> defined in org.jetbrains.kotlin.idea.caches.resolve.resolveImportReference[ReceiverParameterDescriptorImpl]

'getFrontendService' @ [95:44] ==> public abstract fun <T : Any> getFrontendService(moduleDescriptor: ModuleDescriptor, serviceClass: Class<QualifiedExpressionResolver>): QualifiedExpressionResolver defined in org.jetbrains.kotlin.idea.resolve.ResolutionFacade[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> QualifiedExpressionResolver

'moduleDescriptor' @ [95:63] ==> value-parameter moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.idea.caches.resolve.resolveImportReference[ValueParameterDescriptorImpl]

'QualifiedExpressionResolver' @ [95:81] ==> public constructor QualifiedExpressionResolver() defined in org.jetbrains.kotlin.resolve.QualifiedExpressionResolver[DeserializedClassConstructorDescriptor]

'java' @ [95:116] ==> public val <T> KClass<QualifiedExpressionResolver>.java: Class<QualifiedExpressionResolver> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> QualifiedExpressionResolver

'qualifiedExpressionResolver' @ [96:12] ==> val qualifiedExpressionResolver: QualifiedExpressionResolver defined in org.jetbrains.kotlin.idea.caches.resolve.resolveImportReference[LocalVariableDescriptor]

'processImportReference' @ [96:40] ==> public final fun processImportReference(importDirective: KtImportDirective, moduleDescriptor: ModuleDescriptor, trace: BindingTrace, excludedImportNames: Collection<FqName>, packageFragmentForVisibilityCheck: PackageFragmentDescriptor?): ImportingScope? defined in org.jetbrains.kotlin.resolve.QualifiedExpressionResolver[DeserializedSimpleFunctionDescriptor]

'importDirective' @ [97:13] ==> val importDirective: KtImportDirective defined in org.jetbrains.kotlin.idea.caches.resolve.resolveImportReference[LocalVariableDescriptor]

'moduleDescriptor' @ [97:30] ==> value-parameter moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.idea.caches.resolve.resolveImportReference[ValueParameterDescriptorImpl]

'BindingTraceContext' @ [97:48] ==> public constructor BindingTraceContext() defined in org.jetbrains.kotlin.resolve.BindingTraceContext[JavaClassConstructorDescriptor]

'emptyList' @ [97:93] ==> public fun <T> emptyList(): List<FqName> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FqName

'getContributedDescriptors' @ [97:149] ==> public open fun getContributedDescriptors(kindFilter: DescriptorKindFilter, nameFilter: (Name) -> Boolean): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.ImportingScope[DeserializedSimpleFunctionDescriptor]

'emptyList' @ [97:180] ==> public fun <T> emptyList(): List<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

