'AnAction' @ [29:34] ==> public constructor AnAction() defined in com.intellij.openapi.actionSystem.AnAction[JavaClassConstructorDescriptor]

'e' @ [33:23] ==> value-parameter e: AnActionEvent defined in org.jetbrains.kotlin.idea.actions.ShowKotlinBytecodeAction.actionPerformed[ValueParameterDescriptorImpl]

'project' @ [33:25] ==> public final val AnActionEvent.project: Project?[MyPropertyDescriptor]

'getInstance' @ [34:51] ==> public open fun getInstance(@NotNull p0: Project): (ToolWindowManager..ToolWindowManager?) defined in com.intellij.openapi.wm.ToolWindowManager[JavaMethodDescriptor]

'project' @ [34:63] ==> val project: Project defined in org.jetbrains.kotlin.idea.actions.ShowKotlinBytecodeAction.actionPerformed[LocalVariableDescriptor]

'toolWindowManager' @ [36:26] ==> val toolWindowManager: (ToolWindowManager..ToolWindowManager?) defined in org.jetbrains.kotlin.idea.actions.ShowKotlinBytecodeAction.actionPerformed[LocalVariableDescriptor]

'getToolWindow' @ [36:44] ==> public abstract fun getToolWindow(p0: (String..String?)): (ToolWindow..ToolWindow?) defined in com.intellij.openapi.wm.ToolWindowManager[JavaMethodDescriptor]

'TOOLWINDOW_ID' @ [36:58] ==> public final val TOOLWINDOW_ID: String defined in org.jetbrains.kotlin.idea.actions.ShowKotlinBytecodeAction[PropertyDescriptorImpl]

'toolWindow' @ [37:13] ==> var toolWindow: (ToolWindow..ToolWindow?) defined in org.jetbrains.kotlin.idea.actions.ShowKotlinBytecodeAction.actionPerformed[LocalVariableDescriptor]

'toolWindow' @ [38:13] ==> var toolWindow: (ToolWindow..ToolWindow?) defined in org.jetbrains.kotlin.idea.actions.ShowKotlinBytecodeAction.actionPerformed[LocalVariableDescriptor]

'toolWindowManager' @ [38:26] ==> val toolWindowManager: (ToolWindowManager..ToolWindowManager?) defined in org.jetbrains.kotlin.idea.actions.ShowKotlinBytecodeAction.actionPerformed[LocalVariableDescriptor]

'registerToolWindow' @ [38:44] ==> @NotNull public abstract fun registerToolWindow(@NotNull p0: String, p1: Boolean, @NotNull p2: ToolWindowAnchor): ToolWindow defined in com.intellij.openapi.wm.ToolWindowManager[JavaMethodDescriptor]

'RIGHT' @ [38:106] ==> public final val RIGHT: (ToolWindowAnchor..ToolWindowAnchor?) defined in com.intellij.openapi.wm.ToolWindowAnchor[JavaPropertyDescriptor]

'toolWindow' @ [39:13] ==> var toolWindow: (ToolWindow..ToolWindow?) defined in org.jetbrains.kotlin.idea.actions.ShowKotlinBytecodeAction.actionPerformed[LocalVariableDescriptor]

'icon' @ [39:24] ==> public final var ToolWindow.icon: (Icon..Icon?)[MyPropertyDescriptor]

'SMALL_LOGO_13' @ [39:43] ==> public final val SMALL_LOGO_13: (Icon..Icon?) defined in org.jetbrains.kotlin.idea.KotlinIcons[JavaPropertyDescriptor]

'toolWindow' @ [41:34] ==> var toolWindow: (ToolWindow..ToolWindow?) defined in org.jetbrains.kotlin.idea.actions.ShowKotlinBytecodeAction.actionPerformed[LocalVariableDescriptor]

'contentManager' @ [41:45] ==> public final val ToolWindow.contentManager: (ContentManager..ContentManager?)[MyPropertyDescriptor]

'getInstance' @ [42:57] ==> public open fun getInstance(): (ContentFactory..ContentFactory?) defined in com.intellij.ui.content.ContentFactory.SERVICE[JavaMethodDescriptor]

'contentManager' @ [43:13] ==> val contentManager: (ContentManager..ContentManager?) defined in org.jetbrains.kotlin.idea.actions.ShowKotlinBytecodeAction.actionPerformed[LocalVariableDescriptor]

'addContent' @ [43:28] ==> public abstract fun addContent(@NotNull p0: Content): Unit defined in com.intellij.ui.content.ContentManager[JavaMethodDescriptor]

'contentFactory' @ [43:39] ==> val contentFactory: (ContentFactory..ContentFactory?) defined in org.jetbrains.kotlin.idea.actions.ShowKotlinBytecodeAction.actionPerformed[LocalVariableDescriptor]

'createContent' @ [43:54] ==> @NotNull public abstract fun createContent(p0: (JComponent..JComponent?), p1: (String..String?), p2: Boolean): Content defined in com.intellij.ui.content.ContentFactory[JavaMethodDescriptor]

'KotlinBytecodeToolWindow' @ [43:68] ==> public constructor KotlinBytecodeToolWindow(project: (Project..Project?), toolWindow: (ToolWindow..ToolWindow?)) defined in org.jetbrains.kotlin.idea.internal.KotlinBytecodeToolWindow[JavaClassConstructorDescriptor]

'project' @ [43:93] ==> val project: Project defined in org.jetbrains.kotlin.idea.actions.ShowKotlinBytecodeAction.actionPerformed[LocalVariableDescriptor]

'toolWindow' @ [43:102] ==> var toolWindow: (ToolWindow..ToolWindow?) defined in org.jetbrains.kotlin.idea.actions.ShowKotlinBytecodeAction.actionPerformed[LocalVariableDescriptor]

'toolWindow' @ [45:9] ==> var toolWindow: (ToolWindow..ToolWindow?) defined in org.jetbrains.kotlin.idea.actions.ShowKotlinBytecodeAction.actionPerformed[LocalVariableDescriptor]

'activate' @ [45:20] ==> public abstract fun activate(@Nullable p0: Runnable?): Unit defined in com.intellij.openapi.wm.ToolWindow[JavaMethodDescriptor]

'e' @ [49:20] ==> value-parameter e: AnActionEvent defined in org.jetbrains.kotlin.idea.actions.ShowKotlinBytecodeAction.update[ValueParameterDescriptorImpl]

'getData' @ [49:22] ==> @Nullable public open fun <T : (Any..Any?)> getData(@NotNull p0: DataKey<(PsiFile..PsiFile?)>): PsiFile? defined in com.intellij.openapi.actionSystem.AnActionEvent[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> PsiFile

'PSI_FILE' @ [49:45] ==> public final val PSI_FILE: (DataKey<(PsiFile..PsiFile?)>..DataKey<(PsiFile..PsiFile?)>?) defined in com.intellij.openapi.actionSystem.CommonDataKeys[JavaPropertyDescriptor]

'e' @ [50:9] ==> value-parameter e: AnActionEvent defined in org.jetbrains.kotlin.idea.actions.ShowKotlinBytecodeAction.update[ValueParameterDescriptorImpl]

'presentation' @ [50:11] ==> public final val AnActionEvent.presentation: Presentation[MyPropertyDescriptor]

'isEnabled' @ [50:24] ==> public final var Presentation.isEnabled: Boolean[MyPropertyDescriptor]

'e' @ [50:36] ==> value-parameter e: AnActionEvent defined in org.jetbrains.kotlin.idea.actions.ShowKotlinBytecodeAction.update[ValueParameterDescriptorImpl]

'project' @ [50:38] ==> public final val AnActionEvent.project: Project?[MyPropertyDescriptor]

'file' @ [50:57] ==> val file: PsiFile? defined in org.jetbrains.kotlin.idea.actions.ShowKotlinBytecodeAction.update[LocalVariableDescriptor]

'fileType' @ [50:63] ==> public final val PsiFile.fileType: FileType[MyPropertyDescriptor]

'INSTANCE' @ [50:90] ==> public final val INSTANCE: (KotlinFileType..KotlinFileType?) defined in org.jetbrains.kotlin.idea.KotlinFileType[JavaPropertyDescriptor]

