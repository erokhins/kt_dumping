'getModule' @ [31:22] ==> private final fun getModule(dataContext: DataContext): Module? defined in org.jetbrains.kotlin.console.actions.ConsoleModuleDialog[SimpleFunctionDescriptorImpl]

'dataContext' @ [31:32] ==> value-parameter dataContext: DataContext defined in org.jetbrains.kotlin.console.actions.ConsoleModuleDialog.showIfNeeded[ValueParameterDescriptorImpl]

'module' @ [32:13] ==> val module: Module? defined in org.jetbrains.kotlin.console.actions.ConsoleModuleDialog.showIfNeeded[LocalVariableDescriptor]

'runConsole' @ [32:36] ==> private final fun runConsole(module: Module): Unit defined in org.jetbrains.kotlin.console.actions.ConsoleModuleDialog[SimpleFunctionDescriptorImpl]

'module' @ [32:47] ==> val module: Module? defined in org.jetbrains.kotlin.console.actions.ConsoleModuleDialog.showIfNeeded[LocalVariableDescriptor]

'getInstance' @ [34:37] ==> public open fun getInstance(@NotNull p0: Project): (ModuleManager..ModuleManager?) defined in com.intellij.openapi.module.ModuleManager[JavaMethodDescriptor]

'project' @ [34:49] ==> private final val project: Project defined in org.jetbrains.kotlin.console.actions.ConsoleModuleDialog[PropertyDescriptorImpl]

'modules' @ [34:58] ==> public final val ModuleManager.modules: (Array<(Module..Module?)>..Array<out (Module..Module?)>)[MyPropertyDescriptor]

'modules' @ [36:13] ==> val modules: (Array<(Module..Module?)>..Array<out (Module..Module?)>) defined in org.jetbrains.kotlin.console.actions.ConsoleModuleDialog.showIfNeeded[LocalVariableDescriptor]

'isEmpty' @ [36:21] ==> @InlineOnly public inline fun <T> Array<out (Module..Module?)>.isEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.openapi.module.Module..com.intellij.openapi.module.Module?)

'errorNotification' @ [36:39] ==> public fun errorNotification(project: Project?, message: String): Unit defined in org.jetbrains.kotlin.console.actions in file RunExecuteActions.kt[SimpleFunctionDescriptorImpl]

'project' @ [36:57] ==> private final val project: Project defined in org.jetbrains.kotlin.console.actions.ConsoleModuleDialog[PropertyDescriptorImpl]

'modules' @ [37:13] ==> val modules: (Array<(Module..Module?)>..Array<out (Module..Module?)>) defined in org.jetbrains.kotlin.console.actions.ConsoleModuleDialog.showIfNeeded[LocalVariableDescriptor]

'size' @ [37:21] ==> public final val size: Int defined in kotlin.Array[DeserializedPropertyDescriptor]

'runConsole' @ [37:39] ==> private final fun runConsole(module: Module): Unit defined in org.jetbrains.kotlin.console.actions.ConsoleModuleDialog[SimpleFunctionDescriptorImpl]

'modules' @ [37:50] ==> val modules: (Array<(Module..Module?)>..Array<out (Module..Module?)>) defined in org.jetbrains.kotlin.console.actions.ConsoleModuleDialog.showIfNeeded[LocalVariableDescriptor]

'first' @ [37:58] ==> public fun <T> Array<out (Module..Module?)>.first(): (Module..Module?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.openapi.module.Module..com.intellij.openapi.module.Module?)

'modules' @ [39:29] ==> val modules: (Array<(Module..Module?)>..Array<out (Module..Module?)>) defined in org.jetbrains.kotlin.console.actions.ConsoleModuleDialog.showIfNeeded[LocalVariableDescriptor]

'sortedBy' @ [39:37] ==> public inline fun <T, R : Comparable<String>> Array<out (Module..Module?)>.sortedBy(crossinline selector: ((Module..Module?)) -> String?): List<(Module..Module?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.openapi.module.Module..com.intellij.openapi.module.Module?)
    <R : Comparable<R>> -> String

'it' @ [39:48] ==> value-parameter it: (Module..Module?) defined in org.jetbrains.kotlin.console.actions.ConsoleModuleDialog.showIfNeeded.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [39:51] ==> public final val Module.name: String[MyPropertyDescriptor]

'map' @ [39:58] ==> public inline fun <T, R> Iterable<(Module..Module?)>.map(transform: ((Module..Module?)) -> <no name provided>): List<<no name provided>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.openapi.module.Module..com.intellij.openapi.module.Module?)
    <R> -> <no name provided>

'createRunAction' @ [39:64] ==> private final fun createRunAction(module: Module): <no name provided> defined in org.jetbrains.kotlin.console.actions.ConsoleModuleDialog[SimpleFunctionDescriptorImpl]

'it' @ [39:80] ==> value-parameter it: (Module..Module?) defined in org.jetbrains.kotlin.console.actions.ConsoleModuleDialog.showIfNeeded.<anonymous>[ValueParameterDescriptorImpl]

'DefaultActionGroup' @ [40:27] ==> public constructor DefaultActionGroup(@NotNull p0: (MutableList<out (AnAction..AnAction?)>..List<(AnAction..AnAction?)>)) defined in com.intellij.openapi.actionSystem.DefaultActionGroup[JavaClassConstructorDescriptor]

'moduleActions' @ [40:46] ==> val moduleActions: List<<no name provided>> defined in org.jetbrains.kotlin.console.actions.ConsoleModuleDialog.showIfNeeded[LocalVariableDescriptor]

'getInstance' @ [42:42] ==> public open fun getInstance(): (JBPopupFactory..JBPopupFactory?) defined in com.intellij.openapi.ui.popup.JBPopupFactory[JavaMethodDescriptor]

'createActionGroupPopup' @ [42:56] ==> @NotNull public abstract fun createActionGroupPopup(@Nls p0: (String..String?), @NotNull p1: ActionGroup, @NotNull p2: DataContext, p3: (JBPopupFactory.ActionSelectionAid..JBPopupFactory.ActionSelectionAid?), p4: Boolean, @Nullable p5: String?): ListPopup defined in com.intellij.openapi.ui.popup.JBPopupFactory[JavaMethodDescriptor]

'TITLE' @ [43:17] ==> private final val TITLE: String defined in org.jetbrains.kotlin.console.actions.ConsoleModuleDialog[PropertyDescriptorImpl]

'moduleGroup' @ [43:24] ==> val moduleGroup: DefaultActionGroup defined in org.jetbrains.kotlin.console.actions.ConsoleModuleDialog.showIfNeeded[LocalVariableDescriptor]

'dataContext' @ [43:37] ==> value-parameter dataContext: DataContext defined in org.jetbrains.kotlin.console.actions.ConsoleModuleDialog.showIfNeeded[ValueParameterDescriptorImpl]

'SPEEDSEARCH' @ [43:84] ==> enum entry SPEEDSEARCH defined in com.intellij.openapi.ui.popup.JBPopupFactory.ActionSelectionAid[FakeCallableDescriptorForObject]

'UNKNOWN' @ [43:116] ==> public const final val UNKNOWN: String defined in com.intellij.openapi.actionSystem.ActionPlaces[JavaPropertyDescriptor]

'modulePopup' @ [46:9] ==> val modulePopup: ListPopup defined in org.jetbrains.kotlin.console.actions.ConsoleModuleDialog.showIfNeeded[LocalVariableDescriptor]

'showCenteredInCurrentWindow' @ [46:21] ==> public abstract fun showCenteredInCurrentWindow(@NotNull p0: Project): Unit defined in com.intellij.openapi.ui.popup.ListPopup[JavaMethodDescriptor]

'project' @ [46:49] ==> private final val project: Project defined in org.jetbrains.kotlin.console.actions.ConsoleModuleDialog[PropertyDescriptorImpl]

'?:' @ [50:20] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: VirtualFile?, right: VirtualFile): VirtualFile[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> VirtualFile

'VIRTUAL_FILE' @ [50:35] ==> public final val VIRTUAL_FILE: (DataKey<(VirtualFile..VirtualFile?)>..DataKey<(VirtualFile..VirtualFile?)>?) defined in com.intellij.openapi.actionSystem.CommonDataKeys[JavaPropertyDescriptor]

'getData' @ [50:48] ==> @Nullable public open fun getData(@NotNull p0: DataContext): VirtualFile? defined in com.intellij.openapi.actionSystem.DataKey[JavaMethodDescriptor]

'dataContext' @ [50:56] ==> value-parameter dataContext: DataContext defined in org.jetbrains.kotlin.console.actions.ConsoleModuleDialog.getModule[ValueParameterDescriptorImpl]

'findModuleForFile' @ [52:44] ==> @Nullable public open fun findModuleForFile(@NotNull p0: VirtualFile, @NotNull p1: Project): Module? defined in com.intellij.openapi.module.ModuleUtilCore[JavaMethodDescriptor]

'file' @ [52:62] ==> val file: VirtualFile defined in org.jetbrains.kotlin.console.actions.ConsoleModuleDialog.getModule[LocalVariableDescriptor]

'project' @ [52:68] ==> private final val project: Project defined in org.jetbrains.kotlin.console.actions.ConsoleModuleDialog[PropertyDescriptorImpl]

'moduleForFile' @ [53:13] ==> val moduleForFile: Module? defined in org.jetbrains.kotlin.console.actions.ConsoleModuleDialog.getModule[LocalVariableDescriptor]

'moduleForFile' @ [53:43] ==> val moduleForFile: Module? defined in org.jetbrains.kotlin.console.actions.ConsoleModuleDialog.getModule[LocalVariableDescriptor]

'KotlinConsoleKeeper' @ [59:9] ==> public companion object defined in org.jetbrains.kotlin.console.KotlinConsoleKeeper[FakeCallableDescriptorForObject]

'getInstance' @ [59:29] ==> @JvmStatic public final fun getInstance(project: Project): (KotlinConsoleKeeper..KotlinConsoleKeeper?) defined in org.jetbrains.kotlin.console.KotlinConsoleKeeper.Companion[SimpleFunctionDescriptorImpl]

'project' @ [59:41] ==> private final val project: Project defined in org.jetbrains.kotlin.console.actions.ConsoleModuleDialog[PropertyDescriptorImpl]

'run' @ [59:50] ==> public final fun run(module: Module, previousCompilationFailed: Boolean = ...): KotlinConsoleRunner? defined in org.jetbrains.kotlin.console.KotlinConsoleKeeper[SimpleFunctionDescriptorImpl]

'module' @ [59:54] ==> value-parameter module: Module defined in org.jetbrains.kotlin.console.actions.ConsoleModuleDialog.runConsole[ValueParameterDescriptorImpl]

'AnAction' @ [62:60] ==> public constructor AnAction(@Nullable p0: String?) defined in com.intellij.openapi.actionSystem.AnAction[JavaClassConstructorDescriptor]

'module' @ [62:69] ==> value-parameter module: Module defined in org.jetbrains.kotlin.console.actions.ConsoleModuleDialog.createRunAction[ValueParameterDescriptorImpl]

'name' @ [62:76] ==> public final val Module.name: String[MyPropertyDescriptor]

'runConsole' @ [63:58] ==> private final fun runConsole(module: Module): Unit defined in org.jetbrains.kotlin.console.actions.ConsoleModuleDialog[SimpleFunctionDescriptorImpl]

'module' @ [63:69] ==> value-parameter module: Module defined in org.jetbrains.kotlin.console.actions.ConsoleModuleDialog.createRunAction[ValueParameterDescriptorImpl]

