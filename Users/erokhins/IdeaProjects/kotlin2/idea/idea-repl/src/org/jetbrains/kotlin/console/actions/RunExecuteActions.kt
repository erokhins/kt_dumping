'notify' @ [34:23] ==> public open fun notify(@NotNull p0: Notification, @Nullable p1: Project?): Unit defined in com.intellij.notification.Notifications.Bus[JavaMethodDescriptor]

'Notification' @ [34:30] ==> public constructor Notification(@NotNull p0: String, @NotNull p1: String, @NotNull p2: String, @NotNull p3: NotificationType) defined in com.intellij.notification.Notification[JavaClassConstructorDescriptor]

'errorTag' @ [34:43] ==> val errorTag: String defined in org.jetbrains.kotlin.console.actions.errorNotification[LocalVariableDescriptor]

'errorTitle' @ [34:53] ==> val errorTitle: String defined in org.jetbrains.kotlin.console.actions.errorNotification[LocalVariableDescriptor]

'message' @ [34:65] ==> value-parameter message: String defined in org.jetbrains.kotlin.console.actions.errorNotification[ValueParameterDescriptorImpl]

'ERROR' @ [34:91] ==> enum entry ERROR defined in com.intellij.notification.NotificationType[FakeCallableDescriptorForObject]

'project' @ [34:99] ==> value-parameter project: Project? defined in org.jetbrains.kotlin.console.actions.errorNotification[ValueParameterDescriptorImpl]

'with' @ [37:47] ==> @InlineOnly public inline fun <T, R> with(receiver: Logger, block: (Logger).() -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Logger
    <R> -> Unit

'getInstance' @ [37:59] ==> @NotNull public open fun getInstance(@NotNull p0: raw (Class<(Any..Any?)>..Class<*>)): Logger defined in com.intellij.openapi.diagnostic.Logger[JavaMethodDescriptor]

'cl' @ [37:71] ==> value-parameter cl: Class<*> defined in org.jetbrains.kotlin.console.actions.logError[ValueParameterDescriptorImpl]

'error' @ [37:78] ==> public open fun error(@NonNls p0: (String..String?)): Unit defined in com.intellij.openapi.diagnostic.Logger[JavaMethodDescriptor]

'message' @ [37:84] ==> value-parameter message: String defined in org.jetbrains.kotlin.console.actions.logError[ValueParameterDescriptorImpl]

'AnAction' @ [39:32] ==> public constructor AnAction() defined in com.intellij.openapi.actionSystem.AnAction[JavaClassConstructorDescriptor]

'e' @ [41:23] ==> value-parameter e: AnActionEvent defined in org.jetbrains.kotlin.console.actions.RunKotlinConsoleAction.actionPerformed[ValueParameterDescriptorImpl]

'project' @ [41:25] ==> public final val AnActionEvent.project: Project?[MyPropertyDescriptor]

'errorNotification' @ [41:43] ==> public fun errorNotification(project: Project?, message: String): Unit defined in org.jetbrains.kotlin.console.actions in file RunExecuteActions.kt[SimpleFunctionDescriptorImpl]

'ConsoleModuleDialog' @ [43:9] ==> public constructor ConsoleModuleDialog(project: Project) defined in org.jetbrains.kotlin.console.actions.ConsoleModuleDialog[ClassConstructorDescriptorImpl]

'project' @ [43:29] ==> val project: Project defined in org.jetbrains.kotlin.console.actions.RunKotlinConsoleAction.actionPerformed[LocalVariableDescriptor]

'showIfNeeded' @ [43:38] ==> public final fun showIfNeeded(dataContext: DataContext): Unit defined in org.jetbrains.kotlin.console.actions.ConsoleModuleDialog[SimpleFunctionDescriptorImpl]

'e' @ [43:51] ==> value-parameter e: AnActionEvent defined in org.jetbrains.kotlin.console.actions.RunKotlinConsoleAction.actionPerformed[ValueParameterDescriptorImpl]

'dataContext' @ [43:53] ==> public final val AnActionEvent.dataContext: DataContext[MyPropertyDescriptor]

'AnAction' @ [47:70] ==> public constructor AnAction() defined in com.intellij.openapi.actionSystem.AnAction[JavaClassConstructorDescriptor]

'e' @ [49:23] ==> value-parameter e: AnActionEvent defined in org.jetbrains.kotlin.console.actions.KtExecuteCommandAction.actionPerformed[ValueParameterDescriptorImpl]

'project' @ [49:25] ==> public final val AnActionEvent.project: Project?[MyPropertyDescriptor]

'errorNotification' @ [49:43] ==> public fun errorNotification(project: Project?, message: String): Unit defined in org.jetbrains.kotlin.console.actions in file RunExecuteActions.kt[SimpleFunctionDescriptorImpl]

'KotlinConsoleKeeper' @ [50:25] ==> public companion object defined in org.jetbrains.kotlin.console.KotlinConsoleKeeper[FakeCallableDescriptorForObject]

'getInstance' @ [50:45] ==> @JvmStatic public final fun getInstance(project: Project): (KotlinConsoleKeeper..KotlinConsoleKeeper?) defined in org.jetbrains.kotlin.console.KotlinConsoleKeeper.Companion[SimpleFunctionDescriptorImpl]

'project' @ [50:57] ==> val project: Project defined in org.jetbrains.kotlin.console.actions.KtExecuteCommandAction.actionPerformed[LocalVariableDescriptor]

'getConsoleByVirtualFile' @ [50:66] ==> public final fun getConsoleByVirtualFile(virtualFile: VirtualFile): KotlinConsoleRunner? defined in org.jetbrains.kotlin.console.KotlinConsoleKeeper[SimpleFunctionDescriptorImpl]

'consoleFile' @ [50:90] ==> private final val consoleFile: VirtualFile defined in org.jetbrains.kotlin.console.actions.KtExecuteCommandAction[PropertyDescriptorImpl]

'ktConsole' @ [52:9] ==> val ktConsole: KotlinConsoleRunner defined in org.jetbrains.kotlin.console.actions.KtExecuteCommandAction.actionPerformed[LocalVariableDescriptor]

'executor' @ [52:19] ==> public final val executor: CommandExecutor defined in org.jetbrains.kotlin.console.KotlinConsoleRunner[PropertyDescriptorImpl]

'executeCommand' @ [52:28] ==> public final fun executeCommand(): Unit defined in org.jetbrains.kotlin.console.CommandExecutor[SimpleFunctionDescriptorImpl]

'AnAction' @ [58:5] ==> public constructor AnAction(@Nullable p0: String?, @Nullable p1: String?, @Nullable p2: Icon?) defined in com.intellij.openapi.actionSystem.AnAction[JavaClassConstructorDescriptor]

'runner' @ [58:52] ==> value-parameter runner: KotlinConsoleRunner defined in org.jetbrains.kotlin.console.actions.BuildAndRestartConsoleAction.<init>[ValueParameterDescriptorImpl]

'module' @ [58:59] ==> public final val module: Module defined in org.jetbrains.kotlin.console.KotlinConsoleRunner[PropertyDescriptorImpl]

'name' @ [58:66] ==> public final val Module.name: String[MyPropertyDescriptor]

'Restart' @ [58:104] ==> public final val Restart: (Icon..Icon?) defined in com.intellij.icons.AllIcons.Actions[JavaPropertyDescriptor]

'runner' @ [60:54] ==> private final val runner: KotlinConsoleRunner defined in org.jetbrains.kotlin.console.actions.BuildAndRestartConsoleAction[PropertyDescriptorImpl]

'compilerHelper' @ [60:61] ==> public final var compilerHelper: ConsoleCompilerHelper defined in org.jetbrains.kotlin.console.KotlinConsoleRunner[PropertyDescriptorImpl]

'compileModule' @ [60:76] ==> public final fun compileModule(): Unit defined in org.jetbrains.kotlin.console.ConsoleCompilerHelper[SimpleFunctionDescriptorImpl]

