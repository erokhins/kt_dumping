'SelfTargetingOffsetIndependentIntention<KtTypeReference>' @ [40:45] ==> public constructor SelfTargetingOffsetIndependentIntention<TElement : KtElement>(elementType: Class<KtTypeReference>, text: String, familyName: String = ...) defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingOffsetIndependentIntention[DeserializedClassConstructorDescriptor]
Inferred types:
    <TElement : KtElement> -> KtTypeReference

'java' @ [40:125] ==> public val <T> KClass<KtTypeReference>.java: Class<KtTypeReference> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtTypeReference

'==' @ [42:16] ==> public open fun equals(other: Any?): Boolean defined in org.jetbrains.kotlin.psi.KtTypeReference[DeserializedSimpleFunctionDescriptor]

'element' @ [42:17] ==> value-parameter element: KtTypeReference defined in org.jetbrains.kotlin.idea.intentions.ConvertReceiverToParameterIntention.isApplicableTo[ValueParameterDescriptorImpl]

'parent' @ [42:25] ==> public final val KtTypeReference.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'receiverTypeReference' @ [42:54] ==> public final val KtNamedFunction.receiverTypeReference: KtTypeReference?[MyPropertyDescriptor]

'element' @ [42:79] ==> value-parameter element: KtTypeReference defined in org.jetbrains.kotlin.idea.intentions.ConvertReceiverToParameterIntention.isApplicableTo[ValueParameterDescriptorImpl]

'originalDescriptor' @ [48:24] ==> value-parameter originalDescriptor: KotlinMethodDescriptor defined in org.jetbrains.kotlin.idea.intentions.ConvertReceiverToParameterIntention.configureChangeSignature.<no name provided>.configure[ValueParameterDescriptorImpl]

'modify' @ [48:43] ==> public fun KotlinMethodDescriptor.modify(action: (KotlinMutableMethodDescriptor) -> Unit): KotlinMethodDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature in file KotlinChangeSignature.kt[SimpleFunctionDescriptorImpl]

'it' @ [49:21] ==> value-parameter it: KotlinMutableMethodDescriptor defined in org.jetbrains.kotlin.idea.intentions.ConvertReceiverToParameterIntention.configureChangeSignature.<no name provided>.configure.<anonymous>[ValueParameterDescriptorImpl]

'receiver' @ [49:24] ==> public open var receiver: KotlinParameterInfo? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinMutableMethodDescriptor[PropertyDescriptorImpl]

'newName' @ [50:25] ==> value-parameter newName: String? = ... defined in org.jetbrains.kotlin.idea.intentions.ConvertReceiverToParameterIntention.configureChangeSignature[ValueParameterDescriptorImpl]

'it' @ [51:25] ==> value-parameter it: KotlinMutableMethodDescriptor defined in org.jetbrains.kotlin.idea.intentions.ConvertReceiverToParameterIntention.configureChangeSignature.<no name provided>.configure.<anonymous>[ValueParameterDescriptorImpl]

'parameters' @ [51:28] ==> public final val KotlinMutableMethodDescriptor.parameters: (MutableList<(KotlinParameterInfo..KotlinParameterInfo?)>..List<(KotlinParameterInfo..KotlinParameterInfo?)>?)[MyPropertyDescriptor]

'first' @ [51:39] ==> public fun <T> List<(KotlinParameterInfo..KotlinParameterInfo?)>.first(): (KotlinParameterInfo..KotlinParameterInfo?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo..org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo?)

'name' @ [51:47] ==> public final var KotlinParameterInfo.name: String[MyPropertyDescriptor]

'newName' @ [51:54] ==> value-parameter newName: String? = ... defined in org.jetbrains.kotlin.idea.intentions.ConvertReceiverToParameterIntention.configureChangeSignature[ValueParameterDescriptorImpl]

'element' @ [63:24] ==> value-parameter element: KtTypeReference defined in org.jetbrains.kotlin.idea.intentions.ConvertReceiverToParameterIntention.applyTo[ValueParameterDescriptorImpl]

'parent' @ [63:32] ==> public final val KtTypeReference.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'function' @ [64:26] ==> val function: KtNamedFunction defined in org.jetbrains.kotlin.idea.intentions.ConvertReceiverToParameterIntention.applyTo[LocalVariableDescriptor]

'resolveToHeaderDescriptorIfPossible' @ [64:35] ==> internal fun KtDeclaration.resolveToHeaderDescriptorIfPossible(): DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring in file kotlinRefactoringUtil.kt[SimpleFunctionDescriptorImpl]

'function' @ [66:23] ==> val function: KtNamedFunction defined in org.jetbrains.kotlin.idea.intentions.ConvertReceiverToParameterIntention.applyTo[LocalVariableDescriptor]

'project' @ [66:32] ==> public final val KtNamedFunction.project: Project[MyPropertyDescriptor]

'if (editor != null && !ApplicationManager.getApplication().isUnitTestMode) {
            val receiverNames = suggestReceiverNames(project, descriptor)
            val defaultReceiverName = receiverNames.first()
            val receiverTypeRef = function.receiverTypeReference!!
            val psiFactory = KtPsiFactory(element)
            val newParameter = psiFactory.createParameter("$defaultReceiverName: Dummy").apply { typeReference!!.replace(receiverTypeRef) }

            project.executeWriteCommand(text) {
                function.setReceiverTypeReference(null)
                val addedParameter = function.getOrCreateValueParameterList().addParameterAfter(newParameter, null)

                with(PsiDocumentManager.getInstance(project)) {
                    commitDocument(editor.document)
                    doPostponedOperationsAndUnblockDocument(editor.document)
                }

                editor.caretModel.moveToOffset(function.startOffset)

                val templateBuilder = TemplateBuilderImpl(function)
                templateBuilder.replaceElement(addedParameter.nameIdentifier!!, ChooseStringExpression(receiverNames))
                TemplateManager.getInstance(project).startTemplate(
                        editor,
                        templateBuilder.buildInlineTemplate(),
                        object: TemplateEditingAdapter() {
                            private fun revertChanges() {
                                runWriteAction {
                                    function.setReceiverTypeReference(addedParameter.typeReference)
                                    function.valueParameterList!!.removeParameter(addedParameter)
                                }
                            }

                            override fun templateFinished(template: Template?, brokenOff: Boolean) {
                                val newName = addedParameter.name
                                revertChanges()
                                if (!brokenOff) {
                                    runChangeSignature(
                                            element.project,
                                            function.resolveToHeaderDescriptorIfPossible() as FunctionDescriptor,
                                            configureChangeSignature(newName),
                                            function.receiverTypeReference!!,
                                            text
                                    )
                                }
                            }

                            override fun templateCancelled(template: Template?) {
                                revertChanges()
                            }
                        }
                )
            }
        }
        else {
            runChangeSignature(element.project, descriptor, configureChangeSignature(), element, text)
        }' @ [68:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any, elseBranch: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any

'editor' @ [68:13] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.intentions.ConvertReceiverToParameterIntention.applyTo[ValueParameterDescriptorImpl]

'!' @ [68:31] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'getApplication' @ [68:51] ==> public open fun getApplication(): (Application..Application?) defined in com.intellij.openapi.application.ApplicationManager[JavaMethodDescriptor]

'isUnitTestMode' @ [68:68] ==> public final val Application.isUnitTestMode: Boolean[MyPropertyDescriptor]

'suggestReceiverNames' @ [69:33] ==> public fun suggestReceiverNames(project: Project, descriptor: CallableDescriptor): List<String> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature in file changeSignatureUtils.kt[SimpleFunctionDescriptorImpl]

'project' @ [69:54] ==> val project: Project defined in org.jetbrains.kotlin.idea.intentions.ConvertReceiverToParameterIntention.applyTo[LocalVariableDescriptor]

'descriptor' @ [69:63] ==> val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.intentions.ConvertReceiverToParameterIntention.applyTo[LocalVariableDescriptor]

'receiverNames' @ [70:39] ==> val receiverNames: List<String> defined in org.jetbrains.kotlin.idea.intentions.ConvertReceiverToParameterIntention.applyTo[LocalVariableDescriptor]

'first' @ [70:53] ==> public fun <T> List<String>.first(): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'function' @ [71:35] ==> val function: KtNamedFunction defined in org.jetbrains.kotlin.idea.intentions.ConvertReceiverToParameterIntention.applyTo[LocalVariableDescriptor]

'receiverTypeReference' @ [71:44] ==> public final val KtNamedFunction.receiverTypeReference: KtTypeReference?[MyPropertyDescriptor]

'KtPsiFactory' @ [72:30] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'element' @ [72:43] ==> value-parameter element: KtTypeReference defined in org.jetbrains.kotlin.idea.intentions.ConvertReceiverToParameterIntention.applyTo[ValueParameterDescriptorImpl]

'psiFactory' @ [73:32] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.intentions.ConvertReceiverToParameterIntention.applyTo[LocalVariableDescriptor]

'createParameter' @ [73:43] ==> public final fun createParameter(text: String): KtParameter defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'defaultReceiverName' @ [73:61] ==> val defaultReceiverName: String defined in org.jetbrains.kotlin.idea.intentions.ConvertReceiverToParameterIntention.applyTo[LocalVariableDescriptor]

'apply' @ [73:90] ==> @InlineOnly public inline fun <T> KtParameter.apply(block: KtParameter.() -> Unit): KtParameter defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtParameter

'typeReference' @ [73:98] ==> public final var KtParameter.typeReference: KtTypeReference?[MyPropertyDescriptor]

'replace' @ [73:114] ==> public open fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtTypeReference[JavaMethodDescriptor]

'receiverTypeRef' @ [73:122] ==> val receiverTypeRef: KtTypeReference defined in org.jetbrains.kotlin.idea.intentions.ConvertReceiverToParameterIntention.applyTo[LocalVariableDescriptor]

'project' @ [75:13] ==> val project: Project defined in org.jetbrains.kotlin.idea.intentions.ConvertReceiverToParameterIntention.applyTo[LocalVariableDescriptor]

'executeWriteCommand' @ [75:21] ==> public fun Project.executeWriteCommand(name: String, command: () -> Unit): Unit defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]

'text' @ [75:41] ==> public final var ConvertReceiverToParameterIntention.text: String[MyPropertyDescriptor]

'function' @ [76:17] ==> val function: KtNamedFunction defined in org.jetbrains.kotlin.idea.intentions.ConvertReceiverToParameterIntention.applyTo[LocalVariableDescriptor]

'setReceiverTypeReference' @ [76:26] ==> public fun KtCallableDeclaration.setReceiverTypeReference(typeRef: KtTypeReference?): KtTypeReference? defined in org.jetbrains.kotlin.psi.typeRefHelpers[DeserializedSimpleFunctionDescriptor]

'function' @ [77:38] ==> val function: KtNamedFunction defined in org.jetbrains.kotlin.idea.intentions.ConvertReceiverToParameterIntention.applyTo[LocalVariableDescriptor]

'getOrCreateValueParameterList' @ [77:47] ==> public fun KtNamedFunction.getOrCreateValueParameterList(): KtParameterList defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'addParameterAfter' @ [77:79] ==> @NotNull public open fun addParameterAfter(@NotNull p0: KtParameter, @Nullable p1: KtParameter?): KtParameter defined in org.jetbrains.kotlin.psi.KtParameterList[JavaMethodDescriptor]

'newParameter' @ [77:97] ==> val newParameter: KtParameter defined in org.jetbrains.kotlin.idea.intentions.ConvertReceiverToParameterIntention.applyTo[LocalVariableDescriptor]

'with' @ [79:17] ==> @InlineOnly public inline fun <T, R> with(receiver: (PsiDocumentManager..PsiDocumentManager?), block: (PsiDocumentManager..PsiDocumentManager?).() -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiDocumentManager..com.intellij.psi.PsiDocumentManager?)
    <R> -> Unit

'getInstance' @ [79:41] ==> public open fun getInstance(@NotNull p0: Project): (PsiDocumentManager..PsiDocumentManager?) defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'project' @ [79:53] ==> val project: Project defined in org.jetbrains.kotlin.idea.intentions.ConvertReceiverToParameterIntention.applyTo[LocalVariableDescriptor]

'commitDocument' @ [80:21] ==> public abstract fun commitDocument(@NotNull p0: Document): Unit defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'editor' @ [80:36] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.intentions.ConvertReceiverToParameterIntention.applyTo[ValueParameterDescriptorImpl]

'document' @ [80:43] ==> public final val Editor.document: Document[MyPropertyDescriptor]

'doPostponedOperationsAndUnblockDocument' @ [81:21] ==> public abstract fun doPostponedOperationsAndUnblockDocument(@NotNull p0: Document): Unit defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'editor' @ [81:61] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.intentions.ConvertReceiverToParameterIntention.applyTo[ValueParameterDescriptorImpl]

'document' @ [81:68] ==> public final val Editor.document: Document[MyPropertyDescriptor]

'editor' @ [84:17] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.intentions.ConvertReceiverToParameterIntention.applyTo[ValueParameterDescriptorImpl]

'caretModel' @ [84:24] ==> public final val Editor.caretModel: CaretModel[MyPropertyDescriptor]

'moveToOffset' @ [84:35] ==> public abstract fun moveToOffset(p0: Int): Unit defined in com.intellij.openapi.editor.CaretModel[JavaMethodDescriptor]

'function' @ [84:48] ==> val function: KtNamedFunction defined in org.jetbrains.kotlin.idea.intentions.ConvertReceiverToParameterIntention.applyTo[LocalVariableDescriptor]

'startOffset' @ [84:57] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'TemplateBuilderImpl' @ [86:39] ==> public constructor TemplateBuilderImpl(@NotNull p0: PsiElement) defined in com.intellij.codeInsight.template.TemplateBuilderImpl[JavaClassConstructorDescriptor]

'function' @ [86:59] ==> val function: KtNamedFunction defined in org.jetbrains.kotlin.idea.intentions.ConvertReceiverToParameterIntention.applyTo[LocalVariableDescriptor]

'templateBuilder' @ [87:17] ==> val templateBuilder: TemplateBuilderImpl defined in org.jetbrains.kotlin.idea.intentions.ConvertReceiverToParameterIntention.applyTo.<anonymous>[LocalVariableDescriptor]

'replaceElement' @ [87:33] ==> public open fun replaceElement(@NotNull p0: PsiElement, p1: (Expression..Expression?)): Unit defined in com.intellij.codeInsight.template.TemplateBuilderImpl[JavaMethodDescriptor]

'addedParameter' @ [87:48] ==> val addedParameter: KtParameter defined in org.jetbrains.kotlin.idea.intentions.ConvertReceiverToParameterIntention.applyTo.<anonymous>[LocalVariableDescriptor]

'nameIdentifier' @ [87:63] ==> public final val KtParameter.nameIdentifier: PsiElement?[MyPropertyDescriptor]

'ChooseStringExpression' @ [87:81] ==> public constructor ChooseStringExpression(suggestions: Collection<String>, default: String = ..., advertisementText: String? = ...) defined in org.jetbrains.kotlin.idea.intentions.ChooseStringExpression[ClassConstructorDescriptorImpl]

'receiverNames' @ [87:104] ==> val receiverNames: List<String> defined in org.jetbrains.kotlin.idea.intentions.ConvertReceiverToParameterIntention.applyTo[LocalVariableDescriptor]

'getInstance' @ [88:33] ==> public open fun getInstance(p0: (Project..Project?)): (TemplateManager..TemplateManager?) defined in com.intellij.codeInsight.template.TemplateManager[JavaMethodDescriptor]

'project' @ [88:45] ==> val project: Project defined in org.jetbrains.kotlin.idea.intentions.ConvertReceiverToParameterIntention.applyTo[LocalVariableDescriptor]

'startTemplate' @ [88:54] ==> public abstract fun startTemplate(@NotNull p0: Editor, @NotNull p1: Template, p2: (TemplateEditingListener..TemplateEditingListener?)): Unit defined in com.intellij.codeInsight.template.TemplateManager[JavaMethodDescriptor]

'editor' @ [89:25] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.intentions.ConvertReceiverToParameterIntention.applyTo[ValueParameterDescriptorImpl]

'templateBuilder' @ [90:25] ==> val templateBuilder: TemplateBuilderImpl defined in org.jetbrains.kotlin.idea.intentions.ConvertReceiverToParameterIntention.applyTo.<anonymous>[LocalVariableDescriptor]

'buildInlineTemplate' @ [90:41] ==> public open fun buildInlineTemplate(): (Template..Template?) defined in com.intellij.codeInsight.template.TemplateBuilderImpl[JavaMethodDescriptor]

'TemplateEditingAdapter' @ [91:33] ==> public constructor TemplateEditingAdapter() defined in com.intellij.codeInsight.template.TemplateEditingAdapter[JavaClassConstructorDescriptor]

'runWriteAction' @ [93:33] ==> public fun <T> runWriteAction(action: () -> Unit): Unit defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'function' @ [94:37] ==> val function: KtNamedFunction defined in org.jetbrains.kotlin.idea.intentions.ConvertReceiverToParameterIntention.applyTo[LocalVariableDescriptor]

'setReceiverTypeReference' @ [94:46] ==> public fun KtCallableDeclaration.setReceiverTypeReference(typeRef: KtTypeReference?): KtTypeReference? defined in org.jetbrains.kotlin.psi.typeRefHelpers[DeserializedSimpleFunctionDescriptor]

'addedParameter' @ [94:71] ==> val addedParameter: KtParameter defined in org.jetbrains.kotlin.idea.intentions.ConvertReceiverToParameterIntention.applyTo.<anonymous>[LocalVariableDescriptor]

'typeReference' @ [94:86] ==> public final var KtParameter.typeReference: KtTypeReference?[MyPropertyDescriptor]

'function' @ [95:37] ==> val function: KtNamedFunction defined in org.jetbrains.kotlin.idea.intentions.ConvertReceiverToParameterIntention.applyTo[LocalVariableDescriptor]

'valueParameterList' @ [95:46] ==> public final val KtNamedFunction.valueParameterList: KtParameterList?[MyPropertyDescriptor]

'removeParameter' @ [95:67] ==> public open fun removeParameter(@NotNull p0: KtParameter): Unit defined in org.jetbrains.kotlin.psi.KtParameterList[JavaMethodDescriptor]

'addedParameter' @ [95:83] ==> val addedParameter: KtParameter defined in org.jetbrains.kotlin.idea.intentions.ConvertReceiverToParameterIntention.applyTo.<anonymous>[LocalVariableDescriptor]

'addedParameter' @ [100:47] ==> val addedParameter: KtParameter defined in org.jetbrains.kotlin.idea.intentions.ConvertReceiverToParameterIntention.applyTo.<anonymous>[LocalVariableDescriptor]

'name' @ [100:62] ==> public final val KtParameter.name: String?[MyPropertyDescriptor]

'revertChanges' @ [101:33] ==> private final fun revertChanges(): Unit defined in org.jetbrains.kotlin.idea.intentions.ConvertReceiverToParameterIntention.applyTo.<anonymous>.<no name provided>[SimpleFunctionDescriptorImpl]

'!' @ [102:37] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'brokenOff' @ [102:38] ==> value-parameter brokenOff: Boolean defined in org.jetbrains.kotlin.idea.intentions.ConvertReceiverToParameterIntention.applyTo.<anonymous>.<no name provided>.templateFinished[ValueParameterDescriptorImpl]

'runChangeSignature' @ [103:37] ==> public fun runChangeSignature(project: Project, callableDescriptor: CallableDescriptor, configuration: KotlinChangeSignatureConfiguration, defaultValueContext: PsiElement, commandName: String? = ...): Boolean defined in org.jetbrains.kotlin.idea.refactoring.changeSignature in file KotlinChangeSignature.kt[SimpleFunctionDescriptorImpl]

'element' @ [104:45] ==> value-parameter element: KtTypeReference defined in org.jetbrains.kotlin.idea.intentions.ConvertReceiverToParameterIntention.applyTo[ValueParameterDescriptorImpl]

'project' @ [104:53] ==> public final val KtTypeReference.project: Project[MyPropertyDescriptor]

'function' @ [105:45] ==> val function: KtNamedFunction defined in org.jetbrains.kotlin.idea.intentions.ConvertReceiverToParameterIntention.applyTo[LocalVariableDescriptor]

'resolveToHeaderDescriptorIfPossible' @ [105:54] ==> internal fun KtDeclaration.resolveToHeaderDescriptorIfPossible(): DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring in file kotlinRefactoringUtil.kt[SimpleFunctionDescriptorImpl]

'configureChangeSignature' @ [106:45] ==> private final fun configureChangeSignature(newName: String? = ...): KotlinChangeSignatureConfiguration defined in org.jetbrains.kotlin.idea.intentions.ConvertReceiverToParameterIntention[SimpleFunctionDescriptorImpl]

'newName' @ [106:70] ==> val newName: String? defined in org.jetbrains.kotlin.idea.intentions.ConvertReceiverToParameterIntention.applyTo.<anonymous>.<no name provided>.templateFinished[LocalVariableDescriptor]

'function' @ [107:45] ==> val function: KtNamedFunction defined in org.jetbrains.kotlin.idea.intentions.ConvertReceiverToParameterIntention.applyTo[LocalVariableDescriptor]

'receiverTypeReference' @ [107:54] ==> public final val KtNamedFunction.receiverTypeReference: KtTypeReference?[MyPropertyDescriptor]

'text' @ [108:45] ==> public final var ConvertReceiverToParameterIntention.text: String[MyPropertyDescriptor]

'revertChanges' @ [114:33] ==> private final fun revertChanges(): Unit defined in org.jetbrains.kotlin.idea.intentions.ConvertReceiverToParameterIntention.applyTo.<anonymous>.<no name provided>[SimpleFunctionDescriptorImpl]

'runChangeSignature' @ [121:13] ==> public fun runChangeSignature(project: Project, callableDescriptor: CallableDescriptor, configuration: KotlinChangeSignatureConfiguration, defaultValueContext: PsiElement, commandName: String? = ...): Boolean defined in org.jetbrains.kotlin.idea.refactoring.changeSignature in file KotlinChangeSignature.kt[SimpleFunctionDescriptorImpl]

'element' @ [121:32] ==> value-parameter element: KtTypeReference defined in org.jetbrains.kotlin.idea.intentions.ConvertReceiverToParameterIntention.applyTo[ValueParameterDescriptorImpl]

'project' @ [121:40] ==> public final val KtTypeReference.project: Project[MyPropertyDescriptor]

'descriptor' @ [121:49] ==> val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.intentions.ConvertReceiverToParameterIntention.applyTo[LocalVariableDescriptor]

'configureChangeSignature' @ [121:61] ==> private final fun configureChangeSignature(newName: String? = ...): KotlinChangeSignatureConfiguration defined in org.jetbrains.kotlin.idea.intentions.ConvertReceiverToParameterIntention[SimpleFunctionDescriptorImpl]

'element' @ [121:89] ==> value-parameter element: KtTypeReference defined in org.jetbrains.kotlin.idea.intentions.ConvertReceiverToParameterIntention.applyTo[ValueParameterDescriptorImpl]

'text' @ [121:98] ==> public final var ConvertReceiverToParameterIntention.text: String[MyPropertyDescriptor]

