'KtTreeVisitorVoid' @ [49:36] ==> public constructor KtTreeVisitorVoid() defined in org.jetbrains.kotlin.psi.KtTreeVisitorVoid[JavaClassConstructorDescriptor]

'super' @ [51:21] ==> <this> defined in org.jetbrains.kotlin.resolve.checkers.ClassifierUsageChecker.Companion.check.<no name provided>[LazyClassReceiverParameterDescriptor]

'visitReferenceExpression' @ [51:27] ==> public open fun visitReferenceExpression(@NotNull expression: KtReferenceExpression): Unit defined in org.jetbrains.kotlin.psi.KtTreeVisitorVoid[JavaMethodDescriptor]

'expression' @ [51:52] ==> value-parameter expression: KtReferenceExpression defined in org.jetbrains.kotlin.resolve.checkers.ClassifierUsageChecker.Companion.check.<no name provided>.visitReferenceExpression[ValueParameterDescriptorImpl]

'expression' @ [53:25] ==> value-parameter expression: KtReferenceExpression defined in org.jetbrains.kotlin.resolve.checkers.ClassifierUsageChecker.Companion.check.<no name provided>.visitReferenceExpression[ValueParameterDescriptorImpl]

'expression' @ [53:68] ==> value-parameter expression: KtReferenceExpression defined in org.jetbrains.kotlin.resolve.checkers.ClassifierUsageChecker.Companion.check.<no name provided>.visitReferenceExpression[ValueParameterDescriptorImpl]

'getReferencedNameElementType' @ [53:79] ==> public open fun getReferencedNameElementType(): IElementType defined in org.jetbrains.kotlin.psi.KtNameReferenceExpression[SimpleFunctionDescriptorImpl]

'SUPER_KEYWORD' @ [53:122] ==> public final val SUPER_KEYWORD: (KtKeywordToken..KtKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'getReferencedClassifier' @ [59:34] ==> private final fun getReferencedClassifier(expression: KtReferenceExpression): ClassifierDescriptor? defined in org.jetbrains.kotlin.resolve.checkers.ClassifierUsageChecker.Companion.check.<no name provided>[SimpleFunctionDescriptorImpl]

'expression' @ [59:58] ==> value-parameter expression: KtReferenceExpression defined in org.jetbrains.kotlin.resolve.checkers.ClassifierUsageChecker.Companion.check.<no name provided>.visitReferenceExpression[ValueParameterDescriptorImpl]

'runCheckersWithTarget' @ [61:21] ==> private final fun runCheckersWithTarget(target: ClassifierDescriptor, expression: KtReferenceExpression): Unit defined in org.jetbrains.kotlin.resolve.checkers.ClassifierUsageChecker.Companion.check.<no name provided>[SimpleFunctionDescriptorImpl]

'target' @ [61:43] ==> val target: ClassifierDescriptor defined in org.jetbrains.kotlin.resolve.checkers.ClassifierUsageChecker.Companion.check.<no name provided>.visitReferenceExpression[LocalVariableDescriptor]

'expression' @ [61:51] ==> value-parameter expression: KtReferenceExpression defined in org.jetbrains.kotlin.resolve.checkers.ClassifierUsageChecker.Companion.check.<no name provided>.visitReferenceExpression[ValueParameterDescriptorImpl]

'getReferenceToCompanionViaClassifier' @ [63:21] ==> private final fun getReferenceToCompanionViaClassifier(expression: KtReferenceExpression, target: ClassifierDescriptor): ClassifierDescriptor? defined in org.jetbrains.kotlin.resolve.checkers.ClassifierUsageChecker.Companion.check.<no name provided>[SimpleFunctionDescriptorImpl]

'expression' @ [63:58] ==> value-parameter expression: KtReferenceExpression defined in org.jetbrains.kotlin.resolve.checkers.ClassifierUsageChecker.Companion.check.<no name provided>.visitReferenceExpression[ValueParameterDescriptorImpl]

'target' @ [63:70] ==> val target: ClassifierDescriptor defined in org.jetbrains.kotlin.resolve.checkers.ClassifierUsageChecker.Companion.check.<no name provided>.visitReferenceExpression[LocalVariableDescriptor]

'let' @ [63:79] ==> @InlineOnly public inline fun <T, R> ClassifierDescriptor.let(block: (ClassifierDescriptor) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassifierDescriptor
    <R> -> Unit

'target' @ [64:42] ==> val target: ClassifierDescriptor defined in org.jetbrains.kotlin.resolve.checkers.ClassifierUsageChecker.Companion.check.<no name provided>.visitReferenceExpression[LocalVariableDescriptor]

'containingDeclaration' @ [64:49] ==> public final val ClassifierDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'runCheckersWithTarget' @ [65:25] ==> private final fun runCheckersWithTarget(target: ClassifierDescriptor, expression: KtReferenceExpression): Unit defined in org.jetbrains.kotlin.resolve.checkers.ClassifierUsageChecker.Companion.check.<no name provided>[SimpleFunctionDescriptorImpl]

'outerClass' @ [65:47] ==> val outerClass: ClassDescriptor defined in org.jetbrains.kotlin.resolve.checkers.ClassifierUsageChecker.Companion.check.<no name provided>.visitReferenceExpression.<anonymous>[LocalVariableDescriptor]

'expression' @ [65:59] ==> value-parameter expression: KtReferenceExpression defined in org.jetbrains.kotlin.resolve.checkers.ClassifierUsageChecker.Companion.check.<no name provided>.visitReferenceExpression[ValueParameterDescriptorImpl]

'referenceClassifier' @ [66:29] ==> value-parameter referenceClassifier: ClassifierDescriptor defined in org.jetbrains.kotlin.resolve.checkers.ClassifierUsageChecker.Companion.check.<no name provided>.visitReferenceExpression.<anonymous>[ValueParameterDescriptorImpl]

'runCheckersWithTarget' @ [67:29] ==> private final fun runCheckersWithTarget(target: ClassifierDescriptor, expression: KtReferenceExpression): Unit defined in org.jetbrains.kotlin.resolve.checkers.ClassifierUsageChecker.Companion.check.<no name provided>[SimpleFunctionDescriptorImpl]

'referenceClassifier' @ [67:51] ==> value-parameter referenceClassifier: ClassifierDescriptor defined in org.jetbrains.kotlin.resolve.checkers.ClassifierUsageChecker.Companion.check.<no name provided>.visitReferenceExpression.<anonymous>[ValueParameterDescriptorImpl]

'expression' @ [67:72] ==> value-parameter expression: KtReferenceExpression defined in org.jetbrains.kotlin.resolve.checkers.ClassifierUsageChecker.Companion.check.<no name provided>.visitReferenceExpression[ValueParameterDescriptorImpl]

'checkers' @ [73:37] ==> value-parameter checkers: Iterable<ClassifierUsageChecker> defined in org.jetbrains.kotlin.resolve.checkers.ClassifierUsageChecker.Companion.check[ValueParameterDescriptorImpl]

'checker' @ [74:25] ==> val checker: ClassifierUsageChecker defined in org.jetbrains.kotlin.resolve.checkers.ClassifierUsageChecker.Companion.check.<no name provided>.runCheckersWithTarget[LocalVariableDescriptor]

'check' @ [74:33] ==> public abstract fun check(targetDescriptor: ClassifierDescriptor, trace: BindingTrace, element: PsiElement, languageVersionSettings: LanguageVersionSettings): Unit defined in org.jetbrains.kotlin.resolve.checkers.ClassifierUsageChecker[SimpleFunctionDescriptorImpl]

'target' @ [74:39] ==> value-parameter target: ClassifierDescriptor defined in org.jetbrains.kotlin.resolve.checkers.ClassifierUsageChecker.Companion.check.<no name provided>.runCheckersWithTarget[ValueParameterDescriptorImpl]

'trace' @ [74:47] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.resolve.checkers.ClassifierUsageChecker.Companion.check[ValueParameterDescriptorImpl]

'expression' @ [74:54] ==> value-parameter expression: KtReferenceExpression defined in org.jetbrains.kotlin.resolve.checkers.ClassifierUsageChecker.Companion.check.<no name provided>.runCheckersWithTarget[ValueParameterDescriptorImpl]

'languageVersionSettings' @ [74:66] ==> value-parameter languageVersionSettings: LanguageVersionSettings defined in org.jetbrains.kotlin.resolve.checkers.ClassifierUsageChecker.Companion.check[ValueParameterDescriptorImpl]

'trace' @ [79:34] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.resolve.checkers.ClassifierUsageChecker.Companion.check[ValueParameterDescriptorImpl]

'get' @ [79:40] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(slice: (ReadOnlySlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>..ReadOnlySlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>?), key: (KtReferenceExpression..KtReferenceExpression?)): DeclarationDescriptor? defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> KtReferenceExpression
    <V : (Any..Any?)> -> DeclarationDescriptor

'REFERENCE_TARGET' @ [79:59] ==> public final val REFERENCE_TARGET: (WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>..WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'expression' @ [79:77] ==> value-parameter expression: KtReferenceExpression defined in org.jetbrains.kotlin.resolve.checkers.ClassifierUsageChecker.Companion.check.<no name provided>.getReferencedClassifier[ValueParameterDescriptorImpl]

'target' @ [80:25] ==> val target: ClassifierDescriptor? defined in org.jetbrains.kotlin.resolve.checkers.ClassifierUsageChecker.Companion.check.<no name provided>.getReferencedClassifier[LocalVariableDescriptor]

'target' @ [80:48] ==> val target: ClassifierDescriptor? defined in org.jetbrains.kotlin.resolve.checkers.ClassifierUsageChecker.Companion.check.<no name provided>.getReferencedClassifier[LocalVariableDescriptor]

'trace' @ [87:35] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.resolve.checkers.ClassifierUsageChecker.Companion.check[ValueParameterDescriptorImpl]

'get' @ [87:41] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(slice: (ReadOnlySlice<(KtExpression..KtExpression?), (MutableCollection<out (DeclarationDescriptor..DeclarationDescriptor?)>..Collection<(DeclarationDescriptor..DeclarationDescriptor?)>?)>..ReadOnlySlice<(KtExpression..KtExpression?), (MutableCollection<out (DeclarationDescriptor..DeclarationDescriptor?)>..Collection<(DeclarationDescriptor..DeclarationDescriptor?)>?)>?), key: (KtExpression..KtExpression?)): (MutableCollection<out (DeclarationDescriptor..DeclarationDescriptor?)>?..Collection<(DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> KtExpression
    <V : (Any..Any?)> -> (kotlin.collections.MutableCollection<out (org.jetbrains.kotlin.descriptors.DeclarationDescriptor..org.jetbrains.kotlin.descriptors.DeclarationDescriptor?)>..kotlin.collections.Collection<(org.jetbrains.kotlin.descriptors.DeclarationDescriptor..org.jetbrains.kotlin.descriptors.DeclarationDescriptor?)>)

'AMBIGUOUS_REFERENCE_TARGET' @ [87:60] ==> public final val AMBIGUOUS_REFERENCE_TARGET: (WritableSlice<(KtExpression..KtExpression?), (MutableCollection<out (DeclarationDescriptor..DeclarationDescriptor?)>..Collection<(DeclarationDescriptor..DeclarationDescriptor?)>?)>..WritableSlice<(KtExpression..KtExpression?), (MutableCollection<out (DeclarationDescriptor..DeclarationDescriptor?)>..Collection<(DeclarationDescriptor..DeclarationDescriptor?)>?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'expression' @ [87:88] ==> value-parameter expression: KtReferenceExpression defined in org.jetbrains.kotlin.resolve.checkers.ClassifierUsageChecker.Companion.check.<no name provided>.getReferencedClassifier[ValueParameterDescriptorImpl]

'targets' @ [88:25] ==> val targets: (MutableCollection<out (DeclarationDescriptor..DeclarationDescriptor?)>..Collection<(DeclarationDescriptor..DeclarationDescriptor?)>) defined in org.jetbrains.kotlin.resolve.checkers.ClassifierUsageChecker.Companion.check.<no name provided>.getReferencedClassifier[LocalVariableDescriptor]

'groupBy' @ [88:33] ==> public inline fun <T, K> Iterable<(DeclarationDescriptor..DeclarationDescriptor?)>.groupBy(keySelector: ((DeclarationDescriptor..DeclarationDescriptor?)) -> SourceElement?): Map<SourceElement?, List<(DeclarationDescriptor..DeclarationDescriptor?)>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.DeclarationDescriptor..org.jetbrains.kotlin.descriptors.DeclarationDescriptor?)
    <K> -> SourceElement?

'it' @ [88:44] ==> value-parameter it: (DeclarationDescriptor..DeclarationDescriptor?) defined in org.jetbrains.kotlin.resolve.checkers.ClassifierUsageChecker.Companion.check.<no name provided>.getReferencedClassifier.<anonymous>[ValueParameterDescriptorImpl]

'source' @ [88:85] ==> public final val DeclarationDescriptorWithSource.source: SourceElement[MyPropertyDescriptor]

'size' @ [88:94] ==> public abstract val size: Int defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'targets' @ [89:28] ==> val targets: (MutableCollection<out (DeclarationDescriptor..DeclarationDescriptor?)>..Collection<(DeclarationDescriptor..DeclarationDescriptor?)>) defined in org.jetbrains.kotlin.resolve.checkers.ClassifierUsageChecker.Companion.check.<no name provided>.getReferencedClassifier[LocalVariableDescriptor]

'filterIsInstance' @ [89:36] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<ClassifierDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> ClassifierDescriptor

'singleOrNull' @ [89:77] ==> public fun <T> List<ClassifierDescriptor>.singleOrNull(): ClassifierDescriptor? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassifierDescriptor

'!' @ [93:25] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isCompanionObject' @ [93:42] ==> public open fun isCompanionObject(@Nullable p0: DeclarationDescriptor?): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'target' @ [93:60] ==> value-parameter target: ClassifierDescriptor defined in org.jetbrains.kotlin.resolve.checkers.ClassifierUsageChecker.Companion.check.<no name provided>.getReferenceToCompanionViaClassifier[ValueParameterDescriptorImpl]

'trace' @ [94:28] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.resolve.checkers.ClassifierUsageChecker.Companion.check[ValueParameterDescriptorImpl]

'get' @ [94:34] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(slice: (ReadOnlySlice<(KtReferenceExpression..KtReferenceExpression?), (ClassifierDescriptorWithTypeParameters..ClassifierDescriptorWithTypeParameters?)>..ReadOnlySlice<(KtReferenceExpression..KtReferenceExpression?), (ClassifierDescriptorWithTypeParameters..ClassifierDescriptorWithTypeParameters?)>?), key: (KtReferenceExpression..KtReferenceExpression?)): ClassifierDescriptorWithTypeParameters? defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> KtReferenceExpression
    <V : (Any..Any?)> -> ClassifierDescriptorWithTypeParameters

'SHORT_REFERENCE_TO_COMPANION_OBJECT' @ [94:53] ==> public final val SHORT_REFERENCE_TO_COMPANION_OBJECT: (WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (ClassifierDescriptorWithTypeParameters..ClassifierDescriptorWithTypeParameters?)>..WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (ClassifierDescriptorWithTypeParameters..ClassifierDescriptorWithTypeParameters?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'expression' @ [94:90] ==> value-parameter expression: KtReferenceExpression defined in org.jetbrains.kotlin.resolve.checkers.ClassifierUsageChecker.Companion.check.<no name provided>.getReferenceToCompanionViaClassifier[ValueParameterDescriptorImpl]

'declarations' @ [98:33] ==> value-parameter declarations: Collection<PsiElement> defined in org.jetbrains.kotlin.resolve.checkers.ClassifierUsageChecker.Companion.check[ValueParameterDescriptorImpl]

'declaration' @ [99:17] ==> val declaration: PsiElement defined in org.jetbrains.kotlin.resolve.checkers.ClassifierUsageChecker.Companion.check[LocalVariableDescriptor]

'accept' @ [99:29] ==> public abstract fun accept(@NotNull p0: PsiElementVisitor): Unit defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'visitor' @ [99:36] ==> val visitor: <no name provided> defined in org.jetbrains.kotlin.resolve.checkers.ClassifierUsageChecker.Companion.check[LocalVariableDescriptor]

