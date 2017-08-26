'getValue' @ [34:33] ==> @InlineOnly public operator inline fun <T> Lazy<T>.getValue(thisRef: Any?, property: KProperty<*>): T defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'JavaFindUsagesProvider' @ [34:40] ==> public constructor JavaFindUsagesProvider() defined in com.intellij.lang.java.JavaFindUsagesProvider[JavaClassConstructorDescriptor]

'psiElement' @ [37:13] ==> value-parameter psiElement: PsiElement defined in org.jetbrains.kotlin.idea.findUsages.KotlinFindUsagesProvider.canFindUsagesFor[ValueParameterDescriptorImpl]

'when(element) {
            is KtNamedFunction -> "function"
            is KtClass -> "class"
            is KtParameter -> "parameter"
            is KtProperty -> if (element.isLocal) "variable" else "property"
            is KtDestructuringDeclarationEntry -> "variable"
            is KtTypeParameter -> "type parameter"
            is KtSecondaryConstructor -> "constructor"
            is KtObjectDeclaration -> "object"
            else -> ""
        }' @ [44:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String, entry1: String, entry2: String, entry3: String, entry4: String, entry5: String, entry6: String, entry7: String, entry8: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String

'element' @ [44:21] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.findUsages.KotlinFindUsagesProvider.getType[ValueParameterDescriptorImpl]

'if (element.isLocal) "variable" else "property"' @ [48:30] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'element' @ [48:34] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.findUsages.KotlinFindUsagesProvider.getType[ValueParameterDescriptorImpl]

'isLocal' @ [48:42] ==> public final val KtProperty.isLocal: Boolean[MyPropertyDescriptor]

'containingClassOrObject' @ [59:13] ==> public val KtDeclaration.containingClassOrObject: KtClassOrObject? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'let' @ [59:38] ==> @InlineOnly public inline fun <T, R> KtClassOrObject.let(block: (KtClassOrObject) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtClassOrObject
    <R> -> Nothing

'getDescriptiveName' @ [59:51] ==> public open fun getDescriptiveName(element: PsiElement): String defined in org.jetbrains.kotlin.idea.findUsages.KotlinFindUsagesProvider[SimpleFunctionDescriptorImpl]

'it' @ [59:70] ==> value-parameter it: KtClassOrObject defined in org.jetbrains.kotlin.idea.findUsages.KotlinFindUsagesProvider.<get-containerDescription>.<anonymous>[ValueParameterDescriptorImpl]

'parent' @ [60:14] ==> public final val KtDeclaration.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'parent' @ [60:34] ==> public final val KtFile.parent: PsiDirectory?[MyPropertyDescriptor]

'let' @ [60:42] ==> @InlineOnly public inline fun <T, R> PsiDirectory.let(block: (PsiDirectory) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiDirectory
    <R> -> Nothing

'getDescriptiveName' @ [60:55] ==> public open fun getDescriptiveName(element: PsiElement): String defined in org.jetbrains.kotlin.idea.findUsages.KotlinFindUsagesProvider[SimpleFunctionDescriptorImpl]

'it' @ [60:74] ==> value-parameter it: PsiDirectory defined in org.jetbrains.kotlin.idea.findUsages.KotlinFindUsagesProvider.<get-containerDescription>.<anonymous>[ValueParameterDescriptorImpl]

'when (element) {
            is PsiDirectory, is PsiPackage, is PsiFile -> javaProvider.getDescriptiveName(element)
            is KtClassOrObject -> {
                if (element is KtObjectDeclaration && element.isObjectLiteral()) return "<unnamed>"
                element.fqName?.asString() ?: element.name ?: "<unnamed>"
            }
            is KtProperty -> (element.name ?: "") + (element.containerDescription?.let { " of $it" } ?: "")
            is KtFunction -> {
                val name = element.name ?: ""
                val descriptor = element.resolveToDescriptor() as FunctionDescriptor
                val renderer = IdeDescriptorRenderers.SOURCE_CODE_SHORT_NAMES_IN_TYPES
                val paramsDescription = descriptor.valueParameters.joinToString(prefix = "(", postfix = ")") { renderer.renderType(it.type) }
                val returnType = descriptor.returnType
                val returnTypeDescription = if (returnType != null && !returnType.isUnit()) renderer.renderType(returnType) else null
                val funDescription = "$name$paramsDescription" + (returnTypeDescription?.let { ": $it" } ?: "")
                return funDescription + (element.containerDescription?.let { " of $it" } ?: "")
            }
            is KtLabeledExpression -> element.getLabelName() ?: ""
            is KtImportAlias -> element.getName() ?: ""
            is KtLightElement<*, *> -> element.kotlinOrigin?.let { getDescriptiveName(it) } ?: ""
            else -> ""
        }' @ [65:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String, entry1: String, entry2: String, entry3: String, entry4: String, entry5: String, entry6: String, entry7: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String

'element' @ [65:22] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.findUsages.KotlinFindUsagesProvider.getDescriptiveName[ValueParameterDescriptorImpl]

'javaProvider' @ [66:59] ==> private final val javaProvider: JavaFindUsagesProvider defined in org.jetbrains.kotlin.idea.findUsages.KotlinFindUsagesProvider[PropertyDescriptorImpl]

'getDescriptiveName' @ [66:72] ==> @NotNull public open fun getDescriptiveName(@NotNull p0: PsiElement): String defined in com.intellij.lang.java.JavaFindUsagesProvider[JavaMethodDescriptor]

'element' @ [66:91] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.findUsages.KotlinFindUsagesProvider.getDescriptiveName[ValueParameterDescriptorImpl]

'element' @ [68:21] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.findUsages.KotlinFindUsagesProvider.getDescriptiveName[ValueParameterDescriptorImpl]

'element' @ [68:55] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.findUsages.KotlinFindUsagesProvider.getDescriptiveName[ValueParameterDescriptorImpl]

'isObjectLiteral' @ [68:63] ==> public final fun isObjectLiteral(): Boolean defined in org.jetbrains.kotlin.psi.KtObjectDeclaration[DeserializedSimpleFunctionDescriptor]

'element' @ [69:17] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.findUsages.KotlinFindUsagesProvider.getDescriptiveName[ValueParameterDescriptorImpl]

'fqName' @ [69:25] ==> public final val KtClassOrObject.fqName: FqName?[MyPropertyDescriptor]

'asString' @ [69:33] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'element' @ [69:47] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.findUsages.KotlinFindUsagesProvider.getDescriptiveName[ValueParameterDescriptorImpl]

'name' @ [69:55] ==> public final val KtClassOrObject.name: String?[MyPropertyDescriptor]

'+' @ [71:30] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'element' @ [71:31] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.findUsages.KotlinFindUsagesProvider.getDescriptiveName[ValueParameterDescriptorImpl]

'name' @ [71:39] ==> public final val KtProperty.name: String?[MyPropertyDescriptor]

'element' @ [71:54] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.findUsages.KotlinFindUsagesProvider.getDescriptiveName[ValueParameterDescriptorImpl]

'containerDescription' @ [71:62] ==> private final val KtDeclaration.containerDescription: String? defined in org.jetbrains.kotlin.idea.findUsages.KotlinFindUsagesProvider[PropertyDescriptorImpl]

'let' @ [71:84] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> String): String defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> String

'it' @ [71:96] ==> value-parameter it: String defined in org.jetbrains.kotlin.idea.findUsages.KotlinFindUsagesProvider.getDescriptiveName.<anonymous>[ValueParameterDescriptorImpl]

'element' @ [73:28] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.findUsages.KotlinFindUsagesProvider.getDescriptiveName[ValueParameterDescriptorImpl]

'name' @ [73:36] ==> public final val KtFunction.name: String?[MyPropertyDescriptor]

'element' @ [74:34] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.findUsages.KotlinFindUsagesProvider.getDescriptiveName[ValueParameterDescriptorImpl]

'resolveToDescriptor' @ [74:42] ==> public fun KtDeclaration.resolveToDescriptor(bodyResolveMode: BodyResolveMode = ...): DeclarationDescriptor defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'IdeDescriptorRenderers' @ [75:32] ==> public object IdeDescriptorRenderers defined in org.jetbrains.kotlin.idea.util[FakeCallableDescriptorForObject]

'SOURCE_CODE_SHORT_NAMES_IN_TYPES' @ [75:55] ==> @field:JvmField public final val SOURCE_CODE_SHORT_NAMES_IN_TYPES: DescriptorRenderer defined in org.jetbrains.kotlin.idea.util.IdeDescriptorRenderers[DeserializedPropertyDescriptor]

'descriptor' @ [76:41] ==> val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.findUsages.KotlinFindUsagesProvider.getDescriptiveName[LocalVariableDescriptor]

'valueParameters' @ [76:52] ==> public final val FunctionDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'joinToString' @ [76:68] ==> public fun <T> Iterable<(ValueParameterDescriptor..ValueParameterDescriptor?)>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: (((ValueParameterDescriptor..ValueParameterDescriptor?)) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)

'renderer' @ [76:112] ==> val renderer: DescriptorRenderer defined in org.jetbrains.kotlin.idea.findUsages.KotlinFindUsagesProvider.getDescriptiveName[LocalVariableDescriptor]

'renderType' @ [76:121] ==> public abstract fun renderType(type: KotlinType): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'it' @ [76:132] ==> value-parameter it: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.idea.findUsages.KotlinFindUsagesProvider.getDescriptiveName.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [76:135] ==> public final val ValueParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'descriptor' @ [77:34] ==> val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.findUsages.KotlinFindUsagesProvider.getDescriptiveName[LocalVariableDescriptor]

'returnType' @ [77:45] ==> public final val FunctionDescriptor.returnType: KotlinType?[MyPropertyDescriptor]

'if (returnType != null && !returnType.isUnit()) renderer.renderType(returnType) else null' @ [78:45] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String?, elseBranch: String?): String?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String?

'returnType' @ [78:49] ==> val returnType: KotlinType? defined in org.jetbrains.kotlin.idea.findUsages.KotlinFindUsagesProvider.getDescriptiveName[LocalVariableDescriptor]

'!' @ [78:71] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'returnType' @ [78:72] ==> val returnType: KotlinType? defined in org.jetbrains.kotlin.idea.findUsages.KotlinFindUsagesProvider.getDescriptiveName[LocalVariableDescriptor]

'isUnit' @ [78:83] ==> public fun KotlinType.isUnit(): Boolean defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'renderer' @ [78:93] ==> val renderer: DescriptorRenderer defined in org.jetbrains.kotlin.idea.findUsages.KotlinFindUsagesProvider.getDescriptiveName[LocalVariableDescriptor]

'renderType' @ [78:102] ==> public abstract fun renderType(type: KotlinType): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'returnType' @ [78:113] ==> val returnType: KotlinType? defined in org.jetbrains.kotlin.idea.findUsages.KotlinFindUsagesProvider.getDescriptiveName[LocalVariableDescriptor]

'+' @ [79:38] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'name' @ [79:40] ==> val name: String defined in org.jetbrains.kotlin.idea.findUsages.KotlinFindUsagesProvider.getDescriptiveName[LocalVariableDescriptor]

'paramsDescription' @ [79:45] ==> val paramsDescription: String defined in org.jetbrains.kotlin.idea.findUsages.KotlinFindUsagesProvider.getDescriptiveName[LocalVariableDescriptor]

'returnTypeDescription' @ [79:67] ==> val returnTypeDescription: String? defined in org.jetbrains.kotlin.idea.findUsages.KotlinFindUsagesProvider.getDescriptiveName[LocalVariableDescriptor]

'let' @ [79:90] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> String): String defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> String

'it' @ [79:100] ==> value-parameter it: String defined in org.jetbrains.kotlin.idea.findUsages.KotlinFindUsagesProvider.getDescriptiveName.<anonymous>[ValueParameterDescriptorImpl]

'funDescription' @ [80:24] ==> val funDescription: String defined in org.jetbrains.kotlin.idea.findUsages.KotlinFindUsagesProvider.getDescriptiveName[LocalVariableDescriptor]

'element' @ [80:42] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.findUsages.KotlinFindUsagesProvider.getDescriptiveName[ValueParameterDescriptorImpl]

'containerDescription' @ [80:50] ==> private final val KtDeclaration.containerDescription: String? defined in org.jetbrains.kotlin.idea.findUsages.KotlinFindUsagesProvider[PropertyDescriptorImpl]

'let' @ [80:72] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> String): String defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> String

'it' @ [80:84] ==> value-parameter it: String defined in org.jetbrains.kotlin.idea.findUsages.KotlinFindUsagesProvider.getDescriptiveName.<anonymous>[ValueParameterDescriptorImpl]

'element' @ [82:39] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.findUsages.KotlinFindUsagesProvider.getDescriptiveName[ValueParameterDescriptorImpl]

'getLabelName' @ [82:47] ==> public final fun getLabelName(): String? defined in org.jetbrains.kotlin.psi.KtLabeledExpression[DeserializedSimpleFunctionDescriptor]

'element' @ [83:33] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.findUsages.KotlinFindUsagesProvider.getDescriptiveName[ValueParameterDescriptorImpl]

'getName' @ [83:41] ==> public open fun getName(): String? defined in org.jetbrains.kotlin.psi.KtImportAlias[DeserializedSimpleFunctionDescriptor]

'element' @ [84:40] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.findUsages.KotlinFindUsagesProvider.getDescriptiveName[ValueParameterDescriptorImpl]

'kotlinOrigin' @ [84:48] ==> public abstract val kotlinOrigin: KtElement? defined in org.jetbrains.kotlin.asJava.elements.KtLightElement[DeserializedPropertyDescriptor]

'let' @ [84:62] ==> @InlineOnly public inline fun <T, R> KtElement.let(block: (KtElement) -> String): String defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtElement
    <R> -> String

'getDescriptiveName' @ [84:68] ==> public open fun getDescriptiveName(element: PsiElement): String defined in org.jetbrains.kotlin.idea.findUsages.KotlinFindUsagesProvider[SimpleFunctionDescriptorImpl]

'it' @ [84:87] ==> value-parameter it: KtElement defined in org.jetbrains.kotlin.idea.findUsages.KotlinFindUsagesProvider.getDescriptiveName.<anonymous>[ValueParameterDescriptorImpl]

'getDescriptiveName' @ [90:13] ==> public open fun getDescriptiveName(element: PsiElement): String defined in org.jetbrains.kotlin.idea.findUsages.KotlinFindUsagesProvider[SimpleFunctionDescriptorImpl]

'element' @ [90:32] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.findUsages.KotlinFindUsagesProvider.getNodeText[ValueParameterDescriptorImpl]

