'groovyScript' @ [36:24] ==> private final val groovyScript: GroovyFile defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator[PropertyDescriptorImpl]

'text' @ [36:37] ==> public final val GroovyFile.text: (String..String?)[MyPropertyDescriptor]

'containsDirective' @ [37:16] ==> private final fun containsDirective(fileText: String, directive: String): Boolean defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator[SimpleFunctionDescriptorImpl]

'fileText' @ [37:34] ==> val fileText: (String..String?) defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator.isConfigured[LocalVariableDescriptor]

'getApplyPluginDirective' @ [37:44] ==> private final fun getApplyPluginDirective(pluginName: String): String defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator[SimpleFunctionDescriptorImpl]

'kotlinPluginName' @ [37:68] ==> value-parameter kotlinPluginName: String defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator.isConfigured[ValueParameterDescriptorImpl]

'fileText' @ [38:16] ==> val fileText: (String..String?) defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator.isConfigured[LocalVariableDescriptor]

'contains' @ [38:25] ==> public operator fun CharSequence.contains(other: CharSequence, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'fileText' @ [39:16] ==> val fileText: (String..String?) defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator.isConfigured[LocalVariableDescriptor]

'contains' @ [39:25] ==> public operator fun CharSequence.contains(other: CharSequence, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'groovyScript' @ [48:23] ==> private final val groovyScript: GroovyFile defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator[PropertyDescriptorImpl]

'text' @ [48:36] ==> public final val GroovyFile.text: (String..String?)[MyPropertyDescriptor]

'getGroovyApplyPluginDirective' @ [49:36] ==> private final fun getGroovyApplyPluginDirective(pluginName: String): String defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator[SimpleFunctionDescriptorImpl]

'kotlinPluginName' @ [49:66] ==> value-parameter kotlinPluginName: String defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator.configureModuleBuildScript[ValueParameterDescriptorImpl]

'!' @ [50:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'containsDirective' @ [50:14] ==> private final fun containsDirective(fileText: String, directive: String): Boolean defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator[SimpleFunctionDescriptorImpl]

'groovyScript' @ [50:32] ==> private final val groovyScript: GroovyFile defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator[PropertyDescriptorImpl]

'text' @ [50:45] ==> public final val GroovyFile.text: (String..String?)[MyPropertyDescriptor]

'applyPluginDirective' @ [50:51] ==> val applyPluginDirective: String defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator.configureModuleBuildScript[LocalVariableDescriptor]

'getInstance' @ [51:49] ==> @NotNull public open fun getInstance(@NotNull p0: Project): GroovyPsiElementFactory defined in org.jetbrains.plugins.groovy.lang.psi.GroovyPsiElementFactory[JavaMethodDescriptor]

'groovyScript' @ [51:61] ==> private final val groovyScript: GroovyFile defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator[PropertyDescriptorImpl]

'project' @ [51:74] ==> public final val GroovyFile.project: Project[MyPropertyDescriptor]

'createExpressionFromText' @ [51:83] ==> @NotNull public open fun createExpressionFromText(@NotNull p0: CharSequence): GrExpression defined in org.jetbrains.plugins.groovy.lang.psi.GroovyPsiElementFactory[JavaMethodDescriptor]

'applyPluginDirective' @ [51:108] ==> val applyPluginDirective: String defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator.configureModuleBuildScript[LocalVariableDescriptor]

'getApplyStatement' @ [52:34] ==> private final fun getApplyStatement(file: GroovyFile): GrApplicationStatement? defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator[SimpleFunctionDescriptorImpl]

'groovyScript' @ [52:52] ==> private final val groovyScript: GroovyFile defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator[PropertyDescriptorImpl]

'if (applyStatement != null) {
                groovyScript.addAfter(apply, applyStatement)
            }
            else {
                val buildScriptBlock = groovyScript.getBlockByName("buildscript")
                if (buildScriptBlock != null) {
                    groovyScript.addAfter(apply, buildScriptBlock.parent)
                }
                else {
                    groovyScript.addAfter(apply, groovyScript.statements.lastOrNull() ?: groovyScript.firstChild)
                }
            }' @ [53:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (PsiElement..PsiElement?), elseBranch: (PsiElement..PsiElement?)): (PsiElement..PsiElement?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'applyStatement' @ [53:17] ==> val applyStatement: GrApplicationStatement? defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator.configureModuleBuildScript[LocalVariableDescriptor]

'groovyScript' @ [54:17] ==> private final val groovyScript: GroovyFile defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator[PropertyDescriptorImpl]

'addAfter' @ [54:30] ==> public abstract fun addAfter(@NotNull p0: PsiElement, @Nullable p1: PsiElement?): (PsiElement..PsiElement?) defined in org.jetbrains.plugins.groovy.lang.psi.GroovyFile[JavaMethodDescriptor]

'apply' @ [54:39] ==> val apply: GrExpression defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator.configureModuleBuildScript[LocalVariableDescriptor]

'applyStatement' @ [54:46] ==> val applyStatement: GrApplicationStatement? defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator.configureModuleBuildScript[LocalVariableDescriptor]

'groovyScript' @ [57:40] ==> private final val groovyScript: GroovyFile defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator[PropertyDescriptorImpl]

'getBlockByName' @ [57:53] ==> private final fun PsiElement.getBlockByName(name: String): GrClosableBlock? defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator[SimpleFunctionDescriptorImpl]

'if (buildScriptBlock != null) {
                    groovyScript.addAfter(apply, buildScriptBlock.parent)
                }
                else {
                    groovyScript.addAfter(apply, groovyScript.statements.lastOrNull() ?: groovyScript.firstChild)
                }' @ [58:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (PsiElement..PsiElement?), elseBranch: (PsiElement..PsiElement?)): (PsiElement..PsiElement?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'buildScriptBlock' @ [58:21] ==> val buildScriptBlock: GrClosableBlock? defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator.configureModuleBuildScript[LocalVariableDescriptor]

'groovyScript' @ [59:21] ==> private final val groovyScript: GroovyFile defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator[PropertyDescriptorImpl]

'addAfter' @ [59:34] ==> public abstract fun addAfter(@NotNull p0: PsiElement, @Nullable p1: PsiElement?): (PsiElement..PsiElement?) defined in org.jetbrains.plugins.groovy.lang.psi.GroovyFile[JavaMethodDescriptor]

'apply' @ [59:43] ==> val apply: GrExpression defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator.configureModuleBuildScript[LocalVariableDescriptor]

'buildScriptBlock' @ [59:50] ==> val buildScriptBlock: GrClosableBlock? defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator.configureModuleBuildScript[LocalVariableDescriptor]

'parent' @ [59:67] ==> public final val GrClosableBlock.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'groovyScript' @ [62:21] ==> private final val groovyScript: GroovyFile defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator[PropertyDescriptorImpl]

'addAfter' @ [62:34] ==> public abstract fun addAfter(@NotNull p0: PsiElement, @Nullable p1: PsiElement?): (PsiElement..PsiElement?) defined in org.jetbrains.plugins.groovy.lang.psi.GroovyFile[JavaMethodDescriptor]

'apply' @ [62:43] ==> val apply: GrExpression defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator.configureModuleBuildScript[LocalVariableDescriptor]

'groovyScript' @ [62:50] ==> private final val groovyScript: GroovyFile defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator[PropertyDescriptorImpl]

'statements' @ [62:63] ==> public final val GroovyFile.statements: (Array<(GrStatement..GrStatement?)>..Array<out (GrStatement..GrStatement?)>)[MyPropertyDescriptor]

'lastOrNull' @ [62:74] ==> public fun <T> Array<out (GrStatement..GrStatement?)>.lastOrNull(): GrStatement? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.plugins.groovy.lang.psi.api.statements.GrStatement..org.jetbrains.plugins.groovy.lang.psi.api.statements.GrStatement?)

'groovyScript' @ [62:90] ==> private final val groovyScript: GroovyFile defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator[PropertyDescriptorImpl]

'firstChild' @ [62:103] ==> public final val GroovyFile.firstChild: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'groovyScript' @ [67:9] ==> private final val groovyScript: GroovyFile defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator[PropertyDescriptorImpl]

'getRepositoriesBlock' @ [67:22] ==> private final fun GrStatementOwner.getRepositoriesBlock(): GrClosableBlock defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator[SimpleFunctionDescriptorImpl]

'apply' @ [67:45] ==> @InlineOnly public inline fun <T> GrClosableBlock.apply(block: GrClosableBlock.() -> Unit): GrClosableBlock defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> GrClosableBlock

'addRepository' @ [68:13] ==> private final fun GrClosableBlock.addRepository(version: String): Boolean defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator[SimpleFunctionDescriptorImpl]

'version' @ [68:27] ==> value-parameter version: String defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator.configureModuleBuildScript[ValueParameterDescriptorImpl]

'groovyScript' @ [71:9] ==> private final val groovyScript: GroovyFile defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator[PropertyDescriptorImpl]

'getDependenciesBlock' @ [71:22] ==> private final fun GrStatementOwner.getDependenciesBlock(): GrClosableBlock defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator[SimpleFunctionDescriptorImpl]

'apply' @ [71:45] ==> @InlineOnly public inline fun <T> GrClosableBlock.apply(block: GrClosableBlock.() -> Unit): GrClosableBlock defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> GrClosableBlock

'addExpressionInBlockIfNeeded' @ [72:13] ==> private final fun GrClosableBlock.addExpressionInBlockIfNeeded(expressionText: String, isFirst: Boolean): Boolean defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator[SimpleFunctionDescriptorImpl]

'getGroovyDependencySnippet' @ [72:42] ==> private final fun getGroovyDependencySnippet(artifactName: String): String defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator[SimpleFunctionDescriptorImpl]

'stdlibArtifactName' @ [72:69] ==> value-parameter stdlibArtifactName: String defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator.configureModuleBuildScript[ValueParameterDescriptorImpl]

'jvmTarget' @ [75:13] ==> value-parameter jvmTarget: String? defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator.configureModuleBuildScript[ValueParameterDescriptorImpl]

'changeKotlinTaskParameter' @ [76:13] ==> private final fun changeKotlinTaskParameter(gradleFile: GroovyFile, parameterName: String, parameterValue: String, forTests: Boolean): PsiElement? defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator[SimpleFunctionDescriptorImpl]

'groovyScript' @ [76:39] ==> private final val groovyScript: GroovyFile defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator[PropertyDescriptorImpl]

'jvmTarget' @ [76:66] ==> value-parameter jvmTarget: String? defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator.configureModuleBuildScript[ValueParameterDescriptorImpl]

'changeKotlinTaskParameter' @ [77:13] ==> private final fun changeKotlinTaskParameter(gradleFile: GroovyFile, parameterName: String, parameterValue: String, forTests: Boolean): PsiElement? defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator[SimpleFunctionDescriptorImpl]

'groovyScript' @ [77:39] ==> private final val groovyScript: GroovyFile defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator[PropertyDescriptorImpl]

'jvmTarget' @ [77:66] ==> value-parameter jvmTarget: String? defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator.configureModuleBuildScript[ValueParameterDescriptorImpl]

'groovyScript' @ [80:16] ==> private final val groovyScript: GroovyFile defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator[PropertyDescriptorImpl]

'text' @ [80:29] ==> public final val GroovyFile.text: (String..String?)[MyPropertyDescriptor]

'oldText' @ [80:37] ==> val oldText: (String..String?) defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator.configureModuleBuildScript[LocalVariableDescriptor]

'groovyScript' @ [84:23] ==> private final val groovyScript: GroovyFile defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator[PropertyDescriptorImpl]

'text' @ [84:36] ==> public final val GroovyFile.text: (String..String?)[MyPropertyDescriptor]

'groovyScript' @ [85:9] ==> private final val groovyScript: GroovyFile defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator[PropertyDescriptorImpl]

'apply' @ [85:22] ==> @InlineOnly public inline fun <T> GroovyFile.apply(block: GroovyFile.() -> Unit): GroovyFile defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> GroovyFile

'getBuildScriptBlock' @ [86:13] ==> private final fun GrStatementOwner.getBuildScriptBlock(): GrClosableBlock defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator[SimpleFunctionDescriptorImpl]

'apply' @ [86:35] ==> @InlineOnly public inline fun <T> GrClosableBlock.apply(block: GrClosableBlock.() -> Unit): GrClosableBlock defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> GrClosableBlock

'addFirstExpressionInBlockIfNeeded' @ [87:17] ==> private final fun GrClosableBlock.addFirstExpressionInBlockIfNeeded(expressionText: String): Boolean defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator[SimpleFunctionDescriptorImpl]

'VERSION' @ [87:51] ==> private final val VERSION: String defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator.Companion[PropertyDescriptorImpl]

'replace' @ [87:59] ==> public fun String.replace(oldValue: String, newValue: String, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'VERSION_TEMPLATE' @ [87:67] ==> private final val VERSION_TEMPLATE: String defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator.Companion[PropertyDescriptorImpl]

'version' @ [87:85] ==> value-parameter version: String defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator.configureProjectBuildScript[ValueParameterDescriptorImpl]

'getBuildScriptRepositoriesBlock' @ [90:13] ==> private final fun GrStatementOwner.getBuildScriptRepositoriesBlock(): GrClosableBlock defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator[SimpleFunctionDescriptorImpl]

'apply' @ [90:47] ==> @InlineOnly public inline fun <T> GrClosableBlock.apply(block: GrClosableBlock.() -> Unit): GrClosableBlock defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> GrClosableBlock

'addRepository' @ [91:17] ==> private final fun GrClosableBlock.addRepository(version: String): Boolean defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator[SimpleFunctionDescriptorImpl]

'version' @ [91:31] ==> value-parameter version: String defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator.configureProjectBuildScript[ValueParameterDescriptorImpl]

'getBuildScriptDependenciesBlock' @ [94:13] ==> private final fun GrStatementOwner.getBuildScriptDependenciesBlock(): GrClosableBlock defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator[SimpleFunctionDescriptorImpl]

'apply' @ [94:47] ==> @InlineOnly public inline fun <T> GrClosableBlock.apply(block: GrClosableBlock.() -> Unit): GrClosableBlock defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> GrClosableBlock

'addLastExpressionInBlockIfNeeded' @ [95:17] ==> private final fun GrClosableBlock.addLastExpressionInBlockIfNeeded(expressionText: String): Boolean defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator[SimpleFunctionDescriptorImpl]

'CLASSPATH' @ [95:50] ==> private final val CLASSPATH: String defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator.Companion[PropertyDescriptorImpl]

'oldText' @ [99:16] ==> val oldText: (String..String?) defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator.configureProjectBuildScript[LocalVariableDescriptor]

'groovyScript' @ [99:27] ==> private final val groovyScript: GroovyFile defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator[PropertyDescriptorImpl]

'text' @ [99:40] ==> public final val GroovyFile.text: (String..String?)[MyPropertyDescriptor]

'coroutineOption' @ [103:38] ==> value-parameter coroutineOption: String defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator.changeCoroutineConfiguration[ValueParameterDescriptorImpl]

'groovyScript' @ [104:27] ==> private final val groovyScript: GroovyFile defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator[PropertyDescriptorImpl]

'getBlockOrCreate' @ [104:40] ==> private final fun GrStatementOwner.getBlockOrCreate(name: String): GrClosableBlock defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator[SimpleFunctionDescriptorImpl]

'kotlinBlock' @ [105:9] ==> val kotlinBlock: GrClosableBlock defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator.changeCoroutineConfiguration[LocalVariableDescriptor]

'getBlockOrCreate' @ [105:21] ==> private final fun GrStatementOwner.getBlockOrCreate(name: String): GrClosableBlock defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator[SimpleFunctionDescriptorImpl]

'apply' @ [105:54] ==> @InlineOnly public inline fun <T> GrClosableBlock.apply(block: GrClosableBlock.() -> Unit): GrClosableBlock defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> GrClosableBlock

'addOrReplaceExpression' @ [106:13] ==> private final fun GrClosableBlock.addOrReplaceExpression(snippet: String, predicate: (GrStatement) -> Boolean): Unit defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator[SimpleFunctionDescriptorImpl]

'snippet' @ [106:36] ==> val snippet: String defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator.changeCoroutineConfiguration[LocalVariableDescriptor]

'==' @ [107:17] ==> public open fun equals(other: Any?): Boolean defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'stmt' @ [107:18] ==> value-parameter stmt: GrStatement defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator.changeCoroutineConfiguration.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'invokedExpression' @ [107:42] ==> public final val GrMethodCall.invokedExpression: GrExpression[MyPropertyDescriptor]

'text' @ [107:61] ==> public final val GrExpression.text: (String..String?)[MyPropertyDescriptor]

'kotlinBlock' @ [111:16] ==> val kotlinBlock: GrClosableBlock defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator.changeCoroutineConfiguration[LocalVariableDescriptor]

'parent' @ [111:28] ==> public final val GrClosableBlock.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'changeKotlinTaskParameter' @ [115:13] ==> private final fun changeKotlinTaskParameter(gradleFile: GroovyFile, parameterName: String, parameterValue: String, forTests: Boolean): PsiElement? defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator[SimpleFunctionDescriptorImpl]

'groovyScript' @ [115:39] ==> private final val groovyScript: GroovyFile defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator[PropertyDescriptorImpl]

'version' @ [115:72] ==> value-parameter version: String defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator.changeLanguageVersion[ValueParameterDescriptorImpl]

'forTests' @ [115:81] ==> value-parameter forTests: Boolean defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator.changeLanguageVersion[ValueParameterDescriptorImpl]

'changeKotlinTaskParameter' @ [118:13] ==> private final fun changeKotlinTaskParameter(gradleFile: GroovyFile, parameterName: String, parameterValue: String, forTests: Boolean): PsiElement? defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator[SimpleFunctionDescriptorImpl]

'groovyScript' @ [118:39] ==> private final val groovyScript: GroovyFile defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator[PropertyDescriptorImpl]

'version' @ [118:67] ==> value-parameter version: String defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator.changeApiVersion[ValueParameterDescriptorImpl]

'forTests' @ [118:76] ==> value-parameter forTests: Boolean defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator.changeApiVersion[ValueParameterDescriptorImpl]

'String' @ [125:32] ==> public companion object defined in kotlin.String[FakeCallableDescriptorForObject]

'format' @ [125:39] ==> @InlineOnly public inline fun String.Companion.format(format: String, vararg args: Any?): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'scope' @ [127:17] ==> value-parameter scope: DependencyScope defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator.addKotlinLibraryToModuleBuildScript[ValueParameterDescriptorImpl]

'toGradleCompileScope' @ [127:23] ==> public fun DependencyScope.toGradleCompileScope(isAndroidModule: Boolean): String defined in org.jetbrains.kotlin.idea.configuration[SimpleFunctionDescriptorImpl]

'isAndroidModule' @ [127:44] ==> value-parameter isAndroidModule: Boolean defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator.addKotlinLibraryToModuleBuildScript[ValueParameterDescriptorImpl]

'libraryDescriptor' @ [128:17] ==> value-parameter libraryDescriptor: ExternalLibraryDescriptor defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator.addKotlinLibraryToModuleBuildScript[ValueParameterDescriptorImpl]

'libraryGroupId' @ [128:35] ==> public final val ExternalLibraryDescriptor.libraryGroupId: String[MyPropertyDescriptor]

'libraryDescriptor' @ [129:17] ==> value-parameter libraryDescriptor: ExternalLibraryDescriptor defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator.addKotlinLibraryToModuleBuildScript[ValueParameterDescriptorImpl]

'libraryArtifactId' @ [129:35] ==> public final val ExternalLibraryDescriptor.libraryArtifactId: String[MyPropertyDescriptor]

'libraryDescriptor' @ [130:17] ==> value-parameter libraryDescriptor: ExternalLibraryDescriptor defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator.addKotlinLibraryToModuleBuildScript[ValueParameterDescriptorImpl]

'maxVersion' @ [130:35] ==> public final val ExternalLibraryDescriptor.maxVersion: String?[MyPropertyDescriptor]

'groovyScript' @ [132:9] ==> private final val groovyScript: GroovyFile defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator[PropertyDescriptorImpl]

'getDependenciesBlock' @ [132:22] ==> private final fun GrStatementOwner.getDependenciesBlock(): GrClosableBlock defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator[SimpleFunctionDescriptorImpl]

'apply' @ [132:45] ==> @InlineOnly public inline fun <T> GrClosableBlock.apply(block: GrClosableBlock.() -> Unit): GrClosableBlock defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> GrClosableBlock

'addLastExpressionInBlockIfNeeded' @ [133:13] ==> private final fun GrClosableBlock.addLastExpressionInBlockIfNeeded(expressionText: String): Boolean defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator[SimpleFunctionDescriptorImpl]

'dependencyString' @ [133:46] ==> val dependencyString: String defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator.addKotlinLibraryToModuleBuildScript[LocalVariableDescriptor]

'groovyScript' @ [139:9] ==> private final val groovyScript: GroovyFile defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator[PropertyDescriptorImpl]

'getBlockByName' @ [139:22] ==> private final fun PsiElement.getBlockByName(name: String): GrClosableBlock? defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator[SimpleFunctionDescriptorImpl]

'let' @ [139:53] ==> @InlineOnly public inline fun <T, R> GrClosableBlock.let(block: (GrClosableBlock) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> GrClosableBlock
    <R> -> Unit

'it' @ [140:17] ==> value-parameter it: GrClosableBlock defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator.getKotlinStdlibVersion.<anonymous>[ValueParameterDescriptorImpl]

'text' @ [140:20] ==> public final val GrClosableBlock.text: (String..String?)[MyPropertyDescriptor]

'contains' @ [140:25] ==> public operator fun CharSequence.contains(other: CharSequence, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'versionProperty' @ [141:24] ==> val versionProperty: String defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator.getKotlinStdlibVersion[LocalVariableDescriptor]

'groovyScript' @ [145:28] ==> private final val groovyScript: GroovyFile defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator[PropertyDescriptorImpl]

'getBlockByName' @ [145:41] ==> private final fun PsiElement.getBlockByName(name: String): GrClosableBlock? defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator[SimpleFunctionDescriptorImpl]

'statements' @ [145:73] ==> public final val GrClosableBlock.statements: (Array<(GrStatement..GrStatement?)>..Array<out (GrStatement..GrStatement?)>)[MyPropertyDescriptor]

'dependencies' @ [147:9] ==> val dependencies: (Array<(GrStatement..GrStatement?)>?..Array<out (GrStatement..GrStatement?)>?) defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator.getKotlinStdlibVersion[LocalVariableDescriptor]

'forEach' @ [147:23] ==> public inline fun <T> Array<out (GrStatement..GrStatement?)>.forEach(action: ((GrStatement..GrStatement?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.plugins.groovy.lang.psi.api.statements.GrStatement..org.jetbrains.plugins.groovy.lang.psi.api.statements.GrStatement?)

'dependency' @ [148:34] ==> value-parameter dependency: (GrStatement..GrStatement?) defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator.getKotlinStdlibVersion.<anonymous>[ValueParameterDescriptorImpl]

'text' @ [148:45] ==> public final val GrStatement.text: (String..String?)[MyPropertyDescriptor]

'dependencyText' @ [149:30] ==> val dependencyText: (String..String?) defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator.getKotlinStdlibVersion.<anonymous>[LocalVariableDescriptor]

'indexOf' @ [149:45] ==> public fun CharSequence.indexOf(string: String, startIndex: Int = ..., ignoreCase: Boolean = ...): Int defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'stdlibArtifactPrefix' @ [149:53] ==> val stdlibArtifactPrefix: String defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator.getKotlinStdlibVersion[LocalVariableDescriptor]

'stdlibArtifactPrefix' @ [149:77] ==> val stdlibArtifactPrefix: String defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator.getKotlinStdlibVersion[LocalVariableDescriptor]

'length' @ [149:98] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'dependencyText' @ [150:28] ==> val dependencyText: (String..String?) defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator.getKotlinStdlibVersion.<anonymous>[LocalVariableDescriptor]

'length' @ [150:43] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'startIndex' @ [151:17] ==> val startIndex: Int defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator.getKotlinStdlibVersion.<anonymous>[LocalVariableDescriptor]

'-' @ [151:31] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'endIndex' @ [151:37] ==> val endIndex: Int defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator.getKotlinStdlibVersion.<anonymous>[LocalVariableDescriptor]

'-' @ [151:49] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'dependencyText' @ [152:24] ==> val dependencyText: (String..String?) defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator.getKotlinStdlibVersion.<anonymous>[LocalVariableDescriptor]

'substring' @ [152:39] ==> @InlineOnly public inline fun String.substring(startIndex: Int, endIndex: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'startIndex' @ [152:49] ==> val startIndex: Int defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator.getKotlinStdlibVersion.<anonymous>[LocalVariableDescriptor]

'endIndex' @ [152:61] ==> val endIndex: Int defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator.getKotlinStdlibVersion.<anonymous>[LocalVariableDescriptor]

'parameterName' @ [165:25] ==> value-parameter parameterName: String defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator.changeKotlinTaskParameter[ValueParameterDescriptorImpl]

'parameterValue' @ [165:44] ==> value-parameter parameterValue: String defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator.changeKotlinTaskParameter[ValueParameterDescriptorImpl]

'gradleFile' @ [166:27] ==> value-parameter gradleFile: GroovyFile defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator.changeKotlinTaskParameter[ValueParameterDescriptorImpl]

'getBlockOrCreate' @ [166:38] ==> private final fun GrStatementOwner.getBlockOrCreate(name: String): GrClosableBlock defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator[SimpleFunctionDescriptorImpl]

'if (forTests) "compileTestKotlin" else "compileKotlin"' @ [166:55] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'forTests' @ [166:59] ==> value-parameter forTests: Boolean defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator.changeKotlinTaskParameter[ValueParameterDescriptorImpl]

'kotlinBlock' @ [168:22] ==> val kotlinBlock: GrClosableBlock defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator.changeKotlinTaskParameter[LocalVariableDescriptor]

'statements' @ [168:34] ==> public final val GrClosableBlock.statements: (Array<(GrStatement..GrStatement?)>..Array<out (GrStatement..GrStatement?)>)[MyPropertyDescriptor]

'==' @ [169:17] ==> public open fun equals(other: Any?): Boolean defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'stmt' @ [169:18] ==> val stmt: (GrStatement..GrStatement?) defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator.changeKotlinTaskParameter[LocalVariableDescriptor]

'lValue' @ [169:52] ==> public final val GrAssignmentExpression.lValue: GrExpression[MyPropertyDescriptor]

'text' @ [169:60] ==> public final val GrExpression.text: (String..String?)[MyPropertyDescriptor]

'+' @ [169:68] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'parameterName' @ [169:87] ==> value-parameter parameterName: String defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator.changeKotlinTaskParameter[ValueParameterDescriptorImpl]

'stmt' @ [170:24] ==> val stmt: (GrStatement..GrStatement?) defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator.changeKotlinTaskParameter[LocalVariableDescriptor]

'replaceWithStatementFromText' @ [170:29] ==> private final fun GrStatement.replaceWithStatementFromText(snippet: String): GrStatement defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator[SimpleFunctionDescriptorImpl]

'+' @ [170:58] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'snippet' @ [170:77] ==> val snippet: String defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator.changeKotlinTaskParameter[LocalVariableDescriptor]

'kotlinBlock' @ [174:9] ==> val kotlinBlock: GrClosableBlock defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator.changeKotlinTaskParameter[LocalVariableDescriptor]

'getBlockOrCreate' @ [174:21] ==> private final fun GrStatementOwner.getBlockOrCreate(name: String): GrClosableBlock defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator[SimpleFunctionDescriptorImpl]

'apply' @ [174:55] ==> @InlineOnly public inline fun <T> GrClosableBlock.apply(block: GrClosableBlock.() -> Unit): GrClosableBlock defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> GrClosableBlock

'addOrReplaceExpression' @ [175:13] ==> private final fun GrClosableBlock.addOrReplaceExpression(snippet: String, predicate: (GrStatement) -> Boolean): Unit defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator[SimpleFunctionDescriptorImpl]

'snippet' @ [175:36] ==> val snippet: String defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator.changeKotlinTaskParameter[LocalVariableDescriptor]

'==' @ [176:17] ==> public open fun equals(other: Any?): Boolean defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'stmt' @ [176:18] ==> value-parameter stmt: GrStatement defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator.changeKotlinTaskParameter.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'lValue' @ [176:52] ==> public final val GrAssignmentExpression.lValue: GrExpression[MyPropertyDescriptor]

'text' @ [176:60] ==> public final val GrExpression.text: (String..String?)[MyPropertyDescriptor]

'parameterName' @ [176:68] ==> value-parameter parameterName: String defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator.changeKotlinTaskParameter[ValueParameterDescriptorImpl]

'kotlinBlock' @ [180:16] ==> val kotlinBlock: GrClosableBlock defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator.changeKotlinTaskParameter[LocalVariableDescriptor]

'parent' @ [180:28] ==> public final val GrClosableBlock.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'artifactName' @ [183:101] ==> value-parameter artifactName: String defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator.getGroovyDependencySnippet[ValueParameterDescriptorImpl]

'pluginName' @ [185:80] ==> value-parameter pluginName: String defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator.getApplyPluginDirective[ValueParameterDescriptorImpl]

'fileText' @ [188:16] ==> value-parameter fileText: String defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator.containsDirective[ValueParameterDescriptorImpl]

'contains' @ [188:25] ==> public operator fun CharSequence.contains(other: CharSequence, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'directive' @ [188:34] ==> value-parameter directive: String defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator.containsDirective[ValueParameterDescriptorImpl]

'fileText' @ [189:19] ==> value-parameter fileText: String defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator.containsDirective[ValueParameterDescriptorImpl]

'contains' @ [189:28] ==> public operator fun CharSequence.contains(other: CharSequence, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'directive' @ [189:37] ==> value-parameter directive: String defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator.containsDirective[ValueParameterDescriptorImpl]

'replace' @ [189:47] ==> public fun String.replace(oldValue: String, newValue: String, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'fileText' @ [190:19] ==> value-parameter fileText: String defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator.containsDirective[ValueParameterDescriptorImpl]

'contains' @ [190:28] ==> public operator fun CharSequence.contains(other: CharSequence, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'directive' @ [190:37] ==> value-parameter directive: String defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator.containsDirective[ValueParameterDescriptorImpl]

'replace' @ [190:47] ==> public fun String.replace(oldValue: String, newValue: String, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'file' @ [194:13] ==> value-parameter file: GroovyFile defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator.getApplyStatement[ValueParameterDescriptorImpl]

'getChildrenOfType' @ [194:18] ==> public inline fun <reified T : PsiElement> PsiElement.getChildrenOfType(): Array<GrApplicationStatement> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> GrApplicationStatement

'find' @ [194:62] ==> @InlineOnly public inline fun <T> Array<out GrApplicationStatement>.find(predicate: (GrApplicationStatement) -> Boolean): GrApplicationStatement? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> GrApplicationStatement

'it' @ [194:69] ==> value-parameter it: GrApplicationStatement defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator.getApplyStatement.<anonymous>[ValueParameterDescriptorImpl]

'invokedExpression' @ [194:72] ==> public final val GrApplicationStatement.invokedExpression: GrExpression[MyPropertyDescriptor]

'text' @ [194:90] ==> public final val GrExpression.text: (String..String?)[MyPropertyDescriptor]

'getChildrenOfType' @ [197:16] ==> public inline fun <reified T : PsiElement> PsiElement.getChildrenOfType(): Array<GrMethodCallExpression> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> GrMethodCallExpression

'filter' @ [198:18] ==> public inline fun <T> Array<out GrMethodCallExpression>.filter(predicate: (GrMethodCallExpression) -> Boolean): List<GrMethodCallExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> GrMethodCallExpression

'it' @ [198:27] ==> value-parameter it: GrMethodCallExpression defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator.getBlockByName.<anonymous>[ValueParameterDescriptorImpl]

'closureArguments' @ [198:30] ==> public final val GrMethodCallExpression.closureArguments: (Array<(GrClosableBlock..GrClosableBlock?)>..Array<out (GrClosableBlock..GrClosableBlock?)>)[MyPropertyDescriptor]

'isNotEmpty' @ [198:47] ==> @InlineOnly public inline fun <T> Array<out (GrClosableBlock..GrClosableBlock?)>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.plugins.groovy.lang.psi.api.statements.blocks.GrClosableBlock..org.jetbrains.plugins.groovy.lang.psi.api.statements.blocks.GrClosableBlock?)

'find' @ [199:18] ==> @InlineOnly public inline fun <T> Iterable<GrMethodCallExpression>.find(predicate: (GrMethodCallExpression) -> Boolean): GrMethodCallExpression? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> GrMethodCallExpression

'it' @ [199:25] ==> value-parameter it: GrMethodCallExpression defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator.getBlockByName.<anonymous>[ValueParameterDescriptorImpl]

'invokedExpression' @ [199:28] ==> public final val GrMethodCallExpression.invokedExpression: GrExpression[MyPropertyDescriptor]

'text' @ [199:46] ==> public final val GrExpression.text: (String..String?)[MyPropertyDescriptor]

'name' @ [199:54] ==> value-parameter name: String defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator.getBlockByName[ValueParameterDescriptorImpl]

'let' @ [200:19] ==> @InlineOnly public inline fun <T, R> GrMethodCallExpression.let(block: (GrMethodCallExpression) -> (GrClosableBlock..GrClosableBlock?)): (GrClosableBlock..GrClosableBlock?) defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> GrMethodCallExpression
    <R> -> (org.jetbrains.plugins.groovy.lang.psi.api.statements.blocks.GrClosableBlock..org.jetbrains.plugins.groovy.lang.psi.api.statements.blocks.GrClosableBlock?)

'it' @ [200:25] ==> value-parameter it: GrMethodCallExpression defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator.getBlockByName.<anonymous>[ValueParameterDescriptorImpl]

'closureArguments' @ [200:28] ==> public final val GrMethodCallExpression.closureArguments: (Array<(GrClosableBlock..GrClosableBlock?)>..Array<out (GrClosableBlock..GrClosableBlock?)>)[MyPropertyDescriptor]

'getRepositoryForVersion' @ [204:26] ==> public fun getRepositoryForVersion(version: String): RepositoryDescription? defined in org.jetbrains.kotlin.idea.configuration in file ConfigureKotlinInProjectUtils.kt[SimpleFunctionDescriptorImpl]

'version' @ [204:50] ==> value-parameter version: String defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator.addRepository[ValueParameterDescriptorImpl]

'when {
            repository != null -> repository.toGroovyRepositorySnippet()
            !isRepositoryConfigured(text) -> "$MAVEN_CENTRAL\n"
            else -> return false
        }' @ [205:23] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String, entry1: String, entry2: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String

'repository' @ [206:13] ==> val repository: RepositoryDescription? defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator.addRepository[LocalVariableDescriptor]

'repository' @ [206:35] ==> val repository: RepositoryDescription? defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator.addRepository[LocalVariableDescriptor]

'toGroovyRepositorySnippet' @ [206:46] ==> public fun RepositoryDescription.toGroovyRepositorySnippet(): String defined in org.jetbrains.kotlin.idea.configuration[SimpleFunctionDescriptorImpl]

'!' @ [207:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isRepositoryConfigured' @ [207:14] ==> public fun isRepositoryConfigured(repositoriesBlockText: String): Boolean defined in org.jetbrains.kotlin.idea.configuration in file ConfigureKotlinInProjectUtils.kt[SimpleFunctionDescriptorImpl]

'text' @ [207:37] ==> public final val GrClosableBlock.text: (String..String?)[MyPropertyDescriptor]

'MAVEN_CENTRAL' @ [207:48] ==> public val MAVEN_CENTRAL: String defined in org.jetbrains.kotlin.idea.configuration in file ConfigureKotlinInProjectUtils.kt[PropertyDescriptorImpl]

'addLastExpressionInBlockIfNeeded' @ [210:16] ==> private final fun GrClosableBlock.addLastExpressionInBlockIfNeeded(expressionText: String): Boolean defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator[SimpleFunctionDescriptorImpl]

'snippet' @ [210:49] ==> val snippet: String defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator.addRepository[LocalVariableDescriptor]

'getBlockOrCreate' @ [213:59] ==> private final fun GrStatementOwner.getBlockOrCreate(name: String): GrClosableBlock defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator[SimpleFunctionDescriptorImpl]

'getBlockOrCreate' @ [215:76] ==> private final fun GrStatementOwner.getBlockOrCreate(name: String): GrClosableBlock defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator[SimpleFunctionDescriptorImpl]

'getBlockOrCreate' @ [217:58] ==> private final fun GrStatementOwner.getBlockOrCreate(name: String): GrClosableBlock defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator[SimpleFunctionDescriptorImpl]

'getBuildScriptBlock' @ [220:13] ==> private final fun GrStatementOwner.getBuildScriptBlock(): GrClosableBlock defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator[SimpleFunctionDescriptorImpl]

'getBlockOrCreate' @ [220:35] ==> private final fun GrStatementOwner.getBlockOrCreate(name: String): GrClosableBlock defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator[SimpleFunctionDescriptorImpl]

'getBuildScriptBlock' @ [223:13] ==> private final fun GrStatementOwner.getBuildScriptBlock(): GrClosableBlock defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator[SimpleFunctionDescriptorImpl]

'getBlockOrCreate' @ [223:35] ==> private final fun GrStatementOwner.getBlockOrCreate(name: String): GrClosableBlock defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator[SimpleFunctionDescriptorImpl]

'getBlockByName' @ [226:21] ==> private final fun PsiElement.getBlockByName(name: String): GrClosableBlock? defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator[SimpleFunctionDescriptorImpl]

'name' @ [226:36] ==> value-parameter name: String defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator.getBlockOrCreate[ValueParameterDescriptorImpl]

'block' @ [227:13] ==> var block: GrClosableBlock? defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator.getBlockOrCreate[LocalVariableDescriptor]

'getInstance' @ [228:51] ==> @NotNull public open fun getInstance(@NotNull p0: Project): GroovyPsiElementFactory defined in org.jetbrains.plugins.groovy.lang.psi.GroovyPsiElementFactory[JavaMethodDescriptor]

'project' @ [228:63] ==> public final val GrStatementOwner.project: Project[MyPropertyDescriptor]

'factory' @ [229:28] ==> val factory: GroovyPsiElementFactory defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator.getBlockOrCreate[LocalVariableDescriptor]

'createExpressionFromText' @ [229:36] ==> @NotNull public open fun createExpressionFromText(@NotNull p0: CharSequence): GrExpression defined in org.jetbrains.plugins.groovy.lang.psi.GroovyPsiElementFactory[JavaMethodDescriptor]

'name' @ [229:63] ==> value-parameter name: String defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator.getBlockOrCreate[ValueParameterDescriptorImpl]

'addAfter' @ [230:13] ==> public abstract fun addAfter(@NotNull p0: PsiElement, @Nullable p1: PsiElement?): (PsiElement..PsiElement?) defined in org.jetbrains.plugins.groovy.lang.psi.api.util.GrStatementOwner[JavaMethodDescriptor]

'newBlock' @ [230:22] ==> val newBlock: GrExpression defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator.getBlockOrCreate[LocalVariableDescriptor]

'statements' @ [230:32] ==> public final val GrStatementOwner.statements: (Array<(GrStatement..GrStatement?)>..Array<out (GrStatement..GrStatement?)>)[MyPropertyDescriptor]

'lastOrNull' @ [230:43] ==> public fun <T> Array<out (GrStatement..GrStatement?)>.lastOrNull(): GrStatement? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.plugins.groovy.lang.psi.api.statements.GrStatement..org.jetbrains.plugins.groovy.lang.psi.api.statements.GrStatement?)

'firstChild' @ [230:59] ==> public final val GrStatementOwner.firstChild: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'block' @ [231:13] ==> var block: GrClosableBlock? defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator.getBlockOrCreate[LocalVariableDescriptor]

'getBlockByName' @ [231:21] ==> private final fun PsiElement.getBlockByName(name: String): GrClosableBlock? defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator[SimpleFunctionDescriptorImpl]

'name' @ [231:36] ==> value-parameter name: String defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator.getBlockOrCreate[ValueParameterDescriptorImpl]

'block' @ [233:16] ==> var block: GrClosableBlock? defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator.getBlockOrCreate[LocalVariableDescriptor]

'statements' @ [237:9] ==> public final val GrClosableBlock.statements: (Array<(GrStatement..GrStatement?)>..Array<out (GrStatement..GrStatement?)>)[MyPropertyDescriptor]

'firstOrNull' @ [237:20] ==> public inline fun <T> Array<out (GrStatement..GrStatement?)>.firstOrNull(predicate: ((GrStatement..GrStatement?)) -> Boolean): GrStatement? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.plugins.groovy.lang.psi.api.statements.GrStatement..org.jetbrains.plugins.groovy.lang.psi.api.statements.GrStatement?)

'predicate' @ [237:32] ==> value-parameter predicate: (GrStatement) -> Boolean defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator.addOrReplaceExpression[ValueParameterDescriptorImpl]

'let' @ [237:44] ==> @InlineOnly public inline fun <T, R> GrStatement.let(block: (GrStatement) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> GrStatement
    <R> -> Nothing

'stmt' @ [238:13] ==> value-parameter stmt: GrStatement defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator.addOrReplaceExpression.<anonymous>[ValueParameterDescriptorImpl]

'replaceWithStatementFromText' @ [238:18] ==> private final fun GrStatement.replaceWithStatementFromText(snippet: String): GrStatement defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator[SimpleFunctionDescriptorImpl]

'snippet' @ [238:47] ==> value-parameter snippet: String defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator.addOrReplaceExpression[ValueParameterDescriptorImpl]

'addLastExpressionInBlockIfNeeded' @ [241:9] ==> private final fun GrClosableBlock.addLastExpressionInBlockIfNeeded(expressionText: String): Boolean defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator[SimpleFunctionDescriptorImpl]

'snippet' @ [241:42] ==> value-parameter snippet: String defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator.addOrReplaceExpression[ValueParameterDescriptorImpl]

'addExpressionInBlockIfNeeded' @ [245:13] ==> private final fun GrClosableBlock.addExpressionInBlockIfNeeded(expressionText: String, isFirst: Boolean): Boolean defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator[SimpleFunctionDescriptorImpl]

'expressionText' @ [245:42] ==> value-parameter expressionText: String defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator.addLastExpressionInBlockIfNeeded[ValueParameterDescriptorImpl]

'addExpressionInBlockIfNeeded' @ [248:13] ==> private final fun GrClosableBlock.addExpressionInBlockIfNeeded(expressionText: String, isFirst: Boolean): Boolean defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator[SimpleFunctionDescriptorImpl]

'expressionText' @ [248:42] ==> value-parameter expressionText: String defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator.addFirstExpressionInBlockIfNeeded[ValueParameterDescriptorImpl]

'text' @ [251:13] ==> public final val GrClosableBlock.text: (String..String?)[MyPropertyDescriptor]

'contains' @ [251:18] ==> public operator fun CharSequence.contains(other: CharSequence, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'expressionText' @ [251:27] ==> value-parameter expressionText: String defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator.addExpressionInBlockIfNeeded[ValueParameterDescriptorImpl]

'getInstance' @ [252:52] ==> @NotNull public open fun getInstance(@NotNull p0: Project): GroovyPsiElementFactory defined in org.jetbrains.plugins.groovy.lang.psi.GroovyPsiElementFactory[JavaMethodDescriptor]

'project' @ [252:64] ==> public final val GrClosableBlock.project: Project[MyPropertyDescriptor]

'createExpressionFromText' @ [252:73] ==> @NotNull public open fun createExpressionFromText(@NotNull p0: CharSequence): GrExpression defined in org.jetbrains.plugins.groovy.lang.psi.GroovyPsiElementFactory[JavaMethodDescriptor]

'expressionText' @ [252:98] ==> value-parameter expressionText: String defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator.addExpressionInBlockIfNeeded[ValueParameterDescriptorImpl]

'getInstance' @ [253:26] ==> public open fun getInstance(@NotNull p0: Project): (CodeStyleManager..CodeStyleManager?) defined in com.intellij.psi.codeStyle.CodeStyleManager[JavaMethodDescriptor]

'project' @ [253:38] ==> public final val GrClosableBlock.project: Project[MyPropertyDescriptor]

'reformat' @ [253:47] ==> @NotNull public abstract fun reformat(@NotNull p0: PsiElement): PsiElement defined in com.intellij.psi.codeStyle.CodeStyleManager[JavaMethodDescriptor]

'newStatement' @ [253:56] ==> val newStatement: GrExpression defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator.addExpressionInBlockIfNeeded[LocalVariableDescriptor]

'if (!isFirst && statements.isNotEmpty()) {
            val lastStatement = statements[statements.size - 1]
            if (lastStatement != null) {
                addAfter(newStatement, lastStatement)
            }
        }
        else {
            if (firstChild != null) {
                addAfter(newStatement, firstChild)
            }
        }' @ [254:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'!' @ [254:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isFirst' @ [254:14] ==> value-parameter isFirst: Boolean defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator.addExpressionInBlockIfNeeded[ValueParameterDescriptorImpl]

'statements' @ [254:25] ==> public final val GrClosableBlock.statements: (Array<(GrStatement..GrStatement?)>..Array<out (GrStatement..GrStatement?)>)[MyPropertyDescriptor]

'isNotEmpty' @ [254:36] ==> @InlineOnly public inline fun <T> Array<out (GrStatement..GrStatement?)>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.plugins.groovy.lang.psi.api.statements.GrStatement..org.jetbrains.plugins.groovy.lang.psi.api.statements.GrStatement?)

'statements' @ [255:33] ==> public final val GrClosableBlock.statements: (Array<(GrStatement..GrStatement?)>..Array<out (GrStatement..GrStatement?)>)[MyPropertyDescriptor]

'statements' @ [255:44] ==> public final val GrClosableBlock.statements: (Array<(GrStatement..GrStatement?)>..Array<out (GrStatement..GrStatement?)>)[MyPropertyDescriptor]

'size' @ [255:55] ==> public final val size: Int defined in kotlin.Array[DeserializedPropertyDescriptor]

'lastStatement' @ [256:17] ==> val lastStatement: (GrStatement..GrStatement?) defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator.addExpressionInBlockIfNeeded[LocalVariableDescriptor]

'addAfter' @ [257:17] ==> public abstract fun addAfter(@NotNull p0: PsiElement, @Nullable p1: PsiElement?): (PsiElement..PsiElement?) defined in org.jetbrains.plugins.groovy.lang.psi.api.statements.blocks.GrClosableBlock[JavaMethodDescriptor]

'newStatement' @ [257:26] ==> val newStatement: GrExpression defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator.addExpressionInBlockIfNeeded[LocalVariableDescriptor]

'lastStatement' @ [257:40] ==> val lastStatement: (GrStatement..GrStatement?) defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator.addExpressionInBlockIfNeeded[LocalVariableDescriptor]

'firstChild' @ [261:17] ==> public final val GrClosableBlock.firstChild: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'addAfter' @ [262:17] ==> public abstract fun addAfter(@NotNull p0: PsiElement, @Nullable p1: PsiElement?): (PsiElement..PsiElement?) defined in org.jetbrains.plugins.groovy.lang.psi.api.statements.blocks.GrClosableBlock[JavaMethodDescriptor]

'newStatement' @ [262:26] ==> val newStatement: GrExpression defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator.addExpressionInBlockIfNeeded[LocalVariableDescriptor]

'firstChild' @ [262:40] ==> public final val GrClosableBlock.firstChild: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'pluginName' @ [268:86] ==> value-parameter pluginName: String defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator.getGroovyApplyPluginDirective[ValueParameterDescriptorImpl]

'getInstance' @ [271:52] ==> @NotNull public open fun getInstance(@NotNull p0: Project): GroovyPsiElementFactory defined in org.jetbrains.plugins.groovy.lang.psi.GroovyPsiElementFactory[JavaMethodDescriptor]

'project' @ [271:64] ==> public final val GrStatement.project: Project[MyPropertyDescriptor]

'createExpressionFromText' @ [271:73] ==> @NotNull public open fun createExpressionFromText(@NotNull p0: CharSequence): GrExpression defined in org.jetbrains.plugins.groovy.lang.psi.GroovyPsiElementFactory[JavaMethodDescriptor]

'snippet' @ [271:98] ==> value-parameter snippet: String defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator.replaceWithStatementFromText[ValueParameterDescriptorImpl]

'getInstance' @ [272:26] ==> public open fun getInstance(@NotNull p0: Project): (CodeStyleManager..CodeStyleManager?) defined in com.intellij.psi.codeStyle.CodeStyleManager[JavaMethodDescriptor]

'project' @ [272:38] ==> public final val GrStatement.project: Project[MyPropertyDescriptor]

'reformat' @ [272:47] ==> @NotNull public abstract fun reformat(@NotNull p0: PsiElement): PsiElement defined in com.intellij.psi.codeStyle.CodeStyleManager[JavaMethodDescriptor]

'newStatement' @ [272:56] ==> val newStatement: GrExpression defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator.replaceWithStatementFromText[LocalVariableDescriptor]

'replaceWithStatement' @ [273:16] ==> public abstract fun <T : (GrStatement..GrStatement?)> replaceWithStatement(p0: (GrExpression..GrExpression?)): (GrExpression..GrExpression?) defined in org.jetbrains.plugins.groovy.lang.psi.api.statements.GrStatement[JavaMethodDescriptor]
Inferred types:
    <T : (GrStatement..GrStatement?)> -> GrExpression

'newStatement' @ [273:37] ==> val newStatement: GrExpression defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator.replaceWithStatementFromText[LocalVariableDescriptor]

'String' @ [278:31] ==> public companion object defined in kotlin.String[FakeCallableDescriptorForObject]

'format' @ [278:38] ==> @InlineOnly public inline fun String.Companion.format(format: String, vararg args: Any?): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'VERSION_TEMPLATE' @ [278:74] ==> private final val VERSION_TEMPLATE: String defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator.Companion[PropertyDescriptorImpl]

'KOTLIN_GROUP_ID' @ [280:47] ==> public val KOTLIN_GROUP_ID: String defined in org.jetbrains.kotlin.idea.configuration in file ConfigureKotlinInProjectUtils.kt[PropertyDescriptorImpl]

'GRADLE_PLUGIN_ID' @ [280:64] ==> private final val GRADLE_PLUGIN_ID: String defined in org.jetbrains.kotlin.idea.configuration.GroovyBuildScriptManipulator.Companion[PropertyDescriptorImpl]

