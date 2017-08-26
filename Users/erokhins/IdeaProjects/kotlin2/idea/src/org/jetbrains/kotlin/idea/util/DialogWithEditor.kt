'DialogWrapper' @ [37:5] ==> protected/*protected and package*/ constructor DialogWrapper(@Nullable p0: Project?, p1: Boolean) defined in com.intellij.openapi.ui.DialogWrapper[JavaClassConstructorDescriptor]

'project' @ [37:19] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.util.DialogWithEditor.<init>[ValueParameterDescriptorImpl]

'createEditor' @ [38:26] ==> private final fun createEditor(): Editor defined in org.jetbrains.kotlin.idea.util.DialogWithEditor[SimpleFunctionDescriptorImpl]

'init' @ [41:9] ==> protected final fun init(): Unit defined in org.jetbrains.kotlin.idea.util.DialogWithEditor[SimpleFunctionDescriptorImpl]

'setTitle' @ [42:9] ==> public open fun setTitle(@Nls p0: (String..String?)): Unit defined in org.jetbrains.kotlin.idea.util.DialogWithEditor[JavaMethodDescriptor]

'title' @ [42:18] ==> value-parameter title: String defined in org.jetbrains.kotlin.idea.util.DialogWithEditor.<init>[ValueParameterDescriptorImpl]

'super' @ [46:9] ==> <this> defined in org.jetbrains.kotlin.idea.util.DialogWithEditor[LazyClassReceiverParameterDescriptor]

'init' @ [46:15] ==> protected/*protected and package*/ open fun init(): Unit defined in com.intellij.openapi.ui.DialogWrapper[JavaMethodDescriptor]

'!!' @ [50:29] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: EditorFactory?): EditorFactory[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> EditorFactory

'getInstance' @ [50:43] ==> public open fun getInstance(): (EditorFactory..EditorFactory?) defined in com.intellij.openapi.editor.EditorFactory[JavaMethodDescriptor]

'LightVirtualFile' @ [51:27] ==> public constructor LightVirtualFile(@NotNull p0: String, p1: (FileType..FileType?), @NotNull p2: CharSequence) defined in com.intellij.testFramework.LightVirtualFile[JavaClassConstructorDescriptor]

'INSTANCE' @ [51:71] ==> public final val INSTANCE: (KotlinFileType..KotlinFileType?) defined in org.jetbrains.kotlin.idea.KotlinFileType[JavaPropertyDescriptor]

'initialText' @ [51:81] ==> public final val initialText: String defined in org.jetbrains.kotlin.idea.util.DialogWithEditor[PropertyDescriptorImpl]

'!!' @ [52:24] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: Document?): Document[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> Document

'getInstance' @ [52:44] ==> @NotNull public open fun getInstance(): FileDocumentManager defined in com.intellij.openapi.fileEditor.FileDocumentManager[JavaMethodDescriptor]

'getDocument' @ [52:58] ==> @Nullable public abstract fun getDocument(@NotNull p0: VirtualFile): Document? defined in com.intellij.openapi.fileEditor.FileDocumentManager[JavaMethodDescriptor]

'virtualFile' @ [52:70] ==> val virtualFile: LightVirtualFile defined in org.jetbrains.kotlin.idea.util.DialogWithEditor.createEditor[LocalVariableDescriptor]

'editorFactory' @ [54:22] ==> val editorFactory: EditorFactory defined in org.jetbrains.kotlin.idea.util.DialogWithEditor.createEditor[LocalVariableDescriptor]

'createEditor' @ [54:36] ==> public abstract fun createEditor(@NotNull p0: Document, p1: (Project..Project?), @NotNull p2: FileType, p3: Boolean): (Editor..Editor?) defined in com.intellij.openapi.editor.EditorFactory[JavaMethodDescriptor]

'document' @ [54:49] ==> val document: Document defined in org.jetbrains.kotlin.idea.util.DialogWithEditor.createEditor[LocalVariableDescriptor]

'project' @ [54:59] ==> public final val project: Project defined in org.jetbrains.kotlin.idea.util.DialogWithEditor[PropertyDescriptorImpl]

'INSTANCE' @ [54:83] ==> public final val INSTANCE: (KotlinFileType..KotlinFileType?) defined in org.jetbrains.kotlin.idea.KotlinFileType[JavaPropertyDescriptor]

'editor' @ [55:24] ==> val editor: (Editor..Editor?) defined in org.jetbrains.kotlin.idea.util.DialogWithEditor.createEditor[LocalVariableDescriptor]

'settings' @ [55:31] ==> public final val Editor.settings: EditorSettings[MyPropertyDescriptor]

'settings' @ [56:9] ==> val settings: EditorSettings defined in org.jetbrains.kotlin.idea.util.DialogWithEditor.createEditor[LocalVariableDescriptor]

'isVirtualSpace' @ [56:18] ==> public final var EditorSettings.isVirtualSpace: Boolean[MyPropertyDescriptor]

'settings' @ [57:9] ==> val settings: EditorSettings defined in org.jetbrains.kotlin.idea.util.DialogWithEditor.createEditor[LocalVariableDescriptor]

'isLineMarkerAreaShown' @ [57:18] ==> public final var EditorSettings.isLineMarkerAreaShown: Boolean[MyPropertyDescriptor]

'settings' @ [58:9] ==> val settings: EditorSettings defined in org.jetbrains.kotlin.idea.util.DialogWithEditor.createEditor[LocalVariableDescriptor]

'isFoldingOutlineShown' @ [58:18] ==> public final var EditorSettings.isFoldingOutlineShown: Boolean[MyPropertyDescriptor]

'settings' @ [59:9] ==> val settings: EditorSettings defined in org.jetbrains.kotlin.idea.util.DialogWithEditor.createEditor[LocalVariableDescriptor]

'isRightMarginShown' @ [59:18] ==> public final var EditorSettings.isRightMarginShown: Boolean[MyPropertyDescriptor]

'settings' @ [60:9] ==> val settings: EditorSettings defined in org.jetbrains.kotlin.idea.util.DialogWithEditor.createEditor[LocalVariableDescriptor]

'isAdditionalPageAtBottom' @ [60:18] ==> public final var EditorSettings.isAdditionalPageAtBottom: Boolean[MyPropertyDescriptor]

'settings' @ [61:9] ==> val settings: EditorSettings defined in org.jetbrains.kotlin.idea.util.DialogWithEditor.createEditor[LocalVariableDescriptor]

'additionalLinesCount' @ [61:18] ==> public final var EditorSettings.additionalLinesCount: Int[MyPropertyDescriptor]

'settings' @ [62:9] ==> val settings: EditorSettings defined in org.jetbrains.kotlin.idea.util.DialogWithEditor.createEditor[LocalVariableDescriptor]

'additionalColumnsCount' @ [62:18] ==> public final var EditorSettings.additionalColumnsCount: Int[MyPropertyDescriptor]

'assert' @ [64:9] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'editor' @ [64:16] ==> val editor: (Editor..Editor?) defined in org.jetbrains.kotlin.idea.util.DialogWithEditor.createEditor[LocalVariableDescriptor]

'editor' @ [65:10] ==> val editor: (Editor..Editor?) defined in org.jetbrains.kotlin.idea.util.DialogWithEditor.createEditor[LocalVariableDescriptor]

'isEmbeddedIntoDialogWrapper' @ [65:30] ==> public final var EditorEx.isEmbeddedIntoDialogWrapper: Boolean[MyPropertyDescriptor]

'editor' @ [67:9] ==> val editor: (Editor..Editor?) defined in org.jetbrains.kotlin.idea.util.DialogWithEditor.createEditor[LocalVariableDescriptor]

'getColorsScheme' @ [67:16] ==> @NotNull public abstract fun getColorsScheme(): EditorColorsScheme defined in com.intellij.openapi.editor.Editor[JavaMethodDescriptor]

'setColor' @ [67:34] ==> public abstract fun setColor(p0: (ColorKey..ColorKey?), p1: (Color..Color?)): Unit defined in com.intellij.openapi.editor.colors.EditorColorsScheme[JavaMethodDescriptor]

'CARET_ROW_COLOR' @ [67:56] ==> public final val CARET_ROW_COLOR: (ColorKey..ColorKey?) defined in com.intellij.openapi.editor.colors.EditorColors[JavaPropertyDescriptor]

'editor' @ [67:73] ==> val editor: (Editor..Editor?) defined in org.jetbrains.kotlin.idea.util.DialogWithEditor.createEditor[LocalVariableDescriptor]

'getColorsScheme' @ [67:80] ==> @NotNull public abstract fun getColorsScheme(): EditorColorsScheme defined in com.intellij.openapi.editor.Editor[JavaMethodDescriptor]

'defaultBackground' @ [67:98] ==> public final val EditorColorsScheme.defaultBackground: Color[MyPropertyDescriptor]

'editor' @ [69:16] ==> val editor: (Editor..Editor?) defined in org.jetbrains.kotlin.idea.util.DialogWithEditor.createEditor[LocalVariableDescriptor]

'JPanel' @ [73:21] ==> public constructor JPanel(p0: (LayoutManager..LayoutManager?)) defined in javax.swing.JPanel[JavaClassConstructorDescriptor]

'BorderLayout' @ [73:28] ==> public constructor BorderLayout() defined in java.awt.BorderLayout[JavaClassConstructorDescriptor]

'panel' @ [74:9] ==> val panel: JPanel defined in org.jetbrains.kotlin.idea.util.DialogWithEditor.createCenterPanel[LocalVariableDescriptor]

'add' @ [74:15] ==> public open fun add(p0: (Component..Component?), p1: (Any..Any?)): Unit defined in javax.swing.JPanel[JavaMethodDescriptor]

'editor' @ [74:19] ==> public final val editor: Editor defined in org.jetbrains.kotlin.idea.util.DialogWithEditor[PropertyDescriptorImpl]

'component' @ [74:26] ==> public final val Editor.component: JComponent[MyPropertyDescriptor]

'CENTER' @ [74:50] ==> public const final val CENTER: String defined in java.awt.BorderLayout[JavaPropertyDescriptor]

'panel' @ [75:16] ==> val panel: JPanel defined in org.jetbrains.kotlin.idea.util.DialogWithEditor.createCenterPanel[LocalVariableDescriptor]

'editor' @ [79:16] ==> public final val editor: Editor defined in org.jetbrains.kotlin.idea.util.DialogWithEditor[PropertyDescriptorImpl]

'contentComponent' @ [79:23] ==> public final val Editor.contentComponent: JComponent[MyPropertyDescriptor]

'super' @ [83:9] ==> <this> defined in org.jetbrains.kotlin.idea.util.DialogWithEditor[LazyClassReceiverParameterDescriptor]

'dispose' @ [83:15] ==> protected/*protected and package*/ open fun dispose(): Unit defined in com.intellij.openapi.ui.DialogWrapper[JavaMethodDescriptor]

'!!' @ [84:9] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: EditorFactory?): EditorFactory[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> EditorFactory

'getInstance' @ [84:23] ==> public open fun getInstance(): (EditorFactory..EditorFactory?) defined in com.intellij.openapi.editor.EditorFactory[JavaMethodDescriptor]

'releaseEditor' @ [84:39] ==> public abstract fun releaseEditor(@NotNull p0: Editor): Unit defined in com.intellij.openapi.editor.EditorFactory[JavaMethodDescriptor]

'editor' @ [84:53] ==> public final val editor: Editor defined in org.jetbrains.kotlin.idea.util.DialogWithEditor[PropertyDescriptorImpl]

