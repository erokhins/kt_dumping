'when (node.elementType) {
        KtNodeTypes.THEN -> return "if"
        KtNodeTypes.ELSE -> return "else"
        KtNodeTypes.BODY -> {
            when (parent) {
                is KtWhileExpression -> return "while"
                is KtDoWhileExpression -> return "do...while"
                is KtForExpression -> return "for"
            }
        }
    }' @ [45:5] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Nothing, entry1: Nothing, entry2: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Nothing

'node' @ [45:11] ==> public final val KtContainerNode.node: ASTNode[MyPropertyDescriptor]

'elementType' @ [45:16] ==> public final val ASTNode.elementType: IElementType[MyPropertyDescriptor]

'THEN' @ [46:21] ==> public final val THEN: (KtNodeType..KtNodeType?) defined in org.jetbrains.kotlin.KtNodeTypes[JavaPropertyDescriptor]

'ELSE' @ [47:21] ==> public final val ELSE: (KtNodeType..KtNodeType?) defined in org.jetbrains.kotlin.KtNodeTypes[JavaPropertyDescriptor]

'BODY' @ [48:21] ==> public final val BODY: (KtNodeType..KtNodeType?) defined in org.jetbrains.kotlin.KtNodeTypes[JavaPropertyDescriptor]

'when (parent) {
                is KtWhileExpression -> return "while"
                is KtDoWhileExpression -> return "do...while"
                is KtForExpression -> return "for"
            }' @ [49:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Nothing, entry1: Nothing, entry2: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Nothing

'parent' @ [49:19] ==> public final val KtContainerNode.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'this' @ [60:24] ==> <this> defined in org.jetbrains.kotlin.idea.intentions.isMethodCall[ReceiverParameterDescriptorImpl]

'getResolvedCall' @ [60:29] ==> public fun KtElement?.getResolvedCall(context: BindingContext): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'this' @ [60:45] ==> <this> defined in org.jetbrains.kotlin.idea.intentions.isMethodCall[ReceiverParameterDescriptorImpl]

'analyze' @ [60:50] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'resolvedCall' @ [61:12] ==> val resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.idea.intentions.isMethodCall[LocalVariableDescriptor]

'resultingDescriptor' @ [61:25] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.resultingDescriptor: CallableDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> CallableDescriptor

'fqNameUnsafe' @ [61:45] ==> public val DeclarationDescriptor.fqNameUnsafe: FqNameUnsafe defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'asString' @ [61:58] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqNameUnsafe[JavaMethodDescriptor]

'fqMethodName' @ [61:72] ==> value-parameter fqMethodName: String defined in org.jetbrains.kotlin.idea.intentions.isMethodCall[ValueParameterDescriptorImpl]

'expression' @ [65:9] ==> value-parameter expression: KtNameReferenceExpression defined in org.jetbrains.kotlin.idea.intentions.isAutoCreatedItUsage[ValueParameterDescriptorImpl]

'getReferencedName' @ [65:20] ==> public open fun getReferencedName(): String defined in org.jetbrains.kotlin.psi.KtNameReferenceExpression[DeserializedSimpleFunctionDescriptor]

'expression' @ [66:19] ==> value-parameter expression: KtNameReferenceExpression defined in org.jetbrains.kotlin.idea.intentions.isAutoCreatedItUsage[ValueParameterDescriptorImpl]

'analyze' @ [66:30] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'PARTIAL' @ [66:54] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'expression' @ [67:18] ==> value-parameter expression: KtNameReferenceExpression defined in org.jetbrains.kotlin.idea.intentions.isAutoCreatedItUsage[ValueParameterDescriptorImpl]

'mainReference' @ [67:29] ==> public val KtSimpleNameExpression.mainReference: KtSimpleNameReference defined in org.jetbrains.kotlin.idea.references[DeserializedPropertyDescriptor]

'resolveToDescriptors' @ [67:43] ==> public open fun resolveToDescriptors(bindingContext: BindingContext): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.references.KtSimpleNameReference[DeserializedSimpleFunctionDescriptor]

'context' @ [67:64] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.intentions.isAutoCreatedItUsage[LocalVariableDescriptor]

'singleOrNull' @ [67:73] ==> public fun <T> Iterable<DeclarationDescriptor>.singleOrNull(): DeclarationDescriptor? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'context' @ [68:12] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.intentions.isAutoCreatedItUsage[LocalVariableDescriptor]

'AUTO_CREATED_IT' @ [68:35] ==> public final val AUTO_CREATED_IT: (WritableSlice<(ValueParameterDescriptor..ValueParameterDescriptor?), (Boolean..Boolean?)>..WritableSlice<(ValueParameterDescriptor..ValueParameterDescriptor?), (Boolean..Boolean?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'target' @ [68:52] ==> val target: ValueParameterDescriptor defined in org.jetbrains.kotlin.idea.intentions.isAutoCreatedItUsage[LocalVariableDescriptor]

'property' @ [73:18] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.idea.intentions.splitPropertyDeclaration[ValueParameterDescriptorImpl]

'parent' @ [73:27] ==> public final val KtProperty.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'property' @ [75:23] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.idea.intentions.splitPropertyDeclaration[ValueParameterDescriptorImpl]

'initializer' @ [75:32] ==> public final var KtProperty.initializer: KtExpression?[MyPropertyDescriptor]

'if (property.typeReference != null) null else initializer.analyze().getType(initializer)' @ [77:29] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KotlinType?, elseBranch: KotlinType?): KotlinType?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KotlinType?

'property' @ [77:33] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.idea.intentions.splitPropertyDeclaration[ValueParameterDescriptorImpl]

'typeReference' @ [77:42] ==> public final var KtProperty.typeReference: KtTypeReference?[MyPropertyDescriptor]

'initializer' @ [77:75] ==> val initializer: KtExpression defined in org.jetbrains.kotlin.idea.intentions.splitPropertyDeclaration[LocalVariableDescriptor]

'analyze' @ [77:87] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'getType' @ [77:97] ==> @Nullable public abstract fun getType(@NotNull p0: KtExpression): KotlinType? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]

'initializer' @ [77:105] ==> val initializer: KtExpression defined in org.jetbrains.kotlin.idea.intentions.splitPropertyDeclaration[LocalVariableDescriptor]

'KtPsiFactory' @ [79:22] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'property' @ [79:35] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.idea.intentions.splitPropertyDeclaration[ValueParameterDescriptorImpl]

'psiFactory' @ [80:22] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.intentions.splitPropertyDeclaration[LocalVariableDescriptor]

'createExpressionByPattern' @ [80:33] ==> public fun KtPsiFactory.createExpressionByPattern(pattern: String, vararg args: Any, reformat: Boolean = ...): KtExpression defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'property' @ [80:70] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.idea.intentions.splitPropertyDeclaration[ValueParameterDescriptorImpl]

'nameAsName' @ [80:79] ==> public final val KtProperty.nameAsName: Name?[MyPropertyDescriptor]

'initializer' @ [80:93] ==> val initializer: KtExpression defined in org.jetbrains.kotlin.idea.intentions.splitPropertyDeclaration[LocalVariableDescriptor]

'assignment' @ [82:5] ==> var assignment: KtExpression defined in org.jetbrains.kotlin.idea.intentions.splitPropertyDeclaration[LocalVariableDescriptor]

'parent' @ [82:18] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.intentions.splitPropertyDeclaration[LocalVariableDescriptor]

'addAfter' @ [82:25] ==> public abstract fun addAfter(@NotNull p0: PsiElement, @Nullable p1: PsiElement?): (PsiElement..PsiElement?) defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'assignment' @ [82:34] ==> var assignment: KtExpression defined in org.jetbrains.kotlin.idea.intentions.splitPropertyDeclaration[LocalVariableDescriptor]

'property' @ [82:46] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.idea.intentions.splitPropertyDeclaration[ValueParameterDescriptorImpl]

'parent' @ [83:5] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.intentions.splitPropertyDeclaration[LocalVariableDescriptor]

'addAfter' @ [83:12] ==> public abstract fun addAfter(@NotNull p0: PsiElement, @Nullable p1: PsiElement?): (PsiElement..PsiElement?) defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'psiFactory' @ [83:21] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.intentions.splitPropertyDeclaration[LocalVariableDescriptor]

'createNewLine' @ [83:32] ==> public final fun createNewLine(): PsiElement defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'property' @ [83:49] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.idea.intentions.splitPropertyDeclaration[ValueParameterDescriptorImpl]

'property' @ [85:5] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.idea.intentions.splitPropertyDeclaration[ValueParameterDescriptorImpl]

'initializer' @ [85:14] ==> public final var KtProperty.initializer: KtExpression?[MyPropertyDescriptor]

'explicitTypeToSet' @ [87:9] ==> val explicitTypeToSet: KotlinType? defined in org.jetbrains.kotlin.idea.intentions.splitPropertyDeclaration[LocalVariableDescriptor]

'property' @ [88:9] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.idea.intentions.splitPropertyDeclaration[ValueParameterDescriptorImpl]

'setType' @ [88:18] ==> public fun KtCallableDeclaration.setType(type: KotlinType, shortenReferences: Boolean = ...): Unit defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'explicitTypeToSet' @ [88:26] ==> val explicitTypeToSet: KotlinType? defined in org.jetbrains.kotlin.idea.intentions.splitPropertyDeclaration[LocalVariableDescriptor]

'assignment' @ [91:12] ==> var assignment: KtExpression defined in org.jetbrains.kotlin.idea.intentions.splitPropertyDeclaration[LocalVariableDescriptor]

'selectorExpression' @ [95:13] ==> public open val selectorExpression: KtExpression? defined in org.jetbrains.kotlin.psi.KtQualifiedExpression[DeserializedPropertyDescriptor]

'callExpression' @ [98:14] ==> public val KtQualifiedExpression.callExpression: KtCallExpression? defined in org.jetbrains.kotlin.idea.intentions in file Utils.kt[PropertyDescriptorImpl]

'calleeExpression' @ [98:30] ==> public final val KtCallExpression.calleeExpression: KtExpression?[MyPropertyDescriptor]

'text' @ [98:79] ==> public final val KtNameReferenceExpression.text: (String..String?)[MyPropertyDescriptor]

'callExpression' @ [101:26] ==> public val KtQualifiedExpression.callExpression: KtCallExpression? defined in org.jetbrains.kotlin.idea.intentions in file Utils.kt[PropertyDescriptorImpl]

'callExpression' @ [102:12] ==> val callExpression: KtCallExpression defined in org.jetbrains.kotlin.idea.intentions.toResolvedCall[LocalVariableDescriptor]

'getResolvedCall' @ [102:27] ==> public fun KtElement?.getResolvedCall(context: BindingContext): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'callExpression' @ [102:43] ==> val callExpression: KtCallExpression defined in org.jetbrains.kotlin.idea.intentions.toResolvedCall[LocalVariableDescriptor]

'analyze' @ [102:58] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'bodyResolveMode' @ [102:66] ==> value-parameter bodyResolveMode: BodyResolveMode defined in org.jetbrains.kotlin.idea.intentions.toResolvedCall[ValueParameterDescriptorImpl]

'when (this) {
    is KtContinueExpression, is KtBreakExpression, is KtThrowExpression, is KtReturnExpression -> true
    else -> false
}' @ [105:47] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'this' @ [105:53] ==> <this> defined in org.jetbrains.kotlin.idea.intentions.isExitStatement[ReceiverParameterDescriptorImpl]

'receiverExpression' @ [112:20] ==> public open val receiverExpression: KtExpression defined in org.jetbrains.kotlin.psi.KtQualifiedExpression[DeserializedPropertyDescriptor]

'receiver' @ [113:9] ==> val receiver: KtExpression defined in org.jetbrains.kotlin.idea.intentions.isReceiverExpressionWithValue[LocalVariableDescriptor]

'analyze' @ [114:12] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'getType' @ [114:22] ==> @Nullable public abstract fun getType(@NotNull p0: KtExpression): KotlinType? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]

'receiver' @ [114:30] ==> val receiver: KtExpression defined in org.jetbrains.kotlin.idea.intentions.isReceiverExpressionWithValue[LocalVariableDescriptor]

'specialNegation' @ [118:27] ==> private fun KtExpression.specialNegation(): KtExpression? defined in org.jetbrains.kotlin.idea.intentions in file Utils.kt[SimpleFunctionDescriptorImpl]

'specialNegation' @ [119:9] ==> val specialNegation: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.negate[LocalVariableDescriptor]

'specialNegation' @ [119:41] ==> val specialNegation: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.negate[LocalVariableDescriptor]

'KtPsiFactory' @ [120:12] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'this' @ [120:25] ==> <this> defined in org.jetbrains.kotlin.idea.intentions.negate[ReceiverParameterDescriptorImpl]

'createExpressionByPattern' @ [120:31] ==> public fun KtPsiFactory.createExpressionByPattern(pattern: String, vararg args: Any, reformat: Boolean = ...): KtExpression defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'this' @ [120:64] ==> <this> defined in org.jetbrains.kotlin.idea.intentions.negate[ReceiverParameterDescriptorImpl]

'when (this) {
    is KtWhenExpression -> listOf(this) + entries.map { it.expression?.resultingWhens() ?: listOf() }.flatten()
    is KtIfExpression -> (then?.resultingWhens() ?: listOf()) + (`else`?.resultingWhens() ?: listOf())
    is KtBinaryExpression -> (left?.resultingWhens() ?: listOf()) + (right?.resultingWhens() ?: listOf())
    is KtUnaryExpression -> this.baseExpression?.resultingWhens() ?: listOf()
    is KtBlockExpression -> statements.lastOrNull()?.resultingWhens() ?: listOf()
    else -> listOf()
}' @ [123:61] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: List<KtWhenExpression>, entry1: List<KtWhenExpression>, entry2: List<KtWhenExpression>, entry3: List<KtWhenExpression>, entry4: List<KtWhenExpression>, entry5: List<KtWhenExpression>): List<KtWhenExpression>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> List<KtWhenExpression>

'this' @ [123:67] ==> <this> defined in org.jetbrains.kotlin.idea.intentions.resultingWhens[ReceiverParameterDescriptorImpl]

'listOf' @ [124:28] ==> public fun <T> listOf(element: KtWhenExpression): List<KtWhenExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtWhenExpression

'this' @ [124:35] ==> <this> defined in org.jetbrains.kotlin.idea.intentions.resultingWhens[ReceiverParameterDescriptorImpl]

'entries' @ [124:43] ==> public final val KtWhenExpression.entries: (MutableList<(KtWhenEntry..KtWhenEntry?)>..List<(KtWhenEntry..KtWhenEntry?)>)[MyPropertyDescriptor]

'map' @ [124:51] ==> public inline fun <T, R> Iterable<(KtWhenEntry..KtWhenEntry?)>.map(transform: ((KtWhenEntry..KtWhenEntry?)) -> List<KtWhenExpression>): List<List<KtWhenExpression>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtWhenEntry..org.jetbrains.kotlin.psi.KtWhenEntry?)
    <R> -> List<KtWhenExpression>

'it' @ [124:57] ==> value-parameter it: (KtWhenEntry..KtWhenEntry?) defined in org.jetbrains.kotlin.idea.intentions.resultingWhens.<anonymous>[ValueParameterDescriptorImpl]

'expression' @ [124:60] ==> public final val KtWhenEntry.expression: KtExpression?[MyPropertyDescriptor]

'resultingWhens' @ [124:72] ==> public fun KtExpression.resultingWhens(): List<KtWhenExpression> defined in org.jetbrains.kotlin.idea.intentions[SimpleFunctionDescriptorImpl]

'listOf' @ [124:92] ==> @InlineOnly public inline fun <T> listOf(): List<KtWhenExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtWhenExpression

'flatten' @ [124:103] ==> public fun <T> Iterable<Iterable<KtWhenExpression>>.flatten(): List<KtWhenExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtWhenExpression

'+' @ [125:26] ==> public operator fun <T> Collection<KtWhenExpression>.plus(elements: Iterable<KtWhenExpression>): List<KtWhenExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtWhenExpression

'then' @ [125:27] ==> public final val KtIfExpression.then: KtExpression?[MyPropertyDescriptor]

'resultingWhens' @ [125:33] ==> public fun KtExpression.resultingWhens(): List<KtWhenExpression> defined in org.jetbrains.kotlin.idea.intentions[SimpleFunctionDescriptorImpl]

'listOf' @ [125:53] ==> @InlineOnly public inline fun <T> listOf(): List<KtWhenExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtWhenExpression

'`else`' @ [125:66] ==> public final val KtIfExpression.`else`: KtExpression?[MyPropertyDescriptor]

'resultingWhens' @ [125:74] ==> public fun KtExpression.resultingWhens(): List<KtWhenExpression> defined in org.jetbrains.kotlin.idea.intentions[SimpleFunctionDescriptorImpl]

'listOf' @ [125:94] ==> @InlineOnly public inline fun <T> listOf(): List<KtWhenExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtWhenExpression

'+' @ [126:30] ==> public operator fun <T> Collection<KtWhenExpression>.plus(elements: Iterable<KtWhenExpression>): List<KtWhenExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtWhenExpression

'left' @ [126:31] ==> public final val KtBinaryExpression.left: KtExpression?[MyPropertyDescriptor]

'resultingWhens' @ [126:37] ==> public fun KtExpression.resultingWhens(): List<KtWhenExpression> defined in org.jetbrains.kotlin.idea.intentions[SimpleFunctionDescriptorImpl]

'listOf' @ [126:57] ==> @InlineOnly public inline fun <T> listOf(): List<KtWhenExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtWhenExpression

'right' @ [126:70] ==> public final val KtBinaryExpression.right: KtExpression?[MyPropertyDescriptor]

'resultingWhens' @ [126:77] ==> public fun KtExpression.resultingWhens(): List<KtWhenExpression> defined in org.jetbrains.kotlin.idea.intentions[SimpleFunctionDescriptorImpl]

'listOf' @ [126:97] ==> @InlineOnly public inline fun <T> listOf(): List<KtWhenExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtWhenExpression

'this' @ [127:29] ==> <this> defined in org.jetbrains.kotlin.idea.intentions.resultingWhens[ReceiverParameterDescriptorImpl]

'baseExpression' @ [127:34] ==> public final val KtUnaryExpression.baseExpression: KtExpression?[MyPropertyDescriptor]

'resultingWhens' @ [127:50] ==> public fun KtExpression.resultingWhens(): List<KtWhenExpression> defined in org.jetbrains.kotlin.idea.intentions[SimpleFunctionDescriptorImpl]

'listOf' @ [127:70] ==> @InlineOnly public inline fun <T> listOf(): List<KtWhenExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtWhenExpression

'statements' @ [128:29] ==> public final val KtBlockExpression.statements: List<(KtExpression..KtExpression?)>[MyPropertyDescriptor]

'lastOrNull' @ [128:40] ==> public fun <T> List<(KtExpression..KtExpression?)>.lastOrNull(): KtExpression? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtExpression..org.jetbrains.kotlin.psi.KtExpression?)

'resultingWhens' @ [128:54] ==> public fun KtExpression.resultingWhens(): List<KtWhenExpression> defined in org.jetbrains.kotlin.idea.intentions[SimpleFunctionDescriptorImpl]

'listOf' @ [128:74] ==> @InlineOnly public inline fun <T> listOf(): List<KtWhenExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtWhenExpression

'listOf' @ [129:13] ==> @InlineOnly public inline fun <T> listOf(): List<KtWhenExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtWhenExpression

'when (this) {
    is KtIfExpression -> `else` == null || then.hasResultingIfWithoutElse() || `else`.hasResultingIfWithoutElse()
    is KtWhenExpression -> entries.any { it.expression.hasResultingIfWithoutElse() }
    is KtBinaryExpression -> left.hasResultingIfWithoutElse() || right.hasResultingIfWithoutElse()
    is KtUnaryExpression -> baseExpression.hasResultingIfWithoutElse()
    is KtBlockExpression -> statements.lastOrNull().hasResultingIfWithoutElse()
    else -> false
}' @ [132:58] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean, entry3: Boolean, entry4: Boolean, entry5: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'this' @ [132:64] ==> <this> defined in org.jetbrains.kotlin.idea.intentions.hasResultingIfWithoutElse[ReceiverParameterDescriptorImpl]

'`else`' @ [133:26] ==> public final val KtIfExpression.`else`: KtExpression?[MyPropertyDescriptor]

'then' @ [133:44] ==> public final val KtIfExpression.then: KtExpression?[MyPropertyDescriptor]

'hasResultingIfWithoutElse' @ [133:49] ==> public fun KtExpression?.hasResultingIfWithoutElse(): Boolean defined in org.jetbrains.kotlin.idea.intentions in file Utils.kt[SimpleFunctionDescriptorImpl]

'`else`' @ [133:80] ==> public final val KtIfExpression.`else`: KtExpression?[MyPropertyDescriptor]

'hasResultingIfWithoutElse' @ [133:87] ==> public fun KtExpression?.hasResultingIfWithoutElse(): Boolean defined in org.jetbrains.kotlin.idea.intentions in file Utils.kt[SimpleFunctionDescriptorImpl]

'entries' @ [134:28] ==> public final val KtWhenExpression.entries: (MutableList<(KtWhenEntry..KtWhenEntry?)>..List<(KtWhenEntry..KtWhenEntry?)>)[MyPropertyDescriptor]

'any' @ [134:36] ==> public inline fun <T> Iterable<(KtWhenEntry..KtWhenEntry?)>.any(predicate: ((KtWhenEntry..KtWhenEntry?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtWhenEntry..org.jetbrains.kotlin.psi.KtWhenEntry?)

'it' @ [134:42] ==> value-parameter it: (KtWhenEntry..KtWhenEntry?) defined in org.jetbrains.kotlin.idea.intentions.hasResultingIfWithoutElse.<anonymous>[ValueParameterDescriptorImpl]

'expression' @ [134:45] ==> public final val KtWhenEntry.expression: KtExpression?[MyPropertyDescriptor]

'hasResultingIfWithoutElse' @ [134:56] ==> public fun KtExpression?.hasResultingIfWithoutElse(): Boolean defined in org.jetbrains.kotlin.idea.intentions in file Utils.kt[SimpleFunctionDescriptorImpl]

'left' @ [135:30] ==> public final val KtBinaryExpression.left: KtExpression?[MyPropertyDescriptor]

'hasResultingIfWithoutElse' @ [135:35] ==> public fun KtExpression?.hasResultingIfWithoutElse(): Boolean defined in org.jetbrains.kotlin.idea.intentions in file Utils.kt[SimpleFunctionDescriptorImpl]

'right' @ [135:66] ==> public final val KtBinaryExpression.right: KtExpression?[MyPropertyDescriptor]

'hasResultingIfWithoutElse' @ [135:72] ==> public fun KtExpression?.hasResultingIfWithoutElse(): Boolean defined in org.jetbrains.kotlin.idea.intentions in file Utils.kt[SimpleFunctionDescriptorImpl]

'baseExpression' @ [136:29] ==> public final val KtUnaryExpression.baseExpression: KtExpression?[MyPropertyDescriptor]

'hasResultingIfWithoutElse' @ [136:44] ==> public fun KtExpression?.hasResultingIfWithoutElse(): Boolean defined in org.jetbrains.kotlin.idea.intentions in file Utils.kt[SimpleFunctionDescriptorImpl]

'statements' @ [137:29] ==> public final val KtBlockExpression.statements: List<(KtExpression..KtExpression?)>[MyPropertyDescriptor]

'lastOrNull' @ [137:40] ==> public fun <T> List<(KtExpression..KtExpression?)>.lastOrNull(): KtExpression? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtExpression..org.jetbrains.kotlin.psi.KtExpression?)

'hasResultingIfWithoutElse' @ [137:53] ==> public fun KtExpression?.hasResultingIfWithoutElse(): Boolean defined in org.jetbrains.kotlin.idea.intentions in file Utils.kt[SimpleFunctionDescriptorImpl]

'KtPsiFactory' @ [142:19] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'this' @ [142:32] ==> <this> defined in org.jetbrains.kotlin.idea.intentions.specialNegation[ReceiverParameterDescriptorImpl]

'when (this) {
        is KtPrefixExpression -> {
            if (operationReference.getReferencedName() == "!") {
                val baseExpression = baseExpression
                if (baseExpression != null) {
                    val bindingContext = baseExpression.analyze(BodyResolveMode.PARTIAL)
                    val type = bindingContext.getType(baseExpression)
                    if (type != null && KotlinBuiltIns.isBoolean(type)) {
                        return KtPsiUtil.safeDeparenthesize(baseExpression)
                    }
                }
            }
        }

        is KtBinaryExpression -> {
            val operator = operationToken
            if (operator !in NEGATABLE_OPERATORS) return null
            val left = left ?: return null
            val right = right ?: return null
            return factory.createExpressionByPattern("$0 $1 $2", left, getNegatedOperatorText(operator), right)
        }

        is KtIsExpression -> {
            return factory.createExpressionByPattern("$0 $1 $2",
                                                     leftHandSide,
                                                     if (isNegated) "is" else "!is",
                                                     typeReference ?: return null)
        }

        is KtConstantExpression -> {
            return when (text) {
                "true" -> factory.createExpression("false")
                "false" -> factory.createExpression("true")
                else -> null
            }
        }
    }' @ [143:5] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit, entry3: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'this' @ [143:11] ==> <this> defined in org.jetbrains.kotlin.idea.intentions.specialNegation[ReceiverParameterDescriptorImpl]

'operationReference' @ [145:17] ==> public final val KtPrefixExpression.operationReference: KtSimpleNameExpression[MyPropertyDescriptor]

'getReferencedName' @ [145:36] ==> public abstract fun getReferencedName(): String defined in org.jetbrains.kotlin.psi.KtSimpleNameExpression[DeserializedSimpleFunctionDescriptor]

'baseExpression' @ [146:38] ==> public final val KtPrefixExpression.baseExpression: KtExpression?[MyPropertyDescriptor]

'baseExpression' @ [147:21] ==> val baseExpression: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.specialNegation[LocalVariableDescriptor]

'baseExpression' @ [148:42] ==> val baseExpression: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.specialNegation[LocalVariableDescriptor]

'analyze' @ [148:57] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'PARTIAL' @ [148:81] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'bindingContext' @ [149:32] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.intentions.specialNegation[LocalVariableDescriptor]

'getType' @ [149:47] ==> @Nullable public abstract fun getType(@NotNull p0: KtExpression): KotlinType? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]

'baseExpression' @ [149:55] ==> val baseExpression: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.specialNegation[LocalVariableDescriptor]

'type' @ [150:25] ==> val type: KotlinType? defined in org.jetbrains.kotlin.idea.intentions.specialNegation[LocalVariableDescriptor]

'isBoolean' @ [150:56] ==> public open fun isBoolean(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'type' @ [150:66] ==> val type: KotlinType? defined in org.jetbrains.kotlin.idea.intentions.specialNegation[LocalVariableDescriptor]

'safeDeparenthesize' @ [151:42] ==> @NotNull public open fun safeDeparenthesize(@NotNull p0: KtExpression): KtExpression defined in org.jetbrains.kotlin.psi.KtPsiUtil[JavaMethodDescriptor]

'baseExpression' @ [151:61] ==> val baseExpression: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.specialNegation[LocalVariableDescriptor]

'operationToken' @ [158:28] ==> public final val KtBinaryExpression.operationToken: IElementType[MyPropertyDescriptor]

'operator' @ [159:17] ==> val operator: IElementType defined in org.jetbrains.kotlin.idea.intentions.specialNegation[LocalVariableDescriptor]

'NEGATABLE_OPERATORS' @ [159:30] ==> private val NEGATABLE_OPERATORS: Set<(KtSingleValueToken..KtSingleValueToken?)> defined in org.jetbrains.kotlin.idea.intentions in file Utils.kt[PropertyDescriptorImpl]

'left' @ [160:24] ==> public final val KtBinaryExpression.left: KtExpression?[MyPropertyDescriptor]

'right' @ [161:25] ==> public final val KtBinaryExpression.right: KtExpression?[MyPropertyDescriptor]

'factory' @ [162:20] ==> val factory: KtPsiFactory defined in org.jetbrains.kotlin.idea.intentions.specialNegation[LocalVariableDescriptor]

'createExpressionByPattern' @ [162:28] ==> public fun KtPsiFactory.createExpressionByPattern(pattern: String, vararg args: Any, reformat: Boolean = ...): KtExpression defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'left' @ [162:66] ==> val left: KtExpression defined in org.jetbrains.kotlin.idea.intentions.specialNegation[LocalVariableDescriptor]

'getNegatedOperatorText' @ [162:72] ==> private fun getNegatedOperatorText(token: IElementType): String defined in org.jetbrains.kotlin.idea.intentions in file Utils.kt[SimpleFunctionDescriptorImpl]

'operator' @ [162:95] ==> val operator: IElementType defined in org.jetbrains.kotlin.idea.intentions.specialNegation[LocalVariableDescriptor]

'right' @ [162:106] ==> val right: KtExpression defined in org.jetbrains.kotlin.idea.intentions.specialNegation[LocalVariableDescriptor]

'factory' @ [166:20] ==> val factory: KtPsiFactory defined in org.jetbrains.kotlin.idea.intentions.specialNegation[LocalVariableDescriptor]

'createExpressionByPattern' @ [166:28] ==> public fun KtPsiFactory.createExpressionByPattern(pattern: String, vararg args: Any, reformat: Boolean = ...): KtExpression defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'leftHandSide' @ [167:54] ==> public final val KtIsExpression.leftHandSide: KtExpression[MyPropertyDescriptor]

'if (isNegated) "is" else "!is"' @ [168:54] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'isNegated' @ [168:58] ==> public final val KtIsExpression.isNegated: Boolean[MyPropertyDescriptor]

'typeReference' @ [169:54] ==> public final val KtIsExpression.typeReference: KtTypeReference?[MyPropertyDescriptor]

'when (text) {
                "true" -> factory.createExpression("false")
                "false" -> factory.createExpression("true")
                else -> null
            }' @ [173:20] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KtExpression?, entry1: KtExpression?, entry2: KtExpression?): KtExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KtExpression?

'text' @ [173:26] ==> public final val KtConstantExpression.text: (String..String?)[MyPropertyDescriptor]

'factory' @ [174:27] ==> val factory: KtPsiFactory defined in org.jetbrains.kotlin.idea.intentions.specialNegation[LocalVariableDescriptor]

'createExpression' @ [174:35] ==> public final fun createExpression(text: String): KtExpression defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'factory' @ [175:28] ==> val factory: KtPsiFactory defined in org.jetbrains.kotlin.idea.intentions.specialNegation[LocalVariableDescriptor]

'createExpression' @ [175:36] ==> public final fun createExpression(text: String): KtExpression defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'setOf' @ [183:35] ==> public fun <T> setOf(vararg elements: (KtSingleValueToken..KtSingleValueToken?)): Set<(KtSingleValueToken..KtSingleValueToken?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.lexer.KtSingleValueToken..org.jetbrains.kotlin.lexer.KtSingleValueToken?)

'EQEQ' @ [183:50] ==> public final val EQEQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'EXCLEQ' @ [183:65] ==> public final val EXCLEQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'EQEQEQ' @ [183:82] ==> public final val EQEQEQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'EXCLEQEQEQ' @ [184:50] ==> public final val EXCLEQEQEQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'IS_KEYWORD' @ [184:71] ==> public final val IS_KEYWORD: (KtKeywordToken..KtKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'NOT_IS' @ [184:92] ==> public final val NOT_IS: (KtKeywordToken..KtKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'IN_KEYWORD' @ [184:109] ==> public final val IN_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'NOT_IN' @ [185:50] ==> public final val NOT_IN: (KtKeywordToken..KtKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'LT' @ [185:67] ==> public final val LT: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'LTEQ' @ [185:80] ==> public final val LTEQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'GT' @ [185:95] ==> public final val GT: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'GTEQ' @ [185:108] ==> public final val GTEQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'when(token) {
        KtTokens.EQEQ -> KtTokens.EXCLEQ.value
        KtTokens.EXCLEQ -> KtTokens.EQEQ.value
        KtTokens.EQEQEQ -> KtTokens.EXCLEQEQEQ.value
        KtTokens.EXCLEQEQEQ -> KtTokens.EQEQEQ.value
        KtTokens.IS_KEYWORD -> KtTokens.NOT_IS.value
        KtTokens.NOT_IS -> KtTokens.IS_KEYWORD.value
        KtTokens.IN_KEYWORD -> KtTokens.NOT_IN.value
        KtTokens.NOT_IN -> KtTokens.IN_KEYWORD.value
        KtTokens.LT -> KtTokens.GTEQ.value
        KtTokens.LTEQ -> KtTokens.GT.value
        KtTokens.GT -> KtTokens.LTEQ.value
        KtTokens.GTEQ -> KtTokens.LT.value
        else -> throw IllegalArgumentException("The token $token does not have a negated equivalent.")
    }' @ [188:12] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String, entry1: String, entry2: String, entry3: String, entry4: String, entry5: String, entry6: String, entry7: String, entry8: String, entry9: String, entry10: String, entry11: String, entry12: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String

'token' @ [188:17] ==> value-parameter token: IElementType defined in org.jetbrains.kotlin.idea.intentions.getNegatedOperatorText[ValueParameterDescriptorImpl]

'EQEQ' @ [189:18] ==> public final val EQEQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'EXCLEQ' @ [189:35] ==> public final val EXCLEQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'value' @ [189:42] ==> public final val KtSingleValueToken.value: String[MyPropertyDescriptor]

'EXCLEQ' @ [190:18] ==> public final val EXCLEQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'EQEQ' @ [190:37] ==> public final val EQEQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'value' @ [190:42] ==> public final val KtSingleValueToken.value: String[MyPropertyDescriptor]

'EQEQEQ' @ [191:18] ==> public final val EQEQEQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'EXCLEQEQEQ' @ [191:37] ==> public final val EXCLEQEQEQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'value' @ [191:48] ==> public final val KtSingleValueToken.value: String[MyPropertyDescriptor]

'EXCLEQEQEQ' @ [192:18] ==> public final val EXCLEQEQEQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'EQEQEQ' @ [192:41] ==> public final val EQEQEQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'value' @ [192:48] ==> public final val KtSingleValueToken.value: String[MyPropertyDescriptor]

'IS_KEYWORD' @ [193:18] ==> public final val IS_KEYWORD: (KtKeywordToken..KtKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'NOT_IS' @ [193:41] ==> public final val NOT_IS: (KtKeywordToken..KtKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'value' @ [193:48] ==> public final val KtKeywordToken.value: String[MyPropertyDescriptor]

'NOT_IS' @ [194:18] ==> public final val NOT_IS: (KtKeywordToken..KtKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'IS_KEYWORD' @ [194:37] ==> public final val IS_KEYWORD: (KtKeywordToken..KtKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'value' @ [194:48] ==> public final val KtKeywordToken.value: String[MyPropertyDescriptor]

'IN_KEYWORD' @ [195:18] ==> public final val IN_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'NOT_IN' @ [195:41] ==> public final val NOT_IN: (KtKeywordToken..KtKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'value' @ [195:48] ==> public final val KtKeywordToken.value: String[MyPropertyDescriptor]

'NOT_IN' @ [196:18] ==> public final val NOT_IN: (KtKeywordToken..KtKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'IN_KEYWORD' @ [196:37] ==> public final val IN_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'value' @ [196:48] ==> public final val KtModifierKeywordToken.value: String[MyPropertyDescriptor]

'LT' @ [197:18] ==> public final val LT: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'GTEQ' @ [197:33] ==> public final val GTEQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'value' @ [197:38] ==> public final val KtSingleValueToken.value: String[MyPropertyDescriptor]

'LTEQ' @ [198:18] ==> public final val LTEQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'GT' @ [198:35] ==> public final val GT: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'value' @ [198:38] ==> public final val KtSingleValueToken.value: String[MyPropertyDescriptor]

'GT' @ [199:18] ==> public final val GT: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'LTEQ' @ [199:33] ==> public final val LTEQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'value' @ [199:38] ==> public final val KtSingleValueToken.value: String[MyPropertyDescriptor]

'GTEQ' @ [200:18] ==> public final val GTEQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'LT' @ [200:35] ==> public final val LT: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'value' @ [200:38] ==> public final val KtSingleValueToken.value: String[MyPropertyDescriptor]

'IllegalArgumentException' @ [201:23] ==> public constructor IllegalArgumentException(p0: (String..String?)) defined in java.lang.IllegalArgumentException[JavaClassConstructorDescriptor]

'token' @ [201:60] ==> value-parameter token: IElementType defined in org.jetbrains.kotlin.idea.intentions.getNegatedOperatorText[ValueParameterDescriptorImpl]

'isFlexible' @ [206:9] ==> public fun KotlinType.isFlexible(): Boolean defined in org.jetbrains.kotlin.types[DeserializedSimpleFunctionDescriptor]

'arguments' @ [207:12] ==> public abstract val arguments: List<TypeProjection> defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'any' @ [207:22] ==> public inline fun <T> Iterable<TypeProjection>.any(predicate: (TypeProjection) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeProjection

'!' @ [207:28] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [207:29] ==> value-parameter it: TypeProjection defined in org.jetbrains.kotlin.idea.intentions.isFlexibleRecursive.<anonymous>[ValueParameterDescriptorImpl]

'isStarProjection' @ [207:32] ==> public final val TypeProjection.isStarProjection: Boolean[MyPropertyDescriptor]

'it' @ [207:52] ==> value-parameter it: TypeProjection defined in org.jetbrains.kotlin.idea.intentions.isFlexibleRecursive.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [207:55] ==> public final val TypeProjection.type: KotlinType[MyPropertyDescriptor]

'isFlexibleRecursive' @ [207:60] ==> internal fun KotlinType.isFlexibleRecursive(): Boolean defined in org.jetbrains.kotlin.idea.intentions in file Utils.kt[SimpleFunctionDescriptorImpl]

'ifBranchesOrThis' @ [210:58] ==> private fun KtExpression.ifBranchesOrThis(): List<KtExpression?> defined in org.jetbrains.kotlin.idea.intentions[SimpleFunctionDescriptorImpl]

'this' @ [213:9] ==> <this> defined in org.jetbrains.kotlin.idea.intentions.ifBranchesOrThis[ReceiverParameterDescriptorImpl]

'listOf' @ [213:41] ==> public fun <T> listOf(element: KtExpression): List<KtExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression

'this' @ [213:48] ==> <this> defined in org.jetbrains.kotlin.idea.intentions.ifBranchesOrThis[ReceiverParameterDescriptorImpl]

'listOf' @ [214:12] ==> public fun <T> listOf(element: KtExpression?): List<KtExpression?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression?

'then' @ [214:19] ==> public final val KtIfExpression.then: KtExpression?[MyPropertyDescriptor]

'`else`' @ [214:27] ==> public final val KtIfExpression.`else`: KtExpression?[MyPropertyDescriptor]

'ifBranchesOrThis' @ [214:35] ==> private fun KtExpression.ifBranchesOrThis(): List<KtExpression?> defined in org.jetbrains.kotlin.idea.intentions[SimpleFunctionDescriptorImpl]

'orEmpty' @ [214:54] ==> @InlineOnly public inline fun <T> List<KtExpression?>?.orEmpty(): List<KtExpression?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression?

'resultingDescriptor' @ [218:9] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.resultingDescriptor: CallableDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> CallableDescriptor

'returnType' @ [218:29] ==> public final val CallableDescriptor.returnType: KotlinType?[MyPropertyDescriptor]

'let' @ [218:40] ==> @InlineOnly public inline fun <T, R> KotlinType?.let(block: (KotlinType?) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType?
    <R> -> Boolean

'type' @ [219:13] ==> value-parameter type: KotlinType? defined in org.jetbrains.kotlin.idea.intentions.resolvedToArrayType.<anonymous>[ValueParameterDescriptorImpl]

'isArray' @ [219:45] ==> public open fun isArray(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'type' @ [219:53] ==> value-parameter type: KotlinType? defined in org.jetbrains.kotlin.idea.intentions.resolvedToArrayType.<anonymous>[ValueParameterDescriptorImpl]

'isPrimitiveArray' @ [219:77] ==> public open fun isPrimitiveArray(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'type' @ [219:94] ==> value-parameter type: KotlinType? defined in org.jetbrains.kotlin.idea.intentions.resolvedToArrayType.<anonymous>[ValueParameterDescriptorImpl]

'this' @ [222:27] ==> <this> defined in org.jetbrains.kotlin.idea.intentions.isZero[ReceiverParameterDescriptorImpl]

'text' @ [222:33] ==> public final val KtElement.text: (String..String?)[MyPropertyDescriptor]

'this' @ [224:26] ==> <this> defined in org.jetbrains.kotlin.idea.intentions.isOne[ReceiverParameterDescriptorImpl]

'text' @ [224:32] ==> public final val KtElement.text: (String..String?)[MyPropertyDescriptor]

'getResolvedCall' @ [227:22] ==> public fun KtElement?.getResolvedCall(context: BindingContext): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'analyze' @ [227:38] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'resultingDescriptor' @ [227:50] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.resultingDescriptor: CallableDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> CallableDescriptor

'returnType' @ [227:71] ==> public final val CallableDescriptor.returnType: KotlinType?[MyPropertyDescriptor]

'returnType' @ [228:12] ==> val returnType: KotlinType? defined in org.jetbrains.kotlin.idea.intentions.isExpressionOfTypeOrSubtype[LocalVariableDescriptor]

'returnType' @ [228:35] ==> val returnType: KotlinType? defined in org.jetbrains.kotlin.idea.intentions.isExpressionOfTypeOrSubtype[LocalVariableDescriptor]

'constructor' @ [228:46] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'supertypes' @ [228:58] ==> public final val TypeConstructor.supertypes: Collection<(KotlinType..KotlinType?)>[MyPropertyDescriptor]

'returnType' @ [228:71] ==> val returnType: KotlinType? defined in org.jetbrains.kotlin.idea.intentions.isExpressionOfTypeOrSubtype[LocalVariableDescriptor]

'any' @ [228:83] ==> public inline fun <T> Iterable<(KotlinType..KotlinType?)>.any(predicate: ((KotlinType..KotlinType?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.types.KotlinType..org.jetbrains.kotlin.types.KotlinType?)

'predicate' @ [228:87] ==> value-parameter predicate: (KotlinType) -> Boolean defined in org.jetbrains.kotlin.idea.intentions.isExpressionOfTypeOrSubtype[ValueParameterDescriptorImpl]

'this' @ [232:9] ==> <this> defined in org.jetbrains.kotlin.idea.intentions.isSizeOrLength[ReceiverParameterDescriptorImpl]

'when (selectorExpression?.text) {
        "size" -> receiverExpression.isExpressionOfTypeOrSubtype { type ->
            KotlinBuiltIns.isArray(type) ||
            KotlinBuiltIns.isPrimitiveArray(type) ||
            KotlinBuiltIns.isCollectionOrNullableCollection(type) ||
            KotlinBuiltIns.isMapOrNullableMap(type)
        }
        "length" -> receiverExpression.isExpressionOfTypeOrSubtype(KotlinBuiltIns::isCharSequenceOrNullableCharSequence)
        else -> false
    }' @ [234:12] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'selectorExpression' @ [234:18] ==> public open val selectorExpression: KtExpression? defined in org.jetbrains.kotlin.psi.KtDotQualifiedExpression[DeserializedPropertyDescriptor]

'text' @ [234:38] ==> public final val KtExpression.text: (String..String?)[MyPropertyDescriptor]

'receiverExpression' @ [235:19] ==> public open val receiverExpression: KtExpression defined in org.jetbrains.kotlin.psi.KtDotQualifiedExpression[DeserializedPropertyDescriptor]

'isExpressionOfTypeOrSubtype' @ [235:38] ==> private fun KtExpression.isExpressionOfTypeOrSubtype(predicate: (KotlinType) -> Boolean): Boolean defined in org.jetbrains.kotlin.idea.intentions[SimpleFunctionDescriptorImpl]

'isArray' @ [236:28] ==> public open fun isArray(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'type' @ [236:36] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.idea.intentions.isSizeOrLength.<anonymous>[ValueParameterDescriptorImpl]

'isPrimitiveArray' @ [237:28] ==> public open fun isPrimitiveArray(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'type' @ [237:45] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.idea.intentions.isSizeOrLength.<anonymous>[ValueParameterDescriptorImpl]

'isCollectionOrNullableCollection' @ [238:28] ==> public open fun isCollectionOrNullableCollection(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'type' @ [238:61] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.idea.intentions.isSizeOrLength.<anonymous>[ValueParameterDescriptorImpl]

'isMapOrNullableMap' @ [239:28] ==> public open fun isMapOrNullableMap(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'type' @ [239:47] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.idea.intentions.isSizeOrLength.<anonymous>[ValueParameterDescriptorImpl]

'receiverExpression' @ [241:21] ==> public open val receiverExpression: KtExpression defined in org.jetbrains.kotlin.psi.KtDotQualifiedExpression[DeserializedPropertyDescriptor]

'isExpressionOfTypeOrSubtype' @ [241:40] ==> private fun KtExpression.isExpressionOfTypeOrSubtype(predicate: (KotlinType) -> Boolean): Boolean defined in org.jetbrains.kotlin.idea.intentions[SimpleFunctionDescriptorImpl]

'KotlinBuiltIns' @ [241:68] ==> protected/*protected and package*/ constructor KotlinBuiltIns(@NotNull p0: StorageManager) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaClassConstructorDescriptor]

'?:' @ [248:9] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: KtExpression?, right: KtExpression): KtExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> KtExpression

'receiverExpression' @ [248:10] ==> public open val receiverExpression: KtExpression defined in org.jetbrains.kotlin.psi.KtDotQualifiedExpression[DeserializedPropertyDescriptor]

'getLeftMostReceiverExpression' @ [248:60] ==> public fun KtDotQualifiedExpression.getLeftMostReceiverExpression(): KtExpression defined in org.jetbrains.kotlin.idea.intentions in file Utils.kt[SimpleFunctionDescriptorImpl]

'receiverExpression' @ [248:95] ==> public open val receiverExpression: KtExpression defined in org.jetbrains.kotlin.psi.KtDotQualifiedExpression[DeserializedPropertyDescriptor]

'if (safeAccess) {
        this.replaced(factory.createExpressionByPattern("$0?.$1", receiverExpression, selectorExpression!!))
    } else this' @ [255:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtExpression, elseBranch: KtExpression): KtExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtExpression

'safeAccess' @ [255:25] ==> value-parameter safeAccess: Boolean = ... defined in org.jetbrains.kotlin.idea.intentions.replaceFirstReceiver[ValueParameterDescriptorImpl]

'this' @ [256:9] ==> <this> defined in org.jetbrains.kotlin.idea.intentions.replaceFirstReceiver[ReceiverParameterDescriptorImpl]

'replaced' @ [256:14] ==> public inline fun <reified T : PsiElement> PsiElement.replaced(newElement: KtExpression): KtExpression defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtExpression

'factory' @ [256:23] ==> value-parameter factory: KtPsiFactory defined in org.jetbrains.kotlin.idea.intentions.replaceFirstReceiver[ValueParameterDescriptorImpl]

'createExpressionByPattern' @ [256:31] ==> public fun KtPsiFactory.createExpressionByPattern(pattern: String, vararg args: Any, reformat: Boolean = ...): KtExpression defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'receiverExpression' @ [256:67] ==> public open val receiverExpression: KtExpression defined in org.jetbrains.kotlin.psi.KtDotQualifiedExpression[DeserializedPropertyDescriptor]

'selectorExpression' @ [256:87] ==> public open val selectorExpression: KtExpression? defined in org.jetbrains.kotlin.psi.KtDotQualifiedExpression[DeserializedPropertyDescriptor]

'this' @ [257:12] ==> <this> defined in org.jetbrains.kotlin.idea.intentions.replaceFirstReceiver[ReceiverParameterDescriptorImpl]

'replaced' @ [258:20] ==> val replaced: KtQualifiedExpression defined in org.jetbrains.kotlin.idea.intentions.replaceFirstReceiver[LocalVariableDescriptor]

'receiverExpression' @ [258:29] ==> public open val receiverExpression: KtExpression defined in org.jetbrains.kotlin.psi.KtQualifiedExpression[DeserializedPropertyDescriptor]

'when (receiver) {
        is KtDotQualifiedExpression -> {
            receiver.replace(receiver.replaceFirstReceiver(factory, newReceiver, safeAccess))
        }
        else -> {
            receiver.replace(newReceiver)
        }
    }' @ [259:5] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: (PsiElement..PsiElement?), entry1: (PsiElement..PsiElement?)): (PsiElement..PsiElement?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'receiver' @ [259:11] ==> val receiver: KtExpression defined in org.jetbrains.kotlin.idea.intentions.replaceFirstReceiver[LocalVariableDescriptor]

'receiver' @ [261:13] ==> val receiver: KtExpression defined in org.jetbrains.kotlin.idea.intentions.replaceFirstReceiver[LocalVariableDescriptor]

'replace' @ [261:22] ==> @NotNull public open fun replace(@NotNull p0: PsiElement): PsiElement defined in org.jetbrains.kotlin.psi.KtDotQualifiedExpression[JavaMethodDescriptor]

'receiver' @ [261:30] ==> val receiver: KtExpression defined in org.jetbrains.kotlin.idea.intentions.replaceFirstReceiver[LocalVariableDescriptor]

'replaceFirstReceiver' @ [261:39] ==> public fun KtDotQualifiedExpression.replaceFirstReceiver(factory: KtPsiFactory, newReceiver: KtExpression, safeAccess: Boolean = ...): KtExpression defined in org.jetbrains.kotlin.idea.intentions in file Utils.kt[SimpleFunctionDescriptorImpl]

'factory' @ [261:60] ==> value-parameter factory: KtPsiFactory defined in org.jetbrains.kotlin.idea.intentions.replaceFirstReceiver[ValueParameterDescriptorImpl]

'newReceiver' @ [261:69] ==> value-parameter newReceiver: KtExpression defined in org.jetbrains.kotlin.idea.intentions.replaceFirstReceiver[ValueParameterDescriptorImpl]

'safeAccess' @ [261:82] ==> value-parameter safeAccess: Boolean = ... defined in org.jetbrains.kotlin.idea.intentions.replaceFirstReceiver[ValueParameterDescriptorImpl]

'receiver' @ [264:13] ==> val receiver: KtExpression defined in org.jetbrains.kotlin.idea.intentions.replaceFirstReceiver[LocalVariableDescriptor]

'replace' @ [264:22] ==> public abstract fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtExpression[JavaMethodDescriptor]

'newReceiver' @ [264:30] ==> value-parameter newReceiver: KtExpression defined in org.jetbrains.kotlin.idea.intentions.replaceFirstReceiver[ValueParameterDescriptorImpl]

'replaced' @ [267:12] ==> val replaced: KtQualifiedExpression defined in org.jetbrains.kotlin.idea.intentions.replaceFirstReceiver[LocalVariableDescriptor]

'receiverExpression' @ [271:20] ==> public open val receiverExpression: KtExpression defined in org.jetbrains.kotlin.psi.KtDotQualifiedExpression[DeserializedPropertyDescriptor]

'when (receiver) {
        is KtDotQualifiedExpression -> receiver.deleteFirstReceiver()
        else -> selectorExpression?.let { return this.replace(it) as KtExpression }
    }' @ [272:5] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KtExpression?, entry1: KtExpression?): KtExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KtExpression?

'receiver' @ [272:11] ==> val receiver: KtExpression defined in org.jetbrains.kotlin.idea.intentions.deleteFirstReceiver[LocalVariableDescriptor]

'receiver' @ [273:40] ==> val receiver: KtExpression defined in org.jetbrains.kotlin.idea.intentions.deleteFirstReceiver[LocalVariableDescriptor]

'deleteFirstReceiver' @ [273:49] ==> public fun KtDotQualifiedExpression.deleteFirstReceiver(): KtExpression defined in org.jetbrains.kotlin.idea.intentions in file Utils.kt[SimpleFunctionDescriptorImpl]

'selectorExpression' @ [274:17] ==> public open val selectorExpression: KtExpression? defined in org.jetbrains.kotlin.psi.KtDotQualifiedExpression[DeserializedPropertyDescriptor]

'let' @ [274:37] ==> @InlineOnly public inline fun <T, R> KtExpression.let(block: (KtExpression) -> KtExpression?): KtExpression? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression
    <R> -> KtExpression?

'this' @ [274:50] ==> <this> defined in org.jetbrains.kotlin.idea.intentions.deleteFirstReceiver[ReceiverParameterDescriptorImpl]

'replace' @ [274:55] ==> @NotNull public open fun replace(@NotNull p0: PsiElement): PsiElement defined in org.jetbrains.kotlin.psi.KtDotQualifiedExpression[JavaMethodDescriptor]

'it' @ [274:63] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.idea.intentions.deleteFirstReceiver.<anonymous>[ValueParameterDescriptorImpl]

'this' @ [276:12] ==> <this> defined in org.jetbrains.kotlin.idea.intentions.deleteFirstReceiver[ReceiverParameterDescriptorImpl]

'setOf' @ [279:32] ==> public fun <T> setOf(element: Name): Set<Name> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Name

'CollectionLiteralResolver' @ [279:38] ==> public companion object defined in org.jetbrains.kotlin.resolve.CollectionLiteralResolver[FakeCallableDescriptorForObject]

'ARRAY_OF_FUNCTION' @ [279:64] ==> public final val ARRAY_OF_FUNCTION: Name defined in org.jetbrains.kotlin.resolve.CollectionLiteralResolver.Companion[DeserializedPropertyDescriptor]

'CollectionLiteralResolver' @ [280:32] ==> public companion object defined in org.jetbrains.kotlin.resolve.CollectionLiteralResolver[FakeCallableDescriptorForObject]

'PRIMITIVE_TYPE_TO_ARRAY' @ [280:58] ==> public final val PRIMITIVE_TYPE_TO_ARRAY: Map<PrimitiveType, Name> defined in org.jetbrains.kotlin.resolve.CollectionLiteralResolver.Companion[DeserializedPropertyDescriptor]

'values' @ [280:82] ==> public abstract val values: Collection<Name> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'toSet' @ [280:89] ==> public fun <T> Iterable<Name>.toSet(): Set<Name> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Name

'identifier' @ [281:37] ==> @NotNull public open fun identifier(@NotNull p0: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'getResolvedCall' @ [284:24] ==> public fun KtElement?.getResolvedCall(context: BindingContext): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'analyze' @ [284:40] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'resolvedCall' @ [285:22] ==> val resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.idea.intentions.isArrayOfMethod[LocalVariableDescriptor]

'candidateDescriptor' @ [285:35] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.candidateDescriptor: CallableDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> CallableDescriptor

'descriptor' @ [286:12] ==> val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.intentions.isArrayOfMethod[LocalVariableDescriptor]

'containingDeclaration' @ [286:23] ==> public final val CallableDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'ARRAY_OF_METHODS' @ [286:75] ==> private val ARRAY_OF_METHODS: Set<Name> defined in org.jetbrains.kotlin.idea.intentions in file Utils.kt[PropertyDescriptorImpl]

'contains' @ [286:92] ==> public abstract fun contains(element: Name): Boolean defined in kotlin.collections.Set[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [286:101] ==> val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.intentions.isArrayOfMethod[LocalVariableDescriptor]

'name' @ [286:112] ==> public final val CallableDescriptor.name: Name[MyPropertyDescriptor]

