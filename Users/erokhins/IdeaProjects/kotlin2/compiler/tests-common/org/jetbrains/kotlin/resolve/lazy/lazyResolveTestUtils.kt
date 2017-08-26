'ProjectContext' @ [37:26] ==> public fun ProjectContext(project: Project): ProjectContext defined in org.jetbrains.kotlin.context[DeserializedSimpleFunctionDescriptor]

'project' @ [37:41] ==> value-parameter project: Project defined in org.jetbrains.kotlin.resolve.lazy.createResolveSessionForFiles[ValueParameterDescriptorImpl]

'TestModule' @ [38:22] ==> public constructor TestModule(dependsOnBuiltIns: Boolean) defined in org.jetbrains.kotlin.resolve.lazy.TestModule[ClassConstructorDescriptorImpl]

'addBuiltIns' @ [38:33] ==> value-parameter addBuiltIns: Boolean defined in org.jetbrains.kotlin.resolve.lazy.createResolveSessionForFiles[ValueParameterDescriptorImpl]

'ResolverForProjectImpl' @ [39:30] ==> public constructor ResolverForProjectImpl<M : ModuleInfo>(debugName: String, projectContext: ProjectContext, modules: Collection<TestModule>, analyzerFacade: (TestModule) -> AnalyzerFacade, modulesContent: (TestModule) -> ModuleContent, platformParameters: PlatformAnalysisParameters, targetEnvironment: TargetEnvironment = ..., builtIns: KotlinBuiltIns = ..., delegateResolver: ResolverForProject<TestModule> = ..., packagePartProviderFactory: (TestModule, ModuleContent) -> PackagePartProvider = ..., firstDependency: TestModule? = ..., modulePlatforms: (TestModule) -> MultiTargetPlatform?, packageOracleFactory: PackageOracleFactory = ..., languageSettingsProvider: LanguageSettingsProvider = ..., invalidateOnOOCB: Boolean = ...) defined in org.jetbrains.kotlin.analyzer.ResolverForProjectImpl[DeserializedClassConstructorDescriptor]
Inferred types:
    <M : ModuleInfo> -> TestModule

'projectContext' @ [41:13] ==> val projectContext: ProjectContext defined in org.jetbrains.kotlin.resolve.lazy.createResolveSessionForFiles[LocalVariableDescriptor]

'listOf' @ [41:29] ==> public fun <T> listOf(element: TestModule): List<TestModule> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TestModule

'testModule' @ [41:36] ==> val testModule: TestModule defined in org.jetbrains.kotlin.resolve.lazy.createResolveSessionForFiles[LocalVariableDescriptor]

'JvmAnalyzerFacade' @ [41:51] ==> public object JvmAnalyzerFacade : AnalyzerFacade defined in org.jetbrains.kotlin.resolve.jvm[FakeCallableDescriptorForObject]

'ModuleContent' @ [42:15] ==> public constructor ModuleContent(syntheticFiles: Collection<KtFile>, moduleContentScope: GlobalSearchScope) defined in org.jetbrains.kotlin.analyzer.ModuleContent[DeserializedClassConstructorDescriptor]

'syntheticFiles' @ [42:29] ==> value-parameter syntheticFiles: Collection<KtFile> defined in org.jetbrains.kotlin.resolve.lazy.createResolveSessionForFiles[ValueParameterDescriptorImpl]

'allScope' @ [42:63] ==> @NotNull public open fun allScope(@NotNull p0: Project): GlobalSearchScope defined in com.intellij.psi.search.GlobalSearchScope[JavaMethodDescriptor]

'project' @ [42:72] ==> value-parameter project: Project defined in org.jetbrains.kotlin.resolve.lazy.createResolveSessionForFiles[ValueParameterDescriptorImpl]

'JvmPlatformParameters' @ [43:13] ==> public constructor JvmPlatformParameters(moduleByJavaClass: (JavaClass) -> ModuleInfo?) defined in org.jetbrains.kotlin.resolve.jvm.JvmPlatformParameters[DeserializedClassConstructorDescriptor]

'testModule' @ [43:37] ==> val testModule: TestModule defined in org.jetbrains.kotlin.resolve.lazy.createResolveSessionForFiles[LocalVariableDescriptor]

'MultiTargetPlatform' @ [44:33] ==> public companion object defined in org.jetbrains.kotlin.resolve.MultiTargetPlatform[FakeCallableDescriptorForObject]

'Specific' @ [44:53] ==> public constructor Specific(platform: String) defined in org.jetbrains.kotlin.resolve.MultiTargetPlatform.Specific[DeserializedClassConstructorDescriptor]

'resolverForProject' @ [46:12] ==> val resolverForProject: ResolverForProjectImpl<TestModule> defined in org.jetbrains.kotlin.resolve.lazy.createResolveSessionForFiles[LocalVariableDescriptor]

'resolverForModule' @ [46:31] ==> public final fun resolverForModule(moduleInfo: TestModule): ResolverForModule defined in org.jetbrains.kotlin.analyzer.ResolverForProjectImpl[DeserializedSimpleFunctionDescriptor]

'testModule' @ [46:49] ==> val testModule: TestModule defined in org.jetbrains.kotlin.resolve.lazy.createResolveSessionForFiles[LocalVariableDescriptor]

'componentProvider' @ [46:61] ==> public final val componentProvider: ComponentProvider defined in org.jetbrains.kotlin.analyzer.ResolverForModule[DeserializedPropertyDescriptor]

'get' @ [46:79] ==> public inline fun <reified T : Any> ComponentProvider.get(): ResolveSession defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> ResolveSession

'special' @ [50:36] ==> @NotNull public open fun special(@NotNull p0: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'listOf' @ [51:35] ==> public fun <T> listOf(element: TestModule): List<TestModule> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TestModule

'this' @ [51:42] ==> <this> defined in org.jetbrains.kotlin.resolve.lazy.TestModule[LazyClassReceiverParameterDescriptor]

'if (dependsOnBuiltIns)
                ModuleInfo.DependencyOnBuiltIns.LAST
            else
                ModuleInfo.DependencyOnBuiltIns.NONE' @ [53:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ModuleInfo.DependencyOnBuiltIns, elseBranch: ModuleInfo.DependencyOnBuiltIns): ModuleInfo.DependencyOnBuiltIns[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> DependencyOnBuiltIns

'dependsOnBuiltIns' @ [53:17] ==> public final val dependsOnBuiltIns: Boolean defined in org.jetbrains.kotlin.resolve.lazy.TestModule[PropertyDescriptorImpl]

'LAST' @ [54:49] ==> enum entry LAST defined in org.jetbrains.kotlin.analyzer.ModuleInfo.DependencyOnBuiltIns[FakeCallableDescriptorForObject]

'NONE' @ [56:49] ==> enum entry NONE defined in org.jetbrains.kotlin.analyzer.ModuleInfo.DependencyOnBuiltIns[FakeCallableDescriptorForObject]

