'ArrayList' @ [35:40] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Pair<SmartPsiElementPointer<*>, Function0<Template?>>

'elementsAndFactories' @ [38:9] ==> private final val elementsAndFactories: ArrayList<Pair<SmartPsiElementPointer<*>, () -> Template?>> defined in org.jetbrains.kotlin.idea.editor.BatchTemplateRunner[PropertyDescriptorImpl]

'add' @ [38:30] ==> public open fun add(element: Pair<SmartPsiElementPointer<*>, () -> Template?>): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'element' @ [38:34] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.editor.BatchTemplateRunner.addTemplateFactory[ValueParameterDescriptorImpl]

'createSmartPointer' @ [38:42] ==> public fun <E : PsiElement> PsiElement.createSmartPointer(): SmartPsiElementPointer<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <E : PsiElement> -> PsiElement

'factory' @ [38:66] ==> value-parameter factory: () -> Template? defined in org.jetbrains.kotlin.idea.editor.BatchTemplateRunner.addTemplateFactory[ValueParameterDescriptorImpl]

'runTemplates' @ [42:9] ==> private final fun runTemplates(iterator: Iterator<Pair<SmartPsiElementPointer<*>, () -> Template?>>): Unit defined in org.jetbrains.kotlin.idea.editor.BatchTemplateRunner[SimpleFunctionDescriptorImpl]

'elementsAndFactories' @ [42:22] ==> private final val elementsAndFactories: ArrayList<Pair<SmartPsiElementPointer<*>, () -> Template?>> defined in org.jetbrains.kotlin.idea.editor.BatchTemplateRunner[PropertyDescriptorImpl]

'iterator' @ [42:43] ==> public open fun iterator(): MutableIterator<Pair<SmartPsiElementPointer<*>, () -> Template?>> defined in java.util.ArrayList[JavaMethodDescriptor]

'pointer' @ [46:23] ==> value-parameter pointer: SmartPsiElementPointer<*> defined in org.jetbrains.kotlin.idea.editor.BatchTemplateRunner.getEditor[ValueParameterDescriptorImpl]

'element' @ [46:31] ==> public final val <E : (PsiElement..PsiElement?)> SmartPsiElementPointer<out (PsiElement..PsiElement?)>.element: PsiElement?[MyPropertyDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'element' @ [47:27] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.editor.BatchTemplateRunner.getEditor[LocalVariableDescriptor]

'containingFile' @ [47:35] ==> public final val PsiElement.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'virtualFile' @ [47:51] ==> public final val PsiFile.virtualFile: (VirtualFile..VirtualFile?)[MyPropertyDescriptor]

'OpenFileDescriptor' @ [48:26] ==> public constructor OpenFileDescriptor(@NotNull p0: Project, @NotNull p1: VirtualFile, p2: Int) defined in com.intellij.openapi.fileEditor.OpenFileDescriptor[JavaClassConstructorDescriptor]

'project' @ [48:45] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.editor.BatchTemplateRunner[PropertyDescriptorImpl]

'virtualFile' @ [48:54] ==> val virtualFile: VirtualFile defined in org.jetbrains.kotlin.idea.editor.BatchTemplateRunner.getEditor[LocalVariableDescriptor]

'element' @ [48:67] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.editor.BatchTemplateRunner.getEditor[LocalVariableDescriptor]

'textRange' @ [48:75] ==> public final val PsiElement.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'startOffset' @ [48:85] ==> public final val TextRange.startOffset: Int[MyPropertyDescriptor]

'getInstance' @ [49:34] ==> public open fun getInstance(@NotNull p0: Project): (FileEditorManager..FileEditorManager?) defined in com.intellij.openapi.fileEditor.FileEditorManager[JavaMethodDescriptor]

'project' @ [49:46] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.editor.BatchTemplateRunner[PropertyDescriptorImpl]

'openTextEditor' @ [49:55] ==> @Nullable public abstract fun openTextEditor(@NotNull p0: OpenFileDescriptor, p1: Boolean): Editor? defined in com.intellij.openapi.fileEditor.FileEditorManager[JavaMethodDescriptor]

'descriptor' @ [49:70] ==> val descriptor: OpenFileDescriptor defined in org.jetbrains.kotlin.idea.editor.BatchTemplateRunner.getEditor[LocalVariableDescriptor]

'!' @ [53:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'iterator' @ [53:14] ==> value-parameter iterator: Iterator<Pair<SmartPsiElementPointer<*>, () -> Template?>> defined in org.jetbrains.kotlin.idea.editor.BatchTemplateRunner.runTemplates[ValueParameterDescriptorImpl]

'hasNext' @ [53:23] ==> public abstract operator fun hasNext(): Boolean defined in kotlin.collections.Iterator[DeserializedSimpleFunctionDescriptor]

'getInstance' @ [55:39] ==> public open fun getInstance(p0: (Project..Project?)): (TemplateManager..TemplateManager?) defined in com.intellij.codeInsight.template.TemplateManager[JavaMethodDescriptor]

'project' @ [55:51] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.editor.BatchTemplateRunner[PropertyDescriptorImpl]

'project' @ [56:9] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.editor.BatchTemplateRunner[PropertyDescriptorImpl]

'executeWriteCommand' @ [56:17] ==> public fun Project.executeWriteCommand(name: String, command: () -> Unit): Unit defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]

'component1' @ [57:18] ==> public final operator fun component1(): SmartPsiElementPointer<*> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [57:27] ==> public final operator fun component2(): () -> Template? defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'iterator' @ [57:38] ==> value-parameter iterator: Iterator<Pair<SmartPsiElementPointer<*>, () -> Template?>> defined in org.jetbrains.kotlin.idea.editor.BatchTemplateRunner.runTemplates[ValueParameterDescriptorImpl]

'next' @ [57:47] ==> public abstract operator fun next(): Pair<SmartPsiElementPointer<*>, () -> Template?> defined in kotlin.collections.Iterator[DeserializedSimpleFunctionDescriptor]

'getEditor' @ [59:26] ==> private final fun getEditor(pointer: SmartPsiElementPointer<*>): Editor? defined in org.jetbrains.kotlin.idea.editor.BatchTemplateRunner[SimpleFunctionDescriptorImpl]

'pointer' @ [59:36] ==> val pointer: SmartPsiElementPointer<*> defined in org.jetbrains.kotlin.idea.editor.BatchTemplateRunner.runTemplates.<anonymous>[LocalVariableDescriptor]

'getInstance' @ [60:32] ==> public open fun getInstance(@NotNull p0: Project): (PsiDocumentManager..PsiDocumentManager?) defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'project' @ [60:44] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.editor.BatchTemplateRunner[PropertyDescriptorImpl]

'doPostponedOperationsAndUnblockDocument' @ [60:53] ==> public abstract fun doPostponedOperationsAndUnblockDocument(@NotNull p0: Document): Unit defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'editor' @ [60:93] ==> val editor: Editor defined in org.jetbrains.kotlin.idea.editor.BatchTemplateRunner.runTemplates.<anonymous>[LocalVariableDescriptor]

'document' @ [60:100] ==> public final val Editor.document: Document[MyPropertyDescriptor]

'invoke' @ [61:28] ==> public abstract operator fun invoke(): Template? defined in kotlin.Function0[FunctionInvokeDescriptor]

'manager' @ [62:13] ==> val manager: (TemplateManager..TemplateManager?) defined in org.jetbrains.kotlin.idea.editor.BatchTemplateRunner.runTemplates[LocalVariableDescriptor]

'startTemplate' @ [62:21] ==> public abstract fun startTemplate(@NotNull p0: Editor, @NotNull p1: Template, p2: (TemplateEditingListener..TemplateEditingListener?)): Unit defined in com.intellij.codeInsight.template.TemplateManager[JavaMethodDescriptor]

'editor' @ [63:21] ==> val editor: Editor defined in org.jetbrains.kotlin.idea.editor.BatchTemplateRunner.runTemplates.<anonymous>[LocalVariableDescriptor]

'template' @ [64:21] ==> val template: Template defined in org.jetbrains.kotlin.idea.editor.BatchTemplateRunner.runTemplates.<anonymous>[LocalVariableDescriptor]

'TemplateEditingAdapter' @ [65:30] ==> public constructor TemplateEditingAdapter() defined in com.intellij.codeInsight.template.TemplateEditingAdapter[JavaClassConstructorDescriptor]

'brokenOff' @ [67:33] ==> value-parameter brokenOff: Boolean defined in org.jetbrains.kotlin.idea.editor.BatchTemplateRunner.runTemplates.<anonymous>.<no name provided>.templateFinished[ValueParameterDescriptorImpl]

'getApplication' @ [68:48] ==> public open fun getApplication(): (Application..Application?) defined in com.intellij.openapi.application.ApplicationManager[JavaMethodDescriptor]

'invokeLater' @ [68:65] ==> public final fun invokeLater(@NotNull p0: () -> Unit): Unit defined in com.intellij.openapi.application.Application[MyFunctionDescriptor]

'runTemplates' @ [68:79] ==> private final fun runTemplates(iterator: Iterator<Pair<SmartPsiElementPointer<*>, () -> Template?>>): Unit defined in org.jetbrains.kotlin.idea.editor.BatchTemplateRunner[SimpleFunctionDescriptorImpl]

'iterator' @ [68:92] ==> value-parameter iterator: Iterator<Pair<SmartPsiElementPointer<*>, () -> Template?>> defined in org.jetbrains.kotlin.idea.editor.BatchTemplateRunner.runTemplates[ValueParameterDescriptorImpl]

