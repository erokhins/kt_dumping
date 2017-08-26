'KotlinExtractSuperDialogBase' @ [43:5] ==> public constructor KotlinExtractSuperDialogBase(originalClass: KtClassOrObject, targetParent: PsiElement, conflictChecker: (KotlinExtractSuperDialogBase) -> Boolean, isExtractInterface: Boolean, refactoringName: String, refactoring: (ExtractSuperInfo) -> Unit) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ui.KotlinExtractSuperDialogBase[ClassConstructorDescriptorImpl]

'originalClass' @ [43:34] ==> value-parameter originalClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ui.KotlinExtractInterfaceDialog.<init>[ValueParameterDescriptorImpl]

'targetParent' @ [43:49] ==> value-parameter targetParent: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ui.KotlinExtractInterfaceDialog.<init>[ValueParameterDescriptorImpl]

'conflictChecker' @ [43:63] ==> value-parameter conflictChecker: (KotlinExtractSuperDialogBase) -> Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ui.KotlinExtractInterfaceDialog.<init>[ValueParameterDescriptorImpl]

'REFACTORING_NAME' @ [43:116] ==> public final val REFACTORING_NAME: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.KotlinExtractInterfaceHandler[PropertyDescriptorImpl]

'refactoring' @ [43:134] ==> value-parameter refactoring: (ExtractSuperInfo) -> Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ui.KotlinExtractInterfaceDialog.<init>[ValueParameterDescriptorImpl]

'init' @ [49:9] ==> protected open fun init(): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ui.KotlinExtractInterfaceDialog[SimpleFunctionDescriptorImpl]

'extractClassMembers' @ [53:38] ==> public fun extractClassMembers(aClass: KtClassOrObject, collectSuperTypeEntries: Boolean = ..., filter: ((KtNamedDeclaration) -> Boolean)? = ...): List<KotlinMemberInfo> defined in org.jetbrains.kotlin.idea.refactoring.memberInfo in file KotlinMemberInfoStorage.kt[SimpleFunctionDescriptorImpl]

'originalClass' @ [53:58] ==> protected final val originalClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ui.KotlinExtractInterfaceDialog[PropertyDescriptorImpl]

'filterNot' @ [53:73] ==> public inline fun <T> Iterable<KotlinMemberInfo>.filterNot(predicate: (KotlinMemberInfo) -> Boolean): List<KotlinMemberInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinMemberInfo

'it' @ [54:26] ==> value-parameter it: KotlinMemberInfo defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ui.KotlinExtractInterfaceDialog.createMemberInfoModel.<anonymous>[ValueParameterDescriptorImpl]

'member' @ [54:29] ==> public final val KotlinMemberInfo.member: (KtNamedDeclaration..KtNamedDeclaration?)[MyPropertyDescriptor]

'member' @ [55:13] ==> val member: (KtNamedDeclaration..KtNamedDeclaration?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ui.KotlinExtractInterfaceDialog.createMemberInfoModel.<anonymous>[LocalVariableDescriptor]

'member' @ [55:34] ==> val member: (KtNamedDeclaration..KtNamedDeclaration?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ui.KotlinExtractInterfaceDialog.createMemberInfoModel.<anonymous>[LocalVariableDescriptor]

'hasModifier' @ [55:41] ==> public abstract fun hasModifier(@NotNull p0: KtModifierKeywordToken): Boolean defined in org.jetbrains.kotlin.psi.KtNamedDeclaration[JavaMethodDescriptor]

'INNER_KEYWORD' @ [55:62] ==> public final val INNER_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'extractableMemberInfos' @ [57:9] ==> val extractableMemberInfos: List<KotlinMemberInfo> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ui.KotlinExtractInterfaceDialog.createMemberInfoModel[LocalVariableDescriptor]

'forEach' @ [57:32] ==> @HidesMembers public inline fun <T> Iterable<KotlinMemberInfo>.forEach(action: (KotlinMemberInfo) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinMemberInfo

'it' @ [57:42] ==> value-parameter it: KotlinMemberInfo defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ui.KotlinExtractInterfaceDialog.createMemberInfoModel.<anonymous>[ValueParameterDescriptorImpl]

'isToAbstract' @ [57:45] ==> public final var KotlinMemberInfo.isToAbstract: Boolean[MyPropertyDescriptor]

'MemberInfoModelBase' @ [58:25] ==> public constructor MemberInfoModelBase(originalClass: KtClassOrObject, memberInfos: List<KotlinMemberInfo>, interfaceContainmentVerifier: (KtNamedDeclaration) -> Boolean) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ui.KotlinExtractSuperDialogBase.MemberInfoModelBase[ClassConstructorDescriptorImpl]

'originalClass' @ [59:17] ==> protected final val originalClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ui.KotlinExtractInterfaceDialog[PropertyDescriptorImpl]

'extractableMemberInfos' @ [60:17] ==> val extractableMemberInfos: List<KotlinMemberInfo> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ui.KotlinExtractInterfaceDialog.createMemberInfoModel[LocalVariableDescriptor]

'getInterfaceContainmentVerifier' @ [61:17] ==> public fun getInterfaceContainmentVerifier(getMemberInfos: () -> List<KotlinMemberInfo>): (KtNamedDeclaration) -> Boolean defined in org.jetbrains.kotlin.idea.refactoring.pullUp in file pullUpUtils.kt[SimpleFunctionDescriptorImpl]

'selectedMembers' @ [61:51] ==> public final val selectedMembers: List<KotlinMemberInfo> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ui.KotlinExtractInterfaceDialog[PropertyDescriptorImpl]

'!' @ [64:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'super' @ [64:22] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ui.KotlinExtractInterfaceDialog.createMemberInfoModel.<no name provided>[LazyClassReceiverParameterDescriptor]

'isMemberEnabled' @ [64:28] ==> public open fun isMemberEnabled(member: KotlinMemberInfo): Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ui.KotlinExtractSuperDialogBase.MemberInfoModelBase[SimpleFunctionDescriptorImpl]

'memberInfo' @ [64:44] ==> value-parameter memberInfo: KotlinMemberInfo defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ui.KotlinExtractInterfaceDialog.createMemberInfoModel.<no name provided>.isMemberEnabled[ValueParameterDescriptorImpl]

'memberInfo' @ [66:30] ==> value-parameter memberInfo: KotlinMemberInfo defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ui.KotlinExtractInterfaceDialog.createMemberInfoModel.<no name provided>.isMemberEnabled[ValueParameterDescriptorImpl]

'member' @ [66:41] ==> public final val KotlinMemberInfo.member: (KtNamedDeclaration..KtNamedDeclaration?)[MyPropertyDescriptor]

'!' @ [67:24] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'member' @ [67:26] ==> val member: (KtNamedDeclaration..KtNamedDeclaration?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ui.KotlinExtractInterfaceDialog.createMemberInfoModel.<no name provided>.isMemberEnabled[LocalVariableDescriptor]

'hasModifier' @ [67:33] ==> public abstract fun hasModifier(@NotNull p0: KtModifierKeywordToken): Boolean defined in org.jetbrains.kotlin.psi.KtNamedDeclaration[JavaMethodDescriptor]

'INLINE_KEYWORD' @ [67:54] ==> public final val INLINE_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'member' @ [68:26] ==> val member: (KtNamedDeclaration..KtNamedDeclaration?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ui.KotlinExtractInterfaceDialog.createMemberInfoModel.<no name provided>.isMemberEnabled[LocalVariableDescriptor]

'hasModifier' @ [68:33] ==> public abstract fun hasModifier(@NotNull p0: KtModifierKeywordToken): Boolean defined in org.jetbrains.kotlin.psi.KtNamedDeclaration[JavaMethodDescriptor]

'EXTERNAL_KEYWORD' @ [68:54] ==> public final val EXTERNAL_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'member' @ [69:26] ==> val member: (KtNamedDeclaration..KtNamedDeclaration?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ui.KotlinExtractInterfaceDialog.createMemberInfoModel.<no name provided>.isMemberEnabled[LocalVariableDescriptor]

'hasModifier' @ [69:33] ==> public abstract fun hasModifier(@NotNull p0: KtModifierKeywordToken): Boolean defined in org.jetbrains.kotlin.psi.KtNamedDeclaration[JavaMethodDescriptor]

'LATEINIT_KEYWORD' @ [69:54] ==> public final val LATEINIT_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'member' @ [70:26] ==> val member: (KtNamedDeclaration..KtNamedDeclaration?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ui.KotlinExtractInterfaceDialog.createMemberInfoModel.<no name provided>.isMemberEnabled[LocalVariableDescriptor]

'hasModifier' @ [70:33] ==> public abstract fun hasModifier(@NotNull p0: KtModifierKeywordToken): Boolean defined in org.jetbrains.kotlin.psi.KtNamedDeclaration[JavaMethodDescriptor]

'INTERNAL_KEYWORD' @ [70:54] ==> public final val INTERNAL_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'member' @ [71:26] ==> val member: (KtNamedDeclaration..KtNamedDeclaration?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ui.KotlinExtractInterfaceDialog.createMemberInfoModel.<no name provided>.isMemberEnabled[LocalVariableDescriptor]

'hasModifier' @ [71:33] ==> public abstract fun hasModifier(@NotNull p0: KtModifierKeywordToken): Boolean defined in org.jetbrains.kotlin.psi.KtNamedDeclaration[JavaMethodDescriptor]

'PROTECTED_KEYWORD' @ [71:54] ==> public final val PROTECTED_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'!' @ [75:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'super' @ [75:22] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ui.KotlinExtractInterfaceDialog.createMemberInfoModel.<no name provided>[LazyClassReceiverParameterDescriptor]

'isAbstractEnabled' @ [75:28] ==> public open fun isAbstractEnabled(memberInfo: KotlinMemberInfo): Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ui.KotlinExtractSuperDialogBase.MemberInfoModelBase[SimpleFunctionDescriptorImpl]

'memberInfo' @ [75:46] ==> value-parameter memberInfo: KotlinMemberInfo defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ui.KotlinExtractInterfaceDialog.createMemberInfoModel.<no name provided>.isAbstractEnabled[ValueParameterDescriptorImpl]

'memberInfo' @ [76:30] ==> value-parameter memberInfo: KotlinMemberInfo defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ui.KotlinExtractInterfaceDialog.createMemberInfoModel.<no name provided>.isAbstractEnabled[ValueParameterDescriptorImpl]

'member' @ [76:41] ==> public final val KotlinMemberInfo.member: (KtNamedDeclaration..KtNamedDeclaration?)[MyPropertyDescriptor]

'member' @ [77:21] ==> val member: (KtNamedDeclaration..KtNamedDeclaration?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ui.KotlinExtractInterfaceDialog.createMemberInfoModel.<no name provided>.isAbstractEnabled[LocalVariableDescriptor]

'isAbstractInInterface' @ [77:28] ==> public fun KtNamedDeclaration.isAbstractInInterface(originalClass: KtClassOrObject): Boolean defined in org.jetbrains.kotlin.idea.refactoring.pullUp in file pullUpUtils.kt[SimpleFunctionDescriptorImpl]

'originalClass' @ [77:50] ==> protected final val originalClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ui.KotlinExtractInterfaceDialog[PropertyDescriptorImpl]

'member' @ [78:21] ==> val member: (KtNamedDeclaration..KtNamedDeclaration?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ui.KotlinExtractInterfaceDialog.createMemberInfoModel.<no name provided>.isAbstractEnabled[LocalVariableDescriptor]

'isConstructorDeclaredProperty' @ [78:28] ==> public fun KtNamedDeclaration.isConstructorDeclaredProperty(): Boolean defined in org.jetbrains.kotlin.idea.refactoring in file kotlinRefactoringUtil.kt[SimpleFunctionDescriptorImpl]

'member' @ [79:24] ==> val member: (KtNamedDeclaration..KtNamedDeclaration?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ui.KotlinExtractInterfaceDialog.createMemberInfoModel.<no name provided>.isAbstractEnabled[LocalVariableDescriptor]

'member' @ [79:54] ==> val member: (KtNamedDeclaration..KtNamedDeclaration?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ui.KotlinExtractInterfaceDialog.createMemberInfoModel.<no name provided>.isAbstractEnabled[LocalVariableDescriptor]

'!' @ [79:78] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'member' @ [79:79] ==> val member: (KtNamedDeclaration..KtNamedDeclaration?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ui.KotlinExtractInterfaceDialog.createMemberInfoModel.<no name provided>.isAbstractEnabled[LocalVariableDescriptor]

'mustBeAbstractInInterface' @ [79:86] ==> public fun KtProperty.mustBeAbstractInInterface(): Boolean defined in org.jetbrains.kotlin.idea.refactoring.pullUp in file pullUpUtils.kt[SimpleFunctionDescriptorImpl]

'member' @ [79:118] ==> val member: (KtNamedDeclaration..KtNamedDeclaration?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ui.KotlinExtractInterfaceDialog.createMemberInfoModel.<no name provided>.isAbstractEnabled[LocalVariableDescriptor]

'memberInfo' @ [83:30] ==> value-parameter memberInfo: KotlinMemberInfo defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ui.KotlinExtractInterfaceDialog.createMemberInfoModel.<no name provided>.isAbstractWhenDisabled[ValueParameterDescriptorImpl]

'member' @ [83:41] ==> public final val KotlinMemberInfo.member: (KtNamedDeclaration..KtNamedDeclaration?)[MyPropertyDescriptor]

'member' @ [84:24] ==> val member: (KtNamedDeclaration..KtNamedDeclaration?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ui.KotlinExtractInterfaceDialog.createMemberInfoModel.<no name provided>.isAbstractWhenDisabled[LocalVariableDescriptor]

'member' @ [84:48] ==> val member: (KtNamedDeclaration..KtNamedDeclaration?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ui.KotlinExtractInterfaceDialog.createMemberInfoModel.<no name provided>.isAbstractWhenDisabled[LocalVariableDescriptor]

'isAbstractInInterface' @ [84:55] ==> public fun KtNamedDeclaration.isAbstractInInterface(originalClass: KtClassOrObject): Boolean defined in org.jetbrains.kotlin.idea.refactoring.pullUp in file pullUpUtils.kt[SimpleFunctionDescriptorImpl]

'originalClass' @ [84:77] ==> protected final val originalClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ui.KotlinExtractInterfaceDialog[PropertyDescriptorImpl]

'member' @ [84:95] ==> val member: (KtNamedDeclaration..KtNamedDeclaration?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ui.KotlinExtractInterfaceDialog.createMemberInfoModel.<no name provided>.isAbstractWhenDisabled[LocalVariableDescriptor]

'isConstructorDeclaredProperty' @ [84:102] ==> public fun KtNamedDeclaration.isConstructorDeclaredProperty(): Boolean defined in org.jetbrains.kotlin.idea.refactoring in file kotlinRefactoringUtil.kt[SimpleFunctionDescriptorImpl]

'super' @ [88:30] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ui.KotlinExtractInterfaceDialog.createMemberInfoModel.<no name provided>[LazyClassReceiverParameterDescriptor]

'checkForProblems' @ [88:36] ==> public open fun checkForProblems(@NotNull p0: KotlinMemberInfo): Int defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ui.KotlinExtractSuperDialogBase.MemberInfoModelBase[JavaMethodDescriptor]

'memberInfo' @ [88:53] ==> value-parameter memberInfo: KotlinMemberInfo defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ui.KotlinExtractInterfaceDialog.createMemberInfoModel.<no name provided>.checkForProblems[ValueParameterDescriptorImpl]

'result' @ [89:21] ==> val result: Int defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ui.KotlinExtractInterfaceDialog.createMemberInfoModel.<no name provided>.checkForProblems[LocalVariableDescriptor]

'OK' @ [89:47] ==> public const final val OK: Int defined in com.intellij.refactoring.classMembers.MemberInfoModel[JavaPropertyDescriptor]

'result' @ [89:58] ==> val result: Int defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ui.KotlinExtractInterfaceDialog.createMemberInfoModel.<no name provided>.checkForProblems[LocalVariableDescriptor]

'!' @ [91:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'memberInfo' @ [91:22] ==> value-parameter memberInfo: KotlinMemberInfo defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ui.KotlinExtractInterfaceDialog.createMemberInfoModel.<no name provided>.checkForProblems[ValueParameterDescriptorImpl]

'isSuperClass' @ [91:33] ==> public final val isSuperClass: Boolean defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinMemberInfo[PropertyDescriptorImpl]

'memberInfo' @ [91:49] ==> value-parameter memberInfo: KotlinMemberInfo defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ui.KotlinExtractInterfaceDialog.createMemberInfoModel.<no name provided>.checkForProblems[ValueParameterDescriptorImpl]

'overrides' @ [91:60] ==> public final val KotlinMemberInfo.overrides: (Boolean..Boolean?)[MyPropertyDescriptor]

'memberInfo' @ [91:82] ==> value-parameter memberInfo: KotlinMemberInfo defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ui.KotlinExtractInterfaceDialog.createMemberInfoModel.<no name provided>.checkForProblems[ValueParameterDescriptorImpl]

'isChecked' @ [91:93] ==> public final var KotlinMemberInfo.isChecked: Boolean[MyPropertyDescriptor]

'result' @ [91:111] ==> val result: Int defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ui.KotlinExtractInterfaceDialog.createMemberInfoModel.<no name provided>.checkForProblems[LocalVariableDescriptor]

'lightElementForMemberInfo' @ [93:41] ==> public fun lightElementForMemberInfo(declaration: KtNamedDeclaration?): PsiMember? defined in org.jetbrains.kotlin.idea.refactoring.memberInfo in file KotlinMemberInfo.kt[SimpleFunctionDescriptorImpl]

'memberInfo' @ [93:67] ==> value-parameter memberInfo: KotlinMemberInfo defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ui.KotlinExtractInterfaceDialog.createMemberInfoModel.<no name provided>.checkForProblems[ValueParameterDescriptorImpl]

'member' @ [93:78] ==> public final val KotlinMemberInfo.member: (KtNamedDeclaration..KtNamedDeclaration?)[MyPropertyDescriptor]

'result' @ [93:109] ==> val result: Int defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ui.KotlinExtractInterfaceDialog.createMemberInfoModel.<no name provided>.checkForProblems[LocalVariableDescriptor]

'memberInfos' @ [95:30] ==> public final val memberInfos: List<KotlinMemberInfo> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ui.KotlinExtractInterfaceDialog.createMemberInfoModel.<no name provided>[PropertyDescriptorImpl]

'!' @ [96:25] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'info' @ [96:26] ==> val info: KotlinMemberInfo defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ui.KotlinExtractInterfaceDialog.createMemberInfoModel.<no name provided>.checkForProblems[LocalVariableDescriptor]

'isChecked' @ [96:31] ==> public final var KotlinMemberInfo.isChecked: Boolean[MyPropertyDescriptor]

'info' @ [96:44] ==> val info: KotlinMemberInfo defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ui.KotlinExtractInterfaceDialog.createMemberInfoModel.<no name provided>.checkForProblems[LocalVariableDescriptor]

'isToAbstract' @ [96:49] ==> public final var KotlinMemberInfo.isToAbstract: Boolean[MyPropertyDescriptor]

'info' @ [97:34] ==> val info: KotlinMemberInfo defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ui.KotlinExtractInterfaceDialog.createMemberInfoModel.<no name provided>.checkForProblems[LocalVariableDescriptor]

'member' @ [97:39] ==> public final val KotlinMemberInfo.member: (KtNamedDeclaration..KtNamedDeclaration?)[MyPropertyDescriptor]

'lightElementForMemberInfo' @ [98:44] ==> public fun lightElementForMemberInfo(declaration: KtNamedDeclaration?): PsiMember? defined in org.jetbrains.kotlin.idea.refactoring.memberInfo in file KotlinMemberInfo.kt[SimpleFunctionDescriptorImpl]

'member' @ [98:70] ==> val member: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ui.KotlinExtractInterfaceDialog.createMemberInfoModel.<no name provided>.checkForProblems[LocalVariableDescriptor]

'psiSuperInterface' @ [99:25] ==> val psiSuperInterface: PsiClass defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ui.KotlinExtractInterfaceDialog.createMemberInfoModel.<no name provided>.checkForProblems[LocalVariableDescriptor]

'findMethodBySignature' @ [99:43] ==> @Nullable public abstract fun findMethodBySignature(p0: (PsiMethod..PsiMethod?), p1: Boolean): PsiMethod? defined in com.intellij.psi.PsiClass[JavaMethodDescriptor]

'psiMethodToCheck' @ [99:65] ==> val psiMethodToCheck: PsiMethod defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ui.KotlinExtractInterfaceDialog.createMemberInfoModel.<no name provided>.checkForProblems[LocalVariableDescriptor]

'ERROR' @ [99:121] ==> public const final val ERROR: Int defined in com.intellij.refactoring.classMembers.MemberInfoModel[JavaPropertyDescriptor]

'result' @ [102:24] ==> val result: Int defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ui.KotlinExtractInterfaceDialog.createMemberInfoModel.<no name provided>.checkForProblems[LocalVariableDescriptor]

'DESTINATION_PACKAGE_RECENT_KEY' @ [107:53] ==> private final val DESTINATION_PACKAGE_RECENT_KEY: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ui.KotlinExtractInterfaceDialog.Companion[PropertyDescriptorImpl]

'!!' @ [109:44] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: String?): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> String

'message' @ [109:62] ==> public open fun message(@PropertyKey p0: (String..String?)): (String..String?) defined in com.intellij.refactoring.RefactoringBundle[JavaMethodDescriptor]

'!!' @ [111:46] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: String?): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> String

'message' @ [111:64] ==> public open fun message(@PropertyKey p0: (String..String?)): (String..String?) defined in com.intellij.refactoring.RefactoringBundle[JavaMethodDescriptor]

'!!' @ [113:36] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: String?): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> String

'message' @ [113:54] ==> public open fun message(@PropertyKey p0: (String..String?)): (String..String?) defined in com.intellij.refactoring.RefactoringBundle[JavaMethodDescriptor]

'!!' @ [115:38] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: String?): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> String

'message' @ [115:56] ==> public open fun message(@PropertyKey p0: (String..String?)): (String..String?) defined in com.intellij.refactoring.RefactoringBundle[JavaMethodDescriptor]

'getInstance' @ [117:73] ==> public open fun getInstance(): (JavaRefactoringSettings..JavaRefactoringSettings?) defined in com.intellij.refactoring.JavaRefactoringSettings[JavaMethodDescriptor]

'EXTRACT_INTERFACE_JAVADOC' @ [117:87] ==> public final var EXTRACT_INTERFACE_JAVADOC: Int defined in com.intellij.refactoring.JavaRefactoringSettings[JavaPropertyDescriptor]

'getInstance' @ [120:33] ==> public open fun getInstance(): (JavaRefactoringSettings..JavaRefactoringSettings?) defined in com.intellij.refactoring.JavaRefactoringSettings[JavaMethodDescriptor]

'EXTRACT_INTERFACE_JAVADOC' @ [120:47] ==> public final var EXTRACT_INTERFACE_JAVADOC: Int defined in com.intellij.refactoring.JavaRefactoringSettings[JavaPropertyDescriptor]

'policy' @ [120:75] ==> value-parameter policy: Int defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ui.KotlinExtractInterfaceDialog.setDocCommentPolicySetting[ValueParameterDescriptorImpl]

'!!' @ [123:63] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: String?): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> String

'message' @ [123:81] ==> public open fun message(@PropertyKey p0: (String..String?)): (String..String?) defined in com.intellij.refactoring.RefactoringBundle[JavaMethodDescriptor]

'EXTRACT_INTERFACE' @ [125:39] ==> public const final val EXTRACT_INTERFACE: String defined in com.intellij.refactoring.HelpID[JavaPropertyDescriptor]

'super' @ [127:52] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ui.KotlinExtractInterfaceDialog[LazyClassReceiverParameterDescriptor]

'createExtractedSuperNameField' @ [127:58] ==> protected open fun createExtractedSuperNameField(): JTextField defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ui.KotlinExtractSuperDialogBase[SimpleFunctionDescriptorImpl]

'apply' @ [127:90] ==> @InlineOnly public inline fun <T> JTextField.apply(block: JTextField.() -> Unit): JTextField defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JTextField

'text' @ [127:98] ==> public final var JTextField.text: (String..String?)[MyPropertyDescriptor]

'originalClass' @ [127:109] ==> protected final val originalClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ui.KotlinExtractInterfaceDialog[PropertyDescriptorImpl]

'name' @ [127:123] ==> public final val KtClassOrObject.name: String?[MyPropertyDescriptor]

