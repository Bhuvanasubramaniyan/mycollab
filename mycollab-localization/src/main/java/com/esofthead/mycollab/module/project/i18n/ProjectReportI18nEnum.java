/**
 * This file is part of mycollab-localization.
 *
 * mycollab-localization is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * mycollab-localization is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with mycollab-localization.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.esofthead.mycollab.module.project.i18n;

import ch.qos.cal10n.BaseName;
import ch.qos.cal10n.Locale;
import ch.qos.cal10n.LocaleData;

@BaseName("project-reporting")
@LocaleData(value = {@Locale("en-US")}, defaultCharset = "UTF-8")
public enum ProjectReportI18nEnum {
    REPORT_STANDUP,
    REPORT_STANDUP_HELP,
    REPORT_HOURS_WEEKLY,
    REPORT_HOURS_WEEKLY_HELP,
    REPORT_USERS_WORKLOAD,
    REPORT_USERS_WORKLOAD_HELP,
    REPORT_TIMESHEET,
    REPORT_TIMESHEET_HELP
}
