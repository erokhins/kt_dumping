'AbstractKotlinInspection' @ [37:39] ==> public constructor AbstractKotlinInspection() defined in org.jetbrains.kotlin.idea.inspections.AbstractKotlinInspection[DeserializedClassConstructorDescriptor]

'klass' @ [40:13] ==> value-parameter klass: KtClassOrObject defined in org.jetbrains.kotlin.idea.inspections.AddVarianceModifierInspection.checkClassOrObject[ValueParameterDescriptorImpl]

'!' @ [41:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'checkClassHeader' @ [41:18] ==> public final fun checkClassHeader(klass: KtClass): Boolean defined in org.jetbrains.kotlin.resolve.VarianceCheckerCore[DeserializedSimpleFunctionDescriptor]

'klass' @ [41:35] ==> value-parameter klass: KtClassOrObject defined in org.jetbrains.kotlin.idea.inspections.AddVarianceModifierInspection.checkClassOrObject[ValueParameterDescriptorImpl]

'klass' @ [42:17] ==> value-parameter klass: KtClassOrObject defined in org.jetbrains.kotlin.idea.inspections.AddVarianceModifierInspection.checkClassOrObject[ValueParameterDescriptorImpl]

'getSuperTypeList' @ [42:23] ==> public final fun getSuperTypeList(): KtSuperTypeList? defined in org.jetbrains.kotlin.psi.KtClassOrObject[DeserializedSimpleFunctionDescriptor]

'anyDescendantOfType' @ [42:43] ==> public inline fun <reified T : PsiElement> PsiElement.anyDescendantOfType(noinline predicate: (KtClassOrObject) -> Boolean = ...): Boolean defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtClassOrObject

'!' @ [42:82] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'checkClassOrObject' @ [42:83] ==> private final fun VarianceCheckerCore.checkClassOrObject(klass: KtClassOrObject): Boolean defined in org.jetbrains.kotlin.idea.inspections.AddVarianceModifierInspection[SimpleFunctionDescriptorImpl]

'it' @ [42:102] ==> value-parameter it: KtClassOrObject defined in org.jetbrains.kotlin.idea.inspections.AddVarianceModifierInspection.checkClassOrObject.<anonymous>[ValueParameterDescriptorImpl]

'klass' @ [44:24] ==> value-parameter klass: KtClassOrObject defined in org.jetbrains.kotlin.idea.inspections.AddVarianceModifierInspection.checkClassOrObject[ValueParameterDescriptorImpl]

'declarations' @ [44:30] ==> public final val KtClassOrObject.declarations: List<KtDeclaration>[MyPropertyDescriptor]

'klass' @ [44:45] ==> value-parameter klass: KtClassOrObject defined in org.jetbrains.kotlin.idea.inspections.AddVarianceModifierInspection.checkClassOrObject[ValueParameterDescriptorImpl]

'primaryConstructorParameters' @ [44:51] ==> public final val KtClassOrObject.primaryConstructorParameters: List<KtParameter>[MyPropertyDescriptor]

'when (member) {
                                 is KtParameter -> context.get(BindingContext.PRIMARY_CONSTRUCTOR_PARAMETER, member)
                                 else -> context.get(BindingContext.DECLARATION_TO_DESCRIPTOR, member)
                             }' @ [45:30] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: DeclarationDescriptor?, entry1: DeclarationDescriptor?): DeclarationDescriptor?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> DeclarationDescriptor?

'member' @ [45:36] ==> val member: KtDeclaration defined in org.jetbrains.kotlin.idea.inspections.AddVarianceModifierInspection.checkClassOrObject[LocalVariableDescriptor]

'context' @ [46:52] ==> public final val context: BindingContext defined in org.jetbrains.kotlin.resolve.VarianceCheckerCore[DeserializedPropertyDescriptor]

'get' @ [46:60] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(p0: (ReadOnlySlice<(PsiElement..PsiElement?), (PropertyDescriptor..PropertyDescriptor?)>..ReadOnlySlice<(PsiElement..PsiElement?), (PropertyDescriptor..PropertyDescriptor?)>?), p1: (PsiElement..PsiElement?)): PropertyDescriptor? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> PsiElement
    <V : (Any..Any?)> -> PropertyDescriptor

'PRIMARY_CONSTRUCTOR_PARAMETER' @ [46:79] ==> public final val PRIMARY_CONSTRUCTOR_PARAMETER: (WritableSlice<(PsiElement..PsiElement?), (PropertyDescriptor..PropertyDescriptor?)>..WritableSlice<(PsiElement..PsiElement?), (PropertyDescriptor..PropertyDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'member' @ [46:110] ==> val member: KtDeclaration defined in org.jetbrains.kotlin.idea.inspections.AddVarianceModifierInspection.checkClassOrObject[LocalVariableDescriptor]

'context' @ [47:42] ==> public final val context: BindingContext defined in org.jetbrains.kotlin.resolve.VarianceCheckerCore[DeserializedPropertyDescriptor]

'get' @ [47:50] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(p0: (ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>..ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>?), p1: (PsiElement..PsiElement?)): DeclarationDescriptor? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> PsiElement
    <V : (Any..Any?)> -> DeclarationDescriptor

'DECLARATION_TO_DESCRIPTOR' @ [47:69] ==> public final val DECLARATION_TO_DESCRIPTOR: (ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>..ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'member' @ [47:96] ==> val member: KtDeclaration defined in org.jetbrains.kotlin.idea.inspections.AddVarianceModifierInspection.checkClassOrObject[LocalVariableDescriptor]

'when (member) {
                is KtClassOrObject -> {
                    if (!checkClassOrObject(member)) return false
                }
                is KtCallableDeclaration -> {
                    if (descriptor is CallableMemberDescriptor && !checkMember(member, descriptor)) return false
                    if (member.anyDescendantOfType<KtClassOrObject> { !checkClassOrObject(it) }) return false
                }
            }' @ [49:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'member' @ [49:19] ==> val member: KtDeclaration defined in org.jetbrains.kotlin.idea.inspections.AddVarianceModifierInspection.checkClassOrObject[LocalVariableDescriptor]

'!' @ [51:25] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'checkClassOrObject' @ [51:26] ==> private final fun VarianceCheckerCore.checkClassOrObject(klass: KtClassOrObject): Boolean defined in org.jetbrains.kotlin.idea.inspections.AddVarianceModifierInspection[SimpleFunctionDescriptorImpl]

'member' @ [51:45] ==> val member: KtDeclaration defined in org.jetbrains.kotlin.idea.inspections.AddVarianceModifierInspection.checkClassOrObject[LocalVariableDescriptor]

'descriptor' @ [54:25] ==> val descriptor: MemberDescriptor defined in org.jetbrains.kotlin.idea.inspections.AddVarianceModifierInspection.checkClassOrObject[LocalVariableDescriptor]

'!' @ [54:67] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'checkMember' @ [54:68] ==> public final fun checkMember(member: KtCallableDeclaration, descriptor: CallableMemberDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.VarianceCheckerCore[DeserializedSimpleFunctionDescriptor]

'member' @ [54:80] ==> val member: KtDeclaration defined in org.jetbrains.kotlin.idea.inspections.AddVarianceModifierInspection.checkClassOrObject[LocalVariableDescriptor]

'descriptor' @ [54:88] ==> val descriptor: MemberDescriptor defined in org.jetbrains.kotlin.idea.inspections.AddVarianceModifierInspection.checkClassOrObject[LocalVariableDescriptor]

'member' @ [55:25] ==> val member: KtDeclaration defined in org.jetbrains.kotlin.idea.inspections.AddVarianceModifierInspection.checkClassOrObject[LocalVariableDescriptor]

'anyDescendantOfType' @ [55:32] ==> public inline fun <reified T : PsiElement> PsiElement.anyDescendantOfType(noinline predicate: (KtClassOrObject) -> Boolean = ...): Boolean defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtClassOrObject

'!' @ [55:71] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'checkClassOrObject' @ [55:72] ==> private final fun VarianceCheckerCore.checkClassOrObject(klass: KtClassOrObject): Boolean defined in org.jetbrains.kotlin.idea.inspections.AddVarianceModifierInspection[SimpleFunctionDescriptorImpl]

'it' @ [55:91] ==> value-parameter it: KtClassOrObject defined in org.jetbrains.kotlin.idea.inspections.AddVarianceModifierInspection.checkClassOrObject.<anonymous>[ValueParameterDescriptorImpl]

'KtVisitorVoid' @ [63:25] ==> public constructor KtVisitorVoid() defined in org.jetbrains.kotlin.psi.KtVisitorVoid[JavaClassConstructorDescriptor]

'VarianceCheckerCore' @ [70:17] ==> public constructor VarianceCheckerCore(context: BindingContext, diagnosticSink: DiagnosticSink, manualVariance: ManualVariance? = ...) defined in org.jetbrains.kotlin.resolve.VarianceCheckerCore[DeserializedClassConstructorDescriptor]

'context' @ [71:21] ==> value-parameter context: BindingContext defined in org.jetbrains.kotlin.idea.inspections.AddVarianceModifierInspection.buildVisitor.<no name provided>.variancePossible[ValueParameterDescriptorImpl]

'DO_NOTHING' @ [72:36] ==> public final val DO_NOTHING: (DiagnosticSink..DiagnosticSink?) defined in org.jetbrains.kotlin.diagnostics.DiagnosticSink[JavaPropertyDescriptor]

'ManualVariance' @ [73:21] ==> public constructor ManualVariance(descriptor: TypeParameterDescriptor, variance: Variance) defined in org.jetbrains.kotlin.resolve.ManualVariance[DeserializedClassConstructorDescriptor]

'parameterDescriptor' @ [73:36] ==> value-parameter parameterDescriptor: TypeParameterDescriptor defined in org.jetbrains.kotlin.idea.inspections.AddVarianceModifierInspection.buildVisitor.<no name provided>.variancePossible[ValueParameterDescriptorImpl]

'variance' @ [73:57] ==> value-parameter variance: Variance defined in org.jetbrains.kotlin.idea.inspections.AddVarianceModifierInspection.buildVisitor.<no name provided>.variancePossible[ValueParameterDescriptorImpl]

'checkClassOrObject' @ [74:15] ==> private final fun VarianceCheckerCore.checkClassOrObject(klass: KtClassOrObject): Boolean defined in org.jetbrains.kotlin.idea.inspections.AddVarianceModifierInspection[SimpleFunctionDescriptorImpl]

'klass' @ [74:34] ==> value-parameter klass: KtClassOrObject defined in org.jetbrains.kotlin.idea.inspections.AddVarianceModifierInspection.buildVisitor.<no name provided>.variancePossible[ValueParameterDescriptorImpl]

'klass' @ [77:31] ==> value-parameter klass: KtClassOrObject defined in org.jetbrains.kotlin.idea.inspections.AddVarianceModifierInspection.buildVisitor.<no name provided>.visitClassOrObject[ValueParameterDescriptorImpl]

'analyzeFully' @ [77:37] ==> public fun KtElement.analyzeFully(): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'klass' @ [78:39] ==> value-parameter klass: KtClassOrObject defined in org.jetbrains.kotlin.idea.inspections.AddVarianceModifierInspection.buildVisitor.<no name provided>.visitClassOrObject[ValueParameterDescriptorImpl]

'typeParameters' @ [78:45] ==> public final val KtClassOrObject.typeParameters: (MutableList<(KtTypeParameter..KtTypeParameter?)>..List<(KtTypeParameter..KtTypeParameter?)>)[MyPropertyDescriptor]

'typeParameter' @ [79:25] ==> val typeParameter: (KtTypeParameter..KtTypeParameter?) defined in org.jetbrains.kotlin.idea.inspections.AddVarianceModifierInspection.buildVisitor.<no name provided>.visitClassOrObject[LocalVariableDescriptor]

'variance' @ [79:39] ==> public final val KtTypeParameter.variance: Variance[MyPropertyDescriptor]

'INVARIANT' @ [79:60] ==> enum entry INVARIANT defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'context' @ [81:29] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.inspections.AddVarianceModifierInspection.buildVisitor.<no name provided>.visitClassOrObject[LocalVariableDescriptor]

'get' @ [81:37] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(p0: (ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>..ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>?), p1: (PsiElement..PsiElement?)): DeclarationDescriptor? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> PsiElement
    <V : (Any..Any?)> -> DeclarationDescriptor

'DECLARATION_TO_DESCRIPTOR' @ [81:56] ==> public final val DECLARATION_TO_DESCRIPTOR: (ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>..ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'typeParameter' @ [81:83] ==> val typeParameter: (KtTypeParameter..KtTypeParameter?) defined in org.jetbrains.kotlin.idea.inspections.AddVarianceModifierInspection.buildVisitor.<no name provided>.visitClassOrObject[LocalVariableDescriptor]

'listOf' @ [82:37] ==> public fun <T> listOf(vararg elements: Variance): List<Variance> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Variance

'IN_VARIANCE' @ [82:53] ==> enum entry IN_VARIANCE defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'OUT_VARIANCE' @ [82:75] ==> enum entry OUT_VARIANCE defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'filter' @ [82:89] ==> public inline fun <T> Iterable<Variance>.filter(predicate: (Variance) -> Boolean): List<Variance> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Variance

'variancePossible' @ [83:25] ==> private final fun variancePossible(klass: KtClassOrObject, parameterDescriptor: TypeParameterDescriptor, variance: Variance, context: BindingContext): Boolean defined in org.jetbrains.kotlin.idea.inspections.AddVarianceModifierInspection.buildVisitor.<no name provided>[SimpleFunctionDescriptorImpl]

'klass' @ [83:42] ==> value-parameter klass: KtClassOrObject defined in org.jetbrains.kotlin.idea.inspections.AddVarianceModifierInspection.buildVisitor.<no name provided>.visitClassOrObject[ValueParameterDescriptorImpl]

'parameterDescriptor' @ [83:49] ==> val parameterDescriptor: TypeParameterDescriptor defined in org.jetbrains.kotlin.idea.inspections.AddVarianceModifierInspection.buildVisitor.<no name provided>.visitClassOrObject[LocalVariableDescriptor]

'it' @ [83:70] ==> value-parameter it: Variance defined in org.jetbrains.kotlin.idea.inspections.AddVarianceModifierInspection.buildVisitor.<no name provided>.visitClassOrObject.<anonymous>[ValueParameterDescriptorImpl]

'context' @ [83:74] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.inspections.AddVarianceModifierInspection.buildVisitor.<no name provided>.visitClassOrObject[LocalVariableDescriptor]

'variances' @ [85:25] ==> val variances: List<Variance> defined in org.jetbrains.kotlin.idea.inspections.AddVarianceModifierInspection.buildVisitor.<no name provided>.visitClassOrObject[LocalVariableDescriptor]

'size' @ [85:35] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'variances' @ [86:41] ==> val variances: List<Variance> defined in org.jetbrains.kotlin.idea.inspections.AddVarianceModifierInspection.buildVisitor.<no name provided>.visitClassOrObject[LocalVariableDescriptor]

'first' @ [86:51] ==> public fun <T> List<Variance>.first(): Variance defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Variance

'variances' @ [87:37] ==> val variances: List<Variance> defined in org.jetbrains.kotlin.idea.inspections.AddVarianceModifierInspection.buildVisitor.<no name provided>.visitClassOrObject[LocalVariableDescriptor]

'map' @ [87:47] ==> public inline fun <T, R> Iterable<Variance>.map(transform: (Variance) -> AddVarianceModifierInspection.AddVarianceFix): List<AddVarianceModifierInspection.AddVarianceFix> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Variance
    <R> -> AddVarianceFix

'holder' @ [88:25] ==> value-parameter holder: ProblemsHolder defined in org.jetbrains.kotlin.idea.inspections.AddVarianceModifierInspection.buildVisitor[ValueParameterDescriptorImpl]

'registerProblem' @ [88:32] ==> public open fun registerProblem(@NotNull p0: PsiElement, @NotNull @Nls p1: String, @NotNull p2: ProblemHighlightType, @Nullable vararg p3: (LocalQuickFix..LocalQuickFix?)): Unit defined in com.intellij.codeInspection.ProblemsHolder[JavaMethodDescriptor]

'typeParameter' @ [89:33] ==> val typeParameter: (KtTypeParameter..KtTypeParameter?) defined in org.jetbrains.kotlin.idea.inspections.AddVarianceModifierInspection.buildVisitor.<no name provided>.visitClassOrObject[LocalVariableDescriptor]

'suggested' @ [90:59] ==> val suggested: Variance defined in org.jetbrains.kotlin.idea.inspections.AddVarianceModifierInspection.buildVisitor.<no name provided>.visitClassOrObject[LocalVariableDescriptor]

'GENERIC_ERROR_OR_WARNING' @ [91:54] ==> enum entry GENERIC_ERROR_OR_WARNING defined in com.intellij.codeInspection.ProblemHighlightType[FakeCallableDescriptorForObject]

'fixes' @ [92:34] ==> val fixes: List<AddVarianceModifierInspection.AddVarianceFix> defined in org.jetbrains.kotlin.idea.inspections.AddVarianceModifierInspection.buildVisitor.<no name provided>.visitClassOrObject[LocalVariableDescriptor]

'toTypedArray' @ [92:40] ==> public inline fun <reified T> Collection<AddVarianceModifierInspection.AddVarianceFix>.toTypedArray(): Array<AddVarianceModifierInspection.AddVarianceFix> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> AddVarianceFix

'variance' @ [101:41] ==> public final val variance: Variance defined in org.jetbrains.kotlin.idea.inspections.AddVarianceModifierInspection.AddVarianceFix[PropertyDescriptorImpl]

'!' @ [106:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'getInstance' @ [106:42] ==> public open fun getInstance(): (FileModificationService..FileModificationService?) defined in com.intellij.codeInsight.FileModificationService[JavaMethodDescriptor]

'preparePsiElementForWrite' @ [106:56] ==> public open fun preparePsiElementForWrite(@Nullable p0: PsiElement?): Boolean defined in com.intellij.codeInsight.FileModificationService[JavaMethodDescriptor]

'descriptor' @ [106:82] ==> value-parameter descriptor: ProblemDescriptor defined in org.jetbrains.kotlin.idea.inspections.AddVarianceModifierInspection.AddVarianceFix.applyFix[ValueParameterDescriptorImpl]

'psiElement' @ [106:93] ==> public final val ProblemDescriptor.psiElement: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'descriptor' @ [107:33] ==> value-parameter descriptor: ProblemDescriptor defined in org.jetbrains.kotlin.idea.inspections.AddVarianceModifierInspection.AddVarianceFix.applyFix[ValueParameterDescriptorImpl]

'psiElement' @ [107:44] ==> public final val ProblemDescriptor.psiElement: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'AssertionError' @ [108:42] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'descriptor' @ [108:88] ==> value-parameter descriptor: ProblemDescriptor defined in org.jetbrains.kotlin.idea.inspections.AddVarianceModifierInspection.AddVarianceFix.applyFix[ValueParameterDescriptorImpl]

'psiElement' @ [108:99] ==> public final val ProblemDescriptor.psiElement: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'text' @ [108:110] ==> public final val PsiElement.text: (String..String?)[MyPropertyDescriptor]

'addModifier' @ [109:13] ==> public fun addModifier(owner: KtModifierListOwner, modifier: KtModifierKeywordToken): Unit defined in org.jetbrains.kotlin.psi.addRemoveModifier[DeserializedSimpleFunctionDescriptor]

'typeParameter' @ [109:25] ==> val typeParameter: KtTypeParameter defined in org.jetbrains.kotlin.idea.inspections.AddVarianceModifierInspection.AddVarianceFix.applyFix[LocalVariableDescriptor]

'if (variance == Variance.IN_VARIANCE) KtTokens.IN_KEYWORD else KtTokens.OUT_KEYWORD' @ [109:40] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (KtModifierKeywordToken..KtModifierKeywordToken?), elseBranch: (KtModifierKeywordToken..KtModifierKeywordToken?)): (KtModifierKeywordToken..KtModifierKeywordToken?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (org.jetbrains.kotlin.lexer.KtModifierKeywordToken..org.jetbrains.kotlin.lexer.KtModifierKeywordToken?)

'variance' @ [109:44] ==> public final val variance: Variance defined in org.jetbrains.kotlin.idea.inspections.AddVarianceModifierInspection.AddVarianceFix[PropertyDescriptorImpl]

'IN_VARIANCE' @ [109:65] ==> enum entry IN_VARIANCE defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'IN_KEYWORD' @ [109:87] ==> public final val IN_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'OUT_KEYWORD' @ [109:112] ==> public final val OUT_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

