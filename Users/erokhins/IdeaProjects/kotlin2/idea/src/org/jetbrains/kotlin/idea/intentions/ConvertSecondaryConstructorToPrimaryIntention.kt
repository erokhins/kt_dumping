'IntentionBasedInspection<KtSecondaryConstructor>' @ [35:56] ==> public constructor IntentionBasedInspection<TElement : PsiElement>(intention: KClass<out SelfTargetingRangeIntention<KtSecondaryConstructor>>, additionalChecker: (KtSecondaryConstructor) -> Boolean, problemText: String? = ...) defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection[DeserializedClassConstructorDescriptor]
Inferred types:
    <TElement : PsiElement> -> KtSecondaryConstructor

'ConvertSecondaryConstructorToPrimaryIntention' @ [36:9] ==> public constructor ConvertSecondaryConstructorToPrimaryIntention() defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention[ClassConstructorDescriptorImpl]

'constructor' @ [37:26] ==> value-parameter constructor: KtSecondaryConstructor defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryInspection.<init>.<anonymous>[ValueParameterDescriptorImpl]

'containingClass' @ [37:38] ==> public fun KtElement.containingClass(): KtClass? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'secondaryConstructors' @ [37:57] ==> public final val KtClass.secondaryConstructors: List<KtSecondaryConstructor>[MyPropertyDescriptor]

'size' @ [37:80] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'element' @ [39:70] ==> value-parameter element: KtSecondaryConstructor defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryInspection.inspectionTarget[ValueParameterDescriptorImpl]

'getConstructorKeyword' @ [39:78] ==> public open fun getConstructorKeyword(): PsiElement defined in org.jetbrains.kotlin.psi.KtSecondaryConstructor[DeserializedSimpleFunctionDescriptor]

'SelfTargetingRangeIntention<KtSecondaryConstructor>' @ [42:55] ==> public constructor SelfTargetingRangeIntention<TElement : PsiElement>(elementType: Class<KtSecondaryConstructor>, text: String, familyName: String = ...) defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingRangeIntention[DeserializedClassConstructorDescriptor]
Inferred types:
    <TElement : PsiElement> -> KtSecondaryConstructor

'java' @ [43:39] ==> public val <T> KClass<KtSecondaryConstructor>.java: Class<KtSecondaryConstructor> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtSecondaryConstructor

'emptySet' @ [47:112] ==> public fun <T> emptySet(): Set<ConstructorDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ConstructorDescriptor

'constructor' @ [49:13] ==> value-parameter constructor: ConstructorDescriptor defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention.isReachableByDelegationFrom[ValueParameterDescriptorImpl]

'this' @ [49:28] ==> <this> defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention.isReachableByDelegationFrom[ReceiverParameterDescriptorImpl]

'constructor' @ [50:13] ==> value-parameter constructor: ConstructorDescriptor defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention.isReachableByDelegationFrom[ValueParameterDescriptorImpl]

'visited' @ [50:28] ==> value-parameter visited: Set<ConstructorDescriptor> = ... defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention.isReachableByDelegationFrom[ValueParameterDescriptorImpl]

'context' @ [51:38] ==> value-parameter context: BindingContext defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention.isReachableByDelegationFrom[ValueParameterDescriptorImpl]

'CONSTRUCTOR_RESOLVED_DELEGATION_CALL' @ [51:61] ==> public final val CONSTRUCTOR_RESOLVED_DELEGATION_CALL: (WritableSlice<(ConstructorDescriptor..ConstructorDescriptor?), (ResolvedCall<(ConstructorDescriptor..ConstructorDescriptor?)>..ResolvedCall<(ConstructorDescriptor..ConstructorDescriptor?)>?)>..WritableSlice<(ConstructorDescriptor..ConstructorDescriptor?), (ResolvedCall<(ConstructorDescriptor..ConstructorDescriptor?)>..ResolvedCall<(ConstructorDescriptor..ConstructorDescriptor?)>?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'constructor' @ [51:99] ==> value-parameter constructor: ConstructorDescriptor defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention.isReachableByDelegationFrom[ValueParameterDescriptorImpl]

'resolvedDelegationCall' @ [52:36] ==> val resolvedDelegationCall: ResolvedCall<(ConstructorDescriptor..ConstructorDescriptor?)> defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention.isReachableByDelegationFrom[LocalVariableDescriptor]

'candidateDescriptor' @ [52:59] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<(ConstructorDescriptor..ConstructorDescriptor?)>.candidateDescriptor: (ConstructorDescriptor..ConstructorDescriptor?)[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.ConstructorDescriptor..org.jetbrains.kotlin.descriptors.ConstructorDescriptor?)

'isReachableByDelegationFrom' @ [53:16] ==> private final tailrec fun ConstructorDescriptor.isReachableByDelegationFrom(constructor: ConstructorDescriptor, context: BindingContext, visited: Set<ConstructorDescriptor> = ...): Boolean defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention[SimpleFunctionDescriptorImpl]

'delegationDescriptor' @ [53:44] ==> val delegationDescriptor: (ConstructorDescriptor..ConstructorDescriptor?) defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention.isReachableByDelegationFrom[LocalVariableDescriptor]

'context' @ [53:66] ==> value-parameter context: BindingContext defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention.isReachableByDelegationFrom[ValueParameterDescriptorImpl]

'visited' @ [53:75] ==> value-parameter visited: Set<ConstructorDescriptor> = ... defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention.isReachableByDelegationFrom[ValueParameterDescriptorImpl]

'constructor' @ [53:85] ==> value-parameter constructor: ConstructorDescriptor defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention.isReachableByDelegationFrom[ValueParameterDescriptorImpl]

'element' @ [57:30] ==> value-parameter element: KtSecondaryConstructor defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention.applicabilityRange[ValueParameterDescriptorImpl]

'getDelegationCall' @ [57:38] ==> public final fun getDelegationCall(): KtConstructorDelegationCall defined in org.jetbrains.kotlin.psi.KtSecondaryConstructor[DeserializedSimpleFunctionDescriptor]

'delegationCall' @ [58:13] ==> val delegationCall: KtConstructorDelegationCall defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention.applicabilityRange[LocalVariableDescriptor]

'isCallToThis' @ [58:28] ==> public final val KtConstructorDelegationCall.isCallToThis: Boolean[MyPropertyDescriptor]

'element' @ [59:21] ==> value-parameter element: KtSecondaryConstructor defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention.applicabilityRange[ValueParameterDescriptorImpl]

'containingClassOrObject' @ [59:29] ==> public val KtDeclaration.containingClassOrObject: KtClassOrObject? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'klass' @ [60:13] ==> val klass: KtClassOrObject defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention.applicabilityRange[LocalVariableDescriptor]

'hasPrimaryConstructor' @ [60:19] ==> public open fun hasPrimaryConstructor(): Boolean defined in org.jetbrains.kotlin.psi.KtClassOrObject[DeserializedSimpleFunctionDescriptor]

'klass' @ [62:23] ==> val klass: KtClassOrObject defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention.applicabilityRange[LocalVariableDescriptor]

'analyzeFully' @ [62:29] ==> public fun KtElement.analyzeFully(): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'context' @ [63:31] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention.applicabilityRange[LocalVariableDescriptor]

'CLASS' @ [63:54] ==> public final val CLASS: (WritableSlice<(PsiElement..PsiElement?), (ClassDescriptor..ClassDescriptor?)>..WritableSlice<(PsiElement..PsiElement?), (ClassDescriptor..ClassDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'klass' @ [63:61] ==> val klass: KtClassOrObject defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention.applicabilityRange[LocalVariableDescriptor]

'context' @ [64:33] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention.applicabilityRange[LocalVariableDescriptor]

'CONSTRUCTOR' @ [64:56] ==> public final val CONSTRUCTOR: (WritableSlice<(PsiElement..PsiElement?), (ConstructorDescriptor..ConstructorDescriptor?)>..WritableSlice<(PsiElement..PsiElement?), (ConstructorDescriptor..ConstructorDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'element' @ [64:69] ==> value-parameter element: KtSecondaryConstructor defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention.applicabilityRange[ValueParameterDescriptorImpl]

'classDescriptor' @ [66:39] ==> val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention.applicabilityRange[LocalVariableDescriptor]

'constructors' @ [66:55] ==> public final val ClassDescriptor.constructors: Collection<(ClassConstructorDescriptor..ClassConstructorDescriptor?)>[MyPropertyDescriptor]

'constructorDescriptor' @ [67:17] ==> val constructorDescriptor: (ClassConstructorDescriptor..ClassConstructorDescriptor?) defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention.applicabilityRange[LocalVariableDescriptor]

'elementDescriptor' @ [67:42] ==> val elementDescriptor: ConstructorDescriptor defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention.applicabilityRange[LocalVariableDescriptor]

'!' @ [68:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'elementDescriptor' @ [68:18] ==> val elementDescriptor: ConstructorDescriptor defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention.applicabilityRange[LocalVariableDescriptor]

'isReachableByDelegationFrom' @ [68:36] ==> private final tailrec fun ConstructorDescriptor.isReachableByDelegationFrom(constructor: ConstructorDescriptor, context: BindingContext, visited: Set<ConstructorDescriptor> = ...): Boolean defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention[SimpleFunctionDescriptorImpl]

'constructorDescriptor' @ [68:64] ==> val constructorDescriptor: (ClassConstructorDescriptor..ClassConstructorDescriptor?) defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention.applicabilityRange[LocalVariableDescriptor]

'context' @ [68:87] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention.applicabilityRange[LocalVariableDescriptor]

'TextRange' @ [71:16] ==> public constructor TextRange(p0: Int, p1: Int) defined in com.intellij.openapi.util.TextRange[JavaClassConstructorDescriptor]

'element' @ [71:26] ==> value-parameter element: KtSecondaryConstructor defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention.applicabilityRange[ValueParameterDescriptorImpl]

'startOffset' @ [71:34] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'element' @ [71:47] ==> value-parameter element: KtSecondaryConstructor defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention.applicabilityRange[ValueParameterDescriptorImpl]

'valueParameterList' @ [71:55] ==> public final val KtSecondaryConstructor.valueParameterList: KtParameterList?[MyPropertyDescriptor]

'endOffset' @ [71:75] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'element' @ [71:88] ==> value-parameter element: KtSecondaryConstructor defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention.applicabilityRange[ValueParameterDescriptorImpl]

'getConstructorKeyword' @ [71:96] ==> public open fun getConstructorKeyword(): PsiElement defined in org.jetbrains.kotlin.psi.KtSecondaryConstructor[DeserializedSimpleFunctionDescriptor]

'endOffset' @ [71:120] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'this' @ [77:13] ==> <this> defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention.tryConvertToPropertyByParameterInitialization[ReceiverParameterDescriptorImpl]

'operationToken' @ [77:44] ==> public final val KtBinaryExpression.operationToken: IElementType[MyPropertyDescriptor]

'EQ' @ [77:71] ==> public final val EQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'right' @ [78:30] ==> public final val KtBinaryExpression.right: KtExpression?[MyPropertyDescriptor]

'context' @ [79:31] ==> value-parameter context: BindingContext defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention.tryConvertToPropertyByParameterInitialization[ValueParameterDescriptorImpl]

'REFERENCE_TARGET' @ [79:54] ==> public final val REFERENCE_TARGET: (WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>..WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'rightReference' @ [79:72] ==> val rightReference: KtReferenceExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention.tryConvertToPropertyByParameterInitialization[LocalVariableDescriptor]

'rightDescriptor' @ [80:13] ==> val rightDescriptor: ValueParameterDescriptor defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention.tryConvertToPropertyByParameterInitialization[LocalVariableDescriptor]

'containingDeclaration' @ [80:29] ==> public final val ValueParameterDescriptor.containingDeclaration: CallableDescriptor[MyPropertyDescriptor]

'constructorDescriptor' @ [80:54] ==> value-parameter constructorDescriptor: ConstructorDescriptor defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention.tryConvertToPropertyByParameterInitialization[ValueParameterDescriptorImpl]

'left' @ [81:20] ==> public final val KtBinaryExpression.left: KtExpression?[MyPropertyDescriptor]

'when (left) {
            is KtReferenceExpression ->
                left
            is KtDotQualifiedExpression ->
                if (left.receiverExpression is KtThisExpression) left.selectorExpression as? KtReferenceExpression else null
            else ->
                null
        }' @ [82:29] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KtReferenceExpression?, entry1: KtReferenceExpression?, entry2: KtReferenceExpression?): KtReferenceExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KtReferenceExpression?

'left' @ [82:35] ==> val left: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention.tryConvertToPropertyByParameterInitialization[LocalVariableDescriptor]

'left' @ [84:17] ==> val left: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention.tryConvertToPropertyByParameterInitialization[LocalVariableDescriptor]

'if (left.receiverExpression is KtThisExpression) left.selectorExpression as? KtReferenceExpression else null' @ [86:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtReferenceExpression?, elseBranch: KtReferenceExpression?): KtReferenceExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtReferenceExpression?

'left' @ [86:21] ==> val left: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention.tryConvertToPropertyByParameterInitialization[LocalVariableDescriptor]

'receiverExpression' @ [86:26] ==> public open val receiverExpression: KtExpression defined in org.jetbrains.kotlin.psi.KtDotQualifiedExpression[DeserializedPropertyDescriptor]

'left' @ [86:66] ==> val left: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention.tryConvertToPropertyByParameterInitialization[LocalVariableDescriptor]

'selectorExpression' @ [86:71] ==> public open val selectorExpression: KtExpression? defined in org.jetbrains.kotlin.psi.KtDotQualifiedExpression[DeserializedPropertyDescriptor]

'context' @ [90:30] ==> value-parameter context: BindingContext defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention.tryConvertToPropertyByParameterInitialization[ValueParameterDescriptorImpl]

'REFERENCE_TARGET' @ [90:53] ==> public final val REFERENCE_TARGET: (WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>..WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'leftReference' @ [90:71] ==> val leftReference: KtReferenceExpression? defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention.tryConvertToPropertyByParameterInitialization[LocalVariableDescriptor]

'rightDescriptor' @ [91:16] ==> val rightDescriptor: ValueParameterDescriptor defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention.tryConvertToPropertyByParameterInitialization[LocalVariableDescriptor]

'leftDescriptor' @ [91:35] ==> val leftDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention.tryConvertToPropertyByParameterInitialization[LocalVariableDescriptor]

'context' @ [99:37] ==> value-parameter context: BindingContext defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention.extractInitializer[ValueParameterDescriptorImpl]

'CONSTRUCTOR' @ [99:60] ==> public final val CONSTRUCTOR: (WritableSlice<(PsiElement..PsiElement?), (ConstructorDescriptor..ConstructorDescriptor?)>..WritableSlice<(PsiElement..PsiElement?), (ConstructorDescriptor..ConstructorDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'this' @ [99:73] ==> <this> defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention.extractInitializer[ReceiverParameterDescriptorImpl]

'factory' @ [100:27] ==> value-parameter factory: KtPsiFactory defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention.extractInitializer[ValueParameterDescriptorImpl]

'createAnonymousInitializer' @ [100:35] ==> public final fun createAnonymousInitializer(): KtAnonymousInitializer defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'bodyExpression' @ [101:27] ==> public final val KtSecondaryConstructor.bodyExpression: KtBlockExpression?[MyPropertyDescriptor]

'statements' @ [101:43] ==> public final val KtBlockExpression.statements: List<(KtExpression..KtExpression?)>[MyPropertyDescriptor]

'emptyList' @ [101:57] ==> public fun <T> emptyList(): List<(KtExpression..KtExpression?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtExpression..org.jetbrains.kotlin.psi.KtExpression?)

'component1' @ [102:18] ==> public final operator fun component1(): ValueParameterDescriptor? defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [102:35] ==> public final operator fun component2(): PropertyDescriptor? defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'statement' @ [102:53] ==> val statement: (KtExpression..KtExpression?) defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention.extractInitializer[LocalVariableDescriptor]

'tryConvertToPropertyByParameterInitialization' @ [102:63] ==> private final fun KtExpression.tryConvertToPropertyByParameterInitialization(constructorDescriptor: ConstructorDescriptor, context: BindingContext): Pair<ValueParameterDescriptor, PropertyDescriptor>? defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention[SimpleFunctionDescriptorImpl]

'constructorDescriptor' @ [102:109] ==> val constructorDescriptor: ConstructorDescriptor defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention.extractInitializer[LocalVariableDescriptor]

'context' @ [102:132] ==> value-parameter context: BindingContext defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention.extractInitializer[ValueParameterDescriptorImpl]

'with' @ [103:56] ==> @InlineOnly public inline fun <T, R> with(receiver: KtClassInitializer?, block: KtClassInitializer?.() -> Pair<Nothing?, Nothing?>): Pair<Nothing?, Nothing?> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtClassInitializer?
    <R> -> Pair<Nothing?, Nothing?>

'initializer' @ [103:61] ==> val initializer: KtClassInitializer? defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention.extractInitializer[LocalVariableDescriptor]

'initializer' @ [104:18] ==> val initializer: KtClassInitializer? defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention.extractInitializer[LocalVariableDescriptor]

'body' @ [104:31] ==> public open val body: KtExpression? defined in org.jetbrains.kotlin.psi.KtClassInitializer[DeserializedPropertyDescriptor]

'let' @ [104:60] ==> @InlineOnly public inline fun <T, R> KtBlockExpression.let(block: (KtBlockExpression) -> (PsiElement..PsiElement?)): (PsiElement..PsiElement?) defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtBlockExpression
    <R> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'it' @ [105:21] ==> value-parameter it: KtBlockExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention.extractInitializer.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'addBefore' @ [105:24] ==> public open fun addBefore(@NotNull p0: PsiElement, p1: PsiElement?): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtBlockExpression[JavaMethodDescriptor]

'statement' @ [105:34] ==> val statement: (KtExpression..KtExpression?) defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention.extractInitializer[LocalVariableDescriptor]

'copy' @ [105:44] ==> public abstract fun copy(): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtExpression[JavaMethodDescriptor]

'it' @ [105:52] ==> value-parameter it: KtBlockExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention.extractInitializer.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'rBrace' @ [105:55] ==> public final val KtBlockExpression.rBrace: PsiElement?[MyPropertyDescriptor]

'it' @ [106:21] ==> value-parameter it: KtBlockExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention.extractInitializer.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'addBefore' @ [106:24] ==> public open fun addBefore(@NotNull p0: PsiElement, p1: PsiElement?): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtBlockExpression[JavaMethodDescriptor]

'factory' @ [106:34] ==> value-parameter factory: KtPsiFactory defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention.extractInitializer[ValueParameterDescriptorImpl]

'createNewLine' @ [106:42] ==> public final fun createNewLine(): PsiElement defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'it' @ [106:59] ==> value-parameter it: KtBlockExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention.extractInitializer.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'rBrace' @ [106:62] ==> public final val KtBlockExpression.rBrace: PsiElement?[MyPropertyDescriptor]

'to' @ [108:17] ==> public infix fun <A, B> Nothing?.to(that: Nothing?): Pair<Nothing?, Nothing?> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Nothing?
    <B> -> Nothing?

'rightDescriptor' @ [110:17] ==> val rightDescriptor: ValueParameterDescriptor? defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention.extractInitializer[LocalVariableDescriptor]

'leftDescriptor' @ [110:44] ==> val leftDescriptor: PropertyDescriptor? defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention.extractInitializer[LocalVariableDescriptor]

'parameterToPropertyMap' @ [111:13] ==> value-parameter parameterToPropertyMap: MutableMap<ValueParameterDescriptor, PropertyDescriptor> defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention.extractInitializer[ValueParameterDescriptorImpl]

'rightDescriptor' @ [111:36] ==> val rightDescriptor: ValueParameterDescriptor? defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention.extractInitializer[LocalVariableDescriptor]

'leftDescriptor' @ [111:55] ==> val leftDescriptor: PropertyDescriptor? defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention.extractInitializer[LocalVariableDescriptor]

'initializer' @ [113:16] ==> val initializer: KtClassInitializer? defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention.extractInitializer[LocalVariableDescriptor]

'primaryConstructor' @ [122:29] ==> value-parameter primaryConstructor: KtPrimaryConstructor defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention.moveParametersToPrimaryConstructorAndInitializers[ValueParameterDescriptorImpl]

'valueParameterList' @ [122:48] ==> public final val KtPrimaryConstructor.valueParameterList: KtParameterList?[MyPropertyDescriptor]

'valueParameters' @ [123:27] ==> public final val KtSecondaryConstructor.valueParameters: (MutableList<(KtParameter..KtParameter?)>..List<(KtParameter..KtParameter?)>)[MyPropertyDescriptor]

'factory' @ [124:32] ==> value-parameter factory: KtPsiFactory defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention.moveParametersToPrimaryConstructorAndInitializers[ValueParameterDescriptorImpl]

'createParameter' @ [124:40] ==> public final fun createParameter(text: String): KtParameter defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'parameter' @ [124:56] ==> val parameter: (KtParameter..KtParameter?) defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention.moveParametersToPrimaryConstructorAndInitializers[LocalVariableDescriptor]

'text' @ [124:66] ==> public final val KtParameter.text: (String..String?)[MyPropertyDescriptor]

'context' @ [125:39] ==> value-parameter context: BindingContext defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention.moveParametersToPrimaryConstructorAndInitializers[ValueParameterDescriptorImpl]

'VALUE_PARAMETER' @ [125:62] ==> public final val VALUE_PARAMETER: (WritableSlice<(KtParameter..KtParameter?), (VariableDescriptor..VariableDescriptor?)>..WritableSlice<(KtParameter..KtParameter?), (VariableDescriptor..VariableDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'parameter' @ [125:79] ==> val parameter: (KtParameter..KtParameter?) defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention.moveParametersToPrimaryConstructorAndInitializers[LocalVariableDescriptor]

'parameterToPropertyMap' @ [126:38] ==> value-parameter parameterToPropertyMap: MutableMap<ValueParameterDescriptor, PropertyDescriptor> defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention.moveParametersToPrimaryConstructorAndInitializers[ValueParameterDescriptorImpl]

'parameterDescriptor' @ [126:61] ==> val parameterDescriptor: VariableDescriptor? defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention.moveParametersToPrimaryConstructorAndInitializers[LocalVariableDescriptor]

'parameterDescriptor' @ [128:17] ==> val parameterDescriptor: VariableDescriptor? defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention.moveParametersToPrimaryConstructorAndInitializers[LocalVariableDescriptor]

'propertyDescriptor' @ [128:48] ==> val propertyDescriptor: PropertyDescriptor? defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention.moveParametersToPrimaryConstructorAndInitializers[LocalVariableDescriptor]

'DescriptorToSourceUtils' @ [129:32] ==> public object DescriptorToSourceUtils defined in org.jetbrains.kotlin.resolve[FakeCallableDescriptorForObject]

'descriptorToDeclaration' @ [129:56] ==> @JvmStatic public final fun descriptorToDeclaration(descriptor: DeclarationDescriptor): PsiElement? defined in org.jetbrains.kotlin.resolve.DescriptorToSourceUtils[DeserializedSimpleFunctionDescriptor]

'propertyDescriptor' @ [129:80] ==> val propertyDescriptor: PropertyDescriptor? defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention.moveParametersToPrimaryConstructorAndInitializers[LocalVariableDescriptor]

'property' @ [130:21] ==> val property: KtProperty? defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention.moveParametersToPrimaryConstructorAndInitializers[LocalVariableDescriptor]

'if (propertyDescriptor.name == parameterDescriptor.name &&
                        propertyDescriptor.type == parameterDescriptor.type &&
                        propertyDescriptor.accessors.all { it.isDefault }) {
                        propertyCommentSaver = CommentSaver(property)
                        val valOrVar = if (property.isVar) factory.createVarKeyword() else factory.createValKeyword()
                        newParameter.addBefore(valOrVar, newParameter.nameIdentifier)
                        val propertyModifiers = property.modifierList?.text
                        if (propertyModifiers != null) {
                            val newModifiers = factory.createModifierList(propertyModifiers)
                            newParameter.addBefore(newModifiers, newParameter.valOrVarKeyword)
                        }
                        property.delete()
                    }
                    else {
                        property.initializer = factory.createSimpleName(parameterDescriptor.name.asString())
                    }' @ [131:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'propertyDescriptor' @ [131:25] ==> val propertyDescriptor: PropertyDescriptor? defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention.moveParametersToPrimaryConstructorAndInitializers[LocalVariableDescriptor]

'name' @ [131:44] ==> public final val PropertyDescriptor.name: Name[MyPropertyDescriptor]

'parameterDescriptor' @ [131:52] ==> val parameterDescriptor: VariableDescriptor? defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention.moveParametersToPrimaryConstructorAndInitializers[LocalVariableDescriptor]

'name' @ [131:72] ==> public final val VariableDescriptor.name: Name[MyPropertyDescriptor]

'propertyDescriptor' @ [132:25] ==> val propertyDescriptor: PropertyDescriptor? defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention.moveParametersToPrimaryConstructorAndInitializers[LocalVariableDescriptor]

'type' @ [132:44] ==> public final val PropertyDescriptor.type: KotlinType[MyPropertyDescriptor]

'parameterDescriptor' @ [132:52] ==> val parameterDescriptor: VariableDescriptor? defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention.moveParametersToPrimaryConstructorAndInitializers[LocalVariableDescriptor]

'type' @ [132:72] ==> public final val VariableDescriptor.type: KotlinType[MyPropertyDescriptor]

'propertyDescriptor' @ [133:25] ==> val propertyDescriptor: PropertyDescriptor? defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention.moveParametersToPrimaryConstructorAndInitializers[LocalVariableDescriptor]

'accessors' @ [133:44] ==> public final val PropertyDescriptor.accessors: (MutableList<(PropertyAccessorDescriptor..PropertyAccessorDescriptor?)>..List<(PropertyAccessorDescriptor..PropertyAccessorDescriptor?)>)[MyPropertyDescriptor]

'all' @ [133:54] ==> public inline fun <T> Iterable<(PropertyAccessorDescriptor..PropertyAccessorDescriptor?)>.all(predicate: ((PropertyAccessorDescriptor..PropertyAccessorDescriptor?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.PropertyAccessorDescriptor..org.jetbrains.kotlin.descriptors.PropertyAccessorDescriptor?)

'it' @ [133:60] ==> value-parameter it: (PropertyAccessorDescriptor..PropertyAccessorDescriptor?) defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention.moveParametersToPrimaryConstructorAndInitializers.<anonymous>[ValueParameterDescriptorImpl]

'isDefault' @ [133:63] ==> public final val PropertyAccessorDescriptor.isDefault: Boolean[MyPropertyDescriptor]

'propertyCommentSaver' @ [134:25] ==> var propertyCommentSaver: CommentSaver? defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention.moveParametersToPrimaryConstructorAndInitializers[LocalVariableDescriptor]

'CommentSaver' @ [134:48] ==> public constructor CommentSaver(originalElement: PsiElement, saveLineBreaks: Boolean = ...) defined in org.jetbrains.kotlin.idea.util.CommentSaver[DeserializedClassConstructorDescriptor]

'property' @ [134:61] ==> val property: KtProperty? defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention.moveParametersToPrimaryConstructorAndInitializers[LocalVariableDescriptor]

'if (property.isVar) factory.createVarKeyword() else factory.createValKeyword()' @ [135:40] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: PsiElement, elseBranch: PsiElement): PsiElement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> PsiElement

'property' @ [135:44] ==> val property: KtProperty? defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention.moveParametersToPrimaryConstructorAndInitializers[LocalVariableDescriptor]

'isVar' @ [135:53] ==> public final val KtProperty.isVar: Boolean[MyPropertyDescriptor]

'factory' @ [135:60] ==> value-parameter factory: KtPsiFactory defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention.moveParametersToPrimaryConstructorAndInitializers[ValueParameterDescriptorImpl]

'createVarKeyword' @ [135:68] ==> public final fun createVarKeyword(): PsiElement defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'factory' @ [135:92] ==> value-parameter factory: KtPsiFactory defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention.moveParametersToPrimaryConstructorAndInitializers[ValueParameterDescriptorImpl]

'createValKeyword' @ [135:100] ==> public final fun createValKeyword(): PsiElement defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'newParameter' @ [136:25] ==> val newParameter: KtParameter defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention.moveParametersToPrimaryConstructorAndInitializers[LocalVariableDescriptor]

'addBefore' @ [136:38] ==> public open fun addBefore(@NotNull p0: PsiElement, p1: PsiElement?): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtParameter[JavaMethodDescriptor]

'valOrVar' @ [136:48] ==> val valOrVar: PsiElement defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention.moveParametersToPrimaryConstructorAndInitializers[LocalVariableDescriptor]

'newParameter' @ [136:58] ==> val newParameter: KtParameter defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention.moveParametersToPrimaryConstructorAndInitializers[LocalVariableDescriptor]

'nameIdentifier' @ [136:71] ==> public final val KtParameter.nameIdentifier: PsiElement?[MyPropertyDescriptor]

'property' @ [137:49] ==> val property: KtProperty? defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention.moveParametersToPrimaryConstructorAndInitializers[LocalVariableDescriptor]

'modifierList' @ [137:58] ==> public final val KtProperty.modifierList: KtModifierList?[MyPropertyDescriptor]

'text' @ [137:72] ==> public final val KtModifierList.text: (String..String?)[MyPropertyDescriptor]

'propertyModifiers' @ [138:29] ==> val propertyModifiers: String? defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention.moveParametersToPrimaryConstructorAndInitializers[LocalVariableDescriptor]

'factory' @ [139:48] ==> value-parameter factory: KtPsiFactory defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention.moveParametersToPrimaryConstructorAndInitializers[ValueParameterDescriptorImpl]

'createModifierList' @ [139:56] ==> public final fun createModifierList(text: String): KtModifierList defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'propertyModifiers' @ [139:75] ==> val propertyModifiers: String? defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention.moveParametersToPrimaryConstructorAndInitializers[LocalVariableDescriptor]

'newParameter' @ [140:29] ==> val newParameter: KtParameter defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention.moveParametersToPrimaryConstructorAndInitializers[LocalVariableDescriptor]

'addBefore' @ [140:42] ==> public open fun addBefore(@NotNull p0: PsiElement, p1: PsiElement?): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtParameter[JavaMethodDescriptor]

'newModifiers' @ [140:52] ==> val newModifiers: KtModifierList defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention.moveParametersToPrimaryConstructorAndInitializers[LocalVariableDescriptor]

'newParameter' @ [140:66] ==> val newParameter: KtParameter defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention.moveParametersToPrimaryConstructorAndInitializers[LocalVariableDescriptor]

'valOrVarKeyword' @ [140:79] ==> public final val KtParameter.valOrVarKeyword: PsiElement?[MyPropertyDescriptor]

'property' @ [142:25] ==> val property: KtProperty? defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention.moveParametersToPrimaryConstructorAndInitializers[LocalVariableDescriptor]

'delete' @ [142:34] ==> public open fun delete(): Unit defined in org.jetbrains.kotlin.psi.KtProperty[JavaMethodDescriptor]

'property' @ [145:25] ==> val property: KtProperty? defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention.moveParametersToPrimaryConstructorAndInitializers[LocalVariableDescriptor]

'initializer' @ [145:34] ==> public final var KtProperty.initializer: KtExpression?[MyPropertyDescriptor]

'factory' @ [145:48] ==> value-parameter factory: KtPsiFactory defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention.moveParametersToPrimaryConstructorAndInitializers[ValueParameterDescriptorImpl]

'createSimpleName' @ [145:56] ==> public final fun createSimpleName(name: String): KtSimpleNameExpression defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'parameterDescriptor' @ [145:73] ==> val parameterDescriptor: VariableDescriptor? defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention.moveParametersToPrimaryConstructorAndInitializers[LocalVariableDescriptor]

'name' @ [145:93] ==> public final val VariableDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [145:98] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'with' @ [149:13] ==> @InlineOnly public inline fun <T, R> with(receiver: KtParameter, block: (KtParameter).() -> Unit?): Unit? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtParameter
    <R> -> Unit?

'parameterList' @ [149:18] ==> val parameterList: KtParameterList defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention.moveParametersToPrimaryConstructorAndInitializers[LocalVariableDescriptor]

'addParameter' @ [149:32] ==> @NotNull public open fun addParameter(@NotNull p0: KtParameter): KtParameter defined in org.jetbrains.kotlin.psi.KtParameterList[JavaMethodDescriptor]

'newParameter' @ [149:45] ==> val newParameter: KtParameter defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention.moveParametersToPrimaryConstructorAndInitializers[LocalVariableDescriptor]

'propertyCommentSaver' @ [150:17] ==> var propertyCommentSaver: CommentSaver? defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention.moveParametersToPrimaryConstructorAndInitializers[LocalVariableDescriptor]

'restore' @ [150:39] ==> public final fun restore(resultElement: PsiElement, forceAdjustIndent: Boolean = ...): Unit defined in org.jetbrains.kotlin.idea.util.CommentSaver[DeserializedSimpleFunctionDescriptor]

'this@with' @ [150:47] ==> <this> defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention.moveParametersToPrimaryConstructorAndInitializers.<anonymous>[ReceiverParameterDescriptorImpl]

'element' @ [156:21] ==> value-parameter element: KtSecondaryConstructor defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention.applyTo[ValueParameterDescriptorImpl]

'containingClassOrObject' @ [156:29] ==> public val KtDeclaration.containingClassOrObject: KtClassOrObject? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'klass' @ [157:23] ==> val klass: KtClass defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention.applyTo[LocalVariableDescriptor]

'analyzeFully' @ [157:29] ==> public fun KtElement.analyzeFully(): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'KtPsiFactory' @ [158:23] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'klass' @ [158:36] ==> val klass: KtClass defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention.applyTo[LocalVariableDescriptor]

'CommentSaver' @ [159:39] ==> public constructor CommentSaver(originalElement: PsiElement, saveLineBreaks: Boolean = ...) defined in org.jetbrains.kotlin.idea.util.CommentSaver[DeserializedClassConstructorDescriptor]

'element' @ [159:52] ==> value-parameter element: KtSecondaryConstructor defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention.applyTo[ValueParameterDescriptorImpl]

'klass' @ [160:34] ==> val klass: KtClass defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention.applyTo[LocalVariableDescriptor]

'createPrimaryConstructorIfAbsent' @ [160:40] ==> public fun KtClass.createPrimaryConstructorIfAbsent(): KtPrimaryConstructor defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'factory' @ [161:27] ==> val factory: KtPsiFactory defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention.applyTo[LocalVariableDescriptor]

'createPrimaryConstructor' @ [161:35] ==> public final fun createPrimaryConstructor(modifiers: String?): KtPrimaryConstructor defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'element' @ [161:60] ==> value-parameter element: KtSecondaryConstructor defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention.applyTo[ValueParameterDescriptorImpl]

'modifierList' @ [161:68] ==> public final val KtSecondaryConstructor.modifierList: KtModifierList?[MyPropertyDescriptor]

'text' @ [161:82] ==> public final val KtModifierList.text: (String..String?)[MyPropertyDescriptor]

'replace' @ [161:88] ==> public fun String.replace(oldValue: String, newValue: String, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'mutableMapOf' @ [163:38] ==> @SinceKotlin @InlineOnly public inline fun <K, V> mutableMapOf(): MutableMap<ValueParameterDescriptor, PropertyDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> ValueParameterDescriptor
    <V> -> PropertyDescriptor

'element' @ [164:27] ==> value-parameter element: KtSecondaryConstructor defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention.applyTo[ValueParameterDescriptorImpl]

'extractInitializer' @ [164:35] ==> private final fun KtSecondaryConstructor.extractInitializer(parameterToPropertyMap: MutableMap<ValueParameterDescriptor, PropertyDescriptor>, context: BindingContext, factory: KtPsiFactory): KtClassInitializer? defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention[SimpleFunctionDescriptorImpl]

'parameterToPropertyMap' @ [164:54] ==> val parameterToPropertyMap: MutableMap<ValueParameterDescriptor, PropertyDescriptor> defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention.applyTo[LocalVariableDescriptor]

'context' @ [164:78] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention.applyTo[LocalVariableDescriptor]

'factory' @ [164:87] ==> val factory: KtPsiFactory defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention.applyTo[LocalVariableDescriptor]

'element' @ [166:9] ==> value-parameter element: KtSecondaryConstructor defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention.applyTo[ValueParameterDescriptorImpl]

'moveParametersToPrimaryConstructorAndInitializers' @ [166:17] ==> private final fun KtSecondaryConstructor.moveParametersToPrimaryConstructorAndInitializers(primaryConstructor: KtPrimaryConstructor, parameterToPropertyMap: MutableMap<ValueParameterDescriptor, PropertyDescriptor>, context: BindingContext, factory: KtPsiFactory): Unit defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention[SimpleFunctionDescriptorImpl]

'constructor' @ [166:67] ==> val constructor: KtPrimaryConstructor defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention.applyTo[LocalVariableDescriptor]

'parameterToPropertyMap' @ [166:80] ==> val parameterToPropertyMap: MutableMap<ValueParameterDescriptor, PropertyDescriptor> defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention.applyTo[LocalVariableDescriptor]

'context' @ [166:104] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention.applyTo[LocalVariableDescriptor]

'factory' @ [166:113] ==> val factory: KtPsiFactory defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention.applyTo[LocalVariableDescriptor]

'element' @ [168:28] ==> value-parameter element: KtSecondaryConstructor defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention.applyTo[ValueParameterDescriptorImpl]

'getDelegationCall' @ [168:36] ==> public final fun getDelegationCall(): KtConstructorDelegationCall defined in org.jetbrains.kotlin.psi.KtSecondaryConstructor[DeserializedSimpleFunctionDescriptor]

'valueArgumentList' @ [168:56] ==> public final val KtConstructorDelegationCall.valueArgumentList: KtValueArgumentList?[MyPropertyDescriptor]

'klass' @ [169:36] ==> val klass: KtClass defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention.applyTo[LocalVariableDescriptor]

'superTypeListEntries' @ [169:42] ==> public final val KtClass.superTypeListEntries: List<KtSuperTypeListEntry>[MyPropertyDescriptor]

'superTypeListEntry' @ [170:33] ==> val superTypeListEntry: KtSuperTypeListEntry defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention.applyTo[LocalVariableDescriptor]

'typeReference' @ [170:52] ==> public final val KtSuperTypeListEntry.typeReference: KtTypeReference?[MyPropertyDescriptor]

'context' @ [171:24] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention.applyTo[LocalVariableDescriptor]

'TYPE' @ [171:47] ==> public final val TYPE: (WritableSlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>..WritableSlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'typeReference' @ [171:53] ==> val typeReference: KtTypeReference defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention.applyTo[LocalVariableDescriptor]

'==' @ [172:17] ==> public final fun equals(other: Any?): Boolean defined in org.jetbrains.kotlin.descriptors.ClassKind[DeserializedSimpleFunctionDescriptor]

'type' @ [172:18] ==> val type: KotlinType? defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention.applyTo[LocalVariableDescriptor]

'constructor' @ [172:24] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [172:37] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'kind' @ [172:104] ==> public val ClassifierDescriptorWithTypeParameters.kind: ClassKind? defined in org.jetbrains.kotlin.util[DeserializedPropertyDescriptor]

'CLASS' @ [172:122] ==> enum entry CLASS defined in org.jetbrains.kotlin.descriptors.ClassKind[FakeCallableDescriptorForObject]

'factory' @ [173:42] ==> val factory: KtPsiFactory defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention.applyTo[LocalVariableDescriptor]

'createSuperTypeCallEntry' @ [173:50] ==> public final fun createSuperTypeCallEntry(text: String): KtSuperTypeCallEntry defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'typeReference' @ [174:28] ==> val typeReference: KtTypeReference defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention.applyTo[LocalVariableDescriptor]

'text' @ [174:42] ==> public final val KtTypeReference.text: (String..String?)[MyPropertyDescriptor]

'argumentList' @ [174:49] ==> val argumentList: KtValueArgumentList? defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention.applyTo[LocalVariableDescriptor]

'text' @ [174:63] ==> public final val KtValueArgumentList.text: (String..String?)[MyPropertyDescriptor]

'superTypeListEntry' @ [176:17] ==> val superTypeListEntry: KtSuperTypeListEntry defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention.applyTo[LocalVariableDescriptor]

'replace' @ [176:36] ==> public open fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtSuperTypeListEntry[JavaMethodDescriptor]

'superTypeCallEntry' @ [176:44] ==> val superTypeCallEntry: KtSuperTypeCallEntry defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention.applyTo[LocalVariableDescriptor]

'with' @ [181:9] ==> @InlineOnly public inline fun <T, R> with(receiver: (PsiElement..PsiElement?), block: (PsiElement..PsiElement?).() -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)
    <R> -> Unit

'constructorInClass' @ [181:15] ==> val constructorInClass: KtPrimaryConstructor defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention.applyTo[LocalVariableDescriptor]

'replace' @ [181:34] ==> public open fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtPrimaryConstructor[JavaMethodDescriptor]

'constructor' @ [181:42] ==> val constructor: KtPrimaryConstructor defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention.applyTo[LocalVariableDescriptor]

'constructorCommentSaver' @ [182:13] ==> val constructorCommentSaver: CommentSaver defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention.applyTo[LocalVariableDescriptor]

'restore' @ [182:37] ==> public final fun restore(resultElement: PsiElement, forceAdjustIndent: Boolean = ...): Unit defined in org.jetbrains.kotlin.idea.util.CommentSaver[DeserializedSimpleFunctionDescriptor]

'this' @ [182:45] ==> <this> defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention.applyTo.<anonymous>[ReceiverParameterDescriptorImpl]

'element' @ [184:9] ==> value-parameter element: KtSecondaryConstructor defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention.applyTo[ValueParameterDescriptorImpl]

'delete' @ [184:17] ==> public open fun delete(): Unit defined in org.jetbrains.kotlin.psi.KtSecondaryConstructor[JavaMethodDescriptor]

'?:' @ [186:13] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: Boolean?, right: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> Boolean

'initializer' @ [186:14] ==> val initializer: KtClassInitializer defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention.applyTo[LocalVariableDescriptor]

'body' @ [186:26] ==> public open val body: KtExpression? defined in org.jetbrains.kotlin.psi.KtClassInitializer[DeserializedPropertyDescriptor]

'statements' @ [186:55] ==> public final val KtBlockExpression.statements: List<(KtExpression..KtExpression?)>[MyPropertyDescriptor]

'isNotEmpty' @ [186:67] ==> @InlineOnly public inline fun <T> Collection<(KtExpression..KtExpression?)>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtExpression..org.jetbrains.kotlin.psi.KtExpression?)

'klass' @ [187:13] ==> val klass: KtClass defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention.applyTo[LocalVariableDescriptor]

'addDeclaration' @ [187:19] ==> public final inline fun <reified T : KtDeclaration> addDeclaration(declaration: KtClassInitializer): KtClassInitializer defined in org.jetbrains.kotlin.psi.KtClass[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : KtDeclaration> -> KtClassInitializer

'initializer' @ [187:34] ==> val initializer: KtClassInitializer defined in org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention.applyTo[LocalVariableDescriptor]

