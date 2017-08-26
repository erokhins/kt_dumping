'AbstractUselessCallInspection' @ [32:43] ==> public constructor AbstractUselessCallInspection() defined in org.jetbrains.kotlin.idea.inspections.collections.AbstractUselessCallInspection[ClassConstructorDescriptorImpl]

'mapOf' @ [33:35] ==> public fun <K, V> mapOf(vararg pairs: Pair<String, AbstractUselessCallInspection.Companion.Conversion>): Map<String, AbstractUselessCallInspection.Companion.Conversion> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Conversion

'to' @ [33:41] ==> public infix fun <A, B> String.to(that: AbstractUselessCallInspection.Companion.Conversion): Pair<String, AbstractUselessCallInspection.Companion.Conversion> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Conversion

'deleteConversion' @ [33:79] ==> public final val deleteConversion: AbstractUselessCallInspection.Companion.Conversion defined in org.jetbrains.kotlin.idea.inspections.collections.AbstractUselessCallInspection.Companion[PropertyDescriptorImpl]

'to' @ [34:41] ==> public infix fun <A, B> String.to(that: AbstractUselessCallInspection.Companion.Conversion): Pair<String, AbstractUselessCallInspection.Companion.Conversion> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Conversion

'deleteConversion' @ [34:82] ==> public final val deleteConversion: AbstractUselessCallInspection.Companion.Conversion defined in org.jetbrains.kotlin.idea.inspections.collections.AbstractUselessCallInspection.Companion[PropertyDescriptorImpl]

'to' @ [35:41] ==> public infix fun <A, B> String.to(that: AbstractUselessCallInspection.Companion.Conversion): Pair<String, AbstractUselessCallInspection.Companion.Conversion> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Conversion

'Conversion' @ [35:76] ==> public constructor Conversion(replacementName: String? = ...) defined in org.jetbrains.kotlin.idea.inspections.collections.AbstractUselessCallInspection.Companion.Conversion[ClassConstructorDescriptorImpl]

'to' @ [36:41] ==> public infix fun <A, B> String.to(that: AbstractUselessCallInspection.Companion.Conversion): Pair<String, AbstractUselessCallInspection.Companion.Conversion> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Conversion

'Conversion' @ [36:78] ==> public constructor Conversion(replacementName: String? = ...) defined in org.jetbrains.kotlin.idea.inspections.collections.AbstractUselessCallInspection.Companion.Conversion[ClassConstructorDescriptorImpl]

'to' @ [37:41] ==> public infix fun <A, B> String.to(that: AbstractUselessCallInspection.Companion.Conversion): Pair<String, AbstractUselessCallInspection.Companion.Conversion> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Conversion

'Conversion' @ [37:83] ==> public constructor Conversion(replacementName: String? = ...) defined in org.jetbrains.kotlin.idea.inspections.collections.AbstractUselessCallInspection.Companion.Conversion[ClassConstructorDescriptorImpl]

'to' @ [38:41] ==> public infix fun <A, B> String.to(that: AbstractUselessCallInspection.Companion.Conversion): Pair<String, AbstractUselessCallInspection.Companion.Conversion> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Conversion

'Conversion' @ [38:85] ==> public constructor Conversion(replacementName: String? = ...) defined in org.jetbrains.kotlin.idea.inspections.collections.AbstractUselessCallInspection.Companion.Conversion[ClassConstructorDescriptorImpl]

'uselessFqNames' @ [40:33] ==> protected open val uselessFqNames: Map<String, AbstractUselessCallInspection.Companion.Conversion> defined in org.jetbrains.kotlin.idea.inspections.collections.UselessCallOnCollectionInspection[PropertyDescriptorImpl]

'keys' @ [40:48] ==> public abstract val keys: Set<String> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'toShortNames' @ [40:53] ==> public final fun Set<String>.toShortNames(): MutableSet<String> defined in org.jetbrains.kotlin.idea.inspections.collections.AbstractUselessCallInspection.Companion[SimpleFunctionDescriptorImpl]

'expression' @ [48:28] ==> value-parameter expression: KtQualifiedExpression defined in org.jetbrains.kotlin.idea.inspections.collections.UselessCallOnCollectionInspection.suggestConversionIfNeeded[ValueParameterDescriptorImpl]

'receiverExpression' @ [48:39] ==> public open val receiverExpression: KtExpression defined in org.jetbrains.kotlin.psi.KtQualifiedExpression[DeserializedPropertyDescriptor]

'getType' @ [48:58] ==> public fun KtExpression.getType(context: BindingContext): KotlinType? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'context' @ [48:66] ==> value-parameter context: BindingContext defined in org.jetbrains.kotlin.idea.inspections.collections.UselessCallOnCollectionInspection.suggestConversionIfNeeded[ValueParameterDescriptorImpl]

'receiverType' @ [49:36] ==> val receiverType: KotlinType defined in org.jetbrains.kotlin.idea.inspections.collections.UselessCallOnCollectionInspection.suggestConversionIfNeeded[LocalVariableDescriptor]

'arguments' @ [49:49] ==> public abstract val arguments: List<TypeProjection> defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'singleOrNull' @ [49:59] ==> public fun <T> List<TypeProjection>.singleOrNull(): TypeProjection? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeProjection

'type' @ [49:75] ==> public final val TypeProjection.type: KotlinType[MyPropertyDescriptor]

'expression' @ [50:28] ==> value-parameter expression: KtQualifiedExpression defined in org.jetbrains.kotlin.idea.inspections.collections.UselessCallOnCollectionInspection.suggestConversionIfNeeded[ValueParameterDescriptorImpl]

'getResolvedCall' @ [50:39] ==> public fun KtElement?.getResolvedCall(context: BindingContext): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'context' @ [50:55] ==> value-parameter context: BindingContext defined in org.jetbrains.kotlin.idea.inspections.collections.UselessCallOnCollectionInspection.suggestConversionIfNeeded[ValueParameterDescriptorImpl]

'if (calleeExpression.text == "filterIsInstance") {
            val typeParameterDescriptor = resolvedCall.candidateDescriptor.typeParameters.singleOrNull() ?: return
            val argumentType = resolvedCall.typeArguments[typeParameterDescriptor] ?: return
            if (receiverTypeArgument.isFlexible() || !receiverTypeArgument.isSubtypeOf(argumentType)) return
        }
        else {
            // xxxNotNull
            if (TypeUtils.isNullableType(receiverTypeArgument)) return
            if (calleeExpression.text != "filterNotNull") {
                // Also check last argument functional type to have not-null result
                if (!resolvedCall.hasLastFunctionalParameterWithResult(context) { !TypeUtils.isNullableType(it) }) return
            }
        }' @ [51:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'calleeExpression' @ [51:13] ==> value-parameter calleeExpression: KtExpression defined in org.jetbrains.kotlin.idea.inspections.collections.UselessCallOnCollectionInspection.suggestConversionIfNeeded[ValueParameterDescriptorImpl]

'text' @ [51:30] ==> public final val KtExpression.text: (String..String?)[MyPropertyDescriptor]

'resolvedCall' @ [52:43] ==> val resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.idea.inspections.collections.UselessCallOnCollectionInspection.suggestConversionIfNeeded[LocalVariableDescriptor]

'candidateDescriptor' @ [52:56] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.candidateDescriptor: CallableDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> CallableDescriptor

'typeParameters' @ [52:76] ==> public final val CallableDescriptor.typeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'singleOrNull' @ [52:91] ==> public fun <T> List<(TypeParameterDescriptor..TypeParameterDescriptor?)>.singleOrNull(): TypeParameterDescriptor? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.TypeParameterDescriptor..org.jetbrains.kotlin.descriptors.TypeParameterDescriptor?)

'resolvedCall' @ [53:32] ==> val resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.idea.inspections.collections.UselessCallOnCollectionInspection.suggestConversionIfNeeded[LocalVariableDescriptor]

'typeArguments' @ [53:45] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.typeArguments: (MutableMap<(TypeParameterDescriptor..TypeParameterDescriptor?), (KotlinType..KotlinType?)>..Map<(TypeParameterDescriptor..TypeParameterDescriptor?), (KotlinType..KotlinType?)>)[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> CallableDescriptor

'typeParameterDescriptor' @ [53:59] ==> val typeParameterDescriptor: TypeParameterDescriptor defined in org.jetbrains.kotlin.idea.inspections.collections.UselessCallOnCollectionInspection.suggestConversionIfNeeded[LocalVariableDescriptor]

'receiverTypeArgument' @ [54:17] ==> val receiverTypeArgument: KotlinType defined in org.jetbrains.kotlin.idea.inspections.collections.UselessCallOnCollectionInspection.suggestConversionIfNeeded[LocalVariableDescriptor]

'isFlexible' @ [54:38] ==> public fun KotlinType.isFlexible(): Boolean defined in org.jetbrains.kotlin.types[DeserializedSimpleFunctionDescriptor]

'!' @ [54:54] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'receiverTypeArgument' @ [54:55] ==> val receiverTypeArgument: KotlinType defined in org.jetbrains.kotlin.idea.inspections.collections.UselessCallOnCollectionInspection.suggestConversionIfNeeded[LocalVariableDescriptor]

'isSubtypeOf' @ [54:76] ==> public fun KotlinType.isSubtypeOf(superType: KotlinType): Boolean defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'argumentType' @ [54:88] ==> val argumentType: KotlinType defined in org.jetbrains.kotlin.idea.inspections.collections.UselessCallOnCollectionInspection.suggestConversionIfNeeded[LocalVariableDescriptor]

'isNullableType' @ [58:27] ==> public open fun isNullableType(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.types.TypeUtils[JavaMethodDescriptor]

'receiverTypeArgument' @ [58:42] ==> val receiverTypeArgument: KotlinType defined in org.jetbrains.kotlin.idea.inspections.collections.UselessCallOnCollectionInspection.suggestConversionIfNeeded[LocalVariableDescriptor]

'calleeExpression' @ [59:17] ==> value-parameter calleeExpression: KtExpression defined in org.jetbrains.kotlin.idea.inspections.collections.UselessCallOnCollectionInspection.suggestConversionIfNeeded[ValueParameterDescriptorImpl]

'text' @ [59:34] ==> public final val KtExpression.text: (String..String?)[MyPropertyDescriptor]

'!' @ [61:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'resolvedCall' @ [61:22] ==> val resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.idea.inspections.collections.UselessCallOnCollectionInspection.suggestConversionIfNeeded[LocalVariableDescriptor]

'hasLastFunctionalParameterWithResult' @ [61:35] ==> public fun ResolvedCall<*>.hasLastFunctionalParameterWithResult(context: BindingContext, predicate: (KotlinType) -> Boolean): Boolean defined in org.jetbrains.kotlin.idea.inspections.collections[SimpleFunctionDescriptorImpl]

'context' @ [61:72] ==> value-parameter context: BindingContext defined in org.jetbrains.kotlin.idea.inspections.collections.UselessCallOnCollectionInspection.suggestConversionIfNeeded[ValueParameterDescriptorImpl]

'!' @ [61:83] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isNullableType' @ [61:94] ==> public open fun isNullableType(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.types.TypeUtils[JavaMethodDescriptor]

'it' @ [61:109] ==> value-parameter it: KotlinType defined in org.jetbrains.kotlin.idea.inspections.collections.UselessCallOnCollectionInspection.suggestConversionIfNeeded.<anonymous>[ValueParameterDescriptorImpl]

'conversion' @ [65:23] ==> value-parameter conversion: AbstractUselessCallInspection.Companion.Conversion defined in org.jetbrains.kotlin.idea.inspections.collections.UselessCallOnCollectionInspection.suggestConversionIfNeeded[ValueParameterDescriptorImpl]

'replacementName' @ [65:34] ==> public final val replacementName: String? defined in org.jetbrains.kotlin.idea.inspections.collections.AbstractUselessCallInspection.Companion.Conversion[PropertyDescriptorImpl]

'if (newName != null) {
            val descriptor = holder.manager.createProblemDescriptor(
                    expression,
                    TextRange(expression.operationTokenNode.startOffset - expression.startOffset,
                              calleeExpression.endOffset - expression.startOffset),
                    "Call on collection type may be reduced",
                    ProblemHighlightType.GENERIC_ERROR_OR_WARNING,
                    isOnTheFly,
                    RenameUselessCallFix(newName)
            )
            holder.registerProblem(descriptor)
        }
        else {
            val descriptor = holder.manager.createProblemDescriptor(
                    expression,
                    TextRange(expression.operationTokenNode.startOffset - expression.startOffset,
                              calleeExpression.endOffset - expression.startOffset),
                    "Useless call on collection type",
                    ProblemHighlightType.LIKE_UNUSED_SYMBOL,
                    isOnTheFly,
                    RemoveUselessCallFix()
            )
            holder.registerProblem(descriptor)
        }' @ [66:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'newName' @ [66:13] ==> val newName: String? defined in org.jetbrains.kotlin.idea.inspections.collections.UselessCallOnCollectionInspection.suggestConversionIfNeeded[LocalVariableDescriptor]

'holder' @ [67:30] ==> public final val holder: ProblemsHolder defined in org.jetbrains.kotlin.idea.inspections.collections.AbstractUselessCallInspection.QualifiedExpressionVisitor[PropertyDescriptorImpl]

'manager' @ [67:37] ==> public final val ProblemsHolder.manager: InspectionManager[MyPropertyDescriptor]

'createProblemDescriptor' @ [67:45] ==> @NotNull @Contract public abstract fun createProblemDescriptor(@NotNull p0: PsiElement, @Nullable p1: TextRange?, @NotNull @Nls p2: String, @NotNull p3: ProblemHighlightType, p4: Boolean, vararg p5: (LocalQuickFix..LocalQuickFix?)): ProblemDescriptor defined in com.intellij.codeInspection.InspectionManager[JavaMethodDescriptor]

'expression' @ [68:21] ==> value-parameter expression: KtQualifiedExpression defined in org.jetbrains.kotlin.idea.inspections.collections.UselessCallOnCollectionInspection.suggestConversionIfNeeded[ValueParameterDescriptorImpl]

'TextRange' @ [69:21] ==> public constructor TextRange(p0: Int, p1: Int) defined in com.intellij.openapi.util.TextRange[JavaClassConstructorDescriptor]

'expression' @ [69:31] ==> value-parameter expression: KtQualifiedExpression defined in org.jetbrains.kotlin.idea.inspections.collections.UselessCallOnCollectionInspection.suggestConversionIfNeeded[ValueParameterDescriptorImpl]

'operationTokenNode' @ [69:42] ==> public open val operationTokenNode: ASTNode defined in org.jetbrains.kotlin.psi.KtQualifiedExpression[DeserializedPropertyDescriptor]

'startOffset' @ [69:61] ==> public final val ASTNode.startOffset: Int[MyPropertyDescriptor]

'expression' @ [69:75] ==> value-parameter expression: KtQualifiedExpression defined in org.jetbrains.kotlin.idea.inspections.collections.UselessCallOnCollectionInspection.suggestConversionIfNeeded[ValueParameterDescriptorImpl]

'startOffset' @ [69:86] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'calleeExpression' @ [70:31] ==> value-parameter calleeExpression: KtExpression defined in org.jetbrains.kotlin.idea.inspections.collections.UselessCallOnCollectionInspection.suggestConversionIfNeeded[ValueParameterDescriptorImpl]

'endOffset' @ [70:48] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'expression' @ [70:60] ==> value-parameter expression: KtQualifiedExpression defined in org.jetbrains.kotlin.idea.inspections.collections.UselessCallOnCollectionInspection.suggestConversionIfNeeded[ValueParameterDescriptorImpl]

'startOffset' @ [70:71] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'GENERIC_ERROR_OR_WARNING' @ [72:42] ==> enum entry GENERIC_ERROR_OR_WARNING defined in com.intellij.codeInspection.ProblemHighlightType[FakeCallableDescriptorForObject]

'isOnTheFly' @ [73:21] ==> public final val isOnTheFly: Boolean defined in org.jetbrains.kotlin.idea.inspections.collections.AbstractUselessCallInspection.QualifiedExpressionVisitor[PropertyDescriptorImpl]

'RenameUselessCallFix' @ [74:21] ==> public constructor RenameUselessCallFix(newName: String) defined in org.jetbrains.kotlin.idea.inspections.collections.RenameUselessCallFix[ClassConstructorDescriptorImpl]

'newName' @ [74:42] ==> val newName: String? defined in org.jetbrains.kotlin.idea.inspections.collections.UselessCallOnCollectionInspection.suggestConversionIfNeeded[LocalVariableDescriptor]

'holder' @ [76:13] ==> public final val holder: ProblemsHolder defined in org.jetbrains.kotlin.idea.inspections.collections.AbstractUselessCallInspection.QualifiedExpressionVisitor[PropertyDescriptorImpl]

'registerProblem' @ [76:20] ==> public open fun registerProblem(@NotNull p0: ProblemDescriptor): Unit defined in com.intellij.codeInspection.ProblemsHolder[JavaMethodDescriptor]

'descriptor' @ [76:36] ==> val descriptor: ProblemDescriptor defined in org.jetbrains.kotlin.idea.inspections.collections.UselessCallOnCollectionInspection.suggestConversionIfNeeded[LocalVariableDescriptor]

'holder' @ [79:30] ==> public final val holder: ProblemsHolder defined in org.jetbrains.kotlin.idea.inspections.collections.AbstractUselessCallInspection.QualifiedExpressionVisitor[PropertyDescriptorImpl]

'manager' @ [79:37] ==> public final val ProblemsHolder.manager: InspectionManager[MyPropertyDescriptor]

'createProblemDescriptor' @ [79:45] ==> @NotNull @Contract public abstract fun createProblemDescriptor(@NotNull p0: PsiElement, @Nullable p1: TextRange?, @NotNull @Nls p2: String, @NotNull p3: ProblemHighlightType, p4: Boolean, vararg p5: (LocalQuickFix..LocalQuickFix?)): ProblemDescriptor defined in com.intellij.codeInspection.InspectionManager[JavaMethodDescriptor]

'expression' @ [80:21] ==> value-parameter expression: KtQualifiedExpression defined in org.jetbrains.kotlin.idea.inspections.collections.UselessCallOnCollectionInspection.suggestConversionIfNeeded[ValueParameterDescriptorImpl]

'TextRange' @ [81:21] ==> public constructor TextRange(p0: Int, p1: Int) defined in com.intellij.openapi.util.TextRange[JavaClassConstructorDescriptor]

'expression' @ [81:31] ==> value-parameter expression: KtQualifiedExpression defined in org.jetbrains.kotlin.idea.inspections.collections.UselessCallOnCollectionInspection.suggestConversionIfNeeded[ValueParameterDescriptorImpl]

'operationTokenNode' @ [81:42] ==> public open val operationTokenNode: ASTNode defined in org.jetbrains.kotlin.psi.KtQualifiedExpression[DeserializedPropertyDescriptor]

'startOffset' @ [81:61] ==> public final val ASTNode.startOffset: Int[MyPropertyDescriptor]

'expression' @ [81:75] ==> value-parameter expression: KtQualifiedExpression defined in org.jetbrains.kotlin.idea.inspections.collections.UselessCallOnCollectionInspection.suggestConversionIfNeeded[ValueParameterDescriptorImpl]

'startOffset' @ [81:86] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'calleeExpression' @ [82:31] ==> value-parameter calleeExpression: KtExpression defined in org.jetbrains.kotlin.idea.inspections.collections.UselessCallOnCollectionInspection.suggestConversionIfNeeded[ValueParameterDescriptorImpl]

'endOffset' @ [82:48] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'expression' @ [82:60] ==> value-parameter expression: KtQualifiedExpression defined in org.jetbrains.kotlin.idea.inspections.collections.UselessCallOnCollectionInspection.suggestConversionIfNeeded[ValueParameterDescriptorImpl]

'startOffset' @ [82:71] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'LIKE_UNUSED_SYMBOL' @ [84:42] ==> enum entry LIKE_UNUSED_SYMBOL defined in com.intellij.codeInspection.ProblemHighlightType[FakeCallableDescriptorForObject]

'isOnTheFly' @ [85:21] ==> public final val isOnTheFly: Boolean defined in org.jetbrains.kotlin.idea.inspections.collections.AbstractUselessCallInspection.QualifiedExpressionVisitor[PropertyDescriptorImpl]

'RemoveUselessCallFix' @ [86:21] ==> public constructor RemoveUselessCallFix() defined in org.jetbrains.kotlin.idea.inspections.collections.RemoveUselessCallFix[ClassConstructorDescriptorImpl]

'holder' @ [88:13] ==> public final val holder: ProblemsHolder defined in org.jetbrains.kotlin.idea.inspections.collections.AbstractUselessCallInspection.QualifiedExpressionVisitor[PropertyDescriptorImpl]

'registerProblem' @ [88:20] ==> public open fun registerProblem(@NotNull p0: ProblemDescriptor): Unit defined in com.intellij.codeInspection.ProblemsHolder[JavaMethodDescriptor]

'descriptor' @ [88:36] ==> val descriptor: ProblemDescriptor defined in org.jetbrains.kotlin.idea.inspections.collections.UselessCallOnCollectionInspection.suggestConversionIfNeeded[LocalVariableDescriptor]

