'IntentionBasedInspection<KtProperty>' @ [38:48] ==> public constructor IntentionBasedInspection<TElement : PsiElement>(intention: KClass<out SelfTargetingRangeIntention<KtProperty>>, problemText: String? = ...) defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection[DeserializedClassConstructorDescriptor]
Inferred types:
    <TElement : PsiElement> -> KtProperty

'JoinDeclarationAndAssignmentIntention' @ [39:9] ==> public constructor JoinDeclarationAndAssignmentIntention() defined in org.jetbrains.kotlin.idea.intentions.JoinDeclarationAndAssignmentIntention[ClassConstructorDescriptorImpl]

'SelfTargetingOffsetIndependentIntention<KtProperty>' @ [43:47] ==> public constructor SelfTargetingOffsetIndependentIntention<TElement : KtElement>(elementType: Class<KtProperty>, text: String, familyName: String = ...) defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingOffsetIndependentIntention[DeserializedClassConstructorDescriptor]
Inferred types:
    <TElement : KtElement> -> KtProperty

'java' @ [44:27] ==> public val <T> KClass<KtProperty>.java: Class<KtProperty> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtProperty

'type1' @ [49:13] ==> value-parameter type1: KotlinType? defined in org.jetbrains.kotlin.idea.intentions.JoinDeclarationAndAssignmentIntention.equalNullableTypes[ValueParameterDescriptorImpl]

'type2' @ [49:35] ==> value-parameter type2: KotlinType? defined in org.jetbrains.kotlin.idea.intentions.JoinDeclarationAndAssignmentIntention.equalNullableTypes[ValueParameterDescriptorImpl]

'type2' @ [50:13] ==> value-parameter type2: KotlinType? defined in org.jetbrains.kotlin.idea.intentions.JoinDeclarationAndAssignmentIntention.equalNullableTypes[ValueParameterDescriptorImpl]

'equalTypes' @ [51:26] ==> public open fun equalTypes(@NotNull p0: KotlinType, @NotNull p1: KotlinType): Boolean defined in org.jetbrains.kotlin.types.TypeUtils[JavaMethodDescriptor]

'type1' @ [51:37] ==> value-parameter type1: KotlinType? defined in org.jetbrains.kotlin.idea.intentions.JoinDeclarationAndAssignmentIntention.equalNullableTypes[ValueParameterDescriptorImpl]

'type2' @ [51:44] ==> value-parameter type2: KotlinType? defined in org.jetbrains.kotlin.idea.intentions.JoinDeclarationAndAssignmentIntention.equalNullableTypes[ValueParameterDescriptorImpl]

'element' @ [55:13] ==> value-parameter element: KtProperty defined in org.jetbrains.kotlin.idea.intentions.JoinDeclarationAndAssignmentIntention.isApplicableTo[ValueParameterDescriptorImpl]

'hasDelegate' @ [55:21] ==> public open fun hasDelegate(): Boolean defined in org.jetbrains.kotlin.psi.KtProperty[JavaMethodDescriptor]

'element' @ [56:16] ==> value-parameter element: KtProperty defined in org.jetbrains.kotlin.idea.intentions.JoinDeclarationAndAssignmentIntention.isApplicableTo[ValueParameterDescriptorImpl]

'hasInitializer' @ [56:24] ==> public open fun hasInitializer(): Boolean defined in org.jetbrains.kotlin.psi.KtProperty[JavaMethodDescriptor]

'element' @ [57:16] ==> value-parameter element: KtProperty defined in org.jetbrains.kotlin.idea.intentions.JoinDeclarationAndAssignmentIntention.isApplicableTo[ValueParameterDescriptorImpl]

'setter' @ [57:24] ==> public final val KtProperty.setter: KtPropertyAccessor?[MyPropertyDescriptor]

'element' @ [58:16] ==> value-parameter element: KtProperty defined in org.jetbrains.kotlin.idea.intentions.JoinDeclarationAndAssignmentIntention.isApplicableTo[ValueParameterDescriptorImpl]

'getter' @ [58:24] ==> public final val KtProperty.getter: KtPropertyAccessor?[MyPropertyDescriptor]

'element' @ [59:16] ==> value-parameter element: KtProperty defined in org.jetbrains.kotlin.idea.intentions.JoinDeclarationAndAssignmentIntention.isApplicableTo[ValueParameterDescriptorImpl]

'receiverTypeReference' @ [59:24] ==> public final val KtProperty.receiverTypeReference: KtTypeReference?[MyPropertyDescriptor]

'element' @ [60:16] ==> value-parameter element: KtProperty defined in org.jetbrains.kotlin.idea.intentions.JoinDeclarationAndAssignmentIntention.isApplicableTo[ValueParameterDescriptorImpl]

'name' @ [60:24] ==> public final val KtProperty.name: String?[MyPropertyDescriptor]

'findAssignment' @ [64:26] ==> private final fun findAssignment(property: KtProperty): KtBinaryExpression? defined in org.jetbrains.kotlin.idea.intentions.JoinDeclarationAndAssignmentIntention[SimpleFunctionDescriptorImpl]

'element' @ [64:41] ==> value-parameter element: KtProperty defined in org.jetbrains.kotlin.idea.intentions.JoinDeclarationAndAssignmentIntention.isApplicableTo[ValueParameterDescriptorImpl]

'assignment' @ [65:16] ==> val assignment: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.JoinDeclarationAndAssignmentIntention.isApplicableTo[LocalVariableDescriptor]

'right' @ [65:27] ==> public final val KtBinaryExpression.right: KtExpression?[MyPropertyDescriptor]

'let' @ [65:34] ==> @InlineOnly public inline fun <T, R> KtExpression.let(block: (KtExpression) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression
    <R> -> Boolean

'hasNoLocalDependencies' @ [66:13] ==> private final fun hasNoLocalDependencies(element: KtElement, localContext: PsiElement): Boolean defined in org.jetbrains.kotlin.idea.intentions.JoinDeclarationAndAssignmentIntention[SimpleFunctionDescriptorImpl]

'it' @ [66:36] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.idea.intentions.JoinDeclarationAndAssignmentIntention.isApplicableTo.<anonymous>[ValueParameterDescriptorImpl]

'element' @ [66:40] ==> value-parameter element: KtProperty defined in org.jetbrains.kotlin.idea.intentions.JoinDeclarationAndAssignmentIntention.isApplicableTo[ValueParameterDescriptorImpl]

'parent' @ [66:48] ==> public final val KtProperty.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'assignment' @ [67:13] ==> val assignment: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.JoinDeclarationAndAssignmentIntention.isApplicableTo[LocalVariableDescriptor]

'analyze' @ [67:24] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'let' @ [67:34] ==> @InlineOnly public inline fun <T, R> BindingContext.let(block: (BindingContext) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> BindingContext
    <R> -> Boolean

'element' @ [68:18] ==> value-parameter element: KtProperty defined in org.jetbrains.kotlin.idea.intentions.JoinDeclarationAndAssignmentIntention.isApplicableTo[ValueParameterDescriptorImpl]

'isVar' @ [68:26] ==> public final val KtProperty.isVar: Boolean[MyPropertyDescriptor]

'!' @ [68:35] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'element' @ [68:36] ==> value-parameter element: KtProperty defined in org.jetbrains.kotlin.idea.intentions.JoinDeclarationAndAssignmentIntention.isApplicableTo[ValueParameterDescriptorImpl]

'isLocal' @ [68:44] ==> public final val KtProperty.isLocal: Boolean[MyPropertyDescriptor]

'equalNullableTypes' @ [69:17] ==> private final fun equalNullableTypes(type1: KotlinType?, type2: KotlinType?): Boolean defined in org.jetbrains.kotlin.idea.intentions.JoinDeclarationAndAssignmentIntention[SimpleFunctionDescriptorImpl]

'it' @ [69:36] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.idea.intentions.JoinDeclarationAndAssignmentIntention.isApplicableTo.<anonymous>[ValueParameterDescriptorImpl]

'getType' @ [69:39] ==> public fun KtExpression.getType(context: BindingContext): KotlinType? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'context' @ [69:47] ==> value-parameter context: BindingContext defined in org.jetbrains.kotlin.idea.intentions.JoinDeclarationAndAssignmentIntention.isApplicableTo.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'context' @ [69:57] ==> value-parameter context: BindingContext defined in org.jetbrains.kotlin.idea.intentions.JoinDeclarationAndAssignmentIntention.isApplicableTo.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'TYPE' @ [69:80] ==> public final val TYPE: (WritableSlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>..WritableSlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'element' @ [69:86] ==> value-parameter element: KtProperty defined in org.jetbrains.kotlin.idea.intentions.JoinDeclarationAndAssignmentIntention.isApplicableTo[ValueParameterDescriptorImpl]

'typeReference' @ [69:94] ==> public final var KtProperty.typeReference: KtTypeReference?[MyPropertyDescriptor]

'element' @ [75:29] ==> value-parameter element: KtProperty defined in org.jetbrains.kotlin.idea.intentions.JoinDeclarationAndAssignmentIntention.applyTo[ValueParameterDescriptorImpl]

'typeReference' @ [75:37] ==> public final var KtProperty.typeReference: KtTypeReference?[MyPropertyDescriptor]

'findAssignment' @ [77:26] ==> private final fun findAssignment(property: KtProperty): KtBinaryExpression? defined in org.jetbrains.kotlin.idea.intentions.JoinDeclarationAndAssignmentIntention[SimpleFunctionDescriptorImpl]

'element' @ [77:41] ==> value-parameter element: KtProperty defined in org.jetbrains.kotlin.idea.intentions.JoinDeclarationAndAssignmentIntention.applyTo[ValueParameterDescriptorImpl]

'assignment' @ [78:27] ==> val assignment: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.JoinDeclarationAndAssignmentIntention.applyTo[LocalVariableDescriptor]

'right' @ [78:38] ==> public final val KtBinaryExpression.right: KtExpression?[MyPropertyDescriptor]

'element' @ [79:30] ==> value-parameter element: KtProperty defined in org.jetbrains.kotlin.idea.intentions.JoinDeclarationAndAssignmentIntention.applyTo[ValueParameterDescriptorImpl]

'setInitializer' @ [79:38] ==> @Nullable public open fun setInitializer(@Nullable p0: KtExpression?): KtExpression? defined in org.jetbrains.kotlin.psi.KtProperty[JavaMethodDescriptor]

'initializer' @ [79:53] ==> val initializer: KtExpression defined in org.jetbrains.kotlin.idea.intentions.JoinDeclarationAndAssignmentIntention.applyTo[LocalVariableDescriptor]

'assignment' @ [81:32] ==> val assignment: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.JoinDeclarationAndAssignmentIntention.applyTo[LocalVariableDescriptor]

'parent' @ [81:43] ==> public final val KtBinaryExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'parent' @ [81:50] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'assignment' @ [82:9] ==> val assignment: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.JoinDeclarationAndAssignmentIntention.applyTo[LocalVariableDescriptor]

'delete' @ [82:20] ==> public open fun delete(): Unit defined in org.jetbrains.kotlin.psi.KtBinaryExpression[JavaMethodDescriptor]

'initializerBlock' @ [83:13] ==> val initializerBlock: KtAnonymousInitializer? defined in org.jetbrains.kotlin.idea.intentions.JoinDeclarationAndAssignmentIntention.applyTo[LocalVariableDescriptor]

'==' @ [83:41] ==> public open fun equals(other: Any?): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'initializerBlock' @ [83:42] ==> val initializerBlock: KtAnonymousInitializer? defined in org.jetbrains.kotlin.idea.intentions.JoinDeclarationAndAssignmentIntention.applyTo[LocalVariableDescriptor]

'body' @ [83:59] ==> public abstract val body: KtExpression? defined in org.jetbrains.kotlin.psi.KtAnonymousInitializer[DeserializedPropertyDescriptor]

'isEmpty' @ [83:88] ==> private final fun KtBlockExpression.isEmpty(): Boolean defined in org.jetbrains.kotlin.idea.intentions.JoinDeclarationAndAssignmentIntention[SimpleFunctionDescriptorImpl]

'initializerBlock' @ [84:13] ==> val initializerBlock: KtAnonymousInitializer? defined in org.jetbrains.kotlin.idea.intentions.JoinDeclarationAndAssignmentIntention.applyTo[LocalVariableDescriptor]

'delete' @ [84:30] ==> public abstract fun delete(): Unit defined in org.jetbrains.kotlin.psi.KtAnonymousInitializer[JavaMethodDescriptor]

'editor' @ [87:9] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.intentions.JoinDeclarationAndAssignmentIntention.applyTo[ValueParameterDescriptorImpl]

'apply' @ [87:17] ==> @InlineOnly public inline fun <T> Editor.apply(block: Editor.() -> Unit): Editor defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Editor

'unblockDocument' @ [88:13] ==> public fun Editor.unblockDocument(): Unit defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'if (element.canOmitDeclaredType(newInitializer, canChangeTypeToSubtype = !element.isVar)) {
                val colon = element.colon!!
                selectionModel.setSelection(colon.startOffset, typeReference.endOffset)
                moveCaret(typeReference.endOffset, ScrollType.CENTER)
            }
            else {
                moveCaret(newInitializer.startOffset, ScrollType.CENTER)
            }' @ [90:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'element' @ [90:17] ==> value-parameter element: KtProperty defined in org.jetbrains.kotlin.idea.intentions.JoinDeclarationAndAssignmentIntention.applyTo[ValueParameterDescriptorImpl]

'canOmitDeclaredType' @ [90:25] ==> public fun KtCallableDeclaration.canOmitDeclaredType(initializerOrBodyExpression: KtExpression, canChangeTypeToSubtype: Boolean): Boolean defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'newInitializer' @ [90:45] ==> val newInitializer: KtExpression defined in org.jetbrains.kotlin.idea.intentions.JoinDeclarationAndAssignmentIntention.applyTo[LocalVariableDescriptor]

'!' @ [90:86] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'element' @ [90:87] ==> value-parameter element: KtProperty defined in org.jetbrains.kotlin.idea.intentions.JoinDeclarationAndAssignmentIntention.applyTo[ValueParameterDescriptorImpl]

'isVar' @ [90:95] ==> public final val KtProperty.isVar: Boolean[MyPropertyDescriptor]

'element' @ [91:29] ==> value-parameter element: KtProperty defined in org.jetbrains.kotlin.idea.intentions.JoinDeclarationAndAssignmentIntention.applyTo[ValueParameterDescriptorImpl]

'colon' @ [91:37] ==> public final val KtProperty.colon: PsiElement?[MyPropertyDescriptor]

'selectionModel' @ [92:17] ==> public final val Editor.selectionModel: SelectionModel[MyPropertyDescriptor]

'setSelection' @ [92:32] ==> public abstract fun setSelection(p0: Int, p1: Int): Unit defined in com.intellij.openapi.editor.SelectionModel[JavaMethodDescriptor]

'colon' @ [92:45] ==> val colon: PsiElement defined in org.jetbrains.kotlin.idea.intentions.JoinDeclarationAndAssignmentIntention.applyTo.<anonymous>[LocalVariableDescriptor]

'startOffset' @ [92:51] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'typeReference' @ [92:64] ==> val typeReference: KtTypeReference defined in org.jetbrains.kotlin.idea.intentions.JoinDeclarationAndAssignmentIntention.applyTo[LocalVariableDescriptor]

'endOffset' @ [92:78] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'moveCaret' @ [93:17] ==> public fun Editor.moveCaret(offset: Int, scrollType: ScrollType = ...): Unit defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'typeReference' @ [93:27] ==> val typeReference: KtTypeReference defined in org.jetbrains.kotlin.idea.intentions.JoinDeclarationAndAssignmentIntention.applyTo[LocalVariableDescriptor]

'endOffset' @ [93:41] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'CENTER' @ [93:63] ==> enum entry CENTER defined in com.intellij.openapi.editor.ScrollType[FakeCallableDescriptorForObject]

'moveCaret' @ [96:17] ==> public fun Editor.moveCaret(offset: Int, scrollType: ScrollType = ...): Unit defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'newInitializer' @ [96:27] ==> val newInitializer: KtExpression defined in org.jetbrains.kotlin.idea.intentions.JoinDeclarationAndAssignmentIntention.applyTo[LocalVariableDescriptor]

'startOffset' @ [96:42] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'CENTER' @ [96:66] ==> enum entry CENTER defined in com.intellij.openapi.editor.ScrollType[FakeCallableDescriptorForObject]

'property' @ [102:33] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.idea.intentions.JoinDeclarationAndAssignmentIntention.findAssignment[ValueParameterDescriptorImpl]

'parent' @ [102:42] ==> public final val KtProperty.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'property' @ [103:9] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.idea.intentions.JoinDeclarationAndAssignmentIntention.findAssignment[ValueParameterDescriptorImpl]

'typeReference' @ [103:18] ==> public final var KtProperty.typeReference: KtTypeReference?[MyPropertyDescriptor]

'mutableListOf' @ [105:27] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableListOf(): MutableList<KtBinaryExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtBinaryExpression

'binaryExpr' @ [107:17] ==> value-parameter binaryExpr: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.JoinDeclarationAndAssignmentIntention.findAssignment.process[ValueParameterDescriptorImpl]

'operationToken' @ [107:28] ==> public final val KtBinaryExpression.operationToken: IElementType[MyPropertyDescriptor]

'EQ' @ [107:55] ==> public final val EQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'binaryExpr' @ [108:24] ==> value-parameter binaryExpr: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.JoinDeclarationAndAssignmentIntention.findAssignment.process[ValueParameterDescriptorImpl]

'left' @ [108:35] ==> public final val KtBinaryExpression.left: KtExpression?[MyPropertyDescriptor]

'when (left) {
                is KtNameReferenceExpression ->
                    left
                is KtDotQualifiedExpression ->
                    if (left.receiverExpression is KtThisExpression) left.selectorExpression as? KtNameReferenceExpression else null
                else ->
                    null
            }' @ [109:33] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KtNameReferenceExpression?, entry1: KtNameReferenceExpression?, entry2: KtNameReferenceExpression?): KtNameReferenceExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KtNameReferenceExpression?

'left' @ [109:39] ==> val left: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.JoinDeclarationAndAssignmentIntention.findAssignment.process[LocalVariableDescriptor]

'left' @ [111:21] ==> val left: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.JoinDeclarationAndAssignmentIntention.findAssignment.process[LocalVariableDescriptor]

'if (left.receiverExpression is KtThisExpression) left.selectorExpression as? KtNameReferenceExpression else null' @ [113:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtNameReferenceExpression?, elseBranch: KtNameReferenceExpression?): KtNameReferenceExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtNameReferenceExpression?

'left' @ [113:25] ==> val left: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.JoinDeclarationAndAssignmentIntention.findAssignment.process[LocalVariableDescriptor]

'receiverExpression' @ [113:30] ==> public open val receiverExpression: KtExpression defined in org.jetbrains.kotlin.psi.KtDotQualifiedExpression[DeserializedPropertyDescriptor]

'left' @ [113:70] ==> val left: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.JoinDeclarationAndAssignmentIntention.findAssignment.process[LocalVariableDescriptor]

'selectorExpression' @ [113:75] ==> public open val selectorExpression: KtExpression? defined in org.jetbrains.kotlin.psi.KtDotQualifiedExpression[DeserializedPropertyDescriptor]

'leftReference' @ [117:17] ==> val leftReference: KtNameReferenceExpression defined in org.jetbrains.kotlin.idea.intentions.JoinDeclarationAndAssignmentIntention.findAssignment.process[LocalVariableDescriptor]

'getReferencedName' @ [117:31] ==> public open fun getReferencedName(): String defined in org.jetbrains.kotlin.psi.KtNameReferenceExpression[DeserializedSimpleFunctionDescriptor]

'property' @ [117:54] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.idea.intentions.JoinDeclarationAndAssignmentIntention.findAssignment[ValueParameterDescriptorImpl]

'name' @ [117:63] ==> public final val KtProperty.name: String?[MyPropertyDescriptor]

'assignments' @ [118:13] ==> val assignments: MutableList<KtBinaryExpression> defined in org.jetbrains.kotlin.idea.intentions.JoinDeclarationAndAssignmentIntention.findAssignment[LocalVariableDescriptor]

'binaryExpr' @ [118:28] ==> value-parameter binaryExpr: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.JoinDeclarationAndAssignmentIntention.findAssignment.process[ValueParameterDescriptorImpl]

'propertyContainer' @ [120:9] ==> val propertyContainer: KtElement defined in org.jetbrains.kotlin.idea.intentions.JoinDeclarationAndAssignmentIntention.findAssignment[LocalVariableDescriptor]

'forEachDescendantOfType' @ [120:27] ==> public inline fun <reified T : PsiElement> PsiElement.forEachDescendantOfType(noinline action: (binaryExpr: KtBinaryExpression) -> Unit): Unit defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> [@kotlin.ParameterName] KtBinaryExpression

'process' @ [120:53] ==> local final fun process(binaryExpr: KtBinaryExpression): Unit defined in org.jetbrains.kotlin.idea.intentions.JoinDeclarationAndAssignmentIntention.findAssignment[SimpleFunctionDescriptorImpl]

'when {
                this == null -> return true
                this === propertyContainer -> return false
                else -> {
                    val grandParent = parent
                    if (grandParent.parent !== propertyContainer) return true
                    return grandParent !is KtAnonymousInitializer && grandParent !is KtSecondaryConstructor
                }
            }' @ [123:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Nothing, entry1: Nothing, entry2: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Nothing

'this' @ [124:17] ==> <this> defined in org.jetbrains.kotlin.idea.intentions.JoinDeclarationAndAssignmentIntention.findAssignment.invalidParent[ReceiverParameterDescriptorImpl]

'this' @ [125:17] ==> <this> defined in org.jetbrains.kotlin.idea.intentions.JoinDeclarationAndAssignmentIntention.findAssignment.invalidParent[ReceiverParameterDescriptorImpl]

'propertyContainer' @ [125:26] ==> val propertyContainer: KtElement defined in org.jetbrains.kotlin.idea.intentions.JoinDeclarationAndAssignmentIntention.findAssignment[LocalVariableDescriptor]

'parent' @ [127:39] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'grandParent' @ [128:25] ==> val grandParent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.intentions.JoinDeclarationAndAssignmentIntention.findAssignment.invalidParent[LocalVariableDescriptor]

'parent' @ [128:37] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'propertyContainer' @ [128:48] ==> val propertyContainer: KtElement defined in org.jetbrains.kotlin.idea.intentions.JoinDeclarationAndAssignmentIntention.findAssignment[LocalVariableDescriptor]

'grandParent' @ [129:28] ==> val grandParent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.intentions.JoinDeclarationAndAssignmentIntention.findAssignment.invalidParent[LocalVariableDescriptor]

'grandParent' @ [129:70] ==> val grandParent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.intentions.JoinDeclarationAndAssignmentIntention.findAssignment.invalidParent[LocalVariableDescriptor]

'assignments' @ [134:13] ==> val assignments: MutableList<KtBinaryExpression> defined in org.jetbrains.kotlin.idea.intentions.JoinDeclarationAndAssignmentIntention.findAssignment[LocalVariableDescriptor]

'any' @ [134:25] ==> public inline fun <T> Iterable<KtBinaryExpression>.any(predicate: (KtBinaryExpression) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtBinaryExpression

'it' @ [134:31] ==> value-parameter it: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.JoinDeclarationAndAssignmentIntention.findAssignment.<anonymous>[ValueParameterDescriptorImpl]

'parent' @ [134:34] ==> public final val KtBinaryExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'invalidParent' @ [134:41] ==> local final fun PsiElement?.invalidParent(): Boolean defined in org.jetbrains.kotlin.idea.intentions.JoinDeclarationAndAssignmentIntention.findAssignment[SimpleFunctionDescriptorImpl]

'assignments' @ [136:31] ==> val assignments: MutableList<KtBinaryExpression> defined in org.jetbrains.kotlin.idea.intentions.JoinDeclarationAndAssignmentIntention.findAssignment[LocalVariableDescriptor]

'firstOrNull' @ [136:43] ==> public fun <T> List<KtBinaryExpression>.firstOrNull(): KtBinaryExpression? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtBinaryExpression

'assignments' @ [137:13] ==> val assignments: MutableList<KtBinaryExpression> defined in org.jetbrains.kotlin.idea.intentions.JoinDeclarationAndAssignmentIntention.findAssignment[LocalVariableDescriptor]

'any' @ [137:25] ==> public inline fun <T> Iterable<KtBinaryExpression>.any(predicate: (KtBinaryExpression) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtBinaryExpression

'it' @ [137:31] ==> value-parameter it: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.JoinDeclarationAndAssignmentIntention.findAssignment.<anonymous>[ValueParameterDescriptorImpl]

'firstAssignment' @ [137:38] ==> val firstAssignment: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.JoinDeclarationAndAssignmentIntention.findAssignment[LocalVariableDescriptor]

'it' @ [137:57] ==> value-parameter it: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.JoinDeclarationAndAssignmentIntention.findAssignment.<anonymous>[ValueParameterDescriptorImpl]

'parent' @ [137:60] ==> public final val KtBinaryExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'parent' @ [137:67] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'firstAssignment' @ [139:23] ==> val firstAssignment: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.JoinDeclarationAndAssignmentIntention.findAssignment[LocalVariableDescriptor]

'analyze' @ [139:39] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'context' @ [140:34] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.intentions.JoinDeclarationAndAssignmentIntention.findAssignment[LocalVariableDescriptor]

'DECLARATION_TO_DESCRIPTOR' @ [140:57] ==> public final val DECLARATION_TO_DESCRIPTOR: (ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>..ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'property' @ [140:84] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.idea.intentions.JoinDeclarationAndAssignmentIntention.findAssignment[ValueParameterDescriptorImpl]

'firstAssignment' @ [141:34] ==> val firstAssignment: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.JoinDeclarationAndAssignmentIntention.findAssignment[LocalVariableDescriptor]

'left' @ [141:50] ==> public final val KtBinaryExpression.left: KtExpression?[MyPropertyDescriptor]

'getResolvedCall' @ [141:55] ==> public fun KtElement?.getResolvedCall(context: BindingContext): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'context' @ [141:71] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.intentions.JoinDeclarationAndAssignmentIntention.findAssignment[LocalVariableDescriptor]

'candidateDescriptor' @ [141:81] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.candidateDescriptor: CallableDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(out CallableDescriptor)

'propertyDescriptor' @ [142:13] ==> val propertyDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.intentions.JoinDeclarationAndAssignmentIntention.findAssignment[LocalVariableDescriptor]

'assignedDescriptor' @ [142:35] ==> val assignedDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.intentions.JoinDeclarationAndAssignmentIntention.findAssignment[LocalVariableDescriptor]

'propertyContainer' @ [144:13] ==> val propertyContainer: KtElement defined in org.jetbrains.kotlin.idea.intentions.JoinDeclarationAndAssignmentIntention.findAssignment[LocalVariableDescriptor]

'firstAssignment' @ [144:55] ==> val firstAssignment: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.JoinDeclarationAndAssignmentIntention.findAssignment[LocalVariableDescriptor]

'firstAssignment' @ [146:27] ==> val firstAssignment: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.JoinDeclarationAndAssignmentIntention.findAssignment[LocalVariableDescriptor]

'parent' @ [146:43] ==> public final val KtBinaryExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'if (blockParent.statements.firstOrNull() == firstAssignment) firstAssignment else null' @ [147:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtBinaryExpression?, elseBranch: KtBinaryExpression?): KtBinaryExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtBinaryExpression?

'blockParent' @ [147:20] ==> val blockParent: KtBlockExpression defined in org.jetbrains.kotlin.idea.intentions.JoinDeclarationAndAssignmentIntention.findAssignment[LocalVariableDescriptor]

'statements' @ [147:32] ==> public final val KtBlockExpression.statements: List<(KtExpression..KtExpression?)>[MyPropertyDescriptor]

'firstOrNull' @ [147:43] ==> public fun <T> List<(KtExpression..KtExpression?)>.firstOrNull(): KtExpression? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtExpression..org.jetbrains.kotlin.psi.KtExpression?)

'firstAssignment' @ [147:60] ==> val firstAssignment: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.JoinDeclarationAndAssignmentIntention.findAssignment[LocalVariableDescriptor]

'firstAssignment' @ [147:77] ==> val firstAssignment: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.JoinDeclarationAndAssignmentIntention.findAssignment[LocalVariableDescriptor]

'contentRange' @ [151:47] ==> public fun KtBlockExpression.contentRange(): PsiChildRange defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'isEmpty' @ [151:62] ==> public final val isEmpty: Boolean defined in org.jetbrains.kotlin.psi.psiUtil.PsiChildRange[DeserializedPropertyDescriptor]

'!' @ [154:16] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'element' @ [154:17] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.idea.intentions.JoinDeclarationAndAssignmentIntention.hasNoLocalDependencies[ValueParameterDescriptorImpl]

'anyDescendantOfType' @ [154:25] ==> public inline fun <reified T : PsiElement> PsiElement.anyDescendantOfType(noinline predicate: (PsiElement) -> Boolean = ...): Boolean defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> PsiElement

'child' @ [155:13] ==> value-parameter child: PsiElement defined in org.jetbrains.kotlin.idea.intentions.JoinDeclarationAndAssignmentIntention.hasNoLocalDependencies.<anonymous>[ValueParameterDescriptorImpl]

'resolveAllReferences' @ [155:19] ==> private fun PsiElement.resolveAllReferences(): Sequence<PsiElement?> defined in org.jetbrains.kotlin.idea.intentions in file JoinDeclarationAndAssignmentIntention.kt[SimpleFunctionDescriptorImpl]

'any' @ [155:42] ==> public inline fun <T> Sequence<PsiElement?>.any(predicate: (PsiElement?) -> Boolean): Boolean defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement?

'it' @ [155:48] ==> value-parameter it: PsiElement? defined in org.jetbrains.kotlin.idea.intentions.JoinDeclarationAndAssignmentIntention.hasNoLocalDependencies.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'isAncestor' @ [155:74] ==> @Contract public open fun isAncestor(@Nullable p0: PsiElement?, @NotNull p1: PsiElement, p2: Boolean): Boolean defined in com.intellij.psi.util.PsiTreeUtil[JavaMethodDescriptor]

'localContext' @ [155:85] ==> value-parameter localContext: PsiElement defined in org.jetbrains.kotlin.idea.intentions.JoinDeclarationAndAssignmentIntention.hasNoLocalDependencies[ValueParameterDescriptorImpl]

'it' @ [155:99] ==> value-parameter it: PsiElement? defined in org.jetbrains.kotlin.idea.intentions.JoinDeclarationAndAssignmentIntention.hasNoLocalDependencies.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'getService' @ [161:32] ==> public open fun getService(): (PsiReferenceService..PsiReferenceService?) defined in com.intellij.psi.PsiReferenceService[JavaMethodDescriptor]

'getReferences' @ [161:45] ==> @NotNull public abstract fun getReferences(@NotNull p0: PsiElement, @NotNull p1: PsiReferenceService.Hints): (MutableList<(PsiReference..PsiReference?)>..List<(PsiReference..PsiReference?)>) defined in com.intellij.psi.PsiReferenceService[JavaMethodDescriptor]

'this' @ [161:59] ==> <this> defined in org.jetbrains.kotlin.idea.intentions.resolveAllReferences[ReceiverParameterDescriptorImpl]

'NO_HINTS' @ [161:91] ==> public final val NO_HINTS: (PsiReferenceService.Hints..PsiReferenceService.Hints?) defined in com.intellij.psi.PsiReferenceService.Hints[JavaPropertyDescriptor]

'asSequence' @ [162:14] ==> public fun <T> Iterable<(PsiReference..PsiReference?)>.asSequence(): Sequence<(PsiReference..PsiReference?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiReference..com.intellij.psi.PsiReference?)

'map' @ [163:14] ==> public fun <T, R> Sequence<(PsiReference..PsiReference?)>.map(transform: ((PsiReference..PsiReference?)) -> PsiElement?): Sequence<PsiElement?> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiReference..com.intellij.psi.PsiReference?)
    <R> -> PsiElement?

'it' @ [163:20] ==> value-parameter it: (PsiReference..PsiReference?) defined in org.jetbrains.kotlin.idea.intentions.resolveAllReferences.<anonymous>[ValueParameterDescriptorImpl]

'resolve' @ [163:23] ==> @Nullable public abstract fun resolve(): PsiElement? defined in com.intellij.psi.PsiReference[JavaMethodDescriptor]

