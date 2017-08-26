'KotlinIntentionActionFactoryWithDelegate<E, List<CallableInfo>>' @ [33:5] ==> public constructor KotlinIntentionActionFactoryWithDelegate<E : KtElement, D : Any>() defined in org.jetbrains.kotlin.idea.quickfix.KotlinIntentionActionFactoryWithDelegate[ClassConstructorDescriptorImpl]
Inferred types:
    <E : KtElement> -> E
    <D : Any> -> List<CallableInfo>

'QuickFixWithDelegateFactory' @ [40:16] ==> public fun QuickFixWithDelegateFactory(priority: IntentionActionPriority, createAction: () -> IntentionAction?): QuickFixWithDelegateFactory defined in org.jetbrains.kotlin.idea.quickfix in file QuickFixWithDelegateFactory.kt[SimpleFunctionDescriptorImpl]

'priority' @ [40:44] ==> value-parameter priority: IntentionActionPriority defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableMemberFromUsageFactory.newCallableQuickFix[ValueParameterDescriptorImpl]

'invoke' @ [41:24] ==> public abstract operator fun invoke(): List<CallableInfo>? defined in kotlin.Function0[FunctionInvokeDescriptor]

'orEmpty' @ [41:46] ==> @InlineOnly public inline fun <T> List<CallableInfo>?.orEmpty(): List<CallableInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableInfo

'originalElementPointer' @ [42:35] ==> value-parameter originalElementPointer: SmartPsiElementPointer<E> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableMemberFromUsageFactory.newCallableQuickFix[ValueParameterDescriptorImpl]

'element' @ [42:58] ==> public final val <E : (PsiElement..PsiElement?)> SmartPsiElementPointer<E>.element: E?[MyPropertyDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> E

'if (data.isNotEmpty() && originalElement != null) quickFixFactory(originalElement, data) else null' @ [43:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: IntentionAction?, elseBranch: IntentionAction?): IntentionAction?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> IntentionAction?

'data' @ [43:17] ==> val data: List<CallableInfo> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableMemberFromUsageFactory.newCallableQuickFix.<anonymous>[LocalVariableDescriptor]

'isNotEmpty' @ [43:22] ==> @InlineOnly public inline fun <T> Collection<CallableInfo>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableInfo

'originalElement' @ [43:38] ==> val originalElement: E? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableMemberFromUsageFactory.newCallableQuickFix.<anonymous>[LocalVariableDescriptor]

'invoke' @ [43:63] ==> public abstract operator fun invoke(p1: E, p2: List<CallableInfo>): CreateFromUsageFixBase<E>? defined in kotlin.Function2[FunctionInvokeDescriptor]

'originalElement' @ [43:79] ==> val originalElement: E? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableMemberFromUsageFactory.newCallableQuickFix.<anonymous>[LocalVariableDescriptor]

'data' @ [43:96] ==> val data: List<CallableInfo> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableMemberFromUsageFactory.newCallableQuickFix.<anonymous>[LocalVariableDescriptor]

'listOfNotNull' @ [50:15] ==> public fun <T : Any> listOfNotNull(element: CallableInfo?): List<CallableInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> CallableInfo

'createCallableInfo' @ [50:29] ==> protected open fun createCallableInfo(element: E, diagnostic: Diagnostic): CallableInfo? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableMemberFromUsageFactory[SimpleFunctionDescriptorImpl]

'element' @ [50:48] ==> value-parameter element: E defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableMemberFromUsageFactory.extractFixData[ValueParameterDescriptorImpl]

'diagnostic' @ [50:57] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableMemberFromUsageFactory.extractFixData[ValueParameterDescriptorImpl]

'ArrayList' @ [57:21] ==> public constructor ArrayList<E : (Any..Any?)>(p0: Int) defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> QuickFixWithDelegateFactory

'newCallableQuickFix' @ [59:9] ==> private final fun newCallableQuickFix(originalElementPointer: SmartPsiElementPointer<E>, priority: IntentionActionPriority, quickFixDataFactory: () -> List<CallableInfo>?, quickFixFactory: (E, List<CallableInfo>) -> CreateFromUsageFixBase<E>?): QuickFixWithDelegateFactory defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableMemberFromUsageFactory[SimpleFunctionDescriptorImpl]

'originalElementPointer' @ [59:29] ==> value-parameter originalElementPointer: SmartPsiElementPointer<E> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableMemberFromUsageFactory.createFixes[ValueParameterDescriptorImpl]

'NORMAL' @ [59:77] ==> enum entry NORMAL defined in org.jetbrains.kotlin.idea.quickfix.IntentionActionPriority[FakeCallableDescriptorForObject]

'quickFixDataFactory' @ [59:85] ==> value-parameter quickFixDataFactory: () -> List<CallableInfo>? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableMemberFromUsageFactory.createFixes[ValueParameterDescriptorImpl]

'CreateCallableFromUsageFix' @ [60:13] ==> public constructor CreateCallableFromUsageFix<E : KtElement>(originalExpression: E, callableInfos: List<CallableInfo>) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFix[ClassConstructorDescriptorImpl]
Inferred types:
    <E : KtElement> -> E

'element' @ [60:40] ==> value-parameter element: E defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableMemberFromUsageFactory.createFixes.<anonymous>[ValueParameterDescriptorImpl]

'data' @ [60:49] ==> value-parameter data: List<CallableInfo> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableMemberFromUsageFactory.createFixes.<anonymous>[ValueParameterDescriptorImpl]

'let' @ [61:11] ==> @InlineOnly public inline fun <T, R> QuickFixWithDelegateFactory.let(block: (QuickFixWithDelegateFactory) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> QuickFixWithDelegateFactory
    <R> -> Boolean

'fixes' @ [61:17] ==> val fixes: ArrayList<QuickFixWithDelegateFactory> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableMemberFromUsageFactory.createFixes[LocalVariableDescriptor]

'add' @ [61:23] ==> public open fun add(element: QuickFixWithDelegateFactory): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'it' @ [61:27] ==> value-parameter it: QuickFixWithDelegateFactory defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableMemberFromUsageFactory.createFixes.<anonymous>[ValueParameterDescriptorImpl]

'newCallableQuickFix' @ [63:9] ==> private final fun newCallableQuickFix(originalElementPointer: SmartPsiElementPointer<E>, priority: IntentionActionPriority, quickFixDataFactory: () -> List<CallableInfo>?, quickFixFactory: (E, List<CallableInfo>) -> CreateFromUsageFixBase<E>?): QuickFixWithDelegateFactory defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableMemberFromUsageFactory[SimpleFunctionDescriptorImpl]

'originalElementPointer' @ [63:29] ==> value-parameter originalElementPointer: SmartPsiElementPointer<E> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableMemberFromUsageFactory.createFixes[ValueParameterDescriptorImpl]

'NORMAL' @ [63:77] ==> enum entry NORMAL defined in org.jetbrains.kotlin.idea.quickfix.IntentionActionPriority[FakeCallableDescriptorForObject]

'quickFixDataFactory' @ [63:85] ==> value-parameter quickFixDataFactory: () -> List<CallableInfo>? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableMemberFromUsageFactory.createFixes[ValueParameterDescriptorImpl]

'data' @ [64:14] ==> value-parameter data: List<CallableInfo> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableMemberFromUsageFactory.createFixes.<anonymous>[ValueParameterDescriptorImpl]

'singleOrNull' @ [64:19] ==> public fun <T> List<CallableInfo>.singleOrNull(): CallableInfo? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableInfo

'let' @ [64:53] ==> @InlineOnly public inline fun <T, R> PropertyInfo.let(block: (PropertyInfo) -> CreateParameterFromUsageFix<E>?): CreateParameterFromUsageFix<E>? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PropertyInfo
    <R> -> CreateParameterFromUsageFix<E>?

'CreateParameterFromUsageFix' @ [65:17] ==> public companion object defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createVariable.CreateParameterFromUsageFix[FakeCallableDescriptorForObject]

'createFixForPrimaryConstructorPropertyParameter' @ [65:45] ==> public final fun <E : KtElement> createFixForPrimaryConstructorPropertyParameter(element: E, info: PropertyInfo): CreateParameterFromUsageFix<E>? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createVariable.CreateParameterFromUsageFix.Companion[SimpleFunctionDescriptorImpl]
Inferred types:
    <E : KtElement> -> E

'element' @ [65:93] ==> value-parameter element: E defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableMemberFromUsageFactory.createFixes.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [65:102] ==> value-parameter it: PropertyInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableMemberFromUsageFactory.createFixes.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'let' @ [67:11] ==> @InlineOnly public inline fun <T, R> QuickFixWithDelegateFactory.let(block: (QuickFixWithDelegateFactory) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> QuickFixWithDelegateFactory
    <R> -> Boolean

'fixes' @ [67:17] ==> val fixes: ArrayList<QuickFixWithDelegateFactory> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableMemberFromUsageFactory.createFixes[LocalVariableDescriptor]

'add' @ [67:23] ==> public open fun add(element: QuickFixWithDelegateFactory): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'it' @ [67:27] ==> value-parameter it: QuickFixWithDelegateFactory defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableMemberFromUsageFactory.createFixes.<anonymous>[ValueParameterDescriptorImpl]

'extensionsSupported' @ [69:13] ==> private final val extensionsSupported: Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableMemberFromUsageFactory[PropertyDescriptorImpl]

'newCallableQuickFix' @ [70:13] ==> private final fun newCallableQuickFix(originalElementPointer: SmartPsiElementPointer<E>, priority: IntentionActionPriority, quickFixDataFactory: () -> List<CallableInfo>?, quickFixFactory: (E, List<CallableInfo>) -> CreateFromUsageFixBase<E>?): QuickFixWithDelegateFactory defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableMemberFromUsageFactory[SimpleFunctionDescriptorImpl]

'originalElementPointer' @ [70:33] ==> value-parameter originalElementPointer: SmartPsiElementPointer<E> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableMemberFromUsageFactory.createFixes[ValueParameterDescriptorImpl]

'LOW' @ [70:81] ==> enum entry LOW defined in org.jetbrains.kotlin.idea.quickfix.IntentionActionPriority[FakeCallableDescriptorForObject]

'quickFixDataFactory' @ [70:86] ==> value-parameter quickFixDataFactory: () -> List<CallableInfo>? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableMemberFromUsageFactory.createFixes[ValueParameterDescriptorImpl]

'data' @ [71:21] ==> value-parameter data: List<CallableInfo> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableMemberFromUsageFactory.createFixes.<anonymous>[ValueParameterDescriptorImpl]

'any' @ [71:26] ==> public inline fun <T> Iterable<CallableInfo>.any(predicate: (CallableInfo) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableInfo

'it' @ [71:32] ==> value-parameter it: CallableInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableMemberFromUsageFactory.createFixes.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'isAbstract' @ [71:35] ==> public final val isAbstract: Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableInfo[PropertyDescriptorImpl]

'CreateExtensionCallableFromUsageFix' @ [72:17] ==> public constructor CreateExtensionCallableFromUsageFix<E : KtElement>(originalExpression: E, callableInfos: List<CallableInfo>) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateExtensionCallableFromUsageFix[ClassConstructorDescriptorImpl]
Inferred types:
    <E : KtElement> -> E

'element' @ [72:53] ==> value-parameter element: E defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableMemberFromUsageFactory.createFixes.<anonymous>[ValueParameterDescriptorImpl]

'data' @ [72:62] ==> value-parameter data: List<CallableInfo> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableMemberFromUsageFactory.createFixes.<anonymous>[ValueParameterDescriptorImpl]

'let' @ [73:15] ==> @InlineOnly public inline fun <T, R> QuickFixWithDelegateFactory.let(block: (QuickFixWithDelegateFactory) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> QuickFixWithDelegateFactory
    <R> -> Boolean

'fixes' @ [73:21] ==> val fixes: ArrayList<QuickFixWithDelegateFactory> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableMemberFromUsageFactory.createFixes[LocalVariableDescriptor]

'add' @ [73:27] ==> public open fun add(element: QuickFixWithDelegateFactory): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'it' @ [73:31] ==> value-parameter it: QuickFixWithDelegateFactory defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableMemberFromUsageFactory.createFixes.<anonymous>[ValueParameterDescriptorImpl]

'fixes' @ [76:16] ==> val fixes: ArrayList<QuickFixWithDelegateFactory> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableMemberFromUsageFactory.createFixes[LocalVariableDescriptor]

