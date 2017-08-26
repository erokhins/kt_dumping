'AbstractKotlinInspection' @ [31:48] ==> public constructor AbstractKotlinInspection() defined in org.jetbrains.kotlin.idea.inspections.AbstractKotlinInspection[DeserializedClassConstructorDescriptor]

'KtVisitorVoid' @ [44:120] ==> public constructor KtVisitorVoid() defined in org.jetbrains.kotlin.psi.KtVisitorVoid[JavaClassConstructorDescriptor]

'super' @ [46:13] ==> <this> defined in org.jetbrains.kotlin.idea.inspections.collections.AbstractUselessCallInspection.QualifiedExpressionVisitor[LazyClassReceiverParameterDescriptor]

'visitQualifiedExpression' @ [46:19] ==> public open fun visitQualifiedExpression(@NotNull p0: KtQualifiedExpression): Unit defined in org.jetbrains.kotlin.psi.KtVisitorVoid[JavaMethodDescriptor]

'expression' @ [46:44] ==> value-parameter expression: KtQualifiedExpression defined in org.jetbrains.kotlin.idea.inspections.collections.AbstractUselessCallInspection.QualifiedExpressionVisitor.visitQualifiedExpression[ValueParameterDescriptorImpl]

'expression' @ [47:28] ==> value-parameter expression: KtQualifiedExpression defined in org.jetbrains.kotlin.idea.inspections.collections.AbstractUselessCallInspection.QualifiedExpressionVisitor.visitQualifiedExpression[ValueParameterDescriptorImpl]

'selectorExpression' @ [47:39] ==> public open val selectorExpression: KtExpression? defined in org.jetbrains.kotlin.psi.KtQualifiedExpression[DeserializedPropertyDescriptor]

'selector' @ [48:36] ==> val selector: KtCallExpression defined in org.jetbrains.kotlin.idea.inspections.collections.AbstractUselessCallInspection.QualifiedExpressionVisitor.visitQualifiedExpression[LocalVariableDescriptor]

'calleeExpression' @ [48:45] ==> public final val KtCallExpression.calleeExpression: KtExpression?[MyPropertyDescriptor]

'calleeExpression' @ [49:17] ==> val calleeExpression: KtExpression defined in org.jetbrains.kotlin.idea.inspections.collections.AbstractUselessCallInspection.QualifiedExpressionVisitor.visitQualifiedExpression[LocalVariableDescriptor]

'text' @ [49:34] ==> public final val KtExpression.text: (String..String?)[MyPropertyDescriptor]

'uselessNames' @ [49:43] ==> protected abstract val uselessNames: Set<String> defined in org.jetbrains.kotlin.idea.inspections.collections.AbstractUselessCallInspection[PropertyDescriptorImpl]

'expression' @ [51:27] ==> value-parameter expression: KtQualifiedExpression defined in org.jetbrains.kotlin.idea.inspections.collections.AbstractUselessCallInspection.QualifiedExpressionVisitor.visitQualifiedExpression[ValueParameterDescriptorImpl]

'analyze' @ [51:38] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'expression' @ [52:32] ==> value-parameter expression: KtQualifiedExpression defined in org.jetbrains.kotlin.idea.inspections.collections.AbstractUselessCallInspection.QualifiedExpressionVisitor.visitQualifiedExpression[ValueParameterDescriptorImpl]

'getResolvedCall' @ [52:43] ==> public fun KtElement?.getResolvedCall(context: BindingContext): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'context' @ [52:59] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.inspections.collections.AbstractUselessCallInspection.QualifiedExpressionVisitor.visitQualifiedExpression[LocalVariableDescriptor]

'uselessFqNames' @ [53:30] ==> protected abstract val uselessFqNames: Map<String, AbstractUselessCallInspection.Companion.Conversion> defined in org.jetbrains.kotlin.idea.inspections.collections.AbstractUselessCallInspection[PropertyDescriptorImpl]

'resolvedCall' @ [53:45] ==> val resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.idea.inspections.collections.AbstractUselessCallInspection.QualifiedExpressionVisitor.visitQualifiedExpression[LocalVariableDescriptor]

'resultingDescriptor' @ [53:58] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.resultingDescriptor: CallableDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(out CallableDescriptor)

'fqNameOrNull' @ [53:78] ==> public fun CallableDescriptor.fqNameOrNull(): FqName? defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedSimpleFunctionDescriptor]

'asString' @ [53:94] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'suggestConversionIfNeeded' @ [55:13] ==> protected abstract fun AbstractUselessCallInspection.QualifiedExpressionVisitor.suggestConversionIfNeeded(expression: KtQualifiedExpression, calleeExpression: KtExpression, context: BindingContext, conversion: AbstractUselessCallInspection.Companion.Conversion): Unit defined in org.jetbrains.kotlin.idea.inspections.collections.AbstractUselessCallInspection[SimpleFunctionDescriptorImpl]

'expression' @ [55:39] ==> value-parameter expression: KtQualifiedExpression defined in org.jetbrains.kotlin.idea.inspections.collections.AbstractUselessCallInspection.QualifiedExpressionVisitor.visitQualifiedExpression[ValueParameterDescriptorImpl]

'calleeExpression' @ [55:51] ==> val calleeExpression: KtExpression defined in org.jetbrains.kotlin.idea.inspections.collections.AbstractUselessCallInspection.QualifiedExpressionVisitor.visitQualifiedExpression[LocalVariableDescriptor]

'context' @ [55:69] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.inspections.collections.AbstractUselessCallInspection.QualifiedExpressionVisitor.visitQualifiedExpression[LocalVariableDescriptor]

'conversion' @ [55:78] ==> val conversion: AbstractUselessCallInspection.Companion.Conversion defined in org.jetbrains.kotlin.idea.inspections.collections.AbstractUselessCallInspection.QualifiedExpressionVisitor.visitQualifiedExpression[LocalVariableDescriptor]

'QualifiedExpressionVisitor' @ [59:78] ==> internal constructor QualifiedExpressionVisitor(holder: ProblemsHolder, isOnTheFly: Boolean) defined in org.jetbrains.kotlin.idea.inspections.collections.AbstractUselessCallInspection.QualifiedExpressionVisitor[ClassConstructorDescriptorImpl]

'holder' @ [59:105] ==> value-parameter holder: ProblemsHolder defined in org.jetbrains.kotlin.idea.inspections.collections.AbstractUselessCallInspection.buildVisitor[ValueParameterDescriptorImpl]

'isOnTheFly' @ [59:113] ==> value-parameter isOnTheFly: Boolean defined in org.jetbrains.kotlin.idea.inspections.collections.AbstractUselessCallInspection.buildVisitor[ValueParameterDescriptorImpl]

'Conversion' @ [65:32] ==> public constructor Conversion(replacementName: String? = ...) defined in org.jetbrains.kotlin.idea.inspections.collections.AbstractUselessCallInspection.Companion.Conversion[ClassConstructorDescriptorImpl]

'mapTo' @ [67:42] ==> public inline fun <T, R, C : MutableCollection<in String>> Iterable<String>.mapTo(destination: MutableSet<String>, transform: (String) -> String): MutableSet<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> String
    <C : MutableCollection<in R>> -> MutableSet<String>

'mutableSetOf' @ [67:48] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableSetOf(): MutableSet<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'fqName' @ [67:76] ==> value-parameter fqName: String defined in org.jetbrains.kotlin.idea.inspections.collections.AbstractUselessCallInspection.Companion.toShortNames.<anonymous>[ValueParameterDescriptorImpl]

'takeLastWhile' @ [67:83] ==> public inline fun String.takeLastWhile(predicate: (Char) -> Boolean): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'it' @ [67:99] ==> value-parameter it: Char defined in org.jetbrains.kotlin.idea.inspections.collections.AbstractUselessCallInspection.Companion.toShortNames.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

