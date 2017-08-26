'KotlinQuickFixAction<KtNamedFunction>' @ [53:5] ==> public constructor KotlinQuickFixAction<out T : PsiElement>(element: KtNamedFunction) defined in org.jetbrains.kotlin.idea.quickfix.KotlinQuickFixAction[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : PsiElement> -> KtNamedFunction

'element' @ [53:43] ==> value-parameter element: KtNamedFunction defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionToSupertypeFix.<init>[ValueParameterDescriptorImpl]

'assert' @ [56:9] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'functions' @ [56:16] ==> private final val functions: List<AddFunctionToSupertypeFix.FunctionData> defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionToSupertypeFix[PropertyDescriptorImpl]

'isNotEmpty' @ [56:26] ==> @InlineOnly public inline fun <T> Collection<AddFunctionToSupertypeFix.FunctionData>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FunctionData

'functions' @ [66:22] ==> private final val functions: List<AddFunctionToSupertypeFix.FunctionData> defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionToSupertypeFix[PropertyDescriptorImpl]

'singleOrNull' @ [66:32] ==> public fun <T> List<AddFunctionToSupertypeFix.FunctionData>.singleOrNull(): AddFunctionToSupertypeFix.FunctionData? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FunctionData

'if (single != null)
            actionName(single)
        else
            "Add function to supertype..."' @ [67:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'single' @ [67:20] ==> val single: AddFunctionToSupertypeFix.FunctionData? defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionToSupertypeFix.getText[LocalVariableDescriptor]

'actionName' @ [68:13] ==> private final fun actionName(functionData: AddFunctionToSupertypeFix.FunctionData): String defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionToSupertypeFix[SimpleFunctionDescriptorImpl]

'single' @ [68:24] ==> val single: AddFunctionToSupertypeFix.FunctionData? defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionToSupertypeFix.getText[LocalVariableDescriptor]

'getInstance' @ [76:26] ==> public open fun getInstance(): (CommandProcessor..CommandProcessor?) defined in com.intellij.openapi.command.CommandProcessor[JavaMethodDescriptor]

'runUndoTransparentAction' @ [76:40] ==> public final fun runUndoTransparentAction(@NotNull p0: () -> Unit): Unit defined in com.intellij.openapi.command.CommandProcessor[MyFunctionDescriptor]

'if (functions.size == 1 || editor == null || !editor.component.isShowing) {
                addFunction(functions.first(), project)
            }
            else {
                JBPopupFactory.getInstance().createListPopup(createFunctionPopup(project)).showInBestPositionFor(editor)
            }' @ [77:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'functions' @ [77:17] ==> private final val functions: List<AddFunctionToSupertypeFix.FunctionData> defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionToSupertypeFix[PropertyDescriptorImpl]

'size' @ [77:27] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'editor' @ [77:40] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionToSupertypeFix.invoke[ValueParameterDescriptorImpl]

'!' @ [77:58] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'editor' @ [77:59] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionToSupertypeFix.invoke[ValueParameterDescriptorImpl]

'component' @ [77:66] ==> public final val Editor.component: JComponent[MyPropertyDescriptor]

'isShowing' @ [77:76] ==> public final val JComponent.isShowing: Boolean[MyPropertyDescriptor]

'addFunction' @ [78:17] ==> private final fun addFunction(functionData: AddFunctionToSupertypeFix.FunctionData, project: Project): Unit defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionToSupertypeFix[SimpleFunctionDescriptorImpl]

'functions' @ [78:29] ==> private final val functions: List<AddFunctionToSupertypeFix.FunctionData> defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionToSupertypeFix[PropertyDescriptorImpl]

'first' @ [78:39] ==> public fun <T> List<AddFunctionToSupertypeFix.FunctionData>.first(): AddFunctionToSupertypeFix.FunctionData defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FunctionData

'project' @ [78:48] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionToSupertypeFix.invoke[ValueParameterDescriptorImpl]

'getInstance' @ [81:32] ==> public open fun getInstance(): (JBPopupFactory..JBPopupFactory?) defined in com.intellij.openapi.ui.popup.JBPopupFactory[JavaMethodDescriptor]

'createListPopup' @ [81:46] ==> @NotNull public abstract fun createListPopup(@NotNull p0: raw (ListPopupStep<(Any..Any?)>..ListPopupStep<*>)): ListPopup defined in com.intellij.openapi.ui.popup.JBPopupFactory[JavaMethodDescriptor]

'createFunctionPopup' @ [81:62] ==> private final fun createFunctionPopup(project: Project): ListPopupStep<*> defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionToSupertypeFix[SimpleFunctionDescriptorImpl]

'project' @ [81:82] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionToSupertypeFix.invoke[ValueParameterDescriptorImpl]

'showInBestPositionFor' @ [81:92] ==> public abstract fun showInBestPositionFor(@NotNull p0: Editor): Unit defined in com.intellij.openapi.ui.popup.ListPopup[JavaMethodDescriptor]

'editor' @ [81:114] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionToSupertypeFix.invoke[ValueParameterDescriptorImpl]

'project' @ [87:9] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionToSupertypeFix.addFunction[ValueParameterDescriptorImpl]

'executeWriteCommand' @ [87:17] ==> public fun Project.executeWriteCommand(name: String, command: () -> Unit): Unit defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]

'functionData' @ [88:29] ==> value-parameter functionData: AddFunctionToSupertypeFix.FunctionData defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionToSupertypeFix.addFunction[ValueParameterDescriptorImpl]

'targetClass' @ [88:42] ==> public final val targetClass: KtClass defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionToSupertypeFix.FunctionData[PropertyDescriptorImpl]

'getOrCreateBody' @ [88:54] ==> public fun KtClassOrObject.getOrCreateBody(): KtClassBody defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'KtPsiFactory' @ [90:35] ==> @JvmOverloads public constructor KtPsiFactory(project: Project, markGenerated: Boolean = ...) defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedClassConstructorDescriptor]

'project' @ [90:48] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionToSupertypeFix.addFunction[ValueParameterDescriptorImpl]

'createFunction' @ [90:57] ==> public final fun createFunction(funDecl: String): KtNamedFunction defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'functionData' @ [90:72] ==> value-parameter functionData: AddFunctionToSupertypeFix.FunctionData defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionToSupertypeFix.addFunction[ValueParameterDescriptorImpl]

'sourceCode' @ [90:85] ==> public final val sourceCode: String defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionToSupertypeFix.FunctionData[PropertyDescriptorImpl]

'classBody' @ [91:43] ==> val classBody: KtClassBody defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionToSupertypeFix.addFunction.<anonymous>[LocalVariableDescriptor]

'addBefore' @ [91:53] ==> public open fun addBefore(@NotNull p0: PsiElement, p1: PsiElement?): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtClassBody[JavaMethodDescriptor]

'functionElement' @ [91:63] ==> val functionElement: KtNamedFunction defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionToSupertypeFix.addFunction.<anonymous>[LocalVariableDescriptor]

'classBody' @ [91:80] ==> val classBody: KtClassBody defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionToSupertypeFix.addFunction.<anonymous>[LocalVariableDescriptor]

'rBrace' @ [91:90] ==> public final val rBrace: PsiElement? defined in org.jetbrains.kotlin.psi.KtClassBody[DeserializedPropertyDescriptor]

'ShortenReferences' @ [93:13] ==> public companion object defined in org.jetbrains.kotlin.idea.core.ShortenReferences[FakeCallableDescriptorForObject]

'DEFAULT' @ [93:31] ==> @field:JvmField public final val DEFAULT: ShortenReferences defined in org.jetbrains.kotlin.idea.core.ShortenReferences.Companion[DeserializedPropertyDescriptor]

'process' @ [93:39] ==> @JvmOverloads public final fun process(element: KtElement, elementFilter: (PsiElement) -> ShortenReferences.FilterResult = ...): KtElement defined in org.jetbrains.kotlin.idea.core.ShortenReferences[DeserializedSimpleFunctionDescriptor]

'insertedFunctionElement' @ [93:47] ==> val insertedFunctionElement: KtNamedFunction defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionToSupertypeFix.addFunction.<anonymous>[LocalVariableDescriptor]

'insertedFunctionElement' @ [94:33] ==> val insertedFunctionElement: KtNamedFunction defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionToSupertypeFix.addFunction.<anonymous>[LocalVariableDescriptor]

'modalityModifier' @ [94:57] ==> public fun KtDeclaration.modalityModifier(): PsiElement? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'node' @ [94:77] ==> public final val PsiElement.node: (ASTNode..ASTNode?)[MyPropertyDescriptor]

'elementType' @ [94:83] ==> public final val ASTNode.elementType: IElementType[MyPropertyDescriptor]

'insertedFunctionElement' @ [96:17] ==> val insertedFunctionElement: KtNamedFunction defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionToSupertypeFix.addFunction.<anonymous>[LocalVariableDescriptor]

'implicitModality' @ [96:41] ==> public fun KtDeclaration.implicitModality(): KtModifierKeywordToken defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'modifierToken' @ [96:63] ==> val modifierToken: KtModifierKeywordToken defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionToSupertypeFix.addFunction.<anonymous>[LocalVariableDescriptor]

'RemoveModifierFix' @ [97:17] ==> public constructor RemoveModifierFix(element: KtModifierListOwner, modifier: KtModifierKeywordToken, isRedundant: Boolean) defined in org.jetbrains.kotlin.idea.quickfix.RemoveModifierFix[ClassConstructorDescriptorImpl]

'insertedFunctionElement' @ [97:35] ==> val insertedFunctionElement: KtNamedFunction defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionToSupertypeFix.addFunction.<anonymous>[LocalVariableDescriptor]

'modifierToken' @ [97:60] ==> val modifierToken: KtModifierKeywordToken defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionToSupertypeFix.addFunction.<anonymous>[LocalVariableDescriptor]

'invoke' @ [97:81] ==> public final fun invoke(): Unit defined in org.jetbrains.kotlin.idea.quickfix.RemoveModifierFix[SimpleFunctionDescriptorImpl]

'BaseListPopupStep<FunctionData>' @ [103:25] ==> public constructor BaseListPopupStep<T : (Any..Any?)>(@Nullable p0: String?, p1: (MutableList<out (AddFunctionToSupertypeFix.FunctionData..AddFunctionToSupertypeFix.FunctionData?)>..List<(AddFunctionToSupertypeFix.FunctionData..AddFunctionToSupertypeFix.FunctionData?)>?)) defined in com.intellij.openapi.ui.popup.util.BaseListPopupStep[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> FunctionData

'functions' @ [103:72] ==> private final val functions: List<AddFunctionToSupertypeFix.FunctionData> defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionToSupertypeFix[PropertyDescriptorImpl]

'finalChoice' @ [107:21] ==> value-parameter finalChoice: Boolean defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionToSupertypeFix.createFunctionPopup.<no name provided>.onChosen[ValueParameterDescriptorImpl]

'addFunction' @ [108:21] ==> private final fun addFunction(functionData: AddFunctionToSupertypeFix.FunctionData, project: Project): Unit defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionToSupertypeFix[SimpleFunctionDescriptorImpl]

'selectedValue' @ [108:33] ==> value-parameter selectedValue: AddFunctionToSupertypeFix.FunctionData defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionToSupertypeFix.createFunctionPopup.<no name provided>.onChosen[ValueParameterDescriptorImpl]

'project' @ [108:48] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionToSupertypeFix.createFunctionPopup[ValueParameterDescriptorImpl]

'FINAL_CHOICE' @ [110:34] ==> public final val FINAL_CHOICE: raw (PopupStep<(Any..Any?)>..PopupStep<*>?) defined in com.intellij.openapi.ui.popup.PopupStep[JavaPropertyDescriptor]

'FUNCTION_ICON' @ [113:74] ==> public final val FUNCTION_ICON: (Icon..Icon?) defined in com.intellij.util.PlatformIcons[JavaPropertyDescriptor]

'actionName' @ [114:60] ==> private final fun actionName(functionData: AddFunctionToSupertypeFix.FunctionData): String defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionToSupertypeFix[SimpleFunctionDescriptorImpl]

'value' @ [114:71] ==> value-parameter value: AddFunctionToSupertypeFix.FunctionData defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionToSupertypeFix.createFunctionPopup.<no name provided>.getTextFor[ValueParameterDescriptorImpl]

'functionData' @ [119:23] ==> value-parameter functionData: AddFunctionToSupertypeFix.FunctionData defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionToSupertypeFix.actionName[ValueParameterDescriptorImpl]

'signaturePreview' @ [119:36] ==> public final val signaturePreview: String defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionToSupertypeFix.FunctionData[PropertyDescriptorImpl]

'functionData' @ [119:61] ==> value-parameter functionData: AddFunctionToSupertypeFix.FunctionData defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionToSupertypeFix.actionName[ValueParameterDescriptorImpl]

'targetClass' @ [119:74] ==> public final val targetClass: KtClass defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionToSupertypeFix.FunctionData[PropertyDescriptorImpl]

'name' @ [119:86] ==> public final val KtClass.name: String?[MyPropertyDescriptor]

'KotlinSingleIntentionActionFactory' @ [121:23] ==> public constructor KotlinSingleIntentionActionFactory() defined in org.jetbrains.kotlin.idea.quickfix.KotlinSingleIntentionActionFactory[ClassConstructorDescriptorImpl]

'diagnostic' @ [123:28] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionToSupertypeFix.Companion.createAction[ValueParameterDescriptorImpl]

'psiElement' @ [123:39] ==> public final val Diagnostic.psiElement: PsiElement[MyPropertyDescriptor]

'generateFunctionsToAdd' @ [125:31] ==> private final fun generateFunctionsToAdd(functionElement: KtNamedFunction): List<FunctionDescriptor> defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionToSupertypeFix.Companion[SimpleFunctionDescriptorImpl]

'function' @ [125:54] ==> val function: KtNamedFunction defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionToSupertypeFix.Companion.createAction[LocalVariableDescriptor]

'descriptors' @ [126:17] ==> val descriptors: List<FunctionDescriptor> defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionToSupertypeFix.Companion.createAction[LocalVariableDescriptor]

'isEmpty' @ [126:29] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'diagnostic' @ [128:27] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionToSupertypeFix.Companion.createAction[ValueParameterDescriptorImpl]

'psiFile' @ [128:38] ==> public final val Diagnostic.psiFile: PsiFile[MyPropertyDescriptor]

'project' @ [128:46] ==> public final val PsiFile.project: Project[MyPropertyDescriptor]

'descriptors' @ [129:32] ==> val descriptors: List<FunctionDescriptor> defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionToSupertypeFix.Companion.createAction[LocalVariableDescriptor]

'mapNotNull' @ [129:44] ==> public inline fun <T, R : Any> Iterable<FunctionDescriptor>.mapNotNull(transform: (FunctionDescriptor) -> AddFunctionToSupertypeFix.FunctionData?): List<AddFunctionToSupertypeFix.FunctionData> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FunctionDescriptor
    <R : Any> -> FunctionData

'createFunctionData' @ [129:57] ==> private final fun createFunctionData(functionDescriptor: FunctionDescriptor, project: Project): AddFunctionToSupertypeFix.FunctionData? defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionToSupertypeFix.Companion[SimpleFunctionDescriptorImpl]

'it' @ [129:76] ==> value-parameter it: FunctionDescriptor defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionToSupertypeFix.Companion.createAction.<anonymous>[ValueParameterDescriptorImpl]

'project' @ [129:80] ==> val project: Project defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionToSupertypeFix.Companion.createAction[LocalVariableDescriptor]

'functionData' @ [130:17] ==> val functionData: List<AddFunctionToSupertypeFix.FunctionData> defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionToSupertypeFix.Companion.createAction[LocalVariableDescriptor]

'isEmpty' @ [130:30] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'AddFunctionToSupertypeFix' @ [132:20] ==> private constructor AddFunctionToSupertypeFix(element: KtNamedFunction, functions: List<AddFunctionToSupertypeFix.FunctionData>) defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionToSupertypeFix[ClassConstructorDescriptorImpl]

'function' @ [132:46] ==> val function: KtNamedFunction defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionToSupertypeFix.Companion.createAction[LocalVariableDescriptor]

'functionData' @ [132:56] ==> val functionData: List<AddFunctionToSupertypeFix.FunctionData> defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionToSupertypeFix.Companion.createAction[LocalVariableDescriptor]

'functionDescriptor' @ [136:35] ==> value-parameter functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionToSupertypeFix.Companion.createFunctionData[ValueParameterDescriptorImpl]

'containingDeclaration' @ [136:54] ==> public final val FunctionDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'IdeDescriptorRenderers' @ [138:30] ==> public object IdeDescriptorRenderers defined in org.jetbrains.kotlin.idea.util[FakeCallableDescriptorForObject]

'SOURCE_CODE' @ [138:53] ==> @field:JvmField public final val SOURCE_CODE: DescriptorRenderer defined in org.jetbrains.kotlin.idea.util.IdeDescriptorRenderers[DeserializedPropertyDescriptor]

'render' @ [138:65] ==> public abstract fun render(declarationDescriptor: DeclarationDescriptor): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'functionDescriptor' @ [138:72] ==> value-parameter functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionToSupertypeFix.Companion.createFunctionData[ValueParameterDescriptorImpl]

'classDescriptor' @ [139:17] ==> val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionToSupertypeFix.Companion.createFunctionData[LocalVariableDescriptor]

'kind' @ [139:33] ==> public final val ClassDescriptor.kind: ClassKind[MyPropertyDescriptor]

'INTERFACE' @ [139:51] ==> enum entry INTERFACE defined in org.jetbrains.kotlin.descriptors.ClassKind[FakeCallableDescriptorForObject]

'functionDescriptor' @ [139:64] ==> value-parameter functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionToSupertypeFix.Companion.createFunctionData[ValueParameterDescriptorImpl]

'modality' @ [139:83] ==> public final val FunctionDescriptor.modality: Modality[MyPropertyDescriptor]

'Modality' @ [139:95] ==> public companion object defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'ABSTRACT' @ [139:104] ==> enum entry ABSTRACT defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'functionDescriptor' @ [140:34] ==> value-parameter functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionToSupertypeFix.Companion.createFunctionData[ValueParameterDescriptorImpl]

'returnType' @ [140:53] ==> public final val FunctionDescriptor.returnType: KotlinType?[MyPropertyDescriptor]

'sourceCode' @ [141:17] ==> var sourceCode: String defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionToSupertypeFix.Companion.createFunctionData[LocalVariableDescriptor]

'if (returnType == null || !KotlinBuiltIns.isUnit(returnType)) {
                    val bodyText = getFunctionBodyTextFromTemplate(
                            project,
                            TemplateKind.FUNCTION,
                            functionDescriptor.name.asString(),
                            functionDescriptor.returnType?.let { IdeDescriptorRenderers.SOURCE_CODE.renderType(it) } ?: "Unit",
                            classDescriptor.importableFqName
                    )
                    "{ $bodyText }"
                }
                else {
                    "{}"
                }' @ [141:31] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'returnType' @ [141:35] ==> val returnType: KotlinType? defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionToSupertypeFix.Companion.createFunctionData[LocalVariableDescriptor]

'!' @ [141:57] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isUnit' @ [141:73] ==> public open fun isUnit(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'returnType' @ [141:80] ==> val returnType: KotlinType? defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionToSupertypeFix.Companion.createFunctionData[LocalVariableDescriptor]

'getFunctionBodyTextFromTemplate' @ [142:36] ==> public fun getFunctionBodyTextFromTemplate(project: Project, kind: TemplateKind, name: String?, returnType: String, classFqName: FqName? = ...): String defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'project' @ [143:29] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionToSupertypeFix.Companion.createFunctionData[ValueParameterDescriptorImpl]

'FUNCTION' @ [144:42] ==> enum entry FUNCTION defined in org.jetbrains.kotlin.idea.core.TemplateKind[FakeCallableDescriptorForObject]

'functionDescriptor' @ [145:29] ==> value-parameter functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionToSupertypeFix.Companion.createFunctionData[ValueParameterDescriptorImpl]

'name' @ [145:48] ==> public final val FunctionDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [145:53] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'functionDescriptor' @ [146:29] ==> value-parameter functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionToSupertypeFix.Companion.createFunctionData[ValueParameterDescriptorImpl]

'returnType' @ [146:48] ==> public final val FunctionDescriptor.returnType: KotlinType?[MyPropertyDescriptor]

'let' @ [146:60] ==> @InlineOnly public inline fun <T, R> KotlinType.let(block: (KotlinType) -> String): String defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType
    <R> -> String

'IdeDescriptorRenderers' @ [146:66] ==> public object IdeDescriptorRenderers defined in org.jetbrains.kotlin.idea.util[FakeCallableDescriptorForObject]

'SOURCE_CODE' @ [146:89] ==> @field:JvmField public final val SOURCE_CODE: DescriptorRenderer defined in org.jetbrains.kotlin.idea.util.IdeDescriptorRenderers[DeserializedPropertyDescriptor]

'renderType' @ [146:101] ==> public abstract fun renderType(type: KotlinType): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'it' @ [146:112] ==> value-parameter it: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionToSupertypeFix.Companion.createFunctionData.<anonymous>[ValueParameterDescriptorImpl]

'classDescriptor' @ [147:29] ==> val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionToSupertypeFix.Companion.createFunctionData[LocalVariableDescriptor]

'importableFqName' @ [147:45] ==> public val DeclarationDescriptor.importableFqName: FqName? defined in org.jetbrains.kotlin.idea.imports[DeserializedPropertyDescriptor]

'bodyText' @ [149:25] ==> val bodyText: String defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionToSupertypeFix.Companion.createFunctionData[LocalVariableDescriptor]

'DescriptorToSourceUtilsIde' @ [156:31] ==> public object DescriptorToSourceUtilsIde defined in org.jetbrains.kotlin.idea.codeInsight[FakeCallableDescriptorForObject]

'getAnyDeclaration' @ [156:58] ==> public final fun getAnyDeclaration(project: Project, descriptor: DeclarationDescriptor): PsiElement? defined in org.jetbrains.kotlin.idea.codeInsight.DescriptorToSourceUtilsIde[DeserializedSimpleFunctionDescriptor]

'project' @ [156:76] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionToSupertypeFix.Companion.createFunctionData[ValueParameterDescriptorImpl]

'classDescriptor' @ [156:85] ==> val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionToSupertypeFix.Companion.createFunctionData[LocalVariableDescriptor]

'FunctionData' @ [157:20] ==> public constructor FunctionData(signaturePreview: String, sourceCode: String, targetClass: KtClass) defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionToSupertypeFix.FunctionData[ClassConstructorDescriptorImpl]

'IdeDescriptorRenderers' @ [158:21] ==> public object IdeDescriptorRenderers defined in org.jetbrains.kotlin.idea.util[FakeCallableDescriptorForObject]

'SOURCE_CODE_SHORT_NAMES_IN_TYPES' @ [158:44] ==> @field:JvmField public final val SOURCE_CODE_SHORT_NAMES_IN_TYPES: DescriptorRenderer defined in org.jetbrains.kotlin.idea.util.IdeDescriptorRenderers[DeserializedPropertyDescriptor]

'render' @ [158:77] ==> public abstract fun render(declarationDescriptor: DeclarationDescriptor): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'functionDescriptor' @ [158:84] ==> value-parameter functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionToSupertypeFix.Companion.createFunctionData[ValueParameterDescriptorImpl]

'sourceCode' @ [159:21] ==> var sourceCode: String defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionToSupertypeFix.Companion.createFunctionData[LocalVariableDescriptor]

'targetClass' @ [160:21] ==> val targetClass: KtClass defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionToSupertypeFix.Companion.createFunctionData[LocalVariableDescriptor]

'functionElement' @ [164:38] ==> value-parameter functionElement: KtNamedFunction defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionToSupertypeFix.Companion.generateFunctionsToAdd[ValueParameterDescriptorImpl]

'resolveToDescriptorIfAny' @ [164:54] ==> public fun KtDeclaration.resolveToDescriptorIfAny(bodyResolveMode: BodyResolveMode = ...): DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'FULL' @ [164:95] ==> enum entry FULL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'emptyList' @ [165:48] ==> public fun <T> emptyList(): List<FunctionDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FunctionDescriptor

'functionDescriptor' @ [167:35] ==> val functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionToSupertypeFix.Companion.generateFunctionsToAdd[LocalVariableDescriptor]

'containingDeclaration' @ [167:54] ==> public final val FunctionDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'emptyList' @ [167:106] ==> public fun <T> emptyList(): List<FunctionDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FunctionDescriptor

'getSuperClasses' @ [170:20] ==> private final fun getSuperClasses(classDescriptor: ClassDescriptor): List<ClassDescriptor> defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionToSupertypeFix.Companion[SimpleFunctionDescriptorImpl]

'containingClass' @ [170:36] ==> val containingClass: ClassDescriptor defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionToSupertypeFix.Companion.generateFunctionsToAdd[LocalVariableDescriptor]

'filterNot' @ [171:22] ==> public inline fun <T> Iterable<ClassDescriptor>.filterNot(predicate: (ClassDescriptor) -> Boolean): List<ClassDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassDescriptor

'isAnyOrNullableAny' @ [171:49] ==> public open fun isAnyOrNullableAny(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'it' @ [171:68] ==> value-parameter it: ClassDescriptor defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionToSupertypeFix.Companion.generateFunctionsToAdd.<anonymous>[ValueParameterDescriptorImpl]

'defaultType' @ [171:71] ==> public final val ClassDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'map' @ [172:22] ==> public inline fun <T, R> Iterable<ClassDescriptor>.map(transform: (ClassDescriptor) -> FunctionDescriptor): List<FunctionDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassDescriptor
    <R> -> FunctionDescriptor

'generateFunctionSignatureForType' @ [172:28] ==> private final fun generateFunctionSignatureForType(functionDescriptor: FunctionDescriptor, typeDescriptor: ClassDescriptor): FunctionDescriptor defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionToSupertypeFix.Companion[SimpleFunctionDescriptorImpl]

'functionDescriptor' @ [172:61] ==> val functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionToSupertypeFix.Companion.generateFunctionsToAdd[LocalVariableDescriptor]

'it' @ [172:81] ==> value-parameter it: ClassDescriptor defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionToSupertypeFix.Companion.generateFunctionsToAdd.<anonymous>[ValueParameterDescriptorImpl]

'classDescriptor' @ [176:30] ==> value-parameter classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionToSupertypeFix.Companion.getSuperClasses[ValueParameterDescriptorImpl]

'defaultType' @ [176:46] ==> public final val ClassDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'supertypes' @ [176:58] ==> public fun KotlinType.supertypes(): Collection<KotlinType> defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'sortedWith' @ [176:71] ==> public fun <T> Iterable<KotlinType>.sortedWith(comparator: Comparator<in KotlinType> /* = Comparator<in KotlinType> */): List<KotlinType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType

'Comparator' @ [177:21] ==> @FunctionalInterface public fun <T : (Any..Any?)> Comparator(function: ((KotlinType..KotlinType?), (KotlinType..KotlinType?)) -> Int): Comparator<KotlinType> defined in java.util[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : (Any..Any?)> -> KotlinType

'when {
                            o1 == o2 -> 0
                            KotlinTypeChecker.DEFAULT.isSubtypeOf(o1, o2) -> -1
                            KotlinTypeChecker.DEFAULT.isSubtypeOf(o2, o1) -> 1
                            else -> o1.toString().compareTo(o2.toString())
                        }' @ [178:25] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Int, entry1: Int, entry2: Int, entry3: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Int

'o1' @ [179:29] ==> value-parameter o1: (KotlinType..KotlinType?) defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionToSupertypeFix.Companion.getSuperClasses.<anonymous>[ValueParameterDescriptorImpl]

'o2' @ [179:35] ==> value-parameter o2: (KotlinType..KotlinType?) defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionToSupertypeFix.Companion.getSuperClasses.<anonymous>[ValueParameterDescriptorImpl]

'DEFAULT' @ [180:47] ==> public final val DEFAULT: (KotlinTypeChecker..KotlinTypeChecker?) defined in org.jetbrains.kotlin.types.checker.KotlinTypeChecker[JavaPropertyDescriptor]

'isSubtypeOf' @ [180:55] ==> public abstract fun isSubtypeOf(@NotNull p0: KotlinType, @NotNull p1: KotlinType): Boolean defined in org.jetbrains.kotlin.types.checker.KotlinTypeChecker[JavaMethodDescriptor]

'o1' @ [180:67] ==> value-parameter o1: (KotlinType..KotlinType?) defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionToSupertypeFix.Companion.getSuperClasses.<anonymous>[ValueParameterDescriptorImpl]

'o2' @ [180:71] ==> value-parameter o2: (KotlinType..KotlinType?) defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionToSupertypeFix.Companion.getSuperClasses.<anonymous>[ValueParameterDescriptorImpl]

'-' @ [180:78] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'DEFAULT' @ [181:47] ==> public final val DEFAULT: (KotlinTypeChecker..KotlinTypeChecker?) defined in org.jetbrains.kotlin.types.checker.KotlinTypeChecker[JavaPropertyDescriptor]

'isSubtypeOf' @ [181:55] ==> public abstract fun isSubtypeOf(@NotNull p0: KotlinType, @NotNull p1: KotlinType): Boolean defined in org.jetbrains.kotlin.types.checker.KotlinTypeChecker[JavaMethodDescriptor]

'o2' @ [181:67] ==> value-parameter o2: (KotlinType..KotlinType?) defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionToSupertypeFix.Companion.getSuperClasses.<anonymous>[ValueParameterDescriptorImpl]

'o1' @ [181:71] ==> value-parameter o1: (KotlinType..KotlinType?) defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionToSupertypeFix.Companion.getSuperClasses.<anonymous>[ValueParameterDescriptorImpl]

'o1' @ [182:37] ==> value-parameter o1: (KotlinType..KotlinType?) defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionToSupertypeFix.Companion.getSuperClasses.<anonymous>[ValueParameterDescriptorImpl]

'toString' @ [182:40] ==> public open fun toString(): String defined in org.jetbrains.kotlin.types.KotlinType[DeserializedSimpleFunctionDescriptor]

'compareTo' @ [182:51] ==> public open fun compareTo(other: String): Int defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'o2' @ [182:61] ==> value-parameter o2: (KotlinType..KotlinType?) defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionToSupertypeFix.Companion.getSuperClasses.<anonymous>[ValueParameterDescriptorImpl]

'toString' @ [182:64] ==> public open fun toString(): String defined in org.jetbrains.kotlin.types.KotlinType[DeserializedSimpleFunctionDescriptor]

'supertypes' @ [187:20] ==> val supertypes: List<KotlinType> defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionToSupertypeFix.Companion.getSuperClasses[LocalVariableDescriptor]

'mapNotNull' @ [187:31] ==> public inline fun <T, R : Any> Iterable<KotlinType>.mapNotNull(transform: (KotlinType) -> ClassDescriptor?): List<ClassDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType
    <R : Any> -> ClassDescriptor

'it' @ [187:44] ==> value-parameter it: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionToSupertypeFix.Companion.getSuperClasses.<anonymous>[ValueParameterDescriptorImpl]

'constructor' @ [187:47] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [187:59] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'if (typeDescriptor.kind == ClassKind.INTERFACE) Modality.ABSTRACT else typeDescriptor.modality' @ [193:28] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Modality, elseBranch: Modality): Modality[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Modality

'typeDescriptor' @ [193:32] ==> value-parameter typeDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionToSupertypeFix.Companion.generateFunctionSignatureForType[ValueParameterDescriptorImpl]

'kind' @ [193:47] ==> public final val ClassDescriptor.kind: ClassKind[MyPropertyDescriptor]

'INTERFACE' @ [193:65] ==> enum entry INTERFACE defined in org.jetbrains.kotlin.descriptors.ClassKind[FakeCallableDescriptorForObject]

'Modality' @ [193:76] ==> public companion object defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'ABSTRACT' @ [193:85] ==> enum entry ABSTRACT defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'typeDescriptor' @ [193:99] ==> value-parameter typeDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionToSupertypeFix.Companion.generateFunctionSignatureForType[ValueParameterDescriptorImpl]

'modality' @ [193:114] ==> public final val ClassDescriptor.modality: Modality[MyPropertyDescriptor]

'functionDescriptor' @ [195:20] ==> value-parameter functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionToSupertypeFix.Companion.generateFunctionSignatureForType[ValueParameterDescriptorImpl]

'copy' @ [195:39] ==> @NotNull public abstract fun copy(p0: (DeclarationDescriptor..DeclarationDescriptor?), p1: (Modality..Modality?), p2: (Visibility..Visibility?), p3: (CallableMemberDescriptor.Kind..CallableMemberDescriptor.Kind?), p4: Boolean): FunctionDescriptor defined in org.jetbrains.kotlin.descriptors.FunctionDescriptor[JavaMethodDescriptor]

'typeDescriptor' @ [196:21] ==> value-parameter typeDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionToSupertypeFix.Companion.generateFunctionSignatureForType[ValueParameterDescriptorImpl]

'modality' @ [197:21] ==> val modality: Modality defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionToSupertypeFix.Companion.generateFunctionSignatureForType[LocalVariableDescriptor]

'functionDescriptor' @ [198:21] ==> value-parameter functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionToSupertypeFix.Companion.generateFunctionSignatureForType[ValueParameterDescriptorImpl]

'visibility' @ [198:40] ==> public final val FunctionDescriptor.visibility: Visibility[MyPropertyDescriptor]

'DECLARATION' @ [199:51] ==> enum entry DECLARATION defined in org.jetbrains.kotlin.descriptors.CallableMemberDescriptor.Kind[FakeCallableDescriptorForObject]

