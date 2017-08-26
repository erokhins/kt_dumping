'HyperlinkInfoBase' @ [35:5] ==> public constructor HyperlinkInfoBase() defined in com.intellij.execution.filters.HyperlinkInfoBase[JavaClassConstructorDescriptor]

'inlineInfo' @ [38:13] ==> private final val inlineInfo: List<InlineFunctionHyperLinkInfo.InlineInfo> defined in org.jetbrains.kotlin.idea.filters.InlineFunctionHyperLinkInfo[PropertyDescriptorImpl]

'isEmpty' @ [38:24] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'if (inlineInfo.size == 1) {
            OpenFileHyperlinkInfo(project, inlineInfo.first().file, inlineInfo.first().line).navigate(project)
        }
        else {
            val list = JBList(inlineInfo)
            list.cellRenderer = InlineInfoCellRenderer()
            val popup = JBPopupFactory.getInstance().createListPopupBuilder(list)
                    .setTitle("Navigate to")
                    .setItemChoosenCallback {
                        val fileInfo = list.selectedValue as InlineInfo
                        OpenFileHyperlinkInfo(project, fileInfo.file, fileInfo.line).navigate(project)
                    }
                    .createPopup()

            if (hyperlinkLocationPoint != null) {
                popup.show(hyperlinkLocationPoint)
            }
            else {
                popup.showInFocusCenter()
            }
        }' @ [40:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'inlineInfo' @ [40:13] ==> private final val inlineInfo: List<InlineFunctionHyperLinkInfo.InlineInfo> defined in org.jetbrains.kotlin.idea.filters.InlineFunctionHyperLinkInfo[PropertyDescriptorImpl]

'size' @ [40:24] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'OpenFileHyperlinkInfo' @ [41:13] ==> public constructor OpenFileHyperlinkInfo(@NotNull p0: Project, @NotNull p1: VirtualFile, p2: Int) defined in com.intellij.execution.filters.OpenFileHyperlinkInfo[JavaClassConstructorDescriptor]

'project' @ [41:35] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.filters.InlineFunctionHyperLinkInfo.navigate[ValueParameterDescriptorImpl]

'inlineInfo' @ [41:44] ==> private final val inlineInfo: List<InlineFunctionHyperLinkInfo.InlineInfo> defined in org.jetbrains.kotlin.idea.filters.InlineFunctionHyperLinkInfo[PropertyDescriptorImpl]

'first' @ [41:55] ==> public fun <T> List<InlineFunctionHyperLinkInfo.InlineInfo>.first(): InlineFunctionHyperLinkInfo.InlineInfo defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> InlineInfo

'file' @ [41:63] ==> public final val file: VirtualFile defined in org.jetbrains.kotlin.idea.filters.InlineFunctionHyperLinkInfo.InlineInfo[PropertyDescriptorImpl]

'inlineInfo' @ [41:69] ==> private final val inlineInfo: List<InlineFunctionHyperLinkInfo.InlineInfo> defined in org.jetbrains.kotlin.idea.filters.InlineFunctionHyperLinkInfo[PropertyDescriptorImpl]

'first' @ [41:80] ==> public fun <T> List<InlineFunctionHyperLinkInfo.InlineInfo>.first(): InlineFunctionHyperLinkInfo.InlineInfo defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> InlineInfo

'line' @ [41:88] ==> public final val line: Int defined in org.jetbrains.kotlin.idea.filters.InlineFunctionHyperLinkInfo.InlineInfo[PropertyDescriptorImpl]

'navigate' @ [41:94] ==> public open fun navigate(project: Project?): Unit defined in com.intellij.execution.filters.OpenFileHyperlinkInfo[DeserializedSimpleFunctionDescriptor]

'project' @ [41:103] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.filters.InlineFunctionHyperLinkInfo.navigate[ValueParameterDescriptorImpl]

'JBList' @ [44:24] ==> public constructor JBList<E : (Any..Any?)>(@NotNull p0: (MutableCollection<(InlineFunctionHyperLinkInfo.InlineInfo..InlineFunctionHyperLinkInfo.InlineInfo?)>..Collection<(InlineFunctionHyperLinkInfo.InlineInfo..InlineFunctionHyperLinkInfo.InlineInfo?)>)) defined in com.intellij.ui.components.JBList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> InlineInfo

'inlineInfo' @ [44:31] ==> private final val inlineInfo: List<InlineFunctionHyperLinkInfo.InlineInfo> defined in org.jetbrains.kotlin.idea.filters.InlineFunctionHyperLinkInfo[PropertyDescriptorImpl]

'list' @ [45:13] ==> val list: JBList<InlineFunctionHyperLinkInfo.InlineInfo> defined in org.jetbrains.kotlin.idea.filters.InlineFunctionHyperLinkInfo.navigate[LocalVariableDescriptor]

'cellRenderer' @ [45:18] ==> public final var <E : (Any..Any?)> JBList<InlineFunctionHyperLinkInfo.InlineInfo>.cellRenderer: (ListCellRenderer<in (InlineFunctionHyperLinkInfo.InlineInfo..InlineFunctionHyperLinkInfo.InlineInfo?)>..ListCellRenderer<in (InlineFunctionHyperLinkInfo.InlineInfo..InlineFunctionHyperLinkInfo.InlineInfo?)>?)[MyPropertyDescriptor]
Inferred types:
    <E : (Any..Any?)> -> InlineInfo

'InlineInfoCellRenderer' @ [45:33] ==> public constructor InlineInfoCellRenderer() defined in org.jetbrains.kotlin.idea.filters.InlineFunctionHyperLinkInfo.InlineInfoCellRenderer[ClassConstructorDescriptorImpl]

'getInstance' @ [46:40] ==> public open fun getInstance(): (JBPopupFactory..JBPopupFactory?) defined in com.intellij.openapi.ui.popup.JBPopupFactory[JavaMethodDescriptor]

'createListPopupBuilder' @ [46:54] ==> @NotNull public open fun createListPopupBuilder(@NotNull p0: raw (JList<(Any..Any?)>..JList<*>)): PopupChooserBuilder defined in com.intellij.openapi.ui.popup.JBPopupFactory[JavaMethodDescriptor]

'list' @ [46:77] ==> val list: JBList<InlineFunctionHyperLinkInfo.InlineInfo> defined in org.jetbrains.kotlin.idea.filters.InlineFunctionHyperLinkInfo.navigate[LocalVariableDescriptor]

'setTitle' @ [47:22] ==> @NotNull public open fun setTitle(@NotNull @Nls p0: String): PopupChooserBuilder defined in com.intellij.openapi.ui.popup.PopupChooserBuilder[JavaMethodDescriptor]

'setItemChoosenCallback' @ [48:22] ==> @NotNull public final fun setItemChoosenCallback(@NotNull p0: () -> Unit): PopupChooserBuilder defined in com.intellij.openapi.ui.popup.PopupChooserBuilder[MyFunctionDescriptor]

'list' @ [49:40] ==> val list: JBList<InlineFunctionHyperLinkInfo.InlineInfo> defined in org.jetbrains.kotlin.idea.filters.InlineFunctionHyperLinkInfo.navigate[LocalVariableDescriptor]

'selectedValue' @ [49:45] ==> public final val <E : (Any..Any?)> JBList<InlineFunctionHyperLinkInfo.InlineInfo>.selectedValue: (InlineFunctionHyperLinkInfo.InlineInfo..InlineFunctionHyperLinkInfo.InlineInfo?)[MyPropertyDescriptor]
Inferred types:
    <E : (Any..Any?)> -> InlineInfo

'OpenFileHyperlinkInfo' @ [50:25] ==> public constructor OpenFileHyperlinkInfo(@NotNull p0: Project, @NotNull p1: VirtualFile, p2: Int) defined in com.intellij.execution.filters.OpenFileHyperlinkInfo[JavaClassConstructorDescriptor]

'project' @ [50:47] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.filters.InlineFunctionHyperLinkInfo.navigate[ValueParameterDescriptorImpl]

'fileInfo' @ [50:56] ==> val fileInfo: InlineFunctionHyperLinkInfo.InlineInfo defined in org.jetbrains.kotlin.idea.filters.InlineFunctionHyperLinkInfo.navigate.<anonymous>[LocalVariableDescriptor]

'file' @ [50:65] ==> public final val file: VirtualFile defined in org.jetbrains.kotlin.idea.filters.InlineFunctionHyperLinkInfo.InlineInfo[PropertyDescriptorImpl]

'fileInfo' @ [50:71] ==> val fileInfo: InlineFunctionHyperLinkInfo.InlineInfo defined in org.jetbrains.kotlin.idea.filters.InlineFunctionHyperLinkInfo.navigate.<anonymous>[LocalVariableDescriptor]

'line' @ [50:80] ==> public final val line: Int defined in org.jetbrains.kotlin.idea.filters.InlineFunctionHyperLinkInfo.InlineInfo[PropertyDescriptorImpl]

'navigate' @ [50:86] ==> public open fun navigate(project: Project?): Unit defined in com.intellij.execution.filters.OpenFileHyperlinkInfo[DeserializedSimpleFunctionDescriptor]

'project' @ [50:95] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.filters.InlineFunctionHyperLinkInfo.navigate[ValueParameterDescriptorImpl]

'createPopup' @ [52:22] ==> @NotNull public open fun createPopup(): JBPopup defined in com.intellij.openapi.ui.popup.PopupChooserBuilder[JavaMethodDescriptor]

'if (hyperlinkLocationPoint != null) {
                popup.show(hyperlinkLocationPoint)
            }
            else {
                popup.showInFocusCenter()
            }' @ [54:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'hyperlinkLocationPoint' @ [54:17] ==> value-parameter hyperlinkLocationPoint: RelativePoint? defined in org.jetbrains.kotlin.idea.filters.InlineFunctionHyperLinkInfo.navigate[ValueParameterDescriptorImpl]

'popup' @ [55:17] ==> val popup: JBPopup defined in org.jetbrains.kotlin.idea.filters.InlineFunctionHyperLinkInfo.navigate[LocalVariableDescriptor]

'show' @ [55:23] ==> public abstract fun show(@NotNull p0: RelativePoint): Unit defined in com.intellij.openapi.ui.popup.JBPopup[JavaMethodDescriptor]

'hyperlinkLocationPoint' @ [55:28] ==> value-parameter hyperlinkLocationPoint: RelativePoint? defined in org.jetbrains.kotlin.idea.filters.InlineFunctionHyperLinkInfo.navigate[ValueParameterDescriptorImpl]

'popup' @ [58:17] ==> val popup: JBPopup defined in org.jetbrains.kotlin.idea.filters.InlineFunctionHyperLinkInfo.navigate[LocalVariableDescriptor]

'showInFocusCenter' @ [58:23] ==> public abstract fun showInFocusCenter(): Unit defined in com.intellij.openapi.ui.popup.JBPopup[JavaMethodDescriptor]

'inlineInfo' @ [64:20] ==> private final val inlineInfo: List<InlineFunctionHyperLinkInfo.InlineInfo> defined in org.jetbrains.kotlin.idea.filters.InlineFunctionHyperLinkInfo[PropertyDescriptorImpl]

'firstOrNull' @ [64:31] ==> public fun <T> List<InlineFunctionHyperLinkInfo.InlineInfo>.firstOrNull(): InlineFunctionHyperLinkInfo.InlineInfo? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> InlineInfo

'file' @ [65:16] ==> val file: InlineFunctionHyperLinkInfo.InlineInfo? defined in org.jetbrains.kotlin.idea.filters.InlineFunctionHyperLinkInfo.getDescriptor[LocalVariableDescriptor]

'let' @ [65:22] ==> @InlineOnly public inline fun <T, R> InlineFunctionHyperLinkInfo.InlineInfo.let(block: (InlineFunctionHyperLinkInfo.InlineInfo) -> OpenFileDescriptor): OpenFileDescriptor defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> InlineInfo
    <R> -> OpenFileDescriptor

'OpenFileDescriptor' @ [65:28] ==> public constructor OpenFileDescriptor(@NotNull p0: Project, @NotNull p1: VirtualFile, p2: Int, p3: Int) defined in com.intellij.openapi.fileEditor.OpenFileDescriptor[JavaClassConstructorDescriptor]

'project' @ [65:47] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.filters.InlineFunctionHyperLinkInfo[PropertyDescriptorImpl]

'file' @ [65:56] ==> val file: InlineFunctionHyperLinkInfo.InlineInfo? defined in org.jetbrains.kotlin.idea.filters.InlineFunctionHyperLinkInfo.getDescriptor[LocalVariableDescriptor]

'file' @ [65:61] ==> public final val file: VirtualFile defined in org.jetbrains.kotlin.idea.filters.InlineFunctionHyperLinkInfo.InlineInfo[PropertyDescriptorImpl]

'file' @ [65:67] ==> val file: InlineFunctionHyperLinkInfo.InlineInfo? defined in org.jetbrains.kotlin.idea.filters.InlineFunctionHyperLinkInfo.getDescriptor[LocalVariableDescriptor]

'line' @ [65:72] ==> public final val line: Int defined in org.jetbrains.kotlin.idea.filters.InlineFunctionHyperLinkInfo.InlineInfo[PropertyDescriptorImpl]

'InlineInfo' @ [69:59] ==> private constructor InlineInfo(prefix: String, file: VirtualFile, line: Int) defined in org.jetbrains.kotlin.idea.filters.InlineFunctionHyperLinkInfo.InlineInfo[ClassConstructorDescriptorImpl]

'file' @ [69:99] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.idea.filters.InlineFunctionHyperLinkInfo.InlineInfo.CallSiteInfo.<init>[ValueParameterDescriptorImpl]

'line' @ [69:105] ==> value-parameter line: Int defined in org.jetbrains.kotlin.idea.filters.InlineFunctionHyperLinkInfo.InlineInfo.CallSiteInfo.<init>[ValueParameterDescriptorImpl]

'InlineInfo' @ [70:69] ==> private constructor InlineInfo(prefix: String, file: VirtualFile, line: Int) defined in org.jetbrains.kotlin.idea.filters.InlineFunctionHyperLinkInfo.InlineInfo[ClassConstructorDescriptorImpl]

'file' @ [70:104] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.idea.filters.InlineFunctionHyperLinkInfo.InlineInfo.InlineFunctionBodyInfo.<init>[ValueParameterDescriptorImpl]

'line' @ [70:110] ==> value-parameter line: Int defined in org.jetbrains.kotlin.idea.filters.InlineFunctionHyperLinkInfo.InlineInfo.InlineFunctionBodyInfo.<init>[ValueParameterDescriptorImpl]

'SimpleColoredComponent' @ [73:44] ==> public constructor SimpleColoredComponent() defined in com.intellij.ui.SimpleColoredComponent[JavaClassConstructorDescriptor]

'isOpaque' @ [75:13] ==> public final var InlineFunctionHyperLinkInfo.InlineInfoCellRenderer.isOpaque: Boolean[MyPropertyDescriptor]

'clear' @ [86:13] ==> public open fun clear(): Unit defined in org.jetbrains.kotlin.idea.filters.InlineFunctionHyperLinkInfo.InlineInfoCellRenderer[JavaMethodDescriptor]

'value' @ [88:17] ==> value-parameter value: InlineFunctionHyperLinkInfo.InlineInfo? defined in org.jetbrains.kotlin.idea.filters.InlineFunctionHyperLinkInfo.InlineInfoCellRenderer.getListCellRendererComponent[ValueParameterDescriptorImpl]

'append' @ [89:17] ==> @NotNull public final fun append(@NotNull p0: String): SimpleColoredComponent defined in org.jetbrains.kotlin.idea.filters.InlineFunctionHyperLinkInfo.InlineInfoCellRenderer[JavaMethodDescriptor]

'value' @ [89:24] ==> value-parameter value: InlineFunctionHyperLinkInfo.InlineInfo? defined in org.jetbrains.kotlin.idea.filters.InlineFunctionHyperLinkInfo.InlineInfoCellRenderer.getListCellRendererComponent[ValueParameterDescriptorImpl]

'prefix' @ [89:30] ==> public final val prefix: String defined in org.jetbrains.kotlin.idea.filters.InlineFunctionHyperLinkInfo.InlineInfo[PropertyDescriptorImpl]

'if (isSelected) {
                background = list?.selectionBackground
                foreground = list?.selectionForeground
            }
            else {
                background = list?.background
                foreground = list?.foreground
            }' @ [92:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'isSelected' @ [92:17] ==> value-parameter isSelected: Boolean defined in org.jetbrains.kotlin.idea.filters.InlineFunctionHyperLinkInfo.InlineInfoCellRenderer.getListCellRendererComponent[ValueParameterDescriptorImpl]

'background' @ [93:17] ==> public final var InlineFunctionHyperLinkInfo.InlineInfoCellRenderer.background: (Color..Color?)[MyPropertyDescriptor]

'list' @ [93:30] ==> value-parameter list: JList<out InlineFunctionHyperLinkInfo.InlineInfo>? defined in org.jetbrains.kotlin.idea.filters.InlineFunctionHyperLinkInfo.InlineInfoCellRenderer.getListCellRendererComponent[ValueParameterDescriptorImpl]

'selectionBackground' @ [93:36] ==> public final var <E : (Any..Any?)> JList<out InlineFunctionHyperLinkInfo.InlineInfo>.selectionBackground: (Color..Color?)[MyPropertyDescriptor]
Inferred types:
    <E : (Any..Any?)> -> InlineInfo

'foreground' @ [94:17] ==> public final var InlineFunctionHyperLinkInfo.InlineInfoCellRenderer.foreground: (Color..Color?)[MyPropertyDescriptor]

'list' @ [94:30] ==> value-parameter list: JList<out InlineFunctionHyperLinkInfo.InlineInfo>? defined in org.jetbrains.kotlin.idea.filters.InlineFunctionHyperLinkInfo.InlineInfoCellRenderer.getListCellRendererComponent[ValueParameterDescriptorImpl]

'selectionForeground' @ [94:36] ==> public final var <E : (Any..Any?)> JList<out InlineFunctionHyperLinkInfo.InlineInfo>.selectionForeground: (Color..Color?)[MyPropertyDescriptor]
Inferred types:
    <E : (Any..Any?)> -> InlineInfo

'background' @ [97:17] ==> public final var InlineFunctionHyperLinkInfo.InlineInfoCellRenderer.background: (Color..Color?)[MyPropertyDescriptor]

'list' @ [97:30] ==> value-parameter list: JList<out InlineFunctionHyperLinkInfo.InlineInfo>? defined in org.jetbrains.kotlin.idea.filters.InlineFunctionHyperLinkInfo.InlineInfoCellRenderer.getListCellRendererComponent[ValueParameterDescriptorImpl]

'background' @ [97:36] ==> public final var <E : (Any..Any?)> JList<out InlineFunctionHyperLinkInfo.InlineInfo>.background: (Color..Color?)[MyPropertyDescriptor]
Inferred types:
    <E : (Any..Any?)> -> InlineInfo

'foreground' @ [98:17] ==> public final var InlineFunctionHyperLinkInfo.InlineInfoCellRenderer.foreground: (Color..Color?)[MyPropertyDescriptor]

'list' @ [98:30] ==> value-parameter list: JList<out InlineFunctionHyperLinkInfo.InlineInfo>? defined in org.jetbrains.kotlin.idea.filters.InlineFunctionHyperLinkInfo.InlineInfoCellRenderer.getListCellRendererComponent[ValueParameterDescriptorImpl]

'foreground' @ [98:36] ==> public final var <E : (Any..Any?)> JList<out InlineFunctionHyperLinkInfo.InlineInfo>.foreground: (Color..Color?)[MyPropertyDescriptor]
Inferred types:
    <E : (Any..Any?)> -> InlineInfo

'this' @ [101:20] ==> <this> defined in org.jetbrains.kotlin.idea.filters.InlineFunctionHyperLinkInfo.InlineInfoCellRenderer[LazyClassReceiverParameterDescriptor]

