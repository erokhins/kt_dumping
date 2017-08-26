'MethodContext' @ [30:5] ==> protected/*protected and package*/ constructor MethodContext(@NotNull functionDescriptor: FunctionDescriptor, @NotNull contextKind: OwnerKind, @NotNull parentContext: raw (CodegenContext<(DeclarationDescriptor..DeclarationDescriptor?)>..CodegenContext<*>), @Nullable closure: MutableClosure?, isDefaultFunctionContext: Boolean) defined in org.jetbrains.kotlin.codegen.context.MethodContext[JavaClassConstructorDescriptor]

'functionDescriptor' @ [30:19] ==> value-parameter functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.codegen.context.InlineLambdaContext.<init>[ValueParameterDescriptorImpl]

'contextKind' @ [30:39] ==> value-parameter contextKind: OwnerKind defined in org.jetbrains.kotlin.codegen.context.InlineLambdaContext.<init>[ValueParameterDescriptorImpl]

'parentContext' @ [30:52] ==> value-parameter parentContext: CodegenContext<*> defined in org.jetbrains.kotlin.codegen.context.InlineLambdaContext.<init>[ValueParameterDescriptorImpl]

'closure' @ [30:67] ==> value-parameter closure: MutableClosure? defined in org.jetbrains.kotlin.codegen.context.InlineLambdaContext.<init>[ValueParameterDescriptorImpl]

'isCrossInline' @ [33:13] ==> private final val isCrossInline: Boolean defined in org.jetbrains.kotlin.codegen.context.InlineLambdaContext[PropertyDescriptorImpl]

'this' @ [33:35] ==> <this> defined in org.jetbrains.kotlin.codegen.context.InlineLambdaContext[LazyClassReceiverParameterDescriptor]

'if (isPropertyReference) parentContext as? AnonymousClassContext else  { parentContext as? ClosureContext }' @ [35:22] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ClassContext?, elseBranch: ClassContext?): ClassContext?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ClassContext?

'isPropertyReference' @ [35:26] ==> private final val isPropertyReference: Boolean defined in org.jetbrains.kotlin.codegen.context.InlineLambdaContext[PropertyDescriptorImpl]

'parentContext' @ [35:47] ==> public final val InlineLambdaContext.parentContext: raw (CodegenContext<(DeclarationDescriptor..DeclarationDescriptor?)>..CodegenContext<*>)[MyPropertyDescriptor]

'parentContext' @ [35:95] ==> public final val InlineLambdaContext.parentContext: raw (CodegenContext<(DeclarationDescriptor..DeclarationDescriptor?)>..CodegenContext<*>)[MyPropertyDescriptor]

'AssertionError' @ [36:28] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'+' @ [37:30] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'if (isPropertyReference) "ClosureContext" else "AnonymousClassContext"' @ [38:33] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'isPropertyReference' @ [38:37] ==> private final val isPropertyReference: Boolean defined in org.jetbrains.kotlin.codegen.context.InlineLambdaContext[PropertyDescriptorImpl]

'parentContext' @ [38:112] ==> public final val InlineLambdaContext.parentContext: raw (CodegenContext<(DeclarationDescriptor..DeclarationDescriptor?)>..CodegenContext<*>)[MyPropertyDescriptor]

'parent' @ [41:27] ==> val parent: ClassContext defined in org.jetbrains.kotlin.codegen.context.InlineLambdaContext.getFirstCrossInlineOrNonInlineContext[LocalVariableDescriptor]

'parentContext' @ [41:34] ==> public final val ClassContext.parentContext: raw (CodegenContext<(DeclarationDescriptor..DeclarationDescriptor?)>?..CodegenContext<*>?)[MyPropertyDescriptor]

'AssertionError' @ [42:33] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'contextDescriptor' @ [42:103] ==> public final val InlineLambdaContext.contextDescriptor: CallableMemberDescriptor[MyPropertyDescriptor]

'grandParent' @ [43:16] ==> val grandParent: (CodegenContext<(DeclarationDescriptor..DeclarationDescriptor?)>..CodegenContext<*>) defined in org.jetbrains.kotlin.codegen.context.InlineLambdaContext.getFirstCrossInlineOrNonInlineContext[LocalVariableDescriptor]

'firstCrossInlineOrNonInlineContext' @ [43:28] ==> public final val <T : (DeclarationDescriptor..DeclarationDescriptor?)> CodegenContext<(DeclarationDescriptor..DeclarationDescriptor?)>.firstCrossInlineOrNonInlineContext: raw (CodegenContext<(DeclarationDescriptor..DeclarationDescriptor?)>..CodegenContext<*>)[MyPropertyDescriptor]
Inferred types:
    <T : (DeclarationDescriptor..DeclarationDescriptor?)> -> (org.jetbrains.kotlin.descriptors.DeclarationDescriptor..org.jetbrains.kotlin.descriptors.DeclarationDescriptor?)

