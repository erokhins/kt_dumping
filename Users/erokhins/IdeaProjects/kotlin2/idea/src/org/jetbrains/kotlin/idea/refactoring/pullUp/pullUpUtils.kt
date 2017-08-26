'hasInitializer' @ [43:9] ==> public open fun hasInitializer(): Boolean defined in org.jetbrains.kotlin.psi.KtProperty[JavaMethodDescriptor]

'hasDelegate' @ [43:29] ==> public open fun hasDelegate(): Boolean defined in org.jetbrains.kotlin.psi.KtProperty[JavaMethodDescriptor]

'!' @ [43:47] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'hasInitializer' @ [43:48] ==> public open fun hasInitializer(): Boolean defined in org.jetbrains.kotlin.psi.KtProperty[JavaMethodDescriptor]

'!' @ [43:68] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'hasDelegate' @ [43:69] ==> public open fun hasDelegate(): Boolean defined in org.jetbrains.kotlin.psi.KtProperty[JavaMethodDescriptor]

'accessors' @ [43:86] ==> public final val KtProperty.accessors: (MutableList<(KtPropertyAccessor..KtPropertyAccessor?)>..List<(KtPropertyAccessor..KtPropertyAccessor?)>)[MyPropertyDescriptor]

'isEmpty' @ [43:96] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'originalClass' @ [46:9] ==> value-parameter originalClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.refactoring.pullUp.isAbstractInInterface[ValueParameterDescriptorImpl]

'originalClass' @ [46:37] ==> value-parameter originalClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.refactoring.pullUp.isAbstractInInterface[ValueParameterDescriptorImpl]

'isInterface' @ [46:51] ==> public final fun isInterface(): Boolean defined in org.jetbrains.kotlin.psi.KtClass[DeserializedSimpleFunctionDescriptor]

'isAbstract' @ [46:68] ==> public fun KtNamedDeclaration.isAbstract(): Boolean defined in org.jetbrains.kotlin.idea.refactoring in file kotlinRefactoringUtil.kt[SimpleFunctionDescriptorImpl]

'when (this) {
        is KtProperty, is KtParameter -> {
            if (targetClass.isInterface) return false
            if (hasModifier(KtTokens.OPEN_KEYWORD) || hasModifier(KtTokens.ABSTRACT_KEYWORD)) return false
            if (this is KtProperty && (accessors.isNotEmpty() || delegateExpression != null)) return false
            true
        }
        is KtNamedFunction -> valueParameters.all { it.defaultValue == null }
        else -> false
    }' @ [49:12] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'this' @ [49:18] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.pullUp.canMoveMemberToJavaClass[ReceiverParameterDescriptorImpl]

'targetClass' @ [51:17] ==> value-parameter targetClass: PsiClass defined in org.jetbrains.kotlin.idea.refactoring.pullUp.canMoveMemberToJavaClass[ValueParameterDescriptorImpl]

'isInterface' @ [51:29] ==> public final val PsiClass.isInterface: Boolean[MyPropertyDescriptor]

'hasModifier' @ [52:17] ==> public abstract fun hasModifier(@NotNull p0: KtModifierKeywordToken): Boolean defined in org.jetbrains.kotlin.psi.KtNamedDeclaration[JavaMethodDescriptor]

'OPEN_KEYWORD' @ [52:38] ==> public final val OPEN_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'hasModifier' @ [52:55] ==> public abstract fun hasModifier(@NotNull p0: KtModifierKeywordToken): Boolean defined in org.jetbrains.kotlin.psi.KtNamedDeclaration[JavaMethodDescriptor]

'ABSTRACT_KEYWORD' @ [52:76] ==> public final val ABSTRACT_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'this' @ [53:17] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.pullUp.canMoveMemberToJavaClass[ReceiverParameterDescriptorImpl]

'accessors' @ [53:40] ==> public final val KtProperty.accessors: (MutableList<(KtPropertyAccessor..KtPropertyAccessor?)>..List<(KtPropertyAccessor..KtPropertyAccessor?)>)[MyPropertyDescriptor]

'isNotEmpty' @ [53:50] ==> @InlineOnly public inline fun <T> Collection<(KtPropertyAccessor..KtPropertyAccessor?)>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtPropertyAccessor..org.jetbrains.kotlin.psi.KtPropertyAccessor?)

'delegateExpression' @ [53:66] ==> public final val KtProperty.delegateExpression: KtExpression?[MyPropertyDescriptor]

'valueParameters' @ [56:31] ==> public final val KtNamedFunction.valueParameters: (MutableList<(KtParameter..KtParameter?)>..List<(KtParameter..KtParameter?)>)[MyPropertyDescriptor]

'all' @ [56:47] ==> public inline fun <T> Iterable<(KtParameter..KtParameter?)>.all(predicate: ((KtParameter..KtParameter?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtParameter..org.jetbrains.kotlin.psi.KtParameter?)

'it' @ [56:53] ==> value-parameter it: (KtParameter..KtParameter?) defined in org.jetbrains.kotlin.idea.refactoring.pullUp.canMoveMemberToJavaClass.<anonymous>[ValueParameterDescriptorImpl]

'defaultValue' @ [56:56] ==> public final val KtParameter.defaultValue: KtExpression?[MyPropertyDescriptor]

'targetClass' @ [62:9] ==> value-parameter targetClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.refactoring.pullUp.addMemberToTarget[ValueParameterDescriptorImpl]

'targetClass' @ [62:35] ==> value-parameter targetClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.refactoring.pullUp.addMemberToTarget[ValueParameterDescriptorImpl]

'isInterface' @ [62:47] ==> public final fun isInterface(): Boolean defined in org.jetbrains.kotlin.psi.KtClass[DeserializedSimpleFunctionDescriptor]

'targetMember' @ [63:9] ==> value-parameter targetMember: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.pullUp.addMemberToTarget[ValueParameterDescriptorImpl]

'removeModifier' @ [63:22] ==> public abstract fun removeModifier(@NotNull p0: KtModifierKeywordToken): Unit defined in org.jetbrains.kotlin.psi.KtNamedDeclaration[JavaMethodDescriptor]

'FINAL_KEYWORD' @ [63:46] ==> public final val FINAL_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'targetMember' @ [66:9] ==> value-parameter targetMember: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.pullUp.addMemberToTarget[ValueParameterDescriptorImpl]

'!!' @ [67:29] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: KtParameterList?): KtParameterList[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> KtParameterList

'targetClass' @ [67:30] ==> value-parameter targetClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.refactoring.pullUp.addMemberToTarget[ValueParameterDescriptorImpl]

'createPrimaryConstructorIfAbsent' @ [67:54] ==> public fun KtClass.createPrimaryConstructorIfAbsent(): KtPrimaryConstructor defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'valueParameterList' @ [67:89] ==> public final val KtPrimaryConstructor.valueParameterList: KtParameterList?[MyPropertyDescriptor]

'parameterList' @ [68:22] ==> val parameterList: KtParameterList defined in org.jetbrains.kotlin.idea.refactoring.pullUp.addMemberToTarget[LocalVariableDescriptor]

'parameters' @ [68:36] ==> public final val KtParameterList.parameters: (MutableList<(KtParameter..KtParameter?)>..List<(KtParameter..KtParameter?)>)[MyPropertyDescriptor]

'firstOrNull' @ [68:47] ==> public inline fun <T> Iterable<(KtParameter..KtParameter?)>.firstOrNull(predicate: ((KtParameter..KtParameter?)) -> Boolean): KtParameter? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtParameter..org.jetbrains.kotlin.psi.KtParameter?)

'it' @ [68:61] ==> value-parameter it: (KtParameter..KtParameter?) defined in org.jetbrains.kotlin.idea.refactoring.pullUp.addMemberToTarget.<anonymous>[ValueParameterDescriptorImpl]

'isVarArg' @ [68:64] ==> public final val KtParameter.isVarArg: Boolean[MyPropertyDescriptor]

'it' @ [68:76] ==> value-parameter it: (KtParameter..KtParameter?) defined in org.jetbrains.kotlin.idea.refactoring.pullUp.addMemberToTarget.<anonymous>[ValueParameterDescriptorImpl]

'hasDefaultValue' @ [68:79] ==> public open fun hasDefaultValue(): Boolean defined in org.jetbrains.kotlin.psi.KtParameter[JavaMethodDescriptor]

'parameterList' @ [69:16] ==> val parameterList: KtParameterList defined in org.jetbrains.kotlin.idea.refactoring.pullUp.addMemberToTarget[LocalVariableDescriptor]

'addParameterBefore' @ [69:30] ==> @NotNull public open fun addParameterBefore(@NotNull p0: KtParameter, @Nullable p1: KtParameter?): KtParameter defined in org.jetbrains.kotlin.psi.KtParameterList[JavaMethodDescriptor]

'targetMember' @ [69:49] ==> value-parameter targetMember: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.pullUp.addMemberToTarget[ValueParameterDescriptorImpl]

'anchor' @ [69:63] ==> val anchor: KtParameter? defined in org.jetbrains.kotlin.idea.refactoring.pullUp.addMemberToTarget[LocalVariableDescriptor]

'targetClass' @ [72:18] ==> value-parameter targetClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.refactoring.pullUp.addMemberToTarget[ValueParameterDescriptorImpl]

'declarations' @ [72:30] ==> public final val KtClassOrObject.declarations: List<KtDeclaration>[MyPropertyDescriptor]

'filterIsInstance' @ [72:43] ==> public fun <R> Iterable<*>.filterIsInstance(klass: Class<out KtNamedDeclaration>): List<KtNamedDeclaration> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Captured(out KtNamedDeclaration)

'targetMember' @ [72:60] ==> value-parameter targetMember: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.pullUp.addMemberToTarget[ValueParameterDescriptorImpl]

'java' @ [72:80] ==> public val <T> KClass<out KtNamedDeclaration>.java: Class<out KtNamedDeclaration> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Captured(out KtNamedDeclaration)

'lastOrNull' @ [72:86] ==> public fun <T> List<KtNamedDeclaration>.lastOrNull(): KtNamedDeclaration? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtNamedDeclaration

'when {
        anchor == null && targetMember is KtProperty -> targetClass.addDeclarationBefore(targetMember, null)
        else -> targetClass.addDeclarationAfter(targetMember, anchor)
    }' @ [73:12] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KtNamedDeclaration, entry1: KtNamedDeclaration): KtNamedDeclaration[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KtNamedDeclaration

'anchor' @ [74:9] ==> val anchor: KtNamedDeclaration? defined in org.jetbrains.kotlin.idea.refactoring.pullUp.addMemberToTarget[LocalVariableDescriptor]

'targetMember' @ [74:27] ==> value-parameter targetMember: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.pullUp.addMemberToTarget[ValueParameterDescriptorImpl]

'targetClass' @ [74:57] ==> value-parameter targetClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.refactoring.pullUp.addMemberToTarget[ValueParameterDescriptorImpl]

'addDeclarationBefore' @ [74:69] ==> public final inline fun <reified T : KtDeclaration> addDeclarationBefore(declaration: KtProperty, anchor: PsiElement?): KtProperty defined in org.jetbrains.kotlin.psi.KtClassOrObject[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : KtDeclaration> -> KtProperty

'targetMember' @ [74:90] ==> value-parameter targetMember: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.pullUp.addMemberToTarget[ValueParameterDescriptorImpl]

'targetClass' @ [75:17] ==> value-parameter targetClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.refactoring.pullUp.addMemberToTarget[ValueParameterDescriptorImpl]

'addDeclarationAfter' @ [75:29] ==> public final inline fun <reified T : KtDeclaration> addDeclarationAfter(declaration: KtNamedDeclaration, anchor: PsiElement?): KtNamedDeclaration defined in org.jetbrains.kotlin.psi.KtClassOrObject[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : KtDeclaration> -> KtNamedDeclaration

'targetMember' @ [75:49] ==> value-parameter targetMember: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.pullUp.addMemberToTarget[ValueParameterDescriptorImpl]

'anchor' @ [75:63] ==> val anchor: KtNamedDeclaration? defined in org.jetbrains.kotlin.idea.refactoring.pullUp.addMemberToTarget[LocalVariableDescriptor]

'hasModifier' @ [80:12] ==> public open fun hasModifier(@NotNull p0: KtModifierKeywordToken): Boolean defined in org.jetbrains.kotlin.psi.KtParameter[JavaMethodDescriptor]

'ABSTRACT_KEYWORD' @ [80:33] ==> public final val ABSTRACT_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'targetClass' @ [80:54] ==> value-parameter targetClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.refactoring.pullUp.needToBeAbstract[ValueParameterDescriptorImpl]

'targetClass' @ [80:80] ==> value-parameter targetClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.refactoring.pullUp.needToBeAbstract[ValueParameterDescriptorImpl]

'isInterface' @ [80:92] ==> public final fun isInterface(): Boolean defined in org.jetbrains.kotlin.psi.KtClass[DeserializedSimpleFunctionDescriptor]

'KtPsiFactory' @ [83:52] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'this' @ [83:65] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.pullUp.toProperty[ReceiverParameterDescriptorImpl]

'createProperty' @ [83:71] ==> public final fun createProperty(text: String): KtProperty defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'text' @ [83:86] ==> public final val KtParameter.text: (String..String?)[MyPropertyDescriptor]

'if (memberCopy is KtParameter && memberCopy.needToBeAbstract(targetClass)) memberCopy.toProperty() else memberCopy' @ [90:23] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtCallableDeclaration, elseBranch: KtCallableDeclaration): KtCallableDeclaration[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtCallableDeclaration

'memberCopy' @ [90:27] ==> value-parameter memberCopy: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.refactoring.pullUp.doAddCallableMember[ValueParameterDescriptorImpl]

'memberCopy' @ [90:56] ==> value-parameter memberCopy: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.refactoring.pullUp.doAddCallableMember[ValueParameterDescriptorImpl]

'needToBeAbstract' @ [90:67] ==> private fun KtParameter.needToBeAbstract(targetClass: KtClassOrObject): Boolean defined in org.jetbrains.kotlin.idea.refactoring.pullUp in file pullUpUtils.kt[SimpleFunctionDescriptorImpl]

'targetClass' @ [90:84] ==> value-parameter targetClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.refactoring.pullUp.doAddCallableMember[ValueParameterDescriptorImpl]

'memberCopy' @ [90:98] ==> value-parameter memberCopy: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.refactoring.pullUp.doAddCallableMember[ValueParameterDescriptorImpl]

'toProperty' @ [90:109] ==> private fun KtParameter.toProperty(): KtProperty defined in org.jetbrains.kotlin.idea.refactoring.pullUp in file pullUpUtils.kt[SimpleFunctionDescriptorImpl]

'memberCopy' @ [90:127] ==> value-parameter memberCopy: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.refactoring.pullUp.doAddCallableMember[ValueParameterDescriptorImpl]

'clashingSuper' @ [92:9] ==> value-parameter clashingSuper: KtCallableDeclaration? defined in org.jetbrains.kotlin.idea.refactoring.pullUp.doAddCallableMember[ValueParameterDescriptorImpl]

'clashingSuper' @ [92:34] ==> value-parameter clashingSuper: KtCallableDeclaration? defined in org.jetbrains.kotlin.idea.refactoring.pullUp.doAddCallableMember[ValueParameterDescriptorImpl]

'hasModifier' @ [92:48] ==> public abstract fun hasModifier(@NotNull p0: KtModifierKeywordToken): Boolean defined in org.jetbrains.kotlin.psi.KtCallableDeclaration[JavaMethodDescriptor]

'ABSTRACT_KEYWORD' @ [92:69] ==> public final val ABSTRACT_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'clashingSuper' @ [93:16] ==> value-parameter clashingSuper: KtCallableDeclaration? defined in org.jetbrains.kotlin.idea.refactoring.pullUp.doAddCallableMember[ValueParameterDescriptorImpl]

'replaced' @ [93:30] ==> public inline fun <reified T : PsiElement> PsiElement.replaced(newElement: KtCallableDeclaration): KtCallableDeclaration defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtCallableDeclaration

'if (memberToAdd is KtParameter && clashingSuper is KtProperty) memberToAdd.toProperty() else memberToAdd' @ [93:39] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtCallableDeclaration, elseBranch: KtCallableDeclaration): KtCallableDeclaration[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtCallableDeclaration

'memberToAdd' @ [93:43] ==> val memberToAdd: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.refactoring.pullUp.doAddCallableMember[LocalVariableDescriptor]

'clashingSuper' @ [93:73] ==> value-parameter clashingSuper: KtCallableDeclaration? defined in org.jetbrains.kotlin.idea.refactoring.pullUp.doAddCallableMember[ValueParameterDescriptorImpl]

'memberToAdd' @ [93:102] ==> val memberToAdd: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.refactoring.pullUp.doAddCallableMember[LocalVariableDescriptor]

'toProperty' @ [93:114] ==> private fun KtParameter.toProperty(): KtProperty defined in org.jetbrains.kotlin.idea.refactoring.pullUp in file pullUpUtils.kt[SimpleFunctionDescriptorImpl]

'memberToAdd' @ [93:132] ==> val memberToAdd: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.refactoring.pullUp.doAddCallableMember[LocalVariableDescriptor]

'addMemberToTarget' @ [96:12] ==> public fun addMemberToTarget(targetMember: KtNamedDeclaration, targetClass: KtClassOrObject): KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.pullUp in file pullUpUtils.kt[SimpleFunctionDescriptorImpl]

'memberToAdd' @ [96:30] ==> val memberToAdd: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.refactoring.pullUp.doAddCallableMember[LocalVariableDescriptor]

'targetClass' @ [96:43] ==> value-parameter targetClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.refactoring.pullUp.doAddCallableMember[ValueParameterDescriptorImpl]

'addAnnotationEntry' @ [101:18] ==> @NotNull public abstract fun addAnnotationEntry(@NotNull p0: KtAnnotationEntry): KtAnnotationEntry defined in org.jetbrains.kotlin.psi.KtNamedDeclaration[JavaMethodDescriptor]

'annotationEntry' @ [101:37] ==> value-parameter annotationEntry: KtAnnotationEntry defined in org.jetbrains.kotlin.idea.refactoring.pullUp.addAnnotationWithSpace[ValueParameterDescriptorImpl]

'addAfter' @ [102:5] ==> public abstract fun addAfter(@NotNull p0: PsiElement, @Nullable p1: PsiElement?): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtNamedDeclaration[JavaMethodDescriptor]

'KtPsiFactory' @ [102:14] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'this' @ [102:27] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.pullUp.addAnnotationWithSpace[ReceiverParameterDescriptorImpl]

'createWhiteSpace' @ [102:33] ==> public final fun createWhiteSpace(): PsiElement defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'modifierList' @ [102:53] ==> public final val KtNamedDeclaration.modifierList: KtModifierList?[MyPropertyDescriptor]

'result' @ [103:12] ==> val result: KtAnnotationEntry defined in org.jetbrains.kotlin.idea.refactoring.pullUp.addAnnotationWithSpace[LocalVariableDescriptor]

'!' @ [107:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isInterface' @ [107:10] ==> public final fun isInterface(): Boolean defined in org.jetbrains.kotlin.psi.KtClass[DeserializedSimpleFunctionDescriptor]

'addModifier' @ [108:9] ==> public open fun addModifier(@NotNull p0: KtModifierKeywordToken): Unit defined in org.jetbrains.kotlin.psi.KtClass[JavaMethodDescriptor]

'ABSTRACT_KEYWORD' @ [108:30] ==> public final val ABSTRACT_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'superTypeListEntries' @ [116:12] ==> public final val KtClassOrObject.superTypeListEntries: List<KtSuperTypeListEntry>[MyPropertyDescriptor]

'firstOrNull' @ [116:33] ==> public inline fun <T> Iterable<KtSuperTypeListEntry>.firstOrNull(predicate: (KtSuperTypeListEntry) -> Boolean): KtSuperTypeListEntry? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtSuperTypeListEntry

'context' @ [117:30] ==> value-parameter context: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.pullUp.getSuperTypeEntryByDescriptor[ValueParameterDescriptorImpl]

'TYPE' @ [117:53] ==> public final val TYPE: (WritableSlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>..WritableSlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'it' @ [117:59] ==> value-parameter it: KtSuperTypeListEntry defined in org.jetbrains.kotlin.idea.refactoring.pullUp.getSuperTypeEntryByDescriptor.<anonymous>[ValueParameterDescriptorImpl]

'typeReference' @ [117:62] ==> public final val KtSuperTypeListEntry.typeReference: KtTypeReference?[MyPropertyDescriptor]

'referencedType' @ [118:9] ==> val referencedType: KotlinType? defined in org.jetbrains.kotlin.idea.refactoring.pullUp.getSuperTypeEntryByDescriptor.<anonymous>[LocalVariableDescriptor]

'constructor' @ [118:25] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [118:38] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'descriptor' @ [118:63] ==> value-parameter descriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.refactoring.pullUp.getSuperTypeEntryByDescriptor[ValueParameterDescriptorImpl]

'!' @ [126:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'targetClass' @ [126:10] ==> value-parameter targetClass: KtClass defined in org.jetbrains.kotlin.idea.refactoring.pullUp.makeAbstract[ValueParameterDescriptorImpl]

'isInterface' @ [126:22] ==> public final fun isInterface(): Boolean defined in org.jetbrains.kotlin.psi.KtClass[DeserializedSimpleFunctionDescriptor]

'member' @ [127:9] ==> value-parameter member: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.refactoring.pullUp.makeAbstract[ValueParameterDescriptorImpl]

'addModifier' @ [127:16] ==> public abstract fun addModifier(@NotNull p0: KtModifierKeywordToken): Unit defined in org.jetbrains.kotlin.psi.KtCallableDeclaration[JavaMethodDescriptor]

'ABSTRACT_KEYWORD' @ [127:37] ==> public final val ABSTRACT_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'originalMemberDescriptor' @ [130:20] ==> value-parameter originalMemberDescriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.idea.refactoring.pullUp.makeAbstract[ValueParameterDescriptorImpl]

'builtIns' @ [130:45] ==> public val DeclarationDescriptor.builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'member' @ [131:9] ==> value-parameter member: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.refactoring.pullUp.makeAbstract[ValueParameterDescriptorImpl]

'typeReference' @ [131:16] ==> public final var KtCallableDeclaration.typeReference: KtTypeReference?[MyPropertyDescriptor]

'originalMemberDescriptor' @ [132:20] ==> value-parameter originalMemberDescriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.idea.refactoring.pullUp.makeAbstract[ValueParameterDescriptorImpl]

'returnType' @ [132:45] ==> public final val CallableMemberDescriptor.returnType: KotlinType?[MyPropertyDescriptor]

'if (type == null || type.isError) {
            type = builtIns.nullableAnyType
        }
        else {
            type = substitutor.substitute(type.anonymousObjectSuperTypeOrNull() ?: type, Variance.INVARIANT)
                   ?: builtIns.nullableAnyType
        }' @ [133:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'type' @ [133:13] ==> var type: KotlinType? defined in org.jetbrains.kotlin.idea.refactoring.pullUp.makeAbstract[LocalVariableDescriptor]

'type' @ [133:29] ==> var type: KotlinType? defined in org.jetbrains.kotlin.idea.refactoring.pullUp.makeAbstract[LocalVariableDescriptor]

'isError' @ [133:34] ==> public val KotlinType.isError: Boolean defined in org.jetbrains.kotlin.types[DeserializedPropertyDescriptor]

'type' @ [134:13] ==> var type: KotlinType? defined in org.jetbrains.kotlin.idea.refactoring.pullUp.makeAbstract[LocalVariableDescriptor]

'builtIns' @ [134:20] ==> val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.idea.refactoring.pullUp.makeAbstract[LocalVariableDescriptor]

'nullableAnyType' @ [134:29] ==> public final val KotlinBuiltIns.nullableAnyType: SimpleType[MyPropertyDescriptor]

'type' @ [137:13] ==> var type: KotlinType? defined in org.jetbrains.kotlin.idea.refactoring.pullUp.makeAbstract[LocalVariableDescriptor]

'substitutor' @ [137:20] ==> value-parameter substitutor: TypeSubstitutor defined in org.jetbrains.kotlin.idea.refactoring.pullUp.makeAbstract[ValueParameterDescriptorImpl]

'substitute' @ [137:32] ==> @Nullable public open fun substitute(@NotNull p0: KotlinType, @NotNull p1: Variance): KotlinType? defined in org.jetbrains.kotlin.types.TypeSubstitutor[JavaMethodDescriptor]

'type' @ [137:43] ==> var type: KotlinType? defined in org.jetbrains.kotlin.idea.refactoring.pullUp.makeAbstract[LocalVariableDescriptor]

'anonymousObjectSuperTypeOrNull' @ [137:48] ==> public fun KotlinType.anonymousObjectSuperTypeOrNull(): KotlinType? defined in org.jetbrains.kotlin.idea.util[DeserializedSimpleFunctionDescriptor]

'type' @ [137:84] ==> var type: KotlinType? defined in org.jetbrains.kotlin.idea.refactoring.pullUp.makeAbstract[LocalVariableDescriptor]

'INVARIANT' @ [137:99] ==> enum entry INVARIANT defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'builtIns' @ [138:23] ==> val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.idea.refactoring.pullUp.makeAbstract[LocalVariableDescriptor]

'nullableAnyType' @ [138:32] ==> public final val KotlinBuiltIns.nullableAnyType: SimpleType[MyPropertyDescriptor]

'member' @ [141:13] ==> value-parameter member: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.refactoring.pullUp.makeAbstract[ValueParameterDescriptorImpl]

'!' @ [141:37] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'type' @ [141:38] ==> var type: KotlinType? defined in org.jetbrains.kotlin.idea.refactoring.pullUp.makeAbstract[LocalVariableDescriptor]

'isUnit' @ [141:43] ==> public fun KotlinType.isUnit(): Boolean defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'member' @ [142:13] ==> value-parameter member: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.refactoring.pullUp.makeAbstract[ValueParameterDescriptorImpl]

'setType' @ [142:20] ==> public fun KtCallableDeclaration.setType(type: KotlinType, shortenReferences: Boolean = ...): Unit defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'type' @ [142:28] ==> var type: KotlinType? defined in org.jetbrains.kotlin.idea.refactoring.pullUp.makeAbstract[LocalVariableDescriptor]

'when (member) {
        is KtProperty -> {
            member.equalsToken ?: member.delegate ?: member.accessors.firstOrNull()
        }

        is KtNamedFunction -> {
            member.equalsToken ?: member.bodyExpression
        }

        else -> null
    }' @ [146:22] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: PsiElement?, entry1: PsiElement?, entry2: PsiElement?): PsiElement?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> PsiElement?

'member' @ [146:28] ==> value-parameter member: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.refactoring.pullUp.makeAbstract[ValueParameterDescriptorImpl]

'member' @ [148:13] ==> value-parameter member: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.refactoring.pullUp.makeAbstract[ValueParameterDescriptorImpl]

'equalsToken' @ [148:20] ==> public final val KtProperty.equalsToken: PsiElement?[MyPropertyDescriptor]

'member' @ [148:35] ==> value-parameter member: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.refactoring.pullUp.makeAbstract[ValueParameterDescriptorImpl]

'delegate' @ [148:42] ==> public final val KtProperty.delegate: KtPropertyDelegate?[MyPropertyDescriptor]

'member' @ [148:54] ==> value-parameter member: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.refactoring.pullUp.makeAbstract[ValueParameterDescriptorImpl]

'accessors' @ [148:61] ==> public final val KtProperty.accessors: (MutableList<(KtPropertyAccessor..KtPropertyAccessor?)>..List<(KtPropertyAccessor..KtPropertyAccessor?)>)[MyPropertyDescriptor]

'firstOrNull' @ [148:71] ==> public fun <T> List<(KtPropertyAccessor..KtPropertyAccessor?)>.firstOrNull(): KtPropertyAccessor? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtPropertyAccessor..org.jetbrains.kotlin.psi.KtPropertyAccessor?)

'member' @ [152:13] ==> value-parameter member: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.refactoring.pullUp.makeAbstract[ValueParameterDescriptorImpl]

'equalsToken' @ [152:20] ==> public final val KtNamedFunction.equalsToken: PsiElement?[MyPropertyDescriptor]

'member' @ [152:35] ==> value-parameter member: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.refactoring.pullUp.makeAbstract[ValueParameterDescriptorImpl]

'bodyExpression' @ [152:42] ==> public final val KtNamedFunction.bodyExpression: KtExpression?[MyPropertyDescriptor]

'deleteFrom' @ [158:9] ==> val deleteFrom: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.pullUp.makeAbstract[LocalVariableDescriptor]

'member' @ [159:9] ==> value-parameter member: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.refactoring.pullUp.makeAbstract[ValueParameterDescriptorImpl]

'deleteChildRange' @ [159:16] ==> public abstract fun deleteChildRange(p0: (PsiElement..PsiElement?), p1: (PsiElement..PsiElement?)): Unit defined in org.jetbrains.kotlin.psi.KtCallableDeclaration[JavaMethodDescriptor]

'deleteFrom' @ [159:33] ==> val deleteFrom: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.pullUp.makeAbstract[LocalVariableDescriptor]

'member' @ [159:45] ==> value-parameter member: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.refactoring.pullUp.makeAbstract[ValueParameterDescriptorImpl]

'lastChild' @ [159:52] ==> public final val KtCallableDeclaration.lastChild: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'context' @ [170:26] ==> value-parameter context: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.pullUp.addSuperTypeEntry[ValueParameterDescriptorImpl]

'TYPE' @ [170:49] ==> public final val TYPE: (WritableSlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>..WritableSlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'delegator' @ [170:55] ==> value-parameter delegator: KtSuperTypeListEntry defined in org.jetbrains.kotlin.idea.refactoring.pullUp.addSuperTypeEntry[ValueParameterDescriptorImpl]

'typeReference' @ [170:65] ==> public final val KtSuperTypeListEntry.typeReference: KtTypeReference?[MyPropertyDescriptor]

'referencedType' @ [171:27] ==> val referencedType: KotlinType defined in org.jetbrains.kotlin.idea.refactoring.pullUp.addSuperTypeEntry[LocalVariableDescriptor]

'constructor' @ [171:42] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [171:54] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'targetClassDescriptor' @ [173:9] ==> value-parameter targetClassDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.refactoring.pullUp.addSuperTypeEntry[ValueParameterDescriptorImpl]

'referencedClass' @ [173:34] ==> val referencedClass: ClassDescriptor defined in org.jetbrains.kotlin.idea.refactoring.pullUp.addSuperTypeEntry[LocalVariableDescriptor]

'isDirectSubclass' @ [173:69] ==> public open fun isDirectSubclass(@NotNull p0: ClassDescriptor, @NotNull p1: ClassDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'targetClassDescriptor' @ [173:86] ==> value-parameter targetClassDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.refactoring.pullUp.addSuperTypeEntry[ValueParameterDescriptorImpl]

'referencedClass' @ [173:109] ==> val referencedClass: ClassDescriptor defined in org.jetbrains.kotlin.idea.refactoring.pullUp.addSuperTypeEntry[LocalVariableDescriptor]

'substitutor' @ [175:29] ==> value-parameter substitutor: TypeSubstitutor defined in org.jetbrains.kotlin.idea.refactoring.pullUp.addSuperTypeEntry[ValueParameterDescriptorImpl]

'substitute' @ [175:41] ==> @Nullable public open fun substitute(@NotNull p0: KotlinType, @NotNull p1: Variance): KotlinType? defined in org.jetbrains.kotlin.types.TypeSubstitutor[JavaMethodDescriptor]

'referencedType' @ [175:52] ==> val referencedType: KotlinType defined in org.jetbrains.kotlin.idea.refactoring.pullUp.addSuperTypeEntry[LocalVariableDescriptor]

'INVARIANT' @ [175:77] ==> enum entry INVARIANT defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'!' @ [176:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'typeInTargetClass' @ [176:11] ==> val typeInTargetClass: KotlinType? defined in org.jetbrains.kotlin.idea.refactoring.pullUp.addSuperTypeEntry[LocalVariableDescriptor]

'!' @ [176:40] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'typeInTargetClass' @ [176:41] ==> val typeInTargetClass: KotlinType? defined in org.jetbrains.kotlin.idea.refactoring.pullUp.addSuperTypeEntry[LocalVariableDescriptor]

'isError' @ [176:59] ==> public val KotlinType.isError: Boolean defined in org.jetbrains.kotlin.types[DeserializedPropertyDescriptor]

'IdeDescriptorRenderers' @ [178:24] ==> public object IdeDescriptorRenderers defined in org.jetbrains.kotlin.idea.util[FakeCallableDescriptorForObject]

'SOURCE_CODE' @ [178:47] ==> @field:JvmField public final val SOURCE_CODE: DescriptorRenderer defined in org.jetbrains.kotlin.idea.util.IdeDescriptorRenderers[DeserializedPropertyDescriptor]

'renderType' @ [178:59] ==> public abstract fun renderType(type: KotlinType): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'typeInTargetClass' @ [178:70] ==> val typeInTargetClass: KotlinType? defined in org.jetbrains.kotlin.idea.refactoring.pullUp.addSuperTypeEntry[LocalVariableDescriptor]

'KtPsiFactory' @ [179:24] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'targetClass' @ [179:37] ==> value-parameter targetClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.refactoring.pullUp.addSuperTypeEntry[ValueParameterDescriptorImpl]

'createSuperTypeEntry' @ [179:50] ==> public final fun createSuperTypeEntry(text: String): KtSuperTypeEntry defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'renderedType' @ [179:71] ==> val renderedType: String defined in org.jetbrains.kotlin.idea.refactoring.pullUp.addSuperTypeEntry[LocalVariableDescriptor]

'targetClass' @ [180:5] ==> value-parameter targetClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.refactoring.pullUp.addSuperTypeEntry[ValueParameterDescriptorImpl]

'addSuperTypeListEntry' @ [180:17] ==> public final fun addSuperTypeListEntry(superTypeListEntry: KtSuperTypeListEntry): KtSuperTypeListEntry defined in org.jetbrains.kotlin.psi.KtClassOrObject[DeserializedSimpleFunctionDescriptor]

'newSpecifier' @ [180:39] ==> val newSpecifier: KtSuperTypeEntry defined in org.jetbrains.kotlin.idea.refactoring.pullUp.addSuperTypeEntry[LocalVariableDescriptor]

'addToShorteningWaitSet' @ [180:53] ==> public fun KtElement.addToShorteningWaitSet(options: ShortenReferences.Options = ...): Unit defined in org.jetbrains.kotlin.idea.codeInsight.shorten[DeserializedSimpleFunctionDescriptor]

'lightElementForMemberInfo' @ [185:32] ==> public fun lightElementForMemberInfo(declaration: KtNamedDeclaration?): PsiMember? defined in org.jetbrains.kotlin.idea.refactoring.memberInfo in file KotlinMemberInfo.kt[SimpleFunctionDescriptorImpl]

'member' @ [185:58] ==> value-parameter member: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.pullUp.getInterfaceContainmentVerifier.<anonymous>[ValueParameterDescriptorImpl]

'invoke' @ [186:9] ==> public abstract operator fun invoke(): List<KotlinMemberInfo> defined in kotlin.Function0[FunctionInvokeDescriptor]

'any' @ [186:26] ==> public inline fun <T> Iterable<KotlinMemberInfo>.any(predicate: (KotlinMemberInfo) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinMemberInfo

'!' @ [187:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [187:18] ==> value-parameter it: KotlinMemberInfo defined in org.jetbrains.kotlin.idea.refactoring.pullUp.getInterfaceContainmentVerifier.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'isSuperClass' @ [187:21] ==> public final val isSuperClass: Boolean defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinMemberInfo[PropertyDescriptorImpl]

'it' @ [187:37] ==> value-parameter it: KotlinMemberInfo defined in org.jetbrains.kotlin.idea.refactoring.pullUp.getInterfaceContainmentVerifier.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'overrides' @ [187:40] ==> public final val KotlinMemberInfo.overrides: (Boolean..Boolean?)[MyPropertyDescriptor]

'it' @ [189:38] ==> value-parameter it: KotlinMemberInfo defined in org.jetbrains.kotlin.idea.refactoring.pullUp.getInterfaceContainmentVerifier.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'member' @ [189:41] ==> public final val KotlinMemberInfo.member: (KtNamedDeclaration..KtNamedDeclaration?)[MyPropertyDescriptor]

'toLightClass' @ [189:62] ==> public fun KtClassOrObject.toLightClass(): KtLightClass? defined in org.jetbrains.kotlin.asJava[DeserializedSimpleFunctionDescriptor]

'psiSuperInterface' @ [190:13] ==> val psiSuperInterface: KtLightClass? defined in org.jetbrains.kotlin.idea.refactoring.pullUp.getInterfaceContainmentVerifier.<anonymous>.<anonymous>[LocalVariableDescriptor]

'findMethodBySignature' @ [190:32] ==> @Nullable public abstract fun findMethodBySignature(p0: (PsiMethod..PsiMethod?), p1: Boolean): PsiMethod? defined in org.jetbrains.kotlin.asJava.classes.KtLightClass[JavaMethodDescriptor]

'psiMethodToCheck' @ [190:54] ==> val psiMethodToCheck: PsiMethod defined in org.jetbrains.kotlin.idea.refactoring.pullUp.getInterfaceContainmentVerifier.<anonymous>[LocalVariableDescriptor]

