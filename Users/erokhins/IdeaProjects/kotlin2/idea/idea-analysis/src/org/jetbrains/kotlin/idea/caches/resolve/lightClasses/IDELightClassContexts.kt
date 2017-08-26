'LightClassConstructionContext' @ [77:7] ==> public constructor LightClassConstructionContext(bindingContext: BindingContext, module: ModuleDescriptor) defined in org.jetbrains.kotlin.asJava.builder.LightClassConstructionContext[DeserializedClassConstructorDescriptor]

'bindingContext' @ [77:37] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassConstructionContext.<init>[ValueParameterDescriptorImpl]

'module' @ [77:53] ==> value-parameter module: ModuleDescriptor defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassConstructionContext.<init>[ValueParameterDescriptorImpl]

'this' @ [83:34] ==> <this> defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassConstructionContext[LazyClassReceiverParameterDescriptor]

'javaClass' @ [83:39] ==> public val <T : Any> IDELightClassConstructionContext.javaClass: Class<IDELightClassConstructionContext> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> IDELightClassConstructionContext

'simpleName' @ [83:49] ==> public final val <T : (Any..Any?)> Class<IDELightClassConstructionContext>.simpleName: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> IDELightClassConstructionContext

'mode' @ [83:62] ==> public final val mode: IDELightClassConstructionContext.Mode defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassConstructionContext[PropertyDescriptorImpl]

'getInstance' @ [88:30] ==> @NotNull public open fun getInstance(@NotNull p0: raw (Class<(Any..Any?)>..Class<*>)): Logger defined in com.intellij.openapi.diagnostic.Logger[JavaMethodDescriptor]

'this' @ [88:42] ==> <this> defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts[LazyClassReceiverParameterDescriptor]

'java' @ [88:54] ==> public val <T> KClass<out IDELightClassContexts>.java: Class<out IDELightClassContexts> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Captured(out IDELightClassContexts)

'classOrObject' @ [91:32] ==> value-parameter classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.contextForNonLocalClassOrObject[ValueParameterDescriptorImpl]

'getResolutionFacade' @ [91:46] ==> public fun KtElement.getResolutionFacade(): ResolutionFacade defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'if (classOrObject is KtClass && classOrObject.isAnnotation()) {
            // need to make sure default values for parameters are resolved
            // because java resolve depends on whether there is a default value for an annotation attribute
            resolutionFacade.getFrontendService(ResolveElementCache::class.java)
                    .resolvePrimaryConstructorParametersDefaultValues(classOrObject)
        }
        else {
            resolutionFacade.analyze(classOrObject)
        }' @ [92:30] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: BindingContext, elseBranch: BindingContext): BindingContext[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> BindingContext

'classOrObject' @ [92:34] ==> value-parameter classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.contextForNonLocalClassOrObject[ValueParameterDescriptorImpl]

'classOrObject' @ [92:62] ==> value-parameter classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.contextForNonLocalClassOrObject[ValueParameterDescriptorImpl]

'isAnnotation' @ [92:76] ==> public final fun isAnnotation(): Boolean defined in org.jetbrains.kotlin.psi.KtClassOrObject[DeserializedSimpleFunctionDescriptor]

'resolutionFacade' @ [95:13] ==> val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.contextForNonLocalClassOrObject[LocalVariableDescriptor]

'getFrontendService' @ [95:30] ==> public abstract fun <T : Any> getFrontendService(serviceClass: Class<ResolveElementCache>): ResolveElementCache defined in org.jetbrains.kotlin.idea.resolve.ResolutionFacade[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> ResolveElementCache

'ResolveElementCache' @ [95:49] ==> public constructor ResolveElementCache(resolveSession: ResolveSession, project: Project, targetPlatform: TargetPlatform, codeFragmentAnalyzer: CodeFragmentAnalyzer) defined in org.jetbrains.kotlin.idea.project.ResolveElementCache[ClassConstructorDescriptorImpl]

'java' @ [95:76] ==> public val <T> KClass<ResolveElementCache>.java: Class<ResolveElementCache> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> ResolveElementCache

'resolvePrimaryConstructorParametersDefaultValues' @ [96:22] ==> public final fun resolvePrimaryConstructorParametersDefaultValues(ktClass: KtClass): BindingContext defined in org.jetbrains.kotlin.idea.project.ResolveElementCache[SimpleFunctionDescriptorImpl]

'classOrObject' @ [96:71] ==> value-parameter classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.contextForNonLocalClassOrObject[ValueParameterDescriptorImpl]

'resolutionFacade' @ [99:13] ==> val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.contextForNonLocalClassOrObject[LocalVariableDescriptor]

'analyze' @ [99:30] ==> public abstract fun analyze(element: KtElement, bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.resolve.ResolutionFacade[DeserializedSimpleFunctionDescriptor]

'classOrObject' @ [99:38] ==> value-parameter classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.contextForNonLocalClassOrObject[ValueParameterDescriptorImpl]

'bindingContext' @ [101:31] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.contextForNonLocalClassOrObject[LocalVariableDescriptor]

'get' @ [101:46] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(p0: (ReadOnlySlice<(PsiElement..PsiElement?), (ClassDescriptor..ClassDescriptor?)>..ReadOnlySlice<(PsiElement..PsiElement?), (ClassDescriptor..ClassDescriptor?)>?), p1: (PsiElement..PsiElement?)): ClassDescriptor? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)
    <V : (Any..Any?)> -> (org.jetbrains.kotlin.descriptors.ClassDescriptor..org.jetbrains.kotlin.descriptors.ClassDescriptor?)

'CLASS' @ [101:65] ==> public final val CLASS: (WritableSlice<(PsiElement..PsiElement?), (ClassDescriptor..ClassDescriptor?)>..WritableSlice<(PsiElement..PsiElement?), (ClassDescriptor..ClassDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'classOrObject' @ [101:72] ==> value-parameter classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.contextForNonLocalClassOrObject[ValueParameterDescriptorImpl]

'sure' @ [101:87] ==> public inline fun <T : Any> ClassDescriptor?.sure(message: () -> String): ClassDescriptor defined in org.jetbrains.kotlin.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> ClassDescriptor

'classOrObject' @ [102:51] ==> value-parameter classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.contextForNonLocalClassOrObject[ValueParameterDescriptorImpl]

'getElementTextWithContext' @ [102:65] ==> public fun PsiElement.getElementTextWithContext(): String defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'forceResolveAllContents' @ [104:26] ==> public open fun <T : (Any..Any?)> forceResolveAllContents(@NotNull p0: ClassDescriptor): (ClassDescriptor..ClassDescriptor?) defined in org.jetbrains.kotlin.resolve.lazy.ForceResolveUtil[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> ClassDescriptor

'classDescriptor' @ [104:50] ==> val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.contextForNonLocalClassOrObject[LocalVariableDescriptor]

'IDELightClassConstructionContext' @ [105:16] ==> public constructor IDELightClassConstructionContext(bindingContext: BindingContext, module: ModuleDescriptor, mode: IDELightClassConstructionContext.Mode) defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassConstructionContext[ClassConstructorDescriptorImpl]

'bindingContext' @ [105:49] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.contextForNonLocalClassOrObject[LocalVariableDescriptor]

'resolutionFacade' @ [105:65] ==> val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.contextForNonLocalClassOrObject[LocalVariableDescriptor]

'moduleDescriptor' @ [105:82] ==> public abstract val moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.idea.resolve.ResolutionFacade[DeserializedPropertyDescriptor]

'EXACT' @ [105:100] ==> enum entry EXACT defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassConstructionContext.Mode[FakeCallableDescriptorForObject]

'classOrObject' @ [109:32] ==> value-parameter classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.contextForLocalClassOrObject[ValueParameterDescriptorImpl]

'getResolutionFacade' @ [109:46] ==> public fun KtElement.getResolutionFacade(): ResolutionFacade defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'resolutionFacade' @ [110:30] ==> val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.contextForLocalClassOrObject[LocalVariableDescriptor]

'analyze' @ [110:47] ==> public abstract fun analyze(element: KtElement, bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.resolve.ResolutionFacade[DeserializedSimpleFunctionDescriptor]

'classOrObject' @ [110:55] ==> value-parameter classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.contextForLocalClassOrObject[ValueParameterDescriptorImpl]

'bindingContext' @ [112:26] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.contextForLocalClassOrObject[LocalVariableDescriptor]

'get' @ [112:41] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(p0: (ReadOnlySlice<(PsiElement..PsiElement?), (ClassDescriptor..ClassDescriptor?)>..ReadOnlySlice<(PsiElement..PsiElement?), (ClassDescriptor..ClassDescriptor?)>?), p1: (PsiElement..PsiElement?)): ClassDescriptor? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)
    <V : (Any..Any?)> -> (org.jetbrains.kotlin.descriptors.ClassDescriptor..org.jetbrains.kotlin.descriptors.ClassDescriptor?)

'CLASS' @ [112:60] ==> public final val CLASS: (WritableSlice<(PsiElement..PsiElement?), (ClassDescriptor..ClassDescriptor?)>..WritableSlice<(PsiElement..PsiElement?), (ClassDescriptor..ClassDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'classOrObject' @ [112:67] ==> value-parameter classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.contextForLocalClassOrObject[ValueParameterDescriptorImpl]

'descriptor' @ [114:13] ==> val descriptor: ClassDescriptor? defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.contextForLocalClassOrObject[LocalVariableDescriptor]

'LOG' @ [115:13] ==> private final val LOG: Logger defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts[PropertyDescriptorImpl]

'warn' @ [115:17] ==> public open fun warn(@NonNls p0: (String..String?)): Unit defined in com.intellij.openapi.diagnostic.Logger[JavaMethodDescriptor]

'+' @ [115:22] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'classOrObject' @ [115:69] ==> value-parameter classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.contextForLocalClassOrObject[ValueParameterDescriptorImpl]

'getElementTextWithContext' @ [115:83] ==> public fun PsiElement.getElementTextWithContext(): String defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'IDELightClassConstructionContext' @ [116:20] ==> public constructor IDELightClassConstructionContext(bindingContext: BindingContext, module: ModuleDescriptor, mode: IDELightClassConstructionContext.Mode) defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassConstructionContext[ClassConstructorDescriptorImpl]

'bindingContext' @ [116:53] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.contextForLocalClassOrObject[LocalVariableDescriptor]

'resolutionFacade' @ [116:69] ==> val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.contextForLocalClassOrObject[LocalVariableDescriptor]

'moduleDescriptor' @ [116:86] ==> public abstract val moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.idea.resolve.ResolutionFacade[DeserializedPropertyDescriptor]

'EXACT' @ [116:104] ==> enum entry EXACT defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassConstructionContext.Mode[FakeCallableDescriptorForObject]

'forceResolveAllContents' @ [119:26] ==> public open fun <T : (Any..Any?)> forceResolveAllContents(@NotNull p0: ClassDescriptor): (ClassDescriptor..ClassDescriptor?) defined in org.jetbrains.kotlin.resolve.lazy.ForceResolveUtil[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> ClassDescriptor

'descriptor' @ [119:50] ==> val descriptor: ClassDescriptor? defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.contextForLocalClassOrObject[LocalVariableDescriptor]

'IDELightClassConstructionContext' @ [121:16] ==> public constructor IDELightClassConstructionContext(bindingContext: BindingContext, module: ModuleDescriptor, mode: IDELightClassConstructionContext.Mode) defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassConstructionContext[ClassConstructorDescriptorImpl]

'bindingContext' @ [121:49] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.contextForLocalClassOrObject[LocalVariableDescriptor]

'resolutionFacade' @ [121:65] ==> val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.contextForLocalClassOrObject[LocalVariableDescriptor]

'moduleDescriptor' @ [121:82] ==> public abstract val moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.idea.resolve.ResolutionFacade[DeserializedPropertyDescriptor]

'EXACT' @ [121:100] ==> enum entry EXACT defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassConstructionContext.Mode[FakeCallableDescriptorForObject]

'files' @ [126:30] ==> value-parameter files: List<KtFile> defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.contextForFacade[ValueParameterDescriptorImpl]

'first' @ [126:36] ==> public fun <T> List<KtFile>.first(): KtFile defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFile

'getResolutionFacade' @ [126:44] ==> public fun KtElement.getResolutionFacade(): ResolutionFacade defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'getFrontendService' @ [126:66] ==> public abstract fun <T : Any> getFrontendService(serviceClass: Class<ResolveSession>): ResolveSession defined in org.jetbrains.kotlin.idea.resolve.ResolutionFacade[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> ResolveSession

'ResolveSession' @ [126:85] ==> @Deprecated public constructor ResolveSession(@NotNull p0: Project, @NotNull p1: GlobalContext, @NotNull p2: ModuleDescriptor, @NotNull p3: DeclarationProviderFactory, @NotNull p4: BindingTrace) defined in org.jetbrains.kotlin.resolve.lazy.ResolveSession[JavaClassConstructorDescriptor]

'java' @ [126:107] ==> public val <T> KClass<ResolveSession>.java: Class<ResolveSession> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> ResolveSession

'forceResolvePackageDeclarations' @ [128:9] ==> public final fun forceResolvePackageDeclarations(files: Collection<KtFile>, session: ResolveSession): Unit defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts[SimpleFunctionDescriptorImpl]

'files' @ [128:41] ==> value-parameter files: List<KtFile> defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.contextForFacade[ValueParameterDescriptorImpl]

'resolveSession' @ [128:48] ==> val resolveSession: ResolveSession defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.contextForFacade[LocalVariableDescriptor]

'IDELightClassConstructionContext' @ [129:16] ==> public constructor IDELightClassConstructionContext(bindingContext: BindingContext, module: ModuleDescriptor, mode: IDELightClassConstructionContext.Mode) defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassConstructionContext[ClassConstructorDescriptorImpl]

'resolveSession' @ [129:49] ==> val resolveSession: ResolveSession defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.contextForFacade[LocalVariableDescriptor]

'bindingContext' @ [129:64] ==> public final val ResolveSession.bindingContext: BindingContext[MyPropertyDescriptor]

'resolveSession' @ [129:80] ==> val resolveSession: ResolveSession defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.contextForFacade[LocalVariableDescriptor]

'moduleDescriptor' @ [129:95] ==> public open val moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.resolve.lazy.ResolveSession[JavaPropertyDescriptor]

'EXACT' @ [129:113] ==> enum entry EXACT defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassConstructionContext.Mode[FakeCallableDescriptorForObject]

'!' @ [133:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isDummyResolveApplicable' @ [133:14] ==> private final fun isDummyResolveApplicable(classOrObject: KtClassOrObject): Boolean defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts[SimpleFunctionDescriptorImpl]

'classOrObject' @ [133:39] ==> value-parameter classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.lightContextForClassOrObject[ValueParameterDescriptorImpl]

'setupAdHocResolve' @ [135:30] ==> private final fun setupAdHocResolve(project: Project, realWorldModule: ModuleDescriptor, files: List<KtFile>): ResolveSession defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts[SimpleFunctionDescriptorImpl]

'classOrObject' @ [135:48] ==> value-parameter classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.lightContextForClassOrObject[ValueParameterDescriptorImpl]

'project' @ [135:62] ==> public final val KtClassOrObject.project: Project[MyPropertyDescriptor]

'classOrObject' @ [135:71] ==> value-parameter classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.lightContextForClassOrObject[ValueParameterDescriptorImpl]

'getResolutionFacade' @ [135:85] ==> public fun KtElement.getResolutionFacade(): ResolutionFacade defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'moduleDescriptor' @ [135:107] ==> public abstract val moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.idea.resolve.ResolutionFacade[DeserializedPropertyDescriptor]

'listOf' @ [135:125] ==> public fun <T> listOf(element: KtFile): List<KtFile> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFile

'classOrObject' @ [135:132] ==> value-parameter classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.lightContextForClassOrObject[ValueParameterDescriptorImpl]

'containingKtFile' @ [135:146] ==> public final val KtClassOrObject.containingKtFile: KtFile[MyPropertyDescriptor]

'forceResolveAllContents' @ [137:26] ==> public open fun <T : (Any..Any?)> forceResolveAllContents(@NotNull p0: DeclarationDescriptor): (DeclarationDescriptor..DeclarationDescriptor?) defined in org.jetbrains.kotlin.resolve.lazy.ForceResolveUtil[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> DeclarationDescriptor

'resolveSession' @ [137:50] ==> val resolveSession: ResolveSession defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.lightContextForClassOrObject[LocalVariableDescriptor]

'resolveToDescriptor' @ [137:65] ==> @NotNull public open fun resolveToDescriptor(@NotNull p0: KtDeclaration): DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.lazy.ResolveSession[JavaMethodDescriptor]

'classOrObject' @ [137:85] ==> value-parameter classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.lightContextForClassOrObject[ValueParameterDescriptorImpl]

'IDELightClassConstructionContext' @ [139:16] ==> public constructor IDELightClassConstructionContext(bindingContext: BindingContext, module: ModuleDescriptor, mode: IDELightClassConstructionContext.Mode) defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassConstructionContext[ClassConstructorDescriptorImpl]

'resolveSession' @ [139:49] ==> val resolveSession: ResolveSession defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.lightContextForClassOrObject[LocalVariableDescriptor]

'bindingContext' @ [139:64] ==> public final val ResolveSession.bindingContext: BindingContext[MyPropertyDescriptor]

'resolveSession' @ [139:80] ==> val resolveSession: ResolveSession defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.lightContextForClassOrObject[LocalVariableDescriptor]

'moduleDescriptor' @ [139:95] ==> public open val moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.resolve.lazy.ResolveSession[JavaPropertyDescriptor]

'LIGHT' @ [139:113] ==> enum entry LIGHT defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassConstructionContext.Mode[FakeCallableDescriptorForObject]

'classOrObject' @ [143:13] ==> value-parameter classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.isDummyResolveApplicable[ValueParameterDescriptorImpl]

'hasLightClassMatchingErrors' @ [143:27] ==> public var KtClassOrObject.hasLightClassMatchingErrors: Boolean defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses in file LazyLightClassDataHolder.kt[PropertyDescriptorImpl]

'hasDelegatedSupertypes' @ [145:13] ==> private final fun hasDelegatedSupertypes(classOrObject: KtClassOrObject): Boolean defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts[SimpleFunctionDescriptorImpl]

'classOrObject' @ [145:36] ==> value-parameter classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.isDummyResolveApplicable[ValueParameterDescriptorImpl]

'isDataClassWithGeneratedMembersOverridden' @ [147:13] ==> private final fun isDataClassWithGeneratedMembersOverridden(classOrObject: KtClassOrObject): Boolean defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts[SimpleFunctionDescriptorImpl]

'classOrObject' @ [147:55] ==> value-parameter classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.isDummyResolveApplicable[ValueParameterDescriptorImpl]

'hasMembersOverridingInternalMembers' @ [149:13] ==> private final fun hasMembersOverridingInternalMembers(classOrObject: KtClassOrObject): Boolean defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts[SimpleFunctionDescriptorImpl]

'classOrObject' @ [149:49] ==> value-parameter classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.isDummyResolveApplicable[ValueParameterDescriptorImpl]

'classOrObject' @ [151:16] ==> value-parameter classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.isDummyResolveApplicable[ValueParameterDescriptorImpl]

'declarations' @ [151:30] ==> public final val KtClassOrObject.declarations: List<KtDeclaration>[MyPropertyDescriptor]

'filterIsInstance' @ [151:43] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<KtClassOrObject> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> KtClassOrObject

'all' @ [151:79] ==> public inline fun <T> Iterable<KtClassOrObject>.all(predicate: (KtClassOrObject) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtClassOrObject

'isDummyResolveApplicable' @ [151:85] ==> private final fun isDummyResolveApplicable(classOrObject: KtClassOrObject): Boolean defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts[SimpleFunctionDescriptorImpl]

'it' @ [151:110] ==> value-parameter it: KtClassOrObject defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.isDummyResolveApplicable.<anonymous>[ValueParameterDescriptorImpl]

'classOrObject' @ [154:74] ==> value-parameter classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.hasDelegatedSupertypes[ValueParameterDescriptorImpl]

'superTypeListEntries' @ [154:88] ==> public final val KtClassOrObject.superTypeListEntries: List<KtSuperTypeListEntry>[MyPropertyDescriptor]

'any' @ [154:109] ==> public inline fun <T> Iterable<KtSuperTypeListEntry>.any(predicate: (KtSuperTypeListEntry) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtSuperTypeListEntry

'it' @ [154:115] ==> value-parameter it: KtSuperTypeListEntry defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.hasDelegatedSupertypes.<anonymous>[ValueParameterDescriptorImpl]

'classOrObject' @ [157:16] ==> value-parameter classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.isDataClassWithGeneratedMembersOverridden[ValueParameterDescriptorImpl]

'hasModifier' @ [157:30] ==> public open fun hasModifier(@NotNull p0: KtModifierKeywordToken): Boolean defined in org.jetbrains.kotlin.psi.KtClassOrObject[JavaMethodDescriptor]

'DATA_KEYWORD' @ [157:51] ==> public final val DATA_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'classOrObject' @ [158:16] ==> value-parameter classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.isDataClassWithGeneratedMembersOverridden[ValueParameterDescriptorImpl]

'declarations' @ [158:30] ==> public final val KtClassOrObject.declarations: List<KtDeclaration>[MyPropertyDescriptor]

'filterIsInstance' @ [158:43] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<KtFunction> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> KtFunction

'any' @ [158:74] ==> public inline fun <T> Iterable<KtFunction>.any(predicate: (KtFunction) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFunction

'isGeneratedForDataClass' @ [159:20] ==> private final fun isGeneratedForDataClass(name: Name): Boolean defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts[SimpleFunctionDescriptorImpl]

'it' @ [159:44] ==> value-parameter it: KtFunction defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.isDataClassWithGeneratedMembersOverridden.<anonymous>[ValueParameterDescriptorImpl]

'nameAsSafeName' @ [159:47] ==> public final val KtFunction.nameAsSafeName: Name[MyPropertyDescriptor]

'name' @ [164:16] ==> value-parameter name: Name defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.isGeneratedForDataClass[ValueParameterDescriptorImpl]

'EQUALS_METHOD_NAME' @ [164:52] ==> public final val EQUALS_METHOD_NAME: Name defined in org.jetbrains.kotlin.resolve.DataClassDescriptorResolver[DeserializedPropertyDescriptor]

'name' @ [166:16] ==> value-parameter name: Name defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.isGeneratedForDataClass[ValueParameterDescriptorImpl]

'COPY_METHOD_NAME' @ [166:52] ==> public final val COPY_METHOD_NAME: Name defined in org.jetbrains.kotlin.resolve.DataClassDescriptorResolver[DeserializedPropertyDescriptor]

'name' @ [167:16] ==> value-parameter name: Name defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.isGeneratedForDataClass[ValueParameterDescriptorImpl]

'HASH_CODE_METHOD_NAME' @ [167:52] ==> public final val HASH_CODE_METHOD_NAME: Name defined in org.jetbrains.kotlin.resolve.DataClassDescriptorResolver[DeserializedPropertyDescriptor]

'name' @ [168:16] ==> value-parameter name: Name defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.isGeneratedForDataClass[ValueParameterDescriptorImpl]

'TO_STRING_METHOD_NAME' @ [168:52] ==> public final val TO_STRING_METHOD_NAME: Name defined in org.jetbrains.kotlin.resolve.DataClassDescriptorResolver[DeserializedPropertyDescriptor]

'DataClassDescriptorResolver' @ [169:16] ==> public object DataClassDescriptorResolver defined in org.jetbrains.kotlin.resolve[FakeCallableDescriptorForObject]

'isComponentLike' @ [169:44] ==> public final fun isComponentLike(name: Name): Boolean defined in org.jetbrains.kotlin.resolve.DataClassDescriptorResolver[DeserializedSimpleFunctionDescriptor]

'name' @ [169:60] ==> value-parameter name: Name defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.isGeneratedForDataClass[ValueParameterDescriptorImpl]

'classOrObject' @ [173:16] ==> value-parameter classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.hasMembersOverridingInternalMembers[ValueParameterDescriptorImpl]

'declarations' @ [173:30] ==> public final val KtClassOrObject.declarations: List<KtDeclaration>[MyPropertyDescriptor]

'filterIsInstance' @ [173:43] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<KtCallableDeclaration> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> KtCallableDeclaration

'any' @ [173:85] ==> public inline fun <T> Iterable<KtCallableDeclaration>.any(predicate: (KtCallableDeclaration) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtCallableDeclaration

'possiblyOverridesInternalMember' @ [174:13] ==> private final fun possiblyOverridesInternalMember(declaration: KtCallableDeclaration): Boolean defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts[SimpleFunctionDescriptorImpl]

'it' @ [174:45] ==> value-parameter it: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.hasMembersOverridingInternalMembers.<anonymous>[ValueParameterDescriptorImpl]

'!' @ [179:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'declaration' @ [179:14] ==> value-parameter declaration: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.possiblyOverridesInternalMember[ValueParameterDescriptorImpl]

'hasModifier' @ [179:26] ==> public abstract fun hasModifier(@NotNull p0: KtModifierKeywordToken): Boolean defined in org.jetbrains.kotlin.psi.KtCallableDeclaration[JavaMethodDescriptor]

'OVERRIDE_KEYWORD' @ [179:47] ==> public final val OVERRIDE_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'declaration' @ [181:16] ==> value-parameter declaration: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.possiblyOverridesInternalMember[ValueParameterDescriptorImpl]

'name' @ [181:28] ==> public final val KtCallableDeclaration.name: String?[MyPropertyDescriptor]

'let' @ [181:34] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> Boolean

'anyInternalMembersWithThisName' @ [181:40] ==> private final fun anyInternalMembersWithThisName(name: String, project: Project): Boolean defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts[SimpleFunctionDescriptorImpl]

'it' @ [181:71] ==> value-parameter it: String defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.possiblyOverridesInternalMember.<anonymous>[ValueParameterDescriptorImpl]

'declaration' @ [181:75] ==> value-parameter declaration: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.possiblyOverridesInternalMember[ValueParameterDescriptorImpl]

'project' @ [181:87] ==> public final val KtCallableDeclaration.project: Project[MyPropertyDescriptor]

'getInstance' @ [186:19] ==> public open fun getInstance(): (StubIndex..StubIndex?) defined in com.intellij.psi.stubs.StubIndex[JavaMethodDescriptor]

'processElements' @ [186:33] ==> public final fun <Key : (Any..Any?), Psi : (PsiElement..PsiElement?)> processElements(@NotNull p0: StubIndexKey<(String..String?), (KtCallableDeclaration..KtCallableDeclaration?)>, @NotNull p1: String, @NotNull p2: Project, @Nullable p3: GlobalSearchScope?, p4: (Class<(KtCallableDeclaration..KtCallableDeclaration?)>..Class<(KtCallableDeclaration..KtCallableDeclaration?)>?), @NotNull p5: ((KtCallableDeclaration..KtCallableDeclaration?)) -> Boolean): Boolean defined in com.intellij.psi.stubs.StubIndex[MyFunctionDescriptor]
Inferred types:
    <Key : (Any..Any?)> -> (kotlin.String..kotlin.String?)
    <Psi : (PsiElement..PsiElement?)> -> (org.jetbrains.kotlin.psi.KtCallableDeclaration..org.jetbrains.kotlin.psi.KtCallableDeclaration?)

'Instance' @ [187:64] ==> @JvmField public final val Instance: KotlinOverridableInternalMembersShortNameIndex defined in org.jetbrains.kotlin.idea.stubindex.KotlinOverridableInternalMembersShortNameIndex.Companion[PropertyDescriptorImpl]

'key' @ [187:73] ==> public final val KotlinOverridableInternalMembersShortNameIndex.key: StubIndexKey<(String..String?), (KtCallableDeclaration..KtCallableDeclaration?)>[MyPropertyDescriptor]

'name' @ [187:78] ==> value-parameter name: String defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.anyInternalMembersWithThisName[ValueParameterDescriptorImpl]

'project' @ [187:84] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.anyInternalMembersWithThisName[ValueParameterDescriptorImpl]

'EverythingGlobalScope' @ [188:17] ==> public constructor EverythingGlobalScope(p0: (Project..Project?)) defined in com.intellij.psi.search.EverythingGlobalScope[JavaClassConstructorDescriptor]

'project' @ [188:39] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.anyInternalMembersWithThisName[ValueParameterDescriptorImpl]

'java' @ [188:78] ==> public val <T> KClass<KtCallableDeclaration>.java: Class<KtCallableDeclaration> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtCallableDeclaration

'result' @ [190:13] ==> var result: Boolean defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.anyInternalMembersWithThisName[LocalVariableDescriptor]

'result' @ [193:16] ==> var result: Boolean defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.anyInternalMembersWithThisName[LocalVariableDescriptor]

'files' @ [197:34] ==> value-parameter files: List<KtFile> defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.lightContextForFacade[ValueParameterDescriptorImpl]

'first' @ [197:40] ==> public fun <T> List<KtFile>.first(): KtFile defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFile

'setupAdHocResolve' @ [198:30] ==> private final fun setupAdHocResolve(project: Project, realWorldModule: ModuleDescriptor, files: List<KtFile>): ResolveSession defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts[SimpleFunctionDescriptorImpl]

'representativeFile' @ [198:48] ==> val representativeFile: KtFile defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.lightContextForFacade[LocalVariableDescriptor]

'project' @ [198:67] ==> public final val KtFile.project: Project[MyPropertyDescriptor]

'representativeFile' @ [198:76] ==> val representativeFile: KtFile defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.lightContextForFacade[LocalVariableDescriptor]

'getResolutionFacade' @ [198:95] ==> public fun KtElement.getResolutionFacade(): ResolutionFacade defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'moduleDescriptor' @ [198:117] ==> public abstract val moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.idea.resolve.ResolutionFacade[DeserializedPropertyDescriptor]

'files' @ [198:135] ==> value-parameter files: List<KtFile> defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.lightContextForFacade[ValueParameterDescriptorImpl]

'forceResolvePackageDeclarations' @ [200:9] ==> public final fun forceResolvePackageDeclarations(files: Collection<KtFile>, session: ResolveSession): Unit defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts[SimpleFunctionDescriptorImpl]

'files' @ [200:41] ==> value-parameter files: List<KtFile> defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.lightContextForFacade[ValueParameterDescriptorImpl]

'resolveSession' @ [200:48] ==> val resolveSession: ResolveSession defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.lightContextForFacade[LocalVariableDescriptor]

'IDELightClassConstructionContext' @ [202:16] ==> public constructor IDELightClassConstructionContext(bindingContext: BindingContext, module: ModuleDescriptor, mode: IDELightClassConstructionContext.Mode) defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassConstructionContext[ClassConstructorDescriptorImpl]

'resolveSession' @ [202:49] ==> val resolveSession: ResolveSession defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.lightContextForFacade[LocalVariableDescriptor]

'bindingContext' @ [202:64] ==> public final val ResolveSession.bindingContext: BindingContext[MyPropertyDescriptor]

'resolveSession' @ [202:80] ==> val resolveSession: ResolveSession defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.lightContextForFacade[LocalVariableDescriptor]

'moduleDescriptor' @ [202:95] ==> public open val moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.resolve.lazy.ResolveSession[JavaPropertyDescriptor]

'LIGHT' @ [202:113] ==> enum entry LIGHT defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassConstructionContext.Mode[FakeCallableDescriptorForObject]

'files' @ [206:22] ==> value-parameter files: Collection<KtFile> defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.forceResolvePackageDeclarations[ValueParameterDescriptorImpl]

'file' @ [207:17] ==> val file: KtFile defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.forceResolvePackageDeclarations[LocalVariableDescriptor]

'isScript' @ [207:22] ==> public final val KtFile.isScript: Boolean[MyPropertyDescriptor]

'file' @ [209:33] ==> val file: KtFile defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.forceResolvePackageDeclarations[LocalVariableDescriptor]

'packageFqName' @ [209:38] ==> public final val KtFile.packageFqName: FqName[MyPropertyDescriptor]

'session' @ [212:37] ==> value-parameter session: ResolveSession defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.forceResolvePackageDeclarations[ValueParameterDescriptorImpl]

'moduleDescriptor' @ [212:45] ==> public open val moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.resolve.lazy.ResolveSession[JavaPropertyDescriptor]

'getPackage' @ [212:62] ==> public abstract fun getPackage(fqName: FqName): PackageViewDescriptor defined in org.jetbrains.kotlin.descriptors.ModuleDescriptor[DeserializedSimpleFunctionDescriptor]

'packageFqName' @ [212:73] ==> val packageFqName: FqName defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.forceResolvePackageDeclarations[LocalVariableDescriptor]

'packageDescriptor' @ [213:17] ==> val packageDescriptor: PackageViewDescriptor defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.forceResolvePackageDeclarations[LocalVariableDescriptor]

'isEmpty' @ [213:35] ==> public open fun isEmpty(): Boolean defined in org.jetbrains.kotlin.descriptors.PackageViewDescriptor[DeserializedSimpleFunctionDescriptor]

'LOG' @ [214:17] ==> private final val LOG: Logger defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts[PropertyDescriptorImpl]

'warn' @ [214:21] ==> public open fun warn(@NonNls p0: (String..String?)): Unit defined in com.intellij.openapi.diagnostic.Logger[JavaMethodDescriptor]

'+' @ [214:26] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'packageFqName' @ [214:63] ==> val packageFqName: FqName defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.forceResolvePackageDeclarations[LocalVariableDescriptor]

'file' @ [214:93] ==> val file: KtFile defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.forceResolvePackageDeclarations[LocalVariableDescriptor]

'name' @ [214:98] ==> public final var KtFile.name: String[MyPropertyDescriptor]

'file' @ [214:112] ==> val file: KtFile defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.forceResolvePackageDeclarations[LocalVariableDescriptor]

'text' @ [214:117] ==> public final val KtFile.text: (String..String?)[MyPropertyDescriptor]

'session' @ [215:17] ==> value-parameter session: ResolveSession defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.forceResolvePackageDeclarations[ValueParameterDescriptorImpl]

'forceResolveAll' @ [215:25] ==> public open fun forceResolveAll(): Unit defined in org.jetbrains.kotlin.resolve.lazy.ResolveSession[JavaMethodDescriptor]

'file' @ [219:33] ==> val file: KtFile defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.forceResolvePackageDeclarations[LocalVariableDescriptor]

'declarations' @ [219:38] ==> public final val KtFile.declarations: List<(KtDeclaration..KtDeclaration?)>[MyPropertyDescriptor]

'when (declaration) {
                    is KtFunction -> {
                        val name = declaration.nameAsSafeName
                        val functions = packageDescriptor.memberScope.getContributedFunctions(name, NoLookupLocation.FROM_IDE)
                        for (descriptor in functions) {
                            ForceResolveUtil.forceResolveAllContents(descriptor)
                        }
                    }
                    is KtProperty -> {
                        val name = declaration.nameAsSafeName
                        val properties = packageDescriptor.memberScope.getContributedVariables(name, NoLookupLocation.FROM_IDE)
                        for (descriptor in properties) {
                            ForceResolveUtil.forceResolveAllContents(descriptor)
                        }
                    }
                    is KtClassOrObject, is KtTypeAlias, is KtDestructuringDeclaration -> {
                        // Do nothing: we are not interested in classes or type aliases,
                        // and all destructuring declarations are erroneous at top level
                    }
                    else -> LOG.error("Unsupported declaration kind: " + declaration + " in file " + file.name + "\n" + file.text)
                }' @ [220:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit, entry3: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'declaration' @ [220:23] ==> val declaration: (KtDeclaration..KtDeclaration?) defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.forceResolvePackageDeclarations[LocalVariableDescriptor]

'declaration' @ [222:36] ==> val declaration: (KtDeclaration..KtDeclaration?) defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.forceResolvePackageDeclarations[LocalVariableDescriptor]

'nameAsSafeName' @ [222:48] ==> public final val KtFunction.nameAsSafeName: Name[MyPropertyDescriptor]

'packageDescriptor' @ [223:41] ==> val packageDescriptor: PackageViewDescriptor defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.forceResolvePackageDeclarations[LocalVariableDescriptor]

'memberScope' @ [223:59] ==> public abstract val memberScope: MemberScope defined in org.jetbrains.kotlin.descriptors.PackageViewDescriptor[DeserializedPropertyDescriptor]

'getContributedFunctions' @ [223:71] ==> public abstract fun getContributedFunctions(name: Name, location: LookupLocation): Collection<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[DeserializedSimpleFunctionDescriptor]

'name' @ [223:95] ==> val name: Name defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.forceResolvePackageDeclarations[LocalVariableDescriptor]

'FROM_IDE' @ [223:118] ==> enum entry FROM_IDE defined in org.jetbrains.kotlin.incremental.components.NoLookupLocation[FakeCallableDescriptorForObject]

'functions' @ [224:44] ==> val functions: Collection<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.forceResolvePackageDeclarations[LocalVariableDescriptor]

'forceResolveAllContents' @ [225:46] ==> public open fun <T : (Any..Any?)> forceResolveAllContents(@NotNull p0: SimpleFunctionDescriptor): (SimpleFunctionDescriptor..SimpleFunctionDescriptor?) defined in org.jetbrains.kotlin.resolve.lazy.ForceResolveUtil[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> SimpleFunctionDescriptor

'descriptor' @ [225:70] ==> val descriptor: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.forceResolvePackageDeclarations[LocalVariableDescriptor]

'declaration' @ [229:36] ==> val declaration: (KtDeclaration..KtDeclaration?) defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.forceResolvePackageDeclarations[LocalVariableDescriptor]

'nameAsSafeName' @ [229:48] ==> public final val KtProperty.nameAsSafeName: Name[MyPropertyDescriptor]

'packageDescriptor' @ [230:42] ==> val packageDescriptor: PackageViewDescriptor defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.forceResolvePackageDeclarations[LocalVariableDescriptor]

'memberScope' @ [230:60] ==> public abstract val memberScope: MemberScope defined in org.jetbrains.kotlin.descriptors.PackageViewDescriptor[DeserializedPropertyDescriptor]

'getContributedVariables' @ [230:72] ==> public abstract fun getContributedVariables(name: Name, location: LookupLocation): Collection<PropertyDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[DeserializedSimpleFunctionDescriptor]

'name' @ [230:96] ==> val name: Name defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.forceResolvePackageDeclarations[LocalVariableDescriptor]

'FROM_IDE' @ [230:119] ==> enum entry FROM_IDE defined in org.jetbrains.kotlin.incremental.components.NoLookupLocation[FakeCallableDescriptorForObject]

'properties' @ [231:44] ==> val properties: Collection<PropertyDescriptor> defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.forceResolvePackageDeclarations[LocalVariableDescriptor]

'forceResolveAllContents' @ [232:46] ==> public open fun <T : (Any..Any?)> forceResolveAllContents(@NotNull p0: PropertyDescriptor): (PropertyDescriptor..PropertyDescriptor?) defined in org.jetbrains.kotlin.resolve.lazy.ForceResolveUtil[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> PropertyDescriptor

'descriptor' @ [232:70] ==> val descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.forceResolvePackageDeclarations[LocalVariableDescriptor]

'LOG' @ [239:29] ==> private final val LOG: Logger defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts[PropertyDescriptorImpl]

'error' @ [239:33] ==> public open fun error(@NonNls p0: (String..String?)): Unit defined in com.intellij.openapi.diagnostic.Logger[JavaMethodDescriptor]

'+' @ [239:39] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'declaration' @ [239:74] ==> val declaration: (KtDeclaration..KtDeclaration?) defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.forceResolvePackageDeclarations[LocalVariableDescriptor]

'file' @ [239:102] ==> val file: KtFile defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.forceResolvePackageDeclarations[LocalVariableDescriptor]

'name' @ [239:107] ==> public final var KtFile.name: String[MyPropertyDescriptor]

'file' @ [239:121] ==> val file: KtFile defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.forceResolvePackageDeclarations[LocalVariableDescriptor]

'text' @ [239:126] ==> public final val KtFile.text: (String..String?)[MyPropertyDescriptor]

'forceResolveAllContents' @ [243:30] ==> public open fun forceResolveAllContents(@NotNull p0: Annotations): Unit defined in org.jetbrains.kotlin.resolve.lazy.ForceResolveUtil[JavaMethodDescriptor]

'session' @ [243:54] ==> value-parameter session: ResolveSession defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.forceResolvePackageDeclarations[ValueParameterDescriptorImpl]

'getFileAnnotations' @ [243:62] ==> @NotNull public open fun getFileAnnotations(@NotNull p0: KtFile): Annotations defined in org.jetbrains.kotlin.resolve.lazy.ResolveSession[JavaMethodDescriptor]

'file' @ [243:81] ==> val file: KtFile defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.forceResolvePackageDeclarations[LocalVariableDescriptor]

'BindingTraceContext' @ [249:21] ==> public constructor BindingTraceContext() defined in org.jetbrains.kotlin.resolve.BindingTraceContext[JavaClassConstructorDescriptor]

'NO_LOCKS' @ [250:42] ==> public final val NO_LOCKS: (StorageManager..StorageManager?) defined in org.jetbrains.kotlin.storage.LockBasedStorageManager[JavaPropertyDescriptor]

'ModuleDescriptorImpl' @ [251:32] ==> @JvmOverloads public constructor ModuleDescriptorImpl(moduleName: Name, storageManager: StorageManager, builtIns: KotlinBuiltIns, multiTargetPlatform: MultiTargetPlatform? = ..., capabilities: Map<ModuleDescriptor.Capability<*>, Any?> = ...) defined in org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl[DeserializedClassConstructorDescriptor]

'realWorldModule' @ [251:53] ==> value-parameter realWorldModule: ModuleDescriptor defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.setupAdHocResolve[ValueParameterDescriptorImpl]

'name' @ [251:69] ==> public final val ModuleDescriptor.name: Name[MyPropertyDescriptor]

'sm' @ [251:75] ==> val sm: (StorageManager..StorageManager?) defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.setupAdHocResolve[LocalVariableDescriptor]

'realWorldModule' @ [251:79] ==> value-parameter realWorldModule: ModuleDescriptor defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.setupAdHocResolve[ValueParameterDescriptorImpl]

'builtIns' @ [251:95] ==> public abstract val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.descriptors.ModuleDescriptor[DeserializedPropertyDescriptor]

'setupDependencies' @ [253:9] ==> private final fun setupDependencies(moduleDescriptor: ModuleDescriptorImpl, realWorldModule: ModuleDescriptor): Unit defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts[SimpleFunctionDescriptorImpl]

'moduleDescriptor' @ [253:27] ==> val moduleDescriptor: ModuleDescriptorImpl defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.setupAdHocResolve[LocalVariableDescriptor]

'realWorldModule' @ [253:45] ==> value-parameter realWorldModule: ModuleDescriptor defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.setupAdHocResolve[ValueParameterDescriptorImpl]

'files' @ [255:26] ==> value-parameter files: List<KtFile> defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.setupAdHocResolve[ValueParameterDescriptorImpl]

'first' @ [255:32] ==> public fun <T> List<KtFile>.first(): KtFile defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFile

'getModuleInfo' @ [255:40] ==> public fun PsiElement.getModuleInfo(): IdeaModuleInfo defined in org.jetbrains.kotlin.idea.caches.resolve in file getModuleInfo.kt[SimpleFunctionDescriptorImpl]

'createContainer' @ [256:25] ==> public fun createContainer(id: String, platform: TargetPlatform, init: StorageComponentContainer.() -> Unit): StorageComponentContainer defined in org.jetbrains.kotlin.resolve[DeserializedSimpleFunctionDescriptor]

'JvmPlatform' @ [256:59] ==> public object JvmPlatform : TargetPlatform defined in org.jetbrains.kotlin.resolve.jvm.platform[FakeCallableDescriptorForObject]

'IDELanguageSettingsProvider' @ [257:29] ==> public object IDELanguageSettingsProvider : LanguageSettingsProvider defined in org.jetbrains.kotlin.idea.compiler in file IDELanguageSettingsProvider.kt[FakeCallableDescriptorForObject]

'getTargetPlatform' @ [257:57] ==> public open fun getTargetPlatform(moduleInfo: ModuleInfo): TargetPlatformVersion defined in org.jetbrains.kotlin.idea.compiler.IDELanguageSettingsProvider[SimpleFunctionDescriptorImpl]

'moduleInfo' @ [257:75] ==> val moduleInfo: IdeaModuleInfo defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.setupAdHocResolve[LocalVariableDescriptor]

'configureModule' @ [258:13] ==> public fun StorageComponentContainer.configureModule(moduleContext: ModuleContext, platform: TargetPlatform, platformVersion: TargetPlatformVersion, trace: BindingTrace): Unit defined in org.jetbrains.kotlin.frontend.di[DeserializedSimpleFunctionDescriptor]

'ModuleContext' @ [259:21] ==> public fun ModuleContext(module: ModuleDescriptor, project: Project): ModuleContext defined in org.jetbrains.kotlin.context[DeserializedSimpleFunctionDescriptor]

'moduleDescriptor' @ [259:35] ==> val moduleDescriptor: ModuleDescriptorImpl defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.setupAdHocResolve[LocalVariableDescriptor]

'project' @ [259:53] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.setupAdHocResolve[ValueParameterDescriptorImpl]

'JvmPlatform' @ [259:63] ==> public object JvmPlatform : TargetPlatform defined in org.jetbrains.kotlin.resolve.jvm.platform[FakeCallableDescriptorForObject]

'jvmTarget' @ [260:21] ==> val jvmTarget: JvmTarget? defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.setupAdHocResolve.<anonymous>[LocalVariableDescriptor]

'DEFAULT' @ [260:44] ==> @field:JvmField public final val DEFAULT: JvmTarget defined in org.jetbrains.kotlin.config.JvmTarget.Companion[DeserializedPropertyDescriptor]

'trace' @ [260:53] ==> val trace: BindingTraceContext defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.setupAdHocResolve[LocalVariableDescriptor]

'useInstance' @ [263:13] ==> public fun StorageComponentContainer.useInstance(instance: Any): Unit defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]

'EMPTY_SCOPE' @ [263:43] ==> public final val EMPTY_SCOPE: (GlobalSearchScope..GlobalSearchScope?) defined in com.intellij.psi.search.GlobalSearchScope[JavaPropertyDescriptor]

'useInstance' @ [264:13] ==> public fun StorageComponentContainer.useInstance(instance: Any): Unit defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]

'DO_NOTHING' @ [264:39] ==> public object DO_NOTHING : LookupTracker defined in org.jetbrains.kotlin.incremental.components.LookupTracker[FakeCallableDescriptorForObject]

'useImpl' @ [265:13] ==> public inline fun <reified T : Any> StorageComponentContainer.useImpl(): Unit defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> FileScopeProviderImpl

'useInstance' @ [266:13] ==> public fun StorageComponentContainer.useInstance(instance: Any): Unit defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]

'getLanguageVersionSettings' @ [266:53] ==> public open fun getLanguageVersionSettings(moduleInfo: ModuleInfo, project: Project): LanguageVersionSettings defined in org.jetbrains.kotlin.idea.compiler.IDELanguageSettingsProvider[SimpleFunctionDescriptorImpl]

'moduleInfo' @ [266:80] ==> val moduleInfo: IdeaModuleInfo defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.setupAdHocResolve[LocalVariableDescriptor]

'project' @ [266:92] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.setupAdHocResolve[ValueParameterDescriptorImpl]

'useInstance' @ [267:13] ==> public fun StorageComponentContainer.useInstance(instance: Any): Unit defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]

'FileBasedDeclarationProviderFactory' @ [267:25] ==> public constructor FileBasedDeclarationProviderFactory(@NotNull p0: StorageManager, @NotNull p1: (MutableCollection<(KtFile..KtFile?)>..Collection<(KtFile..KtFile?)>)) defined in org.jetbrains.kotlin.resolve.lazy.declarations.FileBasedDeclarationProviderFactory[JavaClassConstructorDescriptor]

'sm' @ [267:61] ==> val sm: (StorageManager..StorageManager?) defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.setupAdHocResolve[LocalVariableDescriptor]

'files' @ [267:65] ==> value-parameter files: List<KtFile> defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.setupAdHocResolve[ValueParameterDescriptorImpl]

'useImpl' @ [269:13] ==> public inline fun <reified T : Any> StorageComponentContainer.useImpl(): Unit defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> AdHocAnnotationResolver

'useInstance' @ [271:13] ==> public fun StorageComponentContainer.useInstance(instance: Any): Unit defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]

'WrappedTypeFactory' @ [271:34] ==> public constructor WrappedTypeFactory(storageManager: StorageManager) defined in org.jetbrains.kotlin.types.WrappedTypeFactory[DeserializedClassConstructorDescriptor]

'sm' @ [271:53] ==> val sm: (StorageManager..StorageManager?) defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.setupAdHocResolve[LocalVariableDescriptor]

'errorType' @ [272:103] ==> private final fun errorType(): SimpleType defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.setupAdHocResolve.<anonymous>.<no name provided>[SimpleFunctionDescriptorImpl]

'errorType' @ [274:122] ==> private final fun errorType(): SimpleType defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.setupAdHocResolve.<anonymous>.<no name provided>[SimpleFunctionDescriptorImpl]

'createErrorType' @ [276:54] ==> @NotNull public open fun createErrorType(@NotNull p0: String): SimpleType defined in org.jetbrains.kotlin.types.ErrorUtils[JavaMethodDescriptor]

'IdeaEnvironment' @ [279:13] ==> public object IdeaEnvironment : TargetEnvironment defined in org.jetbrains.kotlin.idea.project in file IdeaEnvironment.kt[FakeCallableDescriptorForObject]

'configure' @ [279:29] ==> public open fun configure(container: StorageComponentContainer): Unit defined in org.jetbrains.kotlin.idea.project.IdeaEnvironment[SimpleFunctionDescriptorImpl]

'this' @ [279:39] ==> <this> defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.setupAdHocResolve.<anonymous>[ReceiverParameterDescriptorImpl]

'useImpl' @ [281:13] ==> public inline fun <reified T : Any> StorageComponentContainer.useImpl(): Unit defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> ResolveSession

'container' @ [285:30] ==> val container: StorageComponentContainer defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.setupAdHocResolve[LocalVariableDescriptor]

'get' @ [285:40] ==> public inline fun <reified T : Any> ComponentProvider.get(): ResolveSession defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> ResolveSession

'moduleDescriptor' @ [286:9] ==> val moduleDescriptor: ModuleDescriptorImpl defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.setupAdHocResolve[LocalVariableDescriptor]

'initialize' @ [286:26] ==> public final fun initialize(providerForModuleContent: PackageFragmentProvider): Unit defined in org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl[DeserializedSimpleFunctionDescriptor]

'CompositePackageFragmentProvider' @ [286:37] ==> public constructor CompositePackageFragmentProvider(providers: List<PackageFragmentProvider>) defined in org.jetbrains.kotlin.descriptors.impl.CompositePackageFragmentProvider[DeserializedClassConstructorDescriptor]

'listOf' @ [286:70] ==> public fun <T> listOf(element: PackageFragmentProvider): List<PackageFragmentProvider> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PackageFragmentProvider

'resolveSession' @ [286:77] ==> val resolveSession: ResolveSession defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.setupAdHocResolve[LocalVariableDescriptor]

'packageFragmentProvider' @ [286:92] ==> public final val ResolveSession.packageFragmentProvider: PackageFragmentProvider[MyPropertyDescriptor]

'resolveSession' @ [287:16] ==> val resolveSession: ResolveSession defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.setupAdHocResolve[LocalVariableDescriptor]

'realWorldModule' @ [291:29] ==> value-parameter realWorldModule: ModuleDescriptor defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.setupDependencies[ValueParameterDescriptorImpl]

'getPackage' @ [291:45] ==> public abstract fun getPackage(fqName: FqName): PackageViewDescriptor defined in org.jetbrains.kotlin.descriptors.ModuleDescriptor[DeserializedSimpleFunctionDescriptor]

'FqName' @ [291:56] ==> public constructor FqName(@NotNull p0: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

'memberScope' @ [291:78] ==> public abstract val memberScope: MemberScope defined in org.jetbrains.kotlin.descriptors.PackageViewDescriptor[DeserializedPropertyDescriptor]

'getContributedClassifier' @ [292:18] ==> public abstract fun getContributedClassifier(name: Name, location: LookupLocation): ClassifierDescriptor? defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[DeserializedSimpleFunctionDescriptor]

'identifier' @ [292:48] ==> @NotNull public open fun identifier(@NotNull p0: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'FROM_IDE' @ [292:89] ==> enum entry FROM_IDE defined in org.jetbrains.kotlin.incremental.components.NoLookupLocation[FakeCallableDescriptorForObject]

'if (jvmFieldClass != null) {
            moduleDescriptor.setDependencies(moduleDescriptor, jvmFieldClass.module as ModuleDescriptorImpl, moduleDescriptor.builtIns.builtInsModule)
        }
        else {
            moduleDescriptor.setDependencies(moduleDescriptor, moduleDescriptor.builtIns.builtInsModule)
        }' @ [294:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'jvmFieldClass' @ [294:13] ==> val jvmFieldClass: ClassifierDescriptor? defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.setupDependencies[LocalVariableDescriptor]

'moduleDescriptor' @ [295:13] ==> value-parameter moduleDescriptor: ModuleDescriptorImpl defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.setupDependencies[ValueParameterDescriptorImpl]

'setDependencies' @ [295:30] ==> public final fun setDependencies(vararg descriptors: ModuleDescriptorImpl): Unit defined in org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl[DeserializedSimpleFunctionDescriptor]

'moduleDescriptor' @ [295:46] ==> value-parameter moduleDescriptor: ModuleDescriptorImpl defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.setupDependencies[ValueParameterDescriptorImpl]

'jvmFieldClass' @ [295:64] ==> val jvmFieldClass: ClassifierDescriptor? defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.setupDependencies[LocalVariableDescriptor]

'module' @ [295:78] ==> public val DeclarationDescriptor.module: ModuleDescriptor defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'moduleDescriptor' @ [295:110] ==> value-parameter moduleDescriptor: ModuleDescriptorImpl defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.setupDependencies[ValueParameterDescriptorImpl]

'builtIns' @ [295:127] ==> public open val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl[DeserializedPropertyDescriptor]

'builtInsModule' @ [295:136] ==> public final var KotlinBuiltIns.builtInsModule: ModuleDescriptorImpl[MyPropertyDescriptor]

'moduleDescriptor' @ [298:13] ==> value-parameter moduleDescriptor: ModuleDescriptorImpl defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.setupDependencies[ValueParameterDescriptorImpl]

'setDependencies' @ [298:30] ==> public final fun setDependencies(vararg descriptors: ModuleDescriptorImpl): Unit defined in org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl[DeserializedSimpleFunctionDescriptor]

'moduleDescriptor' @ [298:46] ==> value-parameter moduleDescriptor: ModuleDescriptorImpl defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.setupDependencies[ValueParameterDescriptorImpl]

'moduleDescriptor' @ [298:64] ==> value-parameter moduleDescriptor: ModuleDescriptorImpl defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.setupDependencies[ValueParameterDescriptorImpl]

'builtIns' @ [298:81] ==> public open val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl[DeserializedPropertyDescriptor]

'builtInsModule' @ [298:90] ==> public final var KotlinBuiltIns.builtInsModule: ModuleDescriptorImpl[MyPropertyDescriptor]

'listOf' @ [303:48] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'map' @ [306:7] ==> public inline fun <T, R> Iterable<String>.map(transform: (String) -> FqName): List<FqName> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> FqName

'FqName' @ [306:13] ==> public constructor FqName(@NotNull p0: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

'child' @ [306:34] ==> @NotNull public open fun child(@NotNull p0: Name): FqName defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'identifier' @ [306:45] ==> @NotNull public open fun identifier(@NotNull p0: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'it' @ [306:56] ==> value-parameter it: String defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.annotationsThatAffectCodegen.<anonymous>[ValueParameterDescriptorImpl]

'FqName' @ [306:65] ==> public constructor FqName(@NotNull p0: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

'FqName' @ [306:97] ==> public constructor FqName(@NotNull p0: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

'AnnotationResolverImpl' @ [313:9] ==> public constructor AnnotationResolverImpl(@NotNull p0: CallResolver, @NotNull p1: ConstantExpressionEvaluator, @NotNull p2: StorageManager) defined in org.jetbrains.kotlin.resolve.AnnotationResolverImpl[JavaClassConstructorDescriptor]

'callResolver' @ [313:32] ==> value-parameter callResolver: CallResolver defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.AdHocAnnotationResolver.<init>[ValueParameterDescriptorImpl]

'constantExpressionEvaluator' @ [313:46] ==> value-parameter constantExpressionEvaluator: ConstantExpressionEvaluator defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.AdHocAnnotationResolver.<init>[ValueParameterDescriptorImpl]

'storageManager' @ [313:75] ==> value-parameter storageManager: StorageManager defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.AdHocAnnotationResolver.<init>[ValueParameterDescriptorImpl]

'annotationClassByEntry' @ [316:20] ==> private final fun annotationClassByEntry(entryElement: KtAnnotationEntry): ClassDescriptor? defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.AdHocAnnotationResolver[SimpleFunctionDescriptorImpl]

'entryElement' @ [316:43] ==> value-parameter entryElement: KtAnnotationEntry defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.AdHocAnnotationResolver.resolveAnnotationType[ValueParameterDescriptorImpl]

'defaultType' @ [316:58] ==> public final val ClassDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'super' @ [316:73] ==> <this> defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.AdHocAnnotationResolver[LazyClassReceiverParameterDescriptor]

'resolveAnnotationType' @ [316:79] ==> @NotNull public open fun resolveAnnotationType(@NotNull scope: LexicalScope, @NotNull entryElement: KtAnnotationEntry, @NotNull trace: BindingTrace): KotlinType defined in org.jetbrains.kotlin.resolve.AnnotationResolverImpl[JavaMethodDescriptor]

'scope' @ [316:101] ==> value-parameter scope: LexicalScope defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.AdHocAnnotationResolver.resolveAnnotationType[ValueParameterDescriptorImpl]

'entryElement' @ [316:108] ==> value-parameter entryElement: KtAnnotationEntry defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.AdHocAnnotationResolver.resolveAnnotationType[ValueParameterDescriptorImpl]

'trace' @ [316:122] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.AdHocAnnotationResolver.resolveAnnotationType[ValueParameterDescriptorImpl]

'entryElement' @ [320:46] ==> value-parameter entryElement: KtAnnotationEntry defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.AdHocAnnotationResolver.annotationClassByEntry[ValueParameterDescriptorImpl]

'calleeExpression' @ [320:59] ==> public final val KtAnnotationEntry.calleeExpression: KtConstructorCalleeExpression?[MyPropertyDescriptor]

'constructorReferenceExpression' @ [320:77] ==> public final val KtConstructorCalleeExpression.constructorReferenceExpression: KtSimpleNameExpression?[MyPropertyDescriptor]

'annotationTypeReferencePsi' @ [321:34] ==> val annotationTypeReferencePsi: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.AdHocAnnotationResolver.annotationClassByEntry[LocalVariableDescriptor]

'getReferencedName' @ [321:61] ==> public abstract fun getReferencedName(): String defined in org.jetbrains.kotlin.psi.KtSimpleNameExpression[DeserializedSimpleFunctionDescriptor]

'annotationsThatAffectCodegen' @ [322:38] ==> private final val annotationsThatAffectCodegen: List<FqName> defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts[PropertyDescriptorImpl]

'referencedName' @ [323:21] ==> val referencedName: String defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.AdHocAnnotationResolver.annotationClassByEntry[LocalVariableDescriptor]

'annotationFqName' @ [323:39] ==> val annotationFqName: FqName defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.AdHocAnnotationResolver.annotationClassByEntry[LocalVariableDescriptor]

'shortName' @ [323:56] ==> @NotNull public open fun shortName(): Name defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'asString' @ [323:68] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'moduleDescriptor' @ [324:21] ==> private final val moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.AdHocAnnotationResolver[PropertyDescriptorImpl]

'getPackage' @ [324:38] ==> public abstract fun getPackage(fqName: FqName): PackageViewDescriptor defined in org.jetbrains.kotlin.descriptors.ModuleDescriptor[DeserializedSimpleFunctionDescriptor]

'annotationFqName' @ [324:49] ==> val annotationFqName: FqName defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.AdHocAnnotationResolver.annotationClassByEntry[LocalVariableDescriptor]

'parent' @ [324:66] ==> @NotNull public open fun parent(): FqName defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'memberScope' @ [324:76] ==> public abstract val memberScope: MemberScope defined in org.jetbrains.kotlin.descriptors.PackageViewDescriptor[DeserializedPropertyDescriptor]

'getContributedClassifier' @ [325:30] ==> public abstract fun getContributedClassifier(name: Name, location: LookupLocation): ClassifierDescriptor? defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[DeserializedSimpleFunctionDescriptor]

'annotationFqName' @ [325:55] ==> val annotationFqName: FqName defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.AdHocAnnotationResolver.annotationClassByEntry[LocalVariableDescriptor]

'shortName' @ [325:72] ==> @NotNull public open fun shortName(): Name defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'FROM_IDE' @ [325:102] ==> enum entry FROM_IDE defined in org.jetbrains.kotlin.incremental.components.NoLookupLocation[FakeCallableDescriptorForObject]

'let' @ [325:113] ==> @InlineOnly public inline fun <T, R> ClassifierDescriptor.let(block: (ClassifierDescriptor) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassifierDescriptor
    <R> -> Nothing

'it' @ [325:126] ==> value-parameter it: ClassifierDescriptor defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.AdHocAnnotationResolver.annotationClassByEntry.<anonymous>[ValueParameterDescriptorImpl]

'annotationClassByEntry' @ [333:41] ==> private final fun annotationClassByEntry(entryElement: KtAnnotationEntry): ClassDescriptor? defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.AdHocAnnotationResolver[SimpleFunctionDescriptorImpl]

'annotationEntry' @ [333:64] ==> value-parameter annotationEntry: KtAnnotationEntry defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.AdHocAnnotationResolver.resolveAnnotationCall[ValueParameterDescriptorImpl]

'constructors' @ [333:82] ==> public final val ClassDescriptor.constructors: Collection<(ClassConstructorDescriptor..ClassConstructorDescriptor?)>[MyPropertyDescriptor]

'singleOrNull' @ [333:96] ==> public fun <T> Iterable<(ClassConstructorDescriptor..ClassConstructorDescriptor?)>.singleOrNull(): ClassConstructorDescriptor? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor..org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor?)

'super' @ [334:51] ==> <this> defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.AdHocAnnotationResolver[LazyClassReceiverParameterDescriptor]

'resolveAnnotationCall' @ [334:57] ==> @NotNull public open fun resolveAnnotationCall(@NotNull annotationEntry: KtAnnotationEntry, @NotNull scope: LexicalScope, @NotNull trace: BindingTrace): OverloadResolutionResults<FunctionDescriptor> defined in org.jetbrains.kotlin.resolve.AnnotationResolverImpl[JavaMethodDescriptor]

'annotationEntry' @ [334:79] ==> value-parameter annotationEntry: KtAnnotationEntry defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.AdHocAnnotationResolver.resolveAnnotationCall[ValueParameterDescriptorImpl]

'scope' @ [334:96] ==> value-parameter scope: LexicalScope defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.AdHocAnnotationResolver.resolveAnnotationCall[ValueParameterDescriptorImpl]

'trace' @ [334:103] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.AdHocAnnotationResolver.resolveAnnotationCall[ValueParameterDescriptorImpl]

'Suppress' @ [336:13] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'callResolver' @ [337:20] ==> private final val callResolver: CallResolver defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.AdHocAnnotationResolver[PropertyDescriptorImpl]

'resolveConstructorCall' @ [337:33] ==> @NotNull public open fun resolveConstructorCall(@NotNull p0: BasicCallResolutionContext, @NotNull p1: KtReferenceExpression, @NotNull p2: KotlinType): OverloadResolutionResults<(ConstructorDescriptor..ConstructorDescriptor?)> defined in org.jetbrains.kotlin.resolve.calls.CallResolver[JavaMethodDescriptor]

'create' @ [338:48] ==> @NotNull public open fun create(@NotNull p0: BindingTrace, @NotNull p1: LexicalScope, @NotNull p2: Call, @NotNull p3: KotlinType, @NotNull p4: DataFlowInfo, @NotNull p5: ContextDependency, @NotNull p6: CheckArgumentTypesMode, p7: Boolean): BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.context.BasicCallResolutionContext[JavaMethodDescriptor]

'trace' @ [339:29] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.AdHocAnnotationResolver.resolveAnnotationCall[ValueParameterDescriptorImpl]

'scope' @ [339:36] ==> value-parameter scope: LexicalScope defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.AdHocAnnotationResolver.resolveAnnotationCall[ValueParameterDescriptorImpl]

'makeCall' @ [339:53] ==> @NotNull public open fun makeCall(@Nullable p0: Receiver?, @Nullable p1: ASTNode?, @NotNull p2: KtCallElement): Call defined in org.jetbrains.kotlin.resolve.calls.util.CallMaker[JavaMethodDescriptor]

'annotationEntry' @ [339:74] ==> value-parameter annotationEntry: KtAnnotationEntry defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.AdHocAnnotationResolver.resolveAnnotationCall[ValueParameterDescriptorImpl]

'NO_EXPECTED_TYPE' @ [339:102] ==> @NotNull public final val NO_EXPECTED_TYPE: SimpleType defined in org.jetbrains.kotlin.types.TypeUtils[JavaPropertyDescriptor]

'EMPTY' @ [340:49] ==> @field:JvmField public final val EMPTY: DataFlowInfo defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowInfoFactory[DeserializedPropertyDescriptor]

'INDEPENDENT' @ [340:74] ==> enum entry INDEPENDENT defined in org.jetbrains.kotlin.resolve.calls.context.ContextDependency[FakeCallableDescriptorForObject]

'CHECK_VALUE_ARGUMENTS' @ [340:110] ==> enum entry CHECK_VALUE_ARGUMENTS defined in org.jetbrains.kotlin.resolve.calls.context.CheckArgumentTypesMode[FakeCallableDescriptorForObject]

'annotationEntry' @ [343:21] ==> value-parameter annotationEntry: KtAnnotationEntry defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.AdHocAnnotationResolver.resolveAnnotationCall[ValueParameterDescriptorImpl]

'calleeExpression' @ [343:37] ==> public final val KtAnnotationEntry.calleeExpression: KtConstructorCalleeExpression?[MyPropertyDescriptor]

'constructorReferenceExpression' @ [343:56] ==> public final val KtConstructorCalleeExpression.constructorReferenceExpression: KtSimpleNameExpression?[MyPropertyDescriptor]

'annotationConstructor' @ [344:21] ==> val annotationConstructor: ClassConstructorDescriptor defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassContexts.AdHocAnnotationResolver.resolveAnnotationCall[LocalVariableDescriptor]

'returnType' @ [344:43] ==> public final val ClassConstructorDescriptor.returnType: KotlinType[MyPropertyDescriptor]

