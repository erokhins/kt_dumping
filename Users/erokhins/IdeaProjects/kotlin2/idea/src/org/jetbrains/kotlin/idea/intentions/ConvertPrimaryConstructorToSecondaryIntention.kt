'SelfTargetingIntention<KtPrimaryConstructor>' @ [39:55] ==> public constructor SelfTargetingIntention<TElement : PsiElement>(elementType: Class<KtPrimaryConstructor>, text: String, familyName: String = ...) defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingIntention[DeserializedClassConstructorDescriptor]
Inferred types:
    <TElement : PsiElement> -> KtPrimaryConstructor

'java' @ [40:37] ==> public val <T> KClass<KtPrimaryConstructor>.java: Class<KtPrimaryConstructor> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtPrimaryConstructor

'element' @ [44:31] ==> value-parameter element: KtPrimaryConstructor defined in org.jetbrains.kotlin.idea.intentions.ConvertPrimaryConstructorToSecondaryIntention.isApplicableTo[ValueParameterDescriptorImpl]

'containingClassOrObject' @ [44:39] ==> public val KtDeclaration.containingClassOrObject: KtClassOrObject? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'containingClass' @ [45:13] ==> val containingClass: KtClass defined in org.jetbrains.kotlin.idea.intentions.ConvertPrimaryConstructorToSecondaryIntention.isApplicableTo[LocalVariableDescriptor]

'isAnnotation' @ [45:29] ==> public final fun isAnnotation(): Boolean defined in org.jetbrains.kotlin.psi.KtClass[DeserializedSimpleFunctionDescriptor]

'containingClass' @ [45:47] ==> val containingClass: KtClass defined in org.jetbrains.kotlin.idea.intentions.ConvertPrimaryConstructorToSecondaryIntention.isApplicableTo[LocalVariableDescriptor]

'isData' @ [45:63] ==> public final fun isData(): Boolean defined in org.jetbrains.kotlin.psi.KtClass[DeserializedSimpleFunctionDescriptor]

'element' @ [46:16] ==> value-parameter element: KtPrimaryConstructor defined in org.jetbrains.kotlin.idea.intentions.ConvertPrimaryConstructorToSecondaryIntention.isApplicableTo[ValueParameterDescriptorImpl]

'valueParameters' @ [46:24] ==> public final val KtPrimaryConstructor.valueParameters: (MutableList<(KtParameter..KtParameter?)>..List<(KtParameter..KtParameter?)>)[MyPropertyDescriptor]

'all' @ [46:40] ==> public inline fun <T> Iterable<(KtParameter..KtParameter?)>.all(predicate: ((KtParameter..KtParameter?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtParameter..org.jetbrains.kotlin.psi.KtParameter?)

'!' @ [46:46] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [46:47] ==> value-parameter it: (KtParameter..KtParameter?) defined in org.jetbrains.kotlin.idea.intentions.ConvertPrimaryConstructorToSecondaryIntention.isApplicableTo.<anonymous>[ValueParameterDescriptorImpl]

'hasValOrVar' @ [46:50] ==> public open fun hasValOrVar(): Boolean defined in org.jetbrains.kotlin.psi.KtParameter[JavaMethodDescriptor]

'it' @ [46:67] ==> value-parameter it: (KtParameter..KtParameter?) defined in org.jetbrains.kotlin.idea.intentions.ConvertPrimaryConstructorToSecondaryIntention.isApplicableTo.<anonymous>[ValueParameterDescriptorImpl]

'annotationEntries' @ [46:70] ==> public final val KtParameter.annotationEntries: (MutableList<(KtAnnotationEntry..KtAnnotationEntry?)>..List<(KtAnnotationEntry..KtAnnotationEntry?)>)[MyPropertyDescriptor]

'isEmpty' @ [46:88] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'context' @ [50:36] ==> value-parameter context: BindingContext defined in org.jetbrains.kotlin.idea.intentions.ConvertPrimaryConstructorToSecondaryIntention.isIndependent[ValueParameterDescriptorImpl]

'REFERENCE_TARGET' @ [50:59] ==> public final val REFERENCE_TARGET: (WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>..WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'this' @ [50:77] ==> <this> defined in org.jetbrains.kotlin.idea.intentions.ConvertPrimaryConstructorToSecondaryIntention.isIndependent[ReceiverParameterDescriptorImpl]

'when (referencedDescriptor) {
            is ValueParameterDescriptor ->
                (referencedDescriptor.containingDeclaration as? ConstructorDescriptor)?.containingDeclaration != classDescriptor
            else ->
                classDescriptor !in referencedDescriptor.parents
        }' @ [51:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'referencedDescriptor' @ [51:22] ==> val referencedDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.intentions.ConvertPrimaryConstructorToSecondaryIntention.isIndependent[LocalVariableDescriptor]

'!=' @ [53:17] ==> public open fun equals(other: Any?): Boolean defined in org.jetbrains.kotlin.descriptors.ClassifierDescriptorWithTypeParameters[DeserializedSimpleFunctionDescriptor]

'referencedDescriptor' @ [53:18] ==> val referencedDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.intentions.ConvertPrimaryConstructorToSecondaryIntention.isIndependent[LocalVariableDescriptor]

'containingDeclaration' @ [53:39] ==> public final val ValueParameterDescriptor.containingDeclaration: CallableDescriptor[MyPropertyDescriptor]

'containingDeclaration' @ [53:89] ==> public final val ConstructorDescriptor.containingDeclaration: ClassifierDescriptorWithTypeParameters[MyPropertyDescriptor]

'classDescriptor' @ [53:114] ==> value-parameter classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.intentions.ConvertPrimaryConstructorToSecondaryIntention.isIndependent[ValueParameterDescriptorImpl]

'classDescriptor' @ [55:17] ==> value-parameter classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.intentions.ConvertPrimaryConstructorToSecondaryIntention.isIndependent[ValueParameterDescriptorImpl]

'referencedDescriptor' @ [55:37] ==> val referencedDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.intentions.ConvertPrimaryConstructorToSecondaryIntention.isIndependent[LocalVariableDescriptor]

'parents' @ [55:58] ==> public val DeclarationDescriptor.parents: Sequence<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'initializer' @ [60:35] ==> public final var KtProperty.initializer: KtExpression?[MyPropertyDescriptor]

'context' @ [61:31] ==> value-parameter context: BindingContext defined in org.jetbrains.kotlin.idea.intentions.ConvertPrimaryConstructorToSecondaryIntention.isIndependent[ValueParameterDescriptorImpl]

'CLASS' @ [61:54] ==> public final val CLASS: (WritableSlice<(PsiElement..PsiElement?), (ClassDescriptor..ClassDescriptor?)>..WritableSlice<(PsiElement..PsiElement?), (ClassDescriptor..ClassDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'klass' @ [61:61] ==> value-parameter klass: KtClass defined in org.jetbrains.kotlin.idea.intentions.ConvertPrimaryConstructorToSecondaryIntention.isIndependent[ValueParameterDescriptorImpl]

'!' @ [62:16] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'propertyInitializer' @ [62:17] ==> val propertyInitializer: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertPrimaryConstructorToSecondaryIntention.isIndependent[LocalVariableDescriptor]

'anyDescendantOfType' @ [62:37] ==> public inline fun <reified T : PsiElement> PsiElement.anyDescendantOfType(noinline predicate: (KtReferenceExpression) -> Boolean = ...): Boolean defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtReferenceExpression

'!' @ [62:82] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [62:83] ==> value-parameter it: KtReferenceExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertPrimaryConstructorToSecondaryIntention.isIndependent.<anonymous>[ValueParameterDescriptorImpl]

'isIndependent' @ [62:86] ==> private final fun KtReferenceExpression.isIndependent(classDescriptor: ClassDescriptor, context: BindingContext): Boolean defined in org.jetbrains.kotlin.idea.intentions.ConvertPrimaryConstructorToSecondaryIntention[SimpleFunctionDescriptorImpl]

'classDescriptor' @ [62:100] ==> val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.intentions.ConvertPrimaryConstructorToSecondaryIntention.isIndependent[LocalVariableDescriptor]

'context' @ [62:117] ==> value-parameter context: BindingContext defined in org.jetbrains.kotlin.idea.intentions.ConvertPrimaryConstructorToSecondaryIntention.isIndependent[ValueParameterDescriptorImpl]

'element' @ [66:21] ==> value-parameter element: KtPrimaryConstructor defined in org.jetbrains.kotlin.idea.intentions.ConvertPrimaryConstructorToSecondaryIntention.applyTo[ValueParameterDescriptorImpl]

'containingClassOrObject' @ [66:29] ==> public val KtDeclaration.containingClassOrObject: KtClassOrObject? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'klass' @ [67:13] ==> val klass: KtClass defined in org.jetbrains.kotlin.idea.intentions.ConvertPrimaryConstructorToSecondaryIntention.applyTo[LocalVariableDescriptor]

'isAnnotation' @ [67:19] ==> public final fun isAnnotation(): Boolean defined in org.jetbrains.kotlin.psi.KtClass[DeserializedSimpleFunctionDescriptor]

'klass' @ [68:23] ==> val klass: KtClass defined in org.jetbrains.kotlin.idea.intentions.ConvertPrimaryConstructorToSecondaryIntention.applyTo[LocalVariableDescriptor]

'analyze' @ [68:29] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'KtPsiFactory' @ [69:23] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'klass' @ [69:36] ==> val klass: KtClass defined in org.jetbrains.kotlin.idea.intentions.ConvertPrimaryConstructorToSecondaryIntention.applyTo[LocalVariableDescriptor]

'CommentSaver' @ [70:28] ==> public constructor CommentSaver(originalElement: PsiElement, saveLineBreaks: Boolean = ...) defined in org.jetbrains.kotlin.idea.util.CommentSaver[DeserializedClassConstructorDescriptor]

'element' @ [70:41] ==> value-parameter element: KtPrimaryConstructor defined in org.jetbrains.kotlin.idea.intentions.ConvertPrimaryConstructorToSecondaryIntention.applyTo[ValueParameterDescriptorImpl]

'mutableMapOf' @ [71:30] ==> @SinceKotlin @InlineOnly public inline fun <K, V> mutableMapOf(): MutableMap<KtProperty, String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> KtProperty
    <V> -> String

'klass' @ [72:26] ==> val klass: KtClass defined in org.jetbrains.kotlin.idea.intentions.ConvertPrimaryConstructorToSecondaryIntention.applyTo[LocalVariableDescriptor]

'getProperties' @ [72:32] ==> public final fun getProperties(): List<KtProperty> defined in org.jetbrains.kotlin.psi.KtClass[DeserializedSimpleFunctionDescriptor]

'property' @ [73:17] ==> val property: KtProperty defined in org.jetbrains.kotlin.idea.intentions.ConvertPrimaryConstructorToSecondaryIntention.applyTo[LocalVariableDescriptor]

'isIndependent' @ [73:26] ==> private final fun KtProperty.isIndependent(klass: KtClass, context: BindingContext): Boolean defined in org.jetbrains.kotlin.idea.intentions.ConvertPrimaryConstructorToSecondaryIntention[SimpleFunctionDescriptorImpl]

'klass' @ [73:40] ==> val klass: KtClass defined in org.jetbrains.kotlin.idea.intentions.ConvertPrimaryConstructorToSecondaryIntention.applyTo[LocalVariableDescriptor]

'context' @ [73:47] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.intentions.ConvertPrimaryConstructorToSecondaryIntention.applyTo[LocalVariableDescriptor]

'property' @ [74:17] ==> val property: KtProperty defined in org.jetbrains.kotlin.idea.intentions.ConvertPrimaryConstructorToSecondaryIntention.applyTo[LocalVariableDescriptor]

'typeReference' @ [74:26] ==> public final var KtProperty.typeReference: KtTypeReference?[MyPropertyDescriptor]

'SpecifyTypeExplicitlyIntention' @ [75:17] ==> public constructor SpecifyTypeExplicitlyIntention() defined in org.jetbrains.kotlin.idea.intentions.SpecifyTypeExplicitlyIntention[ClassConstructorDescriptorImpl]

'applyTo' @ [75:50] ==> public open fun applyTo(element: KtCallableDeclaration, editor: Editor?): Unit defined in org.jetbrains.kotlin.idea.intentions.SpecifyTypeExplicitlyIntention[SimpleFunctionDescriptorImpl]

'property' @ [75:58] ==> val property: KtProperty defined in org.jetbrains.kotlin.idea.intentions.ConvertPrimaryConstructorToSecondaryIntention.applyTo[LocalVariableDescriptor]

'editor' @ [75:68] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.intentions.ConvertPrimaryConstructorToSecondaryIntention.applyTo[ValueParameterDescriptorImpl]

'property' @ [77:31] ==> val property: KtProperty defined in org.jetbrains.kotlin.idea.intentions.ConvertPrimaryConstructorToSecondaryIntention.applyTo[LocalVariableDescriptor]

'initializer' @ [77:40] ==> public final var KtProperty.initializer: KtExpression?[MyPropertyDescriptor]

'initializerMap' @ [78:13] ==> val initializerMap: MutableMap<KtProperty, String> defined in org.jetbrains.kotlin.idea.intentions.ConvertPrimaryConstructorToSecondaryIntention.applyTo[LocalVariableDescriptor]

'property' @ [78:28] ==> val property: KtProperty defined in org.jetbrains.kotlin.idea.intentions.ConvertPrimaryConstructorToSecondaryIntention.applyTo[LocalVariableDescriptor]

'initializer' @ [78:40] ==> val initializer: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertPrimaryConstructorToSecondaryIntention.applyTo[LocalVariableDescriptor]

'text' @ [78:52] ==> public final val KtExpression.text: (String..String?)[MyPropertyDescriptor]

'initializer' @ [79:13] ==> val initializer: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertPrimaryConstructorToSecondaryIntention.applyTo[LocalVariableDescriptor]

'delete' @ [79:25] ==> public abstract fun delete(): Unit defined in org.jetbrains.kotlin.psi.KtExpression[JavaMethodDescriptor]

'property' @ [80:13] ==> val property: KtProperty defined in org.jetbrains.kotlin.idea.intentions.ConvertPrimaryConstructorToSecondaryIntention.applyTo[LocalVariableDescriptor]

'equalsToken' @ [80:22] ==> public final val KtProperty.equalsToken: PsiElement?[MyPropertyDescriptor]

'delete' @ [80:36] ==> public abstract fun delete(): Unit defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'factory' @ [82:27] ==> val factory: KtPsiFactory defined in org.jetbrains.kotlin.idea.intentions.ConvertPrimaryConstructorToSecondaryIntention.applyTo[LocalVariableDescriptor]

'createSecondaryConstructor' @ [82:35] ==> public final fun createSecondaryConstructor(decl: String): KtSecondaryConstructor defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'CallableBuilder' @ [83:17] ==> public constructor CallableBuilder(target: KtPsiFactory.CallableBuilder.Target) defined in org.jetbrains.kotlin.psi.KtPsiFactory.CallableBuilder[DeserializedClassConstructorDescriptor]

'CONSTRUCTOR' @ [83:33] ==> enum entry CONSTRUCTOR defined in org.jetbrains.kotlin.psi.KtPsiFactory.CallableBuilder.Target[FakeCallableDescriptorForObject]

'apply' @ [83:46] ==> @InlineOnly public inline fun <T> KtPsiFactory.CallableBuilder.apply(block: KtPsiFactory.CallableBuilder.() -> Unit): KtPsiFactory.CallableBuilder defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableBuilder

'element' @ [84:21] ==> value-parameter element: KtPrimaryConstructor defined in org.jetbrains.kotlin.idea.intentions.ConvertPrimaryConstructorToSecondaryIntention.applyTo[ValueParameterDescriptorImpl]

'modifierList' @ [84:29] ==> public final val KtPrimaryConstructor.modifierList: KtModifierList?[MyPropertyDescriptor]

'let' @ [84:43] ==> @InlineOnly public inline fun <T, R> KtModifierList.let(block: (KtModifierList) -> KtPsiFactory.CallableBuilder): KtPsiFactory.CallableBuilder defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtModifierList
    <R> -> CallableBuilder

'modifier' @ [84:49] ==> public final fun modifier(modifier: String): KtPsiFactory.CallableBuilder defined in org.jetbrains.kotlin.psi.KtPsiFactory.CallableBuilder[DeserializedSimpleFunctionDescriptor]

'it' @ [84:58] ==> value-parameter it: KtModifierList defined in org.jetbrains.kotlin.idea.intentions.ConvertPrimaryConstructorToSecondaryIntention.applyTo.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'text' @ [84:61] ==> public final val KtModifierList.text: (String..String?)[MyPropertyDescriptor]

'typeParams' @ [85:21] ==> public final fun typeParams(values: Collection<String> = ...): KtPsiFactory.CallableBuilder defined in org.jetbrains.kotlin.psi.KtPsiFactory.CallableBuilder[DeserializedSimpleFunctionDescriptor]

'name' @ [86:21] ==> public final fun name(name: String = ...): KtPsiFactory.CallableBuilder defined in org.jetbrains.kotlin.psi.KtPsiFactory.CallableBuilder[DeserializedSimpleFunctionDescriptor]

'element' @ [87:44] ==> value-parameter element: KtPrimaryConstructor defined in org.jetbrains.kotlin.idea.intentions.ConvertPrimaryConstructorToSecondaryIntention.applyTo[ValueParameterDescriptorImpl]

'valueParameters' @ [87:52] ==> public final val KtPrimaryConstructor.valueParameters: (MutableList<(KtParameter..KtParameter?)>..List<(KtParameter..KtParameter?)>)[MyPropertyDescriptor]

'valueParameter' @ [88:43] ==> val valueParameter: (KtParameter..KtParameter?) defined in org.jetbrains.kotlin.idea.intentions.ConvertPrimaryConstructorToSecondaryIntention.applyTo.<anonymous>[LocalVariableDescriptor]

'annotationEntries' @ [88:58] ==> public final val KtParameter.annotationEntries: (MutableList<(KtAnnotationEntry..KtAnnotationEntry?)>..List<(KtAnnotationEntry..KtAnnotationEntry?)>)[MyPropertyDescriptor]

'joinToString' @ [88:76] ==> public fun <T> Iterable<(KtAnnotationEntry..KtAnnotationEntry?)>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: (((KtAnnotationEntry..KtAnnotationEntry?)) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtAnnotationEntry..org.jetbrains.kotlin.psi.KtAnnotationEntry?)

'it' @ [88:108] ==> value-parameter it: (KtAnnotationEntry..KtAnnotationEntry?) defined in org.jetbrains.kotlin.idea.intentions.ConvertPrimaryConstructorToSecondaryIntention.applyTo.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'text' @ [88:111] ==> public final val KtAnnotationEntry.text: (String..String?)[MyPropertyDescriptor]

'if (valueParameter.isVarArg) VARARG_KEYWORD.value else ""' @ [89:38] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'valueParameter' @ [89:42] ==> val valueParameter: (KtParameter..KtParameter?) defined in org.jetbrains.kotlin.idea.intentions.ConvertPrimaryConstructorToSecondaryIntention.applyTo.<anonymous>[LocalVariableDescriptor]

'isVarArg' @ [89:57] ==> public final val KtParameter.isVarArg: Boolean[MyPropertyDescriptor]

'VARARG_KEYWORD' @ [89:67] ==> public final val VARARG_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'value' @ [89:82] ==> public final val KtModifierKeywordToken.value: String[MyPropertyDescriptor]

'param' @ [90:25] ==> public final fun param(name: String, type: String, defaultValue: String? = ...): KtPsiFactory.CallableBuilder defined in org.jetbrains.kotlin.psi.KtPsiFactory.CallableBuilder[DeserializedSimpleFunctionDescriptor]

'annotations' @ [90:33] ==> val annotations: String defined in org.jetbrains.kotlin.idea.intentions.ConvertPrimaryConstructorToSecondaryIntention.applyTo.<anonymous>[LocalVariableDescriptor]

'vararg' @ [90:46] ==> val vararg: String defined in org.jetbrains.kotlin.idea.intentions.ConvertPrimaryConstructorToSecondaryIntention.applyTo.<anonymous>[LocalVariableDescriptor]

'valueParameter' @ [90:55] ==> val valueParameter: (KtParameter..KtParameter?) defined in org.jetbrains.kotlin.idea.intentions.ConvertPrimaryConstructorToSecondaryIntention.applyTo.<anonymous>[LocalVariableDescriptor]

'name' @ [90:70] ==> public final val KtParameter.name: String?[MyPropertyDescriptor]

'valueParameter' @ [91:31] ==> val valueParameter: (KtParameter..KtParameter?) defined in org.jetbrains.kotlin.idea.intentions.ConvertPrimaryConstructorToSecondaryIntention.applyTo.<anonymous>[LocalVariableDescriptor]

'typeReference' @ [91:46] ==> public final var KtParameter.typeReference: KtTypeReference?[MyPropertyDescriptor]

'text' @ [91:61] ==> public final val KtTypeReference.text: (String..String?)[MyPropertyDescriptor]

'valueParameter' @ [91:73] ==> val valueParameter: (KtParameter..KtParameter?) defined in org.jetbrains.kotlin.idea.intentions.ConvertPrimaryConstructorToSecondaryIntention.applyTo.<anonymous>[LocalVariableDescriptor]

'defaultValue' @ [91:88] ==> public final val KtParameter.defaultValue: KtExpression?[MyPropertyDescriptor]

'text' @ [91:102] ==> public final val KtExpression.text: (String..String?)[MyPropertyDescriptor]

'noReturnType' @ [93:21] ==> public final fun noReturnType(): KtPsiFactory.CallableBuilder defined in org.jetbrains.kotlin.psi.KtPsiFactory.CallableBuilder[DeserializedSimpleFunctionDescriptor]

'klass' @ [94:44] ==> val klass: KtClass defined in org.jetbrains.kotlin.idea.intentions.ConvertPrimaryConstructorToSecondaryIntention.applyTo[LocalVariableDescriptor]

'superTypeListEntries' @ [94:50] ==> public final val KtClass.superTypeListEntries: List<KtSuperTypeListEntry>[MyPropertyDescriptor]

'superTypeEntry' @ [95:29] ==> val superTypeEntry: KtSuperTypeListEntry defined in org.jetbrains.kotlin.idea.intentions.ConvertPrimaryConstructorToSecondaryIntention.applyTo.<anonymous>[LocalVariableDescriptor]

'superDelegation' @ [96:29] ==> public final fun superDelegation(argumentList: String): KtPsiFactory.CallableBuilder defined in org.jetbrains.kotlin.psi.KtPsiFactory.CallableBuilder[DeserializedSimpleFunctionDescriptor]

'superTypeEntry' @ [96:45] ==> val superTypeEntry: KtSuperTypeListEntry defined in org.jetbrains.kotlin.idea.intentions.ConvertPrimaryConstructorToSecondaryIntention.applyTo.<anonymous>[LocalVariableDescriptor]

'valueArgumentList' @ [96:60] ==> public final val KtSuperTypeCallEntry.valueArgumentList: KtValueArgumentList?[MyPropertyDescriptor]

'text' @ [96:79] ==> public final val KtValueArgumentList.text: (String..String?)[MyPropertyDescriptor]

'superTypeEntry' @ [97:29] ==> val superTypeEntry: KtSuperTypeListEntry defined in org.jetbrains.kotlin.idea.intentions.ConvertPrimaryConstructorToSecondaryIntention.applyTo.<anonymous>[LocalVariableDescriptor]

'replace' @ [97:44] ==> public open fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtSuperTypeListEntry[JavaMethodDescriptor]

'factory' @ [97:52] ==> val factory: KtPsiFactory defined in org.jetbrains.kotlin.idea.intentions.ConvertPrimaryConstructorToSecondaryIntention.applyTo[LocalVariableDescriptor]

'createSuperTypeEntry' @ [97:60] ==> public final fun createSuperTypeEntry(text: String): KtSuperTypeEntry defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'superTypeEntry' @ [97:81] ==> val superTypeEntry: KtSuperTypeListEntry defined in org.jetbrains.kotlin.idea.intentions.ConvertPrimaryConstructorToSecondaryIntention.applyTo.<anonymous>[LocalVariableDescriptor]

'typeReference' @ [97:96] ==> public final val KtSuperTypeCallEntry.typeReference: KtTypeReference?[MyPropertyDescriptor]

'text' @ [97:112] ==> public final val KtTypeReference.text: (String..String?)[MyPropertyDescriptor]

'element' @ [100:54] ==> value-parameter element: KtPrimaryConstructor defined in org.jetbrains.kotlin.idea.intentions.ConvertPrimaryConstructorToSecondaryIntention.applyTo[ValueParameterDescriptorImpl]

'valueParameters' @ [100:62] ==> public final val KtPrimaryConstructor.valueParameters: (MutableList<(KtParameter..KtParameter?)>..List<(KtParameter..KtParameter?)>)[MyPropertyDescriptor]

'filter' @ [100:78] ==> public inline fun <T> Iterable<(KtParameter..KtParameter?)>.filter(predicate: ((KtParameter..KtParameter?)) -> Boolean): List<(KtParameter..KtParameter?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtParameter..org.jetbrains.kotlin.psi.KtParameter?)

'it' @ [100:87] ==> value-parameter it: (KtParameter..KtParameter?) defined in org.jetbrains.kotlin.idea.intentions.ConvertPrimaryConstructorToSecondaryIntention.applyTo.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'hasValOrVar' @ [100:90] ==> public open fun hasValOrVar(): Boolean defined in org.jetbrains.kotlin.psi.KtParameter[JavaMethodDescriptor]

'joinToString' @ [100:106] ==> public fun <T> Iterable<(KtParameter..KtParameter?)>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: (((KtParameter..KtParameter?)) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtParameter..org.jetbrains.kotlin.psi.KtParameter?)

'it' @ [101:36] ==> value-parameter it: (KtParameter..KtParameter?) defined in org.jetbrains.kotlin.idea.intentions.ConvertPrimaryConstructorToSecondaryIntention.applyTo.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [101:39] ==> public final val KtParameter.name: String?[MyPropertyDescriptor]

'name' @ [102:32] ==> val name: String defined in org.jetbrains.kotlin.idea.intentions.ConvertPrimaryConstructorToSecondaryIntention.applyTo.<anonymous>.<anonymous>[LocalVariableDescriptor]

'name' @ [102:40] ==> val name: String defined in org.jetbrains.kotlin.idea.intentions.ConvertPrimaryConstructorToSecondaryIntention.applyTo.<anonymous>.<anonymous>[LocalVariableDescriptor]

'klass' @ [104:49] ==> val klass: KtClass defined in org.jetbrains.kotlin.idea.intentions.ConvertPrimaryConstructorToSecondaryIntention.applyTo[LocalVariableDescriptor]

'declarations' @ [104:55] ==> public final val KtClass.declarations: List<KtDeclaration>[MyPropertyDescriptor]

'filter' @ [104:68] ==> public inline fun <T> Iterable<KtDeclaration>.filter(predicate: (KtDeclaration) -> Boolean): List<KtDeclaration> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtDeclaration

'it' @ [105:26] ==> value-parameter it: KtDeclaration defined in org.jetbrains.kotlin.idea.intentions.ConvertPrimaryConstructorToSecondaryIntention.applyTo.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'initializerMap' @ [105:46] ==> val initializerMap: MutableMap<KtProperty, String> defined in org.jetbrains.kotlin.idea.intentions.ConvertPrimaryConstructorToSecondaryIntention.applyTo[LocalVariableDescriptor]

'it' @ [105:61] ==> value-parameter it: KtDeclaration defined in org.jetbrains.kotlin.idea.intentions.ConvertPrimaryConstructorToSecondaryIntention.applyTo.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [105:77] ==> value-parameter it: KtDeclaration defined in org.jetbrains.kotlin.idea.intentions.ConvertPrimaryConstructorToSecondaryIntention.applyTo.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'joinToString' @ [106:23] ==> public fun <T> Iterable<KtDeclaration>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((KtDeclaration) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtDeclaration

'if (it is KtProperty) {
                            val name = it.name!!
                            val text = initializerMap[it]
                            if (text != null) {
                                "${THIS_KEYWORD.value}.$name = $text"
                            }
                            else {
                                ""
                            }
                        }
                        else {
                            ((it as KtAnonymousInitializer).body as? KtBlockExpression)?.statements?.joinToString(separator = "\n") {
                                it.text
                            } ?: ""
                        }' @ [107:25] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: CharSequence, elseBranch: CharSequence): CharSequence[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> CharSequence

'it' @ [107:29] ==> value-parameter it: KtDeclaration defined in org.jetbrains.kotlin.idea.intentions.ConvertPrimaryConstructorToSecondaryIntention.applyTo.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [108:40] ==> value-parameter it: KtDeclaration defined in org.jetbrains.kotlin.idea.intentions.ConvertPrimaryConstructorToSecondaryIntention.applyTo.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [108:43] ==> public final val KtProperty.name: String?[MyPropertyDescriptor]

'initializerMap' @ [109:40] ==> val initializerMap: MutableMap<KtProperty, String> defined in org.jetbrains.kotlin.idea.intentions.ConvertPrimaryConstructorToSecondaryIntention.applyTo[LocalVariableDescriptor]

'it' @ [109:55] ==> value-parameter it: KtDeclaration defined in org.jetbrains.kotlin.idea.intentions.ConvertPrimaryConstructorToSecondaryIntention.applyTo.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'if (text != null) {
                                "${THIS_KEYWORD.value}.$name = $text"
                            }
                            else {
                                ""
                            }' @ [110:29] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'text' @ [110:33] ==> val text: String? defined in org.jetbrains.kotlin.idea.intentions.ConvertPrimaryConstructorToSecondaryIntention.applyTo.<anonymous>.<anonymous>[LocalVariableDescriptor]

'THIS_KEYWORD' @ [111:36] ==> public final val THIS_KEYWORD: (KtKeywordToken..KtKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'value' @ [111:49] ==> public final val KtKeywordToken.value: String[MyPropertyDescriptor]

'name' @ [111:57] ==> val name: String defined in org.jetbrains.kotlin.idea.intentions.ConvertPrimaryConstructorToSecondaryIntention.applyTo.<anonymous>.<anonymous>[LocalVariableDescriptor]

'text' @ [111:65] ==> val text: String? defined in org.jetbrains.kotlin.idea.intentions.ConvertPrimaryConstructorToSecondaryIntention.applyTo.<anonymous>.<anonymous>[LocalVariableDescriptor]

'?:' @ [118:29] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: String?, right: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> String

'it' @ [118:31] ==> value-parameter it: KtDeclaration defined in org.jetbrains.kotlin.idea.intentions.ConvertPrimaryConstructorToSecondaryIntention.applyTo.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'body' @ [118:61] ==> public abstract val body: KtExpression? defined in org.jetbrains.kotlin.psi.KtAnonymousInitializer[DeserializedPropertyDescriptor]

'statements' @ [118:90] ==> public final val KtBlockExpression.statements: List<(KtExpression..KtExpression?)>[MyPropertyDescriptor]

'joinToString' @ [118:102] ==> public fun <T> Iterable<(KtExpression..KtExpression?)>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: (((KtExpression..KtExpression?)) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtExpression..org.jetbrains.kotlin.psi.KtExpression?)

'it' @ [119:33] ==> value-parameter it: (KtExpression..KtExpression?) defined in org.jetbrains.kotlin.idea.intentions.ConvertPrimaryConstructorToSecondaryIntention.applyTo.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'text' @ [119:36] ==> public final val KtExpression.text: (String..String?)[MyPropertyDescriptor]

'listOf' @ [123:43] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'valueParameterInitializers' @ [123:50] ==> val valueParameterInitializers: String defined in org.jetbrains.kotlin.idea.intentions.ConvertPrimaryConstructorToSecondaryIntention.applyTo.<anonymous>[LocalVariableDescriptor]

'classBodyInitializers' @ [123:78] ==> val classBodyInitializers: String defined in org.jetbrains.kotlin.idea.intentions.ConvertPrimaryConstructorToSecondaryIntention.applyTo.<anonymous>[LocalVariableDescriptor]

'filter' @ [123:101] ==> public inline fun <T> Iterable<String>.filter(predicate: (String) -> Boolean): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'String' @ [123:108] ==> public companion object defined in kotlin.String[FakeCallableDescriptorForObject]

'allInitializers' @ [124:25] ==> val allInitializers: List<String> defined in org.jetbrains.kotlin.idea.intentions.ConvertPrimaryConstructorToSecondaryIntention.applyTo.<anonymous>[LocalVariableDescriptor]

'isNotEmpty' @ [124:41] ==> @InlineOnly public inline fun <T> Collection<String>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'blockBody' @ [125:25] ==> public final fun blockBody(body: String): KtPsiFactory.CallableBuilder defined in org.jetbrains.kotlin.psi.KtPsiFactory.CallableBuilder[DeserializedSimpleFunctionDescriptor]

'allInitializers' @ [125:35] ==> val allInitializers: List<String> defined in org.jetbrains.kotlin.idea.intentions.ConvertPrimaryConstructorToSecondaryIntention.applyTo.<anonymous>[LocalVariableDescriptor]

'joinToString' @ [125:51] ==> public fun <T> Iterable<String>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'asString' @ [127:19] ==> public final fun asString(): String defined in org.jetbrains.kotlin.psi.KtPsiFactory.CallableBuilder[DeserializedSimpleFunctionDescriptor]

'klass' @ [130:29] ==> val klass: KtClass defined in org.jetbrains.kotlin.idea.intentions.ConvertPrimaryConstructorToSecondaryIntention.applyTo[LocalVariableDescriptor]

'declarations' @ [130:35] ==> public final val KtClass.declarations: List<KtDeclaration>[MyPropertyDescriptor]

'lastOrNull' @ [130:48] ==> public inline fun <T> List<KtDeclaration>.lastOrNull(predicate: (KtDeclaration) -> Boolean): KtDeclaration? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtDeclaration

'it' @ [130:61] ==> value-parameter it: KtDeclaration defined in org.jetbrains.kotlin.idea.intentions.ConvertPrimaryConstructorToSecondaryIntention.applyTo.<anonymous>[ValueParameterDescriptorImpl]

'lastEnumEntry' @ [132:17] ==> val lastEnumEntry: KtEnumEntry? defined in org.jetbrains.kotlin.idea.intentions.ConvertPrimaryConstructorToSecondaryIntention.applyTo[LocalVariableDescriptor]

'let' @ [132:32] ==> @InlineOnly public inline fun <T, R> KtEnumEntry.let(block: (KtEnumEntry) -> KtSecondaryConstructor): KtSecondaryConstructor defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtEnumEntry
    <R> -> KtSecondaryConstructor

'klass' @ [132:38] ==> val klass: KtClass defined in org.jetbrains.kotlin.idea.intentions.ConvertPrimaryConstructorToSecondaryIntention.applyTo[LocalVariableDescriptor]

'addDeclarationAfter' @ [132:44] ==> public final inline fun <reified T : KtDeclaration> addDeclarationAfter(declaration: KtSecondaryConstructor, anchor: PsiElement?): KtSecondaryConstructor defined in org.jetbrains.kotlin.psi.KtClass[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : KtDeclaration> -> KtSecondaryConstructor

'constructor' @ [132:64] ==> val constructor: KtSecondaryConstructor defined in org.jetbrains.kotlin.idea.intentions.ConvertPrimaryConstructorToSecondaryIntention.applyTo[LocalVariableDescriptor]

'it' @ [132:77] ==> value-parameter it: KtEnumEntry defined in org.jetbrains.kotlin.idea.intentions.ConvertPrimaryConstructorToSecondaryIntention.applyTo.<anonymous>[ValueParameterDescriptorImpl]

'klass' @ [132:86] ==> val klass: KtClass defined in org.jetbrains.kotlin.idea.intentions.ConvertPrimaryConstructorToSecondaryIntention.applyTo[LocalVariableDescriptor]

'addDeclarationBefore' @ [132:92] ==> public final inline fun <reified T : KtDeclaration> addDeclarationBefore(declaration: KtSecondaryConstructor, anchor: PsiElement?): KtSecondaryConstructor defined in org.jetbrains.kotlin.psi.KtClass[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : KtDeclaration> -> KtSecondaryConstructor

'constructor' @ [132:113] ==> val constructor: KtSecondaryConstructor defined in org.jetbrains.kotlin.idea.intentions.ConvertPrimaryConstructorToSecondaryIntention.applyTo[LocalVariableDescriptor]

'commentSaver' @ [133:9] ==> val commentSaver: CommentSaver defined in org.jetbrains.kotlin.idea.intentions.ConvertPrimaryConstructorToSecondaryIntention.applyTo[LocalVariableDescriptor]

'restore' @ [133:22] ==> public final fun restore(resultElement: PsiElement, forceAdjustIndent: Boolean = ...): Unit defined in org.jetbrains.kotlin.idea.util.CommentSaver[DeserializedSimpleFunctionDescriptor]

'secondaryConstructor' @ [133:30] ==> val secondaryConstructor: KtSecondaryConstructor defined in org.jetbrains.kotlin.idea.intentions.ConvertPrimaryConstructorToSecondaryIntention.applyTo[LocalVariableDescriptor]

'convertValueParametersToProperties' @ [135:9] ==> private final fun convertValueParametersToProperties(element: KtPrimaryConstructor, klass: KtClass, factory: KtPsiFactory, anchorBefore: PsiElement?): Unit defined in org.jetbrains.kotlin.idea.intentions.ConvertPrimaryConstructorToSecondaryIntention[SimpleFunctionDescriptorImpl]

'element' @ [135:44] ==> value-parameter element: KtPrimaryConstructor defined in org.jetbrains.kotlin.idea.intentions.ConvertPrimaryConstructorToSecondaryIntention.applyTo[ValueParameterDescriptorImpl]

'klass' @ [135:53] ==> val klass: KtClass defined in org.jetbrains.kotlin.idea.intentions.ConvertPrimaryConstructorToSecondaryIntention.applyTo[LocalVariableDescriptor]

'factory' @ [135:60] ==> val factory: KtPsiFactory defined in org.jetbrains.kotlin.idea.intentions.ConvertPrimaryConstructorToSecondaryIntention.applyTo[LocalVariableDescriptor]

'lastEnumEntry' @ [135:69] ==> val lastEnumEntry: KtEnumEntry? defined in org.jetbrains.kotlin.idea.intentions.ConvertPrimaryConstructorToSecondaryIntention.applyTo[LocalVariableDescriptor]

'klass' @ [136:13] ==> val klass: KtClass defined in org.jetbrains.kotlin.idea.intentions.ConvertPrimaryConstructorToSecondaryIntention.applyTo[LocalVariableDescriptor]

'isEnum' @ [136:19] ==> public final fun isEnum(): Boolean defined in org.jetbrains.kotlin.psi.KtClass[DeserializedSimpleFunctionDescriptor]

'addSemicolonIfNotExist' @ [137:13] ==> private final fun addSemicolonIfNotExist(klass: KtClass, factory: KtPsiFactory, lastEnumEntry: KtEnumEntry?): Unit defined in org.jetbrains.kotlin.idea.intentions.ConvertPrimaryConstructorToSecondaryIntention[SimpleFunctionDescriptorImpl]

'klass' @ [137:36] ==> val klass: KtClass defined in org.jetbrains.kotlin.idea.intentions.ConvertPrimaryConstructorToSecondaryIntention.applyTo[LocalVariableDescriptor]

'factory' @ [137:43] ==> val factory: KtPsiFactory defined in org.jetbrains.kotlin.idea.intentions.ConvertPrimaryConstructorToSecondaryIntention.applyTo[LocalVariableDescriptor]

'lastEnumEntry' @ [137:52] ==> val lastEnumEntry: KtEnumEntry? defined in org.jetbrains.kotlin.idea.intentions.ConvertPrimaryConstructorToSecondaryIntention.applyTo[LocalVariableDescriptor]

'klass' @ [140:38] ==> val klass: KtClass defined in org.jetbrains.kotlin.idea.intentions.ConvertPrimaryConstructorToSecondaryIntention.applyTo[LocalVariableDescriptor]

'getAnonymousInitializers' @ [140:44] ==> public final fun getAnonymousInitializers(): List<KtAnonymousInitializer> defined in org.jetbrains.kotlin.psi.KtClass[DeserializedSimpleFunctionDescriptor]

'anonymousInitializer' @ [141:13] ==> val anonymousInitializer: KtAnonymousInitializer defined in org.jetbrains.kotlin.idea.intentions.ConvertPrimaryConstructorToSecondaryIntention.applyTo[LocalVariableDescriptor]

'delete' @ [141:34] ==> public abstract fun delete(): Unit defined in org.jetbrains.kotlin.psi.KtAnonymousInitializer[JavaMethodDescriptor]

'element' @ [143:9] ==> value-parameter element: KtPrimaryConstructor defined in org.jetbrains.kotlin.idea.intentions.ConvertPrimaryConstructorToSecondaryIntention.applyTo[ValueParameterDescriptorImpl]

'delete' @ [143:17] ==> public open fun delete(): Unit defined in org.jetbrains.kotlin.psi.KtPrimaryConstructor[JavaMethodDescriptor]

'element' @ [149:32] ==> value-parameter element: KtPrimaryConstructor defined in org.jetbrains.kotlin.idea.intentions.ConvertPrimaryConstructorToSecondaryIntention.convertValueParametersToProperties[ValueParameterDescriptorImpl]

'valueParameters' @ [149:40] ==> public final val KtPrimaryConstructor.valueParameters: (MutableList<(KtParameter..KtParameter?)>..List<(KtParameter..KtParameter?)>)[MyPropertyDescriptor]

'reversed' @ [149:56] ==> public fun <T> Iterable<(KtParameter..KtParameter?)>.reversed(): List<(KtParameter..KtParameter?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtParameter..org.jetbrains.kotlin.psi.KtParameter?)

'!' @ [150:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'valueParameter' @ [150:18] ==> val valueParameter: (KtParameter..KtParameter?) defined in org.jetbrains.kotlin.idea.intentions.ConvertPrimaryConstructorToSecondaryIntention.convertValueParametersToProperties[LocalVariableDescriptor]

'hasValOrVar' @ [150:33] ==> public open fun hasValOrVar(): Boolean defined in org.jetbrains.kotlin.psi.KtParameter[JavaMethodDescriptor]

'valueParameter' @ [151:28] ==> val valueParameter: (KtParameter..KtParameter?) defined in org.jetbrains.kotlin.idea.intentions.ConvertPrimaryConstructorToSecondaryIntention.convertValueParametersToProperties[LocalVariableDescriptor]

'hasModifier' @ [151:43] ==> public open fun hasModifier(@NotNull p0: KtModifierKeywordToken): Boolean defined in org.jetbrains.kotlin.psi.KtParameter[JavaMethodDescriptor]

'VARARG_KEYWORD' @ [151:55] ==> public final val VARARG_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'valueParameter' @ [152:13] ==> val valueParameter: (KtParameter..KtParameter?) defined in org.jetbrains.kotlin.idea.intentions.ConvertPrimaryConstructorToSecondaryIntention.convertValueParametersToProperties[LocalVariableDescriptor]

'removeModifier' @ [152:28] ==> public open fun removeModifier(@NotNull p0: KtModifierKeywordToken): Unit defined in org.jetbrains.kotlin.psi.KtParameter[JavaMethodDescriptor]

'VARARG_KEYWORD' @ [152:43] ==> public final val VARARG_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'valueParameter' @ [153:28] ==> val valueParameter: (KtParameter..KtParameter?) defined in org.jetbrains.kotlin.idea.intentions.ConvertPrimaryConstructorToSecondaryIntention.convertValueParametersToProperties[LocalVariableDescriptor]

'typeReference' @ [153:43] ==> public final var KtParameter.typeReference: KtTypeReference?[MyPropertyDescriptor]

'text' @ [153:58] ==> public final val KtTypeReference.text: (String..String?)[MyPropertyDescriptor]

'factory' @ [154:28] ==> value-parameter factory: KtPsiFactory defined in org.jetbrains.kotlin.idea.intentions.ConvertPrimaryConstructorToSecondaryIntention.convertValueParametersToProperties[ValueParameterDescriptorImpl]

'createProperty' @ [154:36] ==> public final fun createProperty(modifiers: String?, name: String, type: String?, isVar: Boolean, initializer: String?): KtProperty defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'valueParameter' @ [154:51] ==> val valueParameter: (KtParameter..KtParameter?) defined in org.jetbrains.kotlin.idea.intentions.ConvertPrimaryConstructorToSecondaryIntention.convertValueParametersToProperties[LocalVariableDescriptor]

'modifierList' @ [154:66] ==> public final val KtParameter.modifierList: KtModifierList?[MyPropertyDescriptor]

'text' @ [154:80] ==> public final val KtModifierList.text: (String..String?)[MyPropertyDescriptor]

'valueParameter' @ [154:86] ==> val valueParameter: (KtParameter..KtParameter?) defined in org.jetbrains.kotlin.idea.intentions.ConvertPrimaryConstructorToSecondaryIntention.convertValueParametersToProperties[LocalVariableDescriptor]

'name' @ [154:101] ==> public final val KtParameter.name: String?[MyPropertyDescriptor]

'if (isVararg && typeText != null) "Array<out $typeText>" else typeText' @ [155:51] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String?, elseBranch: String?): String?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String?

'isVararg' @ [155:55] ==> val isVararg: Boolean defined in org.jetbrains.kotlin.idea.intentions.ConvertPrimaryConstructorToSecondaryIntention.convertValueParametersToProperties[LocalVariableDescriptor]

'typeText' @ [155:67] ==> val typeText: String? defined in org.jetbrains.kotlin.idea.intentions.ConvertPrimaryConstructorToSecondaryIntention.convertValueParametersToProperties[LocalVariableDescriptor]

'typeText' @ [155:97] ==> val typeText: String? defined in org.jetbrains.kotlin.idea.intentions.ConvertPrimaryConstructorToSecondaryIntention.convertValueParametersToProperties[LocalVariableDescriptor]

'typeText' @ [155:113] ==> val typeText: String? defined in org.jetbrains.kotlin.idea.intentions.ConvertPrimaryConstructorToSecondaryIntention.convertValueParametersToProperties[LocalVariableDescriptor]

'valueParameter' @ [156:51] ==> val valueParameter: (KtParameter..KtParameter?) defined in org.jetbrains.kotlin.idea.intentions.ConvertPrimaryConstructorToSecondaryIntention.convertValueParametersToProperties[LocalVariableDescriptor]

'isMutable' @ [156:66] ==> public final val KtParameter.isMutable: Boolean[MyPropertyDescriptor]

'if (anchorBefore == null) klass.addDeclarationBefore(property, null) else klass.addDeclarationAfter(property, anchorBefore)' @ [157:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtProperty, elseBranch: KtProperty): KtProperty[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtProperty

'anchorBefore' @ [157:17] ==> value-parameter anchorBefore: PsiElement? defined in org.jetbrains.kotlin.idea.intentions.ConvertPrimaryConstructorToSecondaryIntention.convertValueParametersToProperties[ValueParameterDescriptorImpl]

'klass' @ [157:39] ==> value-parameter klass: KtClass defined in org.jetbrains.kotlin.idea.intentions.ConvertPrimaryConstructorToSecondaryIntention.convertValueParametersToProperties[ValueParameterDescriptorImpl]

'addDeclarationBefore' @ [157:45] ==> public final inline fun <reified T : KtDeclaration> addDeclarationBefore(declaration: KtProperty, anchor: PsiElement?): KtProperty defined in org.jetbrains.kotlin.psi.KtClass[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : KtDeclaration> -> KtProperty

'property' @ [157:66] ==> val property: KtProperty defined in org.jetbrains.kotlin.idea.intentions.ConvertPrimaryConstructorToSecondaryIntention.convertValueParametersToProperties[LocalVariableDescriptor]

'klass' @ [157:87] ==> value-parameter klass: KtClass defined in org.jetbrains.kotlin.idea.intentions.ConvertPrimaryConstructorToSecondaryIntention.convertValueParametersToProperties[ValueParameterDescriptorImpl]

'addDeclarationAfter' @ [157:93] ==> public final inline fun <reified T : KtDeclaration> addDeclarationAfter(declaration: KtProperty, anchor: PsiElement?): KtProperty defined in org.jetbrains.kotlin.psi.KtClass[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : KtDeclaration> -> KtProperty

'property' @ [157:113] ==> val property: KtProperty defined in org.jetbrains.kotlin.idea.intentions.ConvertPrimaryConstructorToSecondaryIntention.convertValueParametersToProperties[LocalVariableDescriptor]

'anchorBefore' @ [157:123] ==> value-parameter anchorBefore: PsiElement? defined in org.jetbrains.kotlin.idea.intentions.ConvertPrimaryConstructorToSecondaryIntention.convertValueParametersToProperties[ValueParameterDescriptorImpl]

'if (lastEnumEntry == null) {
            klass.getOrCreateBody().let { it.addAfter(factory.createSemicolon(), it.lBrace) }
        }
        else if (lastEnumEntry.getChildrenOfType<LeafPsiElement>().none { it.elementType == KtTokens.SEMICOLON }) {
            lastEnumEntry.add(factory.createSemicolon())
        }' @ [162:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (Any..Any?), elseBranch: (Any..Any?)): (Any..Any?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (kotlin.Any..kotlin.Any?)

'lastEnumEntry' @ [162:13] ==> value-parameter lastEnumEntry: KtEnumEntry? defined in org.jetbrains.kotlin.idea.intentions.ConvertPrimaryConstructorToSecondaryIntention.addSemicolonIfNotExist[ValueParameterDescriptorImpl]

'klass' @ [163:13] ==> value-parameter klass: KtClass defined in org.jetbrains.kotlin.idea.intentions.ConvertPrimaryConstructorToSecondaryIntention.addSemicolonIfNotExist[ValueParameterDescriptorImpl]

'getOrCreateBody' @ [163:19] ==> public fun KtClassOrObject.getOrCreateBody(): KtClassBody defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'let' @ [163:37] ==> @InlineOnly public inline fun <T, R> KtClassBody.let(block: (KtClassBody) -> (PsiElement..PsiElement?)): (PsiElement..PsiElement?) defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtClassBody
    <R> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'it' @ [163:43] ==> value-parameter it: KtClassBody defined in org.jetbrains.kotlin.idea.intentions.ConvertPrimaryConstructorToSecondaryIntention.addSemicolonIfNotExist.<anonymous>[ValueParameterDescriptorImpl]

'addAfter' @ [163:46] ==> public open fun addAfter(@NotNull p0: PsiElement, p1: PsiElement?): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtClassBody[JavaMethodDescriptor]

'factory' @ [163:55] ==> value-parameter factory: KtPsiFactory defined in org.jetbrains.kotlin.idea.intentions.ConvertPrimaryConstructorToSecondaryIntention.addSemicolonIfNotExist[ValueParameterDescriptorImpl]

'createSemicolon' @ [163:63] ==> public final fun createSemicolon(): PsiElement defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'it' @ [163:82] ==> value-parameter it: KtClassBody defined in org.jetbrains.kotlin.idea.intentions.ConvertPrimaryConstructorToSecondaryIntention.addSemicolonIfNotExist.<anonymous>[ValueParameterDescriptorImpl]

'lBrace' @ [163:85] ==> public final val lBrace: PsiElement? defined in org.jetbrains.kotlin.psi.KtClassBody[DeserializedPropertyDescriptor]

'lastEnumEntry' @ [165:18] ==> value-parameter lastEnumEntry: KtEnumEntry? defined in org.jetbrains.kotlin.idea.intentions.ConvertPrimaryConstructorToSecondaryIntention.addSemicolonIfNotExist[ValueParameterDescriptorImpl]

'getChildrenOfType' @ [165:32] ==> public inline fun <reified T : PsiElement> PsiElement.getChildrenOfType(): Array<LeafPsiElement> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> LeafPsiElement

'none' @ [165:68] ==> public inline fun <T> Array<out LeafPsiElement>.none(predicate: (LeafPsiElement) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LeafPsiElement

'it' @ [165:75] ==> value-parameter it: LeafPsiElement defined in org.jetbrains.kotlin.idea.intentions.ConvertPrimaryConstructorToSecondaryIntention.addSemicolonIfNotExist.<anonymous>[ValueParameterDescriptorImpl]

'elementType' @ [165:78] ==> public final val LeafPsiElement.elementType: IElementType[MyPropertyDescriptor]

'SEMICOLON' @ [165:102] ==> public final val SEMICOLON: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'lastEnumEntry' @ [166:13] ==> value-parameter lastEnumEntry: KtEnumEntry? defined in org.jetbrains.kotlin.idea.intentions.ConvertPrimaryConstructorToSecondaryIntention.addSemicolonIfNotExist[ValueParameterDescriptorImpl]

'add' @ [166:27] ==> public open fun add(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtEnumEntry[JavaMethodDescriptor]

'factory' @ [166:31] ==> value-parameter factory: KtPsiFactory defined in org.jetbrains.kotlin.idea.intentions.ConvertPrimaryConstructorToSecondaryIntention.addSemicolonIfNotExist[ValueParameterDescriptorImpl]

'createSemicolon' @ [166:39] ==> public final fun createSemicolon(): PsiElement defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

