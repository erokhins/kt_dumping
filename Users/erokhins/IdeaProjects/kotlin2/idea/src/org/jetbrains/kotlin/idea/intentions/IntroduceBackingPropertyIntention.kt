'SelfTargetingIntention<KtProperty>' @ [29:43] ==> public constructor SelfTargetingIntention<TElement : PsiElement>(elementType: Class<KtProperty>, text: String, familyName: String = ...) defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingIntention[DeserializedClassConstructorDescriptor]
Inferred types:
    <TElement : PsiElement> -> KtProperty

'java' @ [29:96] ==> public val <T> KClass<KtProperty>.java: Class<KtProperty> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtProperty

'!' @ [31:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'canIntroduceBackingProperty' @ [31:14] ==> public final fun canIntroduceBackingProperty(property: KtProperty): Boolean defined in org.jetbrains.kotlin.idea.intentions.IntroduceBackingPropertyIntention.Companion[SimpleFunctionDescriptorImpl]

'element' @ [31:42] ==> value-parameter element: KtProperty defined in org.jetbrains.kotlin.idea.intentions.IntroduceBackingPropertyIntention.isApplicableTo[ValueParameterDescriptorImpl]

'element' @ [32:16] ==> value-parameter element: KtProperty defined in org.jetbrains.kotlin.idea.intentions.IntroduceBackingPropertyIntention.isApplicableTo[ValueParameterDescriptorImpl]

'nameIdentifier' @ [32:24] ==> public final val KtProperty.nameIdentifier: PsiElement?[MyPropertyDescriptor]

'textRange' @ [32:40] ==> public final val PsiElement.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'containsOffset' @ [32:51] ==> public open fun containsOffset(p0: Int): Boolean defined in com.intellij.openapi.util.TextRange[JavaMethodDescriptor]

'caretOffset' @ [32:66] ==> value-parameter caretOffset: Int defined in org.jetbrains.kotlin.idea.intentions.IntroduceBackingPropertyIntention.isApplicableTo[ValueParameterDescriptorImpl]

'introduceBackingProperty' @ [36:9] ==> public final fun introduceBackingProperty(property: KtProperty): Unit defined in org.jetbrains.kotlin.idea.intentions.IntroduceBackingPropertyIntention.Companion[SimpleFunctionDescriptorImpl]

'element' @ [36:34] ==> value-parameter element: KtProperty defined in org.jetbrains.kotlin.idea.intentions.IntroduceBackingPropertyIntention.applyTo[ValueParameterDescriptorImpl]

'property' @ [41:24] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.idea.intentions.IntroduceBackingPropertyIntention.Companion.canIntroduceBackingProperty[ValueParameterDescriptorImpl]

'name' @ [41:33] ==> public final val KtProperty.name: String?[MyPropertyDescriptor]

'property' @ [43:34] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.idea.intentions.IntroduceBackingPropertyIntention.Companion.canIntroduceBackingProperty[ValueParameterDescriptorImpl]

'getResolutionFacade' @ [43:43] ==> public fun KtElement.getResolutionFacade(): ResolutionFacade defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'analyzeFullyAndGetResult' @ [43:65] ==> public abstract fun analyzeFullyAndGetResult(elements: Collection<KtElement>): AnalysisResult defined in org.jetbrains.kotlin.idea.resolve.ResolutionFacade[DeserializedSimpleFunctionDescriptor]

'listOf' @ [43:90] ==> public fun <T> listOf(element: KtProperty): List<KtProperty> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtProperty

'property' @ [43:97] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.idea.intentions.IntroduceBackingPropertyIntention.Companion.canIntroduceBackingProperty[ValueParameterDescriptorImpl]

'bindingContext' @ [43:108] ==> public final val bindingContext: BindingContext defined in org.jetbrains.kotlin.analyzer.AnalysisResult[DeserializedPropertyDescriptor]

'bindingContext' @ [44:30] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.intentions.IntroduceBackingPropertyIntention.Companion.canIntroduceBackingProperty[LocalVariableDescriptor]

'get' @ [44:45] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(p0: (ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>..ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>?), p1: (PsiElement..PsiElement?)): DeclarationDescriptor? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> PsiElement
    <V : (Any..Any?)> -> DeclarationDescriptor

'DECLARATION_TO_DESCRIPTOR' @ [44:64] ==> public final val DECLARATION_TO_DESCRIPTOR: (ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>..ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'property' @ [44:91] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.idea.intentions.IntroduceBackingPropertyIntention.Companion.canIntroduceBackingProperty[ValueParameterDescriptorImpl]

'bindingContext' @ [45:17] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.intentions.IntroduceBackingPropertyIntention.Companion.canIntroduceBackingProperty[LocalVariableDescriptor]

'get' @ [45:32] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(p0: (ReadOnlySlice<(PropertyDescriptor..PropertyDescriptor?), (Boolean..Boolean?)>..ReadOnlySlice<(PropertyDescriptor..PropertyDescriptor?), (Boolean..Boolean?)>?), p1: (PropertyDescriptor..PropertyDescriptor?)): Boolean? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> PropertyDescriptor
    <V : (Any..Any?)> -> Boolean

'BACKING_FIELD_REQUIRED' @ [45:51] ==> public final val BACKING_FIELD_REQUIRED: (WritableSlice<(PropertyDescriptor..PropertyDescriptor?), (Boolean..Boolean?)>..WritableSlice<(PropertyDescriptor..PropertyDescriptor?), (Boolean..Boolean?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'descriptor' @ [45:75] ==> val descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.idea.intentions.IntroduceBackingPropertyIntention.Companion.canIntroduceBackingProperty[LocalVariableDescriptor]

'property' @ [47:35] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.idea.intentions.IntroduceBackingPropertyIntention.Companion.canIntroduceBackingProperty[ValueParameterDescriptorImpl]

'getStrictParentOfType' @ [47:44] ==> public inline fun <reified T : PsiElement> PsiElement.getStrictParentOfType(): KtClassOrObject? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtClassOrObject

'containingClass' @ [48:20] ==> val containingClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.intentions.IntroduceBackingPropertyIntention.Companion.canIntroduceBackingProperty[LocalVariableDescriptor]

'declarations' @ [48:36] ==> public final val KtClassOrObject.declarations: List<KtDeclaration>[MyPropertyDescriptor]

'none' @ [48:49] ==> public inline fun <T> Iterable<KtDeclaration>.none(predicate: (KtDeclaration) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtDeclaration

'it' @ [48:56] ==> value-parameter it: KtDeclaration defined in org.jetbrains.kotlin.idea.intentions.IntroduceBackingPropertyIntention.Companion.canIntroduceBackingProperty.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [48:76] ==> value-parameter it: KtDeclaration defined in org.jetbrains.kotlin.idea.intentions.IntroduceBackingPropertyIntention.Companion.canIntroduceBackingProperty.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [48:79] ==> public final val KtProperty.name: String?[MyPropertyDescriptor]

'+' @ [48:87] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'name' @ [48:93] ==> val name: String defined in org.jetbrains.kotlin.idea.intentions.IntroduceBackingPropertyIntention.Companion.canIntroduceBackingProperty[LocalVariableDescriptor]

'createBackingProperty' @ [52:13] ==> private final fun createBackingProperty(property: KtProperty): Unit defined in org.jetbrains.kotlin.idea.intentions.IntroduceBackingPropertyIntention.Companion[SimpleFunctionDescriptorImpl]

'property' @ [52:35] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.idea.intentions.IntroduceBackingPropertyIntention.Companion.introduceBackingProperty[ValueParameterDescriptorImpl]

'property' @ [54:17] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.idea.intentions.IntroduceBackingPropertyIntention.Companion.introduceBackingProperty[ValueParameterDescriptorImpl]

'typeReference' @ [54:26] ==> public final var KtProperty.typeReference: KtTypeReference?[MyPropertyDescriptor]

'SpecifyTypeExplicitlyIntention' @ [55:28] ==> public companion object defined in org.jetbrains.kotlin.idea.intentions.SpecifyTypeExplicitlyIntention[FakeCallableDescriptorForObject]

'getTypeForDeclaration' @ [55:59] ==> public final fun getTypeForDeclaration(declaration: KtCallableDeclaration): KotlinType defined in org.jetbrains.kotlin.idea.intentions.SpecifyTypeExplicitlyIntention.Companion[SimpleFunctionDescriptorImpl]

'property' @ [55:81] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.idea.intentions.IntroduceBackingPropertyIntention.Companion.introduceBackingProperty[ValueParameterDescriptorImpl]

'SpecifyTypeExplicitlyIntention' @ [56:17] ==> public companion object defined in org.jetbrains.kotlin.idea.intentions.SpecifyTypeExplicitlyIntention[FakeCallableDescriptorForObject]

'addTypeAnnotation' @ [56:48] ==> public final fun addTypeAnnotation(editor: Editor?, declaration: KtCallableDeclaration, exprType: KotlinType): Unit defined in org.jetbrains.kotlin.idea.intentions.SpecifyTypeExplicitlyIntention.Companion[SimpleFunctionDescriptorImpl]

'property' @ [56:72] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.idea.intentions.IntroduceBackingPropertyIntention.Companion.introduceBackingProperty[ValueParameterDescriptorImpl]

'type' @ [56:82] ==> val type: KotlinType defined in org.jetbrains.kotlin.idea.intentions.IntroduceBackingPropertyIntention.Companion.introduceBackingProperty[LocalVariableDescriptor]

'property' @ [59:26] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.idea.intentions.IntroduceBackingPropertyIntention.Companion.introduceBackingProperty[ValueParameterDescriptorImpl]

'getter' @ [59:35] ==> public final val KtProperty.getter: KtPropertyAccessor?[MyPropertyDescriptor]

'if (getter == null) {
                createGetter(property)
            }
            else {
                replaceFieldReferences(getter, property.name!!)
            }' @ [60:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'getter' @ [60:17] ==> val getter: KtPropertyAccessor? defined in org.jetbrains.kotlin.idea.intentions.IntroduceBackingPropertyIntention.Companion.introduceBackingProperty[LocalVariableDescriptor]

'createGetter' @ [61:17] ==> private final fun createGetter(element: KtProperty): Unit defined in org.jetbrains.kotlin.idea.intentions.IntroduceBackingPropertyIntention.Companion[SimpleFunctionDescriptorImpl]

'property' @ [61:30] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.idea.intentions.IntroduceBackingPropertyIntention.Companion.introduceBackingProperty[ValueParameterDescriptorImpl]

'replaceFieldReferences' @ [64:17] ==> private final fun replaceFieldReferences(element: KtElement, propertyName: String): Unit defined in org.jetbrains.kotlin.idea.intentions.IntroduceBackingPropertyIntention.Companion[SimpleFunctionDescriptorImpl]

'getter' @ [64:40] ==> val getter: KtPropertyAccessor? defined in org.jetbrains.kotlin.idea.intentions.IntroduceBackingPropertyIntention.Companion.introduceBackingProperty[LocalVariableDescriptor]

'property' @ [64:48] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.idea.intentions.IntroduceBackingPropertyIntention.Companion.introduceBackingProperty[ValueParameterDescriptorImpl]

'name' @ [64:57] ==> public final val KtProperty.name: String?[MyPropertyDescriptor]

'property' @ [67:17] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.idea.intentions.IntroduceBackingPropertyIntention.Companion.introduceBackingProperty[ValueParameterDescriptorImpl]

'isVar' @ [67:26] ==> public final val KtProperty.isVar: Boolean[MyPropertyDescriptor]

'property' @ [68:30] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.idea.intentions.IntroduceBackingPropertyIntention.Companion.introduceBackingProperty[ValueParameterDescriptorImpl]

'setter' @ [68:39] ==> public final val KtProperty.setter: KtPropertyAccessor?[MyPropertyDescriptor]

'if (setter == null) {
                    createSetter(property)
                }
                else {
                    replaceFieldReferences(setter, property.name!!)
                }' @ [69:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'setter' @ [69:21] ==> val setter: KtPropertyAccessor? defined in org.jetbrains.kotlin.idea.intentions.IntroduceBackingPropertyIntention.Companion.introduceBackingProperty[LocalVariableDescriptor]

'createSetter' @ [70:21] ==> private final fun createSetter(element: KtProperty): Unit defined in org.jetbrains.kotlin.idea.intentions.IntroduceBackingPropertyIntention.Companion[SimpleFunctionDescriptorImpl]

'property' @ [70:34] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.idea.intentions.IntroduceBackingPropertyIntention.Companion.introduceBackingProperty[ValueParameterDescriptorImpl]

'replaceFieldReferences' @ [73:21] ==> private final fun replaceFieldReferences(element: KtElement, propertyName: String): Unit defined in org.jetbrains.kotlin.idea.intentions.IntroduceBackingPropertyIntention.Companion[SimpleFunctionDescriptorImpl]

'setter' @ [73:44] ==> val setter: KtPropertyAccessor? defined in org.jetbrains.kotlin.idea.intentions.IntroduceBackingPropertyIntention.Companion.introduceBackingProperty[LocalVariableDescriptor]

'property' @ [73:52] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.idea.intentions.IntroduceBackingPropertyIntention.Companion.introduceBackingProperty[ValueParameterDescriptorImpl]

'name' @ [73:61] ==> public final val KtProperty.name: String?[MyPropertyDescriptor]

'property' @ [77:13] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.idea.intentions.IntroduceBackingPropertyIntention.Companion.introduceBackingProperty[ValueParameterDescriptorImpl]

'initializer' @ [77:22] ==> public final var KtProperty.initializer: KtExpression?[MyPropertyDescriptor]

'element' @ [81:36] ==> value-parameter element: KtProperty defined in org.jetbrains.kotlin.idea.intentions.IntroduceBackingPropertyIntention.Companion.createGetter[ValueParameterDescriptorImpl]

'name' @ [81:44] ==> public final val KtProperty.name: String?[MyPropertyDescriptor]

'KtPsiFactory' @ [82:29] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'element' @ [82:42] ==> value-parameter element: KtProperty defined in org.jetbrains.kotlin.idea.intentions.IntroduceBackingPropertyIntention.Companion.createGetter[ValueParameterDescriptorImpl]

'createProperty' @ [82:51] ==> public final fun createProperty(text: String): KtProperty defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'body' @ [82:74] ==> val body: String defined in org.jetbrains.kotlin.idea.intentions.IntroduceBackingPropertyIntention.Companion.createGetter[LocalVariableDescriptor]

'getter' @ [82:81] ==> public final val KtProperty.getter: KtPropertyAccessor?[MyPropertyDescriptor]

'element' @ [83:13] ==> value-parameter element: KtProperty defined in org.jetbrains.kotlin.idea.intentions.IntroduceBackingPropertyIntention.Companion.createGetter[ValueParameterDescriptorImpl]

'addAccessor' @ [83:21] ==> private final fun KtProperty.addAccessor(newAccessor: KtPropertyAccessor): Unit defined in org.jetbrains.kotlin.idea.intentions.IntroduceBackingPropertyIntention.Companion[SimpleFunctionDescriptorImpl]

'newGetter' @ [83:33] ==> val newGetter: KtPropertyAccessor defined in org.jetbrains.kotlin.idea.intentions.IntroduceBackingPropertyIntention.Companion.createGetter[LocalVariableDescriptor]

'element' @ [87:41] ==> value-parameter element: KtProperty defined in org.jetbrains.kotlin.idea.intentions.IntroduceBackingPropertyIntention.Companion.createSetter[ValueParameterDescriptorImpl]

'name' @ [87:49] ==> public final val KtProperty.name: String?[MyPropertyDescriptor]

'KtPsiFactory' @ [88:29] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'element' @ [88:42] ==> value-parameter element: KtProperty defined in org.jetbrains.kotlin.idea.intentions.IntroduceBackingPropertyIntention.Companion.createSetter[ValueParameterDescriptorImpl]

'createProperty' @ [88:51] ==> public final fun createProperty(text: String): KtProperty defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'body' @ [88:74] ==> val body: String defined in org.jetbrains.kotlin.idea.intentions.IntroduceBackingPropertyIntention.Companion.createSetter[LocalVariableDescriptor]

'setter' @ [88:81] ==> public final val KtProperty.setter: KtPropertyAccessor?[MyPropertyDescriptor]

'element' @ [89:13] ==> value-parameter element: KtProperty defined in org.jetbrains.kotlin.idea.intentions.IntroduceBackingPropertyIntention.Companion.createSetter[ValueParameterDescriptorImpl]

'addAccessor' @ [89:21] ==> private final fun KtProperty.addAccessor(newAccessor: KtPropertyAccessor): Unit defined in org.jetbrains.kotlin.idea.intentions.IntroduceBackingPropertyIntention.Companion[SimpleFunctionDescriptorImpl]

'newSetter' @ [89:33] ==> val newSetter: KtPropertyAccessor defined in org.jetbrains.kotlin.idea.intentions.IntroduceBackingPropertyIntention.Companion.createSetter[LocalVariableDescriptor]

'node' @ [93:29] ==> public final var KtProperty.node: ASTNode[MyPropertyDescriptor]

'findChildByType' @ [93:34] ==> @Nullable public abstract fun findChildByType(p0: (IElementType..IElementType?)): ASTNode? defined in com.intellij.lang.ASTNode[JavaMethodDescriptor]

'SEMICOLON' @ [93:59] ==> public final val SEMICOLON: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'addBefore' @ [94:13] ==> public open fun addBefore(@NotNull p0: PsiElement, p1: PsiElement?): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtProperty[JavaMethodDescriptor]

'newAccessor' @ [94:23] ==> value-parameter newAccessor: KtPropertyAccessor defined in org.jetbrains.kotlin.idea.intentions.IntroduceBackingPropertyIntention.Companion.addAccessor[ValueParameterDescriptorImpl]

'semicolon' @ [94:36] ==> val semicolon: ASTNode? defined in org.jetbrains.kotlin.idea.intentions.IntroduceBackingPropertyIntention.Companion.addAccessor[LocalVariableDescriptor]

'psi' @ [94:47] ==> public final val ASTNode.psi: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'KtPsiFactory' @ [98:35] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'property' @ [98:48] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.idea.intentions.IntroduceBackingPropertyIntention.Companion.createBackingProperty[ValueParameterDescriptorImpl]

'buildDeclaration' @ [98:58] ==> public fun KtPsiFactory.buildDeclaration(build: BuilderByPattern<KtDeclaration>.() -> Unit): KtDeclaration defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'appendFixedText' @ [99:17] ==> public final fun appendFixedText(text: String): BuilderByPattern<KtDeclaration> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'appendFixedText' @ [100:17] ==> public final fun appendFixedText(text: String): BuilderByPattern<KtDeclaration> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'property' @ [100:33] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.idea.intentions.IntroduceBackingPropertyIntention.Companion.createBackingProperty[ValueParameterDescriptorImpl]

'valOrVarKeyword' @ [100:42] ==> public final val KtProperty.valOrVarKeyword: PsiElement[MyPropertyDescriptor]

'text' @ [100:58] ==> public final val PsiElement.text: (String..String?)[MyPropertyDescriptor]

'appendFixedText' @ [101:17] ==> public final fun appendFixedText(text: String): BuilderByPattern<KtDeclaration> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'property' @ [101:38] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.idea.intentions.IntroduceBackingPropertyIntention.Companion.createBackingProperty[ValueParameterDescriptorImpl]

'name' @ [101:47] ==> public final val KtProperty.name: String?[MyPropertyDescriptor]

'property' @ [102:21] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.idea.intentions.IntroduceBackingPropertyIntention.Companion.createBackingProperty[ValueParameterDescriptorImpl]

'typeReference' @ [102:30] ==> public final var KtProperty.typeReference: KtTypeReference?[MyPropertyDescriptor]

'appendFixedText' @ [103:21] ==> public final fun appendFixedText(text: String): BuilderByPattern<KtDeclaration> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'appendTypeReference' @ [104:21] ==> public final fun appendTypeReference(typeRef: KtTypeReference?): BuilderByPattern<KtDeclaration> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'property' @ [104:41] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.idea.intentions.IntroduceBackingPropertyIntention.Companion.createBackingProperty[ValueParameterDescriptorImpl]

'typeReference' @ [104:50] ==> public final var KtProperty.typeReference: KtTypeReference?[MyPropertyDescriptor]

'property' @ [106:21] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.idea.intentions.IntroduceBackingPropertyIntention.Companion.createBackingProperty[ValueParameterDescriptorImpl]

'initializer' @ [106:30] ==> public final var KtProperty.initializer: KtExpression?[MyPropertyDescriptor]

'appendFixedText' @ [107:21] ==> public final fun appendFixedText(text: String): BuilderByPattern<KtDeclaration> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'appendExpression' @ [108:21] ==> public final fun appendExpression(expression: KtExpression?): BuilderByPattern<KtDeclaration> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'property' @ [108:38] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.idea.intentions.IntroduceBackingPropertyIntention.Companion.createBackingProperty[ValueParameterDescriptorImpl]

'initializer' @ [108:47] ==> public final var KtProperty.initializer: KtExpression?[MyPropertyDescriptor]

'property' @ [112:13] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.idea.intentions.IntroduceBackingPropertyIntention.Companion.createBackingProperty[ValueParameterDescriptorImpl]

'parent' @ [112:22] ==> public final val KtProperty.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'addBefore' @ [112:29] ==> public abstract fun addBefore(@NotNull p0: PsiElement, @Nullable p1: PsiElement?): (PsiElement..PsiElement?) defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'backingProperty' @ [112:39] ==> val backingProperty: KtDeclaration defined in org.jetbrains.kotlin.idea.intentions.IntroduceBackingPropertyIntention.Companion.createBackingProperty[LocalVariableDescriptor]

'property' @ [112:56] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.idea.intentions.IntroduceBackingPropertyIntention.Companion.createBackingProperty[ValueParameterDescriptorImpl]

'element' @ [116:13] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.idea.intentions.IntroduceBackingPropertyIntention.Companion.replaceFieldReferences[ValueParameterDescriptorImpl]

'acceptChildren' @ [116:21] ==> public abstract fun acceptChildren(@NotNull p0: PsiElementVisitor): Unit defined in org.jetbrains.kotlin.psi.KtElement[JavaMethodDescriptor]

'KtTreeVisitorVoid' @ [116:45] ==> public constructor KtTreeVisitorVoid() defined in org.jetbrains.kotlin.psi.KtTreeVisitorVoid[JavaClassConstructorDescriptor]

'expression' @ [118:42] ==> value-parameter expression: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.intentions.IntroduceBackingPropertyIntention.Companion.replaceFieldReferences.<no name provided>.visitSimpleNameExpression[ValueParameterDescriptorImpl]

'analyze' @ [118:53] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'bindingContext' @ [119:34] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.intentions.IntroduceBackingPropertyIntention.Companion.replaceFieldReferences.<no name provided>.visitSimpleNameExpression[LocalVariableDescriptor]

'get' @ [119:49] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(p0: (ReadOnlySlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>..ReadOnlySlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>?), p1: (KtReferenceExpression..KtReferenceExpression?)): DeclarationDescriptor? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> KtReferenceExpression
    <V : (Any..Any?)> -> DeclarationDescriptor

'REFERENCE_TARGET' @ [119:68] ==> public final val REFERENCE_TARGET: (WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>..WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'expression' @ [119:86] ==> value-parameter expression: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.intentions.IntroduceBackingPropertyIntention.Companion.replaceFieldReferences.<no name provided>.visitSimpleNameExpression[ValueParameterDescriptorImpl]

'target' @ [120:25] ==> val target: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.intentions.IntroduceBackingPropertyIntention.Companion.replaceFieldReferences.<no name provided>.visitSimpleNameExpression[LocalVariableDescriptor]

'expression' @ [121:25] ==> value-parameter expression: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.intentions.IntroduceBackingPropertyIntention.Companion.replaceFieldReferences.<no name provided>.visitSimpleNameExpression[ValueParameterDescriptorImpl]

'replace' @ [121:36] ==> public abstract fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtSimpleNameExpression[JavaMethodDescriptor]

'KtPsiFactory' @ [121:44] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'element' @ [121:57] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.idea.intentions.IntroduceBackingPropertyIntention.Companion.replaceFieldReferences[ValueParameterDescriptorImpl]

'createSimpleName' @ [121:66] ==> public final fun createSimpleName(name: String): KtSimpleNameExpression defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'propertyName' @ [121:86] ==> value-parameter propertyName: String defined in org.jetbrains.kotlin.idea.intentions.IntroduceBackingPropertyIntention.Companion.replaceFieldReferences[ValueParameterDescriptorImpl]

