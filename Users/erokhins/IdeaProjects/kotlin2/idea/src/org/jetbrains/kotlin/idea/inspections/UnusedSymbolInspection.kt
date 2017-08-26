'AbstractKotlinInspection' @ [80:32] ==> public constructor AbstractKotlinInspection() defined in org.jetbrains.kotlin.idea.inspections.AbstractKotlinInspection[DeserializedClassConstructorDescriptor]

'UnusedDeclarationInspection' @ [82:38] ==> public constructor UnusedDeclarationInspection() defined in com.intellij.codeInspection.deadCode.UnusedDeclarationInspection[JavaClassConstructorDescriptor]

'when (declaration) {
                is KtClassOrObject -> declaration.toLightClass()
                is KtNamedFunction, is KtSecondaryConstructor -> LightClassUtil.getLightClassMethod(declaration as KtFunction)
                is KtProperty, is KtParameter -> {
                    if (declaration is KtParameter && !declaration.hasValOrVar()) return false
                    // can't rely on light element, check annotation ourselves
                    val descriptor = declaration.descriptor ?: return false
                    val entryPointsManager = EntryPointsManager.getInstance(declaration.project) as EntryPointsManagerBase
                    return checkAnnotatedUsingPatterns(
                            descriptor,
                            entryPointsManager.additionalAnnotations + entryPointsManager.ADDITIONAL_ANNOTATIONS
                    )
                }
                else -> return false
            }' @ [85:45] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: PsiElement?, entry1: PsiElement?, entry2: PsiElement?, entry3: PsiElement?): PsiElement?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> PsiElement?

'declaration' @ [85:51] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.Companion.isEntryPoint[ValueParameterDescriptorImpl]

'declaration' @ [86:39] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.Companion.isEntryPoint[ValueParameterDescriptorImpl]

'toLightClass' @ [86:51] ==> public fun KtClassOrObject.toLightClass(): KtLightClass? defined in org.jetbrains.kotlin.asJava[DeserializedSimpleFunctionDescriptor]

'LightClassUtil' @ [87:66] ==> public object LightClassUtil defined in org.jetbrains.kotlin.asJava[FakeCallableDescriptorForObject]

'getLightClassMethod' @ [87:81] ==> public final fun getLightClassMethod(function: KtFunction): PsiMethod? defined in org.jetbrains.kotlin.asJava.LightClassUtil[DeserializedSimpleFunctionDescriptor]

'declaration' @ [87:101] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.Companion.isEntryPoint[ValueParameterDescriptorImpl]

'declaration' @ [89:25] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.Companion.isEntryPoint[ValueParameterDescriptorImpl]

'!' @ [89:55] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'declaration' @ [89:56] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.Companion.isEntryPoint[ValueParameterDescriptorImpl]

'hasValOrVar' @ [89:68] ==> public open fun hasValOrVar(): Boolean defined in org.jetbrains.kotlin.psi.KtParameter[JavaMethodDescriptor]

'declaration' @ [91:38] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.Companion.isEntryPoint[ValueParameterDescriptorImpl]

'descriptor' @ [91:50] ==> public val KtDeclaration.descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.search.usagesSearch[DeserializedPropertyDescriptor]

'getInstance' @ [92:65] ==> public open fun getInstance(p0: (Project..Project?)): (EntryPointsManager..EntryPointsManager?) defined in com.intellij.codeInspection.ex.EntryPointsManager[JavaMethodDescriptor]

'declaration' @ [92:77] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.Companion.isEntryPoint[ValueParameterDescriptorImpl]

'project' @ [92:89] ==> public final val KtNamedDeclaration.project: Project[MyPropertyDescriptor]

'checkAnnotatedUsingPatterns' @ [93:28] ==> public final fun checkAnnotatedUsingPatterns(annotated: Annotated, annotationPatterns: Collection<String>): Boolean defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.Companion[SimpleFunctionDescriptorImpl]

'descriptor' @ [94:29] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.Companion.isEntryPoint[LocalVariableDescriptor]

'entryPointsManager' @ [95:29] ==> val entryPointsManager: EntryPointsManagerBase defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.Companion.isEntryPoint[LocalVariableDescriptor]

'additionalAnnotations' @ [95:48] ==> public final val EntryPointsManagerBase.additionalAnnotations: (MutableCollection<(String..String?)>..Collection<(String..String?)>?)[MyPropertyDescriptor]

'entryPointsManager' @ [95:72] ==> val entryPointsManager: EntryPointsManagerBase defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.Companion.isEntryPoint[LocalVariableDescriptor]

'ADDITIONAL_ANNOTATIONS' @ [95:91] ==> public final var ADDITIONAL_ANNOTATIONS: (JDOMExternalizableStringList..JDOMExternalizableStringList?) defined in com.intellij.codeInspection.ex.EntryPointsManagerBase[JavaPropertyDescriptor]

'lightElement' @ [100:20] ==> val lightElement: PsiElement? defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.Companion.isEntryPoint[LocalVariableDescriptor]

'javaInspection' @ [100:44] ==> private final val javaInspection: UnusedDeclarationInspection defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.Companion[PropertyDescriptorImpl]

'isEntryPoint' @ [100:59] ==> public open fun isEntryPoint(@NotNull p0: PsiElement): Boolean defined in com.intellij.codeInspection.deadCode.UnusedDeclarationInspection[JavaMethodDescriptor]

'lightElement' @ [100:72] ==> val lightElement: PsiElement? defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.Companion.isEntryPoint[LocalVariableDescriptor]

'getNonStrictParentOfType' @ [104:31] ==> public inline fun <reified T : PsiElement> PsiElement.getNonStrictParentOfType(): KtClassOrObject? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtClassOrObject

'ownerObject' @ [105:17] ==> val ownerObject: KtClassOrObject? defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.Companion.isSerializationImplicitlyUsedField[LocalVariableDescriptor]

'ownerObject' @ [105:55] ==> val ownerObject: KtClassOrObject? defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.Companion.isSerializationImplicitlyUsedField[LocalVariableDescriptor]

'isCompanion' @ [105:67] ==> public final fun isCompanion(): Boolean defined in org.jetbrains.kotlin.psi.KtObjectDeclaration[DeserializedSimpleFunctionDescriptor]

'ownerObject' @ [106:34] ==> val ownerObject: KtClassOrObject? defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.Companion.isSerializationImplicitlyUsedField[LocalVariableDescriptor]

'getNonStrictParentOfType' @ [106:46] ==> public inline fun <reified T : PsiElement> PsiElement.getNonStrictParentOfType(): KtClass? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtClass

'toLightClass' @ [106:83] ==> public fun KtClassOrObject.toLightClass(): KtLightClass? defined in org.jetbrains.kotlin.asJava[DeserializedSimpleFunctionDescriptor]

'lightClass' @ [107:24] ==> val lightClass: KtLightClass defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.Companion.isSerializationImplicitlyUsedField[LocalVariableDescriptor]

'fields' @ [107:35] ==> public final val KtLightClass.fields: (Array<(PsiField..PsiField?)>..Array<out (PsiField..PsiField?)>)[MyPropertyDescriptor]

'any' @ [107:42] ==> public inline fun <T> Array<out (PsiField..PsiField?)>.any(predicate: ((PsiField..PsiField?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiField..com.intellij.psi.PsiField?)

'it' @ [107:48] ==> value-parameter it: (PsiField..PsiField?) defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.Companion.isSerializationImplicitlyUsedField.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [107:51] ==> public final val PsiField.name: String?[MyPropertyDescriptor]

'name' @ [107:59] ==> public final val KtProperty.name: String?[MyPropertyDescriptor]

'isSerializationImplicitlyUsedField' @ [107:81] ==> public open fun isSerializationImplicitlyUsedField(@NotNull p0: PsiField): Boolean defined in com.intellij.codeInsight.daemon.impl.analysis.HighlightUtil[JavaMethodDescriptor]

'it' @ [107:116] ==> value-parameter it: (PsiField..PsiField?) defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.Companion.isSerializationImplicitlyUsedField.<anonymous>[ValueParameterDescriptorImpl]

'toLightMethods' @ [113:20] ==> public fun PsiElement.toLightMethods(): List<PsiMethod> defined in org.jetbrains.kotlin.asJava[DeserializedSimpleFunctionDescriptor]

'any' @ [113:37] ==> public inline fun <T> Iterable<PsiMethod>.any(predicate: (PsiMethod) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiMethod

'isSerializationRelatedMethod' @ [113:61] ==> public open fun isSerializationRelatedMethod(p0: (PsiMethod..PsiMethod?), p1: (PsiClass..PsiClass?)): Boolean defined in com.intellij.codeInsight.daemon.impl.analysis.JavaHighlightUtil[JavaMethodDescriptor]

'it' @ [113:90] ==> value-parameter it: PsiMethod defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.Companion.isSerializationImplicitlyUsedMethod.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [113:94] ==> value-parameter it: PsiMethod defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.Companion.isSerializationImplicitlyUsedMethod.<anonymous>[ValueParameterDescriptorImpl]

'containingClass' @ [113:97] ==> public final val PsiMethod.containingClass: PsiClass?[MyPropertyDescriptor]

'annotated' @ [118:38] ==> value-parameter annotated: Annotated defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.Companion.checkAnnotatedUsingPatterns[ValueParameterDescriptorImpl]

'annotations' @ [118:48] ==> public abstract val annotations: Annotations defined in org.jetbrains.kotlin.descriptors.annotations.Annotated[DeserializedPropertyDescriptor]

'mapNotNull' @ [118:60] ==> public inline fun <T, R : Any> Iterable<AnnotationDescriptor>.mapNotNull(transform: (AnnotationDescriptor) -> String?): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AnnotationDescriptor
    <R : Any> -> String

'it' @ [118:73] ==> value-parameter it: AnnotationDescriptor defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.Companion.checkAnnotatedUsingPatterns.<anonymous>[ValueParameterDescriptorImpl]

'fqName' @ [118:76] ==> public open val fqName: FqName? defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationDescriptor[DeserializedPropertyDescriptor]

'asString' @ [118:84] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'annotationsPresent' @ [119:17] ==> val annotationsPresent: List<String> defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.Companion.checkAnnotatedUsingPatterns[LocalVariableDescriptor]

'isEmpty' @ [119:36] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'annotationPatterns' @ [121:29] ==> value-parameter annotationPatterns: Collection<String> defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.Companion.checkAnnotatedUsingPatterns[ValueParameterDescriptorImpl]

'if (pattern.endsWith(".*")) {
                    annotationsPresent.any { it.startsWith(pattern.dropLast(1)) }
                }
                else {
                    pattern in annotationsPresent
                }' @ [122:37] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'pattern' @ [122:41] ==> val pattern: String defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.Companion.checkAnnotatedUsingPatterns[LocalVariableDescriptor]

'endsWith' @ [122:49] ==> public fun String.endsWith(suffix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'annotationsPresent' @ [123:21] ==> val annotationsPresent: List<String> defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.Companion.checkAnnotatedUsingPatterns[LocalVariableDescriptor]

'any' @ [123:40] ==> public inline fun <T> Iterable<String>.any(predicate: (String) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [123:46] ==> value-parameter it: String defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.Companion.checkAnnotatedUsingPatterns.<anonymous>[ValueParameterDescriptorImpl]

'startsWith' @ [123:49] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'pattern' @ [123:60] ==> val pattern: String defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.Companion.checkAnnotatedUsingPatterns[LocalVariableDescriptor]

'dropLast' @ [123:68] ==> public fun String.dropLast(n: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'pattern' @ [126:21] ==> val pattern: String defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.Companion.checkAnnotatedUsingPatterns[LocalVariableDescriptor]

'annotationsPresent' @ [126:32] ==> val annotationsPresent: List<String> defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.Companion.checkAnnotatedUsingPatterns[LocalVariableDescriptor]

'hasAnnotation' @ [128:21] ==> val hasAnnotation: Boolean defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.Companion.checkAnnotatedUsingPatterns[LocalVariableDescriptor]

'KtVisitorVoid' @ [138:25] ==> public constructor KtVisitorVoid() defined in org.jetbrains.kotlin.psi.KtVisitorVoid[JavaClassConstructorDescriptor]

'declaration' @ [140:21] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.buildVisitor.<no name provided>.visitDeclaration[ValueParameterDescriptorImpl]

'declaration' @ [141:28] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.buildVisitor.<no name provided>.visitDeclaration[ValueParameterDescriptorImpl]

'name' @ [141:40] ==> public final val KtNamedDeclaration.name: String?[MyPropertyDescriptor]

'when (declaration) {
                    is KtClass -> "Class ''$name'' is never used"
                    is KtObjectDeclaration -> "Object ''$name'' is never used"
                    is KtNamedFunction -> "Function ''$name'' is never used"
                    is KtSecondaryConstructor -> "Constructor is never used"
                    is KtProperty, is KtParameter -> "Property ''$name'' is never used"
                    is KtTypeParameter -> "Type parameter ''$name'' is never used"
                    is KtTypeAlias -> "Type alias ''$name'' is never used"
                    else -> return
                }' @ [142:31] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String, entry1: String, entry2: String, entry3: String, entry4: String, entry5: String, entry6: String, entry7: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String

'declaration' @ [142:37] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.buildVisitor.<no name provided>.visitDeclaration[ValueParameterDescriptorImpl]

'name' @ [143:45] ==> val name: String defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.buildVisitor.<no name provided>.visitDeclaration[LocalVariableDescriptor]

'name' @ [144:58] ==> val name: String defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.buildVisitor.<no name provided>.visitDeclaration[LocalVariableDescriptor]

'name' @ [145:56] ==> val name: String defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.buildVisitor.<no name provided>.visitDeclaration[LocalVariableDescriptor]

'name' @ [147:67] ==> val name: String defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.buildVisitor.<no name provided>.visitDeclaration[LocalVariableDescriptor]

'name' @ [148:62] ==> val name: String defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.buildVisitor.<no name provided>.visitDeclaration[LocalVariableDescriptor]

'name' @ [149:54] ==> val name: String defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.buildVisitor.<no name provided>.visitDeclaration[LocalVariableDescriptor]

'!' @ [153:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'ProjectRootsUtil' @ [153:22] ==> public object ProjectRootsUtil defined in org.jetbrains.kotlin.idea.util[FakeCallableDescriptorForObject]

'isInProjectSource' @ [153:39] ==> @JvmStatic public final fun isInProjectSource(element: PsiElement): Boolean defined in org.jetbrains.kotlin.idea.util.ProjectRootsUtil[DeserializedSimpleFunctionDescriptor]

'declaration' @ [153:57] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.buildVisitor.<no name provided>.visitDeclaration[ValueParameterDescriptorImpl]

'declaration' @ [156:21] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.buildVisitor.<no name provided>.visitDeclaration[ValueParameterDescriptorImpl]

'declaration' @ [156:59] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.buildVisitor.<no name provided>.visitDeclaration[ValueParameterDescriptorImpl]

'isCompanion' @ [156:71] ==> public final fun isCompanion(): Boolean defined in org.jetbrains.kotlin.psi.KtObjectDeclaration[DeserializedSimpleFunctionDescriptor]

'declaration' @ [158:21] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.buildVisitor.<no name provided>.visitDeclaration[ValueParameterDescriptorImpl]

'declaration' @ [159:21] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.buildVisitor.<no name provided>.visitDeclaration[ValueParameterDescriptorImpl]

'hasModifier' @ [159:33] ==> public abstract fun hasModifier(@NotNull p0: KtModifierKeywordToken): Boolean defined in org.jetbrains.kotlin.psi.KtDeclaration[JavaMethodDescriptor]

'OVERRIDE_KEYWORD' @ [159:54] ==> public final val OVERRIDE_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'declaration' @ [160:21] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.buildVisitor.<no name provided>.visitDeclaration[ValueParameterDescriptorImpl]

'declaration' @ [160:50] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.buildVisitor.<no name provided>.visitDeclaration[ValueParameterDescriptorImpl]

'isLocal' @ [160:62] ==> public final val KtProperty.isLocal: Boolean[MyPropertyDescriptor]

'declaration' @ [161:21] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.buildVisitor.<no name provided>.visitDeclaration[ValueParameterDescriptorImpl]

'declaration' @ [161:52] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.buildVisitor.<no name provided>.visitDeclaration[ValueParameterDescriptorImpl]

'getParent' @ [161:64] ==> @Contract public abstract fun getParent(): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtDeclaration[JavaMethodDescriptor]

'parent' @ [161:76] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'!' @ [161:111] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'declaration' @ [161:112] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.buildVisitor.<no name provided>.visitDeclaration[ValueParameterDescriptorImpl]

'hasValOrVar' @ [161:124] ==> public open fun hasValOrVar(): Boolean defined in org.jetbrains.kotlin.psi.KtParameter[JavaMethodDescriptor]

'declaration' @ [164:34] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.buildVisitor.<no name provided>.visitDeclaration[ValueParameterDescriptorImpl]

'resolveToDescriptorIfAny' @ [164:46] ==> public fun KtDeclaration.resolveToDescriptorIfAny(bodyResolveMode: BodyResolveMode = ...): DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [165:21] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.buildVisitor.<no name provided>.visitDeclaration[LocalVariableDescriptor]

'descriptor' @ [165:57] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.buildVisitor.<no name provided>.visitDeclaration[LocalVariableDescriptor]

'isOperator' @ [165:68] ==> public final val FunctionDescriptor.isOperator: Boolean[MyPropertyDescriptor]

'isEntryPoint' @ [166:21] ==> public final fun isEntryPoint(declaration: KtNamedDeclaration): Boolean defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.Companion[SimpleFunctionDescriptorImpl]

'declaration' @ [166:34] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.buildVisitor.<no name provided>.visitDeclaration[ValueParameterDescriptorImpl]

'declaration' @ [167:21] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.buildVisitor.<no name provided>.visitDeclaration[ValueParameterDescriptorImpl]

'declaration' @ [167:50] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.buildVisitor.<no name provided>.visitDeclaration[ValueParameterDescriptorImpl]

'isSerializationImplicitlyUsedField' @ [167:62] ==> private final fun KtProperty.isSerializationImplicitlyUsedField(): Boolean defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.Companion[SimpleFunctionDescriptorImpl]

'declaration' @ [168:21] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.buildVisitor.<no name provided>.visitDeclaration[ValueParameterDescriptorImpl]

'declaration' @ [168:55] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.buildVisitor.<no name provided>.visitDeclaration[ValueParameterDescriptorImpl]

'isSerializationImplicitlyUsedMethod' @ [168:67] ==> private final fun KtNamedFunction.isSerializationImplicitlyUsedMethod(): Boolean defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.Companion[SimpleFunctionDescriptorImpl]

'declaration' @ [170:21] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.buildVisitor.<no name provided>.visitDeclaration[ValueParameterDescriptorImpl]

'declaration' @ [170:51] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.buildVisitor.<no name provided>.visitDeclaration[ValueParameterDescriptorImpl]

'dataClassComponentFunction' @ [170:63] ==> public fun KtParameter.dataClassComponentFunction(): FunctionDescriptor? defined in org.jetbrains.kotlin.idea.search.usagesSearch[DeserializedSimpleFunctionDescriptor]

'hasNonTrivialUsages' @ [173:21] ==> private final fun hasNonTrivialUsages(declaration: KtNamedDeclaration, descriptor: DeclarationDescriptor? = ...): Boolean defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection[SimpleFunctionDescriptorImpl]

'declaration' @ [173:41] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.buildVisitor.<no name provided>.visitDeclaration[ValueParameterDescriptorImpl]

'descriptor' @ [173:54] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.buildVisitor.<no name provided>.visitDeclaration[LocalVariableDescriptor]

'declaration' @ [174:21] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.buildVisitor.<no name provided>.visitDeclaration[ValueParameterDescriptorImpl]

'classOrObjectHasTextUsages' @ [174:55] ==> private final fun classOrObjectHasTextUsages(classOrObject: KtClassOrObject): Boolean defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection[SimpleFunctionDescriptorImpl]

'declaration' @ [174:82] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.buildVisitor.<no name provided>.visitDeclaration[ValueParameterDescriptorImpl]

'declaration' @ [176:34] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.buildVisitor.<no name provided>.visitDeclaration[ValueParameterDescriptorImpl]

'nameIdentifier' @ [176:46] ==> public final val KtNamedDeclaration.nameIdentifier: PsiElement?[MyPropertyDescriptor]

'declaration' @ [176:65] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.buildVisitor.<no name provided>.visitDeclaration[ValueParameterDescriptorImpl]

'getConstructorKeyword' @ [176:100] ==> public open fun getConstructorKeyword(): PsiElement? defined in org.jetbrains.kotlin.psi.KtConstructor[DeserializedSimpleFunctionDescriptor]

'holder' @ [177:41] ==> value-parameter holder: ProblemsHolder defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.buildVisitor[ValueParameterDescriptorImpl]

'manager' @ [177:48] ==> public final val ProblemsHolder.manager: InspectionManager[MyPropertyDescriptor]

'createProblemDescriptor' @ [177:56] ==> @NotNull @Contract public abstract fun createProblemDescriptor(@NotNull p0: PsiElement, @Nullable p1: TextRange?, @NotNull @Nls p2: String, @NotNull p3: ProblemHighlightType, p4: Boolean, vararg p5: (LocalQuickFix..LocalQuickFix?)): ProblemDescriptor defined in com.intellij.codeInspection.InspectionManager[JavaMethodDescriptor]

'psiElement' @ [178:25] ==> val psiElement: PsiElement defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.buildVisitor.<no name provided>.visitDeclaration[LocalVariableDescriptor]

'message' @ [180:25] ==> val message: String defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.buildVisitor.<no name provided>.visitDeclaration[LocalVariableDescriptor]

'LIKE_UNUSED_SYMBOL' @ [181:46] ==> enum entry LIKE_UNUSED_SYMBOL defined in com.intellij.codeInspection.ProblemHighlightType[FakeCallableDescriptorForObject]

'createQuickFixes' @ [183:26] ==> private final fun createQuickFixes(declaration: KtNamedDeclaration): List<LocalQuickFix> defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection[SimpleFunctionDescriptorImpl]

'declaration' @ [183:43] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.buildVisitor.<no name provided>.visitDeclaration[ValueParameterDescriptorImpl]

'toTypedArray' @ [183:56] ==> public inline fun <reified T> Collection<LocalQuickFix>.toTypedArray(): Array<LocalQuickFix> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> LocalQuickFix

'holder' @ [186:17] ==> value-parameter holder: ProblemsHolder defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.buildVisitor[ValueParameterDescriptorImpl]

'registerProblem' @ [186:24] ==> public open fun registerProblem(@NotNull p0: ProblemDescriptor): Unit defined in com.intellij.codeInspection.ProblemsHolder[JavaMethodDescriptor]

'problemDescriptor' @ [186:40] ==> val problemDescriptor: ProblemDescriptor defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.buildVisitor.<no name provided>.visitDeclaration[LocalVariableDescriptor]

'classOrObject' @ [197:13] ==> value-parameter classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.classOrObjectHasTextUsages[ValueParameterDescriptorImpl]

'useScope' @ [197:27] ==> public final val KtClassOrObject.useScope: SearchScope[MyPropertyDescriptor]

'KotlinFindClassUsagesHandler' @ [198:42] ==> public constructor KotlinFindClassUsagesHandler(ktClass: KtClassOrObject, factory: KotlinFindUsagesHandlerFactory) defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindClassUsagesHandler[ClassConstructorDescriptorImpl]

'classOrObject' @ [198:71] ==> value-parameter classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.classOrObjectHasTextUsages[ValueParameterDescriptorImpl]

'KotlinFindUsagesHandlerFactory' @ [198:86] ==> public constructor KotlinFindUsagesHandlerFactory(project: Project) defined in org.jetbrains.kotlin.idea.findUsages.KotlinFindUsagesHandlerFactory[ClassConstructorDescriptorImpl]

'classOrObject' @ [198:117] ==> value-parameter classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.classOrObjectHasTextUsages[ValueParameterDescriptorImpl]

'project' @ [198:131] ==> public final val KtClassOrObject.project: Project[MyPropertyDescriptor]

'findClassUsagesHandler' @ [199:13] ==> val findClassUsagesHandler: KotlinFindClassUsagesHandler defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.classOrObjectHasTextUsages[LocalVariableDescriptor]

'processUsagesInText' @ [199:36] ==> public final fun processUsagesInText(@NotNull p0: PsiElement, @NotNull p1: ((UsageInfo..UsageInfo?)) -> Boolean, @NotNull p2: GlobalSearchScope): Boolean defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindClassUsagesHandler[MyFunctionDescriptor]

'classOrObject' @ [200:21] ==> value-parameter classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.classOrObjectHasTextUsages[ValueParameterDescriptorImpl]

'hasTextUsages' @ [201:23] ==> var hasTextUsages: Boolean defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.classOrObjectHasTextUsages[LocalVariableDescriptor]

'projectScope' @ [202:39] ==> @NotNull public open fun projectScope(@NotNull p0: Project): GlobalSearchScope defined in com.intellij.psi.search.GlobalSearchScope[JavaMethodDescriptor]

'classOrObject' @ [202:52] ==> value-parameter classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.classOrObjectHasTextUsages[ValueParameterDescriptorImpl]

'project' @ [202:66] ==> public final val KtClassOrObject.project: Project[MyPropertyDescriptor]

'hasTextUsages' @ [206:16] ==> var hasTextUsages: Boolean defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.classOrObjectHasTextUsages[LocalVariableDescriptor]

'getInstance' @ [210:55] ==> public open fun getInstance(@NotNull p0: Project): (PsiSearchHelper..PsiSearchHelper?) defined in com.intellij.psi.search.PsiSearchHelper.SERVICE[JavaMethodDescriptor]

'declaration' @ [210:67] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.hasNonTrivialUsages[ValueParameterDescriptorImpl]

'project' @ [210:79] ==> public final val KtNamedDeclaration.project: Project[MyPropertyDescriptor]

'declaration' @ [212:24] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.hasNonTrivialUsages[ValueParameterDescriptorImpl]

'useScope' @ [212:36] ==> public final val KtNamedDeclaration.useScope: SearchScope[MyPropertyDescriptor]

'useScope' @ [213:13] ==> val useScope: SearchScope defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.hasNonTrivialUsages[LocalVariableDescriptor]

'listOf' @ [216:26] ==> public fun <T> listOf(element: String?): List<String?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String?

'declaration' @ [216:33] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.hasNonTrivialUsages[ValueParameterDescriptorImpl]

'name' @ [216:45] ==> public final val KtNamedDeclaration.name: String?[MyPropertyDescriptor]

'declaration' @ [216:53] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.hasNonTrivialUsages[ValueParameterDescriptorImpl]

'getAccessorNames' @ [216:65] ==> public fun PsiNamedElement.getAccessorNames(readable: Boolean = ..., writable: Boolean = ...): List<String> defined in org.jetbrains.kotlin.idea.search.usagesSearch[DeserializedSimpleFunctionDescriptor]

'listOfNotNull' @ [216:86] ==> public fun <T : Any> listOfNotNull(element: String?): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> String

'declaration' @ [216:100] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.hasNonTrivialUsages[ValueParameterDescriptorImpl]

'getClassNameForCompanionObject' @ [216:112] ==> public fun PsiNamedElement.getClassNameForCompanionObject(): String? defined in org.jetbrains.kotlin.idea.search.usagesSearch[DeserializedSimpleFunctionDescriptor]

'name' @ [217:21] ==> val name: String? defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.hasNonTrivialUsages[LocalVariableDescriptor]

'when (psiSearchHelper.isCheapEnoughToSearch(name, useScope, null, null)) {
                    ZERO_OCCURRENCES -> {} // go on, check other names
                    FEW_OCCURRENCES -> zeroOccurrences = false
                    TOO_MANY_OCCURRENCES -> return true // searching usages is too expensive; behave like it is used
                }' @ [218:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'psiSearchHelper' @ [218:23] ==> val psiSearchHelper: (PsiSearchHelper..PsiSearchHelper?) defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.hasNonTrivialUsages[LocalVariableDescriptor]

'isCheapEnoughToSearch' @ [218:39] ==> @NotNull public abstract fun isCheapEnoughToSearch(@NotNull p0: String, @NotNull p1: GlobalSearchScope, @Nullable p2: PsiFile?, @Nullable p3: ProgressIndicator?): PsiSearchHelper.SearchCostResult defined in com.intellij.psi.search.PsiSearchHelper[JavaMethodDescriptor]

'name' @ [218:61] ==> val name: String? defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.hasNonTrivialUsages[LocalVariableDescriptor]

'useScope' @ [218:67] ==> val useScope: SearchScope defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.hasNonTrivialUsages[LocalVariableDescriptor]

'ZERO_OCCURRENCES' @ [219:21] ==> enum entry ZERO_OCCURRENCES defined in com.intellij.psi.search.PsiSearchHelper.SearchCostResult[FakeCallableDescriptorForObject]

'FEW_OCCURRENCES' @ [220:21] ==> enum entry FEW_OCCURRENCES defined in com.intellij.psi.search.PsiSearchHelper.SearchCostResult[FakeCallableDescriptorForObject]

'zeroOccurrences' @ [220:40] ==> var zeroOccurrences: Boolean defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.hasNonTrivialUsages[LocalVariableDescriptor]

'TOO_MANY_OCCURRENCES' @ [221:21] ==> enum entry TOO_MANY_OCCURRENCES defined in com.intellij.psi.search.PsiSearchHelper.SearchCostResult[FakeCallableDescriptorForObject]

'zeroOccurrences' @ [225:17] ==> var zeroOccurrences: Boolean defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.hasNonTrivialUsages[LocalVariableDescriptor]

'if (declaration is KtObjectDeclaration && declaration.isCompanion()) {
                    // go on: companion object can be used only in containing class
                }
                else {
                    return false
                }' @ [226:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'declaration' @ [226:21] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.hasNonTrivialUsages[ValueParameterDescriptorImpl]

'declaration' @ [226:59] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.hasNonTrivialUsages[ValueParameterDescriptorImpl]

'isCompanion' @ [226:71] ==> public final fun isCompanion(): Boolean defined in org.jetbrains.kotlin.psi.KtObjectDeclaration[DeserializedSimpleFunctionDescriptor]

'declaration' @ [235:17] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.hasNonTrivialUsages[ValueParameterDescriptorImpl]

'declaration' @ [235:55] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.hasNonTrivialUsages[ValueParameterDescriptorImpl]

'isCompanion' @ [235:67] ==> public final fun isCompanion(): Boolean defined in org.jetbrains.kotlin.psi.KtObjectDeclaration[DeserializedSimpleFunctionDescriptor]

'declaration' @ [236:17] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.hasNonTrivialUsages[ValueParameterDescriptorImpl]

'getBody' @ [236:29] ==> public final fun getBody(): KtClassBody? defined in org.jetbrains.kotlin.psi.KtObjectDeclaration[DeserializedSimpleFunctionDescriptor]

'declarations' @ [236:40] ==> public final val KtClassBody.declarations: (MutableList<(KtDeclaration..KtDeclaration?)>..List<(KtDeclaration..KtDeclaration?)>?)[MyPropertyDescriptor]

'isNotEmpty' @ [236:54] ==> @InlineOnly public inline fun <T> Collection<(KtDeclaration..KtDeclaration?)>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtDeclaration..org.jetbrains.kotlin.psi.KtDeclaration?)

'hasReferences' @ [237:16] ==> private final fun hasReferences(declaration: KtNamedDeclaration, useScope: SearchScope): Boolean defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection[SimpleFunctionDescriptorImpl]

'declaration' @ [237:30] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.hasNonTrivialUsages[ValueParameterDescriptorImpl]

'useScope' @ [237:43] ==> val useScope: SearchScope defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.hasNonTrivialUsages[LocalVariableDescriptor]

'hasOverrides' @ [238:16] ==> private final fun hasOverrides(declaration: KtNamedDeclaration, useScope: SearchScope): Boolean defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection[SimpleFunctionDescriptorImpl]

'declaration' @ [238:29] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.hasNonTrivialUsages[ValueParameterDescriptorImpl]

'useScope' @ [238:42] ==> val useScope: SearchScope defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.hasNonTrivialUsages[LocalVariableDescriptor]

'hasFakeOverrides' @ [239:16] ==> private final fun hasFakeOverrides(declaration: KtNamedDeclaration, useScope: SearchScope): Boolean defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection[SimpleFunctionDescriptorImpl]

'declaration' @ [239:33] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.hasNonTrivialUsages[ValueParameterDescriptorImpl]

'useScope' @ [239:46] ==> val useScope: SearchScope defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.hasNonTrivialUsages[LocalVariableDescriptor]

'isPlatformImplementation' @ [240:16] ==> private final fun isPlatformImplementation(declaration: KtNamedDeclaration): Boolean defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection[SimpleFunctionDescriptorImpl]

'declaration' @ [240:41] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.hasNonTrivialUsages[ValueParameterDescriptorImpl]

'hasPlatformImplementations' @ [241:16] ==> private final fun hasPlatformImplementations(declaration: KtNamedDeclaration, descriptor: DeclarationDescriptor?): Boolean defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection[SimpleFunctionDescriptorImpl]

'declaration' @ [241:43] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.hasNonTrivialUsages[ValueParameterDescriptorImpl]

'descriptor' @ [241:56] ==> value-parameter descriptor: DeclarationDescriptor? = ... defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.hasNonTrivialUsages[ValueParameterDescriptorImpl]

'declaration' @ [247:17] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.hasReferences[ValueParameterDescriptorImpl]

'isAncestor' @ [247:29] ==> public fun PsiElement?.isAncestor(element: PsiElement, strict: Boolean = ...): Boolean defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'ref' @ [247:40] ==> value-parameter ref: PsiReference defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.hasReferences.checkReference[ValueParameterDescriptorImpl]

'element' @ [247:44] ==> public final val PsiReference.element: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'ref' @ [249:17] ==> value-parameter ref: PsiReference defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.hasReferences.checkReference[ValueParameterDescriptorImpl]

'element' @ [249:21] ==> public final val PsiReference.element: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'parent' @ [249:29] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'ref' @ [251:26] ==> value-parameter ref: PsiReference defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.hasReferences.checkReference[ValueParameterDescriptorImpl]

'element' @ [251:30] ==> public final val PsiReference.element: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'getParentOfType' @ [251:38] ==> public inline fun <reified T : PsiElement> PsiElement.getParentOfType(strict: Boolean): KtImportDirective? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtImportDirective

'import' @ [252:17] ==> val import: KtImportDirective? defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.hasReferences.checkReference[LocalVariableDescriptor]

'import' @ [253:21] ==> val import: KtImportDirective? defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.hasReferences.checkReference[LocalVariableDescriptor]

'aliasName' @ [253:28] ==> public final val KtImportDirective.aliasName: String?[MyPropertyDescriptor]

'import' @ [253:49] ==> val import: KtImportDirective? defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.hasReferences.checkReference[LocalVariableDescriptor]

'aliasName' @ [253:56] ==> public final val KtImportDirective.aliasName: String?[MyPropertyDescriptor]

'declaration' @ [253:69] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.hasReferences[ValueParameterDescriptorImpl]

'name' @ [253:81] ==> public final val KtNamedDeclaration.name: String?[MyPropertyDescriptor]

'declaration' @ [257:21] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.hasReferences[ValueParameterDescriptorImpl]

'declaration' @ [257:60] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.hasReferences[ValueParameterDescriptorImpl]

'declaration' @ [257:86] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.hasReferences[ValueParameterDescriptorImpl]

'isEnum' @ [257:98] ==> public final fun isEnum(): Boolean defined in org.jetbrains.kotlin.psi.KtClass[DeserializedSimpleFunctionDescriptor]

'if (import.isAllUnder) {
                        val importedFrom = import.importedReference?.getQualifiedElementSelector()?.mainReference?.resolve()
                                                   as? KtClassOrObject ?: return true
                        return importedFrom.declarations.none { it is KtNamedDeclaration && hasNonTrivialUsages(it) }
                    }
                    else {
                        if (import.importedFqName != declaration.fqName) {
                            val importedDeclaration =
                                    import.importedReference?.getQualifiedElementSelector()?.mainReference?.resolve() as? KtNamedDeclaration
                                    ?: return true
                            return declaration !in importedDeclaration.parentsWithSelf && !hasNonTrivialUsages(importedDeclaration)
                        }
                    }' @ [258:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'import' @ [258:25] ==> val import: KtImportDirective? defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.hasReferences.checkReference[LocalVariableDescriptor]

'isAllUnder' @ [258:32] ==> public final val KtImportDirective.isAllUnder: Boolean[MyPropertyDescriptor]

'import' @ [259:44] ==> val import: KtImportDirective? defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.hasReferences.checkReference[LocalVariableDescriptor]

'importedReference' @ [259:51] ==> public final val KtImportDirective.importedReference: KtExpression?[MyPropertyDescriptor]

'getQualifiedElementSelector' @ [259:70] ==> public fun KtElement.getQualifiedElementSelector(): KtElement? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'mainReference' @ [259:101] ==> public val KtElement.mainReference: KtReference? defined in org.jetbrains.kotlin.idea.references[DeserializedPropertyDescriptor]

'resolve' @ [259:116] ==> @Nullable public abstract fun resolve(): PsiElement? defined in org.jetbrains.kotlin.idea.references.KtReference[JavaMethodDescriptor]

'importedFrom' @ [261:32] ==> val importedFrom: KtClassOrObject defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.hasReferences.checkReference[LocalVariableDescriptor]

'declarations' @ [261:45] ==> public final val KtClassOrObject.declarations: List<KtDeclaration>[MyPropertyDescriptor]

'none' @ [261:58] ==> public inline fun <T> Iterable<KtDeclaration>.none(predicate: (KtDeclaration) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtDeclaration

'it' @ [261:65] ==> value-parameter it: KtDeclaration defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.hasReferences.checkReference.<anonymous>[ValueParameterDescriptorImpl]

'hasNonTrivialUsages' @ [261:93] ==> private final fun hasNonTrivialUsages(declaration: KtNamedDeclaration, descriptor: DeclarationDescriptor? = ...): Boolean defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection[SimpleFunctionDescriptorImpl]

'it' @ [261:113] ==> value-parameter it: KtDeclaration defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.hasReferences.checkReference.<anonymous>[ValueParameterDescriptorImpl]

'import' @ [264:29] ==> val import: KtImportDirective? defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.hasReferences.checkReference[LocalVariableDescriptor]

'importedFqName' @ [264:36] ==> public final val KtImportDirective.importedFqName: FqName?[MyPropertyDescriptor]

'declaration' @ [264:54] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.hasReferences[ValueParameterDescriptorImpl]

'fqName' @ [264:66] ==> public final val KtNamedDeclaration.fqName: FqName?[MyPropertyDescriptor]

'import' @ [266:37] ==> val import: KtImportDirective? defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.hasReferences.checkReference[LocalVariableDescriptor]

'importedReference' @ [266:44] ==> public final val KtImportDirective.importedReference: KtExpression?[MyPropertyDescriptor]

'getQualifiedElementSelector' @ [266:63] ==> public fun KtElement.getQualifiedElementSelector(): KtElement? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'mainReference' @ [266:94] ==> public val KtElement.mainReference: KtReference? defined in org.jetbrains.kotlin.idea.references[DeserializedPropertyDescriptor]

'resolve' @ [266:109] ==> @Nullable public abstract fun resolve(): PsiElement? defined in org.jetbrains.kotlin.idea.references.KtReference[JavaMethodDescriptor]

'declaration' @ [268:36] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.hasReferences[ValueParameterDescriptorImpl]

'importedDeclaration' @ [268:52] ==> val importedDeclaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.hasReferences.checkReference[LocalVariableDescriptor]

'parentsWithSelf' @ [268:72] ==> public val PsiElement.parentsWithSelf: Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'!' @ [268:91] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'hasNonTrivialUsages' @ [268:92] ==> private final fun hasNonTrivialUsages(declaration: KtNamedDeclaration, descriptor: DeclarationDescriptor? = ...): Boolean defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection[SimpleFunctionDescriptorImpl]

'importedDeclaration' @ [268:112] ==> val importedDeclaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.hasReferences.checkReference[LocalVariableDescriptor]

'declaration' @ [278:13] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.hasReferences[ValueParameterDescriptorImpl]

'declaration' @ [279:32] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.hasReferences[ValueParameterDescriptorImpl]

'toLightMethods' @ [279:44] ==> public fun PsiElement.toLightMethods(): List<PsiMethod> defined in org.jetbrains.kotlin.asJava[DeserializedSimpleFunctionDescriptor]

'lightMethods' @ [280:17] ==> val lightMethods: List<PsiMethod> defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.hasReferences[LocalVariableDescriptor]

'isNotEmpty' @ [280:30] ==> @InlineOnly public inline fun <T> Collection<PsiMethod>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiMethod

'lightMethods' @ [281:24] ==> val lightMethods: List<PsiMethod> defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.hasReferences[LocalVariableDescriptor]

'any' @ [281:37] ==> public inline fun <T> Iterable<PsiMethod>.any(predicate: (PsiMethod) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiMethod

'!' @ [282:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'search' @ [282:45] ==> public open fun search(p0: (PsiMethod..PsiMethod?)): (Query<(PsiReference..PsiReference?)>..Query<(PsiReference..PsiReference?)>?) defined in com.intellij.psi.search.searches.MethodReferencesSearch[JavaMethodDescriptor]

'method' @ [282:52] ==> value-parameter method: PsiMethod defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.hasReferences.<anonymous>[ValueParameterDescriptorImpl]

'forEach' @ [282:60] ==> public abstract fun forEach(@NotNull p0: Processor<(PsiReference..PsiReference?)>): Boolean defined in com.intellij.util.Query[JavaMethodDescriptor]

'Processor' @ [282:68] ==> public fun <T : (Any..Any?)> Processor(function: ((PsiReference..PsiReference?)) -> Boolean): Processor<(PsiReference..PsiReference?)> defined in com.intellij.util[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : (Any..Any?)> -> (com.intellij.psi.PsiReference..com.intellij.psi.PsiReference?)

'checkReference' @ [282:80] ==> local final fun checkReference(ref: PsiReference): Boolean defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.hasReferences[SimpleFunctionDescriptorImpl]

'it' @ [282:95] ==> value-parameter it: (PsiReference..PsiReference?) defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.hasReferences.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'!' @ [287:16] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'search' @ [287:34] ==> @NotNull public open fun search(@NotNull p0: PsiElement, @NotNull p1: SearchScope): Query<(PsiReference..PsiReference?)> defined in com.intellij.psi.search.searches.ReferencesSearch[JavaMethodDescriptor]

'declaration' @ [287:41] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.hasReferences[ValueParameterDescriptorImpl]

'useScope' @ [287:54] ==> value-parameter useScope: SearchScope defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.hasReferences[ValueParameterDescriptorImpl]

'forEach' @ [287:64] ==> public abstract fun forEach(@NotNull p0: Processor<(PsiReference..PsiReference?)>): Boolean defined in com.intellij.util.Query[JavaMethodDescriptor]

'Processor' @ [287:72] ==> public fun <T : (Any..Any?)> Processor(function: ((PsiReference..PsiReference?)) -> Boolean): Processor<(PsiReference..PsiReference?)> defined in com.intellij.util[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : (Any..Any?)> -> (com.intellij.psi.PsiReference..com.intellij.psi.PsiReference?)

'checkReference' @ [287:84] ==> local final fun checkReference(ref: PsiReference): Boolean defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.hasReferences[SimpleFunctionDescriptorImpl]

'it' @ [287:99] ==> value-parameter it: (PsiReference..PsiReference?) defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.hasReferences.<anonymous>[ValueParameterDescriptorImpl]

'!=' @ [291:16] ==> public open fun equals(other: Any?): Boolean defined in com.intellij.psi.PsiElement[DeserializedSimpleFunctionDescriptor]

'search' @ [291:40] ==> public open fun search(p0: (PsiElement..PsiElement?), p1: (SearchScope..SearchScope?)): (Query<(PsiElement..PsiElement?)>..Query<(PsiElement..PsiElement?)>?) defined in com.intellij.psi.search.searches.DefinitionsScopedSearch[JavaMethodDescriptor]

'declaration' @ [291:47] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.hasOverrides[ValueParameterDescriptorImpl]

'useScope' @ [291:60] ==> value-parameter useScope: SearchScope defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.hasOverrides[ValueParameterDescriptorImpl]

'findFirst' @ [291:70] ==> @Nullable public abstract fun findFirst(): PsiElement? defined in com.intellij.util.Query[JavaMethodDescriptor]

'declaration' @ [295:26] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.hasFakeOverrides[ValueParameterDescriptorImpl]

'containingClassOrObject' @ [295:38] ==> public val KtDeclaration.containingClassOrObject: KtClassOrObject? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'!' @ [296:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'ownerClass' @ [296:14] ==> val ownerClass: KtClass defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.hasFakeOverrides[LocalVariableDescriptor]

'isInheritable' @ [296:25] ==> public fun KtClass.isInheritable(): Boolean defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'declaration' @ [297:26] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.hasFakeOverrides[ValueParameterDescriptorImpl]

'toDescriptor' @ [297:38] ==> public fun KtDeclaration.toDescriptor(): DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [298:13] ==> val descriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.hasFakeOverrides[LocalVariableDescriptor]

'modality' @ [298:24] ==> public final val CallableMemberDescriptor.modality: Modality[MyPropertyDescriptor]

'Modality' @ [298:36] ==> public companion object defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'ABSTRACT' @ [298:45] ==> enum entry ABSTRACT defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'declaration' @ [299:28] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.hasFakeOverrides[ValueParameterDescriptorImpl]

'toLightMethods' @ [299:40] ==> public fun PsiElement.toLightMethods(): List<PsiMethod> defined in org.jetbrains.kotlin.asJava[DeserializedSimpleFunctionDescriptor]

'search' @ [300:40] ==> public open fun search(p0: (PsiElement..PsiElement?), p1: (SearchScope..SearchScope?)): (Query<(PsiElement..PsiElement?)>..Query<(PsiElement..PsiElement?)>?) defined in com.intellij.psi.search.searches.DefinitionsScopedSearch[JavaMethodDescriptor]

'ownerClass' @ [300:47] ==> val ownerClass: KtClass defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.hasFakeOverrides[LocalVariableDescriptor]

'useScope' @ [300:59] ==> value-parameter useScope: SearchScope defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.hasFakeOverrides[ValueParameterDescriptorImpl]

'any' @ [300:69] ==> public inline fun <T> Iterable<(PsiElement..PsiElement?)>.any(predicate: ((PsiElement..PsiElement?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'when (element) {
                is KtLightClass -> {
                    val memberBySignature =
                            (element.kotlinOrigin?.toDescriptor() as? ClassDescriptor)?.findCallableMemberBySignature(descriptor)
                    memberBySignature != null &&
                    !memberBySignature.kind.isReal &&
                    memberBySignature.overriddenDescriptors.any { it != descriptor }
                }
                is PsiClass ->
                    lightMethods.any {
                        lightMethod ->

                        val sameMethods = element.findMethodsBySignature(lightMethod, true)
                        sameMethods.all { it.containingClass != element } &&
                        sameMethods.any { it.containingClass != lightMethod.containingClass }
                    }
                else ->
                    false
            }' @ [303:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'element' @ [303:19] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.hasFakeOverrides.<anonymous>[ValueParameterDescriptorImpl]

'element' @ [306:30] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.hasFakeOverrides.<anonymous>[ValueParameterDescriptorImpl]

'kotlinOrigin' @ [306:38] ==> public abstract val kotlinOrigin: KtClassOrObject? defined in org.jetbrains.kotlin.asJava.classes.KtLightClass[DeserializedPropertyDescriptor]

'toDescriptor' @ [306:52] ==> public fun KtDeclaration.toDescriptor(): DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'findCallableMemberBySignature' @ [306:89] ==> public fun ClassDescriptor.findCallableMemberBySignature(signature: CallableMemberDescriptor, allowOverridabilityConflicts: Boolean = ...): CallableMemberDescriptor? defined in org.jetbrains.kotlin.util[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [306:119] ==> val descriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.hasFakeOverrides[LocalVariableDescriptor]

'memberBySignature' @ [307:21] ==> val memberBySignature: CallableMemberDescriptor? defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.hasFakeOverrides.<anonymous>[LocalVariableDescriptor]

'!' @ [308:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'memberBySignature' @ [308:22] ==> val memberBySignature: CallableMemberDescriptor? defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.hasFakeOverrides.<anonymous>[LocalVariableDescriptor]

'kind' @ [308:40] ==> public final val CallableMemberDescriptor.kind: CallableMemberDescriptor.Kind[MyPropertyDescriptor]

'isReal' @ [308:45] ==> public final val CallableMemberDescriptor.Kind.isReal: Boolean[MyPropertyDescriptor]

'memberBySignature' @ [309:21] ==> val memberBySignature: CallableMemberDescriptor? defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.hasFakeOverrides.<anonymous>[LocalVariableDescriptor]

'overriddenDescriptors' @ [309:39] ==> public final var CallableMemberDescriptor.overriddenDescriptors: (MutableCollection<out (CallableMemberDescriptor..CallableMemberDescriptor?)>..Collection<(CallableMemberDescriptor..CallableMemberDescriptor?)>)[MyPropertyDescriptor]

'any' @ [309:61] ==> public inline fun <T> Iterable<(CallableMemberDescriptor..CallableMemberDescriptor?)>.any(predicate: ((CallableMemberDescriptor..CallableMemberDescriptor?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.CallableMemberDescriptor..org.jetbrains.kotlin.descriptors.CallableMemberDescriptor?)

'it' @ [309:67] ==> value-parameter it: (CallableMemberDescriptor..CallableMemberDescriptor?) defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.hasFakeOverrides.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'descriptor' @ [309:73] ==> val descriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.hasFakeOverrides[LocalVariableDescriptor]

'lightMethods' @ [312:21] ==> val lightMethods: List<PsiMethod> defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.hasFakeOverrides[LocalVariableDescriptor]

'any' @ [312:34] ==> public inline fun <T> Iterable<PsiMethod>.any(predicate: (PsiMethod) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiMethod

'element' @ [315:43] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.hasFakeOverrides.<anonymous>[ValueParameterDescriptorImpl]

'findMethodsBySignature' @ [315:51] ==> @NotNull public abstract fun findMethodsBySignature(p0: (PsiMethod..PsiMethod?), p1: Boolean): (Array<(PsiMethod..PsiMethod?)>..Array<out (PsiMethod..PsiMethod?)>) defined in com.intellij.psi.PsiClass[JavaMethodDescriptor]

'lightMethod' @ [315:74] ==> value-parameter lightMethod: PsiMethod defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.hasFakeOverrides.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'sameMethods' @ [316:25] ==> val sameMethods: (Array<(PsiMethod..PsiMethod?)>..Array<out (PsiMethod..PsiMethod?)>) defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.hasFakeOverrides.<anonymous>.<anonymous>[LocalVariableDescriptor]

'all' @ [316:37] ==> public inline fun <T> Array<out (PsiMethod..PsiMethod?)>.all(predicate: ((PsiMethod..PsiMethod?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiMethod..com.intellij.psi.PsiMethod?)

'it' @ [316:43] ==> value-parameter it: (PsiMethod..PsiMethod?) defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.hasFakeOverrides.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'containingClass' @ [316:46] ==> public final val PsiMethod.containingClass: PsiClass?[MyPropertyDescriptor]

'element' @ [316:65] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.hasFakeOverrides.<anonymous>[ValueParameterDescriptorImpl]

'sameMethods' @ [317:25] ==> val sameMethods: (Array<(PsiMethod..PsiMethod?)>..Array<out (PsiMethod..PsiMethod?)>) defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.hasFakeOverrides.<anonymous>.<anonymous>[LocalVariableDescriptor]

'any' @ [317:37] ==> public inline fun <T> Array<out (PsiMethod..PsiMethod?)>.any(predicate: ((PsiMethod..PsiMethod?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiMethod..com.intellij.psi.PsiMethod?)

'it' @ [317:43] ==> value-parameter it: (PsiMethod..PsiMethod?) defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.hasFakeOverrides.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'containingClass' @ [317:46] ==> public final val PsiMethod.containingClass: PsiClass?[MyPropertyDescriptor]

'lightMethod' @ [317:65] ==> value-parameter lightMethod: PsiMethod defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.hasFakeOverrides.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'containingClass' @ [317:77] ==> public final val PsiMethod.containingClass: PsiClass?[MyPropertyDescriptor]

'declaration' @ [326:13] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.isPlatformImplementation[ValueParameterDescriptorImpl]

'hasModifier' @ [326:25] ==> public abstract fun hasModifier(@NotNull p0: KtModifierKeywordToken): Boolean defined in org.jetbrains.kotlin.psi.KtNamedDeclaration[JavaMethodDescriptor]

'IMPL_KEYWORD' @ [326:46] ==> public final val IMPL_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'!' @ [329:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'declaration' @ [329:14] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.hasPlatformImplementations[ValueParameterDescriptorImpl]

'hasModifier' @ [329:26] ==> public abstract fun hasModifier(@NotNull p0: KtModifierKeywordToken): Boolean defined in org.jetbrains.kotlin.psi.KtNamedDeclaration[JavaMethodDescriptor]

'HEADER_KEYWORD' @ [329:47] ==> public final val HEADER_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'descriptor' @ [331:9] ==> value-parameter descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.hasPlatformImplementations[ValueParameterDescriptorImpl]

'declaration' @ [332:38] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.hasPlatformImplementations[ValueParameterDescriptorImpl]

'containingKtFile' @ [332:50] ==> public final val KtNamedDeclaration.containingKtFile: KtFile[MyPropertyDescriptor]

'findModuleDescriptor' @ [332:67] ==> public fun KtElement.findModuleDescriptor(): ModuleDescriptor defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'commonModuleDescriptor' @ [334:16] ==> val commonModuleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.hasPlatformImplementations[LocalVariableDescriptor]

'allImplementingCompatibleModules' @ [334:39] ==> public val ModuleDescriptor.allImplementingCompatibleModules: List<ModuleDescriptor> defined in org.jetbrains.kotlin.idea.highlighter[DeserializedPropertyDescriptor]

'any' @ [334:72] ==> public inline fun <T> Iterable<ModuleDescriptor>.any(predicate: (ModuleDescriptor) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ModuleDescriptor

'it' @ [334:78] ==> value-parameter it: ModuleDescriptor defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.hasPlatformImplementations.<anonymous>[ValueParameterDescriptorImpl]

'hasImplementationsOf' @ [334:81] ==> public fun ModuleDescriptor.hasImplementationsOf(descriptor: MemberDescriptor): Boolean defined in org.jetbrains.kotlin.idea.highlighter.markers[SimpleFunctionDescriptorImpl]

'descriptor' @ [334:102] ==> value-parameter descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.hasPlatformImplementations[ValueParameterDescriptorImpl]

'commonModuleDescriptor' @ [335:16] ==> val commonModuleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.hasPlatformImplementations[LocalVariableDescriptor]

'hasImplementationsOf' @ [335:39] ==> public fun ModuleDescriptor.hasImplementationsOf(descriptor: MemberDescriptor): Boolean defined in org.jetbrains.kotlin.idea.highlighter.markers[SimpleFunctionDescriptorImpl]

'descriptor' @ [335:60] ==> value-parameter descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.hasPlatformImplementations[ValueParameterDescriptorImpl]

'JPanel' @ [339:21] ==> public constructor JPanel(p0: (LayoutManager..LayoutManager?)) defined in javax.swing.JPanel[JavaClassConstructorDescriptor]

'GridBagLayout' @ [339:28] ==> public constructor GridBagLayout() defined in java.awt.GridBagLayout[JavaClassConstructorDescriptor]

'panel' @ [340:9] ==> val panel: JPanel defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.createOptionsPanel[LocalVariableDescriptor]

'add' @ [340:15] ==> public open fun add(p0: (Component..Component?), p1: (Any..Any?)): Unit defined in javax.swing.JPanel[JavaMethodDescriptor]

'createConfigureAnnotationsButton' @ [341:40] ==> public open fun createConfigureAnnotationsButton(): (JButton..JButton?) defined in com.intellij.codeInspection.ex.EntryPointsManagerImpl[JavaMethodDescriptor]

'GridBagConstraints' @ [342:17] ==> public constructor GridBagConstraints(p0: Int, p1: Int, p2: Int, p3: Int, p4: Double, p5: Double, p6: Int, p7: Int, p8: (Insets..Insets?), p9: Int, p10: Int) defined in java.awt.GridBagConstraints[JavaClassConstructorDescriptor]

'NORTHWEST' @ [342:77] ==> public const final val NORTHWEST: Int defined in java.awt.GridBagConstraints[JavaPropertyDescriptor]

'NONE' @ [342:107] ==> public const final val NONE: Int defined in java.awt.GridBagConstraints[JavaPropertyDescriptor]

'Insets' @ [342:113] ==> public constructor Insets(p0: Int, p1: Int, p2: Int, p3: Int) defined in java.awt.Insets[JavaClassConstructorDescriptor]

'panel' @ [344:16] ==> val panel: JPanel defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.createOptionsPanel[LocalVariableDescriptor]

'ArrayList' @ [348:20] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> LocalQuickFix

'list' @ [350:9] ==> val list: ArrayList<LocalQuickFix> defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.createQuickFixes[LocalVariableDescriptor]

'add' @ [350:14] ==> public open fun add(element: LocalQuickFix): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'SafeDeleteFix' @ [350:18] ==> public constructor SafeDeleteFix(declaration: KtDeclaration) defined in org.jetbrains.kotlin.idea.inspections.SafeDeleteFix[ClassConstructorDescriptorImpl]

'declaration' @ [350:32] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.createQuickFixes[ValueParameterDescriptorImpl]

'declaration' @ [352:33] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.createQuickFixes[ValueParameterDescriptorImpl]

'annotationEntries' @ [352:45] ==> public final val KtNamedDeclaration.annotationEntries: (MutableList<(KtAnnotationEntry..KtAnnotationEntry?)>..List<(KtAnnotationEntry..KtAnnotationEntry?)>)[MyPropertyDescriptor]

'annotationEntry' @ [353:31] ==> val annotationEntry: (KtAnnotationEntry..KtAnnotationEntry?) defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.createQuickFixes[LocalVariableDescriptor]

'typeReference' @ [353:47] ==> public final val KtAnnotationEntry.typeReference: KtTypeReference?[MyPropertyDescriptor]

'typeElement' @ [353:62] ==> public final val typeElement: KtTypeElement? defined in org.jetbrains.kotlin.psi.KtTypeReference[DeserializedPropertyDescriptor]

'typeElement' @ [354:26] ==> val typeElement: KtUserType defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.createQuickFixes[LocalVariableDescriptor]

'referenceExpression' @ [354:38] ==> public final val KtUserType.referenceExpression: KtSimpleNameExpression?[MyPropertyDescriptor]

'resolveMainReferenceToDescriptors' @ [354:59] ==> public fun KtElement.resolveMainReferenceToDescriptors(): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.references[DeserializedSimpleFunctionDescriptor]

'singleOrNull' @ [354:96] ==> public fun <T> Iterable<DeclarationDescriptor>.singleOrNull(): DeclarationDescriptor? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'target' @ [355:26] ==> val target: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.createQuickFixes[LocalVariableDescriptor]

'importableFqName' @ [355:33] ==> public val DeclarationDescriptor.importableFqName: FqName? defined in org.jetbrains.kotlin.idea.imports[DeserializedPropertyDescriptor]

'asString' @ [355:51] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'fqName' @ [358:17] ==> val fqName: String defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.createQuickFixes[LocalVariableDescriptor]

'startsWith' @ [358:24] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'fqName' @ [359:20] ==> val fqName: String defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.createQuickFixes[LocalVariableDescriptor]

'startsWith' @ [359:27] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'fqName' @ [360:20] ==> val fqName: String defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.createQuickFixes[LocalVariableDescriptor]

'startsWith' @ [360:27] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'fqName' @ [361:20] ==> val fqName: String defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.createQuickFixes[LocalVariableDescriptor]

'startsWith' @ [361:27] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'isJetbrainsAnnotation' @ [361:74] ==> @Deprecated public open fun isJetbrainsAnnotation(@NotNull p0: String): Boolean defined in com.intellij.codeInsight.AnnotationUtil[JavaMethodDescriptor]

'getShortName' @ [361:107] ==> @NotNull @Contract public open fun getShortName(@NotNull p0: String): String defined in com.intellij.openapi.util.text.StringUtil[JavaMethodDescriptor]

'fqName' @ [361:120] ==> val fqName: String defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.createQuickFixes[LocalVariableDescriptor]

'getInstance' @ [364:51] ==> public open fun getInstance(): (QuickFixFactory..QuickFixFactory?) defined in com.intellij.codeInsight.intention.QuickFixFactory[JavaMethodDescriptor]

'createAddToDependencyInjectionAnnotationsFix' @ [364:65] ==> @NotNull public abstract fun createAddToDependencyInjectionAnnotationsFix(@NotNull p0: Project, @NotNull p1: String, @NotNull p2: String): IntentionAction defined in com.intellij.codeInsight.intention.QuickFixFactory[JavaMethodDescriptor]

'declaration' @ [364:110] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.createQuickFixes[ValueParameterDescriptorImpl]

'project' @ [364:122] ==> public final val KtNamedDeclaration.project: Project[MyPropertyDescriptor]

'fqName' @ [364:131] ==> val fqName: String defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.createQuickFixes[LocalVariableDescriptor]

'list' @ [365:13] ==> val list: ArrayList<LocalQuickFix> defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.createQuickFixes[LocalVariableDescriptor]

'add' @ [365:18] ==> public open fun add(element: LocalQuickFix): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'IntentionWrapper' @ [365:22] ==> public constructor IntentionWrapper(@NotNull p0: IntentionAction, @NotNull p1: PsiFile) defined in com.intellij.codeInspection.IntentionWrapper[JavaClassConstructorDescriptor]

'intentionAction' @ [365:39] ==> val intentionAction: IntentionAction defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.createQuickFixes[LocalVariableDescriptor]

'declaration' @ [365:56] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.createQuickFixes[ValueParameterDescriptorImpl]

'containingFile' @ [365:68] ==> public final val KtNamedDeclaration.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'list' @ [368:16] ==> val list: ArrayList<LocalQuickFix> defined in org.jetbrains.kotlin.idea.inspections.UnusedSymbolInspection.createQuickFixes[LocalVariableDescriptor]

'if (declaration is KtConstructor<*>) "Safe delete constructor"
            else QuickFixBundle.message("safe.delete.text", declaration.name)' @ [374:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'declaration' @ [374:17] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.inspections.SafeDeleteFix.<init>[ValueParameterDescriptorImpl]

'message' @ [375:33] ==> public open fun message(@NotNull @NonNls @PropertyKey p0: String, @NotNull vararg p1: (Any..Any?)): (String..String?) defined in com.intellij.codeInsight.daemon.QuickFixBundle[JavaMethodDescriptor]

'declaration' @ [375:61] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.inspections.SafeDeleteFix.<init>[ValueParameterDescriptorImpl]

'name' @ [375:73] ==> public final val KtDeclaration.name: String?[MyPropertyDescriptor]

'name' @ [377:30] ==> private final val name: String defined in org.jetbrains.kotlin.idea.inspections.SafeDeleteFix[PropertyDescriptorImpl]

'descriptor' @ [384:27] ==> value-parameter descriptor: ProblemDescriptor defined in org.jetbrains.kotlin.idea.inspections.SafeDeleteFix.applyFix[ValueParameterDescriptorImpl]

'psiElement' @ [384:38] ==> public final val ProblemDescriptor.psiElement: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'getStrictParentOfType' @ [384:49] ==> public inline fun <reified T : PsiElement> PsiElement.getStrictParentOfType(): KtDeclaration? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtDeclaration

'!' @ [385:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'getInstance' @ [385:38] ==> public open fun getInstance(): (FileModificationService..FileModificationService?) defined in com.intellij.codeInsight.FileModificationService[JavaMethodDescriptor]

'prepareFileForWrite' @ [385:52] ==> public abstract fun prepareFileForWrite(@Nullable p0: PsiFile?): Boolean defined in com.intellij.codeInsight.FileModificationService[JavaMethodDescriptor]

'declaration' @ [385:72] ==> val declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.inspections.SafeDeleteFix.applyFix[LocalVariableDescriptor]

'containingFile' @ [385:84] ==> public final val KtDeclaration.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'getApplication' @ [386:28] ==> public open fun getApplication(): (Application..Application?) defined in com.intellij.openapi.application.ApplicationManager[JavaMethodDescriptor]

'invokeLater' @ [386:45] ==> public final fun invokeLater(@NotNull p0: () -> Unit, @NotNull p1: ModalityState): Unit defined in com.intellij.openapi.application.Application[MyFunctionDescriptor]

'invoke' @ [387:37] ==> public open fun invoke(p0: (Project..Project?), p1: (Array<(PsiElement..PsiElement?)>..Array<out (PsiElement..PsiElement?)>?), p2: Boolean): Unit defined in com.intellij.refactoring.safeDelete.SafeDeleteHandler[JavaMethodDescriptor]

'project' @ [387:44] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.inspections.SafeDeleteFix.applyFix[ValueParameterDescriptorImpl]

'arrayOf' @ [387:53] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: KtDeclaration): Array<KtDeclaration> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> KtDeclaration

'declaration' @ [387:61] ==> val declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.inspections.SafeDeleteFix.applyFix[LocalVariableDescriptor]

'NON_MODAL' @ [388:31] ==> @NotNull public final val NON_MODAL: ModalityState defined in com.intellij.openapi.application.ModalityState[JavaPropertyDescriptor]

