'accept' @ [71:16] ==> public abstract fun <R : (Any..Any?), D : (Any..Any?)> accept(@NotNull visitor: KtVisitor<Boolean, Nothing?>, data: Nothing?): Boolean defined in org.jetbrains.kotlin.psi.KtExpression[JavaMethodDescriptor]
Inferred types:
    <R : (Any..Any?)> -> Boolean
    <D : (Any..Any?)> -> Nothing?

'KtVisitor<Boolean, Nothing?>' @ [72:25] ==> public constructor KtVisitor<R : (Any..Any?), D : (Any..Any?)>() defined in org.jetbrains.kotlin.psi.KtVisitor[JavaClassConstructorDescriptor]
Inferred types:
    <R : (Any..Any?)> -> Boolean
    <D : (Any..Any?)> -> Nothing?

'element' @ [74:32] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.isMovable.<no name provided>.visitKtElement[ValueParameterDescriptorImpl]

'allChildren' @ [74:40] ==> public val PsiElement.allChildren: PsiChildRange defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'all' @ [74:52] ==> public inline fun <T> Sequence<PsiElement>.all(predicate: (PsiElement) -> Boolean): Boolean defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'?:' @ [74:58] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: Boolean?, right: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> Boolean

'it' @ [74:59] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.isMovable.<no name provided>.visitKtElement.<anonymous>[ValueParameterDescriptorImpl]

'accept' @ [74:78] ==> public abstract fun <R, D> accept(visitor: KtVisitor<Boolean, Nothing?>, data: Nothing?): Boolean defined in org.jetbrains.kotlin.psi.KtElement[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Boolean
    <D> -> Nothing?

'this' @ [74:85] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.isMovable.<no name provided>[LazyClassReceiverParameterDescriptor]

'arg' @ [74:91] ==> value-parameter arg: Nothing? defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.isMovable.<no name provided>.visitKtElement[ValueParameterDescriptorImpl]

'expression' @ [80:44] ==> value-parameter expression: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.isMovable.<no name provided>.visitSimpleNameExpression[ValueParameterDescriptorImpl]

'getResolvedCall' @ [80:55] ==> public fun KtElement?.getResolvedCall(context: BindingContext): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'data' @ [80:71] ==> private final val data: KotlinPullUpData defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper[PropertyDescriptorImpl]

'resolutionFacade' @ [80:76] ==> public final val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpData[PropertyDescriptorImpl]

'analyze' @ [80:93] ==> public abstract fun analyze(element: KtElement, bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.resolve.ResolutionFacade[DeserializedSimpleFunctionDescriptor]

'expression' @ [80:101] ==> value-parameter expression: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.isMovable.<no name provided>.visitSimpleNameExpression[ValueParameterDescriptorImpl]

'resolvedCall' @ [81:41] ==> val resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.isMovable.<no name provided>.visitSimpleNameExpression[LocalVariableDescriptor]

'getExplicitReceiverValue' @ [81:54] ==> public fun ResolvedCall<*>.getExplicitReceiverValue(): ReceiverValue? defined in org.jetbrains.kotlin.resolve.calls.resolvedCallUtil[DeserializedSimpleFunctionDescriptor]

'expression' @ [81:106] ==> public abstract val expression: KtExpression defined in org.jetbrains.kotlin.resolve.scopes.receivers.ExpressionReceiver[DeserializedPropertyDescriptor]

'receiver' @ [82:29] ==> val receiver: KtExpression? defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.isMovable.<no name provided>.visitSimpleNameExpression[LocalVariableDescriptor]

'receiver' @ [82:49] ==> val receiver: KtExpression? defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.isMovable.<no name provided>.visitSimpleNameExpression[LocalVariableDescriptor]

'receiver' @ [82:82] ==> val receiver: KtExpression? defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.isMovable.<no name provided>.visitSimpleNameExpression[LocalVariableDescriptor]

'resolvedCall' @ [84:65] ==> val resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.isMovable.<no name provided>.visitSimpleNameExpression[LocalVariableDescriptor]

'resultingDescriptor' @ [84:78] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.resultingDescriptor: CallableDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(out CallableDescriptor)

'descriptor' @ [85:29] ==> var descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.isMovable.<no name provided>.visitSimpleNameExpression[LocalVariableDescriptor]

'descriptor' @ [86:29] ==> var descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.isMovable.<no name provided>.visitSimpleNameExpression[LocalVariableDescriptor]

'descriptor' @ [86:42] ==> var descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.isMovable.<no name provided>.visitSimpleNameExpression[LocalVariableDescriptor]

'containingDeclaration' @ [86:53] ==> public final val ConstructorDescriptor.containingDeclaration: ClassifierDescriptorWithTypeParameters[MyPropertyDescriptor]

'descriptor' @ [89:29] ==> var descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.isMovable.<no name provided>.visitSimpleNameExpression[LocalVariableDescriptor]

'descriptor' @ [90:29] ==> var descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.isMovable.<no name provided>.visitSimpleNameExpression[LocalVariableDescriptor]

'!' @ [90:62] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [90:63] ==> var descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.isMovable.<no name provided>.visitSimpleNameExpression[LocalVariableDescriptor]

'isInner' @ [90:74] ==> public final val ClassDescriptor.isInner: Boolean[MyPropertyDescriptor]

'descriptor' @ [91:29] ==> var descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.isMovable.<no name provided>.visitSimpleNameExpression[LocalVariableDescriptor]

'descriptor' @ [92:33] ==> var descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.isMovable.<no name provided>.visitSimpleNameExpression[LocalVariableDescriptor]

'source' @ [92:44] ==> public final val MemberDescriptor.source: SourceElement[MyPropertyDescriptor]

'getPsi' @ [92:51] ==> public fun SourceElement.getPsi(): PsiElement? defined in org.jetbrains.kotlin.resolve.source[DeserializedSimpleFunctionDescriptor]

'propertiesToMoveInitializers' @ [92:63] ==> private final val propertiesToMoveInitializers: List<KtProperty> defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper[PropertyDescriptorImpl]

'descriptor' @ [93:29] ==> var descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.isMovable.<no name provided>.visitSimpleNameExpression[LocalVariableDescriptor]

'descriptor' @ [93:42] ==> var descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.isMovable.<no name provided>.visitSimpleNameExpression[LocalVariableDescriptor]

'containingDeclaration' @ [93:53] ==> public final val MemberDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'descriptor' @ [95:32] ==> var descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.isMovable.<no name provided>.visitSimpleNameExpression[LocalVariableDescriptor]

'descriptor' @ [96:36] ==> var descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.isMovable.<no name provided>.visitSimpleNameExpression[LocalVariableDescriptor]

'isSubclass' @ [96:85] ==> public open fun isSubclass(@NotNull p0: ClassDescriptor, @NotNull p1: ClassDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'data' @ [96:96] ==> private final val data: KotlinPullUpData defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper[PropertyDescriptorImpl]

'targetClassDescriptor' @ [96:101] ==> public final val targetClassDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpData[PropertyDescriptorImpl]

'descriptor' @ [96:124] ==> var descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.isMovable.<no name provided>.visitSimpleNameExpression[LocalVariableDescriptor]

'scope' @ [108:13] ==> value-parameter scope: KtBlockExpression? defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.getCommonInitializer[ValueParameterDescriptorImpl]

'currentInitializer' @ [108:35] ==> value-parameter currentInitializer: KtExpression? defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.getCommonInitializer[ValueParameterDescriptorImpl]

'scope' @ [112:27] ==> value-parameter scope: KtBlockExpression? defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.getCommonInitializer[ValueParameterDescriptorImpl]

'statements' @ [112:33] ==> public final val KtBlockExpression.statements: List<(KtExpression..KtExpression?)>[MyPropertyDescriptor]

'statement' @ [113:13] ==> val statement: (KtExpression..KtExpression?) defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.getCommonInitializer[LocalVariableDescriptor]

'asAssignment' @ [113:23] ==> public fun KtExpression.asAssignment(): KtBinaryExpression? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'let' @ [113:39] ==> @InlineOnly public inline fun <T, R> KtBinaryExpression.let(block: (KtBinaryExpression) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtBinaryExpression
    <R> -> Unit

'safeDeparenthesize' @ [114:37] ==> @NotNull public open fun safeDeparenthesize(@NotNull p0: KtExpression): KtExpression defined in org.jetbrains.kotlin.psi.KtPsiUtil[JavaMethodDescriptor]

'it' @ [114:56] ==> value-parameter it: KtBinaryExpression defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.getCommonInitializer.<anonymous>[ValueParameterDescriptorImpl]

'left' @ [114:59] ==> public final val KtBinaryExpression.left: KtExpression?[MyPropertyDescriptor]

'lhs' @ [115:33] ==> val lhs: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.getCommonInitializer.<anonymous>[LocalVariableDescriptor]

'receiverExpression' @ [115:65] ==> public open val receiverExpression: KtExpression defined in org.jetbrains.kotlin.psi.KtQualifiedExpression[DeserializedPropertyDescriptor]

'receiver' @ [116:21] ==> val receiver: KtExpression? defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.getCommonInitializer.<anonymous>[LocalVariableDescriptor]

'receiver' @ [116:41] ==> val receiver: KtExpression? defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.getCommonInitializer.<anonymous>[LocalVariableDescriptor]

'lhs' @ [118:36] ==> val lhs: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.getCommonInitializer.<anonymous>[LocalVariableDescriptor]

'getResolvedCall' @ [118:40] ==> public fun KtElement?.getResolvedCall(context: BindingContext): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'data' @ [118:56] ==> private final val data: KotlinPullUpData defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper[PropertyDescriptorImpl]

'resolutionFacade' @ [118:61] ==> public final val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpData[PropertyDescriptorImpl]

'analyze' @ [118:78] ==> public abstract fun analyze(element: KtElement, bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.resolve.ResolutionFacade[DeserializedSimpleFunctionDescriptor]

'it' @ [118:86] ==> value-parameter it: KtBinaryExpression defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.getCommonInitializer.<anonymous>[ValueParameterDescriptorImpl]

'resolvedCall' @ [119:21] ==> val resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.getCommonInitializer.<anonymous>[LocalVariableDescriptor]

'resultingDescriptor' @ [119:34] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.resultingDescriptor: CallableDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(out CallableDescriptor)

'propertyDescriptor' @ [119:57] ==> value-parameter propertyDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.getCommonInitializer[ValueParameterDescriptorImpl]

'if (initializerCandidate == null) {
                    if (currentInitializer == null) {
                        if (!statement.isMovable()) return null

                        initializerCandidate = statement
                        elementsToRemove.add(statement)
                    }
                    else {
                        if (!KotlinPsiUnifier.DEFAULT.unify(statement, currentInitializer).matched) return null

                        initializerCandidate = currentInitializer
                        elementsToRemove.add(statement)
                    }
                }
                else if (!KotlinPsiUnifier.DEFAULT.unify(statement, initializerCandidate).matched) return null' @ [121:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any, elseBranch: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any

'initializerCandidate' @ [121:21] ==> var initializerCandidate: KtExpression? defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.getCommonInitializer[LocalVariableDescriptor]

'if (currentInitializer == null) {
                        if (!statement.isMovable()) return null

                        initializerCandidate = statement
                        elementsToRemove.add(statement)
                    }
                    else {
                        if (!KotlinPsiUnifier.DEFAULT.unify(statement, currentInitializer).matched) return null

                        initializerCandidate = currentInitializer
                        elementsToRemove.add(statement)
                    }' @ [122:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'currentInitializer' @ [122:25] ==> value-parameter currentInitializer: KtExpression? defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.getCommonInitializer[ValueParameterDescriptorImpl]

'!' @ [123:29] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'statement' @ [123:30] ==> val statement: (KtExpression..KtExpression?) defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.getCommonInitializer[LocalVariableDescriptor]

'isMovable' @ [123:40] ==> private final fun KtExpression.isMovable(): Boolean defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper[SimpleFunctionDescriptorImpl]

'initializerCandidate' @ [125:25] ==> var initializerCandidate: KtExpression? defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.getCommonInitializer[LocalVariableDescriptor]

'statement' @ [125:48] ==> val statement: (KtExpression..KtExpression?) defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.getCommonInitializer[LocalVariableDescriptor]

'elementsToRemove' @ [126:25] ==> value-parameter elementsToRemove: MutableSet<KtElement> defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.getCommonInitializer[ValueParameterDescriptorImpl]

'add' @ [126:42] ==> public abstract fun add(element: KtElement): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'statement' @ [126:46] ==> val statement: (KtExpression..KtExpression?) defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.getCommonInitializer[LocalVariableDescriptor]

'!' @ [129:29] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'KotlinPsiUnifier' @ [129:30] ==> public companion object defined in org.jetbrains.kotlin.idea.util.psi.patternMatching.KotlinPsiUnifier[FakeCallableDescriptorForObject]

'DEFAULT' @ [129:47] ==> public final val DEFAULT: KotlinPsiUnifier defined in org.jetbrains.kotlin.idea.util.psi.patternMatching.KotlinPsiUnifier.Companion[DeserializedPropertyDescriptor]

'unify' @ [129:55] ==> public final fun unify(targetElement: PsiElement?, patternElement: PsiElement?): UnificationResult defined in org.jetbrains.kotlin.idea.util.psi.patternMatching.KotlinPsiUnifier[DeserializedSimpleFunctionDescriptor]

'statement' @ [129:61] ==> val statement: (KtExpression..KtExpression?) defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.getCommonInitializer[LocalVariableDescriptor]

'currentInitializer' @ [129:72] ==> value-parameter currentInitializer: KtExpression? defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.getCommonInitializer[ValueParameterDescriptorImpl]

'matched' @ [129:92] ==> public open val matched: Boolean defined in org.jetbrains.kotlin.idea.util.psi.patternMatching.UnificationResult[DeserializedPropertyDescriptor]

'initializerCandidate' @ [131:25] ==> var initializerCandidate: KtExpression? defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.getCommonInitializer[LocalVariableDescriptor]

'currentInitializer' @ [131:48] ==> value-parameter currentInitializer: KtExpression? defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.getCommonInitializer[ValueParameterDescriptorImpl]

'elementsToRemove' @ [132:25] ==> value-parameter elementsToRemove: MutableSet<KtElement> defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.getCommonInitializer[ValueParameterDescriptorImpl]

'add' @ [132:42] ==> public abstract fun add(element: KtElement): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'statement' @ [132:46] ==> val statement: (KtExpression..KtExpression?) defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.getCommonInitializer[LocalVariableDescriptor]

'!' @ [135:26] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'KotlinPsiUnifier' @ [135:27] ==> public companion object defined in org.jetbrains.kotlin.idea.util.psi.patternMatching.KotlinPsiUnifier[FakeCallableDescriptorForObject]

'DEFAULT' @ [135:44] ==> public final val DEFAULT: KotlinPsiUnifier defined in org.jetbrains.kotlin.idea.util.psi.patternMatching.KotlinPsiUnifier.Companion[DeserializedPropertyDescriptor]

'unify' @ [135:52] ==> public final fun unify(targetElement: PsiElement?, patternElement: PsiElement?): UnificationResult defined in org.jetbrains.kotlin.idea.util.psi.patternMatching.KotlinPsiUnifier[DeserializedSimpleFunctionDescriptor]

'statement' @ [135:58] ==> val statement: (KtExpression..KtExpression?) defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.getCommonInitializer[LocalVariableDescriptor]

'initializerCandidate' @ [135:69] ==> var initializerCandidate: KtExpression? defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.getCommonInitializer[LocalVariableDescriptor]

'matched' @ [135:91] ==> public open val matched: Boolean defined in org.jetbrains.kotlin.idea.util.psi.patternMatching.UnificationResult[DeserializedPropertyDescriptor]

'initializerCandidate' @ [139:16] ==> var initializerCandidate: KtExpression? defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.getCommonInitializer[LocalVariableDescriptor]

'targetToSourceConstructors' @ [152:34] ==> private final val targetToSourceConstructors: LinkedHashMap<KtElement, MutableList<KtElement>> defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper[PropertyDescriptorImpl]

'targetConstructor' @ [152:61] ==> value-parameter targetConstructor: KtElement defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.getInitializerInfo[ValueParameterDescriptorImpl]

'LinkedHashSet' @ [153:32] ==> public constructor LinkedHashSet<E : (Any..Any?)>() defined in java.util.LinkedHashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> KtElement

'sourceConstructors' @ [154:33] ==> val sourceConstructors: MutableList<KtElement> defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.getInitializerInfo[LocalVariableDescriptor]

'fold' @ [154:52] ==> public inline fun <T, R> Iterable<KtElement>.fold(initial: KtExpression?, operation: (acc: KtExpression?, KtElement) -> KtExpression?): KtExpression? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtElement
    <R> -> KtExpression?

'constructor' @ [155:25] ==> value-parameter constructor: KtElement defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.getInitializerInfo.<anonymous>[ValueParameterDescriptorImpl]

'bodyExpression' @ [155:66] ==> public final val KtSecondaryConstructor.bodyExpression: KtBlockExpression?[MyPropertyDescriptor]

'getCommonInitializer' @ [156:13] ==> private final fun getCommonInitializer(currentInitializer: KtExpression?, scope: KtBlockExpression?, propertyDescriptor: PropertyDescriptor, elementsToRemove: MutableSet<KtElement>): KtExpression? defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper[SimpleFunctionDescriptorImpl]

'commonInitializer' @ [156:34] ==> value-parameter commonInitializer: KtExpression? defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.getInitializerInfo.<anonymous>[ValueParameterDescriptorImpl]

'body' @ [156:53] ==> val body: KtBlockExpression? defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.getInitializerInfo.<anonymous>[LocalVariableDescriptor]

'propertyDescriptor' @ [156:59] ==> value-parameter propertyDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.getInitializerInfo[ValueParameterDescriptorImpl]

'elementsToRemove' @ [156:79] ==> val elementsToRemove: LinkedHashSet<KtElement> defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.getInitializerInfo[LocalVariableDescriptor]

'commonInitializer' @ [158:13] ==> val commonInitializer: KtExpression? defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.getInitializerInfo[LocalVariableDescriptor]

'elementsToRemove' @ [159:13] ==> val elementsToRemove: LinkedHashSet<KtElement> defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.getInitializerInfo[LocalVariableDescriptor]

'clear' @ [159:30] ==> public open fun clear(): Unit defined in java.util.LinkedHashSet[JavaMethodDescriptor]

'LinkedHashSet' @ [162:30] ==> public constructor LinkedHashSet<E : (Any..Any?)>() defined in java.util.LinkedHashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> KtProperty

'LinkedHashSet' @ [163:30] ==> public constructor LinkedHashSet<E : (Any..Any?)>() defined in java.util.LinkedHashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> KtParameter

'KtTreeVisitorVoid' @ [164:32] ==> public constructor KtTreeVisitorVoid() defined in org.jetbrains.kotlin.psi.KtTreeVisitorVoid[JavaClassConstructorDescriptor]

'data' @ [166:31] ==> private final val data: KotlinPullUpData defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper[PropertyDescriptorImpl]

'resolutionFacade' @ [166:36] ==> public final val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpData[PropertyDescriptorImpl]

'analyze' @ [166:53] ==> public abstract fun analyze(element: KtElement, bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.resolve.ResolutionFacade[DeserializedSimpleFunctionDescriptor]

'expression' @ [166:61] ==> value-parameter expression: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.getInitializerInfo.<no name provided>.visitSimpleNameExpression[ValueParameterDescriptorImpl]

'expression' @ [167:36] ==> value-parameter expression: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.getInitializerInfo.<no name provided>.visitSimpleNameExpression[ValueParameterDescriptorImpl]

'getResolvedCall' @ [167:47] ==> public fun KtElement?.getResolvedCall(context: BindingContext): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'context' @ [167:63] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.getInitializerInfo.<no name provided>.visitSimpleNameExpression[LocalVariableDescriptor]

'resolvedCall' @ [168:33] ==> val resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.getInitializerInfo.<no name provided>.visitSimpleNameExpression[LocalVariableDescriptor]

'getExplicitReceiverValue' @ [168:46] ==> public fun ResolvedCall<*>.getExplicitReceiverValue(): ReceiverValue? defined in org.jetbrains.kotlin.resolve.calls.resolvedCallUtil[DeserializedSimpleFunctionDescriptor]

'expression' @ [168:98] ==> public abstract val expression: KtExpression defined in org.jetbrains.kotlin.resolve.scopes.receivers.ExpressionReceiver[DeserializedPropertyDescriptor]

'receiver' @ [169:21] ==> val receiver: KtExpression? defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.getInitializerInfo.<no name provided>.visitSimpleNameExpression[LocalVariableDescriptor]

'receiver' @ [169:41] ==> val receiver: KtExpression? defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.getInitializerInfo.<no name provided>.visitSimpleNameExpression[LocalVariableDescriptor]

'resolvedCall' @ [170:31] ==> val resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.getInitializerInfo.<no name provided>.visitSimpleNameExpression[LocalVariableDescriptor]

'resultingDescriptor' @ [170:44] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.resultingDescriptor: CallableDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(out CallableDescriptor)

'source' @ [170:102] ==> public final val DeclarationDescriptorWithSource.source: SourceElement[MyPropertyDescriptor]

'getPsi' @ [170:110] ==> public fun SourceElement.getPsi(): PsiElement? defined in org.jetbrains.kotlin.resolve.source[DeserializedSimpleFunctionDescriptor]

'when (target) {
                    is KtParameter -> usedParameters.add(target)
                    is KtProperty -> usedProperties.add(target)
                }' @ [171:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'target' @ [171:23] ==> val target: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.getInitializerInfo.<no name provided>.visitSimpleNameExpression[LocalVariableDescriptor]

'usedParameters' @ [172:39] ==> val usedParameters: LinkedHashSet<KtParameter> defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.getInitializerInfo[LocalVariableDescriptor]

'add' @ [172:54] ==> public open fun add(element: KtParameter): Boolean defined in java.util.LinkedHashSet[JavaMethodDescriptor]

'target' @ [172:58] ==> val target: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.getInitializerInfo.<no name provided>.visitSimpleNameExpression[LocalVariableDescriptor]

'usedProperties' @ [173:38] ==> val usedProperties: LinkedHashSet<KtProperty> defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.getInitializerInfo[LocalVariableDescriptor]

'add' @ [173:53] ==> public open fun add(element: KtProperty): Boolean defined in java.util.LinkedHashSet[JavaMethodDescriptor]

'target' @ [173:57] ==> val target: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.getInitializerInfo.<no name provided>.visitSimpleNameExpression[LocalVariableDescriptor]

'commonInitializer' @ [177:9] ==> val commonInitializer: KtExpression? defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.getInitializerInfo[LocalVariableDescriptor]

'accept' @ [177:28] ==> public abstract fun accept(@NotNull p0: PsiElementVisitor): Unit defined in org.jetbrains.kotlin.psi.KtExpression[JavaMethodDescriptor]

'visitor' @ [177:35] ==> val visitor: <no name provided> defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.getInitializerInfo[LocalVariableDescriptor]

'targetConstructor' @ [178:13] ==> value-parameter targetConstructor: KtElement defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.getInitializerInfo[ValueParameterDescriptorImpl]

'?:' @ [178:34] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: Any?, right: Any?): Any?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> Any?

'data' @ [178:35] ==> private final val data: KotlinPullUpData defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper[PropertyDescriptorImpl]

'targetClass' @ [178:40] ==> public final val targetClass: PsiNamedElement defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpData[PropertyDescriptorImpl]

'primaryConstructor' @ [178:66] ==> public final val KtClass.primaryConstructor: KtPrimaryConstructor?[MyPropertyDescriptor]

'data' @ [178:88] ==> private final val data: KotlinPullUpData defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper[PropertyDescriptorImpl]

'targetClass' @ [178:93] ==> public final val targetClass: PsiNamedElement defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpData[PropertyDescriptorImpl]

'property' @ [179:13] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.getInitializerInfo[ValueParameterDescriptorImpl]

'initializer' @ [179:22] ==> public final var KtProperty.initializer: KtExpression?[MyPropertyDescriptor]

'accept' @ [179:35] ==> public abstract fun accept(@NotNull p0: PsiElementVisitor): Unit defined in org.jetbrains.kotlin.psi.KtExpression[JavaMethodDescriptor]

'visitor' @ [179:42] ==> val visitor: <no name provided> defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.getInitializerInfo[LocalVariableDescriptor]

'InitializerInfo' @ [182:16] ==> public constructor InitializerInfo(initializer: KtExpression?, usedProperties: Set<KtProperty>, usedParameters: Set<KtParameter>, elementsToRemove: Set<KtElement>) defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.InitializerInfo[ClassConstructorDescriptorImpl]

'commonInitializer' @ [182:32] ==> val commonInitializer: KtExpression? defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.getInitializerInfo[LocalVariableDescriptor]

'usedProperties' @ [182:51] ==> val usedProperties: LinkedHashSet<KtProperty> defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.getInitializerInfo[LocalVariableDescriptor]

'usedParameters' @ [182:67] ==> val usedParameters: LinkedHashSet<KtParameter> defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.getInitializerInfo[LocalVariableDescriptor]

'elementsToRemove' @ [182:83] ==> val elementsToRemove: LinkedHashSet<KtElement> defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.getInitializerInfo[LocalVariableDescriptor]

'with' @ [185:48] ==> @InlineOnly public inline fun <T, R> with(receiver: KotlinPullUpData, block: KotlinPullUpData.() -> List<KtProperty>): List<KtProperty> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinPullUpData
    <R> -> List<KtProperty>

'data' @ [185:53] ==> private final val data: KotlinPullUpData defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper[PropertyDescriptorImpl]

'membersToMove' @ [186:9] ==> public final val membersToMove: Collection<KtNamedDeclaration> defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpData[PropertyDescriptorImpl]

'filterIsInstance' @ [187:18] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<KtProperty> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> KtProperty

'filter' @ [188:18] ==> public inline fun <T> Iterable<KtProperty>.filter(predicate: (KtProperty) -> Boolean): List<KtProperty> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtProperty

'memberDescriptors' @ [189:38] ==> public final val memberDescriptors: Map<KtNamedDeclaration, DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpData[PropertyDescriptorImpl]

'it' @ [189:56] ==> value-parameter it: KtProperty defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.propertiesToMoveInitializers.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'descriptor' @ [190:21] ==> val descriptor: PropertyDescriptor? defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.propertiesToMoveInitializers.<anonymous>.<anonymous>[LocalVariableDescriptor]

'data' @ [190:43] ==> private final val data: KotlinPullUpData defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper[PropertyDescriptorImpl]

'sourceClassContext' @ [190:48] ==> public final val sourceClassContext: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpData[PropertyDescriptorImpl]

'BACKING_FIELD_REQUIRED' @ [190:82] ==> public final val BACKING_FIELD_REQUIRED: (WritableSlice<(PropertyDescriptor..PropertyDescriptor?), (Boolean..Boolean?)>..WritableSlice<(PropertyDescriptor..PropertyDescriptor?), (Boolean..Boolean?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'descriptor' @ [190:106] ==> val descriptor: PropertyDescriptor? defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.propertiesToMoveInitializers.<anonymous>.<anonymous>[LocalVariableDescriptor]

'LinkedHashMap' @ [194:46] ==> public constructor LinkedHashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.LinkedHashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> KtElement
    <V : (Any..Any?)> -> MutableList<KtElement>

'let' @ [194:97] ==> @InlineOnly public inline fun <T, R> LinkedHashMap<KtElement, MutableList<KtElement>>.let(block: (LinkedHashMap<KtElement, MutableList<KtElement>>) -> LinkedHashMap<KtElement, MutableList<KtElement>>): LinkedHashMap<KtElement, MutableList<KtElement>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LinkedHashMap<KtElement, MutableList<KtElement>>
    <R> -> LinkedHashMap<KtElement, MutableList<KtElement>>

'!' @ [195:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'data' @ [195:14] ==> private final val data: KotlinPullUpData defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper[PropertyDescriptorImpl]

'isInterfaceTarget' @ [195:19] ==> public final val isInterfaceTarget: Boolean defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpData[PropertyDescriptorImpl]

'data' @ [195:40] ==> private final val data: KotlinPullUpData defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper[PropertyDescriptorImpl]

'targetClass' @ [195:45] ==> public final val targetClass: PsiNamedElement defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpData[PropertyDescriptorImpl]

'result' @ [196:13] ==> value-parameter result: LinkedHashMap<KtElement, MutableList<KtElement>> defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.targetToSourceConstructors.<anonymous>[ValueParameterDescriptorImpl]

'data' @ [196:20] ==> private final val data: KotlinPullUpData defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper[PropertyDescriptorImpl]

'targetClass' @ [196:25] ==> public final val targetClass: PsiNamedElement defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpData[PropertyDescriptorImpl]

'primaryConstructor' @ [196:37] ==> public final val KtClass.primaryConstructor: KtPrimaryConstructor?[MyPropertyDescriptor]

'data' @ [196:59] ==> private final val data: KotlinPullUpData defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper[PropertyDescriptorImpl]

'targetClass' @ [196:64] ==> public final val targetClass: PsiNamedElement defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpData[PropertyDescriptorImpl]

'ArrayList' @ [196:79] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> KtElement

'data' @ [197:13] ==> private final val data: KotlinPullUpData defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper[PropertyDescriptorImpl]

'sourceClass' @ [197:18] ==> public final val sourceClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpData[PropertyDescriptorImpl]

'accept' @ [197:30] ==> public final fun accept(@NotNull p0: PsiElementVisitor): Unit defined in org.jetbrains.kotlin.psi.KtClassOrObject[JavaMethodDescriptor]

'KtTreeVisitorVoid' @ [198:30] ==> public constructor KtTreeVisitorVoid() defined in org.jetbrains.kotlin.psi.KtTreeVisitorVoid[JavaClassConstructorDescriptor]

'data' @ [200:46] ==> private final val data: KotlinPullUpData defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper[PropertyDescriptorImpl]

'resolutionFacade' @ [200:51] ==> public final val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpData[PropertyDescriptorImpl]

'analyze' @ [200:68] ==> public abstract fun analyze(element: KtElement, bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.resolve.ResolutionFacade[DeserializedSimpleFunctionDescriptor]

'expression' @ [200:76] ==> value-parameter expression: KtReferenceExpression defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.targetToSourceConstructors.<anonymous>.<no name provided>.processConstructorReference[ValueParameterDescriptorImpl]

'REFERENCE_TARGET' @ [200:103] ==> public final val REFERENCE_TARGET: (WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>..WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'expression' @ [200:121] ==> value-parameter expression: KtReferenceExpression defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.targetToSourceConstructors.<anonymous>.<no name provided>.processConstructorReference[ValueParameterDescriptorImpl]

'?:' @ [201:54] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: PsiElement?, right: PsiElement): PsiElement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> PsiElement

'descriptor' @ [201:55] ==> val descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.targetToSourceConstructors.<anonymous>.<no name provided>.processConstructorReference[LocalVariableDescriptor]

'source' @ [201:104] ==> public final val DeclarationDescriptorWithSource.source: SourceElement[MyPropertyDescriptor]

'getPsi' @ [201:112] ==> public fun SourceElement.getPsi(): PsiElement? defined in org.jetbrains.kotlin.resolve.source[DeserializedSimpleFunctionDescriptor]

'constructorElement' @ [202:33] ==> val constructorElement: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.targetToSourceConstructors.<anonymous>.<no name provided>.processConstructorReference[LocalVariableDescriptor]

'data' @ [202:55] ==> private final val data: KotlinPullUpData defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper[PropertyDescriptorImpl]

'targetClass' @ [202:60] ==> public final val targetClass: PsiNamedElement defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpData[PropertyDescriptorImpl]

'==' @ [203:36] ==> public open fun equals(other: Any?): Boolean defined in org.jetbrains.kotlin.psi.KtClassOrObject[DeserializedSimpleFunctionDescriptor]

'constructorElement' @ [203:37] ==> val constructorElement: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.targetToSourceConstructors.<anonymous>.<no name provided>.processConstructorReference[LocalVariableDescriptor]

'getContainingClassOrObject' @ [203:79] ==> public abstract fun getContainingClassOrObject(): KtClassOrObject defined in org.jetbrains.kotlin.psi.KtConstructor[DeserializedSimpleFunctionDescriptor]

'data' @ [203:111] ==> private final val data: KotlinPullUpData defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper[PropertyDescriptorImpl]

'targetClass' @ [203:116] ==> public final val targetClass: PsiNamedElement defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpData[PropertyDescriptorImpl]

'result' @ [204:33] ==> value-parameter result: LinkedHashMap<KtElement, MutableList<KtElement>> defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.targetToSourceConstructors.<anonymous>[ValueParameterDescriptorImpl]

'getOrPut' @ [204:40] ==> public inline fun <K, V> MutableMap<KtElement, MutableList<KtElement>>.getOrPut(key: KtElement, defaultValue: () -> MutableList<KtElement>): MutableList<KtElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> KtElement
    <V> -> MutableList<KtElement>

'constructorElement' @ [204:49] ==> val constructorElement: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.targetToSourceConstructors.<anonymous>.<no name provided>.processConstructorReference[LocalVariableDescriptor]

'ArrayList' @ [204:84] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> KtElement

'add' @ [204:99] ==> public abstract fun add(element: KtElement): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'callingConstructorElement' @ [204:103] ==> value-parameter callingConstructorElement: KtElement defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.targetToSourceConstructors.<anonymous>.<no name provided>.processConstructorReference[ValueParameterDescriptorImpl]

'specifier' @ [209:50] ==> value-parameter specifier: KtSuperTypeCallEntry defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.targetToSourceConstructors.<anonymous>.<no name provided>.visitSuperTypeCallEntry[ValueParameterDescriptorImpl]

'calleeExpression' @ [209:60] ==> public final val KtSuperTypeCallEntry.calleeExpression: KtConstructorCalleeExpression[MyPropertyDescriptor]

'constructorReferenceExpression' @ [209:77] ==> public final val KtConstructorCalleeExpression.constructorReferenceExpression: KtSimpleNameExpression?[MyPropertyDescriptor]

'specifier' @ [210:51] ==> value-parameter specifier: KtSuperTypeCallEntry defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.targetToSourceConstructors.<anonymous>.<no name provided>.visitSuperTypeCallEntry[ValueParameterDescriptorImpl]

'getStrictParentOfType' @ [210:61] ==> public inline fun <reified T : PsiElement> PsiElement.getStrictParentOfType(): KtClassOrObject? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtClassOrObject

'containingClass' @ [211:61] ==> val containingClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.targetToSourceConstructors.<anonymous>.<no name provided>.visitSuperTypeCallEntry[LocalVariableDescriptor]

'primaryConstructor' @ [211:77] ==> public final val KtClassOrObject.primaryConstructor: KtPrimaryConstructor?[MyPropertyDescriptor]

'containingClass' @ [211:99] ==> val containingClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.targetToSourceConstructors.<anonymous>.<no name provided>.visitSuperTypeCallEntry[LocalVariableDescriptor]

'processConstructorReference' @ [212:29] ==> private final fun processConstructorReference(expression: KtReferenceExpression, callingConstructorElement: KtElement): Unit defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.targetToSourceConstructors.<anonymous>.<no name provided>[SimpleFunctionDescriptorImpl]

'constructorRef' @ [212:57] ==> val constructorRef: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.targetToSourceConstructors.<anonymous>.<no name provided>.visitSuperTypeCallEntry[LocalVariableDescriptor]

'callingConstructorElement' @ [212:73] ==> val callingConstructorElement: KtDeclaration defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.targetToSourceConstructors.<anonymous>.<no name provided>.visitSuperTypeCallEntry[LocalVariableDescriptor]

'constructor' @ [216:50] ==> value-parameter constructor: KtSecondaryConstructor defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.targetToSourceConstructors.<anonymous>.<no name provided>.visitSecondaryConstructor[ValueParameterDescriptorImpl]

'getDelegationCall' @ [216:62] ==> public final fun getDelegationCall(): KtConstructorDelegationCall defined in org.jetbrains.kotlin.psi.KtSecondaryConstructor[DeserializedSimpleFunctionDescriptor]

'calleeExpression' @ [216:82] ==> public final val KtConstructorDelegationCall.calleeExpression: KtConstructorDelegationReferenceExpression?[MyPropertyDescriptor]

'processConstructorReference' @ [217:29] ==> private final fun processConstructorReference(expression: KtReferenceExpression, callingConstructorElement: KtElement): Unit defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.targetToSourceConstructors.<anonymous>.<no name provided>[SimpleFunctionDescriptorImpl]

'constructorRef' @ [217:57] ==> val constructorRef: KtConstructorDelegationReferenceExpression defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.targetToSourceConstructors.<anonymous>.<no name provided>.visitSecondaryConstructor[LocalVariableDescriptor]

'constructor' @ [217:73] ==> value-parameter constructor: KtSecondaryConstructor defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.targetToSourceConstructors.<anonymous>.<no name provided>.visitSecondaryConstructor[ValueParameterDescriptorImpl]

'result' @ [222:9] ==> value-parameter result: LinkedHashMap<KtElement, MutableList<KtElement>> defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.targetToSourceConstructors.<anonymous>[ValueParameterDescriptorImpl]

'LinkedHashMap' @ [225:65] ==> public constructor LinkedHashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.LinkedHashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> KtElement
    <V : (Any..Any?)> -> Map<KtProperty, InitializerInfo>

'let' @ [225:126] ==> @InlineOnly public inline fun <T, R> LinkedHashMap<KtElement, Map<KtProperty, KotlinPullUpHelper.InitializerInfo>>.let(block: (LinkedHashMap<KtElement, Map<KtProperty, KotlinPullUpHelper.InitializerInfo>>) -> LinkedHashMap<KtElement, Map<KtProperty, KotlinPullUpHelper.InitializerInfo>>): LinkedHashMap<KtElement, Map<KtProperty, KotlinPullUpHelper.InitializerInfo>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LinkedHashMap<KtElement, Map<KtProperty, InitializerInfo>>
    <R> -> LinkedHashMap<KtElement, Map<KtProperty, InitializerInfo>>

'targetToSourceConstructors' @ [226:35] ==> private final val targetToSourceConstructors: LinkedHashMap<KtElement, MutableList<KtElement>> defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper[PropertyDescriptorImpl]

'keys' @ [226:62] ==> public open val keys: MutableSet<KtElement> defined in java.util.LinkedHashMap[JavaPropertyDescriptor]

'LinkedHashMap' @ [227:45] ==> public constructor LinkedHashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.LinkedHashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> KtProperty
    <V : (Any..Any?)> -> InitializerInfo

'propertiesToMoveInitializers' @ [228:30] ==> private final val propertiesToMoveInitializers: List<KtProperty> defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper[PropertyDescriptorImpl]

'data' @ [229:42] ==> private final val data: KotlinPullUpData defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper[PropertyDescriptorImpl]

'memberDescriptors' @ [229:47] ==> public final val memberDescriptors: Map<KtNamedDeclaration, DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpData[PropertyDescriptorImpl]

'property' @ [229:65] ==> val property: KtProperty defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.targetConstructorToPropertyInitializerInfoMap.<anonymous>[LocalVariableDescriptor]

'propertyToInitializerInfo' @ [230:17] ==> val propertyToInitializerInfo: LinkedHashMap<KtProperty, KotlinPullUpHelper.InitializerInfo> defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.targetConstructorToPropertyInitializerInfoMap.<anonymous>[LocalVariableDescriptor]

'property' @ [230:43] ==> val property: KtProperty defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.targetConstructorToPropertyInitializerInfoMap.<anonymous>[LocalVariableDescriptor]

'getInitializerInfo' @ [230:55] ==> private final fun getInitializerInfo(property: KtProperty, propertyDescriptor: PropertyDescriptor, targetConstructor: KtElement): KotlinPullUpHelper.InitializerInfo? defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper[SimpleFunctionDescriptorImpl]

'property' @ [230:74] ==> val property: KtProperty defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.targetConstructorToPropertyInitializerInfoMap.<anonymous>[LocalVariableDescriptor]

'propertyDescriptor' @ [230:84] ==> val propertyDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.targetConstructorToPropertyInitializerInfoMap.<anonymous>[LocalVariableDescriptor]

'targetConstructor' @ [230:104] ==> val targetConstructor: KtElement defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.targetConstructorToPropertyInitializerInfoMap.<anonymous>[LocalVariableDescriptor]

'transitiveClosure' @ [232:55] ==> public final fun <T : (Any..Any?)> transitiveClosure(p0: (RefactoringUtil.Graph<(KtProperty..KtProperty?)>..RefactoringUtil.Graph<(KtProperty..KtProperty?)>?), p1: (((KtProperty..KtProperty?)) -> Boolean..(((KtProperty..KtProperty?)) -> Boolean)?)): (MutableSet<(KtProperty..KtProperty?)>..Set<(KtProperty..KtProperty?)>?) defined in com.intellij.refactoring.util.RefactoringUtil[SamAdapterFunctionDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (org.jetbrains.kotlin.psi.KtProperty..org.jetbrains.kotlin.psi.KtProperty?)

'propertyToInitializerInfo' @ [234:54] ==> val propertyToInitializerInfo: LinkedHashMap<KtProperty, KotlinPullUpHelper.InitializerInfo> defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.targetConstructorToPropertyInitializerInfoMap.<anonymous>[LocalVariableDescriptor]

'keys' @ [234:80] ==> public open val keys: MutableSet<KtProperty> defined in java.util.LinkedHashMap[JavaPropertyDescriptor]

'propertyToInitializerInfo' @ [236:71] ==> val propertyToInitializerInfo: LinkedHashMap<KtProperty, KotlinPullUpHelper.InitializerInfo> defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.targetConstructorToPropertyInitializerInfoMap.<anonymous>[LocalVariableDescriptor]

'source' @ [236:97] ==> value-parameter source: KtProperty defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.targetConstructorToPropertyInitializerInfoMap.<anonymous>.<no name provided>.getTargets[ValueParameterDescriptorImpl]

'usedProperties' @ [236:106] ==> public final val usedProperties: Set<KtProperty> defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.InitializerInfo[PropertyDescriptorImpl]

'!' @ [238:23] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'propertyToInitializerInfo' @ [238:24] ==> val propertyToInitializerInfo: LinkedHashMap<KtProperty, KotlinPullUpHelper.InitializerInfo> defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.targetConstructorToPropertyInitializerInfoMap.<anonymous>[LocalVariableDescriptor]

'containsKey' @ [238:50] ==> public open fun containsKey(key: KtProperty): Boolean defined in java.util.LinkedHashMap[JavaMethodDescriptor]

'it' @ [238:62] ==> value-parameter it: (KtProperty..KtProperty?) defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.targetConstructorToPropertyInitializerInfoMap.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'propertyToInitializerInfo' @ [241:13] ==> val propertyToInitializerInfo: LinkedHashMap<KtProperty, KotlinPullUpHelper.InitializerInfo> defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.targetConstructorToPropertyInitializerInfoMap.<anonymous>[LocalVariableDescriptor]

'keys' @ [241:39] ==> public open val keys: MutableSet<KtProperty> defined in java.util.LinkedHashMap[JavaPropertyDescriptor]

'removeAll' @ [241:44] ==> public abstract fun removeAll(elements: Collection<KtProperty>): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'unmovableProperties' @ [241:54] ==> val unmovableProperties: (MutableSet<(KtProperty..KtProperty?)>..Set<(KtProperty..KtProperty?)>?) defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.targetConstructorToPropertyInitializerInfoMap.<anonymous>[LocalVariableDescriptor]

'result' @ [242:13] ==> value-parameter result: LinkedHashMap<KtElement, Map<KtProperty, KotlinPullUpHelper.InitializerInfo>> defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.targetConstructorToPropertyInitializerInfoMap.<anonymous>[ValueParameterDescriptorImpl]

'targetConstructor' @ [242:20] ==> val targetConstructor: KtElement defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.targetConstructorToPropertyInitializerInfoMap.<anonymous>[LocalVariableDescriptor]

'propertyToInitializerInfo' @ [242:41] ==> val propertyToInitializerInfo: LinkedHashMap<KtProperty, KotlinPullUpHelper.InitializerInfo> defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.targetConstructorToPropertyInitializerInfoMap.<anonymous>[LocalVariableDescriptor]

'result' @ [244:9] ==> value-parameter result: LinkedHashMap<KtElement, Map<KtProperty, KotlinPullUpHelper.InitializerInfo>> defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.targetConstructorToPropertyInitializerInfoMap.<anonymous>[ValueParameterDescriptorImpl]

'newMember' @ [250:13] ==> value-parameter newMember: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.addMovedMember[ValueParameterDescriptorImpl]

'dummyField' @ [252:17] ==> private final var dummyField: PsiField? defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper[PropertyDescriptorImpl]

'getElementFactory' @ [253:45] ==> public open fun getElementFactory(@NotNull p0: Project): (PsiElementFactory..PsiElementFactory?) defined in com.intellij.psi.JavaPsiFacade[JavaMethodDescriptor]

'newMember' @ [253:63] ==> value-parameter newMember: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.addMovedMember[ValueParameterDescriptorImpl]

'project' @ [253:73] ==> public final val KtProperty.project: Project[MyPropertyDescriptor]

'LightField' @ [254:42] ==> public constructor LightField(@NotNull p0: PsiManager, @NotNull p1: PsiField, @NotNull p2: PsiClass) defined in com.intellij.psi.impl.light.LightField[JavaClassConstructorDescriptor]

'newMember' @ [255:25] ==> value-parameter newMember: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.addMovedMember[ValueParameterDescriptorImpl]

'manager' @ [255:35] ==> public final val KtProperty.manager: (PsiManagerEx..PsiManagerEx?)[MyPropertyDescriptor]

'factory' @ [256:25] ==> val factory: (PsiElementFactory..PsiElementFactory?) defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.addMovedMember[LocalVariableDescriptor]

'createField' @ [256:33] ==> @NotNull public abstract fun createField(@NotNull @NonNls p0: String, @NotNull p1: PsiType): PsiField defined in com.intellij.psi.PsiElementFactory[JavaMethodDescriptor]

'BOOLEAN' @ [256:62] ==> public final val BOOLEAN: (PsiPrimitiveType..PsiPrimitiveType?) defined in com.intellij.psi.PsiType[JavaPropertyDescriptor]

'factory' @ [257:25] ==> val factory: (PsiElementFactory..PsiElementFactory?) defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.addMovedMember[LocalVariableDescriptor]

'createClass' @ [257:33] ==> @NotNull public abstract fun createClass(@NonNls @NotNull p0: String): PsiClass defined in com.intellij.psi.PsiElementFactory[JavaMethodDescriptor]

'INSTANCE' @ [260:65] ==> @NotNull public final val INSTANCE: KotlinLanguage defined in org.jetbrains.kotlin.idea.KotlinLanguage[JavaPropertyDescriptor]

'javaData' @ [262:17] ==> private final val javaData: PullUpData defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper[PropertyDescriptorImpl]

'movedMembers' @ [262:26] ==> public final val PullUpData.movedMembers: (MutableSet<(PsiMember..PsiMember?)>..Set<(PsiMember..PsiMember?)>?)[MyPropertyDescriptor]

'add' @ [262:39] ==> public abstract fun add(element: (PsiMember..PsiMember?)): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'dummyField' @ [262:43] ==> val dummyField: <no name provided> defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.addMovedMember[LocalVariableDescriptor]

'when (newMember) {
            is KtProperty, is KtNamedFunction -> {
                newMember.getRepresentativeLightMethod()?.let { javaData.movedMembers.add(it) }
            }
            is KtClassOrObject -> {
                newMember.toLightClass()?.let { javaData.movedMembers.add(it) }
            }
        }' @ [266:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean?, entry1: Boolean?): Boolean?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean?

'newMember' @ [266:15] ==> value-parameter newMember: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.addMovedMember[ValueParameterDescriptorImpl]

'newMember' @ [268:17] ==> value-parameter newMember: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.addMovedMember[ValueParameterDescriptorImpl]

'getRepresentativeLightMethod' @ [268:27] ==> public fun PsiElement.getRepresentativeLightMethod(): PsiMethod? defined in org.jetbrains.kotlin.asJava[DeserializedSimpleFunctionDescriptor]

'let' @ [268:59] ==> @InlineOnly public inline fun <T, R> PsiMethod.let(block: (PsiMethod) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiMethod
    <R> -> Boolean

'javaData' @ [268:65] ==> private final val javaData: PullUpData defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper[PropertyDescriptorImpl]

'movedMembers' @ [268:74] ==> public final val PullUpData.movedMembers: (MutableSet<(PsiMember..PsiMember?)>..Set<(PsiMember..PsiMember?)>?)[MyPropertyDescriptor]

'add' @ [268:87] ==> public abstract fun add(element: (PsiMember..PsiMember?)): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'it' @ [268:91] ==> value-parameter it: PsiMethod defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.addMovedMember.<anonymous>[ValueParameterDescriptorImpl]

'newMember' @ [271:17] ==> value-parameter newMember: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.addMovedMember[ValueParameterDescriptorImpl]

'toLightClass' @ [271:27] ==> public fun KtClassOrObject.toLightClass(): KtLightClass? defined in org.jetbrains.kotlin.asJava[DeserializedSimpleFunctionDescriptor]

'let' @ [271:43] ==> @InlineOnly public inline fun <T, R> KtLightClass.let(block: (KtLightClass) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtLightClass
    <R> -> Boolean

'javaData' @ [271:49] ==> private final val javaData: PullUpData defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper[PropertyDescriptorImpl]

'movedMembers' @ [271:58] ==> public final val PullUpData.movedMembers: (MutableSet<(PsiMember..PsiMember?)>..Set<(PsiMember..PsiMember?)>?)[MyPropertyDescriptor]

'add' @ [271:71] ==> public abstract fun add(element: (PsiMember..PsiMember?)): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'it' @ [271:75] ==> value-parameter it: KtLightClass defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.addMovedMember.<anonymous>[ValueParameterDescriptorImpl]

'!' @ [277:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'declaration' @ [277:14] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.liftToProtected[ValueParameterDescriptorImpl]

'hasModifier' @ [277:26] ==> public abstract fun hasModifier(@NotNull p0: KtModifierKeywordToken): Boolean defined in org.jetbrains.kotlin.psi.KtNamedDeclaration[JavaMethodDescriptor]

'PRIVATE_KEYWORD' @ [277:47] ==> public final val PRIVATE_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'ignoreUsages' @ [278:13] ==> value-parameter ignoreUsages: Boolean = ... defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.liftToProtected[ValueParameterDescriptorImpl]

'willBeUsedInSourceClass' @ [278:29] ==> internal fun willBeUsedInSourceClass(member: PsiElement, sourceClass: KtClassOrObject, membersToMove: Collection<KtNamedDeclaration>): Boolean defined in org.jetbrains.kotlin.idea.refactoring.pullUp in file pullUpConflictsUtils.kt[SimpleFunctionDescriptorImpl]

'declaration' @ [278:53] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.liftToProtected[ValueParameterDescriptorImpl]

'data' @ [278:66] ==> private final val data: KotlinPullUpData defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper[PropertyDescriptorImpl]

'sourceClass' @ [278:71] ==> public final val sourceClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpData[PropertyDescriptorImpl]

'data' @ [278:84] ==> private final val data: KotlinPullUpData defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper[PropertyDescriptorImpl]

'membersToMove' @ [278:89] ==> public final val membersToMove: Collection<KtNamedDeclaration> defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpData[PropertyDescriptorImpl]

'declaration' @ [278:105] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.liftToProtected[ValueParameterDescriptorImpl]

'addModifier' @ [278:117] ==> public abstract fun addModifier(@NotNull p0: KtModifierKeywordToken): Unit defined in org.jetbrains.kotlin.psi.KtNamedDeclaration[JavaMethodDescriptor]

'PROTECTED_KEYWORD' @ [278:138] ==> public final val PROTECTED_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'info' @ [282:22] ==> value-parameter info: MemberInfoBase<PsiMember> defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.setCorrectVisibility[ValueParameterDescriptorImpl]

'member' @ [282:27] ==> public final val <T : (PsiElement..PsiElement?)> MemberInfoBase<PsiMember>.member: (PsiMember..PsiMember?)[MyPropertyDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> PsiMember

'namedUnwrappedElement' @ [282:34] ==> public val PsiElement.namedUnwrappedElement: PsiNamedElement? defined in org.jetbrains.kotlin.asJava[DeserializedPropertyDescriptor]

'data' @ [284:13] ==> private final val data: KotlinPullUpData defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper[PropertyDescriptorImpl]

'isInterfaceTarget' @ [284:18] ==> public final val isInterfaceTarget: Boolean defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpData[PropertyDescriptorImpl]

'member' @ [285:13] ==> val member: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.setCorrectVisibility[LocalVariableDescriptor]

'removeModifier' @ [285:20] ==> public abstract fun removeModifier(@NotNull p0: KtModifierKeywordToken): Unit defined in org.jetbrains.kotlin.psi.KtNamedDeclaration[JavaMethodDescriptor]

'PUBLIC_KEYWORD' @ [285:44] ==> public final val PUBLIC_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'member' @ [289:13] ==> val member: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.setCorrectVisibility[LocalVariableDescriptor]

'hasModifier' @ [289:20] ==> public abstract fun hasModifier(@NotNull p0: KtModifierKeywordToken): Boolean defined in org.jetbrains.kotlin.psi.KtNamedDeclaration[JavaMethodDescriptor]

'PRIVATE_KEYWORD' @ [289:41] ==> public final val PRIVATE_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'member' @ [290:13] ==> val member: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.setCorrectVisibility[LocalVariableDescriptor]

'accept' @ [290:20] ==> public abstract fun accept(@NotNull p0: PsiElementVisitor): Unit defined in org.jetbrains.kotlin.psi.KtNamedDeclaration[JavaMethodDescriptor]

'KtVisitorVoid' @ [291:29] ==> public constructor KtVisitorVoid() defined in org.jetbrains.kotlin.psi.KtVisitorVoid[JavaClassConstructorDescriptor]

'when (declaration) {
                                is KtClass -> {
                                    liftToProtected(declaration)
                                    declaration.declarations.forEach { it.accept(this) }
                                }
                                is KtNamedFunction, is KtProperty -> {
                                    liftToProtected(declaration, declaration == member && info.isToAbstract)
                                }
                            }' @ [293:29] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'declaration' @ [293:35] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.setCorrectVisibility.<no name provided>.visitNamedDeclaration[ValueParameterDescriptorImpl]

'liftToProtected' @ [295:37] ==> private final fun liftToProtected(declaration: KtNamedDeclaration, ignoreUsages: Boolean = ...): Unit defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper[SimpleFunctionDescriptorImpl]

'declaration' @ [295:53] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.setCorrectVisibility.<no name provided>.visitNamedDeclaration[ValueParameterDescriptorImpl]

'declaration' @ [296:37] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.setCorrectVisibility.<no name provided>.visitNamedDeclaration[ValueParameterDescriptorImpl]

'declarations' @ [296:49] ==> public final val KtClass.declarations: List<KtDeclaration>[MyPropertyDescriptor]

'forEach' @ [296:62] ==> @HidesMembers public inline fun <T> Iterable<KtDeclaration>.forEach(action: (KtDeclaration) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtDeclaration

'it' @ [296:72] ==> value-parameter it: KtDeclaration defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.setCorrectVisibility.<no name provided>.visitNamedDeclaration.<anonymous>[ValueParameterDescriptorImpl]

'accept' @ [296:75] ==> public abstract fun accept(@NotNull p0: PsiElementVisitor): Unit defined in org.jetbrains.kotlin.psi.KtDeclaration[JavaMethodDescriptor]

'this' @ [296:82] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.setCorrectVisibility.<no name provided>[LazyClassReceiverParameterDescriptor]

'liftToProtected' @ [299:37] ==> private final fun liftToProtected(declaration: KtNamedDeclaration, ignoreUsages: Boolean = ...): Unit defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper[SimpleFunctionDescriptorImpl]

'declaration' @ [299:53] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.setCorrectVisibility.<no name provided>.visitNamedDeclaration[ValueParameterDescriptorImpl]

'declaration' @ [299:66] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.setCorrectVisibility.<no name provided>.visitNamedDeclaration[ValueParameterDescriptorImpl]

'member' @ [299:81] ==> val member: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.setCorrectVisibility[LocalVariableDescriptor]

'info' @ [299:91] ==> value-parameter info: MemberInfoBase<PsiMember> defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.setCorrectVisibility[ValueParameterDescriptorImpl]

'isToAbstract' @ [299:96] ==> public final var <T : (PsiElement..PsiElement?)> MemberInfoBase<PsiMember>.isToAbstract: Boolean[MyPropertyDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> PsiMember

'data' @ [314:32] ==> private final val data: KotlinPullUpData defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper[PropertyDescriptorImpl]

'memberDescriptors' @ [314:37] ==> public final val memberDescriptors: Map<KtNamedDeclaration, DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpData[PropertyDescriptorImpl]

'sourceMember' @ [314:55] ==> value-parameter sourceMember: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.fixOverrideAndGetClashingSuper[ValueParameterDescriptorImpl]

'memberDescriptor' @ [316:13] ==> val memberDescriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.fixOverrideAndGetClashingSuper[LocalVariableDescriptor]

'overriddenDescriptors' @ [316:30] ==> public final var CallableMemberDescriptor.overriddenDescriptors: (MutableCollection<out (CallableMemberDescriptor..CallableMemberDescriptor?)>..Collection<(CallableMemberDescriptor..CallableMemberDescriptor?)>)[MyPropertyDescriptor]

'isEmpty' @ [316:52] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.MutableCollection[DeserializedSimpleFunctionDescriptor]

'targetMember' @ [317:13] ==> value-parameter targetMember: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.fixOverrideAndGetClashingSuper[ValueParameterDescriptorImpl]

'removeOverrideModifier' @ [317:26] ==> public fun PsiElement.removeOverrideModifier(): Unit defined in org.jetbrains.kotlin.idea.refactoring.safeDelete in file utils.kt[SimpleFunctionDescriptorImpl]

'data' @ [321:39] ==> private final val data: KotlinPullUpData defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper[PropertyDescriptorImpl]

'getClashingMemberInTargetClass' @ [321:44] ==> internal fun KotlinPullUpData.getClashingMemberInTargetClass(memberDescriptor: CallableMemberDescriptor): CallableMemberDescriptor? defined in org.jetbrains.kotlin.idea.refactoring.pullUp in file pullUpConflictsUtils.kt[SimpleFunctionDescriptorImpl]

'memberDescriptor' @ [321:75] ==> val memberDescriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.fixOverrideAndGetClashingSuper[LocalVariableDescriptor]

'clashingSuperDescriptor' @ [322:13] ==> val clashingSuperDescriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.fixOverrideAndGetClashingSuper[LocalVariableDescriptor]

'overriddenDescriptors' @ [322:37] ==> public final var CallableMemberDescriptor.overriddenDescriptors: (MutableCollection<out (CallableMemberDescriptor..CallableMemberDescriptor?)>..Collection<(CallableMemberDescriptor..CallableMemberDescriptor?)>)[MyPropertyDescriptor]

'isEmpty' @ [322:59] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.MutableCollection[DeserializedSimpleFunctionDescriptor]

'targetMember' @ [323:13] ==> value-parameter targetMember: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.fixOverrideAndGetClashingSuper[ValueParameterDescriptorImpl]

'removeOverrideModifier' @ [323:26] ==> public fun PsiElement.removeOverrideModifier(): Unit defined in org.jetbrains.kotlin.idea.refactoring.safeDelete in file utils.kt[SimpleFunctionDescriptorImpl]

'clashingSuperDescriptor' @ [325:16] ==> val clashingSuperDescriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.fixOverrideAndGetClashingSuper[LocalVariableDescriptor]

'source' @ [325:40] ==> public final val CallableMemberDescriptor.source: SourceElement[MyPropertyDescriptor]

'getPsi' @ [325:47] ==> public fun SourceElement.getPsi(): PsiElement? defined in org.jetbrains.kotlin.resolve.source[DeserializedSimpleFunctionDescriptor]

'?:' @ [329:29] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: PsiNamedElement?, right: PsiNamedElement): PsiNamedElement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> PsiNamedElement

'member' @ [329:30] ==> value-parameter member: PsiNamedElement defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.moveSuperInterface[ValueParameterDescriptorImpl]

'psiClass' @ [329:61] ==> public abstract val psiClass: PsiClass defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.KtPsiClassWrapper[PropertyDescriptorImpl]

'member' @ [329:73] ==> value-parameter member: PsiNamedElement defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.moveSuperInterface[ValueParameterDescriptorImpl]

'data' @ [330:31] ==> private final val data: KotlinPullUpData defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper[PropertyDescriptorImpl]

'memberDescriptors' @ [330:36] ==> public final val memberDescriptors: Map<KtNamedDeclaration, DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpData[PropertyDescriptorImpl]

'member' @ [330:54] ==> value-parameter member: PsiNamedElement defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.moveSuperInterface[ValueParameterDescriptorImpl]

'data' @ [331:32] ==> private final val data: KotlinPullUpData defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper[PropertyDescriptorImpl]

'sourceClass' @ [331:37] ==> public final val sourceClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpData[PropertyDescriptorImpl]

'getSuperTypeEntryByDescriptor' @ [331:49] ==> public fun KtClassOrObject.getSuperTypeEntryByDescriptor(descriptor: ClassDescriptor, context: BindingContext): KtSuperTypeListEntry? defined in org.jetbrains.kotlin.idea.refactoring.pullUp in file pullUpUtils.kt[SimpleFunctionDescriptorImpl]

'classDescriptor' @ [331:79] ==> val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.moveSuperInterface[LocalVariableDescriptor]

'data' @ [331:96] ==> private final val data: KotlinPullUpData defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper[PropertyDescriptorImpl]

'sourceClassContext' @ [331:101] ==> public final val sourceClassContext: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpData[PropertyDescriptorImpl]

'when (data.targetClass) {
            is KtClass -> {
                data.sourceClass.removeSuperTypeListEntry(currentSpecifier)
                addSuperTypeEntry(currentSpecifier, data.targetClass, data.targetClassDescriptor, data.sourceClassContext, data.sourceToTargetClassSubstitutor)
            }

            is PsiClass -> {
                val elementFactory = JavaPsiFacade.getElementFactory(member.project)

                val sourcePsiClass = data.sourceClass.toLightClass() ?: return
                val superRef = sourcePsiClass.implementsList
                                       ?.referenceElements
                                       ?.firstOrNull { it.resolve()?.unwrapped == realMemberPsi }
                                ?: return
                val superTypeForTarget = substitutor.substitute(elementFactory.createType(superRef))

                data.sourceClass.removeSuperTypeListEntry(currentSpecifier)

                if (DescriptorUtils.isSubclass(data.targetClassDescriptor, classDescriptor)) return

                val refList = if (data.isInterfaceTarget) data.targetClass.extendsList else data.targetClass.implementsList
                refList?.add(elementFactory.createReferenceFromText(superTypeForTarget.canonicalText, null))
            }
        }' @ [332:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Any?, entry1: Any?): Any?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Any?

'data' @ [332:15] ==> private final val data: KotlinPullUpData defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper[PropertyDescriptorImpl]

'targetClass' @ [332:20] ==> public final val targetClass: PsiNamedElement defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpData[PropertyDescriptorImpl]

'data' @ [334:17] ==> private final val data: KotlinPullUpData defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper[PropertyDescriptorImpl]

'sourceClass' @ [334:22] ==> public final val sourceClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpData[PropertyDescriptorImpl]

'removeSuperTypeListEntry' @ [334:34] ==> public final fun removeSuperTypeListEntry(superTypeListEntry: KtSuperTypeListEntry): Unit defined in org.jetbrains.kotlin.psi.KtClassOrObject[DeserializedSimpleFunctionDescriptor]

'currentSpecifier' @ [334:59] ==> val currentSpecifier: KtSuperTypeListEntry defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.moveSuperInterface[LocalVariableDescriptor]

'addSuperTypeEntry' @ [335:17] ==> public fun addSuperTypeEntry(delegator: KtSuperTypeListEntry, targetClass: KtClassOrObject, targetClassDescriptor: ClassDescriptor, context: BindingContext, substitutor: TypeSubstitutor): Unit defined in org.jetbrains.kotlin.idea.refactoring.pullUp in file pullUpUtils.kt[SimpleFunctionDescriptorImpl]

'currentSpecifier' @ [335:35] ==> val currentSpecifier: KtSuperTypeListEntry defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.moveSuperInterface[LocalVariableDescriptor]

'data' @ [335:53] ==> private final val data: KotlinPullUpData defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper[PropertyDescriptorImpl]

'targetClass' @ [335:58] ==> public final val targetClass: PsiNamedElement defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpData[PropertyDescriptorImpl]

'data' @ [335:71] ==> private final val data: KotlinPullUpData defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper[PropertyDescriptorImpl]

'targetClassDescriptor' @ [335:76] ==> public final val targetClassDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpData[PropertyDescriptorImpl]

'data' @ [335:99] ==> private final val data: KotlinPullUpData defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper[PropertyDescriptorImpl]

'sourceClassContext' @ [335:104] ==> public final val sourceClassContext: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpData[PropertyDescriptorImpl]

'data' @ [335:124] ==> private final val data: KotlinPullUpData defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper[PropertyDescriptorImpl]

'sourceToTargetClassSubstitutor' @ [335:129] ==> public final val sourceToTargetClassSubstitutor: TypeSubstitutor defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpData[PropertyDescriptorImpl]

'getElementFactory' @ [339:52] ==> public open fun getElementFactory(@NotNull p0: Project): (PsiElementFactory..PsiElementFactory?) defined in com.intellij.psi.JavaPsiFacade[JavaMethodDescriptor]

'member' @ [339:70] ==> value-parameter member: PsiNamedElement defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.moveSuperInterface[ValueParameterDescriptorImpl]

'project' @ [339:77] ==> public final val PsiNamedElement.project: Project[MyPropertyDescriptor]

'data' @ [341:38] ==> private final val data: KotlinPullUpData defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper[PropertyDescriptorImpl]

'sourceClass' @ [341:43] ==> public final val sourceClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpData[PropertyDescriptorImpl]

'toLightClass' @ [341:55] ==> public fun KtClassOrObject.toLightClass(): KtLightClass? defined in org.jetbrains.kotlin.asJava[DeserializedSimpleFunctionDescriptor]

'sourcePsiClass' @ [342:32] ==> val sourcePsiClass: KtLightClass defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.moveSuperInterface[LocalVariableDescriptor]

'implementsList' @ [342:47] ==> public final val KtLightClass.implementsList: PsiReferenceList?[MyPropertyDescriptor]

'referenceElements' @ [343:42] ==> public final val PsiReferenceList.referenceElements: (Array<(PsiJavaCodeReferenceElement..PsiJavaCodeReferenceElement?)>..Array<out (PsiJavaCodeReferenceElement..PsiJavaCodeReferenceElement?)>)[MyPropertyDescriptor]

'firstOrNull' @ [344:42] ==> public inline fun <T> Array<out (PsiJavaCodeReferenceElement..PsiJavaCodeReferenceElement?)>.firstOrNull(predicate: ((PsiJavaCodeReferenceElement..PsiJavaCodeReferenceElement?)) -> Boolean): PsiJavaCodeReferenceElement? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiJavaCodeReferenceElement..com.intellij.psi.PsiJavaCodeReferenceElement?)

'it' @ [344:56] ==> value-parameter it: (PsiJavaCodeReferenceElement..PsiJavaCodeReferenceElement?) defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.moveSuperInterface.<anonymous>[ValueParameterDescriptorImpl]

'resolve' @ [344:59] ==> @Nullable public abstract fun resolve(): PsiElement? defined in com.intellij.psi.PsiJavaCodeReferenceElement[JavaMethodDescriptor]

'unwrapped' @ [344:70] ==> public val PsiElement.unwrapped: PsiElement? defined in org.jetbrains.kotlin.asJava[DeserializedPropertyDescriptor]

'realMemberPsi' @ [344:83] ==> val realMemberPsi: PsiNamedElement defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.moveSuperInterface[LocalVariableDescriptor]

'substitutor' @ [346:42] ==> value-parameter substitutor: PsiSubstitutor defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.moveSuperInterface[ValueParameterDescriptorImpl]

'substitute' @ [346:54] ==> public abstract fun substitute(@Nullable p0: PsiType?): (PsiType..PsiType?) defined in com.intellij.psi.PsiSubstitutor[JavaMethodDescriptor]

'elementFactory' @ [346:65] ==> val elementFactory: (PsiElementFactory..PsiElementFactory?) defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.moveSuperInterface[LocalVariableDescriptor]

'createType' @ [346:80] ==> @NotNull public abstract fun createType(@NotNull p0: PsiJavaCodeReferenceElement): PsiClassType defined in com.intellij.psi.PsiElementFactory[JavaMethodDescriptor]

'superRef' @ [346:91] ==> val superRef: PsiJavaCodeReferenceElement defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.moveSuperInterface[LocalVariableDescriptor]

'data' @ [348:17] ==> private final val data: KotlinPullUpData defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper[PropertyDescriptorImpl]

'sourceClass' @ [348:22] ==> public final val sourceClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpData[PropertyDescriptorImpl]

'removeSuperTypeListEntry' @ [348:34] ==> public final fun removeSuperTypeListEntry(superTypeListEntry: KtSuperTypeListEntry): Unit defined in org.jetbrains.kotlin.psi.KtClassOrObject[DeserializedSimpleFunctionDescriptor]

'currentSpecifier' @ [348:59] ==> val currentSpecifier: KtSuperTypeListEntry defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.moveSuperInterface[LocalVariableDescriptor]

'isSubclass' @ [350:37] ==> public open fun isSubclass(@NotNull p0: ClassDescriptor, @NotNull p1: ClassDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'data' @ [350:48] ==> private final val data: KotlinPullUpData defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper[PropertyDescriptorImpl]

'targetClassDescriptor' @ [350:53] ==> public final val targetClassDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpData[PropertyDescriptorImpl]

'classDescriptor' @ [350:76] ==> val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.moveSuperInterface[LocalVariableDescriptor]

'if (data.isInterfaceTarget) data.targetClass.extendsList else data.targetClass.implementsList' @ [352:31] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: PsiReferenceList?, elseBranch: PsiReferenceList?): PsiReferenceList?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> PsiReferenceList?

'data' @ [352:35] ==> private final val data: KotlinPullUpData defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper[PropertyDescriptorImpl]

'isInterfaceTarget' @ [352:40] ==> public final val isInterfaceTarget: Boolean defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpData[PropertyDescriptorImpl]

'data' @ [352:59] ==> private final val data: KotlinPullUpData defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper[PropertyDescriptorImpl]

'targetClass' @ [352:64] ==> public final val targetClass: PsiNamedElement defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpData[PropertyDescriptorImpl]

'extendsList' @ [352:76] ==> public final val PsiClass.extendsList: PsiReferenceList?[MyPropertyDescriptor]

'data' @ [352:93] ==> private final val data: KotlinPullUpData defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper[PropertyDescriptorImpl]

'targetClass' @ [352:98] ==> public final val targetClass: PsiNamedElement defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpData[PropertyDescriptorImpl]

'implementsList' @ [352:110] ==> public final val PsiClass.implementsList: PsiReferenceList?[MyPropertyDescriptor]

'refList' @ [353:17] ==> val refList: PsiReferenceList? defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.moveSuperInterface[LocalVariableDescriptor]

'add' @ [353:26] ==> public abstract fun add(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in com.intellij.psi.PsiReferenceList[JavaMethodDescriptor]

'elementFactory' @ [353:30] ==> val elementFactory: (PsiElementFactory..PsiElementFactory?) defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.moveSuperInterface[LocalVariableDescriptor]

'createReferenceFromText' @ [353:45] ==> @NotNull public abstract fun createReferenceFromText(@NotNull @NonNls p0: String, @Nullable p1: PsiElement?): PsiJavaCodeReferenceElement defined in com.intellij.psi.PsiElementFactory[JavaMethodDescriptor]

'superTypeForTarget' @ [353:69] ==> val superTypeForTarget: (PsiType..PsiType?) defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.moveSuperInterface[LocalVariableDescriptor]

'canonicalText' @ [353:88] ==> public final val PsiType.canonicalText: String[MyPropertyDescriptor]

'if (member.isAbstract()) {
            member.delete()
        }
        else {
            member.addModifier(KtTokens.OVERRIDE_KEYWORD)
            KtTokens.VISIBILITY_MODIFIERS.types.forEach { member.removeModifier(it as KtModifierKeywordToken) }
            (member as? KtNamedFunction)?.valueParameters?.forEach { it.dropDefaultValue() }
        }' @ [361:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit?, elseBranch: Unit?): Unit?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit?

'member' @ [361:13] ==> value-parameter member: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.removeOriginalMemberOrAddOverride[ValueParameterDescriptorImpl]

'isAbstract' @ [361:20] ==> public fun KtNamedDeclaration.isAbstract(): Boolean defined in org.jetbrains.kotlin.idea.refactoring in file kotlinRefactoringUtil.kt[SimpleFunctionDescriptorImpl]

'member' @ [362:13] ==> value-parameter member: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.removeOriginalMemberOrAddOverride[ValueParameterDescriptorImpl]

'delete' @ [362:20] ==> public abstract fun delete(): Unit defined in org.jetbrains.kotlin.psi.KtCallableDeclaration[JavaMethodDescriptor]

'member' @ [365:13] ==> value-parameter member: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.removeOriginalMemberOrAddOverride[ValueParameterDescriptorImpl]

'addModifier' @ [365:20] ==> public abstract fun addModifier(@NotNull p0: KtModifierKeywordToken): Unit defined in org.jetbrains.kotlin.psi.KtCallableDeclaration[JavaMethodDescriptor]

'OVERRIDE_KEYWORD' @ [365:41] ==> public final val OVERRIDE_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'VISIBILITY_MODIFIERS' @ [366:22] ==> public final val VISIBILITY_MODIFIERS: (TokenSet..TokenSet?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'types' @ [366:43] ==> public final val TokenSet.types: (Array<(IElementType..IElementType?)>..Array<out (IElementType..IElementType?)>)[MyPropertyDescriptor]

'forEach' @ [366:49] ==> public inline fun <T> Array<out (IElementType..IElementType?)>.forEach(action: ((IElementType..IElementType?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.tree.IElementType..com.intellij.psi.tree.IElementType?)

'member' @ [366:59] ==> value-parameter member: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.removeOriginalMemberOrAddOverride[ValueParameterDescriptorImpl]

'removeModifier' @ [366:66] ==> public abstract fun removeModifier(@NotNull p0: KtModifierKeywordToken): Unit defined in org.jetbrains.kotlin.psi.KtCallableDeclaration[JavaMethodDescriptor]

'it' @ [366:81] ==> value-parameter it: (IElementType..IElementType?) defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.removeOriginalMemberOrAddOverride.<anonymous>[ValueParameterDescriptorImpl]

'member' @ [367:14] ==> value-parameter member: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.removeOriginalMemberOrAddOverride[ValueParameterDescriptorImpl]

'valueParameters' @ [367:43] ==> public final val KtNamedFunction.valueParameters: (MutableList<(KtParameter..KtParameter?)>..List<(KtParameter..KtParameter?)>)[MyPropertyDescriptor]

'forEach' @ [367:60] ==> @HidesMembers public inline fun <T> Iterable<(KtParameter..KtParameter?)>.forEach(action: ((KtParameter..KtParameter?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtParameter..org.jetbrains.kotlin.psi.KtParameter?)

'it' @ [367:70] ==> value-parameter it: (KtParameter..KtParameter?) defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.removeOriginalMemberOrAddOverride.<anonymous>[ValueParameterDescriptorImpl]

'dropDefaultValue' @ [367:73] ==> public fun KtParameter.dropDefaultValue(): Unit defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'!' @ [372:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'data' @ [372:15] ==> private final val data: KotlinPullUpData defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper[PropertyDescriptorImpl]

'targetClass' @ [372:20] ==> public final val targetClass: PsiNamedElement defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpData[PropertyDescriptorImpl]

'member' @ [372:47] ==> value-parameter member: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.moveToJavaClass[ValueParameterDescriptorImpl]

'canMoveMemberToJavaClass' @ [372:54] ==> public fun KtNamedDeclaration.canMoveMemberToJavaClass(targetClass: PsiClass): Boolean defined in org.jetbrains.kotlin.idea.refactoring.pullUp in file pullUpUtils.kt[SimpleFunctionDescriptorImpl]

'data' @ [372:79] ==> private final val data: KotlinPullUpData defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper[PropertyDescriptorImpl]

'targetClass' @ [372:84] ==> public final val targetClass: PsiNamedElement defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpData[PropertyDescriptorImpl]

'member' @ [375:13] ==> value-parameter member: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.moveToJavaClass[ValueParameterDescriptorImpl]

'member' @ [375:48] ==> value-parameter member: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.moveToJavaClass[ValueParameterDescriptorImpl]

'typeReference' @ [375:55] ==> public final var KtCallableDeclaration.typeReference: KtTypeReference?[MyPropertyDescriptor]

'data' @ [376:31] ==> private final val data: KotlinPullUpData defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper[PropertyDescriptorImpl]

'memberDescriptors' @ [376:36] ==> public final val memberDescriptors: Map<KtNamedDeclaration, DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpData[PropertyDescriptorImpl]

'member' @ [376:54] ==> value-parameter member: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.moveToJavaClass[ValueParameterDescriptorImpl]

'returnType' @ [376:85] ==> public final val CallableDescriptor.returnType: KotlinType?[MyPropertyDescriptor]

'returnType' @ [377:13] ==> val returnType: KotlinType? defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.moveToJavaClass[LocalVariableDescriptor]

'anonymousObjectSuperTypeOrNull' @ [377:25] ==> public fun KotlinType.anonymousObjectSuperTypeOrNull(): KotlinType? defined in org.jetbrains.kotlin.idea.util[DeserializedSimpleFunctionDescriptor]

'let' @ [377:59] ==> @InlineOnly public inline fun <T, R> KotlinType.let(block: (KotlinType) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType
    <R> -> Unit

'member' @ [377:65] ==> value-parameter member: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.moveToJavaClass[ValueParameterDescriptorImpl]

'setType' @ [377:72] ==> public fun KtCallableDeclaration.setType(type: KotlinType, shortenReferences: Boolean = ...): Unit defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'it' @ [377:80] ==> value-parameter it: KotlinType defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.moveToJavaClass.<anonymous>[ValueParameterDescriptorImpl]

'member' @ [380:23] ==> value-parameter member: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.moveToJavaClass[ValueParameterDescriptorImpl]

'project' @ [380:30] ==> public final val KtNamedDeclaration.project: Project[MyPropertyDescriptor]

'getElementFactory' @ [381:44] ==> public open fun getElementFactory(@NotNull p0: Project): (PsiElementFactory..PsiElementFactory?) defined in com.intellij.psi.JavaPsiFacade[JavaMethodDescriptor]

'project' @ [381:62] ==> val project: Project defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.moveToJavaClass[LocalVariableDescriptor]

'member' @ [382:27] ==> value-parameter member: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.moveToJavaClass[ValueParameterDescriptorImpl]

'getRepresentativeLightMethod' @ [382:34] ==> public fun PsiElement.getRepresentativeLightMethod(): PsiMethod? defined in org.jetbrains.kotlin.asJava[DeserializedSimpleFunctionDescriptor]

'when (member) {
            is KtProperty, is KtParameter -> {
                val newType = substitutor.substitute(lightMethod.returnType)
                val newField = createJavaField(member, data.targetClass)
                newField.typeElement?.replace(elementFactory.createTypeElement(newType))
                if (member.isCompanionMemberOf(data.sourceClass)) {
                    newField.modifierList?.setModifierProperty(PsiModifier.STATIC, true)
                }
                if (member is KtParameter) {
                    (member.parent as? KtParameterList)?.removeParameter(member)
                }
                else {
                    member.delete()
                }
                newField
            }
            is KtNamedFunction -> {
                val newReturnType = substitutor.substitute(lightMethod.returnType)
                val newParameterTypes = lightMethod.parameterList.parameters.map { substitutor.substitute(it.type) }
                val objectType = PsiType.getJavaLangObject(PsiManager.getInstance(project), GlobalSearchScope.allScope(project))
                val newTypeParameterBounds = lightMethod.typeParameters.map {
                    it.superTypes.map { substitutor.substitute(it) as? PsiClassType ?: objectType }
                }
                val newMethod = org.jetbrains.kotlin.idea.refactoring.createJavaMethod(member, data.targetClass)
                RefactoringUtil.makeMethodAbstract(data.targetClass, newMethod)
                newMethod.returnTypeElement?.replace(elementFactory.createTypeElement(newReturnType))
                newMethod.parameterList.parameters.forEachIndexed { i, parameter ->
                    parameter.typeElement?.replace(elementFactory.createTypeElement(newParameterTypes[i]))
                }
                newMethod.typeParameters.forEachIndexed { i, typeParameter ->
                    typeParameter.extendsList.referenceElements.forEachIndexed { j, referenceElement ->
                        referenceElement.replace(elementFactory.createReferenceElementByType(newTypeParameterBounds[i][j]))
                    }
                }
                removeOriginalMemberOrAddOverride(member)
                if (!data.isInterfaceTarget && !data.targetClass.hasModifierProperty(PsiModifier.ABSTRACT)) {
                    data.targetClass.modifierList?.setModifierProperty(PsiModifier.ABSTRACT, true)
                }
                newMethod
            }
            else -> return
        }' @ [384:38] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: PsiMember, entry1: PsiMember, entry2: PsiMember): PsiMember[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> PsiMember

'member' @ [384:44] ==> value-parameter member: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.moveToJavaClass[ValueParameterDescriptorImpl]

'substitutor' @ [386:31] ==> value-parameter substitutor: PsiSubstitutor defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.moveToJavaClass[ValueParameterDescriptorImpl]

'substitute' @ [386:43] ==> public abstract fun substitute(@Nullable p0: PsiType?): (PsiType..PsiType?) defined in com.intellij.psi.PsiSubstitutor[JavaMethodDescriptor]

'lightMethod' @ [386:54] ==> val lightMethod: PsiMethod defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.moveToJavaClass[LocalVariableDescriptor]

'returnType' @ [386:66] ==> public final val PsiMethod.returnType: PsiType?[MyPropertyDescriptor]

'createJavaField' @ [387:32] ==> public fun createJavaField(property: KtNamedDeclaration, targetClass: PsiClass): PsiField defined in org.jetbrains.kotlin.idea.refactoring in file kotlinRefactoringUtil.kt[SimpleFunctionDescriptorImpl]

'member' @ [387:48] ==> value-parameter member: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.moveToJavaClass[ValueParameterDescriptorImpl]

'data' @ [387:56] ==> private final val data: KotlinPullUpData defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper[PropertyDescriptorImpl]

'targetClass' @ [387:61] ==> public final val targetClass: PsiNamedElement defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpData[PropertyDescriptorImpl]

'newField' @ [388:17] ==> val newField: PsiField defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.moveToJavaClass[LocalVariableDescriptor]

'typeElement' @ [388:26] ==> public final val PsiField.typeElement: PsiTypeElement?[MyPropertyDescriptor]

'replace' @ [388:39] ==> public abstract fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in com.intellij.psi.PsiTypeElement[JavaMethodDescriptor]

'elementFactory' @ [388:47] ==> val elementFactory: (PsiElementFactory..PsiElementFactory?) defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.moveToJavaClass[LocalVariableDescriptor]

'createTypeElement' @ [388:62] ==> @NotNull public abstract fun createTypeElement(@NotNull p0: PsiType): PsiTypeElement defined in com.intellij.psi.PsiElementFactory[JavaMethodDescriptor]

'newType' @ [388:80] ==> val newType: (PsiType..PsiType?) defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.moveToJavaClass[LocalVariableDescriptor]

'member' @ [389:21] ==> value-parameter member: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.moveToJavaClass[ValueParameterDescriptorImpl]

'isCompanionMemberOf' @ [389:28] ==> public fun KtNamedDeclaration.isCompanionMemberOf(klass: KtClassOrObject): Boolean defined in org.jetbrains.kotlin.idea.refactoring in file kotlinRefactoringUtil.kt[SimpleFunctionDescriptorImpl]

'data' @ [389:48] ==> private final val data: KotlinPullUpData defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper[PropertyDescriptorImpl]

'sourceClass' @ [389:53] ==> public final val sourceClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpData[PropertyDescriptorImpl]

'newField' @ [390:21] ==> val newField: PsiField defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.moveToJavaClass[LocalVariableDescriptor]

'modifierList' @ [390:30] ==> public final val PsiField.modifierList: PsiModifierList?[MyPropertyDescriptor]

'setModifierProperty' @ [390:44] ==> public abstract fun setModifierProperty(@PsiModifier.ModifierConstant @NotNull @NonNls p0: String, p1: Boolean): Unit defined in com.intellij.psi.PsiModifierList[JavaMethodDescriptor]

'STATIC' @ [390:76] ==> public const final val STATIC: String defined in com.intellij.psi.PsiModifier[JavaPropertyDescriptor]

'if (member is KtParameter) {
                    (member.parent as? KtParameterList)?.removeParameter(member)
                }
                else {
                    member.delete()
                }' @ [392:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit?, elseBranch: Unit?): Unit?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit?

'member' @ [392:21] ==> value-parameter member: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.moveToJavaClass[ValueParameterDescriptorImpl]

'member' @ [393:22] ==> value-parameter member: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.moveToJavaClass[ValueParameterDescriptorImpl]

'parent' @ [393:29] ==> public final val KtParameter.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'removeParameter' @ [393:58] ==> public open fun removeParameter(@NotNull p0: KtParameter): Unit defined in org.jetbrains.kotlin.psi.KtParameterList[JavaMethodDescriptor]

'member' @ [393:74] ==> value-parameter member: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.moveToJavaClass[ValueParameterDescriptorImpl]

'member' @ [396:21] ==> value-parameter member: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.moveToJavaClass[ValueParameterDescriptorImpl]

'delete' @ [396:28] ==> public abstract fun delete(): Unit defined in org.jetbrains.kotlin.psi.KtNamedDeclaration[JavaMethodDescriptor]

'newField' @ [398:17] ==> val newField: PsiField defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.moveToJavaClass[LocalVariableDescriptor]

'substitutor' @ [401:37] ==> value-parameter substitutor: PsiSubstitutor defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.moveToJavaClass[ValueParameterDescriptorImpl]

'substitute' @ [401:49] ==> public abstract fun substitute(@Nullable p0: PsiType?): (PsiType..PsiType?) defined in com.intellij.psi.PsiSubstitutor[JavaMethodDescriptor]

'lightMethod' @ [401:60] ==> val lightMethod: PsiMethod defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.moveToJavaClass[LocalVariableDescriptor]

'returnType' @ [401:72] ==> public final val PsiMethod.returnType: PsiType?[MyPropertyDescriptor]

'lightMethod' @ [402:41] ==> val lightMethod: PsiMethod defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.moveToJavaClass[LocalVariableDescriptor]

'parameterList' @ [402:53] ==> public final val PsiMethod.parameterList: PsiParameterList[MyPropertyDescriptor]

'parameters' @ [402:67] ==> public final val PsiParameterList.parameters: (Array<(PsiParameter..PsiParameter?)>..Array<out (PsiParameter..PsiParameter?)>)[MyPropertyDescriptor]

'map' @ [402:78] ==> public inline fun <T, R> Array<out (PsiParameter..PsiParameter?)>.map(transform: ((PsiParameter..PsiParameter?)) -> (PsiType..PsiType?)): List<(PsiType..PsiType?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiParameter..com.intellij.psi.PsiParameter?)
    <R> -> (com.intellij.psi.PsiType..com.intellij.psi.PsiType?)

'substitutor' @ [402:84] ==> value-parameter substitutor: PsiSubstitutor defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.moveToJavaClass[ValueParameterDescriptorImpl]

'substitute' @ [402:96] ==> public abstract fun substitute(@Nullable p0: PsiType?): (PsiType..PsiType?) defined in com.intellij.psi.PsiSubstitutor[JavaMethodDescriptor]

'it' @ [402:107] ==> value-parameter it: (PsiParameter..PsiParameter?) defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.moveToJavaClass.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [402:110] ==> public final val PsiParameter.type: PsiType[MyPropertyDescriptor]

'getJavaLangObject' @ [403:42] ==> @NotNull public open fun getJavaLangObject(@NotNull p0: PsiManager, @NotNull p1: GlobalSearchScope): PsiClassType defined in com.intellij.psi.PsiType[JavaMethodDescriptor]

'getInstance' @ [403:71] ==> @NotNull public open fun getInstance(@NotNull p0: Project): PsiManager defined in com.intellij.psi.PsiManager[JavaMethodDescriptor]

'project' @ [403:83] ==> val project: Project defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.moveToJavaClass[LocalVariableDescriptor]

'allScope' @ [403:111] ==> @NotNull public open fun allScope(@NotNull p0: Project): GlobalSearchScope defined in com.intellij.psi.search.GlobalSearchScope[JavaMethodDescriptor]

'project' @ [403:120] ==> val project: Project defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.moveToJavaClass[LocalVariableDescriptor]

'lightMethod' @ [404:46] ==> val lightMethod: PsiMethod defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.moveToJavaClass[LocalVariableDescriptor]

'typeParameters' @ [404:58] ==> public final val PsiMethod.typeParameters: (Array<(PsiTypeParameter..PsiTypeParameter?)>..Array<out (PsiTypeParameter..PsiTypeParameter?)>)[MyPropertyDescriptor]

'map' @ [404:73] ==> public inline fun <T, R> Array<out (PsiTypeParameter..PsiTypeParameter?)>.map(transform: ((PsiTypeParameter..PsiTypeParameter?)) -> List<PsiClassType>): List<List<PsiClassType>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiTypeParameter..com.intellij.psi.PsiTypeParameter?)
    <R> -> List<PsiClassType>

'it' @ [405:21] ==> value-parameter it: (PsiTypeParameter..PsiTypeParameter?) defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.moveToJavaClass.<anonymous>[ValueParameterDescriptorImpl]

'superTypes' @ [405:24] ==> public final val PsiTypeParameter.superTypes: (Array<(PsiClassType..PsiClassType?)>..Array<out (PsiClassType..PsiClassType?)>)[MyPropertyDescriptor]

'map' @ [405:35] ==> public inline fun <T, R> Array<out (PsiClassType..PsiClassType?)>.map(transform: ((PsiClassType..PsiClassType?)) -> PsiClassType): List<PsiClassType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiClassType..com.intellij.psi.PsiClassType?)
    <R> -> PsiClassType

'substitutor' @ [405:41] ==> value-parameter substitutor: PsiSubstitutor defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.moveToJavaClass[ValueParameterDescriptorImpl]

'substitute' @ [405:53] ==> public abstract fun substitute(@Nullable p0: PsiType?): (PsiType..PsiType?) defined in com.intellij.psi.PsiSubstitutor[JavaMethodDescriptor]

'it' @ [405:64] ==> value-parameter it: (PsiClassType..PsiClassType?) defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.moveToJavaClass.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'objectType' @ [405:88] ==> val objectType: PsiClassType defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.moveToJavaClass[LocalVariableDescriptor]

'createJavaMethod' @ [407:71] ==> public fun createJavaMethod(function: KtFunction, targetClass: PsiClass): PsiMethod defined in org.jetbrains.kotlin.idea.refactoring in file kotlinRefactoringUtil.kt[SimpleFunctionDescriptorImpl]

'member' @ [407:88] ==> value-parameter member: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.moveToJavaClass[ValueParameterDescriptorImpl]

'data' @ [407:96] ==> private final val data: KotlinPullUpData defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper[PropertyDescriptorImpl]

'targetClass' @ [407:101] ==> public final val targetClass: PsiNamedElement defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpData[PropertyDescriptorImpl]

'makeMethodAbstract' @ [408:33] ==> public open fun makeMethodAbstract(@NotNull p0: PsiClass, @NotNull p1: PsiMethod): Unit defined in com.intellij.refactoring.util.RefactoringUtil[JavaMethodDescriptor]

'data' @ [408:52] ==> private final val data: KotlinPullUpData defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper[PropertyDescriptorImpl]

'targetClass' @ [408:57] ==> public final val targetClass: PsiNamedElement defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpData[PropertyDescriptorImpl]

'newMethod' @ [408:70] ==> val newMethod: PsiMethod defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.moveToJavaClass[LocalVariableDescriptor]

'newMethod' @ [409:17] ==> val newMethod: PsiMethod defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.moveToJavaClass[LocalVariableDescriptor]

'returnTypeElement' @ [409:27] ==> public final val PsiMethod.returnTypeElement: PsiTypeElement?[MyPropertyDescriptor]

'replace' @ [409:46] ==> public abstract fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in com.intellij.psi.PsiTypeElement[JavaMethodDescriptor]

'elementFactory' @ [409:54] ==> val elementFactory: (PsiElementFactory..PsiElementFactory?) defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.moveToJavaClass[LocalVariableDescriptor]

'createTypeElement' @ [409:69] ==> @NotNull public abstract fun createTypeElement(@NotNull p0: PsiType): PsiTypeElement defined in com.intellij.psi.PsiElementFactory[JavaMethodDescriptor]

'newReturnType' @ [409:87] ==> val newReturnType: (PsiType..PsiType?) defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.moveToJavaClass[LocalVariableDescriptor]

'newMethod' @ [410:17] ==> val newMethod: PsiMethod defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.moveToJavaClass[LocalVariableDescriptor]

'parameterList' @ [410:27] ==> public final val PsiMethod.parameterList: PsiParameterList[MyPropertyDescriptor]

'parameters' @ [410:41] ==> public final val PsiParameterList.parameters: (Array<(PsiParameter..PsiParameter?)>..Array<out (PsiParameter..PsiParameter?)>)[MyPropertyDescriptor]

'forEachIndexed' @ [410:52] ==> public inline fun <T> Array<out (PsiParameter..PsiParameter?)>.forEachIndexed(action: (index: Int, (PsiParameter..PsiParameter?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiParameter..com.intellij.psi.PsiParameter?)

'parameter' @ [411:21] ==> value-parameter parameter: (PsiParameter..PsiParameter?) defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.moveToJavaClass.<anonymous>[ValueParameterDescriptorImpl]

'typeElement' @ [411:31] ==> public final val PsiParameter.typeElement: PsiTypeElement?[MyPropertyDescriptor]

'replace' @ [411:44] ==> public abstract fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in com.intellij.psi.PsiTypeElement[JavaMethodDescriptor]

'elementFactory' @ [411:52] ==> val elementFactory: (PsiElementFactory..PsiElementFactory?) defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.moveToJavaClass[LocalVariableDescriptor]

'createTypeElement' @ [411:67] ==> @NotNull public abstract fun createTypeElement(@NotNull p0: PsiType): PsiTypeElement defined in com.intellij.psi.PsiElementFactory[JavaMethodDescriptor]

'newParameterTypes' @ [411:85] ==> val newParameterTypes: List<(PsiType..PsiType?)> defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.moveToJavaClass[LocalVariableDescriptor]

'i' @ [411:103] ==> value-parameter i: Int defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.moveToJavaClass.<anonymous>[ValueParameterDescriptorImpl]

'newMethod' @ [413:17] ==> val newMethod: PsiMethod defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.moveToJavaClass[LocalVariableDescriptor]

'typeParameters' @ [413:27] ==> public final val PsiMethod.typeParameters: (Array<(PsiTypeParameter..PsiTypeParameter?)>..Array<out (PsiTypeParameter..PsiTypeParameter?)>)[MyPropertyDescriptor]

'forEachIndexed' @ [413:42] ==> public inline fun <T> Array<out (PsiTypeParameter..PsiTypeParameter?)>.forEachIndexed(action: (index: Int, (PsiTypeParameter..PsiTypeParameter?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiTypeParameter..com.intellij.psi.PsiTypeParameter?)

'typeParameter' @ [414:21] ==> value-parameter typeParameter: (PsiTypeParameter..PsiTypeParameter?) defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.moveToJavaClass.<anonymous>[ValueParameterDescriptorImpl]

'extendsList' @ [414:35] ==> public final val PsiTypeParameter.extendsList: PsiReferenceList[MyPropertyDescriptor]

'referenceElements' @ [414:47] ==> public final val PsiReferenceList.referenceElements: (Array<(PsiJavaCodeReferenceElement..PsiJavaCodeReferenceElement?)>..Array<out (PsiJavaCodeReferenceElement..PsiJavaCodeReferenceElement?)>)[MyPropertyDescriptor]

'forEachIndexed' @ [414:65] ==> public inline fun <T> Array<out (PsiJavaCodeReferenceElement..PsiJavaCodeReferenceElement?)>.forEachIndexed(action: (index: Int, (PsiJavaCodeReferenceElement..PsiJavaCodeReferenceElement?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiJavaCodeReferenceElement..com.intellij.psi.PsiJavaCodeReferenceElement?)

'referenceElement' @ [415:25] ==> value-parameter referenceElement: (PsiJavaCodeReferenceElement..PsiJavaCodeReferenceElement?) defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.moveToJavaClass.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'replace' @ [415:42] ==> public abstract fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in com.intellij.psi.PsiJavaCodeReferenceElement[JavaMethodDescriptor]

'elementFactory' @ [415:50] ==> val elementFactory: (PsiElementFactory..PsiElementFactory?) defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.moveToJavaClass[LocalVariableDescriptor]

'createReferenceElementByType' @ [415:65] ==> @NotNull public abstract fun createReferenceElementByType(@NotNull p0: PsiClassType): PsiJavaCodeReferenceElement defined in com.intellij.psi.PsiElementFactory[JavaMethodDescriptor]

'newTypeParameterBounds' @ [415:94] ==> val newTypeParameterBounds: List<List<PsiClassType>> defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.moveToJavaClass[LocalVariableDescriptor]

'i' @ [415:117] ==> value-parameter i: Int defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.moveToJavaClass.<anonymous>[ValueParameterDescriptorImpl]

'j' @ [415:120] ==> value-parameter j: Int defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.moveToJavaClass.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'removeOriginalMemberOrAddOverride' @ [418:17] ==> private final fun removeOriginalMemberOrAddOverride(member: KtCallableDeclaration): Unit defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper[SimpleFunctionDescriptorImpl]

'member' @ [418:51] ==> value-parameter member: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.moveToJavaClass[ValueParameterDescriptorImpl]

'!' @ [419:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'data' @ [419:22] ==> private final val data: KotlinPullUpData defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper[PropertyDescriptorImpl]

'isInterfaceTarget' @ [419:27] ==> public final val isInterfaceTarget: Boolean defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpData[PropertyDescriptorImpl]

'!' @ [419:48] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'data' @ [419:49] ==> private final val data: KotlinPullUpData defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper[PropertyDescriptorImpl]

'targetClass' @ [419:54] ==> public final val targetClass: PsiNamedElement defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpData[PropertyDescriptorImpl]

'hasModifierProperty' @ [419:66] ==> public abstract fun hasModifierProperty(@PsiModifier.ModifierConstant @NonNls @NotNull p0: String): Boolean defined in com.intellij.psi.PsiClass[JavaMethodDescriptor]

'ABSTRACT' @ [419:98] ==> public const final val ABSTRACT: String defined in com.intellij.psi.PsiModifier[JavaPropertyDescriptor]

'data' @ [420:21] ==> private final val data: KotlinPullUpData defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper[PropertyDescriptorImpl]

'targetClass' @ [420:26] ==> public final val targetClass: PsiNamedElement defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpData[PropertyDescriptorImpl]

'modifierList' @ [420:38] ==> public final val PsiClass.modifierList: PsiModifierList?[MyPropertyDescriptor]

'setModifierProperty' @ [420:52] ==> public abstract fun setModifierProperty(@PsiModifier.ModifierConstant @NotNull @NonNls p0: String, p1: Boolean): Unit defined in com.intellij.psi.PsiModifierList[JavaMethodDescriptor]

'ABSTRACT' @ [420:84] ==> public const final val ABSTRACT: String defined in com.intellij.psi.PsiModifier[JavaPropertyDescriptor]

'newMethod' @ [422:17] ==> val newMethod: PsiMethod defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.moveToJavaClass[LocalVariableDescriptor]

'getInstance' @ [426:30] ==> public open fun getInstance(p0: (Project..Project?)): (JavaCodeStyleManager..JavaCodeStyleManager?) defined in com.intellij.psi.codeStyle.JavaCodeStyleManager[JavaMethodDescriptor]

'project' @ [426:42] ==> val project: Project defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.moveToJavaClass[LocalVariableDescriptor]

'shortenClassReferences' @ [426:51] ==> @NotNull public abstract fun shortenClassReferences(@NotNull p0: PsiElement): PsiElement defined in com.intellij.psi.codeStyle.JavaCodeStyleManager[JavaMethodDescriptor]

'movedMember' @ [426:74] ==> val movedMember: PsiMember defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.moveToJavaClass[LocalVariableDescriptor]

'info' @ [430:22] ==> value-parameter info: MemberInfoBase<PsiMember> defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.move[ValueParameterDescriptorImpl]

'member' @ [430:27] ==> public final val <T : (PsiElement..PsiElement?)> MemberInfoBase<PsiMember>.member: (PsiMember..PsiMember?)[MyPropertyDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> PsiMember

'toKtDeclarationWrapperAware' @ [430:34] ==> internal fun PsiMember.toKtDeclarationWrapperAware(): KtNamedDeclaration? defined in org.jetbrains.kotlin.idea.refactoring.memberInfo in file memberInfoUtils.kt[SimpleFunctionDescriptorImpl]

'member' @ [432:14] ==> val member: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.move[LocalVariableDescriptor]

'member' @ [432:35] ==> val member: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.move[LocalVariableDescriptor]

'info' @ [432:67] ==> value-parameter info: MemberInfoBase<PsiMember> defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.move[ValueParameterDescriptorImpl]

'overrides' @ [432:72] ==> public final val <T : (PsiElement..PsiElement?)> MemberInfoBase<PsiMember>.overrides: (Boolean..Boolean?)[MyPropertyDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> PsiMember

'moveSuperInterface' @ [433:13] ==> private final fun moveSuperInterface(member: PsiNamedElement, substitutor: PsiSubstitutor): Unit defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper[SimpleFunctionDescriptorImpl]

'member' @ [433:32] ==> val member: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.move[LocalVariableDescriptor]

'substitutor' @ [433:40] ==> value-parameter substitutor: PsiSubstitutor defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.move[ValueParameterDescriptorImpl]

'data' @ [437:13] ==> private final val data: KotlinPullUpData defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper[PropertyDescriptorImpl]

'targetClass' @ [437:18] ==> public final val targetClass: PsiNamedElement defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpData[PropertyDescriptorImpl]

'moveToJavaClass' @ [438:13] ==> private final fun moveToJavaClass(member: KtNamedDeclaration, substitutor: PsiSubstitutor): Unit defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper[SimpleFunctionDescriptorImpl]

'member' @ [438:29] ==> val member: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.move[LocalVariableDescriptor]

'substitutor' @ [438:37] ==> value-parameter substitutor: PsiSubstitutor defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.move[ValueParameterDescriptorImpl]

'markElements' @ [442:30] ==> public fun markElements(declaration: KtNamedDeclaration, context: BindingContext, sourceClassDescriptor: ClassDescriptor, targetClassDescriptor: ClassDescriptor?): List<KtElement> defined in org.jetbrains.kotlin.idea.refactoring.pullUp in file markingUtils.kt[SimpleFunctionDescriptorImpl]

'member' @ [442:43] ==> val member: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.move[LocalVariableDescriptor]

'data' @ [442:51] ==> private final val data: KotlinPullUpData defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper[PropertyDescriptorImpl]

'sourceClassContext' @ [442:56] ==> public final val sourceClassContext: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpData[PropertyDescriptorImpl]

'data' @ [442:76] ==> private final val data: KotlinPullUpData defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper[PropertyDescriptorImpl]

'sourceClassDescriptor' @ [442:81] ==> public final val sourceClassDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpData[PropertyDescriptorImpl]

'data' @ [442:104] ==> private final val data: KotlinPullUpData defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper[PropertyDescriptorImpl]

'targetClassDescriptor' @ [442:109] ==> public final val targetClassDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpData[PropertyDescriptorImpl]

'member' @ [443:26] ==> val member: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.move[LocalVariableDescriptor]

'copy' @ [443:33] ==> public abstract fun copy(): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtNamedDeclaration[JavaMethodDescriptor]

'data' @ [446:17] ==> private final val data: KotlinPullUpData defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper[PropertyDescriptorImpl]

'isInterfaceTarget' @ [446:22] ==> public final val isInterfaceTarget: Boolean defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpData[PropertyDescriptorImpl]

'memberCopy' @ [447:17] ==> value-parameter memberCopy: KtClassOrObject defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.move.moveClassOrObject[ValueParameterDescriptorImpl]

'removeModifier' @ [447:28] ==> public open fun removeModifier(@NotNull p0: KtModifierKeywordToken): Unit defined in org.jetbrains.kotlin.psi.KtClassOrObject[JavaMethodDescriptor]

'INNER_KEYWORD' @ [447:52] ==> public final val INNER_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'addMemberToTarget' @ [450:31] ==> public fun addMemberToTarget(targetMember: KtNamedDeclaration, targetClass: KtClassOrObject): KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.pullUp in file pullUpUtils.kt[SimpleFunctionDescriptorImpl]

'memberCopy' @ [450:49] ==> value-parameter memberCopy: KtClassOrObject defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.move.moveClassOrObject[ValueParameterDescriptorImpl]

'data' @ [450:61] ==> private final val data: KotlinPullUpData defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper[PropertyDescriptorImpl]

'targetClass' @ [450:66] ==> public final val targetClass: PsiNamedElement defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpData[PropertyDescriptorImpl]

'member' @ [451:13] ==> value-parameter member: KtClassOrObject defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.move.moveClassOrObject[ValueParameterDescriptorImpl]

'delete' @ [451:20] ==> public open fun delete(): Unit defined in org.jetbrains.kotlin.psi.KtClassOrObject[DeserializedSimpleFunctionDescriptor]

'movedMember' @ [452:20] ==> val movedMember: KtClassOrObject defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.move.moveClassOrObject[LocalVariableDescriptor]

'data' @ [456:13] ==> private final val data: KotlinPullUpData defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper[PropertyDescriptorImpl]

'targetClass' @ [456:18] ==> public final val targetClass: PsiNamedElement defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpData[PropertyDescriptorImpl]

'fixOverrideAndGetClashingSuper' @ [459:33] ==> private final fun fixOverrideAndGetClashingSuper(sourceMember: KtCallableDeclaration, targetMember: KtCallableDeclaration): KtCallableDeclaration? defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper[SimpleFunctionDescriptorImpl]

'member' @ [459:64] ==> value-parameter member: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.move.moveCallableMember[ValueParameterDescriptorImpl]

'memberCopy' @ [459:72] ==> value-parameter memberCopy: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.move.moveCallableMember[ValueParameterDescriptorImpl]

'KtPsiFactory' @ [461:30] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'member' @ [461:43] ==> value-parameter member: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.move.moveCallableMember[ValueParameterDescriptorImpl]

'member' @ [463:38] ==> value-parameter member: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.move.moveCallableMember[ValueParameterDescriptorImpl]

'hasModifier' @ [463:45] ==> public abstract fun hasModifier(@NotNull p0: KtModifierKeywordToken): Boolean defined in org.jetbrains.kotlin.psi.KtCallableDeclaration[JavaMethodDescriptor]

'ABSTRACT_KEYWORD' @ [463:66] ==> public final val ABSTRACT_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'when {
                info.isToAbstract -> true
                !data.isInterfaceTarget -> false
                member is KtProperty -> member.mustBeAbstractInInterface()
                else -> false
            }' @ [464:30] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean, entry3: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'info' @ [465:17] ==> value-parameter info: MemberInfoBase<PsiMember> defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.move[ValueParameterDescriptorImpl]

'isToAbstract' @ [465:22] ==> public final var <T : (PsiElement..PsiElement?)> MemberInfoBase<PsiMember>.isToAbstract: Boolean[MyPropertyDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> PsiMember

'!' @ [466:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'data' @ [466:18] ==> private final val data: KotlinPullUpData defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper[PropertyDescriptorImpl]

'isInterfaceTarget' @ [466:23] ==> public final val isInterfaceTarget: Boolean defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpData[PropertyDescriptorImpl]

'member' @ [467:17] ==> value-parameter member: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.move.moveCallableMember[ValueParameterDescriptorImpl]

'member' @ [467:41] ==> value-parameter member: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.move.moveCallableMember[ValueParameterDescriptorImpl]

'mustBeAbstractInInterface' @ [467:48] ==> public fun KtProperty.mustBeAbstractInInterface(): Boolean defined in org.jetbrains.kotlin.idea.refactoring.pullUp in file pullUpUtils.kt[SimpleFunctionDescriptorImpl]

'if (member.isCompanionMemberOf(data.sourceClass)) data.targetClass.getOrCreateCompanionObject() else data.targetClass' @ [471:32] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtClassOrObject, elseBranch: KtClassOrObject): KtClassOrObject[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtClassOrObject

'member' @ [471:36] ==> value-parameter member: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.move.moveCallableMember[ValueParameterDescriptorImpl]

'isCompanionMemberOf' @ [471:43] ==> public fun KtNamedDeclaration.isCompanionMemberOf(klass: KtClassOrObject): Boolean defined in org.jetbrains.kotlin.idea.refactoring in file kotlinRefactoringUtil.kt[SimpleFunctionDescriptorImpl]

'data' @ [471:63] ==> private final val data: KotlinPullUpData defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper[PropertyDescriptorImpl]

'sourceClass' @ [471:68] ==> public final val sourceClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpData[PropertyDescriptorImpl]

'data' @ [471:82] ==> private final val data: KotlinPullUpData defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper[PropertyDescriptorImpl]

'targetClass' @ [471:87] ==> public final val targetClass: PsiNamedElement defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpData[PropertyDescriptorImpl]

'getOrCreateCompanionObject' @ [471:99] ==> public fun KtClass.getOrCreateCompanionObject(): KtObjectDeclaration defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'data' @ [471:133] ==> private final val data: KotlinPullUpData defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper[PropertyDescriptorImpl]

'targetClass' @ [471:138] ==> public final val targetClass: PsiNamedElement defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpData[PropertyDescriptorImpl]

'if (toAbstract) {
                if (!originalIsAbstract) {
                    makeAbstract(memberCopy, data.memberDescriptors[member] as CallableMemberDescriptor, data.sourceToTargetClassSubstitutor, data.targetClass)
                }

                movedMember = doAddCallableMember(memberCopy, clashingSuper, classToAddTo)
                if (member.typeReference == null) {
                    movedMember.typeReference?.addToShorteningWaitSet()
                }

                removeOriginalMemberOrAddOverride(member)
            }
            else {
                movedMember = doAddCallableMember(memberCopy, clashingSuper, classToAddTo)
                if (member is KtParameter && movedMember is KtParameter) {
                    member.valOrVarKeyword?.delete()
                    CONSTRUCTOR_VAL_VAR_MODIFIERS.forEach { member.removeModifier(it) }

                    val superEntry = data.superEntryForTargetClass
                    val superResolvedCall = data.targetClassSuperResolvedCall
                    if (superResolvedCall != null) {
                        val superCall = if (superEntry !is KtSuperTypeCallEntry || superEntry.valueArgumentList == null) {
                            superEntry!!.replaced(psiFactory.createSuperTypeCallEntry("${superEntry.text}()"))
                        } else superEntry
                        val argumentList = superCall.valueArgumentList!!

                        val parameterIndex = movedMember.parameterIndex()
                        val prevParameterDescriptor = superResolvedCall.resultingDescriptor.valueParameters.getOrNull(parameterIndex - 1)
                        val prevArgument = superResolvedCall.valueArguments[prevParameterDescriptor]?.arguments?.singleOrNull() as? KtValueArgument
                        val newArgumentName = if (prevArgument != null && prevArgument.isNamed()) Name.identifier(member.name!!) else null
                        val newArgument = psiFactory.createArgument(psiFactory.createExpression(member.name!!), newArgumentName)
                        if (prevArgument == null) {
                            argumentList.addArgument(newArgument)
                        }
                        else {
                            argumentList.addArgumentAfter(newArgument, prevArgument)
                        }
                    }
                }
                else {
                    member.delete()
                }
            }' @ [473:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'toAbstract' @ [473:17] ==> val toAbstract: Boolean defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.move.moveCallableMember[LocalVariableDescriptor]

'!' @ [474:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'originalIsAbstract' @ [474:22] ==> val originalIsAbstract: Boolean defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.move.moveCallableMember[LocalVariableDescriptor]

'makeAbstract' @ [475:21] ==> public fun makeAbstract(member: KtCallableDeclaration, originalMemberDescriptor: CallableMemberDescriptor, substitutor: TypeSubstitutor, targetClass: KtClass): Unit defined in org.jetbrains.kotlin.idea.refactoring.pullUp in file pullUpUtils.kt[SimpleFunctionDescriptorImpl]

'memberCopy' @ [475:34] ==> value-parameter memberCopy: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.move.moveCallableMember[ValueParameterDescriptorImpl]

'data' @ [475:46] ==> private final val data: KotlinPullUpData defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper[PropertyDescriptorImpl]

'memberDescriptors' @ [475:51] ==> public final val memberDescriptors: Map<KtNamedDeclaration, DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpData[PropertyDescriptorImpl]

'member' @ [475:69] ==> value-parameter member: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.move.moveCallableMember[ValueParameterDescriptorImpl]

'data' @ [475:106] ==> private final val data: KotlinPullUpData defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper[PropertyDescriptorImpl]

'sourceToTargetClassSubstitutor' @ [475:111] ==> public final val sourceToTargetClassSubstitutor: TypeSubstitutor defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpData[PropertyDescriptorImpl]

'data' @ [475:143] ==> private final val data: KotlinPullUpData defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper[PropertyDescriptorImpl]

'targetClass' @ [475:148] ==> public final val targetClass: PsiNamedElement defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpData[PropertyDescriptorImpl]

'movedMember' @ [478:17] ==> val movedMember: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.move.moveCallableMember[LocalVariableDescriptor]

'doAddCallableMember' @ [478:31] ==> public fun doAddCallableMember(memberCopy: KtCallableDeclaration, clashingSuper: KtCallableDeclaration?, targetClass: KtClassOrObject): KtCallableDeclaration defined in org.jetbrains.kotlin.idea.refactoring.pullUp in file pullUpUtils.kt[SimpleFunctionDescriptorImpl]

'memberCopy' @ [478:51] ==> value-parameter memberCopy: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.move.moveCallableMember[ValueParameterDescriptorImpl]

'clashingSuper' @ [478:63] ==> val clashingSuper: KtCallableDeclaration? defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.move.moveCallableMember[LocalVariableDescriptor]

'classToAddTo' @ [478:78] ==> val classToAddTo: KtClassOrObject defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.move.moveCallableMember[LocalVariableDescriptor]

'member' @ [479:21] ==> value-parameter member: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.move.moveCallableMember[ValueParameterDescriptorImpl]

'typeReference' @ [479:28] ==> public final var KtCallableDeclaration.typeReference: KtTypeReference?[MyPropertyDescriptor]

'movedMember' @ [480:21] ==> val movedMember: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.move.moveCallableMember[LocalVariableDescriptor]

'typeReference' @ [480:33] ==> public final var KtCallableDeclaration.typeReference: KtTypeReference?[MyPropertyDescriptor]

'addToShorteningWaitSet' @ [480:48] ==> public fun KtElement.addToShorteningWaitSet(options: ShortenReferences.Options = ...): Unit defined in org.jetbrains.kotlin.idea.codeInsight.shorten[DeserializedSimpleFunctionDescriptor]

'removeOriginalMemberOrAddOverride' @ [483:17] ==> private final fun removeOriginalMemberOrAddOverride(member: KtCallableDeclaration): Unit defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper[SimpleFunctionDescriptorImpl]

'member' @ [483:51] ==> value-parameter member: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.move.moveCallableMember[ValueParameterDescriptorImpl]

'movedMember' @ [486:17] ==> val movedMember: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.move.moveCallableMember[LocalVariableDescriptor]

'doAddCallableMember' @ [486:31] ==> public fun doAddCallableMember(memberCopy: KtCallableDeclaration, clashingSuper: KtCallableDeclaration?, targetClass: KtClassOrObject): KtCallableDeclaration defined in org.jetbrains.kotlin.idea.refactoring.pullUp in file pullUpUtils.kt[SimpleFunctionDescriptorImpl]

'memberCopy' @ [486:51] ==> value-parameter memberCopy: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.move.moveCallableMember[ValueParameterDescriptorImpl]

'clashingSuper' @ [486:63] ==> val clashingSuper: KtCallableDeclaration? defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.move.moveCallableMember[LocalVariableDescriptor]

'classToAddTo' @ [486:78] ==> val classToAddTo: KtClassOrObject defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.move.moveCallableMember[LocalVariableDescriptor]

'if (member is KtParameter && movedMember is KtParameter) {
                    member.valOrVarKeyword?.delete()
                    CONSTRUCTOR_VAL_VAR_MODIFIERS.forEach { member.removeModifier(it) }

                    val superEntry = data.superEntryForTargetClass
                    val superResolvedCall = data.targetClassSuperResolvedCall
                    if (superResolvedCall != null) {
                        val superCall = if (superEntry !is KtSuperTypeCallEntry || superEntry.valueArgumentList == null) {
                            superEntry!!.replaced(psiFactory.createSuperTypeCallEntry("${superEntry.text}()"))
                        } else superEntry
                        val argumentList = superCall.valueArgumentList!!

                        val parameterIndex = movedMember.parameterIndex()
                        val prevParameterDescriptor = superResolvedCall.resultingDescriptor.valueParameters.getOrNull(parameterIndex - 1)
                        val prevArgument = superResolvedCall.valueArguments[prevParameterDescriptor]?.arguments?.singleOrNull() as? KtValueArgument
                        val newArgumentName = if (prevArgument != null && prevArgument.isNamed()) Name.identifier(member.name!!) else null
                        val newArgument = psiFactory.createArgument(psiFactory.createExpression(member.name!!), newArgumentName)
                        if (prevArgument == null) {
                            argumentList.addArgument(newArgument)
                        }
                        else {
                            argumentList.addArgumentAfter(newArgument, prevArgument)
                        }
                    }
                }
                else {
                    member.delete()
                }' @ [487:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'member' @ [487:21] ==> value-parameter member: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.move.moveCallableMember[ValueParameterDescriptorImpl]

'movedMember' @ [487:46] ==> val movedMember: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.move.moveCallableMember[LocalVariableDescriptor]

'member' @ [488:21] ==> value-parameter member: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.move.moveCallableMember[ValueParameterDescriptorImpl]

'valOrVarKeyword' @ [488:28] ==> public final val KtParameter.valOrVarKeyword: PsiElement?[MyPropertyDescriptor]

'delete' @ [488:45] ==> public abstract fun delete(): Unit defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'CONSTRUCTOR_VAL_VAR_MODIFIERS' @ [489:21] ==> internal val CONSTRUCTOR_VAL_VAR_MODIFIERS: List<(KtModifierKeywordToken..KtModifierKeywordToken?)> defined in org.jetbrains.kotlin.idea.inspections in file CanBeParameterInspection.kt[PropertyDescriptorImpl]

'forEach' @ [489:51] ==> @HidesMembers public inline fun <T> Iterable<(KtModifierKeywordToken..KtModifierKeywordToken?)>.forEach(action: ((KtModifierKeywordToken..KtModifierKeywordToken?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.lexer.KtModifierKeywordToken..org.jetbrains.kotlin.lexer.KtModifierKeywordToken?)

'member' @ [489:61] ==> value-parameter member: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.move.moveCallableMember[ValueParameterDescriptorImpl]

'removeModifier' @ [489:68] ==> public abstract fun removeModifier(@NotNull p0: KtModifierKeywordToken): Unit defined in org.jetbrains.kotlin.psi.KtCallableDeclaration[JavaMethodDescriptor]

'it' @ [489:83] ==> value-parameter it: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.move.moveCallableMember.<anonymous>[ValueParameterDescriptorImpl]

'data' @ [491:38] ==> private final val data: KotlinPullUpData defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper[PropertyDescriptorImpl]

'superEntryForTargetClass' @ [491:43] ==> public final val superEntryForTargetClass: KtSuperTypeListEntry? defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpData[PropertyDescriptorImpl]

'data' @ [492:45] ==> private final val data: KotlinPullUpData defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper[PropertyDescriptorImpl]

'targetClassSuperResolvedCall' @ [492:50] ==> public final val targetClassSuperResolvedCall: ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpData[PropertyDescriptorImpl]

'superResolvedCall' @ [493:25] ==> val superResolvedCall: ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.move.moveCallableMember[LocalVariableDescriptor]

'if (superEntry !is KtSuperTypeCallEntry || superEntry.valueArgumentList == null) {
                            superEntry!!.replaced(psiFactory.createSuperTypeCallEntry("${superEntry.text}()"))
                        } else superEntry' @ [494:41] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtSuperTypeCallEntry, elseBranch: KtSuperTypeCallEntry): KtSuperTypeCallEntry[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtSuperTypeCallEntry

'superEntry' @ [494:45] ==> val superEntry: KtSuperTypeListEntry? defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.move.moveCallableMember[LocalVariableDescriptor]

'superEntry' @ [494:84] ==> val superEntry: KtSuperTypeListEntry? defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.move.moveCallableMember[LocalVariableDescriptor]

'valueArgumentList' @ [494:95] ==> public final val KtSuperTypeCallEntry.valueArgumentList: KtValueArgumentList?[MyPropertyDescriptor]

'superEntry' @ [495:29] ==> val superEntry: KtSuperTypeListEntry? defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.move.moveCallableMember[LocalVariableDescriptor]

'replaced' @ [495:42] ==> public inline fun <reified T : PsiElement> PsiElement.replaced(newElement: KtSuperTypeCallEntry): KtSuperTypeCallEntry defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtSuperTypeCallEntry

'psiFactory' @ [495:51] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.move.moveCallableMember[LocalVariableDescriptor]

'createSuperTypeCallEntry' @ [495:62] ==> public final fun createSuperTypeCallEntry(text: String): KtSuperTypeCallEntry defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'superEntry' @ [495:90] ==> val superEntry: KtSuperTypeListEntry? defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.move.moveCallableMember[LocalVariableDescriptor]

'text' @ [495:101] ==> public final val KtSuperTypeListEntry.text: (String..String?)[MyPropertyDescriptor]

'superEntry' @ [496:32] ==> val superEntry: KtSuperTypeListEntry? defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.move.moveCallableMember[LocalVariableDescriptor]

'superCall' @ [497:44] ==> val superCall: KtSuperTypeCallEntry defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.move.moveCallableMember[LocalVariableDescriptor]

'valueArgumentList' @ [497:54] ==> public final val KtSuperTypeCallEntry.valueArgumentList: KtValueArgumentList?[MyPropertyDescriptor]

'movedMember' @ [499:46] ==> val movedMember: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.move.moveCallableMember[LocalVariableDescriptor]

'parameterIndex' @ [499:58] ==> public fun PsiElement.parameterIndex(): Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'superResolvedCall' @ [500:55] ==> val superResolvedCall: ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.move.moveCallableMember[LocalVariableDescriptor]

'resultingDescriptor' @ [500:73] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.resultingDescriptor: CallableDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(out CallableDescriptor)

'valueParameters' @ [500:93] ==> public final val CallableDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'getOrNull' @ [500:109] ==> public fun <T> List<(ValueParameterDescriptor..ValueParameterDescriptor?)>.getOrNull(index: Int): ValueParameterDescriptor? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)

'parameterIndex' @ [500:119] ==> val parameterIndex: Int defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.move.moveCallableMember[LocalVariableDescriptor]

'superResolvedCall' @ [501:44] ==> val superResolvedCall: ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.move.moveCallableMember[LocalVariableDescriptor]

'valueArguments' @ [501:62] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.valueArguments: (MutableMap<(ValueParameterDescriptor..ValueParameterDescriptor?), (ResolvedValueArgument..ResolvedValueArgument?)>..Map<(ValueParameterDescriptor..ValueParameterDescriptor?), (ResolvedValueArgument..ResolvedValueArgument?)>)[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(out CallableDescriptor)

'prevParameterDescriptor' @ [501:77] ==> val prevParameterDescriptor: ValueParameterDescriptor? defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.move.moveCallableMember[LocalVariableDescriptor]

'arguments' @ [501:103] ==> public final val ResolvedValueArgument.arguments: (MutableList<(ValueArgument..ValueArgument?)>..List<(ValueArgument..ValueArgument?)>)[MyPropertyDescriptor]

'singleOrNull' @ [501:114] ==> public fun <T> List<(ValueArgument..ValueArgument?)>.singleOrNull(): ValueArgument? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.ValueArgument..org.jetbrains.kotlin.psi.ValueArgument?)

'if (prevArgument != null && prevArgument.isNamed()) Name.identifier(member.name!!) else null' @ [502:47] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Name?, elseBranch: Name?): Name?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Name?

'prevArgument' @ [502:51] ==> val prevArgument: KtValueArgument? defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.move.moveCallableMember[LocalVariableDescriptor]

'prevArgument' @ [502:75] ==> val prevArgument: KtValueArgument? defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.move.moveCallableMember[LocalVariableDescriptor]

'isNamed' @ [502:88] ==> public open fun isNamed(): Boolean defined in org.jetbrains.kotlin.psi.KtValueArgument[JavaMethodDescriptor]

'identifier' @ [502:104] ==> @NotNull public open fun identifier(@NotNull p0: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'member' @ [502:115] ==> value-parameter member: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.move.moveCallableMember[ValueParameterDescriptorImpl]

'name' @ [502:122] ==> public final val KtParameter.name: String?[MyPropertyDescriptor]

'psiFactory' @ [503:43] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.move.moveCallableMember[LocalVariableDescriptor]

'createArgument' @ [503:54] ==> public final fun createArgument(expression: KtExpression?, name: Name? = ..., isSpread: Boolean = ...): KtValueArgument defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'psiFactory' @ [503:69] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.move.moveCallableMember[LocalVariableDescriptor]

'createExpression' @ [503:80] ==> public final fun createExpression(text: String): KtExpression defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'member' @ [503:97] ==> value-parameter member: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.move.moveCallableMember[ValueParameterDescriptorImpl]

'name' @ [503:104] ==> public final val KtParameter.name: String?[MyPropertyDescriptor]

'newArgumentName' @ [503:113] ==> val newArgumentName: Name? defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.move.moveCallableMember[LocalVariableDescriptor]

'if (prevArgument == null) {
                            argumentList.addArgument(newArgument)
                        }
                        else {
                            argumentList.addArgumentAfter(newArgument, prevArgument)
                        }' @ [504:25] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtValueArgument, elseBranch: KtValueArgument): KtValueArgument[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtValueArgument

'prevArgument' @ [504:29] ==> val prevArgument: KtValueArgument? defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.move.moveCallableMember[LocalVariableDescriptor]

'argumentList' @ [505:29] ==> val argumentList: KtValueArgumentList defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.move.moveCallableMember[LocalVariableDescriptor]

'addArgument' @ [505:42] ==> @NotNull public open fun addArgument(@NotNull p0: KtValueArgument): KtValueArgument defined in org.jetbrains.kotlin.psi.KtValueArgumentList[JavaMethodDescriptor]

'newArgument' @ [505:54] ==> val newArgument: KtValueArgument defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.move.moveCallableMember[LocalVariableDescriptor]

'argumentList' @ [508:29] ==> val argumentList: KtValueArgumentList defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.move.moveCallableMember[LocalVariableDescriptor]

'addArgumentAfter' @ [508:42] ==> @NotNull public open fun addArgumentAfter(@NotNull p0: KtValueArgument, @Nullable p1: KtValueArgument?): KtValueArgument defined in org.jetbrains.kotlin.psi.KtValueArgumentList[JavaMethodDescriptor]

'newArgument' @ [508:59] ==> val newArgument: KtValueArgument defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.move.moveCallableMember[LocalVariableDescriptor]

'prevArgument' @ [508:72] ==> val prevArgument: KtValueArgument? defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.move.moveCallableMember[LocalVariableDescriptor]

'member' @ [513:21] ==> value-parameter member: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.move.moveCallableMember[ValueParameterDescriptorImpl]

'delete' @ [513:28] ==> public abstract fun delete(): Unit defined in org.jetbrains.kotlin.psi.KtCallableDeclaration[JavaMethodDescriptor]

'originalIsAbstract' @ [517:17] ==> val originalIsAbstract: Boolean defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.move.moveCallableMember[LocalVariableDescriptor]

'data' @ [517:39] ==> private final val data: KotlinPullUpData defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper[PropertyDescriptorImpl]

'isInterfaceTarget' @ [517:44] ==> public final val isInterfaceTarget: Boolean defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpData[PropertyDescriptorImpl]

'movedMember' @ [518:17] ==> val movedMember: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.move.moveCallableMember[LocalVariableDescriptor]

'removeModifier' @ [518:29] ==> public abstract fun removeModifier(@NotNull p0: KtModifierKeywordToken): Unit defined in org.jetbrains.kotlin.psi.KtCallableDeclaration[JavaMethodDescriptor]

'ABSTRACT_KEYWORD' @ [518:53] ==> public final val ABSTRACT_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'movedMember' @ [521:17] ==> val movedMember: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.move.moveCallableMember[LocalVariableDescriptor]

'hasModifier' @ [521:29] ==> public abstract fun hasModifier(@NotNull p0: KtModifierKeywordToken): Boolean defined in org.jetbrains.kotlin.psi.KtCallableDeclaration[JavaMethodDescriptor]

'ABSTRACT_KEYWORD' @ [521:50] ==> public final val ABSTRACT_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'data' @ [522:17] ==> private final val data: KotlinPullUpData defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper[PropertyDescriptorImpl]

'targetClass' @ [522:22] ==> public final val targetClass: PsiNamedElement defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpData[PropertyDescriptorImpl]

'makeAbstract' @ [522:34] ==> public fun KtClass.makeAbstract(): Unit defined in org.jetbrains.kotlin.idea.refactoring.pullUp in file pullUpUtils.kt[SimpleFunctionDescriptorImpl]

'movedMember' @ [524:20] ==> val movedMember: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.move.moveCallableMember[LocalVariableDescriptor]

'when (member) {
                is KtCallableDeclaration -> moveCallableMember(member, memberCopy as KtCallableDeclaration)
                is KtClassOrObject -> moveClassOrObject(member, memberCopy as KtClassOrObject)
                else -> return
            }' @ [528:31] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KtTypeParameterListOwner, entry1: KtTypeParameterListOwner, entry2: KtTypeParameterListOwner): KtTypeParameterListOwner[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KtTypeParameterListOwner

'member' @ [528:37] ==> val member: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.move[LocalVariableDescriptor]

'moveCallableMember' @ [529:45] ==> local final fun moveCallableMember(member: KtCallableDeclaration, memberCopy: KtCallableDeclaration): KtCallableDeclaration defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.move[SimpleFunctionDescriptorImpl]

'member' @ [529:64] ==> val member: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.move[LocalVariableDescriptor]

'memberCopy' @ [529:72] ==> val memberCopy: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.move[LocalVariableDescriptor]

'moveClassOrObject' @ [530:39] ==> local final fun moveClassOrObject(member: KtClassOrObject, memberCopy: KtClassOrObject): KtClassOrObject defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.move[SimpleFunctionDescriptorImpl]

'member' @ [530:57] ==> val member: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.move[LocalVariableDescriptor]

'memberCopy' @ [530:65] ==> val memberCopy: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.move[LocalVariableDescriptor]

'movedMember' @ [534:13] ==> val movedMember: KtTypeParameterListOwner defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.move[LocalVariableDescriptor]

'modifierList' @ [534:25] ==> public final val KtTypeParameterListOwner.modifierList: KtModifierList?[MyPropertyDescriptor]

'let' @ [534:39] ==> @InlineOnly public inline fun <T, R> KtModifierList.let(block: (KtModifierList) -> PsiElement): PsiElement defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtModifierList
    <R> -> PsiElement

'getInstance' @ [534:62] ==> public open fun getInstance(@NotNull p0: PsiManager): (CodeStyleManager..CodeStyleManager?) defined in com.intellij.psi.codeStyle.CodeStyleManager[JavaMethodDescriptor]

'member' @ [534:74] ==> val member: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.move[LocalVariableDescriptor]

'manager' @ [534:81] ==> public final val KtNamedDeclaration.manager: (PsiManager..PsiManager?)[MyPropertyDescriptor]

'reformat' @ [534:90] ==> @NotNull public abstract fun reformat(@NotNull p0: PsiElement): PsiElement defined in com.intellij.psi.codeStyle.CodeStyleManager[JavaMethodDescriptor]

'it' @ [534:99] ==> value-parameter it: KtModifierList defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.move.<anonymous>[ValueParameterDescriptorImpl]

'applyMarking' @ [536:13] ==> public fun applyMarking(declaration: KtNamedDeclaration, substitutor: TypeSubstitutor, targetClassDescriptor: ClassDescriptor): Unit defined in org.jetbrains.kotlin.idea.refactoring.pullUp in file markingUtils.kt[SimpleFunctionDescriptorImpl]

'movedMember' @ [536:26] ==> val movedMember: KtTypeParameterListOwner defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.move[LocalVariableDescriptor]

'data' @ [536:39] ==> private final val data: KotlinPullUpData defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper[PropertyDescriptorImpl]

'sourceToTargetClassSubstitutor' @ [536:44] ==> public final val sourceToTargetClassSubstitutor: TypeSubstitutor defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpData[PropertyDescriptorImpl]

'data' @ [536:76] ==> private final val data: KotlinPullUpData defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper[PropertyDescriptorImpl]

'targetClassDescriptor' @ [536:81] ==> public final val targetClassDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpData[PropertyDescriptorImpl]

'addMovedMember' @ [537:13] ==> private final fun addMovedMember(newMember: KtNamedDeclaration): Unit defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper[SimpleFunctionDescriptorImpl]

'movedMember' @ [537:28] ==> val movedMember: KtTypeParameterListOwner defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.move[LocalVariableDescriptor]

'clearMarking' @ [540:13] ==> public fun clearMarking(markedElements: List<KtElement>): Unit defined in org.jetbrains.kotlin.idea.refactoring.pullUp in file markingUtils.kt[SimpleFunctionDescriptorImpl]

'markedElements' @ [540:26] ==> val markedElements: List<KtElement> defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.move[LocalVariableDescriptor]

'member' @ [545:27] ==> value-parameter member: PsiMember defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.postProcessMember[ValueParameterDescriptorImpl]

'unwrapped' @ [545:34] ==> public val PsiElement.unwrapped: PsiElement? defined in org.jetbrains.kotlin.asJava[DeserializedPropertyDescriptor]

'dropOverrideKeywordIfNecessary' @ [546:9] ==> public fun dropOverrideKeywordIfNecessary(element: KtNamedDeclaration): Unit defined in org.jetbrains.kotlin.idea.refactoring in file kotlinRefactoringUtil.kt[SimpleFunctionDescriptorImpl]

'declaration' @ [546:40] ==> val declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.postProcessMember[LocalVariableDescriptor]

'KtPsiFactory' @ [550:26] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'data' @ [550:39] ==> private final val data: KotlinPullUpData defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper[PropertyDescriptorImpl]

'sourceClass' @ [550:44] ==> public final val sourceClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpData[PropertyDescriptorImpl]

'getOrCreateBody' @ [553:13] ==> public fun KtClassOrObject.getOrCreateBody(): KtClassBody defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'declarations' @ [553:31] ==> public final val KtClassBody.declarations: (MutableList<(KtDeclaration..KtDeclaration?)>..List<(KtDeclaration..KtDeclaration?)>?)[MyPropertyDescriptor]

'lastOrNull' @ [553:44] ==> public inline fun <T> List<(KtDeclaration..KtDeclaration?)>.lastOrNull(predicate: ((KtDeclaration..KtDeclaration?)) -> Boolean): KtDeclaration? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtDeclaration..org.jetbrains.kotlin.psi.KtDeclaration?)

'it' @ [553:57] ==> value-parameter it: (KtDeclaration..KtDeclaration?) defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.moveFieldInitializations.getOrCreateClassInitializer.<anonymous>[ValueParameterDescriptorImpl]

'let' @ [553:89] ==> @InlineOnly public inline fun <T, R> KtDeclaration.let(block: (KtDeclaration) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtDeclaration
    <R> -> Nothing

'it' @ [553:102] ==> value-parameter it: KtDeclaration defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.moveFieldInitializations.getOrCreateClassInitializer.<anonymous>[ValueParameterDescriptorImpl]

'addDeclaration' @ [554:20] ==> public final inline fun <reified T : KtDeclaration> addDeclaration(declaration: KtAnonymousInitializer): KtAnonymousInitializer defined in org.jetbrains.kotlin.psi.KtClassOrObject[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : KtDeclaration> -> KtAnonymousInitializer

'psiFactory' @ [554:35] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.moveFieldInitializations[LocalVariableDescriptor]

'createAnonymousInitializer' @ [554:46] ==> public final fun createAnonymousInitializer(): KtAnonymousInitializer defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'when (this) {
                is KtClassOrObject -> {
                    getOrCreateClassInitializer().body
                }
                is KtPrimaryConstructor -> {
                    getContainingClassOrObject().getOrCreateClassInitializer().body
                }
                is KtSecondaryConstructor -> {
                    bodyExpression ?: add(psiFactory.createEmptyBody())
                }
                else -> null
            }' @ [558:20] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: PsiElement?, entry1: PsiElement?, entry2: PsiElement?, entry3: PsiElement?): PsiElement?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> PsiElement?

'this' @ [558:26] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.moveFieldInitializations.getConstructorBodyBlock[ReceiverParameterDescriptorImpl]

'getOrCreateClassInitializer' @ [560:21] ==> local final fun KtClassOrObject.getOrCreateClassInitializer(): KtAnonymousInitializer defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.moveFieldInitializations[SimpleFunctionDescriptorImpl]

'body' @ [560:51] ==> public abstract val body: KtExpression? defined in org.jetbrains.kotlin.psi.KtAnonymousInitializer[DeserializedPropertyDescriptor]

'getContainingClassOrObject' @ [563:21] ==> public open fun getContainingClassOrObject(): KtClassOrObject defined in org.jetbrains.kotlin.psi.KtPrimaryConstructor[DeserializedSimpleFunctionDescriptor]

'getOrCreateClassInitializer' @ [563:50] ==> local final fun KtClassOrObject.getOrCreateClassInitializer(): KtAnonymousInitializer defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.moveFieldInitializations[SimpleFunctionDescriptorImpl]

'body' @ [563:80] ==> public abstract val body: KtExpression? defined in org.jetbrains.kotlin.psi.KtAnonymousInitializer[DeserializedPropertyDescriptor]

'bodyExpression' @ [566:21] ==> public final val KtSecondaryConstructor.bodyExpression: KtBlockExpression?[MyPropertyDescriptor]

'add' @ [566:39] ==> public abstract fun add(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtElement[JavaMethodDescriptor]

'psiFactory' @ [566:43] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.moveFieldInitializations[LocalVariableDescriptor]

'createEmptyBody' @ [566:54] ==> public final fun createEmptyBody(): KtBlockExpression defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'superTypeListEntries' @ [573:20] ==> public final val KtClassOrObject.superTypeListEntries: List<KtSuperTypeListEntry>[MyPropertyDescriptor]

'singleOrNull' @ [573:41] ==> public inline fun <T> Iterable<KtSuperTypeListEntry>.singleOrNull(predicate: (KtSuperTypeListEntry) -> Boolean): KtSuperTypeListEntry? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtSuperTypeListEntry

'it' @ [573:56] ==> value-parameter it: KtSuperTypeListEntry defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.moveFieldInitializations.getDelegatorToSuperCall.<anonymous>[ValueParameterDescriptorImpl]

'!' @ [577:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'info' @ [577:18] ==> value-parameter info: KotlinPullUpHelper.InitializerInfo defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.moveFieldInitializations.addUsedParameters[ValueParameterDescriptorImpl]

'usedParameters' @ [577:23] ==> public final val usedParameters: Set<KtParameter> defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.InitializerInfo[PropertyDescriptorImpl]

'isNotEmpty' @ [577:38] ==> @InlineOnly public inline fun <T> Collection<KtParameter>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtParameter

'when (constructorElement) {
                is KtConstructor<*> -> constructorElement
                is KtClass -> constructorElement.createPrimaryConstructorIfAbsent()
                else -> return
            }' @ [578:49] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KtConstructor<*>, entry1: KtConstructor<*>, entry2: KtConstructor<*>): KtConstructor<*>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KtConstructor<*>

'constructorElement' @ [578:55] ==> value-parameter constructorElement: KtElement defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.moveFieldInitializations.addUsedParameters[ValueParameterDescriptorImpl]

'constructorElement' @ [579:40] ==> value-parameter constructorElement: KtElement defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.moveFieldInitializations.addUsedParameters[ValueParameterDescriptorImpl]

'constructorElement' @ [580:31] ==> value-parameter constructorElement: KtElement defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.moveFieldInitializations.addUsedParameters[ValueParameterDescriptorImpl]

'createPrimaryConstructorIfAbsent' @ [580:50] ==> public fun KtClass.createPrimaryConstructorIfAbsent(): KtPrimaryConstructor defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'with' @ [584:13] ==> @InlineOnly public inline fun <T, R> with(receiver: KtParameterList, block: KtParameterList.() -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtParameterList
    <R> -> Unit

'constructor' @ [584:18] ==> val constructor: KtConstructor<*> defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.moveFieldInitializations.addUsedParameters[LocalVariableDescriptor]

'getValueParameterList' @ [584:30] ==> public open fun getValueParameterList(): KtParameterList? defined in org.jetbrains.kotlin.psi.KtConstructor[DeserializedSimpleFunctionDescriptor]

'info' @ [585:17] ==> value-parameter info: KotlinPullUpHelper.InitializerInfo defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.moveFieldInitializations.addUsedParameters[ValueParameterDescriptorImpl]

'usedParameters' @ [585:22] ==> public final val usedParameters: Set<KtParameter> defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.InitializerInfo[PropertyDescriptorImpl]

'forEach' @ [585:37] ==> @HidesMembers public inline fun <T> Iterable<KtParameter>.forEach(action: (KtParameter) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtParameter

'addParameter' @ [586:40] ==> @NotNull public open fun addParameter(@NotNull p0: KtParameter): KtParameter defined in org.jetbrains.kotlin.psi.KtParameterList[JavaMethodDescriptor]

'it' @ [586:53] ==> value-parameter it: KtParameter defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.moveFieldInitializations.addUsedParameters.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'data' @ [587:40] ==> private final val data: KotlinPullUpData defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper[PropertyDescriptorImpl]

'sourceClassContext' @ [587:45] ==> public final val sourceClassContext: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpData[PropertyDescriptorImpl]

'VALUE_PARAMETER' @ [587:79] ==> public final val VALUE_PARAMETER: (WritableSlice<(KtParameter..KtParameter?), (VariableDescriptor..VariableDescriptor?)>..WritableSlice<(KtParameter..KtParameter?), (VariableDescriptor..VariableDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'it' @ [587:96] ==> value-parameter it: KtParameter defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.moveFieldInitializations.addUsedParameters.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [587:102] ==> public final val VariableDescriptor.type: KotlinType[MyPropertyDescriptor]

'newParameter' @ [588:21] ==> val newParameter: KtParameter defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.moveFieldInitializations.addUsedParameters.<anonymous>.<anonymous>[LocalVariableDescriptor]

'setType' @ [588:34] ==> public fun KtCallableDeclaration.setType(type: KotlinType, shortenReferences: Boolean = ...): Unit defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'data' @ [588:42] ==> private final val data: KotlinPullUpData defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper[PropertyDescriptorImpl]

'sourceToTargetClassSubstitutor' @ [588:47] ==> public final val sourceToTargetClassSubstitutor: TypeSubstitutor defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpData[PropertyDescriptorImpl]

'substitute' @ [588:78] ==> @Nullable public open fun substitute(@NotNull p0: KotlinType, @NotNull p1: Variance): KotlinType? defined in org.jetbrains.kotlin.types.TypeSubstitutor[JavaMethodDescriptor]

'originalType' @ [588:89] ==> val originalType: KotlinType defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.moveFieldInitializations.addUsedParameters.<anonymous>.<anonymous>[LocalVariableDescriptor]

'INVARIANT' @ [588:112] ==> enum entry INVARIANT defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'originalType' @ [588:126] ==> val originalType: KotlinType defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.moveFieldInitializations.addUsedParameters.<anonymous>.<anonymous>[LocalVariableDescriptor]

'newParameter' @ [589:21] ==> val newParameter: KtParameter defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.moveFieldInitializations.addUsedParameters.<anonymous>.<anonymous>[LocalVariableDescriptor]

'typeReference' @ [589:34] ==> public final var KtParameter.typeReference: KtTypeReference?[MyPropertyDescriptor]

'addToShorteningWaitSet' @ [589:50] ==> public fun KtElement.addToShorteningWaitSet(options: ShortenReferences.Options = ...): Unit defined in org.jetbrains.kotlin.idea.codeInsight.shorten[DeserializedSimpleFunctionDescriptor]

'targetToSourceConstructors' @ [592:13] ==> private final val targetToSourceConstructors: LinkedHashMap<KtElement, MutableList<KtElement>> defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper[PropertyDescriptorImpl]

'constructorElement' @ [592:40] ==> value-parameter constructorElement: KtElement defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.moveFieldInitializations.addUsedParameters[ValueParameterDescriptorImpl]

'forEach' @ [592:62] ==> @HidesMembers public inline fun <T> Iterable<KtElement>.forEach(action: (KtElement) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtElement

'when (it) {
                    is KtClassOrObject -> it.getDelegatorToSuperCall()
                    is KtPrimaryConstructor -> it.getContainingClassOrObject().getDelegatorToSuperCall()
                    is KtSecondaryConstructor -> {
                        if (it.hasImplicitDelegationCall()) {
                            it.replaceImplicitDelegationCallWithExplicit(false)
                        }
                        else {
                            it.getDelegationCall()
                        }
                    }
                    else -> null
                }' @ [593:49] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KtCallElement?, entry1: KtCallElement?, entry2: KtCallElement?, entry3: KtCallElement?): KtCallElement?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KtCallElement?

'it' @ [593:55] ==> value-parameter it: KtElement defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.moveFieldInitializations.addUsedParameters.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [594:43] ==> value-parameter it: KtElement defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.moveFieldInitializations.addUsedParameters.<anonymous>[ValueParameterDescriptorImpl]

'getDelegatorToSuperCall' @ [594:46] ==> local final fun KtClassOrObject.getDelegatorToSuperCall(): KtSuperTypeCallEntry? defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.moveFieldInitializations[SimpleFunctionDescriptorImpl]

'it' @ [595:48] ==> value-parameter it: KtElement defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.moveFieldInitializations.addUsedParameters.<anonymous>[ValueParameterDescriptorImpl]

'getContainingClassOrObject' @ [595:51] ==> public open fun getContainingClassOrObject(): KtClassOrObject defined in org.jetbrains.kotlin.psi.KtPrimaryConstructor[DeserializedSimpleFunctionDescriptor]

'getDelegatorToSuperCall' @ [595:80] ==> local final fun KtClassOrObject.getDelegatorToSuperCall(): KtSuperTypeCallEntry? defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.moveFieldInitializations[SimpleFunctionDescriptorImpl]

'if (it.hasImplicitDelegationCall()) {
                            it.replaceImplicitDelegationCallWithExplicit(false)
                        }
                        else {
                            it.getDelegationCall()
                        }' @ [597:25] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtConstructorDelegationCall, elseBranch: KtConstructorDelegationCall): KtConstructorDelegationCall[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtConstructorDelegationCall

'it' @ [597:29] ==> value-parameter it: KtElement defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.moveFieldInitializations.addUsedParameters.<anonymous>[ValueParameterDescriptorImpl]

'hasImplicitDelegationCall' @ [597:32] ==> public final fun hasImplicitDelegationCall(): Boolean defined in org.jetbrains.kotlin.psi.KtSecondaryConstructor[DeserializedSimpleFunctionDescriptor]

'it' @ [598:29] ==> value-parameter it: KtElement defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.moveFieldInitializations.addUsedParameters.<anonymous>[ValueParameterDescriptorImpl]

'replaceImplicitDelegationCallWithExplicit' @ [598:32] ==> public final fun replaceImplicitDelegationCallWithExplicit(isThis: Boolean): KtConstructorDelegationCall defined in org.jetbrains.kotlin.psi.KtSecondaryConstructor[DeserializedSimpleFunctionDescriptor]

'it' @ [601:29] ==> value-parameter it: KtElement defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.moveFieldInitializations.addUsedParameters.<anonymous>[ValueParameterDescriptorImpl]

'getDelegationCall' @ [601:32] ==> public final fun getDelegationCall(): KtConstructorDelegationCall defined in org.jetbrains.kotlin.psi.KtSecondaryConstructor[DeserializedSimpleFunctionDescriptor]

'superCall' @ [606:17] ==> val superCall: KtCallElement? defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.moveFieldInitializations.addUsedParameters.<anonymous>[LocalVariableDescriptor]

'valueArgumentList' @ [606:28] ==> public final val KtCallElement.valueArgumentList: KtValueArgumentList?[MyPropertyDescriptor]

'let' @ [606:47] ==> @InlineOnly public inline fun <T, R> KtValueArgumentList.let(block: (KtValueArgumentList) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtValueArgumentList
    <R> -> Unit

'info' @ [607:21] ==> value-parameter info: KotlinPullUpHelper.InitializerInfo defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.moveFieldInitializations.addUsedParameters[ValueParameterDescriptorImpl]

'usedParameters' @ [607:26] ==> public final val usedParameters: Set<KtParameter> defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.InitializerInfo[PropertyDescriptorImpl]

'forEach' @ [607:41] ==> @HidesMembers public inline fun <T> Iterable<KtParameter>.forEach(action: (KtParameter) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtParameter

'args' @ [608:25] ==> value-parameter args: KtValueArgumentList defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.moveFieldInitializations.addUsedParameters.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'addArgument' @ [608:30] ==> @NotNull public open fun addArgument(@NotNull p0: KtValueArgument): KtValueArgument defined in org.jetbrains.kotlin.psi.KtValueArgumentList[JavaMethodDescriptor]

'psiFactory' @ [608:42] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.moveFieldInitializations[LocalVariableDescriptor]

'createArgument' @ [608:53] ==> public final fun createArgument(expression: KtExpression?, name: Name? = ..., isSpread: Boolean = ...): KtValueArgument defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'psiFactory' @ [608:68] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.moveFieldInitializations[LocalVariableDescriptor]

'createExpression' @ [608:79] ==> public final fun createExpression(text: String): KtExpression defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'it' @ [608:96] ==> value-parameter it: KtParameter defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.moveFieldInitializations.addUsedParameters.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [608:99] ==> public final val KtParameter.name: String?[MyPropertyDescriptor]

'component1' @ [614:15] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<KtElement, Map<KtProperty, KotlinPullUpHelper.InitializerInfo>>.component1(): KtElement defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> KtElement
    <V> -> Map<KtProperty, InitializerInfo>

'component2' @ [614:35] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<KtElement, Map<KtProperty, KotlinPullUpHelper.InitializerInfo>>.component2(): Map<KtProperty, KotlinPullUpHelper.InitializerInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> KtElement
    <V> -> Map<KtProperty, InitializerInfo>

'targetConstructorToPropertyInitializerInfoMap' @ [614:65] ==> private final val targetConstructorToPropertyInitializerInfoMap: LinkedHashMap<KtElement, Map<KtProperty, KotlinPullUpHelper.InitializerInfo>> defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper[PropertyDescriptorImpl]

'entries' @ [614:111] ==> public open val entries: MutableSet<MutableMap.MutableEntry<KtElement, Map<KtProperty, KotlinPullUpHelper.InitializerInfo>>> defined in java.util.LinkedHashMap[JavaPropertyDescriptor]

'propertyToInitializerInfo' @ [615:30] ==> val propertyToInitializerInfo: Map<KtProperty, KotlinPullUpHelper.InitializerInfo> defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.moveFieldInitializations[LocalVariableDescriptor]

'keys' @ [615:56] ==> public abstract val keys: Set<KtProperty> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'sortedWith' @ [615:61] ==> public fun <T> Iterable<KtProperty>.sortedWith(comparator: Comparator<in KtProperty> /* = Comparator<in KtProperty> */): List<KtProperty> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtProperty

'Comparator' @ [616:21] ==> @FunctionalInterface public fun <T : (Any..Any?)> Comparator(function: ((KtProperty..KtProperty?), (KtProperty..KtProperty?)) -> Int): Comparator<KtProperty> defined in java.util[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : (Any..Any?)> -> KtProperty

'propertyToInitializerInfo' @ [617:37] ==> val propertyToInitializerInfo: Map<KtProperty, KotlinPullUpHelper.InitializerInfo> defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.moveFieldInitializations[LocalVariableDescriptor]

'property1' @ [617:63] ==> value-parameter property1: (KtProperty..KtProperty?) defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.moveFieldInitializations.<anonymous>[ValueParameterDescriptorImpl]

'propertyToInitializerInfo' @ [618:37] ==> val propertyToInitializerInfo: Map<KtProperty, KotlinPullUpHelper.InitializerInfo> defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.moveFieldInitializations[LocalVariableDescriptor]

'property2' @ [618:63] ==> value-parameter property2: (KtProperty..KtProperty?) defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.moveFieldInitializations.<anonymous>[ValueParameterDescriptorImpl]

'when {
                            property2 in info1.usedProperties -> -1
                            property1 in info2.usedProperties -> 1
                            else -> 0
                        }' @ [619:25] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Int, entry1: Int, entry2: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Int

'property2' @ [620:29] ==> value-parameter property2: (KtProperty..KtProperty?) defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.moveFieldInitializations.<anonymous>[ValueParameterDescriptorImpl]

'info1' @ [620:42] ==> val info1: KotlinPullUpHelper.InitializerInfo defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.moveFieldInitializations.<anonymous>[LocalVariableDescriptor]

'usedProperties' @ [620:48] ==> public final val usedProperties: Set<KtProperty> defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.InitializerInfo[PropertyDescriptorImpl]

'-' @ [620:66] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'property1' @ [621:29] ==> value-parameter property1: (KtProperty..KtProperty?) defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.moveFieldInitializations.<anonymous>[ValueParameterDescriptorImpl]

'info2' @ [621:42] ==> val info2: KotlinPullUpHelper.InitializerInfo defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.moveFieldInitializations.<anonymous>[LocalVariableDescriptor]

'usedProperties' @ [621:48] ==> public final val usedProperties: Set<KtProperty> defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.InitializerInfo[PropertyDescriptorImpl]

'properties' @ [627:33] ==> val properties: List<KtProperty> defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.moveFieldInitializations[LocalVariableDescriptor]

'propertyToInitializerInfo' @ [628:28] ==> val propertyToInitializerInfo: Map<KtProperty, KotlinPullUpHelper.InitializerInfo> defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.moveFieldInitializations[LocalVariableDescriptor]

'oldProperty' @ [628:54] ==> val oldProperty: KtProperty defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.moveFieldInitializations[LocalVariableDescriptor]

'addUsedParameters' @ [630:17] ==> local final fun addUsedParameters(constructorElement: KtElement, info: KotlinPullUpHelper.InitializerInfo): Unit defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.moveFieldInitializations[SimpleFunctionDescriptorImpl]

'constructorElement' @ [630:35] ==> val constructorElement: KtElement defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.moveFieldInitializations[LocalVariableDescriptor]

'info' @ [630:55] ==> val info: KotlinPullUpHelper.InitializerInfo defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.moveFieldInitializations[LocalVariableDescriptor]

'info' @ [632:17] ==> val info: KotlinPullUpHelper.InitializerInfo defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.moveFieldInitializations[LocalVariableDescriptor]

'initializer' @ [632:22] ==> public final val initializer: KtExpression? defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.InitializerInfo[PropertyDescriptorImpl]

'let' @ [632:35] ==> @InlineOnly public inline fun <T, R> KtExpression.let(block: (KtExpression) -> PsiElement?): PsiElement? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression
    <R> -> PsiElement?

'constructorElement' @ [633:32] ==> val constructorElement: KtElement defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.moveFieldInitializations[LocalVariableDescriptor]

'getConstructorBodyBlock' @ [633:51] ==> local final fun KtElement.getConstructorBodyBlock(): KtBlockExpression? defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.moveFieldInitializations[SimpleFunctionDescriptorImpl]

'body' @ [634:21] ==> val body: KtBlockExpression? defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.moveFieldInitializations.<anonymous>[LocalVariableDescriptor]

'addAfter' @ [634:27] ==> public open fun addAfter(@NotNull p0: PsiElement, p1: PsiElement?): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtBlockExpression[JavaMethodDescriptor]

'it' @ [634:36] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.moveFieldInitializations.<anonymous>[ValueParameterDescriptorImpl]

'body' @ [634:40] ==> val body: KtBlockExpression? defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.moveFieldInitializations.<anonymous>[LocalVariableDescriptor]

'statements' @ [634:45] ==> public final val KtBlockExpression.statements: List<(KtExpression..KtExpression?)>[MyPropertyDescriptor]

'lastOrNull' @ [634:56] ==> public fun <T> List<(KtExpression..KtExpression?)>.lastOrNull(): KtExpression? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtExpression..org.jetbrains.kotlin.psi.KtExpression?)

'body' @ [634:72] ==> val body: KtBlockExpression? defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.moveFieldInitializations.<anonymous>[LocalVariableDescriptor]

'lBrace' @ [634:77] ==> public final val KtBlockExpression.lBrace: PsiElement?[MyPropertyDescriptor]

'info' @ [636:17] ==> val info: KotlinPullUpHelper.InitializerInfo defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.moveFieldInitializations[LocalVariableDescriptor]

'elementsToRemove' @ [636:22] ==> public final val elementsToRemove: Set<KtElement> defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.InitializerInfo[PropertyDescriptorImpl]

'forEach' @ [636:39] ==> @HidesMembers public inline fun <T> Iterable<KtElement>.forEach(action: (KtElement) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtElement

'it' @ [636:49] ==> value-parameter it: KtElement defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper.moveFieldInitializations.<anonymous>[ValueParameterDescriptorImpl]

'delete' @ [636:52] ==> public abstract fun delete(): Unit defined in org.jetbrains.kotlin.psi.KtElement[JavaMethodDescriptor]

