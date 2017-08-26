'projectFacade' @ [42:17] ==> private final val projectFacade: ProjectResolutionFacade defined in org.jetbrains.kotlin.idea.caches.resolve.ResolutionFacadeImpl[PropertyDescriptorImpl]

'project' @ [42:31] ==> public final val project: Project defined in org.jetbrains.kotlin.idea.caches.resolve.ProjectResolutionFacade[PropertyDescriptorImpl]

'findModuleDescriptor' @ [47:17] ==> public final fun findModuleDescriptor(ideaModuleInfo: IdeaModuleInfo): ModuleDescriptor defined in org.jetbrains.kotlin.idea.caches.resolve.ResolutionFacadeImpl[SimpleFunctionDescriptorImpl]

'moduleInfo' @ [47:38] ==> private final val moduleInfo: IdeaModuleInfo defined in org.jetbrains.kotlin.idea.caches.resolve.ResolutionFacadeImpl[PropertyDescriptorImpl]

'projectFacade' @ [49:64] ==> private final val projectFacade: ProjectResolutionFacade defined in org.jetbrains.kotlin.idea.caches.resolve.ResolutionFacadeImpl[PropertyDescriptorImpl]

'findModuleDescriptor' @ [49:78] ==> public final fun findModuleDescriptor(ideaModuleInfo: IdeaModuleInfo): ModuleDescriptor defined in org.jetbrains.kotlin.idea.caches.resolve.ProjectResolutionFacade[SimpleFunctionDescriptorImpl]

'ideaModuleInfo' @ [49:99] ==> value-parameter ideaModuleInfo: IdeaModuleInfo defined in org.jetbrains.kotlin.idea.caches.resolve.ResolutionFacadeImpl.findModuleDescriptor[ValueParameterDescriptorImpl]

'analyze' @ [52:16] ==> public open fun analyze(elements: Collection<KtElement>, bodyResolveMode: BodyResolveMode): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve.ResolutionFacadeImpl[SimpleFunctionDescriptorImpl]

'listOf' @ [52:24] ==> public fun <T> listOf(element: KtElement): List<KtElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtElement

'element' @ [52:31] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.idea.caches.resolve.ResolutionFacadeImpl.analyze[ValueParameterDescriptorImpl]

'bodyResolveMode' @ [52:41] ==> value-parameter bodyResolveMode: BodyResolveMode defined in org.jetbrains.kotlin.idea.caches.resolve.ResolutionFacadeImpl.analyze[ValueParameterDescriptorImpl]

'elements' @ [56:13] ==> value-parameter elements: Collection<KtElement> defined in org.jetbrains.kotlin.idea.caches.resolve.ResolutionFacadeImpl.analyze[ValueParameterDescriptorImpl]

'isEmpty' @ [56:22] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Collection[DeserializedSimpleFunctionDescriptor]

'EMPTY' @ [56:55] ==> public final val EMPTY: (BindingContext..BindingContext?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'getFrontendService' @ [57:35] ==> public open fun <T : Any> getFrontendService(element: PsiElement, serviceClass: Class<ResolveElementCache>): ResolveElementCache defined in org.jetbrains.kotlin.idea.caches.resolve.ResolutionFacadeImpl[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> ResolveElementCache

'elements' @ [57:54] ==> value-parameter elements: Collection<KtElement> defined in org.jetbrains.kotlin.idea.caches.resolve.ResolutionFacadeImpl.analyze[ValueParameterDescriptorImpl]

'first' @ [57:63] ==> public fun <T> Iterable<KtElement>.first(): KtElement defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtElement

'ResolveElementCache' @ [57:72] ==> public constructor ResolveElementCache(resolveSession: ResolveSession, project: Project, targetPlatform: TargetPlatform, codeFragmentAnalyzer: CodeFragmentAnalyzer) defined in org.jetbrains.kotlin.idea.project.ResolveElementCache[ClassConstructorDescriptorImpl]

'java' @ [57:99] ==> public val <T> KClass<ResolveElementCache>.java: Class<ResolveElementCache> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> ResolveElementCache

'resolveElementCache' @ [58:16] ==> val resolveElementCache: ResolveElementCache defined in org.jetbrains.kotlin.idea.caches.resolve.ResolutionFacadeImpl.analyze[LocalVariableDescriptor]

'resolveToElements' @ [58:36] ==> public final fun resolveToElements(elements: Collection<KtElement>, bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.project.ResolveElementCache[SimpleFunctionDescriptorImpl]

'elements' @ [58:54] ==> value-parameter elements: Collection<KtElement> defined in org.jetbrains.kotlin.idea.caches.resolve.ResolutionFacadeImpl.analyze[ValueParameterDescriptorImpl]

'bodyResolveMode' @ [58:64] ==> value-parameter bodyResolveMode: BodyResolveMode defined in org.jetbrains.kotlin.idea.caches.resolve.ResolutionFacadeImpl.analyze[ValueParameterDescriptorImpl]

'projectFacade' @ [62:15] ==> private final val projectFacade: ProjectResolutionFacade defined in org.jetbrains.kotlin.idea.caches.resolve.ResolutionFacadeImpl[PropertyDescriptorImpl]

'getAnalysisResultsForElements' @ [62:29] ==> public final fun getAnalysisResultsForElements(elements: Collection<KtElement>): AnalysisResult defined in org.jetbrains.kotlin.idea.caches.resolve.ProjectResolutionFacade[SimpleFunctionDescriptorImpl]

'elements' @ [62:59] ==> value-parameter elements: Collection<KtElement> defined in org.jetbrains.kotlin.idea.caches.resolve.ResolutionFacadeImpl.analyzeFullyAndGetResult[ValueParameterDescriptorImpl]

'if (KtPsiUtil.isLocal(declaration)) {
            val bindingContext = analyze(declaration, bodyResolveMode)
            bindingContext[BindingContext.DECLARATION_TO_DESCRIPTOR, declaration]
            ?: getFrontendService(moduleInfo, AbsentDescriptorHandler::class.java).diagnoseDescriptorNotFound(declaration)
        }
        else {
            val resolveSession = projectFacade.resolverForModuleInfo(declaration.getModuleInfo()).componentProvider.get<ResolveSession>()
            resolveSession.resolveToDescriptor(declaration)
        }' @ [65:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: DeclarationDescriptor, elseBranch: DeclarationDescriptor): DeclarationDescriptor[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> DeclarationDescriptor

'isLocal' @ [65:30] ==> public open fun isLocal(@NotNull p0: KtDeclaration): Boolean defined in org.jetbrains.kotlin.psi.KtPsiUtil[JavaMethodDescriptor]

'declaration' @ [65:38] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.caches.resolve.ResolutionFacadeImpl.resolveToDescriptor[ValueParameterDescriptorImpl]

'analyze' @ [66:34] ==> public open fun analyze(element: KtElement, bodyResolveMode: BodyResolveMode): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve.ResolutionFacadeImpl[SimpleFunctionDescriptorImpl]

'declaration' @ [66:42] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.caches.resolve.ResolutionFacadeImpl.resolveToDescriptor[ValueParameterDescriptorImpl]

'bodyResolveMode' @ [66:55] ==> value-parameter bodyResolveMode: BodyResolveMode defined in org.jetbrains.kotlin.idea.caches.resolve.ResolutionFacadeImpl.resolveToDescriptor[ValueParameterDescriptorImpl]

'bindingContext' @ [67:13] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve.ResolutionFacadeImpl.resolveToDescriptor[LocalVariableDescriptor]

'DECLARATION_TO_DESCRIPTOR' @ [67:43] ==> public final val DECLARATION_TO_DESCRIPTOR: (ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>..ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'declaration' @ [67:70] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.caches.resolve.ResolutionFacadeImpl.resolveToDescriptor[ValueParameterDescriptorImpl]

'getFrontendService' @ [68:16] ==> public final fun <T : Any> getFrontendService(ideaModuleInfo: IdeaModuleInfo, serviceClass: Class<AbsentDescriptorHandler>): AbsentDescriptorHandler defined in org.jetbrains.kotlin.idea.caches.resolve.ResolutionFacadeImpl[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> AbsentDescriptorHandler

'moduleInfo' @ [68:35] ==> private final val moduleInfo: IdeaModuleInfo defined in org.jetbrains.kotlin.idea.caches.resolve.ResolutionFacadeImpl[PropertyDescriptorImpl]

'java' @ [68:78] ==> public val <T> KClass<AbsentDescriptorHandler>.java: Class<AbsentDescriptorHandler> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> AbsentDescriptorHandler

'diagnoseDescriptorNotFound' @ [68:84] ==> public abstract fun diagnoseDescriptorNotFound(declaration: KtDeclaration): DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.lazy.AbsentDescriptorHandler[DeserializedSimpleFunctionDescriptor]

'declaration' @ [68:111] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.caches.resolve.ResolutionFacadeImpl.resolveToDescriptor[ValueParameterDescriptorImpl]

'projectFacade' @ [71:34] ==> private final val projectFacade: ProjectResolutionFacade defined in org.jetbrains.kotlin.idea.caches.resolve.ResolutionFacadeImpl[PropertyDescriptorImpl]

'resolverForModuleInfo' @ [71:48] ==> public final fun resolverForModuleInfo(moduleInfo: IdeaModuleInfo): ResolverForModule defined in org.jetbrains.kotlin.idea.caches.resolve.ProjectResolutionFacade[SimpleFunctionDescriptorImpl]

'declaration' @ [71:70] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.caches.resolve.ResolutionFacadeImpl.resolveToDescriptor[ValueParameterDescriptorImpl]

'getModuleInfo' @ [71:82] ==> public fun PsiElement.getModuleInfo(): IdeaModuleInfo defined in org.jetbrains.kotlin.idea.caches.resolve in file getModuleInfo.kt[SimpleFunctionDescriptorImpl]

'componentProvider' @ [71:99] ==> public final val componentProvider: ComponentProvider defined in org.jetbrains.kotlin.analyzer.ResolverForModule[DeserializedPropertyDescriptor]

'get' @ [71:117] ==> public inline fun <reified T : Any> ComponentProvider.get(): ResolveSession defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> ResolveSession

'resolveSession' @ [72:13] ==> val resolveSession: ResolveSession defined in org.jetbrains.kotlin.idea.caches.resolve.ResolutionFacadeImpl.resolveToDescriptor[LocalVariableDescriptor]

'resolveToDescriptor' @ [72:28] ==> @NotNull public open fun resolveToDescriptor(@NotNull p0: KtDeclaration): DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.lazy.ResolveSession[JavaMethodDescriptor]

'declaration' @ [72:48] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.caches.resolve.ResolutionFacadeImpl.resolveToDescriptor[ValueParameterDescriptorImpl]

'getFrontendService' @ [76:77] ==> public final fun <T : Any> getFrontendService(ideaModuleInfo: IdeaModuleInfo, serviceClass: Class<T>): T defined in org.jetbrains.kotlin.idea.caches.resolve.ResolutionFacadeImpl[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> T

'moduleInfo' @ [76:96] ==> private final val moduleInfo: IdeaModuleInfo defined in org.jetbrains.kotlin.idea.caches.resolve.ResolutionFacadeImpl[PropertyDescriptorImpl]

'serviceClass' @ [76:108] ==> value-parameter serviceClass: Class<T> defined in org.jetbrains.kotlin.idea.caches.resolve.ResolutionFacadeImpl.getFrontendService[ValueParameterDescriptorImpl]

'projectFacade' @ [79:16] ==> private final val projectFacade: ProjectResolutionFacade defined in org.jetbrains.kotlin.idea.caches.resolve.ResolutionFacadeImpl[PropertyDescriptorImpl]

'resolverForModuleInfo' @ [79:30] ==> public final fun resolverForModuleInfo(moduleInfo: IdeaModuleInfo): ResolverForModule defined in org.jetbrains.kotlin.idea.caches.resolve.ProjectResolutionFacade[SimpleFunctionDescriptorImpl]

'moduleInfo' @ [79:52] ==> private final val moduleInfo: IdeaModuleInfo defined in org.jetbrains.kotlin.idea.caches.resolve.ResolutionFacadeImpl[PropertyDescriptorImpl]

'componentProvider' @ [79:64] ==> public final val componentProvider: ComponentProvider defined in org.jetbrains.kotlin.analyzer.ResolverForModule[DeserializedPropertyDescriptor]

'create' @ [79:82] ==> public abstract fun <T> create(request: Class<T>): T defined in org.jetbrains.kotlin.container.ComponentProvider[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'serviceClass' @ [79:89] ==> value-parameter serviceClass: Class<T> defined in org.jetbrains.kotlin.idea.caches.resolve.ResolutionFacadeImpl.getIdeService[ValueParameterDescriptorImpl]

'getFrontendService' @ [83:16] ==> public final fun <T : Any> getFrontendService(ideaModuleInfo: IdeaModuleInfo, serviceClass: Class<T>): T defined in org.jetbrains.kotlin.idea.caches.resolve.ResolutionFacadeImpl[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> T

'element' @ [83:35] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.caches.resolve.ResolutionFacadeImpl.getFrontendService[ValueParameterDescriptorImpl]

'getModuleInfo' @ [83:43] ==> public fun PsiElement.getModuleInfo(): IdeaModuleInfo defined in org.jetbrains.kotlin.idea.caches.resolve in file getModuleInfo.kt[SimpleFunctionDescriptorImpl]

'serviceClass' @ [83:60] ==> value-parameter serviceClass: Class<T> defined in org.jetbrains.kotlin.idea.caches.resolve.ResolutionFacadeImpl.getFrontendService[ValueParameterDescriptorImpl]

'projectFacade' @ [87:16] ==> private final val projectFacade: ProjectResolutionFacade defined in org.jetbrains.kotlin.idea.caches.resolve.ResolutionFacadeImpl[PropertyDescriptorImpl]

'resolverForModuleInfo' @ [87:30] ==> public final fun resolverForModuleInfo(moduleInfo: IdeaModuleInfo): ResolverForModule defined in org.jetbrains.kotlin.idea.caches.resolve.ProjectResolutionFacade[SimpleFunctionDescriptorImpl]

'element' @ [87:52] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.caches.resolve.ResolutionFacadeImpl.tryGetFrontendService[ValueParameterDescriptorImpl]

'getModuleInfo' @ [87:60] ==> public fun PsiElement.getModuleInfo(): IdeaModuleInfo defined in org.jetbrains.kotlin.idea.caches.resolve in file getModuleInfo.kt[SimpleFunctionDescriptorImpl]

'componentProvider' @ [87:77] ==> public final val componentProvider: ComponentProvider defined in org.jetbrains.kotlin.analyzer.ResolverForModule[DeserializedPropertyDescriptor]

'tryGetService' @ [87:95] ==> public fun <T : Any> ComponentProvider.tryGetService(request: Class<T>): T? defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> T

'serviceClass' @ [87:109] ==> value-parameter serviceClass: Class<T> defined in org.jetbrains.kotlin.idea.caches.resolve.ResolutionFacadeImpl.tryGetFrontendService[ValueParameterDescriptorImpl]

'projectFacade' @ [91:16] ==> private final val projectFacade: ProjectResolutionFacade defined in org.jetbrains.kotlin.idea.caches.resolve.ResolutionFacadeImpl[PropertyDescriptorImpl]

'resolverForModuleInfo' @ [91:30] ==> public final fun resolverForModuleInfo(moduleInfo: IdeaModuleInfo): ResolverForModule defined in org.jetbrains.kotlin.idea.caches.resolve.ProjectResolutionFacade[SimpleFunctionDescriptorImpl]

'ideaModuleInfo' @ [91:52] ==> value-parameter ideaModuleInfo: IdeaModuleInfo defined in org.jetbrains.kotlin.idea.caches.resolve.ResolutionFacadeImpl.getFrontendService[ValueParameterDescriptorImpl]

'componentProvider' @ [91:68] ==> public final val componentProvider: ComponentProvider defined in org.jetbrains.kotlin.analyzer.ResolverForModule[DeserializedPropertyDescriptor]

'getService' @ [91:86] ==> public fun <T : Any> ComponentProvider.getService(request: Class<T>): T defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> T

'serviceClass' @ [91:97] ==> value-parameter serviceClass: Class<T> defined in org.jetbrains.kotlin.idea.caches.resolve.ResolutionFacadeImpl.getFrontendService[ValueParameterDescriptorImpl]

'projectFacade' @ [95:16] ==> private final val projectFacade: ProjectResolutionFacade defined in org.jetbrains.kotlin.idea.caches.resolve.ResolutionFacadeImpl[PropertyDescriptorImpl]

'resolverForDescriptor' @ [95:30] ==> public final fun resolverForDescriptor(moduleDescriptor: ModuleDescriptor): ResolverForModule defined in org.jetbrains.kotlin.idea.caches.resolve.ProjectResolutionFacade[SimpleFunctionDescriptorImpl]

'moduleDescriptor' @ [95:52] ==> value-parameter moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.idea.caches.resolve.ResolutionFacadeImpl.getFrontendService[ValueParameterDescriptorImpl]

'componentProvider' @ [95:70] ==> public final val componentProvider: ComponentProvider defined in org.jetbrains.kotlin.analyzer.ResolverForModule[DeserializedPropertyDescriptor]

'getService' @ [95:88] ==> public fun <T : Any> ComponentProvider.getService(request: Class<T>): T defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> T

'serviceClass' @ [95:99] ==> value-parameter serviceClass: Class<T> defined in org.jetbrains.kotlin.idea.caches.resolve.ResolutionFacadeImpl.getFrontendService[ValueParameterDescriptorImpl]

'this' @ [100:13] ==> <this> defined in org.jetbrains.kotlin.idea.caches.resolve.findModuleDescriptor[ReceiverParameterDescriptorImpl]

'findModuleDescriptor' @ [100:45] ==> public final fun findModuleDescriptor(ideaModuleInfo: IdeaModuleInfo): ModuleDescriptor defined in org.jetbrains.kotlin.idea.caches.resolve.ResolutionFacadeImpl[SimpleFunctionDescriptorImpl]

'ideaModuleInfo' @ [100:66] ==> value-parameter ideaModuleInfo: IdeaModuleInfo defined in org.jetbrains.kotlin.idea.caches.resolve.findModuleDescriptor[ValueParameterDescriptorImpl]

