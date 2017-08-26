'AbstractKotlinInspection' @ [35:45] ==> public constructor AbstractKotlinInspection() defined in org.jetbrains.kotlin.idea.inspections.AbstractKotlinInspection[DeserializedClassConstructorDescriptor]

'KtVisitorVoid' @ [38:25] ==> public constructor KtVisitorVoid() defined in org.jetbrains.kotlin.psi.KtVisitorVoid[JavaClassConstructorDescriptor]

'super' @ [40:17] ==> <this> defined in org.jetbrains.kotlin.idea.inspections.CopyWithoutNamedArgumentsInspection.buildVisitor.<no name provided>[LazyClassReceiverParameterDescriptor]

'visitCallExpression' @ [40:23] ==> public open fun visitCallExpression(@NotNull p0: KtCallExpression): Unit defined in org.jetbrains.kotlin.psi.KtVisitorVoid[JavaMethodDescriptor]

'expression' @ [40:43] ==> value-parameter expression: KtCallExpression defined in org.jetbrains.kotlin.idea.inspections.CopyWithoutNamedArgumentsInspection.buildVisitor.<no name provided>.visitCallExpression[ValueParameterDescriptorImpl]

'expression' @ [42:33] ==> value-parameter expression: KtCallExpression defined in org.jetbrains.kotlin.idea.inspections.CopyWithoutNamedArgumentsInspection.buildVisitor.<no name provided>.visitCallExpression[ValueParameterDescriptorImpl]

'referenceExpression' @ [42:44] ==> public fun KtExpression.referenceExpression(): KtReferenceExpression? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'reference' @ [43:21] ==> val reference: KtNameReferenceExpression defined in org.jetbrains.kotlin.idea.inspections.CopyWithoutNamedArgumentsInspection.buildVisitor.<no name provided>.visitCallExpression[LocalVariableDescriptor]

'getReferencedNameAsName' @ [43:31] ==> public open fun getReferencedNameAsName(): Name defined in org.jetbrains.kotlin.psi.KtNameReferenceExpression[DeserializedSimpleFunctionDescriptor]

'DataClassDescriptorResolver' @ [43:60] ==> public object DataClassDescriptorResolver defined in org.jetbrains.kotlin.resolve[FakeCallableDescriptorForObject]

'COPY_METHOD_NAME' @ [43:88] ==> public final val COPY_METHOD_NAME: Name defined in org.jetbrains.kotlin.resolve.DataClassDescriptorResolver[DeserializedPropertyDescriptor]

'expression' @ [44:21] ==> value-parameter expression: KtCallExpression defined in org.jetbrains.kotlin.idea.inspections.CopyWithoutNamedArgumentsInspection.buildVisitor.<no name provided>.visitCallExpression[ValueParameterDescriptorImpl]

'valueArguments' @ [44:32] ==> public final val KtCallExpression.valueArguments: (MutableList<(KtValueArgument..KtValueArgument?)>..List<(KtValueArgument..KtValueArgument?)>)[MyPropertyDescriptor]

'all' @ [44:47] ==> public inline fun <T> Iterable<(KtValueArgument..KtValueArgument?)>.all(predicate: ((KtValueArgument..KtValueArgument?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtValueArgument..org.jetbrains.kotlin.psi.KtValueArgument?)

'it' @ [44:53] ==> value-parameter it: (KtValueArgument..KtValueArgument?) defined in org.jetbrains.kotlin.idea.inspections.CopyWithoutNamedArgumentsInspection.buildVisitor.<no name provided>.visitCallExpression.<anonymous>[ValueParameterDescriptorImpl]

'isNamed' @ [44:56] ==> public open fun isNamed(): Boolean defined in org.jetbrains.kotlin.psi.KtValueArgument[JavaMethodDescriptor]

'expression' @ [46:31] ==> value-parameter expression: KtCallExpression defined in org.jetbrains.kotlin.idea.inspections.CopyWithoutNamedArgumentsInspection.buildVisitor.<no name provided>.visitCallExpression[ValueParameterDescriptorImpl]

'analyze' @ [46:42] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'PARTIAL' @ [46:66] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'expression' @ [47:28] ==> value-parameter expression: KtCallExpression defined in org.jetbrains.kotlin.idea.inspections.CopyWithoutNamedArgumentsInspection.buildVisitor.<no name provided>.visitCallExpression[ValueParameterDescriptorImpl]

'getResolvedCall' @ [47:39] ==> public fun KtElement?.getResolvedCall(context: BindingContext): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'context' @ [47:55] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.inspections.CopyWithoutNamedArgumentsInspection.buildVisitor.<no name provided>.visitCallExpression[LocalVariableDescriptor]

'call' @ [48:32] ==> val call: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.idea.inspections.CopyWithoutNamedArgumentsInspection.buildVisitor.<no name provided>.visitCallExpression[LocalVariableDescriptor]

'dispatchReceiver' @ [48:37] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.dispatchReceiver: ReceiverValue?[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> CallableDescriptor

'type' @ [48:55] ==> public final val ReceiverValue.type: KotlinType[MyPropertyDescriptor]

'constructor' @ [48:61] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [48:74] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'!' @ [50:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'receiver' @ [50:22] ==> val receiver: ClassDescriptor defined in org.jetbrains.kotlin.idea.inspections.CopyWithoutNamedArgumentsInspection.buildVisitor.<no name provided>.visitCallExpression[LocalVariableDescriptor]

'isData' @ [50:31] ==> public final val ClassDescriptor.isData: Boolean[MyPropertyDescriptor]

'call' @ [51:21] ==> val call: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.idea.inspections.CopyWithoutNamedArgumentsInspection.buildVisitor.<no name provided>.visitCallExpression[LocalVariableDescriptor]

'candidateDescriptor' @ [51:26] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.candidateDescriptor: CallableDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> CallableDescriptor

'context' @ [51:49] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.inspections.CopyWithoutNamedArgumentsInspection.buildVisitor.<no name provided>.visitCallExpression[LocalVariableDescriptor]

'DATA_CLASS_COPY_FUNCTION' @ [51:72] ==> public final val DATA_CLASS_COPY_FUNCTION: (WritableSlice<(ClassDescriptor..ClassDescriptor?), (FunctionDescriptor..FunctionDescriptor?)>..WritableSlice<(ClassDescriptor..ClassDescriptor?), (FunctionDescriptor..FunctionDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'receiver' @ [51:98] ==> val receiver: ClassDescriptor defined in org.jetbrains.kotlin.idea.inspections.CopyWithoutNamedArgumentsInspection.buildVisitor.<no name provided>.visitCallExpression[LocalVariableDescriptor]

'holder' @ [53:17] ==> value-parameter holder: ProblemsHolder defined in org.jetbrains.kotlin.idea.inspections.CopyWithoutNamedArgumentsInspection.buildVisitor[ValueParameterDescriptorImpl]

'registerProblem' @ [53:24] ==> public open fun registerProblem(@NotNull p0: PsiElement, @NotNull @Nls p1: String, @NotNull p2: ProblemHighlightType, @Nullable vararg p3: (LocalQuickFix..LocalQuickFix?)): Unit defined in com.intellij.codeInspection.ProblemsHolder[JavaMethodDescriptor]

'expression' @ [54:25] ==> value-parameter expression: KtCallExpression defined in org.jetbrains.kotlin.idea.inspections.CopyWithoutNamedArgumentsInspection.buildVisitor.<no name provided>.visitCallExpression[ValueParameterDescriptorImpl]

'calleeExpression' @ [54:36] ==> public final val KtCallExpression.calleeExpression: KtExpression?[MyPropertyDescriptor]

'GENERIC_ERROR_OR_WARNING' @ [56:46] ==> enum entry GENERIC_ERROR_OR_WARNING defined in com.intellij.codeInspection.ProblemHighlightType[FakeCallableDescriptorForObject]

'IntentionWrapper' @ [57:25] ==> public constructor IntentionWrapper(@NotNull p0: IntentionAction, @NotNull p1: PsiFile) defined in com.intellij.codeInspection.IntentionWrapper[JavaClassConstructorDescriptor]

'AddNamesToCallArgumentsIntention' @ [57:42] ==> public constructor AddNamesToCallArgumentsIntention() defined in org.jetbrains.kotlin.idea.intentions.AddNamesToCallArgumentsIntention[ClassConstructorDescriptorImpl]

'expression' @ [57:78] ==> value-parameter expression: KtCallExpression defined in org.jetbrains.kotlin.idea.inspections.CopyWithoutNamedArgumentsInspection.buildVisitor.<no name provided>.visitCallExpression[ValueParameterDescriptorImpl]

'containingKtFile' @ [57:89] ==> public final val KtCallExpression.containingKtFile: KtFile[MyPropertyDescriptor]

