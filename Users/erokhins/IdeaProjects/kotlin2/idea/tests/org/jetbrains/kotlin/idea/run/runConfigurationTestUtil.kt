'configuration' @ [36:17] ==> value-parameter configuration: RunConfiguration defined in org.jetbrains.kotlin.idea.run.getJavaRunParameters[ValueParameterDescriptorImpl]

'getState' @ [36:31] ==> @Nullable public abstract fun getState(@NotNull p0: Executor, @NotNull p1: ExecutionEnvironment): RunProfileState? defined in com.intellij.execution.configurations.RunConfiguration[JavaMethodDescriptor]

'MockExecutor' @ [36:40] ==> private object MockExecutor : DefaultRunExecutor defined in org.jetbrains.kotlin.idea.run in file runConfigurationTestUtil.kt[FakeCallableDescriptorForObject]

'create' @ [36:82] ==> @NotNull public open fun create(@NotNull p0: Project, @NotNull p1: Executor, @NotNull p2: RunProfile): ExecutionEnvironmentBuilder defined in com.intellij.execution.runners.ExecutionEnvironmentBuilder[JavaMethodDescriptor]

'configuration' @ [36:89] ==> value-parameter configuration: RunConfiguration defined in org.jetbrains.kotlin.idea.run.getJavaRunParameters[ValueParameterDescriptorImpl]

'project' @ [36:103] ==> public final val RunConfiguration.project: (Project..Project?)[MyPropertyDescriptor]

'MockExecutor' @ [36:112] ==> private object MockExecutor : DefaultRunExecutor defined in org.jetbrains.kotlin.idea.run in file runConfigurationTestUtil.kt[FakeCallableDescriptorForObject]

'MockProfile' @ [36:126] ==> private object MockProfile : RunProfile defined in org.jetbrains.kotlin.idea.run in file runConfigurationTestUtil.kt[FakeCallableDescriptorForObject]

'build' @ [36:139] ==> @NotNull public open fun build(): ExecutionEnvironment defined in com.intellij.execution.runners.ExecutionEnvironmentBuilder[JavaMethodDescriptor]

'assertNotNull' @ [38:12] ==> public open fun assertNotNull(p0: (Any..Any?)): Unit defined in org.junit.Assert[JavaMethodDescriptor]

'state' @ [38:26] ==> val state: RunProfileState? defined in org.jetbrains.kotlin.idea.run.getJavaRunParameters[LocalVariableDescriptor]

'assertTrue' @ [39:12] ==> public open fun assertTrue(p0: Boolean): Unit defined in org.junit.Assert[JavaMethodDescriptor]

'state' @ [39:23] ==> val state: RunProfileState? defined in org.jetbrains.kotlin.idea.run.getJavaRunParameters[LocalVariableDescriptor]

'configuration' @ [41:5] ==> value-parameter configuration: RunConfiguration defined in org.jetbrains.kotlin.idea.run.getJavaRunParameters[ValueParameterDescriptorImpl]

'checkConfiguration' @ [41:19] ==> public open fun checkConfiguration(): Unit defined in com.intellij.execution.configurations.RunConfiguration[JavaMethodDescriptor]

'!!' @ [42:12] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: JavaParameters?): JavaParameters[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> JavaParameters

'state' @ [42:13] ==> val state: RunProfileState? defined in org.jetbrains.kotlin.idea.run.getJavaRunParameters[LocalVariableDescriptor]

'javaParameters' @ [42:39] ==> public final val JavaCommandLine.javaParameters: (JavaParameters..JavaParameters?)[MyPropertyDescriptor]

'MapDataContext' @ [46:23] ==> public constructor MapDataContext() defined in com.intellij.testFramework.MapDataContext[JavaClassConstructorDescriptor]

'dataContext' @ [47:5] ==> val dataContext: MapDataContext defined in org.jetbrains.kotlin.idea.run.createConfigurationFromElement[LocalVariableDescriptor]

'put' @ [47:17] ==> public open fun <T : (Any..Any?)> put(@NotNull p0: DataKey<(Location<*>..Location<*>?)>, p1: (Location<*>..Location<*>?)): Unit defined in com.intellij.testFramework.MapDataContext[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (com.intellij.execution.Location<*>..com.intellij.execution.Location<*>?)

'DATA_KEY' @ [47:30] ==> public final val DATA_KEY: (DataKey<(Location<*>..Location<*>?)>..DataKey<(Location<*>..Location<*>?)>?) defined in com.intellij.execution.Location[JavaPropertyDescriptor]

'PsiLocation' @ [47:40] ==> public constructor PsiLocation<E : (PsiElement..PsiElement?)>(@NotNull p0: Project, @NotNull p1: PsiElement) defined in com.intellij.execution.PsiLocation[JavaClassConstructorDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> PsiElement

'element' @ [47:52] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.run.createConfigurationFromElement[ValueParameterDescriptorImpl]

'project' @ [47:60] ==> public final val PsiElement.project: Project[MyPropertyDescriptor]

'element' @ [47:69] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.run.createConfigurationFromElement[ValueParameterDescriptorImpl]

'getFromContext' @ [49:63] ==> @NotNull public open fun getFromContext(p0: (DataContext..DataContext?)): ConfigurationContext defined in com.intellij.execution.actions.ConfigurationContext[JavaMethodDescriptor]

'dataContext' @ [49:78] ==> val dataContext: MapDataContext defined in org.jetbrains.kotlin.idea.run.createConfigurationFromElement[LocalVariableDescriptor]

'configuration' @ [49:91] ==> public final val ConfigurationContext.configuration: RunnerAndConfigurationSettings?[MyPropertyDescriptor]

'save' @ [50:9] ==> value-parameter save: Boolean = ... defined in org.jetbrains.kotlin.idea.run.createConfigurationFromElement[ValueParameterDescriptorImpl]

'getInstanceEx' @ [51:22] ==> @NotNull public open fun getInstanceEx(@NotNull p0: Project): RunManagerEx defined in com.intellij.execution.RunManagerEx[JavaMethodDescriptor]

'element' @ [51:36] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.run.createConfigurationFromElement[ValueParameterDescriptorImpl]

'project' @ [51:44] ==> public final val PsiElement.project: Project[MyPropertyDescriptor]

'setTemporaryConfiguration' @ [51:53] ==> public abstract fun setTemporaryConfiguration(tempConfiguration: RunnerAndConfigurationSettings?): Unit defined in com.intellij.execution.RunManagerEx[DeserializedSimpleFunctionDescriptor]

'runnerAndConfigurationSettings' @ [51:79] ==> val runnerAndConfigurationSettings: RunnerAndConfigurationSettings? defined in org.jetbrains.kotlin.idea.run.createConfigurationFromElement[LocalVariableDescriptor]

'runnerAndConfigurationSettings' @ [53:12] ==> val runnerAndConfigurationSettings: RunnerAndConfigurationSettings? defined in org.jetbrains.kotlin.idea.run.createConfigurationFromElement[LocalVariableDescriptor]

'configuration' @ [53:45] ==> public final val RunnerAndConfigurationSettings.configuration: RunConfiguration[MyPropertyDescriptor]

'DefaultRunExecutor' @ [57:31] ==> public constructor DefaultRunExecutor() defined in com.intellij.execution.executors.DefaultRunExecutor[JavaClassConstructorDescriptor]

'EXECUTOR_ID' @ [58:47] ==> @NonNls public const final val EXECUTOR_ID: (String..String?) defined in com.intellij.execution.executors.DefaultRunExecutor[JavaPropertyDescriptor]

