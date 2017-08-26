'context' @ [30:13] ==> value-parameter context: CallCheckerContext defined in org.jetbrains.kotlin.resolve.calls.checkers.InlineCheckerWrapper.check[ValueParameterDescriptorImpl]

'isAnnotationContext' @ [30:21] ==> public final val isAnnotationContext: Boolean defined in org.jetbrains.kotlin.resolve.calls.checkers.CallCheckerContext[PropertyDescriptorImpl]

'context' @ [32:56] ==> value-parameter context: CallCheckerContext defined in org.jetbrains.kotlin.resolve.calls.checkers.InlineCheckerWrapper.check[ValueParameterDescriptorImpl]

'scope' @ [32:64] ==> public final val scope: LexicalScope defined in org.jetbrains.kotlin.resolve.calls.checkers.CallCheckerContext[PropertyDescriptorImpl]

'ownerDescriptor' @ [32:70] ==> public abstract val ownerDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.scopes.LexicalScope[DeserializedPropertyDescriptor]

'parentDescriptor' @ [34:16] ==> var parentDescriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.resolve.calls.checkers.InlineCheckerWrapper.check[LocalVariableDescriptor]

'isInline' @ [35:28] ==> public open fun isInline(@Nullable descriptor: DeclarationDescriptor?): Boolean defined in org.jetbrains.kotlin.resolve.inline.InlineUtil[JavaMethodDescriptor]

'parentDescriptor' @ [35:37] ==> var parentDescriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.resolve.calls.checkers.InlineCheckerWrapper.check[LocalVariableDescriptor]

'getChecker' @ [36:31] ==> private final fun getChecker(descriptor: FunctionDescriptor): CallChecker defined in org.jetbrains.kotlin.resolve.calls.checkers.InlineCheckerWrapper[SimpleFunctionDescriptorImpl]

'parentDescriptor' @ [36:42] ==> var parentDescriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.resolve.calls.checkers.InlineCheckerWrapper.check[LocalVariableDescriptor]

'checker' @ [37:17] ==> val checker: CallChecker defined in org.jetbrains.kotlin.resolve.calls.checkers.InlineCheckerWrapper.check[LocalVariableDescriptor]

'check' @ [37:25] ==> public abstract fun check(resolvedCall: ResolvedCall<*>, reportOn: PsiElement, context: CallCheckerContext): Unit defined in org.jetbrains.kotlin.resolve.calls.checkers.CallChecker[SimpleFunctionDescriptorImpl]

'resolvedCall' @ [37:31] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.resolve.calls.checkers.InlineCheckerWrapper.check[ValueParameterDescriptorImpl]

'reportOn' @ [37:45] ==> value-parameter reportOn: PsiElement defined in org.jetbrains.kotlin.resolve.calls.checkers.InlineCheckerWrapper.check[ValueParameterDescriptorImpl]

'context' @ [37:55] ==> value-parameter context: CallCheckerContext defined in org.jetbrains.kotlin.resolve.calls.checkers.InlineCheckerWrapper.check[ValueParameterDescriptorImpl]

'parentDescriptor' @ [40:13] ==> var parentDescriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.resolve.calls.checkers.InlineCheckerWrapper.check[LocalVariableDescriptor]

'parentDescriptor' @ [40:32] ==> var parentDescriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.resolve.calls.checkers.InlineCheckerWrapper.check[LocalVariableDescriptor]

'containingDeclaration' @ [40:49] ==> public final val DeclarationDescriptor.containingDeclaration: DeclarationDescriptor?[MyPropertyDescriptor]

'checkersCache' @ [45:19] ==> private final var checkersCache: WeakReference<MutableMap<DeclarationDescriptor, CallChecker>>? defined in org.jetbrains.kotlin.resolve.calls.checkers.InlineCheckerWrapper[PropertyDescriptorImpl]

'get' @ [45:34] ==> public open fun get(): MutableMap<DeclarationDescriptor, CallChecker>? defined in java.lang.ref.WeakReference[JavaMethodDescriptor]

'hashMapOf' @ [45:43] ==> @SinceKotlin @InlineOnly public inline fun <K, V> hashMapOf(): HashMap<DeclarationDescriptor, CallChecker> /* = HashMap<DeclarationDescriptor, CallChecker> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> DeclarationDescriptor
    <V> -> CallChecker

'checkersCache' @ [46:9] ==> private final var checkersCache: WeakReference<MutableMap<DeclarationDescriptor, CallChecker>>? defined in org.jetbrains.kotlin.resolve.calls.checkers.InlineCheckerWrapper[PropertyDescriptorImpl]

'checkersCache' @ [46:25] ==> private final var checkersCache: WeakReference<MutableMap<DeclarationDescriptor, CallChecker>>? defined in org.jetbrains.kotlin.resolve.calls.checkers.InlineCheckerWrapper[PropertyDescriptorImpl]

'WeakReference' @ [46:42] ==> public constructor WeakReference<T : (Any..Any?)>(p0: (MutableMap<DeclarationDescriptor, CallChecker>..MutableMap<DeclarationDescriptor, CallChecker>?)) defined in java.lang.ref.WeakReference[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> MutableMap<DeclarationDescriptor, CallChecker>

'map' @ [46:56] ==> val map: MutableMap<DeclarationDescriptor, CallChecker> defined in org.jetbrains.kotlin.resolve.calls.checkers.InlineCheckerWrapper.getChecker[LocalVariableDescriptor]

'map' @ [47:16] ==> val map: MutableMap<DeclarationDescriptor, CallChecker> defined in org.jetbrains.kotlin.resolve.calls.checkers.InlineCheckerWrapper.getChecker[LocalVariableDescriptor]

'getOrPut' @ [47:20] ==> public inline fun <K, V> MutableMap<DeclarationDescriptor, CallChecker>.getOrPut(key: DeclarationDescriptor, defaultValue: () -> CallChecker): CallChecker defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> DeclarationDescriptor
    <V> -> CallChecker

'descriptor' @ [47:29] ==> value-parameter descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.resolve.calls.checkers.InlineCheckerWrapper.getChecker[ValueParameterDescriptorImpl]

'InlineChecker' @ [47:43] ==> public constructor InlineChecker(descriptor: FunctionDescriptor) defined in org.jetbrains.kotlin.resolve.calls.checkers.InlineChecker[ClassConstructorDescriptorImpl]

'descriptor' @ [47:57] ==> value-parameter descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.resolve.calls.checkers.InlineCheckerWrapper.getChecker[ValueParameterDescriptorImpl]

