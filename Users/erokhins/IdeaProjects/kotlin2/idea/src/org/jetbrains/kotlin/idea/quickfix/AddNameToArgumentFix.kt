'KotlinQuickFixAction<KtValueArgument>' @ [42:57] ==> public constructor KotlinQuickFixAction<out T : PsiElement>(element: KtValueArgument) defined in org.jetbrains.kotlin.idea.quickfix.KotlinQuickFixAction[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : PsiElement> -> KtValueArgument

'argument' @ [42:95] ==> value-parameter argument: KtValueArgument defined in org.jetbrains.kotlin.idea.quickfix.AddNameToArgumentFix.<init>[ValueParameterDescriptorImpl]

'element' @ [44:23] ==> protected final val element: KtValueArgument? defined in org.jetbrains.kotlin.idea.quickfix.AddNameToArgumentFix[PropertyDescriptorImpl]

'!' @ [45:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'super' @ [45:14] ==> <this> defined in org.jetbrains.kotlin.idea.quickfix.AddNameToArgumentFix[LazyClassReceiverParameterDescriptor]

'isAvailable' @ [45:20] ==> public open fun isAvailable(project: Project, editor: Editor?, file: PsiFile): Boolean defined in org.jetbrains.kotlin.idea.quickfix.KotlinQuickFixAction[SimpleFunctionDescriptorImpl]

'project' @ [45:32] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.AddNameToArgumentFix.isAvailable[ValueParameterDescriptorImpl]

'editor' @ [45:41] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.quickfix.AddNameToArgumentFix.isAvailable[ValueParameterDescriptorImpl]

'file' @ [45:49] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.quickfix.AddNameToArgumentFix.isAvailable[ValueParameterDescriptorImpl]

'element' @ [46:13] ==> val element: KtValueArgument defined in org.jetbrains.kotlin.idea.quickfix.AddNameToArgumentFix.isAvailable[LocalVariableDescriptor]

'getArgumentExpression' @ [46:21] ==> @IfNotParsed @Nullable public open fun getArgumentExpression(): KtExpression? defined in org.jetbrains.kotlin.psi.KtValueArgument[JavaMethodDescriptor]

'calculatePossibleArgumentNames' @ [47:16] ==> private final fun calculatePossibleArgumentNames(): List<Name> defined in org.jetbrains.kotlin.idea.quickfix.AddNameToArgumentFix[SimpleFunctionDescriptorImpl]

'isNotEmpty' @ [47:49] ==> @InlineOnly public inline fun <T> Collection<Name>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Name

'element' @ [51:23] ==> protected final val element: KtValueArgument? defined in org.jetbrains.kotlin.idea.quickfix.AddNameToArgumentFix[PropertyDescriptorImpl]

'calculatePossibleArgumentNames' @ [52:29] ==> private final fun calculatePossibleArgumentNames(): List<Name> defined in org.jetbrains.kotlin.idea.quickfix.AddNameToArgumentFix[SimpleFunctionDescriptorImpl]

'assert' @ [53:9] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'possibleNames' @ [53:16] ==> val possibleNames: List<Name> defined in org.jetbrains.kotlin.idea.quickfix.AddNameToArgumentFix.invoke[LocalVariableDescriptor]

'isNotEmpty' @ [53:30] ==> @InlineOnly public inline fun <T> Collection<Name>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Name

'if (possibleNames.size == 1 || editor == null || !editor.component.isShowing) {
            addName(project, element, possibleNames.first())
        }
        else {
            chooseNameAndAdd(project, editor, possibleNames)
        }' @ [54:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'possibleNames' @ [54:13] ==> val possibleNames: List<Name> defined in org.jetbrains.kotlin.idea.quickfix.AddNameToArgumentFix.invoke[LocalVariableDescriptor]

'size' @ [54:27] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'editor' @ [54:40] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.quickfix.AddNameToArgumentFix.invoke[ValueParameterDescriptorImpl]

'!' @ [54:58] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'editor' @ [54:59] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.quickfix.AddNameToArgumentFix.invoke[ValueParameterDescriptorImpl]

'component' @ [54:66] ==> public final val Editor.component: JComponent[MyPropertyDescriptor]

'isShowing' @ [54:76] ==> public final val JComponent.isShowing: Boolean[MyPropertyDescriptor]

'addName' @ [55:13] ==> private final fun addName(project: Project, argument: KtValueArgument, name: Name): Unit defined in org.jetbrains.kotlin.idea.quickfix.AddNameToArgumentFix[SimpleFunctionDescriptorImpl]

'project' @ [55:21] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.AddNameToArgumentFix.invoke[ValueParameterDescriptorImpl]

'element' @ [55:30] ==> val element: KtValueArgument defined in org.jetbrains.kotlin.idea.quickfix.AddNameToArgumentFix.invoke[LocalVariableDescriptor]

'possibleNames' @ [55:39] ==> val possibleNames: List<Name> defined in org.jetbrains.kotlin.idea.quickfix.AddNameToArgumentFix.invoke[LocalVariableDescriptor]

'first' @ [55:53] ==> public fun <T> List<Name>.first(): Name defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Name

'chooseNameAndAdd' @ [58:13] ==> private final fun chooseNameAndAdd(project: Project, editor: Editor, names: List<Name>): Unit defined in org.jetbrains.kotlin.idea.quickfix.AddNameToArgumentFix[SimpleFunctionDescriptorImpl]

'project' @ [58:30] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.AddNameToArgumentFix.invoke[ValueParameterDescriptorImpl]

'editor' @ [58:39] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.quickfix.AddNameToArgumentFix.invoke[ValueParameterDescriptorImpl]

'possibleNames' @ [58:47] ==> val possibleNames: List<Name> defined in org.jetbrains.kotlin.idea.quickfix.AddNameToArgumentFix.invoke[LocalVariableDescriptor]

'calculatePossibleArgumentNames' @ [63:16] ==> private final fun calculatePossibleArgumentNames(): List<Name> defined in org.jetbrains.kotlin.idea.quickfix.AddNameToArgumentFix[SimpleFunctionDescriptorImpl]

'singleOrNull' @ [64:25] ==> public fun <T> List<Name>.singleOrNull(): Name? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Name

'let' @ [65:26] ==> @InlineOnly public inline fun <T, R> Name.let(block: (Name) -> String): String defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Name
    <R> -> String

'createArgumentWithName' @ [65:58] ==> private final fun createArgumentWithName(name: Name): KtValueArgument defined in org.jetbrains.kotlin.idea.quickfix.AddNameToArgumentFix[SimpleFunctionDescriptorImpl]

'it' @ [65:81] ==> value-parameter it: Name defined in org.jetbrains.kotlin.idea.quickfix.AddNameToArgumentFix.getText.<anonymous>[ValueParameterDescriptorImpl]

'text' @ [65:85] ==> public final val KtValueArgument.text: (String..String?)[MyPropertyDescriptor]

'element' @ [72:27] ==> protected final val element: KtValueArgument? defined in org.jetbrains.kotlin.idea.quickfix.AddNameToArgumentFix[PropertyDescriptorImpl]

'getParentOfType' @ [72:37] ==> public inline fun <reified T : PsiElement> PsiElement.getParentOfType(strict: Boolean): KtCallElement? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtCallElement

'emptyList' @ [72:84] ==> public fun <T> emptyList(): List<Name> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Name

'element' @ [74:23] ==> protected final val element: KtValueArgument? defined in org.jetbrains.kotlin.idea.quickfix.AddNameToArgumentFix[PropertyDescriptorImpl]

'analyze' @ [74:33] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'PARTIAL' @ [74:57] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'callElement' @ [75:28] ==> val callElement: KtCallElement defined in org.jetbrains.kotlin.idea.quickfix.AddNameToArgumentFix.calculatePossibleArgumentNames[LocalVariableDescriptor]

'getResolvedCall' @ [75:40] ==> public fun KtElement?.getResolvedCall(context: BindingContext): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'context' @ [75:56] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.quickfix.AddNameToArgumentFix.calculatePossibleArgumentNames[LocalVariableDescriptor]

'emptyList' @ [75:75] ==> public fun <T> emptyList(): List<Name> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Name

'element' @ [77:28] ==> protected final val element: KtValueArgument? defined in org.jetbrains.kotlin.idea.quickfix.AddNameToArgumentFix[PropertyDescriptorImpl]

'getArgumentExpression' @ [77:38] ==> @IfNotParsed @Nullable public open fun getArgumentExpression(): KtExpression? defined in org.jetbrains.kotlin.psi.KtValueArgument[JavaMethodDescriptor]

'let' @ [77:63] ==> @InlineOnly public inline fun <T, R> KtExpression.let(block: (KtExpression) -> KotlinType?): KotlinType? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression
    <R> -> KotlinType?

'context' @ [77:69] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.quickfix.AddNameToArgumentFix.calculatePossibleArgumentNames[LocalVariableDescriptor]

'getType' @ [77:77] ==> @Nullable public abstract fun getType(@NotNull p0: KtExpression): KotlinType? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]

'it' @ [77:85] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.AddNameToArgumentFix.calculatePossibleArgumentNames.<anonymous>[ValueParameterDescriptorImpl]

'resolvedCall' @ [79:30] ==> val resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.idea.quickfix.AddNameToArgumentFix.calculatePossibleArgumentNames[LocalVariableDescriptor]

'call' @ [79:43] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.call: Call[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(out CallableDescriptor)

'valueArguments' @ [79:48] ==> public final val Call.valueArguments: List<(ValueArgument..ValueArgument?)>[MyPropertyDescriptor]

'map' @ [80:18] ==> public inline fun <T, R> Iterable<(ValueArgument..ValueArgument?)>.map(transform: ((ValueArgument..ValueArgument?)) -> ArgumentMapping): List<ArgumentMapping> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.ValueArgument..org.jetbrains.kotlin.psi.ValueArgument?)
    <R> -> ArgumentMapping

'resolvedCall' @ [80:24] ==> val resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.idea.quickfix.AddNameToArgumentFix.calculatePossibleArgumentNames[LocalVariableDescriptor]

'getArgumentMapping' @ [80:37] ==> @NotNull public abstract fun getArgumentMapping(@NotNull p0: ValueArgument): ArgumentMapping defined in org.jetbrains.kotlin.resolve.calls.model.ResolvedCall[JavaMethodDescriptor]

'it' @ [80:56] ==> value-parameter it: (ValueArgument..ValueArgument?) defined in org.jetbrains.kotlin.idea.quickfix.AddNameToArgumentFix.calculatePossibleArgumentNames.<anonymous>[ValueParameterDescriptorImpl]

'filterIsInstance' @ [81:18] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<ArgumentMatch> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> ArgumentMatch

'filter' @ [82:18] ==> public inline fun <T> Iterable<ArgumentMatch>.filter(predicate: (ArgumentMatch) -> Boolean): List<ArgumentMatch> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ArgumentMatch

'argumentType' @ [82:44] ==> val argumentType: KotlinType? defined in org.jetbrains.kotlin.idea.quickfix.AddNameToArgumentFix.calculatePossibleArgumentNames[LocalVariableDescriptor]

'argumentType' @ [82:68] ==> val argumentType: KotlinType? defined in org.jetbrains.kotlin.idea.quickfix.AddNameToArgumentFix.calculatePossibleArgumentNames[LocalVariableDescriptor]

'isError' @ [82:81] ==> public val KotlinType.isError: Boolean defined in org.jetbrains.kotlin.types[DeserializedPropertyDescriptor]

'!' @ [82:92] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'argumentMatch' @ [82:93] ==> value-parameter argumentMatch: ArgumentMatch defined in org.jetbrains.kotlin.idea.quickfix.AddNameToArgumentFix.calculatePossibleArgumentNames.<anonymous>[ValueParameterDescriptorImpl]

'isError' @ [82:107] ==> public open fun isError(): Boolean defined in org.jetbrains.kotlin.resolve.calls.model.ArgumentMatch[DeserializedSimpleFunctionDescriptor]

'map' @ [83:18] ==> public inline fun <T, R> Iterable<ArgumentMatch>.map(transform: (ArgumentMatch) -> ValueParameterDescriptor): List<ValueParameterDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ArgumentMatch
    <R> -> ValueParameterDescriptor

'it' @ [83:24] ==> value-parameter it: ArgumentMatch defined in org.jetbrains.kotlin.idea.quickfix.AddNameToArgumentFix.calculatePossibleArgumentNames.<anonymous>[ValueParameterDescriptorImpl]

'valueParameter' @ [83:27] ==> public abstract val valueParameter: ValueParameterDescriptor defined in org.jetbrains.kotlin.resolve.calls.model.ArgumentMatch[DeserializedPropertyDescriptor]

'toSet' @ [84:18] ==> public fun <T> Iterable<ValueParameterDescriptor>.toSet(): Set<ValueParameterDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ValueParameterDescriptor

'resolvedCall' @ [86:16] ==> val resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.idea.quickfix.AddNameToArgumentFix.calculatePossibleArgumentNames[LocalVariableDescriptor]

'resultingDescriptor' @ [86:29] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.resultingDescriptor: CallableDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(out CallableDescriptor)

'valueParameters' @ [86:49] ==> public final val CallableDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'filter' @ [87:18] ==> public inline fun <T> Iterable<(ValueParameterDescriptor..ValueParameterDescriptor?)>.filter(predicate: ((ValueParameterDescriptor..ValueParameterDescriptor?)) -> Boolean): List<(ValueParameterDescriptor..ValueParameterDescriptor?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)

'it' @ [87:27] ==> value-parameter it: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.idea.quickfix.AddNameToArgumentFix.calculatePossibleArgumentNames.<anonymous>[ValueParameterDescriptorImpl]

'usedParameters' @ [87:34] ==> val usedParameters: Set<ValueParameterDescriptor> defined in org.jetbrains.kotlin.idea.quickfix.AddNameToArgumentFix.calculatePossibleArgumentNames[LocalVariableDescriptor]

'map' @ [88:18] ==> public inline fun <T, R> Iterable<(ValueParameterDescriptor..ValueParameterDescriptor?)>.map(transform: ((ValueParameterDescriptor..ValueParameterDescriptor?)) -> Name): List<Name> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)
    <R> -> Name

'it' @ [88:24] ==> value-parameter it: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.idea.quickfix.AddNameToArgumentFix.calculatePossibleArgumentNames.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [88:27] ==> public final val ValueParameterDescriptor.name: Name[MyPropertyDescriptor]

'project' @ [92:9] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.AddNameToArgumentFix.addName[ValueParameterDescriptorImpl]

'executeWriteCommand' @ [92:17] ==> public fun Project.executeWriteCommand(name: String, command: () -> Unit): Unit defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]

'argument' @ [93:13] ==> value-parameter argument: KtValueArgument defined in org.jetbrains.kotlin.idea.quickfix.AddNameToArgumentFix.addName[ValueParameterDescriptorImpl]

'replace' @ [93:22] ==> public open fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtValueArgument[JavaMethodDescriptor]

'createArgumentWithName' @ [93:30] ==> private final fun createArgumentWithName(name: Name): KtValueArgument defined in org.jetbrains.kotlin.idea.quickfix.AddNameToArgumentFix[SimpleFunctionDescriptorImpl]

'name' @ [93:53] ==> value-parameter name: Name defined in org.jetbrains.kotlin.idea.quickfix.AddNameToArgumentFix.addName[ValueParameterDescriptorImpl]

'element' @ [98:34] ==> protected final val element: KtValueArgument? defined in org.jetbrains.kotlin.idea.quickfix.AddNameToArgumentFix[PropertyDescriptorImpl]

'getArgumentExpression' @ [98:44] ==> @IfNotParsed @Nullable public open fun getArgumentExpression(): KtExpression? defined in org.jetbrains.kotlin.psi.KtValueArgument[JavaMethodDescriptor]

'KtPsiFactory' @ [99:16] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'element' @ [99:29] ==> protected final val element: KtValueArgument? defined in org.jetbrains.kotlin.idea.quickfix.AddNameToArgumentFix[PropertyDescriptorImpl]

'createArgument' @ [99:40] ==> public final fun createArgument(expression: KtExpression?, name: Name? = ..., isSpread: Boolean = ...): KtValueArgument defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'argumentExpression' @ [99:55] ==> val argumentExpression: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.AddNameToArgumentFix.createArgumentWithName[LocalVariableDescriptor]

'name' @ [99:75] ==> value-parameter name: Name defined in org.jetbrains.kotlin.idea.quickfix.AddNameToArgumentFix.createArgumentWithName[ValueParameterDescriptorImpl]

'element' @ [99:81] ==> protected final val element: KtValueArgument? defined in org.jetbrains.kotlin.idea.quickfix.AddNameToArgumentFix[PropertyDescriptorImpl]

'getSpreadElement' @ [99:91] ==> public open fun getSpreadElement(): LeafPsiElement? defined in org.jetbrains.kotlin.psi.KtValueArgument[JavaMethodDescriptor]

'getInstance' @ [103:24] ==> public open fun getInstance(): (JBPopupFactory..JBPopupFactory?) defined in com.intellij.openapi.ui.popup.JBPopupFactory[JavaMethodDescriptor]

'createListPopup' @ [103:38] ==> @NotNull public abstract fun createListPopup(@NotNull p0: raw (ListPopupStep<(Any..Any?)>..ListPopupStep<*>)): ListPopup defined in com.intellij.openapi.ui.popup.JBPopupFactory[JavaMethodDescriptor]

'getNamePopup' @ [103:54] ==> private final fun getNamePopup(project: Project, names: List<Name>): ListPopupStep<Name> defined in org.jetbrains.kotlin.idea.quickfix.AddNameToArgumentFix[SimpleFunctionDescriptorImpl]

'project' @ [103:67] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.AddNameToArgumentFix.chooseNameAndAdd[ValueParameterDescriptorImpl]

'names' @ [103:76] ==> value-parameter names: List<Name> defined in org.jetbrains.kotlin.idea.quickfix.AddNameToArgumentFix.chooseNameAndAdd[ValueParameterDescriptorImpl]

'showInBestPositionFor' @ [103:84] ==> public abstract fun showInBestPositionFor(@NotNull p0: Editor): Unit defined in com.intellij.openapi.ui.popup.ListPopup[JavaMethodDescriptor]

'editor' @ [103:106] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.quickfix.AddNameToArgumentFix.chooseNameAndAdd[ValueParameterDescriptorImpl]

'BaseListPopupStep<Name>' @ [107:25] ==> public constructor BaseListPopupStep<T : (Any..Any?)>(@Nullable p0: String?, p1: (MutableList<out (Name..Name?)>..List<(Name..Name?)>?)) defined in com.intellij.openapi.ui.popup.util.BaseListPopupStep[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Name

'names' @ [107:74] ==> value-parameter names: List<Name> defined in org.jetbrains.kotlin.idea.quickfix.AddNameToArgumentFix.getNamePopup[ValueParameterDescriptorImpl]

'addName' @ [109:17] ==> private final fun addName(project: Project, argument: KtValueArgument, name: Name): Unit defined in org.jetbrains.kotlin.idea.quickfix.AddNameToArgumentFix[SimpleFunctionDescriptorImpl]

'project' @ [109:25] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.AddNameToArgumentFix.getNamePopup[ValueParameterDescriptorImpl]

'element' @ [109:34] ==> protected final val element: KtValueArgument? defined in org.jetbrains.kotlin.idea.quickfix.AddNameToArgumentFix[PropertyDescriptorImpl]

'selectedValue' @ [109:45] ==> value-parameter selectedValue: Name defined in org.jetbrains.kotlin.idea.quickfix.AddNameToArgumentFix.getNamePopup.<no name provided>.onChosen[ValueParameterDescriptorImpl]

'FINAL_CHOICE' @ [110:34] ==> public final val FINAL_CHOICE: raw (PopupStep<(Any..Any?)>..PopupStep<*>?) defined in com.intellij.openapi.ui.popup.PopupStep[JavaPropertyDescriptor]

'PARAMETER' @ [113:63] ==> public final val PARAMETER: (Icon..Icon?) defined in org.jetbrains.kotlin.idea.KotlinIcons[JavaPropertyDescriptor]

'createArgumentWithName' @ [115:51] ==> private final fun createArgumentWithName(name: Name): KtValueArgument defined in org.jetbrains.kotlin.idea.quickfix.AddNameToArgumentFix[SimpleFunctionDescriptorImpl]

'name' @ [115:74] ==> value-parameter name: Name defined in org.jetbrains.kotlin.idea.quickfix.AddNameToArgumentFix.getNamePopup.<no name provided>.getTextFor[ValueParameterDescriptorImpl]

'text' @ [115:80] ==> public final val KtValueArgument.text: (String..String?)[MyPropertyDescriptor]

'KotlinSingleIntentionActionFactory' @ [119:24] ==> public constructor KotlinSingleIntentionActionFactory() defined in org.jetbrains.kotlin.idea.quickfix.KotlinSingleIntentionActionFactory[ClassConstructorDescriptorImpl]

'diagnostic' @ [121:28] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.AddNameToArgumentFix.Companion.createAction[ValueParameterDescriptorImpl]

'psiElement' @ [121:39] ==> public final val Diagnostic.psiElement: PsiElement[MyPropertyDescriptor]

'getParentOfType' @ [121:50] ==> public inline fun <reified T : PsiElement> PsiElement.getParentOfType(strict: Boolean): KtValueArgument? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtValueArgument

'AddNameToArgumentFix' @ [122:20] ==> public constructor AddNameToArgumentFix(argument: KtValueArgument) defined in org.jetbrains.kotlin.idea.quickfix.AddNameToArgumentFix[ClassConstructorDescriptorImpl]

'argument' @ [122:41] ==> val argument: KtValueArgument defined in org.jetbrains.kotlin.idea.quickfix.AddNameToArgumentFix.Companion.createAction[LocalVariableDescriptor]

