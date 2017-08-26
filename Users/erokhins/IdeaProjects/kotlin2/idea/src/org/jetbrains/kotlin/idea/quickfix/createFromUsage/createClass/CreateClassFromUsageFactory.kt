'KotlinIntentionActionFactoryWithDelegate<E, ClassInfo>' @ [25:61] ==> public constructor KotlinIntentionActionFactoryWithDelegate<E : KtElement, D : Any>() defined in org.jetbrains.kotlin.idea.quickfix.KotlinIntentionActionFactoryWithDelegate[ClassConstructorDescriptorImpl]
Inferred types:
    <E : KtElement> -> E
    <D : Any> -> ClassInfo

'getPossibleClassKinds' @ [33:34] ==> protected abstract fun getPossibleClassKinds(element: E, diagnostic: Diagnostic): List<ClassKind> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromUsageFactory[SimpleFunctionDescriptorImpl]

'originalElementPointer' @ [33:56] ==> value-parameter originalElementPointer: SmartPsiElementPointer<E> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromUsageFactory.createFixes[ValueParameterDescriptorImpl]

'element' @ [33:79] ==> public final val <E : (PsiElement..PsiElement?)> SmartPsiElementPointer<E>.element: E?[MyPropertyDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> E

'emptyList' @ [33:97] ==> public fun <T> emptyList(): List<QuickFixWithDelegateFactory> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> QuickFixWithDelegateFactory

'diagnostic' @ [33:110] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromUsageFactory.createFixes[ValueParameterDescriptorImpl]

'possibleClassKinds' @ [35:16] ==> val possibleClassKinds: List<ClassKind> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromUsageFactory.createFixes[LocalVariableDescriptor]

'map' @ [35:35] ==> public inline fun <T, R> Iterable<ClassKind>.map(transform: (ClassKind) -> QuickFixWithDelegateFactory): List<QuickFixWithDelegateFactory> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassKind
    <R> -> QuickFixWithDelegateFactory

'QuickFixWithDelegateFactory' @ [36:13] ==> public fun QuickFixWithDelegateFactory(priority: IntentionActionPriority, createAction: () -> IntentionAction?): QuickFixWithDelegateFactory defined in org.jetbrains.kotlin.idea.quickfix in file QuickFixWithDelegateFactory.kt[SimpleFunctionDescriptorImpl]

'classKind' @ [36:41] ==> value-parameter classKind: ClassKind defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromUsageFactory.createFixes.<anonymous>[ValueParameterDescriptorImpl]

'actionPriority' @ [36:51] ==> public val ClassKind.actionPriority: IntentionActionPriority defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass in file CreateClassFromUsageFix.kt[PropertyDescriptorImpl]

'originalElementPointer' @ [37:38] ==> value-parameter originalElementPointer: SmartPsiElementPointer<E> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromUsageFactory.createFixes[ValueParameterDescriptorImpl]

'element' @ [37:61] ==> public final val <E : (PsiElement..PsiElement?)> SmartPsiElementPointer<E>.element: E?[MyPropertyDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> E

'invoke' @ [38:28] ==> public abstract operator fun invoke(): ClassInfo? defined in kotlin.Function0[FunctionInvokeDescriptor]

'CreateClassFromUsageFix' @ [39:17] ==> public companion object defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromUsageFix[FakeCallableDescriptorForObject]

'create' @ [39:41] ==> public final fun <E : KtElement> create(element: E, classInfo: ClassInfo): CreateClassFromUsageFix<E> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromUsageFix.Companion[SimpleFunctionDescriptorImpl]
Inferred types:
    <E : KtElement> -> E

'currentElement' @ [39:48] ==> val currentElement: E defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromUsageFactory.createFixes.<anonymous>.<anonymous>[LocalVariableDescriptor]

'data' @ [39:64] ==> val data: ClassInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromUsageFactory.createFixes.<anonymous>.<anonymous>[LocalVariableDescriptor]

'copy' @ [39:69] ==> public final fun copy(kind: ClassKind = ..., name: String = ..., targetParents: List<PsiElement> = ..., expectedTypeInfo: TypeInfo = ..., inner: Boolean = ..., open: Boolean = ..., typeArguments: List<TypeInfo> = ..., parameterInfos: List<ParameterInfo> = ...): ClassInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.ClassInfo[SimpleFunctionDescriptorImpl]

'classKind' @ [39:81] ==> value-parameter classKind: ClassKind defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromUsageFactory.createFixes.<anonymous>[ValueParameterDescriptorImpl]

