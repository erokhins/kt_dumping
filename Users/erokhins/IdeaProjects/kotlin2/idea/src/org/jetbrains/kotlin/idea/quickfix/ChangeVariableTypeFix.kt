'KotlinQuickFixAction<KtVariableDeclaration>' @ [43:86] ==> public constructor KotlinQuickFixAction<out T : PsiElement>(element: KtVariableDeclaration) defined in org.jetbrains.kotlin.idea.quickfix.KotlinQuickFixAction[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : PsiElement> -> KtVariableDeclaration

'element' @ [43:130] ==> value-parameter element: KtVariableDeclaration defined in org.jetbrains.kotlin.idea.quickfix.ChangeVariableTypeFix.<init>[ValueParameterDescriptorImpl]

'containsErrorType' @ [44:48] ==> public open fun containsErrorType(@Nullable p0: KotlinType?): Boolean defined in org.jetbrains.kotlin.types.ErrorUtils[JavaMethodDescriptor]

'type' @ [44:66] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.ChangeVariableTypeFix.<init>[ValueParameterDescriptorImpl]

'IdeDescriptorRenderers' @ [45:36] ==> public object IdeDescriptorRenderers defined in org.jetbrains.kotlin.idea.util[FakeCallableDescriptorForObject]

'SOURCE_CODE_SHORT_NAMES_IN_TYPES' @ [45:59] ==> @field:JvmField public final val SOURCE_CODE_SHORT_NAMES_IN_TYPES: DescriptorRenderer defined in org.jetbrains.kotlin.idea.util.IdeDescriptorRenderers[DeserializedPropertyDescriptor]

'renderType' @ [45:92] ==> public abstract fun renderType(type: KotlinType): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'type' @ [45:103] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.ChangeVariableTypeFix.<init>[ValueParameterDescriptorImpl]

'IdeDescriptorRenderers' @ [46:34] ==> public object IdeDescriptorRenderers defined in org.jetbrains.kotlin.idea.util[FakeCallableDescriptorForObject]

'SOURCE_CODE' @ [46:57] ==> @field:JvmField public final val SOURCE_CODE: DescriptorRenderer defined in org.jetbrains.kotlin.idea.util.IdeDescriptorRenderers[DeserializedPropertyDescriptor]

'renderType' @ [46:69] ==> public abstract fun renderType(type: KotlinType): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'type' @ [46:80] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.ChangeVariableTypeFix.<init>[ValueParameterDescriptorImpl]

'element' @ [49:23] ==> protected final val element: KtVariableDeclaration? defined in org.jetbrains.kotlin.idea.quickfix.ChangeVariableTypeFix[PropertyDescriptorImpl]

'element' @ [50:20] ==> val element: KtVariableDeclaration defined in org.jetbrains.kotlin.idea.quickfix.ChangeVariableTypeFix.variablePresentation[LocalVariableDescriptor]

'name' @ [50:28] ==> public final val KtVariableDeclaration.name: String?[MyPropertyDescriptor]

'if (name != null) {
            val container = element.resolveToDescriptor().containingDeclaration as? ClassDescriptor
            val containerName = container?.name?.takeUnless { it.isSpecial }?.asString()
            if (containerName != null) "'$containerName.$name'" else "'$name'"
        }
        else {
            null
        }' @ [51:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String?, elseBranch: String?): String?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String?

'name' @ [51:20] ==> val name: String? defined in org.jetbrains.kotlin.idea.quickfix.ChangeVariableTypeFix.variablePresentation[LocalVariableDescriptor]

'element' @ [52:29] ==> val element: KtVariableDeclaration defined in org.jetbrains.kotlin.idea.quickfix.ChangeVariableTypeFix.variablePresentation[LocalVariableDescriptor]

'resolveToDescriptor' @ [52:37] ==> public fun KtDeclaration.resolveToDescriptor(bodyResolveMode: BodyResolveMode = ...): DeclarationDescriptor defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'containingDeclaration' @ [52:59] ==> public final val DeclarationDescriptor.containingDeclaration: DeclarationDescriptor?[MyPropertyDescriptor]

'container' @ [53:33] ==> val container: ClassDescriptor? defined in org.jetbrains.kotlin.idea.quickfix.ChangeVariableTypeFix.variablePresentation[LocalVariableDescriptor]

'name' @ [53:44] ==> public final val ClassDescriptor.name: Name[MyPropertyDescriptor]

'takeUnless' @ [53:50] ==> @InlineOnly @SinceKotlin public inline fun <T> Name.takeUnless(predicate: (Name) -> Boolean): Name? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Name

'it' @ [53:63] ==> value-parameter it: Name defined in org.jetbrains.kotlin.idea.quickfix.ChangeVariableTypeFix.variablePresentation.<anonymous>[ValueParameterDescriptorImpl]

'isSpecial' @ [53:66] ==> public final val Name.isSpecial: Boolean[MyPropertyDescriptor]

'asString' @ [53:79] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'if (containerName != null) "'$containerName.$name'" else "'$name'"' @ [54:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'containerName' @ [54:17] ==> val containerName: String? defined in org.jetbrains.kotlin.idea.quickfix.ChangeVariableTypeFix.variablePresentation[LocalVariableDescriptor]

'containerName' @ [54:43] ==> val containerName: String? defined in org.jetbrains.kotlin.idea.quickfix.ChangeVariableTypeFix.variablePresentation[LocalVariableDescriptor]

'name' @ [54:58] ==> val name: String? defined in org.jetbrains.kotlin.idea.quickfix.ChangeVariableTypeFix.variablePresentation[LocalVariableDescriptor]

'name' @ [54:73] ==> val name: String? defined in org.jetbrains.kotlin.idea.quickfix.ChangeVariableTypeFix.variablePresentation[LocalVariableDescriptor]

'element' @ [62:13] ==> protected final val element: KtVariableDeclaration? defined in org.jetbrains.kotlin.idea.quickfix.ChangeVariableTypeFix[PropertyDescriptorImpl]

'variablePresentation' @ [64:36] ==> public open fun variablePresentation(): String? defined in org.jetbrains.kotlin.idea.quickfix.ChangeVariableTypeFix[SimpleFunctionDescriptorImpl]

'if (variablePresentation != null) {
            "Change type of $variablePresentation to '$typePresentation'"
        }
        else {
            "Change type to '$typePresentation'"
        }' @ [65:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'variablePresentation' @ [65:20] ==> val variablePresentation: String? defined in org.jetbrains.kotlin.idea.quickfix.ChangeVariableTypeFix.getText[LocalVariableDescriptor]

'variablePresentation' @ [66:30] ==> val variablePresentation: String? defined in org.jetbrains.kotlin.idea.quickfix.ChangeVariableTypeFix.getText[LocalVariableDescriptor]

'typePresentation' @ [66:56] ==> private final val typePresentation: String defined in org.jetbrains.kotlin.idea.quickfix.ChangeVariableTypeFix[PropertyDescriptorImpl]

'typePresentation' @ [69:31] ==> private final val typePresentation: String defined in org.jetbrains.kotlin.idea.quickfix.ChangeVariableTypeFix[PropertyDescriptorImpl]

'ChangeVariableTypeFix' @ [73:70] ==> public constructor ChangeVariableTypeFix(element: KtVariableDeclaration, type: KotlinType) defined in org.jetbrains.kotlin.idea.quickfix.ChangeVariableTypeFix[ClassConstructorDescriptorImpl]

'element' @ [73:92] ==> value-parameter element: KtVariableDeclaration defined in org.jetbrains.kotlin.idea.quickfix.ChangeVariableTypeFix.OnType.<init>[ValueParameterDescriptorImpl]

'type' @ [73:101] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.ChangeVariableTypeFix.OnType.<init>[ValueParameterDescriptorImpl]

'ChangeVariableTypeFix' @ [77:77] ==> public constructor ChangeVariableTypeFix(element: KtVariableDeclaration, type: KotlinType) defined in org.jetbrains.kotlin.idea.quickfix.ChangeVariableTypeFix[ClassConstructorDescriptorImpl]

'element' @ [77:99] ==> value-parameter element: KtVariableDeclaration defined in org.jetbrains.kotlin.idea.quickfix.ChangeVariableTypeFix.ForOverridden.<init>[ValueParameterDescriptorImpl]

'type' @ [77:108] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.ChangeVariableTypeFix.ForOverridden.<init>[ValueParameterDescriptorImpl]

'super' @ [79:32] ==> <this> defined in org.jetbrains.kotlin.idea.quickfix.ChangeVariableTypeFix.ForOverridden[LazyClassReceiverParameterDescriptor]

'variablePresentation' @ [79:38] ==> public open fun variablePresentation(): String? defined in org.jetbrains.kotlin.idea.quickfix.ChangeVariableTypeFix[SimpleFunctionDescriptorImpl]

'presentation' @ [80:36] ==> val presentation: String defined in org.jetbrains.kotlin.idea.quickfix.ChangeVariableTypeFix.ForOverridden.variablePresentation[LocalVariableDescriptor]

'message' @ [85:28] ==> @NotNull public open fun message(@NonNls @PropertyKey p0: (String..String?), vararg p1: (Any..Any?)): String defined in org.jetbrains.kotlin.idea.KotlinBundle[JavaMethodDescriptor]

'!' @ [88:15] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'typeContainsError' @ [88:16] ==> private final val typeContainsError: Boolean defined in org.jetbrains.kotlin.idea.quickfix.ChangeVariableTypeFix[PropertyDescriptorImpl]

'super' @ [88:37] ==> <this> defined in org.jetbrains.kotlin.idea.quickfix.ChangeVariableTypeFix[LazyClassReceiverParameterDescriptor]

'isAvailable' @ [88:43] ==> public open fun isAvailable(project: Project, editor: Editor?, file: PsiFile): Boolean defined in org.jetbrains.kotlin.idea.quickfix.KotlinQuickFixAction[SimpleFunctionDescriptorImpl]

'project' @ [88:55] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.ChangeVariableTypeFix.isAvailable[ValueParameterDescriptorImpl]

'editor' @ [88:64] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.quickfix.ChangeVariableTypeFix.isAvailable[ValueParameterDescriptorImpl]

'file' @ [88:72] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.quickfix.ChangeVariableTypeFix.isAvailable[ValueParameterDescriptorImpl]

'element' @ [91:23] ==> protected final val element: KtVariableDeclaration? defined in org.jetbrains.kotlin.idea.quickfix.ChangeVariableTypeFix[PropertyDescriptorImpl]

'KtPsiFactory' @ [92:26] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'file' @ [92:39] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.quickfix.ChangeVariableTypeFix.invoke[ValueParameterDescriptorImpl]

'assert' @ [94:9] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'element' @ [94:16] ==> val element: KtVariableDeclaration defined in org.jetbrains.kotlin.idea.quickfix.ChangeVariableTypeFix.invoke[LocalVariableDescriptor]

'nameIdentifier' @ [94:24] ==> public final val KtVariableDeclaration.nameIdentifier: PsiElement?[MyPropertyDescriptor]

'psiFactory' @ [96:38] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.quickfix.ChangeVariableTypeFix.invoke[LocalVariableDescriptor]

'createType' @ [96:49] ==> public final fun createType(type: String): KtTypeReference defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'typeSourceCode' @ [96:60] ==> private final val typeSourceCode: String defined in org.jetbrains.kotlin.idea.quickfix.ChangeVariableTypeFix[PropertyDescriptorImpl]

'ArrayList' @ [97:25] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> KtTypeReference

'toShorten' @ [98:9] ==> val toShorten: ArrayList<KtTypeReference> defined in org.jetbrains.kotlin.idea.quickfix.ChangeVariableTypeFix.invoke[LocalVariableDescriptor]

'add' @ [98:19] ==> public open fun add(element: KtTypeReference): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'element' @ [98:23] ==> val element: KtVariableDeclaration defined in org.jetbrains.kotlin.idea.quickfix.ChangeVariableTypeFix.invoke[LocalVariableDescriptor]

'setTypeReference' @ [98:31] ==> @Nullable public abstract fun setTypeReference(@Nullable p0: KtTypeReference?): KtTypeReference? defined in org.jetbrains.kotlin.psi.KtVariableDeclaration[JavaMethodDescriptor]

'replacingTypeReference' @ [98:48] ==> val replacingTypeReference: KtTypeReference defined in org.jetbrains.kotlin.idea.quickfix.ChangeVariableTypeFix.invoke[LocalVariableDescriptor]

'element' @ [100:13] ==> val element: KtVariableDeclaration defined in org.jetbrains.kotlin.idea.quickfix.ChangeVariableTypeFix.invoke[LocalVariableDescriptor]

'element' @ [101:39] ==> val element: KtVariableDeclaration defined in org.jetbrains.kotlin.idea.quickfix.ChangeVariableTypeFix.invoke[LocalVariableDescriptor]

'getter' @ [101:47] ==> public final val KtProperty.getter: KtPropertyAccessor?[MyPropertyDescriptor]

'returnTypeReference' @ [101:55] ==> public final val KtPropertyAccessor.returnTypeReference: KtTypeReference?[MyPropertyDescriptor]

'getterReturnTypeRef' @ [102:17] ==> val getterReturnTypeRef: KtTypeReference? defined in org.jetbrains.kotlin.idea.quickfix.ChangeVariableTypeFix.invoke[LocalVariableDescriptor]

'toShorten' @ [103:17] ==> val toShorten: ArrayList<KtTypeReference> defined in org.jetbrains.kotlin.idea.quickfix.ChangeVariableTypeFix.invoke[LocalVariableDescriptor]

'add' @ [103:27] ==> public open fun add(element: KtTypeReference): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'getterReturnTypeRef' @ [103:31] ==> val getterReturnTypeRef: KtTypeReference? defined in org.jetbrains.kotlin.idea.quickfix.ChangeVariableTypeFix.invoke[LocalVariableDescriptor]

'replace' @ [103:51] ==> public open fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtTypeReference[JavaMethodDescriptor]

'replacingTypeReference' @ [103:59] ==> val replacingTypeReference: KtTypeReference defined in org.jetbrains.kotlin.idea.quickfix.ChangeVariableTypeFix.invoke[LocalVariableDescriptor]

'element' @ [106:42] ==> val element: KtVariableDeclaration defined in org.jetbrains.kotlin.idea.quickfix.ChangeVariableTypeFix.invoke[LocalVariableDescriptor]

'setter' @ [106:50] ==> public final val KtProperty.setter: KtPropertyAccessor?[MyPropertyDescriptor]

'parameter' @ [106:58] ==> public final val KtPropertyAccessor.parameter: KtParameter?[MyPropertyDescriptor]

'typeReference' @ [106:69] ==> public final var KtParameter.typeReference: KtTypeReference?[MyPropertyDescriptor]

'setterParameterTypeRef' @ [107:17] ==> val setterParameterTypeRef: KtTypeReference? defined in org.jetbrains.kotlin.idea.quickfix.ChangeVariableTypeFix.invoke[LocalVariableDescriptor]

'toShorten' @ [108:17] ==> val toShorten: ArrayList<KtTypeReference> defined in org.jetbrains.kotlin.idea.quickfix.ChangeVariableTypeFix.invoke[LocalVariableDescriptor]

'add' @ [108:27] ==> public open fun add(element: KtTypeReference): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'setterParameterTypeRef' @ [108:31] ==> val setterParameterTypeRef: KtTypeReference? defined in org.jetbrains.kotlin.idea.quickfix.ChangeVariableTypeFix.invoke[LocalVariableDescriptor]

'replace' @ [108:54] ==> public open fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtTypeReference[JavaMethodDescriptor]

'replacingTypeReference' @ [108:62] ==> val replacingTypeReference: KtTypeReference defined in org.jetbrains.kotlin.idea.quickfix.ChangeVariableTypeFix.invoke[LocalVariableDescriptor]

'ShortenReferences' @ [112:9] ==> public companion object defined in org.jetbrains.kotlin.idea.core.ShortenReferences[FakeCallableDescriptorForObject]

'DEFAULT' @ [112:27] ==> @field:JvmField public final val DEFAULT: ShortenReferences defined in org.jetbrains.kotlin.idea.core.ShortenReferences.Companion[DeserializedPropertyDescriptor]

'process' @ [112:35] ==> @JvmOverloads public final fun process(elements: Iterable<KtElement>, elementFilter: (PsiElement) -> ShortenReferences.FilterResult = ...): Collection<KtElement> defined in org.jetbrains.kotlin.idea.core.ShortenReferences[DeserializedSimpleFunctionDescriptor]

'toShorten' @ [112:43] ==> val toShorten: ArrayList<KtTypeReference> defined in org.jetbrains.kotlin.idea.quickfix.ChangeVariableTypeFix.invoke[LocalVariableDescriptor]

'KotlinSingleIntentionActionFactory' @ [115:57] ==> public constructor KotlinSingleIntentionActionFactory() defined in org.jetbrains.kotlin.idea.quickfix.KotlinSingleIntentionActionFactory[ClassConstructorDescriptorImpl]

'ChangeCallableReturnTypeFix' @ [117:25] ==> public companion object defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix[FakeCallableDescriptorForObject]

'getDestructuringDeclarationEntryThatTypeMismatchComponentFunction' @ [117:53] ==> public final fun getDestructuringDeclarationEntryThatTypeMismatchComponentFunction(diagnostic: Diagnostic): KtDestructuringDeclarationEntry defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix.Companion[SimpleFunctionDescriptorImpl]

'diagnostic' @ [117:119] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.ChangeVariableTypeFix.ComponentFunctionReturnTypeMismatchFactory.createAction[ValueParameterDescriptorImpl]

'entry' @ [118:27] ==> val entry: KtDestructuringDeclarationEntry defined in org.jetbrains.kotlin.idea.quickfix.ChangeVariableTypeFix.ComponentFunctionReturnTypeMismatchFactory.createAction[LocalVariableDescriptor]

'analyze' @ [118:33] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'context' @ [119:32] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.quickfix.ChangeVariableTypeFix.ComponentFunctionReturnTypeMismatchFactory.createAction[LocalVariableDescriptor]

'get' @ [119:40] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(p0: (ReadOnlySlice<(KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?), (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>..ReadOnlySlice<(KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?), (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>?), p1: (KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?)): ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> (org.jetbrains.kotlin.psi.KtDestructuringDeclarationEntry..org.jetbrains.kotlin.psi.KtDestructuringDeclarationEntry?)
    <V : (Any..Any?)> -> (org.jetbrains.kotlin.resolve.calls.model.ResolvedCall<(org.jetbrains.kotlin.descriptors.FunctionDescriptor..org.jetbrains.kotlin.descriptors.FunctionDescriptor?)>..org.jetbrains.kotlin.resolve.calls.model.ResolvedCall<(org.jetbrains.kotlin.descriptors.FunctionDescriptor..org.jetbrains.kotlin.descriptors.FunctionDescriptor?)>?)

'COMPONENT_RESOLVED_CALL' @ [119:59] ==> public final val COMPONENT_RESOLVED_CALL: (WritableSlice<(KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?), (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>..WritableSlice<(KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?), (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'entry' @ [119:84] ==> val entry: KtDestructuringDeclarationEntry defined in org.jetbrains.kotlin.idea.quickfix.ChangeVariableTypeFix.ComponentFunctionReturnTypeMismatchFactory.createAction[LocalVariableDescriptor]

'DescriptorToSourceUtils' @ [120:17] ==> public object DescriptorToSourceUtils defined in org.jetbrains.kotlin.resolve[FakeCallableDescriptorForObject]

'descriptorToDeclaration' @ [120:41] ==> @JvmStatic public final fun descriptorToDeclaration(descriptor: DeclarationDescriptor): PsiElement? defined in org.jetbrains.kotlin.resolve.DescriptorToSourceUtils[DeserializedSimpleFunctionDescriptor]

'resolvedCall' @ [120:65] ==> val resolvedCall: ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)> defined in org.jetbrains.kotlin.idea.quickfix.ChangeVariableTypeFix.ComponentFunctionReturnTypeMismatchFactory.createAction[LocalVariableDescriptor]

'candidateDescriptor' @ [120:78] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>.candidateDescriptor: FunctionDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.FunctionDescriptor..org.jetbrains.kotlin.descriptors.FunctionDescriptor?)

'resolvedCall' @ [121:32] ==> val resolvedCall: ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)> defined in org.jetbrains.kotlin.idea.quickfix.ChangeVariableTypeFix.ComponentFunctionReturnTypeMismatchFactory.createAction[LocalVariableDescriptor]

'candidateDescriptor' @ [121:45] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>.candidateDescriptor: FunctionDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.FunctionDescriptor..org.jetbrains.kotlin.descriptors.FunctionDescriptor?)

'returnType' @ [121:65] ==> public final val FunctionDescriptor.returnType: KotlinType?[MyPropertyDescriptor]

'ChangeVariableTypeFix' @ [122:20] ==> public constructor ChangeVariableTypeFix(element: KtVariableDeclaration, type: KotlinType) defined in org.jetbrains.kotlin.idea.quickfix.ChangeVariableTypeFix[ClassConstructorDescriptorImpl]

'entry' @ [122:42] ==> val entry: KtDestructuringDeclarationEntry defined in org.jetbrains.kotlin.idea.quickfix.ChangeVariableTypeFix.ComponentFunctionReturnTypeMismatchFactory.createAction[LocalVariableDescriptor]

'expectedType' @ [122:49] ==> val expectedType: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.ChangeVariableTypeFix.ComponentFunctionReturnTypeMismatchFactory.createAction[LocalVariableDescriptor]

'KotlinIntentionActionsFactory' @ [126:60] ==> public constructor KotlinIntentionActionsFactory() defined in org.jetbrains.kotlin.idea.quickfix.KotlinIntentionActionsFactory[DeserializedClassConstructorDescriptor]

'LinkedList' @ [128:27] ==> public constructor LinkedList<E : (Any..Any?)>() defined in java.util.LinkedList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> IntentionAction

'diagnostic' @ [130:17] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.ChangeVariableTypeFix.PropertyOrReturnTypeMismatchOnOverrideFactory.doCreateActions[ValueParameterDescriptorImpl]

'psiElement' @ [130:28] ==> public final val Diagnostic.psiElement: PsiElement[MyPropertyDescriptor]

'diagnostic' @ [131:32] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.ChangeVariableTypeFix.PropertyOrReturnTypeMismatchOnOverrideFactory.doCreateActions[ValueParameterDescriptorImpl]

'psiElement' @ [131:43] ==> public final val Diagnostic.psiElement: PsiElement[MyPropertyDescriptor]

'property' @ [132:34] ==> val property: KtProperty defined in org.jetbrains.kotlin.idea.quickfix.ChangeVariableTypeFix.PropertyOrReturnTypeMismatchOnOverrideFactory.doCreateActions[LocalVariableDescriptor]

'resolveToDescriptorIfAny' @ [132:43] ==> public fun KtDeclaration.resolveToDescriptorIfAny(bodyResolveMode: BodyResolveMode = ...): DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'FULL' @ [132:84] ==> enum entry FULL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'actions' @ [132:123] ==> val actions: LinkedList<IntentionAction> defined in org.jetbrains.kotlin.idea.quickfix.ChangeVariableTypeFix.PropertyOrReturnTypeMismatchOnOverrideFactory.doCreateActions[LocalVariableDescriptor]

'findLowerBoundOfOverriddenCallablesReturnTypes' @ [134:74] ==> @Nullable public open fun findLowerBoundOfOverriddenCallablesReturnTypes(@NotNull p0: CallableDescriptor): KotlinType? defined in org.jetbrains.kotlin.idea.core.quickfix.QuickFixUtil[JavaMethodDescriptor]

'descriptor' @ [134:121] ==> val descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ChangeVariableTypeFix.PropertyOrReturnTypeMismatchOnOverrideFactory.doCreateActions[LocalVariableDescriptor]

'descriptor' @ [136:36] ==> val descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ChangeVariableTypeFix.PropertyOrReturnTypeMismatchOnOverrideFactory.doCreateActions[LocalVariableDescriptor]

'returnType' @ [136:47] ==> public final val PropertyDescriptor.returnType: KotlinType?[MyPropertyDescriptor]

'error' @ [136:61] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'LinkedList' @ [138:55] ==> public constructor LinkedList<E : (Any..Any?)>() defined in java.util.LinkedList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> PropertyDescriptor

'descriptor' @ [140:44] ==> val descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ChangeVariableTypeFix.PropertyOrReturnTypeMismatchOnOverrideFactory.doCreateActions[LocalVariableDescriptor]

'overriddenDescriptors' @ [140:55] ==> public final var PropertyDescriptor.overriddenDescriptors: (MutableCollection<out (PropertyDescriptor..PropertyDescriptor?)>..Collection<(PropertyDescriptor..PropertyDescriptor?)>)[MyPropertyDescriptor]

'overriddenProperty' @ [141:50] ==> val overriddenProperty: (PropertyDescriptor..PropertyDescriptor?) defined in org.jetbrains.kotlin.idea.quickfix.ChangeVariableTypeFix.PropertyOrReturnTypeMismatchOnOverrideFactory.doCreateActions[LocalVariableDescriptor]

'returnType' @ [141:69] ==> public final val PropertyDescriptor.returnType: KotlinType?[MyPropertyDescriptor]

'overriddenPropertyType' @ [142:25] ==> val overriddenPropertyType: KotlinType? defined in org.jetbrains.kotlin.idea.quickfix.ChangeVariableTypeFix.PropertyOrReturnTypeMismatchOnOverrideFactory.doCreateActions[LocalVariableDescriptor]

'if (!KotlinTypeChecker.DEFAULT.isSubtypeOf(propertyType, overriddenPropertyType)) {
                            overriddenMismatchingProperties.add(overriddenProperty)
                        }
                        else if (overriddenProperty.isVar && !KotlinTypeChecker.DEFAULT.equalTypes(overriddenPropertyType, propertyType)) {
                            canChangeOverriddenPropertyType = false
                        }' @ [143:25] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any, elseBranch: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any

'!' @ [143:29] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'DEFAULT' @ [143:48] ==> public final val DEFAULT: (KotlinTypeChecker..KotlinTypeChecker?) defined in org.jetbrains.kotlin.types.checker.KotlinTypeChecker[JavaPropertyDescriptor]

'isSubtypeOf' @ [143:56] ==> public abstract fun isSubtypeOf(@NotNull p0: KotlinType, @NotNull p1: KotlinType): Boolean defined in org.jetbrains.kotlin.types.checker.KotlinTypeChecker[JavaMethodDescriptor]

'propertyType' @ [143:68] ==> val propertyType: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.ChangeVariableTypeFix.PropertyOrReturnTypeMismatchOnOverrideFactory.doCreateActions[LocalVariableDescriptor]

'overriddenPropertyType' @ [143:82] ==> val overriddenPropertyType: KotlinType? defined in org.jetbrains.kotlin.idea.quickfix.ChangeVariableTypeFix.PropertyOrReturnTypeMismatchOnOverrideFactory.doCreateActions[LocalVariableDescriptor]

'overriddenMismatchingProperties' @ [144:29] ==> val overriddenMismatchingProperties: LinkedList<PropertyDescriptor> defined in org.jetbrains.kotlin.idea.quickfix.ChangeVariableTypeFix.PropertyOrReturnTypeMismatchOnOverrideFactory.doCreateActions[LocalVariableDescriptor]

'add' @ [144:61] ==> public open fun add(element: PropertyDescriptor): Boolean defined in java.util.LinkedList[JavaMethodDescriptor]

'overriddenProperty' @ [144:65] ==> val overriddenProperty: (PropertyDescriptor..PropertyDescriptor?) defined in org.jetbrains.kotlin.idea.quickfix.ChangeVariableTypeFix.PropertyOrReturnTypeMismatchOnOverrideFactory.doCreateActions[LocalVariableDescriptor]

'overriddenProperty' @ [146:34] ==> val overriddenProperty: (PropertyDescriptor..PropertyDescriptor?) defined in org.jetbrains.kotlin.idea.quickfix.ChangeVariableTypeFix.PropertyOrReturnTypeMismatchOnOverrideFactory.doCreateActions[LocalVariableDescriptor]

'isVar' @ [146:53] ==> public final val PropertyDescriptor.isVar: Boolean[MyPropertyDescriptor]

'!' @ [146:62] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'DEFAULT' @ [146:81] ==> public final val DEFAULT: (KotlinTypeChecker..KotlinTypeChecker?) defined in org.jetbrains.kotlin.types.checker.KotlinTypeChecker[JavaPropertyDescriptor]

'equalTypes' @ [146:89] ==> public abstract fun equalTypes(@NotNull p0: KotlinType, @NotNull p1: KotlinType): Boolean defined in org.jetbrains.kotlin.types.checker.KotlinTypeChecker[JavaMethodDescriptor]

'overriddenPropertyType' @ [146:100] ==> val overriddenPropertyType: KotlinType? defined in org.jetbrains.kotlin.idea.quickfix.ChangeVariableTypeFix.PropertyOrReturnTypeMismatchOnOverrideFactory.doCreateActions[LocalVariableDescriptor]

'propertyType' @ [146:124] ==> val propertyType: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.ChangeVariableTypeFix.PropertyOrReturnTypeMismatchOnOverrideFactory.doCreateActions[LocalVariableDescriptor]

'canChangeOverriddenPropertyType' @ [147:29] ==> var canChangeOverriddenPropertyType: Boolean defined in org.jetbrains.kotlin.idea.quickfix.ChangeVariableTypeFix.PropertyOrReturnTypeMismatchOnOverrideFactory.doCreateActions[LocalVariableDescriptor]

'overriddenProperty' @ [149:29] ==> val overriddenProperty: (PropertyDescriptor..PropertyDescriptor?) defined in org.jetbrains.kotlin.idea.quickfix.ChangeVariableTypeFix.PropertyOrReturnTypeMismatchOnOverrideFactory.doCreateActions[LocalVariableDescriptor]

'isVar' @ [149:48] ==> public final val PropertyDescriptor.isVar: Boolean[MyPropertyDescriptor]

'lowerBoundOfOverriddenPropertiesTypes' @ [149:57] ==> var lowerBoundOfOverriddenPropertiesTypes: KotlinType? defined in org.jetbrains.kotlin.idea.quickfix.ChangeVariableTypeFix.PropertyOrReturnTypeMismatchOnOverrideFactory.doCreateActions[LocalVariableDescriptor]

'!' @ [150:29] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'DEFAULT' @ [150:48] ==> public final val DEFAULT: (KotlinTypeChecker..KotlinTypeChecker?) defined in org.jetbrains.kotlin.types.checker.KotlinTypeChecker[JavaPropertyDescriptor]

'equalTypes' @ [150:56] ==> public abstract fun equalTypes(@NotNull p0: KotlinType, @NotNull p1: KotlinType): Boolean defined in org.jetbrains.kotlin.types.checker.KotlinTypeChecker[JavaMethodDescriptor]

'lowerBoundOfOverriddenPropertiesTypes' @ [150:67] ==> var lowerBoundOfOverriddenPropertiesTypes: KotlinType? defined in org.jetbrains.kotlin.idea.quickfix.ChangeVariableTypeFix.PropertyOrReturnTypeMismatchOnOverrideFactory.doCreateActions[LocalVariableDescriptor]

'overriddenPropertyType' @ [150:106] ==> val overriddenPropertyType: KotlinType? defined in org.jetbrains.kotlin.idea.quickfix.ChangeVariableTypeFix.PropertyOrReturnTypeMismatchOnOverrideFactory.doCreateActions[LocalVariableDescriptor]

'lowerBoundOfOverriddenPropertiesTypes' @ [151:29] ==> var lowerBoundOfOverriddenPropertiesTypes: KotlinType? defined in org.jetbrains.kotlin.idea.quickfix.ChangeVariableTypeFix.PropertyOrReturnTypeMismatchOnOverrideFactory.doCreateActions[LocalVariableDescriptor]

'lowerBoundOfOverriddenPropertiesTypes' @ [156:21] ==> var lowerBoundOfOverriddenPropertiesTypes: KotlinType? defined in org.jetbrains.kotlin.idea.quickfix.ChangeVariableTypeFix.PropertyOrReturnTypeMismatchOnOverrideFactory.doCreateActions[LocalVariableDescriptor]

'actions' @ [157:21] ==> val actions: LinkedList<IntentionAction> defined in org.jetbrains.kotlin.idea.quickfix.ChangeVariableTypeFix.PropertyOrReturnTypeMismatchOnOverrideFactory.doCreateActions[LocalVariableDescriptor]

'add' @ [157:29] ==> public open fun add(element: IntentionAction): Boolean defined in java.util.LinkedList[JavaMethodDescriptor]

'OnType' @ [157:55] ==> public constructor OnType(element: KtVariableDeclaration, type: KotlinType) defined in org.jetbrains.kotlin.idea.quickfix.ChangeVariableTypeFix.OnType[ClassConstructorDescriptorImpl]

'property' @ [157:62] ==> val property: KtProperty defined in org.jetbrains.kotlin.idea.quickfix.ChangeVariableTypeFix.PropertyOrReturnTypeMismatchOnOverrideFactory.doCreateActions[LocalVariableDescriptor]

'lowerBoundOfOverriddenPropertiesTypes' @ [157:72] ==> var lowerBoundOfOverriddenPropertiesTypes: KotlinType? defined in org.jetbrains.kotlin.idea.quickfix.ChangeVariableTypeFix.PropertyOrReturnTypeMismatchOnOverrideFactory.doCreateActions[LocalVariableDescriptor]

'overriddenMismatchingProperties' @ [160:21] ==> val overriddenMismatchingProperties: LinkedList<PropertyDescriptor> defined in org.jetbrains.kotlin.idea.quickfix.ChangeVariableTypeFix.PropertyOrReturnTypeMismatchOnOverrideFactory.doCreateActions[LocalVariableDescriptor]

'size' @ [160:53] ==> public open val size: Int defined in java.util.LinkedList[JavaPropertyDescriptor]

'canChangeOverriddenPropertyType' @ [160:66] ==> var canChangeOverriddenPropertyType: Boolean defined in org.jetbrains.kotlin.idea.quickfix.ChangeVariableTypeFix.PropertyOrReturnTypeMismatchOnOverrideFactory.doCreateActions[LocalVariableDescriptor]

'DescriptorToSourceUtils' @ [161:46] ==> public object DescriptorToSourceUtils defined in org.jetbrains.kotlin.resolve[FakeCallableDescriptorForObject]

'descriptorToDeclaration' @ [161:70] ==> @JvmStatic public final fun descriptorToDeclaration(descriptor: DeclarationDescriptor): PsiElement? defined in org.jetbrains.kotlin.resolve.DescriptorToSourceUtils[DeserializedSimpleFunctionDescriptor]

'overriddenMismatchingProperties' @ [161:94] ==> val overriddenMismatchingProperties: LinkedList<PropertyDescriptor> defined in org.jetbrains.kotlin.idea.quickfix.ChangeVariableTypeFix.PropertyOrReturnTypeMismatchOnOverrideFactory.doCreateActions[LocalVariableDescriptor]

'single' @ [161:126] ==> public fun <T> List<PropertyDescriptor>.single(): PropertyDescriptor defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PropertyDescriptor

'overriddenProperty' @ [162:25] ==> val overriddenProperty: PsiElement? defined in org.jetbrains.kotlin.idea.quickfix.ChangeVariableTypeFix.PropertyOrReturnTypeMismatchOnOverrideFactory.doCreateActions[LocalVariableDescriptor]

'actions' @ [163:25] ==> val actions: LinkedList<IntentionAction> defined in org.jetbrains.kotlin.idea.quickfix.ChangeVariableTypeFix.PropertyOrReturnTypeMismatchOnOverrideFactory.doCreateActions[LocalVariableDescriptor]

'add' @ [163:33] ==> public open fun add(element: IntentionAction): Boolean defined in java.util.LinkedList[JavaMethodDescriptor]

'ForOverridden' @ [163:59] ==> public constructor ForOverridden(element: KtVariableDeclaration, type: KotlinType) defined in org.jetbrains.kotlin.idea.quickfix.ChangeVariableTypeFix.ForOverridden[ClassConstructorDescriptorImpl]

'overriddenProperty' @ [163:73] ==> val overriddenProperty: PsiElement? defined in org.jetbrains.kotlin.idea.quickfix.ChangeVariableTypeFix.PropertyOrReturnTypeMismatchOnOverrideFactory.doCreateActions[LocalVariableDescriptor]

'propertyType' @ [163:93] ==> val propertyType: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.ChangeVariableTypeFix.PropertyOrReturnTypeMismatchOnOverrideFactory.doCreateActions[LocalVariableDescriptor]

'actions' @ [168:20] ==> val actions: LinkedList<IntentionAction> defined in org.jetbrains.kotlin.idea.quickfix.ChangeVariableTypeFix.PropertyOrReturnTypeMismatchOnOverrideFactory.doCreateActions[LocalVariableDescriptor]

