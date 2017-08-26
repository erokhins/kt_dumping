'UsageContextPanelBase' @ [48:5] ==> public constructor UsageContextPanelBase(@NotNull p0: Project, @NotNull p1: UsageViewPresentation) defined in com.intellij.usages.impl.UsageContextPanelBase[JavaClassConstructorDescriptor]

'project' @ [48:27] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.slicer.KotlinUsageContextDataFlowPanelBase.<init>[ValueParameterDescriptorImpl]

'presentation' @ [48:36] ==> value-parameter presentation: UsageViewPresentation defined in org.jetbrains.kotlin.idea.slicer.KotlinUsageContextDataFlowPanelBase.<init>[ValueParameterDescriptorImpl]

'?:' @ [53:26] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: UsageTarget?, right: UsageTarget): UsageTarget[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> UsageTarget

'usageView' @ [53:27] ==> value-parameter usageView: UsageView defined in org.jetbrains.kotlin.idea.slicer.KotlinUsageContextDataFlowPanelBase.ProviderBase.isAvailableFor[ValueParameterDescriptorImpl]

'targets' @ [53:55] ==> public final val UsageViewImpl.targets: (Array<(UsageTarget..UsageTarget?)>..Array<out (UsageTarget..UsageTarget?)>)[MyPropertyDescriptor]

'firstOrNull' @ [53:63] ==> public fun <T> Array<out (UsageTarget..UsageTarget?)>.firstOrNull(): UsageTarget? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.usages.UsageTarget..com.intellij.usages.UsageTarget?)

'target' @ [54:28] ==> val target: UsageTarget defined in org.jetbrains.kotlin.idea.slicer.KotlinUsageContextDataFlowPanelBase.ProviderBase.isAvailableFor[LocalVariableDescriptor]

'element' @ [54:63] ==> public final val PsiElementUsageTarget.element: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'element' @ [55:20] ==> val element: PsiElement? defined in org.jetbrains.kotlin.idea.slicer.KotlinUsageContextDataFlowPanelBase.ProviderBase.isAvailableFor[LocalVariableDescriptor]

'element' @ [55:48] ==> val element: PsiElement? defined in org.jetbrains.kotlin.idea.slicer.KotlinUsageContextDataFlowPanelBase.ProviderBase.isAvailableFor[LocalVariableDescriptor]

'isValid' @ [55:56] ==> public final val KtDeclaration.isValid: Boolean[MyPropertyDescriptor]

'SliceAnalysisParams' @ [60:16] ==> public constructor SliceAnalysisParams() defined in com.intellij.slicer.SliceAnalysisParams[JavaClassConstructorDescriptor]

'apply' @ [60:38] ==> @InlineOnly public inline fun <T> SliceAnalysisParams.apply(block: SliceAnalysisParams.() -> Unit): SliceAnalysisParams defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SliceAnalysisParams

'scope' @ [61:13] ==> public final var scope: (AnalysisScope..AnalysisScope?) defined in com.intellij.slicer.SliceAnalysisParams[JavaPropertyDescriptor]

'AnalysisScope' @ [61:21] ==> public constructor AnalysisScope(@NotNull p0: Project) defined in com.intellij.analysis.AnalysisScope[JavaClassConstructorDescriptor]

'element' @ [61:35] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.slicer.KotlinUsageContextDataFlowPanelBase.createParams[ValueParameterDescriptorImpl]

'project' @ [61:43] ==> public final val PsiElement.project: Project[MyPropertyDescriptor]

'dataFlowToThis' @ [62:13] ==> public final var dataFlowToThis: Boolean defined in com.intellij.slicer.SliceAnalysisParams[JavaPropertyDescriptor]

'isInflow' @ [62:30] ==> private final val isInflow: Boolean defined in org.jetbrains.kotlin.idea.slicer.KotlinUsageContextDataFlowPanelBase[PropertyDescriptorImpl]

'showInstanceDereferences' @ [63:13] ==> public final var showInstanceDereferences: Boolean defined in com.intellij.slicer.SliceAnalysisParams[JavaPropertyDescriptor]

'getInstance' @ [68:44] ==> public open fun getInstance(@NotNull p0: Project): (ToolWindowManager..ToolWindowManager?) defined in com.intellij.openapi.wm.ToolWindowManager[JavaMethodDescriptor]

'myProject' @ [68:56] ==> protected/*protected and package*/ final val myProject: (Project..Project?) defined in org.jetbrains.kotlin.idea.slicer.KotlinUsageContextDataFlowPanelBase[JavaPropertyDescriptor]

'getToolWindow' @ [68:67] ==> public abstract fun getToolWindow(p0: (String..String?)): (ToolWindow..ToolWindow?) defined in com.intellij.openapi.wm.ToolWindowManager[JavaMethodDescriptor]

'FIND' @ [68:94] ==> public const final val FIND: (String..String?) defined in com.intellij.openapi.wm.ToolWindowId[JavaPropertyDescriptor]

'createParams' @ [69:22] ==> private final fun createParams(element: PsiElement): SliceAnalysisParams defined in org.jetbrains.kotlin.idea.slicer.KotlinUsageContextDataFlowPanelBase[SimpleFunctionDescriptorImpl]

'element' @ [69:35] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.slicer.KotlinUsageContextDataFlowPanelBase.createPanel[ValueParameterDescriptorImpl]

'SliceRootNode' @ [71:24] ==> public constructor SliceRootNode(@NotNull p0: Project, @NotNull p1: DuplicateMap, @NotNull p2: SliceUsage) defined in com.intellij.slicer.SliceRootNode[JavaClassConstructorDescriptor]

'myProject' @ [71:38] ==> protected/*protected and package*/ final val myProject: (Project..Project?) defined in org.jetbrains.kotlin.idea.slicer.KotlinUsageContextDataFlowPanelBase[JavaPropertyDescriptor]

'DuplicateMap' @ [71:49] ==> public constructor DuplicateMap() defined in com.intellij.slicer.DuplicateMap[JavaClassConstructorDescriptor]

'KotlinSliceUsage' @ [71:65] ==> public constructor KotlinSliceUsage(element: PsiElement, params: SliceAnalysisParams) defined in org.jetbrains.kotlin.idea.slicer.KotlinSliceUsage[ClassConstructorDescriptorImpl]

'element' @ [71:82] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.slicer.KotlinUsageContextDataFlowPanelBase.createPanel[ValueParameterDescriptorImpl]

'params' @ [71:91] ==> val params: SliceAnalysisParams defined in org.jetbrains.kotlin.idea.slicer.KotlinUsageContextDataFlowPanelBase.createPanel[LocalVariableDescriptor]

'SlicePanel' @ [73:25] ==> protected/*protected and package*/ constructor SlicePanel(@NotNull p0: Project, p1: Boolean, @NotNull p2: SliceNode, p3: Boolean, @NotNull p4: ToolWindow) defined in com.intellij.slicer.SlicePanel[JavaClassConstructorDescriptor]

'myProject' @ [73:36] ==> protected/*protected and package*/ final val myProject: (Project..Project?) defined in org.jetbrains.kotlin.idea.slicer.KotlinUsageContextDataFlowPanelBase[JavaPropertyDescriptor]

'dataFlowToThis' @ [73:47] ==> value-parameter dataFlowToThis: Boolean defined in org.jetbrains.kotlin.idea.slicer.KotlinUsageContextDataFlowPanelBase.createPanel[ValueParameterDescriptorImpl]

'rootNode' @ [73:63] ==> val rootNode: SliceRootNode defined in org.jetbrains.kotlin.idea.slicer.KotlinUsageContextDataFlowPanelBase.createPanel[LocalVariableDescriptor]

'toolWindow' @ [73:80] ==> val toolWindow: (ToolWindow..ToolWindow?) defined in org.jetbrains.kotlin.idea.slicer.KotlinUsageContextDataFlowPanelBase.createPanel[LocalVariableDescriptor]

'if (infos == null) {
            removeAll()
            val title = UsageViewBundle.message("select.the.usage.to.preview", myPresentation.usagesWord)
            add(JLabel(title, SwingConstants.CENTER), BorderLayout.CENTER)
        }
        else {
            val element = infos.firstOrNull()?.element ?: return
            if (panel != null) {
                Disposer.dispose(panel as Disposable)
            }

            val panel = createPanel(element, isInflow)
            Disposer.register(this, panel as Disposable)
            removeAll()
            add(panel, BorderLayout.CENTER)
            this.panel = panel
        }' @ [91:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'infos' @ [91:13] ==> value-parameter infos: List<UsageInfo>? defined in org.jetbrains.kotlin.idea.slicer.KotlinUsageContextDataFlowPanelBase.updateLayoutLater[ValueParameterDescriptorImpl]

'removeAll' @ [92:13] ==> public open fun removeAll(): Unit defined in org.jetbrains.kotlin.idea.slicer.KotlinUsageContextDataFlowPanelBase[JavaMethodDescriptor]

'message' @ [93:41] ==> public open fun message(@NotNull @PropertyKey p0: String, @NotNull vararg p1: (Any..Any?)): (String..String?) defined in com.intellij.usageView.UsageViewBundle[JavaMethodDescriptor]

'myPresentation' @ [93:80] ==> @NotNull protected/*protected and package*/ final val myPresentation: UsageViewPresentation defined in org.jetbrains.kotlin.idea.slicer.KotlinUsageContextDataFlowPanelBase[JavaPropertyDescriptor]

'usagesWord' @ [93:95] ==> public final var UsageViewPresentation.usagesWord: String[MyPropertyDescriptor]

'add' @ [94:13] ==> public open fun add(p0: (Component..Component?), p1: (Any..Any?)): Unit defined in org.jetbrains.kotlin.idea.slicer.KotlinUsageContextDataFlowPanelBase[JavaMethodDescriptor]

'JLabel' @ [94:17] ==> public constructor JLabel(p0: (String..String?), p1: Int) defined in javax.swing.JLabel[JavaClassConstructorDescriptor]

'title' @ [94:24] ==> val title: (String..String?) defined in org.jetbrains.kotlin.idea.slicer.KotlinUsageContextDataFlowPanelBase.updateLayoutLater[LocalVariableDescriptor]

'CENTER' @ [94:46] ==> public const final val CENTER: Int defined in javax.swing.SwingConstants[JavaPropertyDescriptor]

'CENTER' @ [94:68] ==> public const final val CENTER: String defined in java.awt.BorderLayout[JavaPropertyDescriptor]

'infos' @ [97:27] ==> value-parameter infos: List<UsageInfo>? defined in org.jetbrains.kotlin.idea.slicer.KotlinUsageContextDataFlowPanelBase.updateLayoutLater[ValueParameterDescriptorImpl]

'firstOrNull' @ [97:33] ==> public fun <T> List<UsageInfo>.firstOrNull(): UsageInfo? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UsageInfo

'element' @ [97:48] ==> public final val UsageInfo.element: PsiElement?[MyPropertyDescriptor]

'panel' @ [98:17] ==> private final var panel: JPanel? defined in org.jetbrains.kotlin.idea.slicer.KotlinUsageContextDataFlowPanelBase[PropertyDescriptorImpl]

'dispose' @ [99:26] ==> public open fun dispose(@NotNull p0: Disposable): Unit defined in com.intellij.openapi.util.Disposer[JavaMethodDescriptor]

'panel' @ [99:34] ==> private final var panel: JPanel? defined in org.jetbrains.kotlin.idea.slicer.KotlinUsageContextDataFlowPanelBase[PropertyDescriptorImpl]

'createPanel' @ [102:25] ==> protected final fun createPanel(element: PsiElement, dataFlowToThis: Boolean): JPanel defined in org.jetbrains.kotlin.idea.slicer.KotlinUsageContextDataFlowPanelBase[SimpleFunctionDescriptorImpl]

'element' @ [102:37] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.slicer.KotlinUsageContextDataFlowPanelBase.updateLayoutLater[LocalVariableDescriptor]

'isInflow' @ [102:46] ==> private final val isInflow: Boolean defined in org.jetbrains.kotlin.idea.slicer.KotlinUsageContextDataFlowPanelBase[PropertyDescriptorImpl]

'register' @ [103:22] ==> public open fun register(@NotNull p0: Disposable, @NotNull p1: Disposable): Unit defined in com.intellij.openapi.util.Disposer[JavaMethodDescriptor]

'this' @ [103:31] ==> <this> defined in org.jetbrains.kotlin.idea.slicer.KotlinUsageContextDataFlowPanelBase[LazyClassReceiverParameterDescriptor]

'panel' @ [103:37] ==> val panel: JPanel defined in org.jetbrains.kotlin.idea.slicer.KotlinUsageContextDataFlowPanelBase.updateLayoutLater[LocalVariableDescriptor]

'removeAll' @ [104:13] ==> public open fun removeAll(): Unit defined in org.jetbrains.kotlin.idea.slicer.KotlinUsageContextDataFlowPanelBase[JavaMethodDescriptor]

'add' @ [105:13] ==> public open fun add(p0: (Component..Component?), p1: (Any..Any?)): Unit defined in org.jetbrains.kotlin.idea.slicer.KotlinUsageContextDataFlowPanelBase[JavaMethodDescriptor]

'panel' @ [105:17] ==> val panel: JPanel defined in org.jetbrains.kotlin.idea.slicer.KotlinUsageContextDataFlowPanelBase.updateLayoutLater[LocalVariableDescriptor]

'CENTER' @ [105:37] ==> public const final val CENTER: String defined in java.awt.BorderLayout[JavaPropertyDescriptor]

'this' @ [106:13] ==> <this> defined in org.jetbrains.kotlin.idea.slicer.KotlinUsageContextDataFlowPanelBase[LazyClassReceiverParameterDescriptor]

'panel' @ [106:18] ==> private final var panel: JPanel? defined in org.jetbrains.kotlin.idea.slicer.KotlinUsageContextDataFlowPanelBase[PropertyDescriptorImpl]

'panel' @ [106:26] ==> val panel: JPanel defined in org.jetbrains.kotlin.idea.slicer.KotlinUsageContextDataFlowPanelBase.updateLayoutLater[LocalVariableDescriptor]

'revalidate' @ [108:9] ==> public open fun revalidate(): Unit defined in org.jetbrains.kotlin.idea.slicer.KotlinUsageContextDataFlowPanelBase[JavaMethodDescriptor]

'super' @ [112:9] ==> <this> defined in org.jetbrains.kotlin.idea.slicer.KotlinUsageContextDataFlowPanelBase[LazyClassReceiverParameterDescriptor]

'dispose' @ [112:15] ==> public open fun dispose(): Unit defined in com.intellij.usages.impl.UsageContextPanelBase[JavaMethodDescriptor]

'panel' @ [113:9] ==> private final var panel: JPanel? defined in org.jetbrains.kotlin.idea.slicer.KotlinUsageContextDataFlowPanelBase[PropertyDescriptorImpl]

'KotlinUsageContextDataFlowPanelBase' @ [120:5] ==> private constructor KotlinUsageContextDataFlowPanelBase(project: Project, presentation: UsageViewPresentation, isInflow: Boolean) defined in org.jetbrains.kotlin.idea.slicer.KotlinUsageContextDataFlowPanelBase[ClassConstructorDescriptorImpl]

'project' @ [120:41] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.slicer.KotlinUsageContextDataInflowPanel.<init>[ValueParameterDescriptorImpl]

'presentation' @ [120:50] ==> value-parameter presentation: UsageViewPresentation defined in org.jetbrains.kotlin.idea.slicer.KotlinUsageContextDataInflowPanel.<init>[ValueParameterDescriptorImpl]

'ProviderBase' @ [121:22] ==> public constructor ProviderBase() defined in org.jetbrains.kotlin.idea.slicer.KotlinUsageContextDataFlowPanelBase.ProviderBase[ClassConstructorDescriptorImpl]

'KotlinUsageContextDataInflowPanel' @ [123:20] ==> public constructor KotlinUsageContextDataInflowPanel(project: Project, presentation: UsageViewPresentation) defined in org.jetbrains.kotlin.idea.slicer.KotlinUsageContextDataInflowPanel[ClassConstructorDescriptorImpl]

'usageView' @ [123:55] ==> value-parameter usageView: UsageView defined in org.jetbrains.kotlin.idea.slicer.KotlinUsageContextDataInflowPanel.Provider.create[ValueParameterDescriptorImpl]

'project' @ [123:83] ==> public final val UsageViewImpl.project: Project[MyPropertyDescriptor]

'usageView' @ [123:92] ==> value-parameter usageView: UsageView defined in org.jetbrains.kotlin.idea.slicer.KotlinUsageContextDataInflowPanel.Provider.create[ValueParameterDescriptorImpl]

'getPresentation' @ [123:102] ==> @NotNull public abstract fun getPresentation(): UsageViewPresentation defined in com.intellij.usages.UsageView[JavaMethodDescriptor]

'KotlinUsageContextDataFlowPanelBase' @ [133:5] ==> private constructor KotlinUsageContextDataFlowPanelBase(project: Project, presentation: UsageViewPresentation, isInflow: Boolean) defined in org.jetbrains.kotlin.idea.slicer.KotlinUsageContextDataFlowPanelBase[ClassConstructorDescriptorImpl]

'project' @ [133:41] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.slicer.KotlinUsageContextDataOutflowPanel.<init>[ValueParameterDescriptorImpl]

'presentation' @ [133:50] ==> value-parameter presentation: UsageViewPresentation defined in org.jetbrains.kotlin.idea.slicer.KotlinUsageContextDataOutflowPanel.<init>[ValueParameterDescriptorImpl]

'ProviderBase' @ [134:22] ==> public constructor ProviderBase() defined in org.jetbrains.kotlin.idea.slicer.KotlinUsageContextDataFlowPanelBase.ProviderBase[ClassConstructorDescriptorImpl]

'KotlinUsageContextDataOutflowPanel' @ [136:20] ==> public constructor KotlinUsageContextDataOutflowPanel(project: Project, presentation: UsageViewPresentation) defined in org.jetbrains.kotlin.idea.slicer.KotlinUsageContextDataOutflowPanel[ClassConstructorDescriptorImpl]

'usageView' @ [136:56] ==> value-parameter usageView: UsageView defined in org.jetbrains.kotlin.idea.slicer.KotlinUsageContextDataOutflowPanel.Provider.create[ValueParameterDescriptorImpl]

'project' @ [136:84] ==> public final val UsageViewImpl.project: Project[MyPropertyDescriptor]

'usageView' @ [136:93] ==> value-parameter usageView: UsageView defined in org.jetbrains.kotlin.idea.slicer.KotlinUsageContextDataOutflowPanel.Provider.create[ValueParameterDescriptorImpl]

'getPresentation' @ [136:103] ==> @NotNull public abstract fun getPresentation(): UsageViewPresentation defined in com.intellij.usages.UsageView[JavaMethodDescriptor]

