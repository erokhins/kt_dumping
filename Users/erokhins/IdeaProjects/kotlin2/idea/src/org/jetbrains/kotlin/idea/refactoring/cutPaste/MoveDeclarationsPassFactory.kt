'AbstractProjectComponent' @ [36:7] ==> protected/*protected and package*/ constructor AbstractProjectComponent(p0: (Project..Project?)) defined in com.intellij.openapi.components.AbstractProjectComponent[JavaClassConstructorDescriptor]

'project' @ [36:32] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.cutPaste.MoveDeclarationsPassFactory.<init>[ValueParameterDescriptorImpl]

'highlightingPassRegistrar' @ [39:9] ==> value-parameter highlightingPassRegistrar: TextEditorHighlightingPassRegistrar defined in org.jetbrains.kotlin.idea.refactoring.cutPaste.MoveDeclarationsPassFactory.<init>[ValueParameterDescriptorImpl]

'registerTextEditorHighlightingPass' @ [39:35] ==> public open fun registerTextEditorHighlightingPass(p0: (TextEditorHighlightingPassFactory..TextEditorHighlightingPassFactory?), p1: (TextEditorHighlightingPassRegistrar.Anchor..TextEditorHighlightingPassRegistrar.Anchor?), p2: Int, p3: Boolean, p4: Boolean): Int defined in com.intellij.codeHighlighting.TextEditorHighlightingPassRegistrar[JavaMethodDescriptor]

'this' @ [39:70] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.cutPaste.MoveDeclarationsPassFactory[LazyClassReceiverParameterDescriptor]

'BEFORE' @ [39:119] ==> enum entry BEFORE defined in com.intellij.codeHighlighting.TextEditorHighlightingPassRegistrar.Anchor[FakeCallableDescriptorForObject]

'POPUP_HINTS' @ [39:132] ==> public const final val POPUP_HINTS: Int defined in com.intellij.codeHighlighting.Pass[JavaPropertyDescriptor]

'MyPass' @ [43:16] ==> public constructor MyPass(project: Project, file: PsiFile, editor: Editor) defined in org.jetbrains.kotlin.idea.refactoring.cutPaste.MoveDeclarationsPassFactory.MyPass[ClassConstructorDescriptorImpl]

'file' @ [43:23] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.refactoring.cutPaste.MoveDeclarationsPassFactory.createHighlightingPass[ValueParameterDescriptorImpl]

'project' @ [43:28] ==> public final val PsiFile.project: Project[MyPropertyDescriptor]

'file' @ [43:37] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.refactoring.cutPaste.MoveDeclarationsPassFactory.createHighlightingPass[ValueParameterDescriptorImpl]

'editor' @ [43:43] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.refactoring.cutPaste.MoveDeclarationsPassFactory.createHighlightingPass[ValueParameterDescriptorImpl]

'TextEditorHighlightingPass' @ [50:9] ==> protected/*protected and package*/ constructor TextEditorHighlightingPass(@NotNull p0: Project, @Nullable p1: Document?, p2: Boolean) defined in com.intellij.codeHighlighting.TextEditorHighlightingPass[JavaClassConstructorDescriptor]

'project' @ [50:36] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.cutPaste.MoveDeclarationsPassFactory.MyPass.<init>[ValueParameterDescriptorImpl]

'editor' @ [50:45] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.refactoring.cutPaste.MoveDeclarationsPassFactory.MyPass.<init>[ValueParameterDescriptorImpl]

'document' @ [50:52] ==> public final val Editor.document: Document[MyPropertyDescriptor]

'buildHighlightingInfo' @ [55:24] ==> private final fun buildHighlightingInfo(): HighlightInfo? defined in org.jetbrains.kotlin.idea.refactoring.cutPaste.MoveDeclarationsPassFactory.MyPass[SimpleFunctionDescriptorImpl]

'setHighlightersToEditor' @ [56:36] ==> public open fun setHighlightersToEditor(@NotNull p0: Project, @NotNull p1: Document, p2: Int, p3: Int, @NotNull p4: (MutableCollection<(HighlightInfo..HighlightInfo?)>..Collection<(HighlightInfo..HighlightInfo?)>), @Nullable p5: EditorColorsScheme?, p6: Int): Unit defined in com.intellij.codeInsight.daemon.impl.UpdateHighlightersUtil[JavaMethodDescriptor]

'project' @ [56:60] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.refactoring.cutPaste.MoveDeclarationsPassFactory.MyPass[PropertyDescriptorImpl]

'myDocument' @ [56:69] ==> @Nullable protected/*protected and package*/ final val myDocument: Document? defined in org.jetbrains.kotlin.idea.refactoring.cutPaste.MoveDeclarationsPassFactory.MyPass[JavaPropertyDescriptor]

'file' @ [56:86] ==> private final val file: PsiFile defined in org.jetbrains.kotlin.idea.refactoring.cutPaste.MoveDeclarationsPassFactory.MyPass[PropertyDescriptorImpl]

'textLength' @ [56:91] ==> public final val PsiFile.textLength: Int[MyPropertyDescriptor]

'listOfNotNull' @ [56:103] ==> public fun <T : Any> listOfNotNull(element: HighlightInfo?): List<HighlightInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> HighlightInfo

'info' @ [56:117] ==> val info: HighlightInfo? defined in org.jetbrains.kotlin.idea.refactoring.cutPaste.MoveDeclarationsPassFactory.MyPass.doApplyInformationToEditor[LocalVariableDescriptor]

'colorsScheme' @ [56:124] ==> public final var MoveDeclarationsPassFactory.MyPass.colorsScheme: EditorColorsScheme?[MyPropertyDescriptor]

'id' @ [56:138] ==> public final var MoveDeclarationsPassFactory.MyPass.id: Int[MyPropertyDescriptor]

'editor' @ [60:26] ==> private final val editor: Editor defined in org.jetbrains.kotlin.idea.refactoring.cutPaste.MoveDeclarationsPassFactory.MyPass[PropertyDescriptorImpl]

'getUserData' @ [60:33] ==> @Nullable public abstract fun <T : (Any..Any?)> getUserData(@NotNull p0: Key<(MoveDeclarationsEditorCookie..MoveDeclarationsEditorCookie?)>): MoveDeclarationsEditorCookie? defined in com.intellij.openapi.editor.Editor[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> MoveDeclarationsEditorCookie

'MoveDeclarationsEditorCookie' @ [60:45] ==> public companion object defined in org.jetbrains.kotlin.idea.refactoring.cutPaste.MoveDeclarationsEditorCookie[FakeCallableDescriptorForObject]

'KEY' @ [60:74] ==> public final val KEY: Key<MoveDeclarationsEditorCookie> defined in org.jetbrains.kotlin.idea.refactoring.cutPaste.MoveDeclarationsEditorCookie.Companion[PropertyDescriptorImpl]

'cookie' @ [62:17] ==> val cookie: MoveDeclarationsEditorCookie defined in org.jetbrains.kotlin.idea.refactoring.cutPaste.MoveDeclarationsPassFactory.MyPass.buildHighlightingInfo[LocalVariableDescriptor]

'modificationCount' @ [62:24] ==> public final val modificationCount: Long defined in org.jetbrains.kotlin.idea.refactoring.cutPaste.MoveDeclarationsEditorCookie[PropertyDescriptorImpl]

'getInstance' @ [62:76] ==> public open fun getInstance(p0: (Project..Project?)): (PsiModificationTracker..PsiModificationTracker?) defined in com.intellij.psi.util.PsiModificationTracker.SERVICE[JavaMethodDescriptor]

'project' @ [62:88] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.refactoring.cutPaste.MoveDeclarationsPassFactory.MyPass[PropertyDescriptorImpl]

'modificationCount' @ [62:97] ==> public final val PsiModificationTracker.modificationCount: Long[MyPropertyDescriptor]

'MoveDeclarationsProcessor' @ [64:29] ==> public companion object defined in org.jetbrains.kotlin.idea.refactoring.cutPaste.MoveDeclarationsProcessor[FakeCallableDescriptorForObject]

'build' @ [64:55] ==> public final fun build(editor: Editor, cookie: MoveDeclarationsEditorCookie): MoveDeclarationsProcessor? defined in org.jetbrains.kotlin.idea.refactoring.cutPaste.MoveDeclarationsProcessor.Companion[SimpleFunctionDescriptorImpl]

'editor' @ [64:61] ==> private final val editor: Editor defined in org.jetbrains.kotlin.idea.refactoring.cutPaste.MoveDeclarationsPassFactory.MyPass[PropertyDescriptorImpl]

'cookie' @ [64:69] ==> val cookie: MoveDeclarationsEditorCookie defined in org.jetbrains.kotlin.idea.refactoring.cutPaste.MoveDeclarationsPassFactory.MyPass.buildHighlightingInfo[LocalVariableDescriptor]

'processor' @ [66:17] ==> val processor: MoveDeclarationsProcessor? defined in org.jetbrains.kotlin.idea.refactoring.cutPaste.MoveDeclarationsPassFactory.MyPass.buildHighlightingInfo[LocalVariableDescriptor]

'editor' @ [67:17] ==> private final val editor: Editor defined in org.jetbrains.kotlin.idea.refactoring.cutPaste.MoveDeclarationsPassFactory.MyPass[PropertyDescriptorImpl]

'putUserData' @ [67:24] ==> public abstract fun <T : (Any..Any?)> putUserData(@NotNull p0: Key<(MoveDeclarationsEditorCookie..MoveDeclarationsEditorCookie?)>, @Nullable p1: MoveDeclarationsEditorCookie?): Unit defined in com.intellij.openapi.editor.Editor[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> MoveDeclarationsEditorCookie

'MoveDeclarationsEditorCookie' @ [67:36] ==> public companion object defined in org.jetbrains.kotlin.idea.refactoring.cutPaste.MoveDeclarationsEditorCookie[FakeCallableDescriptorForObject]

'KEY' @ [67:65] ==> public final val KEY: Key<MoveDeclarationsEditorCookie> defined in org.jetbrains.kotlin.idea.refactoring.cutPaste.MoveDeclarationsEditorCookie.Companion[PropertyDescriptorImpl]

'newHighlightInfo' @ [71:38] ==> @NotNull public open fun newHighlightInfo(@NotNull p0: HighlightInfoType): HighlightInfo.Builder defined in com.intellij.codeInsight.daemon.impl.HighlightInfo[JavaMethodDescriptor]

'INFORMATION' @ [71:73] ==> public final val INFORMATION: (HighlightInfoType..HighlightInfoType?) defined in com.intellij.codeInsight.daemon.impl.HighlightInfoType[JavaPropertyDescriptor]

'range' @ [72:22] ==> @NotNull public abstract fun range(@NotNull p0: TextRange): HighlightInfo.Builder defined in com.intellij.codeInsight.daemon.impl.HighlightInfo.Builder[JavaMethodDescriptor]

'cookie' @ [72:28] ==> val cookie: MoveDeclarationsEditorCookie defined in org.jetbrains.kotlin.idea.refactoring.cutPaste.MoveDeclarationsPassFactory.MyPass.buildHighlightingInfo[LocalVariableDescriptor]

'bounds' @ [72:35] ==> public final val bounds: RangeMarker defined in org.jetbrains.kotlin.idea.refactoring.cutPaste.MoveDeclarationsEditorCookie[PropertyDescriptorImpl]

'range' @ [72:42] ==> public val RangeMarker.range: TextRange? defined in org.jetbrains.kotlin.idea.conversion.copy in file RangeUtils.kt[PropertyDescriptorImpl]

'createUnconditionally' @ [73:22] ==> @NotNull public abstract fun createUnconditionally(): HighlightInfo defined in com.intellij.codeInsight.daemon.impl.HighlightInfo.Builder[JavaMethodDescriptor]

'registerQuickFixAction' @ [74:28] ==> public open fun registerQuickFixAction(@Nullable p0: HighlightInfo?, @Nullable p1: IntentionAction?): Unit defined in com.intellij.codeInsight.daemon.impl.quickfix.QuickFixAction[JavaMethodDescriptor]

'info' @ [74:51] ==> val info: HighlightInfo defined in org.jetbrains.kotlin.idea.refactoring.cutPaste.MoveDeclarationsPassFactory.MyPass.buildHighlightingInfo[LocalVariableDescriptor]

'MoveDeclarationsIntentionAction' @ [74:57] ==> public constructor MoveDeclarationsIntentionAction(processor: MoveDeclarationsProcessor, bounds: RangeMarker, modificationCount: Long) defined in org.jetbrains.kotlin.idea.refactoring.cutPaste.MoveDeclarationsIntentionAction[ClassConstructorDescriptorImpl]

'processor' @ [74:89] ==> val processor: MoveDeclarationsProcessor? defined in org.jetbrains.kotlin.idea.refactoring.cutPaste.MoveDeclarationsPassFactory.MyPass.buildHighlightingInfo[LocalVariableDescriptor]

'cookie' @ [74:100] ==> val cookie: MoveDeclarationsEditorCookie defined in org.jetbrains.kotlin.idea.refactoring.cutPaste.MoveDeclarationsPassFactory.MyPass.buildHighlightingInfo[LocalVariableDescriptor]

'bounds' @ [74:107] ==> public final val bounds: RangeMarker defined in org.jetbrains.kotlin.idea.refactoring.cutPaste.MoveDeclarationsEditorCookie[PropertyDescriptorImpl]

'cookie' @ [74:115] ==> val cookie: MoveDeclarationsEditorCookie defined in org.jetbrains.kotlin.idea.refactoring.cutPaste.MoveDeclarationsPassFactory.MyPass.buildHighlightingInfo[LocalVariableDescriptor]

'modificationCount' @ [74:122] ==> public final val modificationCount: Long defined in org.jetbrains.kotlin.idea.refactoring.cutPaste.MoveDeclarationsEditorCookie[PropertyDescriptorImpl]

'info' @ [76:20] ==> val info: HighlightInfo defined in org.jetbrains.kotlin.idea.refactoring.cutPaste.MoveDeclarationsPassFactory.MyPass.buildHighlightingInfo[LocalVariableDescriptor]

